package i.runlibrary.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class n {
    public static d a(Context context, String str) {
        d dVar = null;
        try {
            InputStream open = context.getAssets().open(str);
            try {
                dVar = BitmapFactory.decodeStream(open);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (open != null) {
                try {
                    open.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            return dVar;
        } catch (IOException e22) {
            e22.printStackTrace();
            return null;
        }
    }

    public static int a(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        if (!new e(str).exists()) {
            return 0;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        options.inJustDecodeBounds = false;
        try {
            i = BitmapFactory.decodeFile(str, options);
            return i;
        } catch (Exception unused) {
            return i;
        }
    }

    public static void a(Bitmap bitmap, int i, String str) {
        d.a(str, false);
        File eVar = new e(str);
        if (eVar.exists()) {
            eVar.delete();
        }
        try {
            eVar.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutputStream outputStream = null;
        try {
            outputStream = new FileInputStream(eVar);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }
        bitmap.compress(str.toLowerCase().endsWith(".png") ? CompressFormat.PNG : CompressFormat.JPEG, i, outputStream);
        try {
            outputStream.flush();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        try {
            outputStream.close();
        } catch (IOException e32) {
            e32.printStackTrace();
        }
    }
}