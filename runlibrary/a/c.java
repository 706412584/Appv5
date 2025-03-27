package i.runlibrary.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramSocket;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public final class c {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(String str, String str2, String str3, boolean z) {
        Throwable th;
        String str4 = "/";
        if (!(str3.endsWith(str4) && str3.endsWith("\\"))) {
            str3 = str3 + str4;
        }
        int i = 0;
        DatagramSocket zipInputStream;
        try {
            zipInputStream = new ZipInputStream(new FileInputStream(new e(str)));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        zipInputStream.close();
                        return i;
                    } else if (nextEntry.getName().startsWith(str2)) {
                        a((ZipInputStream) zipInputStream, nextEntry, str3 + nextEntry.getName(), z);
                        i++;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (zipInputStream != null) {
                        zipInputStream.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            zipInputStream = null;
            th = th3;
            if (zipInputStream != null) {
            }
            throw th;
        }
    }

    public static int a(String str, String str2, ZipOutputStream zipOutputStream) {
        int i = 0;
        if (zipOutputStream == null) {
            return 0;
        }
        File eVar = new e(str + str2);
        int i2 = 1;
        if (eVar.isFile()) {
            ZipEntry eVar2 = new e(str2);
            FileInputStream fileInputStream = new FileInputStream(eVar);
            zipOutputStream.putNextEntry(eVar2);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    zipOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    zipOutputStream.closeEntry();
                    return 1;
                }
            }
        }
        String[] list = eVar.list();
        if (list != null) {
            if (list.length > 0) {
                int i3 = 0;
                while (i < list.length) {
                    i3 += a(str, str2 + File.separator + list[i], zipOutputStream);
                    i++;
                }
                i2 = i3;
                return i2;
            }
        }
        zipOutputStream.putNextEntry(new e(str2 + File.separator));
        zipOutputStream.closeEntry();
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(String str, String str2, boolean z) {
        Throwable th;
        String str3 = "/";
        if (!(str2.endsWith(str3) && str2.endsWith("\\"))) {
            str2 = str2 + str3;
        }
        int i = 0;
        DatagramSocket zipInputStream;
        try {
            zipInputStream = new ZipInputStream(new FileInputStream(new e(str)));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        a((ZipInputStream) zipInputStream, nextEntry, str2 + nextEntry.getName(), z);
                        i++;
                    } else {
                        zipInputStream.close();
                        return i;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (zipInputStream != null) {
                        zipInputStream.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            zipInputStream = null;
            th = th3;
            if (zipInputStream != null) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0074 A:{SYNTHETIC, Splitter: B:50:0x0074} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0065 A:{SYNTHETIC, Splitter: B:40:0x0065} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x007f A:{SYNTHETIC, Splitter: B:57:0x007f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(ZipInputStream zipInputStream, ZipEntry zipEntry, String str, boolean z) {
        FileNotFoundException e;
        IOException e2;
        Throwable th;
        new e(new e(str).getParent()).mkdirs();
        File eVar = new e(str);
        if (eVar.exists()) {
            if (z) {
                eVar.delete();
                try {
                    eVar.createNewFile();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } else {
                return;
            }
        }
        DatagramSocket datagramSocket = null;
        try {
            if (!zipEntry.isDirectory()) {
                FileOutputStream fileInputStream = new FileInputStream(eVar);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileInputStream.write(bArr, 0, read);
                    }
                    datagramSocket = fileInputStream;
                } catch (FileNotFoundException e4) {
                    e = e4;
                    datagramSocket = fileInputStream;
                    e.printStackTrace();
                    if (datagramSocket != null) {
                    }
                } catch (IOException e5) {
                    e2 = e5;
                    datagramSocket = fileInputStream;
                    try {
                        e2.printStackTrace();
                        if (datagramSocket != null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (datagramSocket != null) {
                            try {
                                datagramSocket.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    datagramSocket = fileInputStream;
                    if (datagramSocket != null) {
                    }
                    throw th;
                }
            }
            if (datagramSocket != null) {
                try {
                    datagramSocket.close();
                } catch (IOException e22) {
                    e22.printStackTrace();
                }
            }
        } catch (FileNotFoundException e7) {
            e = e7;
            e.printStackTrace();
            if (datagramSocket != null) {
                try {
                    datagramSocket.close();
                } catch (IOException e222) {
                    e222.printStackTrace();
                }
            }
        } catch (IOException e8) {
            e222 = e8;
            e222.printStackTrace();
            if (datagramSocket != null) {
                try {
                    datagramSocket.close();
                } catch (IOException e2222) {
                    e2222.printStackTrace();
                }
            }
        }
    }
}