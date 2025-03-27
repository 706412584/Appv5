package i.runlibrary.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import i.app.FileProvider;
import java.lang.reflect.Array;

public final class a {
    public static Intent a(Context context, Object obj) {
        if (obj instanceof Class) {
            return new Intent(context, (Class) obj);
        }
        if (obj instanceof String) {
            try {
                d a = FileProvider.a(context, obj.toString());
                if (a != null) {
                    return new Intent(context, a);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static Bundle a(Object obj, Object obj2) {
        if (obj != null && obj2 != null && obj.getClass().isArray() && obj2.getClass().isArray()) {
            int length = Array.getLength(obj);
            int length2 = Array.getLength(obj2);
            if (length > 0 && length == length2) {
                Bundle bundle = new Bundle();
                for (int i = 0; i < length; i++) {
                    bundle.putString(Array.get(obj, i).toString(), Array.get(obj2, i).toString());
                }
                return bundle;
            }
        }
        return null;
    }

    public static d a(Context context, String str) {
        try {
            if (str.contains(".")) {
                return context.getClassLoader().loadClass(str);
            }
            return context.getClassLoader().loadClass(String.format("%s.%s", new Object[]{context.getPackageName(), str}));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(Context context, Uri uri) {
        return uri == null ? null : b.a(context, uri);
    }

    public static void a(Context context, String str, int i) {
        Toast.makeText(context, str, i).show();
    }
}