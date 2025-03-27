package i.app;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    private static final String[] a = new String[]{"_display_name", "_size"};
    private static final File b = new e("/");
    private static HashMap c = new HashMap();
    private d d;

    private static d a(Context context, String str) {
        d dVar;
        synchronized (c) {
            dVar = (d) c.get(str);
            if (dVar == null) {
                try {
                    dVar = new e(str);
                    XmlResourceParser loadXmlMetaData = context.getPackageManager().resolveContentProvider(str, 128).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                    if (loadXmlMetaData != null) {
                        while (true) {
                            int next = loadXmlMetaData.next();
                            if (next == 1) {
                                break;
                            } else if (next == 2) {
                                String name = loadXmlMetaData.getName();
                                File file = null;
                                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                                File[] externalFilesDirs;
                                if ("root-path".equals(name)) {
                                    file = b;
                                } else if ("files-path".equals(name)) {
                                    file = context.getFilesDir();
                                } else if ("cache-path".equals(name)) {
                                    file = context.getCacheDir();
                                } else if ("external-path".equals(name)) {
                                    file = Environment.getExternalStorageDirectory();
                                } else if ("external-files-path".equals(name)) {
                                    externalFilesDirs = getExternalFilesDirs(context, null);
                                    if (externalFilesDirs.length > 0) {
                                        file = externalFilesDirs[0];
                                    }
                                } else if ("external-cache-path".equals(name)) {
                                    externalFilesDirs = getExternalCacheDirs(context);
                                    if (externalFilesDirs.length > 0) {
                                        file = externalFilesDirs[0];
                                    }
                                }
                                if (file != null) {
                                    dVar.a(attributeValue, a(file, attributeValue2));
                                }
                            }
                        }
                        c.put(str, dVar);
                    } else {
                        throw new e("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                    }
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return dVar;
    }

    private static File a(File file, String... strArr) {
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str != null) {
                file = new RandomAccessFile(file, str);
            }
        }
        return file;
    }

    public static File[] getExternalCacheDirs(Context context) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        return a(context, str).a(file);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new e("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.d = a(context, providerInfo.authority);
        } else {
            throw new e("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.d.a(uri).delete() ? 1 : 0;
    }

    public String getType(Uri uri) {
        File a = this.d.a(uri);
        int lastIndexOf = a.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new e("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File a = this.d.a(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else {
            if (!"w".equals(str)) {
                if (!"wt".equals(str)) {
                    if ("wa".equals(str)) {
                        i = 704643072;
                    } else if ("rw".equals(str)) {
                        i = 939524096;
                    } else if ("rwt".equals(str)) {
                        i = 1006632960;
                    } else {
                        throw new e(new e("Invalid mode: ").append(str).toString());
                    }
                }
            }
            i = 738197504;
        }
        return ParcelFileDescriptor.open(a, i);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        File a = this.d.a(uri);
        if (strArr == null) {
            strArr = a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i = 0;
        for (Object obj : strArr) {
            int i2;
            String str3 = "_display_name";
            if (str3.equals(obj)) {
                strArr3[i] = str3;
                i2 = i + 1;
                objArr[i] = a.getName();
            } else {
                str3 = "_size";
                if (str3.equals(obj)) {
                    strArr3[i] = str3;
                    i2 = i + 1;
                    objArr[i] = Long.valueOf(a.length());
                } else {
                }
            }
            i = i2;
        }
        String[] strArr4 = new String[i];
        System.arraycopy(strArr3, 0, strArr4, 0, i);
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new e("No external updates");
    }
}