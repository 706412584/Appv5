package i.runlibrary.a;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;

public final class v {
    public static int a = VERSION.SDK_INT;
    public static String b = Build.MODEL;
    private static String c;

    public static String a(Context context) {
        if (c == null) {
            c = context.getFilesDir().getPath();
        }
        return c;
    }
}