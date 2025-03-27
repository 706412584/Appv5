package i.runlibrary.b;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Audio;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import java.net.DatagramSocket;

public final class b {
    public static String a(Context context, Uri uri) {
        Uri uri2 = null;
        if (VERSION.SDK_INT < 19) {
            String string;
            Cursor query = context.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    string = query.getString(query.getColumnIndex("_data"));
                }
                query.close();
            }
            return string;
        }
        if ((VERSION.SDK_INT >= 19 ? 1 : null) == null || !DocumentsContract.isDocumentUri(context, uri)) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return "com.google.android.apps.photos.content".equals(uri.getAuthority()) ? uri.getLastPathSegment() : a(context, uri, null, null);
            } else {
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            }
        }
        String str = ":";
        if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            String[] split = DocumentsContract.getDocumentId(uri).split(str);
            if ("primary".equalsIgnoreCase(split[0])) {
                return Environment.getExternalStorageDirectory() + "/" + split[1];
            }
        }
        if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
            return a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
        }
        if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            Object obj = DocumentsContract.getDocumentId(uri).split(str)[0];
            if ("image".equals(obj)) {
                uri2 = Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(obj)) {
                uri2 = Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(obj)) {
                uri2 = Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return a(context, uri2, "_id=?", new String[]{r10[1]});
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static String a(Context context, Uri uri, String str, String[] strArr) {
        Throwable th;
        String str2 = "_data";
        DatagramSocket datagramSocket = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{str2}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow(str2));
                        if (query != null) {
                            query.close();
                        }
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    datagramSocket = query;
                    if (datagramSocket != null) {
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (datagramSocket != null) {
                datagramSocket.close();
            }
            throw th;
        }
    }
}