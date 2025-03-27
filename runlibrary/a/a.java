package i.runlibrary.a;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import i.app.ClientsUDP;
import i.runlibrary.app.AppInfo;
import i.runlibrary.b.m;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.DatagramSocket;
import java.net.HttpURLConnection;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a {
    public static int a(String str) {
        if (!str.contains("|")) {
            return b(str.trim());
        }
        String[] e = s.e(str);
        int length = e.length;
        if (length == 2) {
            return b(e[1].trim()) | b(e[0].trim());
        } else if (length == 3) {
            return b(e[2].trim()) | (b(e[0].trim()) | b(e[1].trim()));
        } else if (length != 4) {
            return 0;
        } else {
            return b(e[3].trim()) | ((b(e[0].trim()) | b(e[1].trim())) | b(e[2].trim()));
        }
    }

    public static MediaPlayer a(AppInfo appInfo, Object obj) {
        MediaPlayer mediaPlayer;
        if (obj instanceof Uri) {
            mediaPlayer = new MediaPlayer();
            try {
                mediaPlayer.setDataSource(appInfo.c.getApplicationContext(), (Uri) obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (obj instanceof Number) {
            mediaPlayer = MediaPlayer.create(appInfo.c.getApplicationContext(), ((Number) obj).intValue());
        } else {
            mediaPlayer = new MediaPlayer();
            String obj2 = obj.toString();
            String toLowerCase = obj2.toLowerCase();
            if (!(toLowerCase.startsWith("http:") || toLowerCase.startsWith("https:") || toLowerCase.startsWith("rtsp:"))) {
                if (!toLowerCase.startsWith("ftp:")) {
                    File eVar = new e(d.f(appInfo.c, obj2));
                    if (!eVar.exists()) {
                        return null;
                    }
                    mediaPlayer.setDataSource(eVar.getAbsolutePath());
                }
            }
            mediaPlayer.setDataSource(obj2);
        }
        try {
            mediaPlayer.prepare();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return mediaPlayer;
    }

    public static ThreadPoolExecutor a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(Math.max(2, Math.min(availableProcessors - 1, 4)), (availableProcessors * 2) + 1, 30, TimeUnit.SECONDS, new DatagramSocket(128), new b());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void a(Activity activity, Object obj) {
        if (obj.equals(Boolean.valueOf(true))) {
            activity.getWindow().addFlags(2048);
            return;
        }
        activity.getWindow().clearFlags(2048);
        activity.getWindow().setFlags(1024, 1024);
    }

    public static void a(Activity activity, Object obj, Object obj2) {
        boolean z = false;
        try {
            if (s.d(obj2) == 1) {
                z = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        m.a(activity, ClientsUDP.a(obj), z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A:{SYNTHETIC, Splitter: B:10:0x0016} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(File file, long j) {
        DatagramSocket randomAccessFile;
        Exception e;
        DatagramSocket datagramSocket = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.setLength(j);
            } catch (Exception e2) {
                e = e2;
                datagramSocket = randomAccessFile;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            randomAccessFile = datagramSocket;
            if (randomAccessFile != null) {
            }
        }
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public static long[] a(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Range");
        if (headerField != null) {
            if (headerField.startsWith("bytes")) {
                headerField = headerField.substring(5);
                int indexOf = headerField.indexOf(47);
                if (indexOf != -1) {
                    String trim = headerField.substring(indexOf + 1).trim();
                    headerField = headerField.substring(0, indexOf);
                    indexOf = headerField.indexOf(45);
                    if (indexOf != -1) {
                        String trim2 = headerField.substring(0, indexOf).trim();
                        headerField = headerField.substring(indexOf + 1).trim();
                        try {
                            return new long[]{Long.parseLong(trim2), Long.parseLong(headerField), Long.parseLong(trim)};
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
    }

    private static int b(String str) {
        return str.equals("none") ? 0 : str.equals("text") ? 1 : str.equals("textcapcharacters") ? 4097 : str.equals("textcapwords") ? 8193 : str.equals("textcapsentences") ? 16385 : str.equals("textautocomplete") ? 65537 : str.equals("textautocorrect") ? 32769 : str.equals("texturi") ? 17 : str.equals("textemailaddress") ? 33 : str.equals("textpostaladdress") ? 113 : str.equals("textpassword") ? 129 : str.equals("textvisiblepassword") ? 145 : str.equals("textwebedittext") ? 161 : str.equals("number") ? 2 : str.equals("numbersigned") ? 4098 : str.equals("numberdecimal") ? 8194 : str.equals("phone") ? 3 : str.equals("datetime") ? 4 : str.equals("date") ? 20 : str.equals("time") ? 36 : str.matches("[0-9]+") ? Integer.parseInt(str) : 0;
    }

    public static void b(Activity activity, Object obj) {
        Window window;
        LayoutParams attributes;
        if (obj.equals(Boolean.valueOf(true))) {
            if (VERSION.SDK_INT > 11 && VERSION.SDK_INT < 19) {
                activity.getWindow().getDecorView().setSystemUiVisibility(0);
            } else if (VERSION.SDK_INT >= 19) {
                window = activity.getWindow();
                attributes = window.getAttributes();
                attributes.systemUiVisibility = 0;
                window.setAttributes(attributes);
            }
        } else if (VERSION.SDK_INT > 11 && VERSION.SDK_INT < 19) {
            activity.getWindow().getDecorView().setSystemUiVisibility(8);
        } else if (VERSION.SDK_INT >= 19) {
            window = activity.getWindow();
            attributes = window.getAttributes();
            attributes.systemUiVisibility = 2050;
            window.setAttributes(attributes);
        }
    }

    public static void c(Activity activity, Object obj) {
        if (obj.equals(Boolean.valueOf(true))) {
            if (activity.getRequestedOrientation() != 0) {
                activity.setRequestedOrientation(0);
            }
        } else if (activity.getRequestedOrientation() != 1) {
            activity.setRequestedOrientation(1);
        }
    }

    public static void d(Activity activity, Object obj) {
        float d = (float) s.d(obj);
        LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.screenBrightness = d * 0.01f;
        activity.getWindow().setAttributes(attributes);
    }
}