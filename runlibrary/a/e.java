package i.runlibrary.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import i.app.FileProvider;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public final class e {
    public static d a(Context context, String str) {
        return str.startsWith("@") ? FileProvider.a(context, FileProvider.a(context, str)) : a.a(FileProvider.a(context, str));
    }

    public static Bitmap b(Context context, String str) {
        Bitmap bitmap = null;
        if (str == null) {
            return null;
        }
        InputStream open;
        long available;
        Object obj;
        d a = FileProvider.a(context, str);
        int i = 1;
        if (str.startsWith("@")) {
            try {
                open = context.getAssets().open(a);
                available = (long) open.available();
                obj = 1;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        File eVar = new e(a);
        if (!eVar.exists()) {
            return null;
        }
        available = eVar.length();
        open = null;
        obj = null;
        Options options = new Options();
        options.inJustDecodeBounds = true;
        if (available >= 67584) {
            i = available < 204800 ? 2 : available < 512000 ? 3 : available < 1048576 ? 5 : 10;
        }
        options.inSampleSize = i;
        options.inDensity = 120;
        options.inPreferredConfig = Config.RGB_565;
        options.inJustDecodeBounds = false;
        if (obj != null) {
            try {
                bitmap = BitmapFactory.decodeStream(open, null, options);
            } catch (Throwable unused) {
            }
        } else {
            bitmap = BitmapFactory.decodeFile(a, options);
        }
        if (open != null) {
            try {
                open.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return bitmap;
    }
}