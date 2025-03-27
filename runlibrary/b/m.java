package i.runlibrary.b;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout.LayoutParams;
import androidx.core.content.ContextCompat;
import i.app.Downcenter;
import i.app.FileProvider;
import i.runlibrary.a.d;
import i.runlibrary.a.s;
import i.runlibrary.app.xt.pm;
import i.runlibrary.app.系统.屏幕;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;

public final class m {
    public static final int[] a = new int[]{63930, 63931, 63932, 63933, 63934};
    private static String b;
    private static String c;
    private static String d;

    public static String a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : null;
    }

    public static Uri a(Context context, File file) {
        if (VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        return FileProvider.getUriForFile(context, String.format("%s.myFileProvider", new Object[]{context.getPackageName()}), file);
    }

    public static String a(int i) {
        Formatter format;
        Calendar instance = Calendar.getInstance();
        long time = new Date().getTime();
        instance.setTimeInMillis(time);
        Formatter formatter = new Formatter(Locale.CHINA);
        if (i == 0) {
            format = formatter.format("%1$tY-%1$tm-%1$td %1$tT", new Object[]{instance});
        } else if (i == 1) {
            format = formatter.format("%1$tY/%1$tm/%1$td %1$tT", new Object[]{instance});
        } else if (i == 2) {
            format = formatter.format("%1$tY-%1$tm-%1$td", new Object[]{instance});
        } else if (i == 3) {
            format = formatter.format("%1$tT", new Object[]{instance});
        } else if (i == 4) {
            return String.valueOf(time);
        } else {
            if (i == 5) {
                format = formatter.format("%1$tm-%1$td %1$tT", new Object[]{instance});
            } else {
                format = formatter.format("%1$tY年%1$tm月%1$td日 %1$tT", new Object[]{instance});
            }
        }
        return format.toString();
    }

    public static void a(Activity activity) {
        View peekDecorView = activity.getWindow().peekDecorView();
        if (peekDecorView != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(peekDecorView.getWindowToken(), 0);
        }
    }

    private static void a(Activity activity, int i) {
        Window window = activity.getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i);
    }

    public static void a(Activity activity, int i, boolean z) {
        activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        int systemUiVisibility;
        if (c()) {
            if (VERSION.SDK_INT >= 23) {
                systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
                activity.getWindow().getDecorView().setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
                a(activity, i);
                return;
            }
            a(activity, z);
            b(activity, i);
        } else if (b()) {
            a(activity, z);
            b(activity, i);
        } else {
            String str = Build.DISPLAY;
            Object obj = null;
            if (!TextUtils.isEmpty(str) && str.contains("Flyme")) {
                for (String matches : str.split(" ")) {
                    if (matches.matches("^[4-9]\\.(\\d+\\.)+\\S*")) {
                        obj = 1;
                        break;
                    }
                }
            }
            if (obj != null) {
                b(activity, z);
                b(activity, i);
            } else if (VERSION.SDK_INT >= 23) {
                systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
                activity.getWindow().getDecorView().setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
                a(activity, i);
            } else if (VERSION.SDK_INT < 21) {
                if (VERSION.SDK_INT >= 19) {
                    if (z) {
                        b(activity, -7829368);
                        return;
                    }
                    b(activity, i);
                }
            } else if (z) {
                a(activity, -7829368);
            } else {
                a(activity, i);
            }
        }
    }

    public static void a(Context context, Intent intent, File file, String str) {
        Uri uriForFile;
        if (VERSION.SDK_INT >= 24) {
            intent.setFlags(1);
            uriForFile = FileProvider.getUriForFile(context, String.format("%s.myFileProvider", new Object[]{context.getPackageName()}), file);
        } else {
            intent.addFlags(268435456);
            uriForFile = Uri.fromFile(file);
        }
        intent.setDataAndType(uriForFile, str);
    }

    public static void a(Context context, pm pmVar) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        pmVar.k = displayMetrics.widthPixels;
        pmVar.g = displayMetrics.heightPixels;
    }

    public static void a(Context context, 屏幕 屏幕) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        屏幕.f48 = displayMetrics.widthPixels;
        屏幕.f51 = displayMetrics.heightPixels;
    }

    public static void a(String str, Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, str));
        }
    }

    private static boolean a(Activity activity, boolean z) {
        Class cls = activity.getWindow().getClass();
        try {
            Class cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
            Window window = activity.getWindow();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(z ? i : 0);
            objArr[1] = Integer.valueOf(i);
            method.invoke(window, objArr);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static d a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        launchIntentForPackage.setFlags(337641472);
        context.startActivity(launchIntentForPackage);
        return 1;
    }

    public static String[] a() {
        String str = "\\s+";
        String str2 = "";
        String[] strArr = new String[]{str2, str2};
        try {
            BufferedReader bufferedReader = new BufferedReader(new e("/proc/cpuinfo"), 8192);
            String[] split = bufferedReader.readLine().split(str);
            for (int i = 2; i < split.length; i++) {
                strArr[0] = strArr[0] + split[i] + " ";
            }
            strArr[1] = strArr[1] + bufferedReader.readLine().split(str)[2];
            bufferedReader.close();
        } catch (IOException unused) {
        }
        return strArr;
    }

    public static void b(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier <= 0) {
        }
    }

    private static void b(Activity activity, int i) {
        Window window = activity.getWindow();
        window.addFlags(67108864);
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        View view = new View(window.getContext());
        LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, d.a(window.getContext()));
        layoutParams.gravity = 48;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(i);
        viewGroup.addView(view);
        ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
        viewGroup2.setFitsSystemWindows(true);
        viewGroup2.setClipToPadding(true);
    }

    private static boolean b() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new RandomAccessFile(Environment.getRootDirectory(), "build.prop")));
            String property = properties.getProperty("ro.miui.ui.version.code", null);
            return property != null && Integer.parseInt(property) >= 4;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(Activity activity) {
        try {
            String b;
            String packageName = activity.getPackageName();
            Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(packageName);
            if (launchIntentForPackage != null) {
                b = s.b(launchIntentForPackage.toString(), "cmp=", " ");
                if (b != null) {
                    b = s.b(b, "/", null);
                    if (b != null) {
                        if (b.startsWith(".")) {
                            b = packageName + b;
                        }
                        launchIntentForPackage = new Intent(activity, Class.forName(b));
                        launchIntentForPackage.addFlags(268435456);
                        activity.startActivity(launchIntentForPackage);
                        activity.finish();
                        Process.killProcess(Process.myPid());
                        return true;
                    }
                }
            }
            b = "";
            launchIntentForPackage = new Intent(activity, Class.forName(b));
            launchIntentForPackage.addFlags(268435456);
            activity.startActivity(launchIntentForPackage);
            activity.finish();
            Process.killProcess(Process.myPid());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    private static boolean b(Activity activity, boolean z) {
        try {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i = declaredField.getInt(null);
            int i2 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z ? i2 | i : (~i) & i2);
            activity.getWindow().setAttributes(attributes);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String c(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        return (clipboardManager == null || !clipboardManager.hasPrimaryClip()) ? null : clipboardManager.getPrimaryClip().getItemAt(0).getText().toString();
    }

    private static boolean c() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new RandomAccessFile(Environment.getRootDirectory(), "build.prop")));
            String property = properties.getProperty("ro.miui.ui.version.code", null);
            return property != null && Integer.parseInt(property) >= 5;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String d(Context context) {
        String str = b;
        if (str != null && str.length() > 0) {
            return b;
        }
        try {
            b = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Throwable unused) {
        }
        str = b;
        if (str == null || str.length() == 0) {
            try {
                b = Secure.getString(context.getApplicationContext().getContentResolver(), "android_id");
            } catch (Throwable unused2) {
            }
            str = b;
            if (str == null || str.length() == 0) {
                str = null;
                File eVar = new e(String.format("%s/.UUID.User", new Object[]{context.getFilesDir()}));
                String str2 = "utf-8";
                if (eVar.exists()) {
                    str = Downcenter.a(eVar.getAbsolutePath(), str2);
                }
                if (str == null || str.length() == 0) {
                    str = s.f(UUID.randomUUID().toString()).substring(16);
                    d.a(eVar.getAbsolutePath(), str, str2);
                }
                b = str;
            }
        }
        return b;
    }

    public static String e(Context context) {
        String str = c;
        if (str != null) {
            return str;
        }
        try {
            if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                return null;
            }
            c = ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
            return c;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String f(Context context) {
        StringBuilder append;
        String string = Secure.getString(context.getApplicationContext().getContentResolver(), "android_id");
        if (string == null) {
            String str = ";";
            append = new e("93;").append(Build.BOARD).append(str).append(Build.BRAND).append(str).append(Build.CPU_ABI).append(str).append(Build.DEVICE).append(str).append(Build.DISPLAY).append(str).append(Build.HOST).append(str).append(Build.ID).append(str).append(Build.MANUFACTURER).append(str).append(Build.MODEL).append(str).append(Build.PRODUCT).append(str).append(Build.TAGS).append(str).append(Build.TYPE).append(str).append(Build.USER).append(str).append(Build.SERIAL);
        } else {
            append = new e("93").append(string);
        }
        return UUID.nameUUIDFromBytes(append.toString().getBytes()).toString();
    }
}