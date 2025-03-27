package i.app;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map.Entry;

final class e implements d {
    private final String a;
    private final HashMap b = new HashMap();

    public e(String str) {
        this.a = str;
    }

    public final Uri a(File file) {
        Object file2;
        try {
            file2 = file2.getCanonicalPath();
            Entry entry = null;
            for (Entry entry2 : this.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (file2.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                String str = "/";
                boolean endsWith = path2.endsWith(str);
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                return new Builder().scheme("content").authority(this.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(file2.substring(length), str)).build();
            }
            throw new e(new e("Failed to find configured root that contains ").append(file2).toString());
        } catch (IOException unused) {
            throw new e(new e("Failed to resolve canonical path for ").append(file2).toString());
        }
    }

    public final File a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        encodedPath = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.b.get(decode);
        if (file != null) {
            Object randomAccessFile = new RandomAccessFile(file, encodedPath);
            try {
                randomAccessFile = randomAccessFile.getCanonicalFile();
                if (randomAccessFile.getPath().startsWith(file.getPath())) {
                    return randomAccessFile;
                }
                throw new e("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new e(new e("Failed to resolve canonical path for ").append(randomAccessFile).toString());
            }
        }
        throw new e(new e("Unable to find configured root for ").append(uri).toString());
    }

    public final void a(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new e("Name must not be empty");
        }
        Object file2;
        try {
            file2 = file2.getCanonicalFile();
            this.b.put(str, file2);
        } catch (IOException e) {
            throw new IllegalArgumentException(new e("Failed to resolve canonical path for ").append(file2).toString(), e);
        }
    }
}