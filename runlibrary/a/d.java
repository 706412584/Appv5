package i.runlibrary.a;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import i.app.Downcenter;
import i.app.FileProvider;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.zip.ZipOutputStream;

public final class d {
    private static String a = Environment.getExternalStorageDirectory().toString();
    private static String b = null;
    private static String c = null;

    public static int a(Context context, String str, String str2, String str3, boolean z) {
        if (str2 != null) {
            return c.a(FileProvider.a(context, str), str2, FileProvider.a(context, str3), z);
        }
        try {
            return c.a(FileProvider.a(context, str), FileProvider.a(context, str3), z);
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int a(Context context, String str, boolean z) {
        File eVar = new e(FileProvider.a(context, str));
        int i = 0;
        if (eVar.exists()) {
            int i2 = 1;
            if (!eVar.isDirectory()) {
                try {
                    return eVar.delete() ? 1 : 0;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (z) {
                return b(eVar);
            } else {
                File[] listFiles = eVar.listFiles();
                if (listFiles != null) {
                    if (listFiles.length != 0) {
                        for (int i3 = 0; i3 < listFiles.length; i3++) {
                            if (eVar.isDirectory()) {
                                return 0;
                            }
                        }
                        while (i < listFiles.length) {
                            if (eVar.isFile()) {
                                try {
                                    eVar.delete();
                                    i2++;
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                            i++;
                        }
                        eVar.delete();
                        return i2;
                    }
                }
                eVar.delete();
                return 1;
            }
        }
        return 0;
    }

    public static String a(Context context) {
        if (b == null) {
            b(context);
        }
        return b;
    }

    public static d a(Context context, String str) {
        if (str.startsWith("@")) {
            return str.substring(1);
        }
        String str2 = "/";
        String str3 = "%s/%s";
        if (str.startsWith("%")) {
            str = str.substring(1);
            if (!str.startsWith(str2)) {
                if (!str.startsWith("\\")) {
                    if (VERSION.SDK_INT >= 30) {
                        return String.format(str3, new Object[]{context.getExternalFilesDir(""), str});
                    }
                    return String.format(str3, new Object[]{a(context), str});
                }
            }
            return str;
        } else if (str.startsWith("$")) {
            return String.format(str3, new Object[]{a(context), str.substring(1)});
        } else if (str.startsWith(str2)) {
            return str;
        } else {
            return String.format(str3, new Object[]{a, str});
        }
    }

    public static String a(Context context, String str, String str2) {
        return str.startsWith("@") ? c(context, FileProvider.a(context, str), str2) : Downcenter.a(FileProvider.a(context, str), str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x008d A:{SYNTHETIC, Splitter: B:66:0x008d} */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0097 A:{SYNTHETIC, Splitter: B:71:0x0097} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0077 A:{SYNTHETIC, Splitter: B:54:0x0077} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0081 A:{SYNTHETIC, Splitter: B:59:0x0081} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0061 A:{SYNTHETIC, Splitter: B:42:0x0061} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x006b A:{SYNTHETIC, Splitter: B:47:0x006b} */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x008d A:{SYNTHETIC, Splitter: B:66:0x008d} */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0097 A:{SYNTHETIC, Splitter: B:71:0x0097} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0077 A:{SYNTHETIC, Splitter: B:54:0x0077} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0081 A:{SYNTHETIC, Splitter: B:59:0x0081} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0061 A:{SYNTHETIC, Splitter: B:42:0x0061} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x006b A:{SYNTHETIC, Splitter: B:47:0x006b} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00a4 A:{SYNTHETIC, Splitter: B:79:0x00a4} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ae A:{SYNTHETIC, Splitter: B:84:0x00ae} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00a4 A:{SYNTHETIC, Splitter: B:79:0x00a4} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ae A:{SYNTHETIC, Splitter: B:84:0x00ae} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(String str, String str2) {
        IOException e;
        UnsupportedEncodingException e2;
        FileNotFoundException e3;
        Throwable th;
        File eVar = new e(str);
        DatagramSocket datagramSocket = null;
        if (eVar.exists()) {
            StringBuffer stringBuffer = new StringBuffer();
            DatagramSocket fileInputStream;
            DatagramSocket inputStreamReader;
            try {
                fileInputStream = new FileInputStream(eVar);
                try {
                    inputStreamReader = new InputStreamReader(fileInputStream, str2);
                    try {
                        char[] cArr = new char[512];
                        while (true) {
                            int read = inputStreamReader.read(cArr);
                            if (read <= 0) {
                                break;
                            }
                            stringBuffer.append(cArr, 0, read);
                        }
                        str2 = new String(stringBuffer);
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        try {
                            inputStreamReader.close();
                        } catch (IOException e42) {
                            e42.printStackTrace();
                        }
                        void v = str2;
                    } catch (UnsupportedEncodingException e5) {
                        e2 = e5;
                        e2.printStackTrace();
                        if (fileInputStream != null) {
                        }
                        if (inputStreamReader != null) {
                        }
                    } catch (FileNotFoundException e6) {
                        e3 = e6;
                        e3.printStackTrace();
                        if (fileInputStream != null) {
                        }
                        if (inputStreamReader != null) {
                        }
                    } catch (IOException e7) {
                        e42 = e7;
                        try {
                            e42.printStackTrace();
                            if (fileInputStream != null) {
                            }
                            if (inputStreamReader != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            datagramSocket = fileInputStream;
                            if (datagramSocket != null) {
                            }
                            if (inputStreamReader != null) {
                            }
                            throw th;
                        }
                    }
                } catch (UnsupportedEncodingException e8) {
                    e2 = e8;
                    inputStreamReader = null;
                    e2.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e422) {
                            e422.printStackTrace();
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                } catch (FileNotFoundException e9) {
                    e3 = e9;
                    inputStreamReader = null;
                    e3.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4222) {
                            e4222.printStackTrace();
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                } catch (IOException e10) {
                    e4222 = e10;
                    inputStreamReader = null;
                    e4222.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e42222) {
                            e42222.printStackTrace();
                        }
                    }
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (IOException e422222) {
                            e422222.printStackTrace();
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                    datagramSocket = fileInputStream;
                    if (datagramSocket != null) {
                        try {
                            datagramSocket.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (IOException e112) {
                            e112.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (UnsupportedEncodingException e12) {
                e2 = e12;
                inputStreamReader = null;
                fileInputStream = inputStreamReader;
                e2.printStackTrace();
                if (fileInputStream != null) {
                }
                if (inputStreamReader != null) {
                }
            } catch (FileNotFoundException e13) {
                e3 = e13;
                inputStreamReader = null;
                fileInputStream = inputStreamReader;
                e3.printStackTrace();
                if (fileInputStream != null) {
                }
                if (inputStreamReader != null) {
                }
            } catch (IOException e14) {
                e422222 = e14;
                inputStreamReader = null;
                fileInputStream = inputStreamReader;
                e422222.printStackTrace();
                if (fileInputStream != null) {
                }
                if (inputStreamReader != null) {
                }
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
                if (datagramSocket != null) {
                }
                if (inputStreamReader != null) {
                }
                throw th;
            }
        }
    }

    private static void a(ArrayList arrayList, File file, String[] strArr) {
        if (file.exists()) {
            int i = 0;
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    while (i < length) {
                        a(arrayList, listFiles[i], strArr);
                        i++;
                    }
                }
            } else if (strArr == null) {
                arrayList.add(file);
            } else {
                String toLowerCase = file.getName().toLowerCase();
                for (String str : strArr) {
                    String str2 = "*";
                    if (str.startsWith(str2)) {
                        if (toLowerCase.endsWith(str.substring(1))) {
                            arrayList.add(file);
                            return;
                        }
                    } else if (str.endsWith(str2)) {
                        if (toLowerCase.startsWith(str.substring(0, str.length() - 1))) {
                            arrayList.add(file);
                            return;
                        }
                    } else if (toLowerCase.contains(str)) {
                        arrayList.add(file);
                        return;
                    }
                }
            }
        }
    }

    public static boolean a(Context context, String str, String str2, String str3) {
        return str.startsWith("@") ? false : a(FileProvider.a(context, str), str2, str3);
    }

    public static boolean a(Context context, String str, String str2, boolean z) {
        boolean startsWith = str.startsWith("@");
        str = FileProvider.a(context, str);
        if (startsWith) {
            return c(context, str, FileProvider.a(context, str2), z);
        }
        File eVar = new e(str);
        if (eVar.exists()) {
            if (eVar.isFile()) {
                return a(FileProvider.a(context, str), FileProvider.a(context, str2), z);
            }
            if (eVar.isDirectory() && b(FileProvider.a(context, str), FileProvider.a(context, str2), z) > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, String str3) {
        IOException e;
        UnsupportedEncodingException e2;
        FileNotFoundException e3;
        Throwable th;
        File eVar = new e(str);
        boolean z = false;
        a(str, false);
        DatagramSocket outputStreamWriter;
        try {
            outputStreamWriter = new OutputStreamWriter(new FileInputStream(eVar), str3);
            try {
                outputStreamWriter.write(str2);
                outputStreamWriter.flush();
                z = true;
                try {
                    outputStreamWriter.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            } catch (UnsupportedEncodingException e5) {
                e2 = e5;
                e2.printStackTrace();
                outputStreamWriter.close();
                return z;
            } catch (FileNotFoundException e6) {
                e3 = e6;
                e3.printStackTrace();
                outputStreamWriter.close();
                return z;
            } catch (IOException e7) {
                e4 = e7;
                try {
                    e4.printStackTrace();
                    outputStreamWriter.close();
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    throw th;
                }
            }
        } catch (UnsupportedEncodingException e9) {
            outputStreamWriter = null;
            e2 = e9;
            e2.printStackTrace();
            outputStreamWriter.close();
            return z;
        } catch (FileNotFoundException e10) {
            outputStreamWriter = null;
            e3 = e10;
            e3.printStackTrace();
            outputStreamWriter.close();
            return z;
        } catch (IOException e82) {
            outputStreamWriter = null;
            e4 = e82;
            e4.printStackTrace();
            outputStreamWriter.close();
            return z;
        } catch (Throwable th3) {
            outputStreamWriter = null;
            th = th3;
            outputStreamWriter.close();
            throw th;
        }
        return z;
    }

    public static boolean a(String str, String str2, boolean z) {
        DatagramSocket fileInputStream;
        DatagramSocket fileInputStream2;
        IOException e;
        Throwable th;
        boolean z2 = false;
        a(str2, false);
        File eVar = new e(str2);
        File eVar2 = new e(str);
        if (!eVar2.exists()) {
            return false;
        }
        if (eVar.exists()) {
            if (!z) {
                return false;
            }
            eVar.delete();
        }
        try {
            fileInputStream = new FileInputStream(eVar2);
            try {
                eVar.createNewFile();
                fileInputStream2 = new FileInputStream(eVar);
            } catch (IOException e2) {
                IOException iOException = e2;
                fileInputStream2 = null;
                e = iOException;
                try {
                    e.printStackTrace();
                    try {
                        fileInputStream2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    fileInputStream.close();
                    return z2;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        fileInputStream2.close();
                    } catch (IOException e22) {
                        e22.printStackTrace();
                    }
                    try {
                        fileInputStream.close();
                    } catch (IOException e222) {
                        e222.printStackTrace();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                fileInputStream2 = null;
                th = th4;
                fileInputStream2.close();
                fileInputStream.close();
                throw th;
            }
            try {
                byte[] bArr = new byte[512];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileInputStream2.write(bArr, 0, read);
                }
                z2 = true;
                try {
                    fileInputStream2.close();
                } catch (IOException e32) {
                    e32.printStackTrace();
                }
                try {
                    fileInputStream.close();
                } catch (IOException e322) {
                    e322.printStackTrace();
                }
            } catch (IOException e4) {
                e322 = e4;
                e322.printStackTrace();
                fileInputStream2.close();
                fileInputStream.close();
                return z2;
            }
        } catch (IOException e2222) {
            fileInputStream = null;
            e322 = e2222;
            fileInputStream2 = fileInputStream;
            e322.printStackTrace();
            fileInputStream2.close();
            fileInputStream.close();
            return z2;
        } catch (Throwable th32) {
            fileInputStream = null;
            th = th32;
            fileInputStream2 = fileInputStream;
            fileInputStream2.close();
            fileInputStream.close();
            throw th;
        }
        return z2;
    }

    public static boolean a(String str, boolean z) {
        return (z ? new e(str) : new e(new e(str).getParent())).mkdirs();
    }

    public static boolean a(String str, byte[] bArr) {
        boolean z = false;
        a(str, false);
        File eVar = new e(str);
        if (eVar.exists()) {
            eVar.delete();
        }
        try {
            boolean z2;
            FileOutputStream fileInputStream = new FileInputStream(eVar);
            try {
                fileInputStream.write(bArr, 0, bArr.length);
                z2 = true;
            } catch (IOException e) {
                e.printStackTrace();
                z2 = false;
            }
            try {
                fileInputStream.close();
                z = z2;
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return z;
        } catch (FileNotFoundException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public static byte[] a(File file) {
        byte[] toByteArray;
        IOException e;
        Throwable th;
        ByteArrayOutputStream datagramSocket = new DatagramSocket((int) file.length());
        DatagramSocket datagramSocket2 = null;
        DatagramSocket bufferedInputStream;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 1024);
                    if (-1 == read) {
                        break;
                    }
                    datagramSocket.write(bArr, 0, read);
                }
                toByteArray = datagramSocket.toByteArray();
                try {
                    bufferedInputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                try {
                    datagramSocket.close();
                } catch (IOException e22) {
                    e22.printStackTrace();
                }
            } catch (IOException e3) {
                e22 = e3;
                try {
                    e22.printStackTrace();
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e222) {
                        e222.printStackTrace();
                    }
                    datagramSocket.close();
                    return toByteArray;
                } catch (Throwable th2) {
                    th = th2;
                    datagramSocket2 = bufferedInputStream;
                    try {
                        datagramSocket2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    try {
                        datagramSocket.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    throw th;
                }
            }
        } catch (IOException e6) {
            e222 = e6;
            bufferedInputStream = null;
            e222.printStackTrace();
            bufferedInputStream.close();
            datagramSocket.close();
            return toByteArray;
        } catch (Throwable th3) {
            th = th3;
            datagramSocket2.close();
            datagramSocket.close();
            throw th;
        }
        return toByteArray;
    }

    public static byte[] a(InputStream inputStream) {
        byte[] toByteArray;
        IOException e;
        Throwable th;
        DatagramSocket datagramSocket = null;
        try {
            ByteArrayOutputStream datagramSocket2 = new DatagramSocket(inputStream.available());
            DatagramSocket bufferedInputStream;
            try {
                bufferedInputStream = new BufferedInputStream(inputStream);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 1024);
                        if (-1 == read) {
                            break;
                        }
                        datagramSocket2.write(bArr, 0, read);
                    }
                    toByteArray = datagramSocket2.toByteArray();
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    try {
                        datagramSocket2.close();
                    } catch (IOException e22) {
                        e22.printStackTrace();
                    }
                } catch (IOException e3) {
                    e22 = e3;
                    try {
                        e22.printStackTrace();
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e222) {
                            e222.printStackTrace();
                        }
                        datagramSocket2.close();
                        return toByteArray;
                    } catch (Throwable th2) {
                        th = th2;
                        datagramSocket = bufferedInputStream;
                        try {
                            datagramSocket.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        try {
                            datagramSocket2.close();
                        } catch (IOException e42) {
                            e42.printStackTrace();
                        }
                        throw th;
                    }
                }
            } catch (IOException e5) {
                e222 = e5;
                bufferedInputStream = null;
                e222.printStackTrace();
                bufferedInputStream.close();
                datagramSocket2.close();
                return toByteArray;
            } catch (Throwable th3) {
                th = th3;
                datagramSocket.close();
                datagramSocket2.close();
                throw th;
            }
            return toByteArray;
        } catch (IOException e2222) {
            e2222.printStackTrace();
            return null;
        }
    }

    public static File a(File file, String[] strArr) {
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = strArr[i].toLowerCase();
            }
        }
        ArrayList arrayList = new ArrayList();
        a(arrayList, file, strArr);
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    public static int b(Context context, String str, String str2) {
        try {
            int a;
            d a2 = FileProvider.a(context, str);
            ZipOutputStream zipOutputStream = new ZipOutputStream(new e(FileProvider.a(context, str2)));
            File eVar = new e(a2);
            if (eVar.isFile()) {
                a = c.a(eVar.getParent() + File.separator, eVar.getName(), zipOutputStream) + 0;
            } else {
                File[] listFiles = eVar.listFiles();
                if (listFiles != null) {
                    int i = 0;
                    for (File file : listFiles) {
                        i += c.a(file.getParent() + File.separator, file.getName(), zipOutputStream);
                    }
                    a = i;
                } else {
                    a = 0;
                }
            }
            zipOutputStream.finish();
            zipOutputStream.close();
            return a;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private static int b(File file) {
        if (file.isFile()) {
            file.delete();
            return 1;
        }
        int i = 0;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    int i2 = 0;
                    while (i < listFiles.length) {
                        i2 += b(listFiles[i]);
                        i++;
                    }
                    file.delete();
                    i = i2;
                }
            }
            file.delete();
            return 1;
        }
        return i;
    }

    private static int b(String str, String str2, boolean z) {
        File eVar = new e(str);
        int i = 0;
        if (eVar.getAbsolutePath().equals(new e(str2).getAbsolutePath())) {
            return 0;
        }
        File[] listFiles = eVar.listFiles();
        if (listFiles != null) {
            int i2 = 0;
            for (int i3 = 0; i3 < listFiles.length; i3++) {
                String str3 = "%s/%s";
                if (listFiles[i3].isFile()) {
                    if (a(listFiles[i3].getAbsolutePath(), String.format(str3, new Object[]{r1, listFiles[i3].getName()}), z)) {
                        i2++;
                    }
                } else if (listFiles[i3].isDirectory()) {
                    i2 += b(String.format(str3, new Object[]{str, listFiles[i3].getName()}), String.format(str3, new Object[]{str2, listFiles[i3].getName()}), z);
                }
            }
            i = i2;
        }
        return i;
    }

    public static void b(Context context) {
        String absolutePath;
        if (context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            absolutePath = context.getFilesDir().getAbsolutePath();
            b = absolutePath;
            c = absolutePath;
            return;
        }
        c = a;
        if (VERSION.SDK_INT >= 30) {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                absolutePath = String.format("%s/Android/data/com.iapp.app/files", new Object[]{a});
            } else {
                absolutePath = externalFilesDir.getAbsolutePath();
            }
            b = absolutePath;
            return;
        }
        b = a;
    }

    public static boolean b(Context context, String str) {
        if (!str.startsWith("@")) {
            return new e(FileProvider.a(context, str)).exists();
        }
        try {
            context.getAssets().open(FileProvider.a(context, str)).close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean b(Context context, String str, String str2, boolean z) {
        File eVar = new e(FileProvider.a(context, str2));
        if (eVar.exists()) {
            if (!z) {
                return false;
            }
            eVar.delete();
        }
        if (str.startsWith("@")) {
            return c(context, FileProvider.a(context, str), eVar.getAbsolutePath(), z);
        }
        File eVar2 = new e(FileProvider.a(context, str));
        if (!eVar2.exists()) {
            return false;
        }
        try {
            if (eVar2.renameTo(eVar)) {
                return true;
            }
            if (!a(eVar2.getAbsolutePath(), eVar.getAbsolutePath(), z)) {
                return false;
            }
            eVar2.delete();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String[] b(Context context, String str, boolean z) {
        File[] listFiles = new e(FileProvider.a(context, str)).listFiles();
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (z) {
            while (i < listFiles.length) {
                if (listFiles[i].isDirectory()) {
                    arrayList.add(listFiles[i].getAbsolutePath());
                }
                i++;
            }
        } else {
            while (i < listFiles.length) {
                if (listFiles[i].isFile()) {
                    arrayList.add(listFiles[i].getAbsolutePath());
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int c(Context context, String str) {
        if (str.startsWith("@")) {
            try {
                d a = FileProvider.a(context, str);
                context.getAssets().open(a).close();
                return context.getAssets().list(a) != null ? 2 : 1;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            File eVar = new e(FileProvider.a(context, str));
            if (eVar.exists()) {
                return eVar.isDirectory() ? 2 : 1;
            }
            return -1;
        }
    }

    private static long c(File file) {
        long j = 0;
        if (!file.exists()) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File c : listFiles) {
                j += c(c);
            }
        }
        return j;
    }

    private static String c(Context context, String str, String str2) {
        String str3;
        IOException e;
        Throwable th;
        StringBuffer stringBuffer = new StringBuffer();
        DatagramSocket datagramSocket = null;
        try {
            InputStream open = context.getAssets().open(str);
            DatagramSocket inputStreamReader;
            try {
                inputStreamReader = new InputStreamReader(open, str2);
                try {
                    char[] cArr = new char[512];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read <= 0) {
                            break;
                        }
                        stringBuffer.append(cArr, 0, read);
                    }
                    str2 = new String(stringBuffer);
                    try {
                        open.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    try {
                        inputStreamReader.close();
                    } catch (IOException e22) {
                        e22.printStackTrace();
                    }
                    str3 = str2;
                } catch (IOException e3) {
                    e = e3;
                    try {
                        e.printStackTrace();
                        try {
                            open.close();
                        } catch (IOException e222) {
                            e222.printStackTrace();
                        }
                        try {
                            inputStreamReader.close();
                        } catch (IOException e2222) {
                            e2222.printStackTrace();
                        }
                        return str3;
                    } catch (Throwable th2) {
                        th = th2;
                        datagramSocket = inputStreamReader;
                        try {
                            open.close();
                        } catch (IOException e22222) {
                            e22222.printStackTrace();
                        }
                        try {
                            datagramSocket.close();
                        } catch (IOException e222222) {
                            e222222.printStackTrace();
                        }
                        throw th;
                    }
                }
            } catch (IOException e4) {
                e = e4;
                inputStreamReader = null;
                e.printStackTrace();
                open.close();
                inputStreamReader.close();
                return str3;
            } catch (Throwable th3) {
                th = th3;
                open.close();
                datagramSocket.close();
                throw th;
            }
            return str3;
        } catch (IOException e2222222) {
            e2222222.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0062 A:{SYNTHETIC, Splitter: B:39:0x0062} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006c A:{SYNTHETIC, Splitter: B:44:0x006c} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0062 A:{SYNTHETIC, Splitter: B:39:0x0062} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006c A:{SYNTHETIC, Splitter: B:44:0x006c} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0073 A:{SYNTHETIC, Splitter: B:49:0x0073} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x007d A:{SYNTHETIC, Splitter: B:54:0x007d} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0073 A:{SYNTHETIC, Splitter: B:49:0x0073} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x007d A:{SYNTHETIC, Splitter: B:54:0x007d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(Context context, String str, String str2, boolean z) {
        DatagramSocket open;
        DatagramSocket fileInputStream;
        IOException e;
        Throwable th;
        File eVar = new e(str2);
        boolean z2 = false;
        if (eVar.exists()) {
            if (!z) {
                return false;
            }
            eVar.delete();
        }
        a(str2, false);
        try {
            open = context.getAssets().open(str);
            try {
                eVar.createNewFile();
                fileInputStream = new FileInputStream(eVar);
            } catch (IOException e2) {
                e = e2;
                fileInputStream = null;
                try {
                    e.printStackTrace();
                    if (fileInputStream != null) {
                    }
                    if (open != null) {
                    }
                    return z2;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream != null) {
                    }
                    if (open != null) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                if (fileInputStream != null) {
                }
                if (open != null) {
                }
                throw th;
            }
            try {
                byte[] bArr = new byte[512];
                while (true) {
                    int read = open.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileInputStream.write(bArr, 0, read);
                }
                z2 = true;
                try {
                    fileInputStream.close();
                } catch (IOException e22) {
                    e22.printStackTrace();
                }
                if (open != null) {
                    try {
                        open.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (IOException e4) {
                e = e4;
                e.printStackTrace();
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e222) {
                        e222.printStackTrace();
                    }
                }
                if (open != null) {
                    open.close();
                }
                return z2;
            }
        } catch (IOException e32) {
            fileInputStream = null;
            e = e32;
            open = fileInputStream;
            e.printStackTrace();
            if (fileInputStream != null) {
            }
            if (open != null) {
            }
            return z2;
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            open = fileInputStream;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e2222) {
                    e2222.printStackTrace();
                }
            }
            if (open != null) {
                try {
                    open.close();
                } catch (IOException e322) {
                    e322.printStackTrace();
                }
            }
            throw th;
        }
        return z2;
    }

    public static long d(Context context, String str) {
        if (str.startsWith("@")) {
            int i = -1;
            try {
                InputStream open = context.getAssets().open(FileProvider.a(context, str));
                i = open.available();
                open.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return (long) i;
        }
        File eVar = new e(FileProvider.a(context, str));
        return eVar.exists() ? c(eVar) : -1;
    }

    public static String[] e(Context context, String str) {
        int i = 0;
        if (str.startsWith("@")) {
            try {
                String[] list = context.getAssets().list(FileProvider.a(context, str));
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < list.length; i2++) {
                    arrayList.add(String.format("%s/%s", new Object[]{str, list[0]}));
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        File[] listFiles = new e(FileProvider.a(context, str)).listFiles();
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        while (i < listFiles.length) {
            arrayList2.add(listFiles[i].getAbsolutePath());
            i++;
        }
        return (String[]) arrayList2.toArray(new String[arrayList2.size()]);
    }

    public static String f(Context context, String str) {
        return FileProvider.a(context, str);
    }

    public static byte[] g(Context context, String str) {
        if (str.startsWith("@")) {
            return i(context, FileProvider.a(context, str));
        }
        File eVar = new e(FileProvider.a(context, str));
        return !eVar.exists() ? null : a(eVar);
    }

    public static void h(Context context, String str) {
        File eVar = new e(FileProvider.a(context, str));
        if (eVar.exists()) {
            q.a(context, eVar);
        }
    }

    private static byte[] i(Context context, String str) {
        InputStream open;
        try {
            open = context.getAssets().open(str);
        } catch (Exception unused) {
            open = null;
        }
        return open == null ? null : a(open);
    }
}