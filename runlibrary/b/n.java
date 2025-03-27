package i.runlibrary.b;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build.VERSION;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class n {
    private int a = 0;
    private String b = null;
    private Collection c = null;
    private Object d = null;
    private AssetManager e = null;
    private Method f = null;
    private Method g = null;
    private Method h = null;
    private Field i = null;
    private Field j = null;
    private Field k = null;
    private Field l = null;
    private Field m = null;
    private Field n = null;
    private Field o = null;
    private final String p = ".dex";
    private final String q = ".odex";
    private final String r = "test.dex";
    private final Pattern s = Pattern.compile("classes(?:[2-9]?|[1-9][0-9]+)\\.dex(\\.jar)?");

    private ClassLoader a(Application application, ClassLoader classLoader, File file, List list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((File) list.get(i)).getAbsolutePath();
        }
        Object obj = a(Class.forName("dalvik.system.BaseDexClassLoader", false, classLoader), "pathList").get(classLoader);
        StringBuilder stringBuilder = new StringBuilder();
        Object obj2 = 1;
        if ((size > 0 ? 1 : null) != null) {
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0) {
                    stringBuilder.append(File.pathSeparator);
                }
                stringBuilder.append(strArr[i2]);
            }
        }
        String stringBuilder2 = stringBuilder.toString();
        Field a = a(obj.getClass(), "nativeLibraryDirectories");
        boolean isArray = a.getType().isArray();
        Object obj3 = a.get(obj);
        Set<File> asList = isArray ? Arrays.asList((File[]) obj3) : (List) obj3;
        StringBuilder stringBuilder3 = new StringBuilder();
        for (File file2 : asList) {
            if (file2 != null) {
                if (obj2 != null) {
                    obj2 = null;
                } else {
                    stringBuilder3.append(File.pathSeparator);
                }
                stringBuilder3.append(file2.getAbsolutePath());
            }
        }
        q qVar = new q(this, stringBuilder2, file, stringBuilder3.toString(), classLoader, (byte) 0);
        a(obj.getClass(), "definingContext").set(obj, qVar);
        Thread.currentThread().setContextClassLoader(qVar);
        Context context = (Context) a(application.getClass(), "mBase").get(application);
        obj3 = a(context.getClass(), "mPackageInfo").get(context);
        stringBuilder2 = "mClassLoader";
        a(obj3.getClass(), stringBuilder2).set(obj3, qVar);
        if (VERSION.SDK_INT < 27) {
            Resources resources = application.getResources();
            try {
                a(resources.getClass(), stringBuilder2).set(resources, qVar);
                obj3 = a(resources.getClass(), "mDrawableInflater").get(resources);
                if (obj3 != null) {
                    a(obj3.getClass(), stringBuilder2).set(obj3, qVar);
                }
            } catch (Throwable unused) {
            }
        }
        return qVar;
    }

    private static Object a(Context context, Class cls) {
        if (cls == null) {
            try {
                cls = Class.forName("android.app.ActivityThread");
            } catch (Throwable unused) {
                return null;
            }
        }
        Method method = cls.getMethod("currentActivityThread", new Class[0]);
        method.setAccessible(true);
        Object invoke = method.invoke(null, new Object[0]);
        if (invoke == null && context != null) {
            Field field = context.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(context);
            field = obj.getClass().getDeclaredField("mActivityThread");
            field.setAccessible(true);
            invoke = field.get(obj);
        }
        return invoke;
    }

    private static boolean a(Object obj) {
        return a(obj, Class.forName("dalvik.system.BaseDexClassLoader"), "pathList");
    }

    private static Object a(Object obj, Class cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    private static Object a(Object obj, Object obj2) {
        Class componentType = obj2.getClass().getComponentType();
        int length = Array.getLength(obj2);
        int length2 = Array.getLength(obj) + length;
        Object newInstance = Array.newInstance(componentType, length2);
        int i = 0;
        while (i < length2) {
            Array.set(newInstance, i, i < length ? Array.get(obj2, i) : Array.get(obj, i - length));
            i++;
        }
        return newInstance;
    }

    private String a(File file, File file2) {
        String str;
        String name;
        int lastIndexOf;
        if (VERSION.SDK_INT > 25) {
            String str2 = null;
            try {
                str = this.b;
                if (str == null) {
                    str = (String) Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("getCurrentInstructionSet", new Class[0]).invoke(null, new Object[0]);
                    this.b = str;
                }
                str2 = str;
            } catch (Exception unused) {
            }
            File parentFile = file.getParentFile();
            name = file.getName();
            lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf > 0) {
                name = name.substring(0, lastIndexOf);
            }
            return parentFile.getAbsolutePath() + "/oat/" + str2 + "/" + name + ".odex";
        }
        name = file.getName();
        str = ".dex";
        if (!name.endsWith(str)) {
            lastIndexOf = name.lastIndexOf(".");
            if (lastIndexOf < 0) {
                name = name + str;
            } else {
                StringBuilder datagramSocket = new DatagramSocket(lastIndexOf + 4);
                datagramSocket.append(name, 0, lastIndexOf);
                datagramSocket.append(str);
                name = datagramSocket.toString();
            }
        }
        return new RandomAccessFile(file2, name).getPath();
    }

    private static Constructor a(Object obj, Class... clsArr) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
                return declaredConstructor;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new e("err.");
    }

    private static Field a(Class cls, String str) {
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new e("err.");
    }

    private static Field a(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new e("err.");
    }

    private static Method a(Class cls, String str, Class... clsArr) {
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new e("err.");
    }

    private static Method a(Object obj, String str, Class... clsArr) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new e("err.");
    }

    public static String a(Context context) {
        ZipFile zipFile;
        String str;
        int i;
        ZipFile zipFile2;
        Context context2 = context;
        String str2 = "mLexs";
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            String str3 = context.getFilesDir().getPath() + "/_RunDex";
            new e(str3).mkdirs();
            try {
                ZipFile fileInputStream = new FileInputStream(new e(applicationInfo.sourceDir));
                ZipEntry entry = fileInputStream.getEntry("classes2.dex");
                int i2 = 2;
                int i3 = 2;
                while (entry != null) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = str3;
                    objArr[1] = entry.getName();
                    String format = String.format("%s/%s", objArr);
                    InputStream inputStream = fileInputStream.getInputStream(entry);
                    FileOutputStream eVar = new e(format);
                    byte[] bArr = new byte[5024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        eVar.write(bArr, 0, read);
                    }
                    inputStream.close();
                    eVar.flush();
                    eVar.close();
                    if (format == null || !new e(format).exists()) {
                        zipFile = fileInputStream;
                        str = str3;
                        i = i3;
                    } else {
                        try {
                            String str4 = "mRawDexPath";
                            String str5 = "mDexs";
                            String str6 = "mPaths";
                            String str7 = "dex";
                            String str8 = "mZips";
                            String str9 = "mFiles";
                            Object obj;
                            Object newInstance;
                            if (a()) {
                                obj = (PathClassLoader) context.getClassLoader();
                                String replaceAll = new e(format).getName().replaceAll("\\.[a-zA-Z0-9]+", ".lex");
                                Class cls = Class.forName("dalvik.system.LexClassLoader");
                                str = str3;
                                try {
                                    Constructor constructor = cls.getConstructor(new Class[]{String.class, String.class, String.class, ClassLoader.class});
                                    Object[] objArr2 = new Object[4];
                                    zipFile = fileInputStream;
                                    try {
                                        i = i3;
                                        try {
                                            objArr2[0] = context2.getDir(str7, 0).getAbsolutePath() + File.separator + replaceAll;
                                            objArr2[1] = context2.getDir(str7, 0).getAbsolutePath();
                                            objArr2[2] = format;
                                            objArr2[3] = obj;
                                            newInstance = constructor.newInstance(objArr2);
                                            a(obj, PathClassLoader.class, str6, b(a(obj, PathClassLoader.class, str6), a(newInstance, cls, str4)));
                                            a(obj, PathClassLoader.class, str9, a(a(obj, PathClassLoader.class, str9), a(newInstance, cls, str9)));
                                            a(obj, PathClassLoader.class, str8, a(a(obj, PathClassLoader.class, str8), a(newInstance, cls, str8)));
                                            a(obj, PathClassLoader.class, str2, a(a(obj, PathClassLoader.class, str2), a(newInstance, cls, str5)));
                                        } catch (Throwable unused) {
                                        }
                                    } catch (Throwable unused2) {
                                        i = i3;
                                        i3 = i + 1;
                                        zipFile2 = zipFile;
                                        fileInputStream = zipFile2;
                                        i2 = 2;
                                        entry = zipFile2.getEntry(new e("classes").append(i3).append(".dex").toString());
                                        str3 = str;
                                    }
                                } catch (Throwable unused3) {
                                }
                            } else {
                                zipFile = fileInputStream;
                                str = str3;
                                i = i3;
                                if (b()) {
                                    PathClassLoader pathClassLoader = (PathClassLoader) context.getClassLoader();
                                    obj = a(s.b(ClientsUDP.a(pathClassLoader)), s.b(ClientsUDP.a(new DexClassLoader(format, context2.getDir(str7, 0).getAbsolutePath(), format, context.getClassLoader()))));
                                    newInstance = ClientsUDP.a(pathClassLoader);
                                    a(newInstance, newInstance.getClass(), "dexElements", obj);
                                } else {
                                    newInstance = (PathClassLoader) context.getClassLoader();
                                    obj = new DexClassLoader(format, context2.getDir(str7, 0).getAbsolutePath(), format, context.getClassLoader());
                                    a(newInstance, PathClassLoader.class, str6, b(a(newInstance, PathClassLoader.class, str6), a(obj, DexClassLoader.class, str4)));
                                    a(newInstance, PathClassLoader.class, str9, a(a(newInstance, PathClassLoader.class, str9), a(obj, DexClassLoader.class, str9)));
                                    a(newInstance, PathClassLoader.class, str8, a(a(newInstance, PathClassLoader.class, str8), a(obj, DexClassLoader.class, str8)));
                                    a(newInstance, PathClassLoader.class, str5, a(a(newInstance, PathClassLoader.class, str5), a(obj, DexClassLoader.class, str5)));
                                }
                            }
                        } catch (Throwable unused4) {
                            zipFile = fileInputStream;
                            str = str3;
                            i = i3;
                            i3 = i + 1;
                            zipFile2 = zipFile;
                            fileInputStream = zipFile2;
                            i2 = 2;
                            entry = zipFile2.getEntry(new e("classes").append(i3).append(".dex").toString());
                            str3 = str;
                        }
                        i3 = i + 1;
                        zipFile2 = zipFile;
                        fileInputStream = zipFile2;
                        i2 = 2;
                        entry = zipFile2.getEntry(new e("classes").append(i3).append(".dex").toString());
                        str3 = str;
                    }
                    i3 = i + 1;
                    zipFile2 = zipFile;
                    fileInputStream = zipFile2;
                    i2 = 2;
                    entry = zipFile2.getEntry(new e("classes").append(i3).append(".dex").toString());
                    str3 = str;
                }
                fileInputStream.close();
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return;
    }

    private d a(Context context, String str) {
        if (str == null) {
            return;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        for (Field field : VERSION.SDK_INT < 27 ? new Field[]{this.l, this.m} : new Field[]{this.l}) {
            for (Entry value : ((Map) field.get(this.d)).entrySet()) {
                Object obj = ((WeakReference) value.getValue()).get();
                if (obj != null) {
                    if (applicationInfo.sourceDir.equals((String) this.k.get(obj))) {
                        this.k.set(obj, str);
                    }
                }
            }
        }
        String str2 = "err.";
        if (((Integer) this.f.invoke(this.e, new Object[]{str})).intValue() != 0) {
            if (a(applicationInfo)) {
                for (String endsWith : applicationInfo.sharedLibraryFiles) {
                    if (endsWith.endsWith(".apk")) {
                        if (((Integer) this.g.invoke(this.e, new Object[]{r0[r5]})).intValue() == 0) {
                            throw new e(str2);
                        }
                    }
                }
            }
            Field field2 = this.o;
            if (!(field2 == null || this.h == null)) {
                field2.set(this.e, null);
                this.h.invoke(this.e, new Object[0]);
            }
            for (WeakReference weakReference : this.c) {
                Resources resources = (Resources) weakReference.get();
                if (resources != null) {
                    try {
                        this.i.set(resources, this.e);
                    } catch (Throwable unused) {
                        Object obj2 = this.j.get(resources);
                        a(obj2, "mAssets").set(obj2, this.e);
                    }
                    a(resources);
                    resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
                }
            }
            if (VERSION.SDK_INT >= 24) {
                try {
                    field2 = this.n;
                    if (field2 != null) {
                        field2.set(context.getApplicationInfo(), str);
                    }
                } catch (Throwable unused2) {
                }
            }
            return;
        }
        throw new e(str2);
    }

    private static void a(Resources resources) {
        try {
            Object obj = a(Resources.class, "mTypedArrayPool").get(resources);
            do {
            } while (a(obj, "acquire", new Class[0]).invoke(obj, new Object[0]) != null);
        } catch (Throwable unused) {
        }
    }

    private void a(ClassLoader classLoader, List list, File file) {
        int size = list.size();
        Field a = a((Object) classLoader, "path");
        StringBuilder eVar = new e((String) a.get(classLoader));
        Object[] objArr = new String[size];
        Object[] objArr2 = new File[size];
        Object[] objArr3 = new ZipFile[size];
        Object[] objArr4 = new DexFile[size];
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            File file2 = (File) listIterator.next();
            String absolutePath = file2.getAbsolutePath();
            eVar.append(':').append(absolutePath);
            int previousIndex = listIterator.previousIndex();
            objArr[previousIndex] = absolutePath;
            objArr2[previousIndex] = file2;
            objArr3[previousIndex] = new FileInputStream(file2);
            objArr4[previousIndex] = DexFile.loadDex(absolutePath, a(file2, file), 0);
        }
        a.set(classLoader, eVar.toString());
        a((Object) classLoader, "mPaths", objArr);
        a((Object) classLoader, "mFiles", objArr2);
        a((Object) classLoader, "mZips", objArr3);
        try {
            a((Object) classLoader, "mDexs", objArr4);
        } catch (Exception unused) {
        }
    }

    private static void a(Object obj, Class cls, String str, Object obj2) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }

    private static void a(Object obj, String str, Object[] objArr) {
        Field a = a(obj, str);
        Object[] objArr2 = (Object[]) a.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        a.set(obj, objArr3);
    }

    private static boolean a() {
        try {
            Class.forName("dalvik.system.LexClassLoader");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private boolean a(Application application, ArrayList arrayList) {
        File dir = application.getDir("dex", 0);
        ClassLoader classLoader = application.getClassLoader();
        try {
            if (!arrayList.isEmpty()) {
                String name;
                List<File> arrayList2 = new ArrayList(arrayList);
                HashMap hashMap = new HashMap();
                for (File name2 : arrayList2) {
                    name = name2.getName();
                    hashMap.put(name, Boolean.valueOf(this.s.matcher(name).matches()));
                }
                Collections.sort(arrayList2, new o(this, hashMap));
                if (VERSION.SDK_INT >= 24) {
                    a(application, classLoader, dir, (List) arrayList2);
                } else {
                    String str = "dexElements";
                    name = "pathList";
                    Object obj;
                    Iterator it;
                    if (VERSION.SDK_INT >= 23) {
                        obj = a((Object) classLoader, name).get(classLoader);
                        arrayList = new ArrayList();
                        a(obj, str, a(obj, new ArrayList(arrayList2), dir, arrayList));
                        if (arrayList.size() > 0) {
                            it = arrayList.iterator();
                            if (it.hasNext()) {
                                throw ((IOException) it.next());
                            }
                        }
                    } else if (VERSION.SDK_INT >= 19) {
                        obj = a((Object) classLoader, name).get(classLoader);
                        arrayList = new ArrayList();
                        a(obj, str, b(obj, new ArrayList(arrayList2), dir, arrayList));
                        if (arrayList.size() > 0) {
                            it = arrayList.iterator();
                            if (it.hasNext()) {
                                throw ((IOException) it.next());
                            }
                        }
                    } else if (VERSION.SDK_INT >= 14) {
                        obj = a((Object) classLoader, name).get(classLoader);
                        arrayList = new ArrayList(arrayList2);
                        a(obj, str, (Object[]) a(obj, "makeDexElements", ArrayList.class, File.class).invoke(obj, new Object[]{arrayList, dir}));
                    } else {
                        a(classLoader, (List) arrayList2, dir);
                    }
                }
                this.a = arrayList2.size();
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private static boolean a(ApplicationInfo applicationInfo) {
        return (VERSION.SDK_INT < 24 || applicationInfo == null || applicationInfo.sharedLibraryFiles == null) ? false : true;
    }

    private static void a(String str, String str2) {
        IOException e;
        Throwable th;
        new e(new e(str2).getParent()).mkdirs();
        File eVar = new e(str2);
        File eVar2 = new e(str);
        void v = null;
        if (eVar2.exists() && !eVar.exists()) {
            DatagramSocket fileInputStream;
            DatagramSocket fileInputStream2;
            try {
                fileInputStream = new FileInputStream(eVar2);
                try {
                    eVar.createNewFile();
                    fileInputStream2 = new FileInputStream(eVar);
                    try {
                        byte[] bArr = new byte[512];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileInputStream2.write(bArr, 0, read);
                        }
                        v = 1;
                        try {
                            fileInputStream2.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        try {
                            fileInputStream.close();
                        } catch (IOException e22) {
                            e22.printStackTrace();
                        }
                    } catch (IOException e3) {
                        e22 = e3;
                        try {
                            e22.printStackTrace();
                            try {
                                fileInputStream2.close();
                            } catch (IOException e222) {
                                e222.printStackTrace();
                            }
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                fileInputStream2.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                            try {
                                fileInputStream.close();
                            } catch (IOException e42) {
                                e42.printStackTrace();
                            }
                            throw th;
                        }
                    }
                } catch (IOException e422) {
                    IOException iOException = e422;
                    fileInputStream2 = null;
                    e222 = iOException;
                    e222.printStackTrace();
                    fileInputStream2.close();
                    fileInputStream.close();
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    fileInputStream2 = null;
                    th = th4;
                    fileInputStream2.close();
                    fileInputStream.close();
                    throw th;
                }
            } catch (IOException e4222) {
                fileInputStream = null;
                e222 = e4222;
                fileInputStream2 = fileInputStream;
                e222.printStackTrace();
                fileInputStream2.close();
                fileInputStream.close();
            } catch (Throwable th32) {
                fileInputStream = null;
                th = th32;
                fileInputStream2 = fileInputStream;
                fileInputStream2.close();
                fileInputStream.close();
                throw th;
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: BlockSplitter
        java.lang.NullPointerException: Attempt to invoke virtual method 'boolean jadx.core.dex.attributes.AttrNode.contains(jadx.core.dex.attributes.AType)' on a null object reference
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.connectExceptionHandlers(Unknown Source:64)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.setupConnections(Unknown Source:58)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.splitBasicBlocks(Unknown Source:22)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(Unknown Source:13)
        	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:9)
        	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:41)
        	at jadx.core.ProcessClass.process(Unknown Source:54)
        	at jadx.core.ProcessClass.processDependencies(Unknown Source:22)
        	at jadx.core.ProcessClass.process(Unknown Source:68)
        	at jadx.api.JadxDecompiler.processClass(Unknown Source:4)
        	at jadx.api.JavaClass.decompile(Unknown Source:19)
        */
    private static java.lang.Object[] a(java.lang.Object r7, java.util.ArrayList r8, java.io.File r9, java.util.ArrayList r10) {
        /*
        r0 = "makePathElements";
        r1 = 2;
        r2 = 1;
        r3 = 0;
        r4 = 3;
        r5 = new java.lang.Class[r4];	 Catch:{ NoSuchMethodException -> 0x0019 }
        r6 = java.util.List.class;	 Catch:{ NoSuchMethodException -> 0x0019 }
        r5[r3] = r6;	 Catch:{ NoSuchMethodException -> 0x0019 }
        r6 = java.io.File.class;	 Catch:{ NoSuchMethodException -> 0x0019 }
        r5[r2] = r6;	 Catch:{ NoSuchMethodException -> 0x0019 }
        r6 = java.util.List.class;	 Catch:{ NoSuchMethodException -> 0x0019 }
        r5[r1] = r6;	 Catch:{ NoSuchMethodException -> 0x0019 }
        r0 = a(r7, r0, r5);	 Catch:{ NoSuchMethodException -> 0x0019 }
        goto L_0x002b;
    L_0x0019:
        r5 = new java.lang.Class[r4];	 Catch:{ NoSuchMethodException -> 0x003a }
        r6 = java.util.ArrayList.class;	 Catch:{ NoSuchMethodException -> 0x003a }
        r5[r3] = r6;	 Catch:{ NoSuchMethodException -> 0x003a }
        r6 = java.io.File.class;	 Catch:{ NoSuchMethodException -> 0x003a }
        r5[r2] = r6;	 Catch:{ NoSuchMethodException -> 0x003a }
        r6 = java.util.ArrayList.class;	 Catch:{ NoSuchMethodException -> 0x003a }
        r5[r1] = r6;	 Catch:{ NoSuchMethodException -> 0x003a }
        r0 = a(r7, r0, r5);	 Catch:{ NoSuchMethodException -> 0x003a }
    L_0x002b:
        r4 = new java.lang.Object[r4];
        r4[r3] = r8;
        r4[r2] = r9;
        r4[r1] = r10;
        r7 = r0.invoke(r7, r4);
        r7 = (java.lang.Object[]) r7;
        return r7;
    L_0x003a:
        r7 = b(r7, r8, r9, r10);	 Catch:{ NoSuchMethodException -> 0x003f }
        return r7;
        r7 = move-exception;
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: i.runlibrary.b.n.a(java.lang.Object, java.util.ArrayList, java.io.File, java.util.ArrayList):java.lang.Object[]");
    }

    private static String[] b(Object obj) {
        return a(obj, obj.getClass(), "dexElements");
    }

    private static Object b(Object obj, Object obj2) {
        int i = 1;
        int length = Array.getLength(obj) + 1;
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length);
        Array.set(newInstance, 0, obj2);
        while (i < length) {
            Array.set(newInstance, i, Array.get(obj, i - 1));
            i++;
        }
        return newInstance;
    }

    private static boolean b() {
        try {
            Class.forName("dalvik.system.BaseDexClassLoader");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: BlockSplitter
        java.lang.NullPointerException: Attempt to invoke virtual method 'boolean jadx.core.dex.attributes.AttrNode.contains(jadx.core.dex.attributes.AType)' on a null object reference
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.connectExceptionHandlers(Unknown Source:64)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.setupConnections(Unknown Source:58)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.splitBasicBlocks(Unknown Source:22)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(Unknown Source:13)
        	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:9)
        	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:41)
        	at jadx.core.ProcessClass.process(Unknown Source:54)
        	at jadx.core.ProcessClass.processDependencies(Unknown Source:22)
        	at jadx.core.ProcessClass.process(Unknown Source:68)
        	at jadx.api.JadxDecompiler.processClass(Unknown Source:4)
        	at jadx.api.JavaClass.decompile(Unknown Source:19)
        */
    private static java.lang.Object[] b(java.lang.Object r7, java.util.ArrayList r8, java.io.File r9, java.util.ArrayList r10) {
        /*
        r0 = "makeDexElements";
        r1 = 2;
        r2 = 1;
        r3 = 0;
        r4 = 3;
        r5 = new java.lang.Class[r4];	 Catch:{ NoSuchMethodException -> 0x0019 }
        r6 = java.util.ArrayList.class;	 Catch:{ NoSuchMethodException -> 0x0019 }
        r5[r3] = r6;	 Catch:{ NoSuchMethodException -> 0x0019 }
        r6 = java.io.File.class;	 Catch:{ NoSuchMethodException -> 0x0019 }
        r5[r2] = r6;	 Catch:{ NoSuchMethodException -> 0x0019 }
        r6 = java.util.ArrayList.class;	 Catch:{ NoSuchMethodException -> 0x0019 }
        r5[r1] = r6;	 Catch:{ NoSuchMethodException -> 0x0019 }
        r0 = a(r7, r0, r5);	 Catch:{ NoSuchMethodException -> 0x0019 }
        goto L_0x002b;
    L_0x0019:
        r5 = new java.lang.Class[r4];	 Catch:{ NoSuchMethodException -> 0x003a }
        r6 = java.util.List.class;	 Catch:{ NoSuchMethodException -> 0x003a }
        r5[r3] = r6;	 Catch:{ NoSuchMethodException -> 0x003a }
        r6 = java.io.File.class;	 Catch:{ NoSuchMethodException -> 0x003a }
        r5[r2] = r6;	 Catch:{ NoSuchMethodException -> 0x003a }
        r6 = java.util.List.class;	 Catch:{ NoSuchMethodException -> 0x003a }
        r5[r1] = r6;	 Catch:{ NoSuchMethodException -> 0x003a }
        r0 = a(r7, r0, r5);	 Catch:{ NoSuchMethodException -> 0x003a }
    L_0x002b:
        r4 = new java.lang.Object[r4];
        r4[r3] = r8;
        r4[r2] = r9;
        r4[r1] = r10;
        r7 = r0.invoke(r7, r4);
        r7 = (java.lang.Object[]) r7;
        return r7;
        r7 = move-exception;
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: i.runlibrary.b.n.b(java.lang.Object, java.util.ArrayList, java.io.File, java.util.ArrayList):java.lang.Object[]");
    }

    /*  JADX ERROR: NullPointerException in pass: BlockSplitter
        java.lang.NullPointerException: Attempt to invoke virtual method 'boolean jadx.core.dex.attributes.AttrNode.contains(jadx.core.dex.attributes.AType)' on a null object reference
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.connectExceptionHandlers(Unknown Source:64)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.setupConnections(Unknown Source:58)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.splitBasicBlocks(Unknown Source:22)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(Unknown Source:13)
        	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:9)
        	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:41)
        	at jadx.core.ProcessClass.process(Unknown Source:54)
        	at jadx.core.ProcessClass.processDependencies(Unknown Source:22)
        	at jadx.core.ProcessClass.process(Unknown Source:68)
        	at jadx.api.JadxDecompiler.processClass(Unknown Source:4)
        	at jadx.api.JavaClass.decompile(Unknown Source:19)
        */
    public final void a(android.app.Application r12) {
        /*
        r11 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 2;
        r2 = 1;
        r3 = 0;
        r4 = 30;
        if (r0 < r4) goto L_0x0035;
    L_0x0009:
        r0 = new java.lang.Object[r2];
        r4 = r12.getFilesDir();
        r4 = r4.getAbsoluteFile();
        r0[r3] = r4;
        r4 = "%s/tempFile/i";
        r0 = java.lang.String.format(r4, r0);
        r4 = new java.io.File;
        r5 = new java.lang.Object[r2];
        r5[r3] = r0;
        r6 = "%s/i.run";
        r5 = java.lang.String.format(r6, r5);
        r4.<init>(r5);
        r5 = r4.exists();
        if (r5 != 0) goto L_0x0031;
    L_0x0030:
        return;
    L_0x0031:
        r4.delete();
        goto L_0x0062;
    L_0x0035:
        r0 = "android.permission.WRITE_EXTERNAL_STORAGE";
        r0 = r12.checkCallingOrSelfPermission(r0);
        if (r0 == 0) goto L_0x003e;
    L_0x003d:
        return;
    L_0x003e:
        r0 = new java.lang.Object[r1];
        r4 = android.os.Environment.getExternalStorageDirectory();
        r4 = r4.getAbsolutePath();
        r0[r3] = r4;
        r4 = r12.getPackageName();
        r0[r2] = r4;
        r4 = "%s/iApp/tempFile/.i/%s";
        r0 = java.lang.String.format(r4, r0);
        r4 = new java.io.File;
        r4.<init>(r0);
        r4 = r4.exists();
        if (r4 != 0) goto L_0x0062;
    L_0x0061:
        return;
    L_0x0062:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = new java.lang.Object[r2];
        r5[r3] = r0;
        r6 = "%s/d";
        r5 = java.lang.String.format(r6, r5);
        r6 = new java.io.File;
        r6.<init>(r5);
        r6 = r6.exists();
        if (r6 == 0) goto L_0x00b6;
    L_0x007c:
        r6 = new java.io.File;
        r7 = new java.lang.Object[r2];
        r7[r3] = r5;
        r8 = "%s/classes.dex";
        r7 = java.lang.String.format(r8, r7);
        r6.<init>(r7);
        r7 = r6.exists();
        if (r7 == 0) goto L_0x0094;
    L_0x0091:
        r4.add(r6);
    L_0x0094:
        r6 = 2;
    L_0x0095:
        r7 = new java.io.File;
        r8 = new java.lang.Object[r1];
        r8[r3] = r5;
        r9 = java.lang.Integer.valueOf(r6);
        r8[r2] = r9;
        r9 = "%s/classes%s.dex";
        r8 = java.lang.String.format(r9, r8);
        r7.<init>(r8);
        r8 = r7.exists();
        if (r8 == 0) goto L_0x00b6;
    L_0x00b0:
        r4.add(r7);
        r6 = r6 + 1;
        goto L_0x0095;
    L_0x00b6:
        r11.a(r12, r4);
        r1 = new java.io.File;
        r4 = new java.lang.Object[r2];
        r4[r3] = r0;
        r5 = "%s/l";
        r4 = java.lang.String.format(r5, r4);
        r1.<init>(r4);
        r4 = r1.exists();
        if (r4 == 0) goto L_0x011a;
    L_0x00ce:
        r4 = "lib";
        r4 = r12.getDir(r4, r3);
        r4 = r4.getAbsolutePath();
        r1 = r1.listFiles();	 Catch:{ all -> 0x0116 }
        r5 = r1.length;	 Catch:{ all -> 0x0116 }
        r6 = 0;	 Catch:{ all -> 0x0116 }
    L_0x00de:
        if (r6 >= r5) goto L_0x011a;	 Catch:{ all -> 0x0116 }
    L_0x00e0:
        r7 = r1[r6];	 Catch:{ all -> 0x0116 }
        r8 = r7.getName();	 Catch:{ all -> 0x0116 }
        r9 = r8.toLowerCase();	 Catch:{ all -> 0x0116 }
        r10 = ".so";	 Catch:{ all -> 0x0116 }
        r9 = r9.endsWith(r10);	 Catch:{ all -> 0x0116 }
        if (r9 == 0) goto L_0x0113;	 Catch:{ all -> 0x0116 }
    L_0x00f2:
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0116 }
        r9.<init>();	 Catch:{ all -> 0x0116 }
        r9 = r9.append(r4);	 Catch:{ all -> 0x0116 }
        r10 = "/";	 Catch:{ all -> 0x0116 }
        r9 = r9.append(r10);	 Catch:{ all -> 0x0116 }
        r8 = r9.append(r8);	 Catch:{ all -> 0x0116 }
        r8 = r8.toString();	 Catch:{ all -> 0x0116 }
        r7 = r7.getAbsolutePath();	 Catch:{ all -> 0x0116 }
        i.app.Downcenter.a(r7, r8);	 Catch:{ all -> 0x0116 }
        java.lang.System.load(r8);	 Catch:{ all -> 0x0116 }
    L_0x0113:
        r6 = r6 + 1;
        goto L_0x00de;
        r1 = move-exception;
        r1.printStackTrace();
    L_0x011a:
        r1 = new java.io.File;
        r4 = new java.lang.Object[r2];
        r4[r3] = r0;
        r0 = "%s/r.zip";
        r0 = java.lang.String.format(r0, r4);
        r1.<init>(r0);
        r0 = r1.exists();
        if (r0 == 0) goto L_0x0248;
    L_0x012f:
        r0 = "android.app.ActivityThread";	 Catch:{ all -> 0x0238 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ all -> 0x0238 }
        r4 = a(r12, r0);	 Catch:{ all -> 0x0238 }
        r11.d = r4;	 Catch:{ all -> 0x0238 }
        r4 = "android.app.LoadedApk";	 Catch:{ ClassNotFoundException -> 0x0142 }
        r4 = java.lang.Class.forName(r4);	 Catch:{ ClassNotFoundException -> 0x0142 }
        goto L_0x0148;
    L_0x0142:
        r4 = "android.app.ActivityThread$PackageInfo";
        r4 = java.lang.Class.forName(r4);
    L_0x0148:
        r5 = "mResDir";
        r4 = a(r4, r5);
        r11.k = r4;
        r4 = "mPackages";
        r4 = a(r0, r4);
        r11.l = r4;
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 27;
        if (r4 >= r5) goto L_0x0166;
    L_0x015e:
        r4 = "mResourcePackages";
        r4 = a(r0, r4);
        r11.m = r4;
    L_0x0166:
        r4 = r12.getAssets();
        r5 = "addAssetPath";
        r6 = new java.lang.Class[r2];
        r7 = java.lang.String.class;
        r6[r3] = r7;
        r5 = a(r4, r5, r6);
        r11.f = r5;
        r5 = r12.getApplicationInfo();
        r5 = a(r5);
        if (r5 == 0) goto L_0x0190;
    L_0x0182:
        r5 = "addAssetPathAsSharedLibrary";
        r2 = new java.lang.Class[r2];
        r6 = java.lang.String.class;
        r2[r3] = r6;
        r2 = a(r4, r5, r2);
        r11.g = r2;
    L_0x0190:
        r2 = "mStringBlocks";	 Catch:{ all -> 0x01a2 }
        r2 = a(r4, r2);	 Catch:{ all -> 0x01a2 }
        r11.o = r2;	 Catch:{ all -> 0x01a2 }
        r2 = "ensureStringBlocks";	 Catch:{ all -> 0x01a2 }
        r5 = new java.lang.Class[r3];	 Catch:{ all -> 0x01a2 }
        r2 = a(r4, r2, r5);	 Catch:{ all -> 0x01a2 }
        r11.h = r2;	 Catch:{ all -> 0x01a2 }
    L_0x01a2:
        r2 = new java.lang.Class[r3];
        r2 = a(r4, r2);
        r4 = new java.lang.Object[r3];
        r2 = r2.newInstance(r4);
        r2 = (android.content.res.AssetManager) r2;
        r11.e = r2;
        r2 = android.os.Build.VERSION.SDK_INT;
        r4 = 19;
        r5 = "mActiveResources";
        if (r2 < r4) goto L_0x01ef;
    L_0x01ba:
        r0 = "android.app.ResourcesManager";
        r0 = java.lang.Class.forName(r0);
        r2 = "getInstance";
        r4 = new java.lang.Class[r3];
        r2 = a(r0, r2, r4);
        r4 = 0;
        r3 = new java.lang.Object[r3];
        r2 = r2.invoke(r4, r3);
        r3 = a(r0, r5);	 Catch:{ NoSuchFieldException -> 0x01e0 }
        r3 = r3.get(r2);	 Catch:{ NoSuchFieldException -> 0x01e0 }
        r3 = (android.util.ArrayMap) r3;	 Catch:{ NoSuchFieldException -> 0x01e0 }
        r3 = r3.values();	 Catch:{ NoSuchFieldException -> 0x01e0 }
        r11.c = r3;	 Catch:{ NoSuchFieldException -> 0x01e0 }
        goto L_0x0200;
    L_0x01e0:
        r3 = "mResourceReferences";
        r0 = a(r0, r3);
        r0 = r0.get(r2);
        r0 = (java.util.Collection) r0;
    L_0x01ec:
        r11.c = r0;
        goto L_0x0200;
    L_0x01ef:
        r0 = a(r0, r5);
        r2 = r11.d;
        r0 = r0.get(r2);
        r0 = (java.util.HashMap) r0;
        r0 = r0.values();
        goto L_0x01ec;
    L_0x0200:
        r0 = r11.c;
        if (r0 == 0) goto L_0x0230;
    L_0x0204:
        r0 = r12.getResources();
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 24;
        r4 = "mAssets";
        if (r2 < r3) goto L_0x0220;
    L_0x0210:
        r2 = "mResourcesImpl";	 Catch:{ all -> 0x0219 }
        r2 = a(r0, r2);	 Catch:{ all -> 0x0219 }
        r11.j = r2;	 Catch:{ all -> 0x0219 }
        goto L_0x0225;
    L_0x0219:
        r0 = a(r0, r4);
    L_0x021d:
        r11.i = r0;
        goto L_0x0225;
    L_0x0220:
        r0 = a(r0, r4);
        goto L_0x021d;
    L_0x0225:
        r0 = android.content.pm.ApplicationInfo.class;	 Catch:{ NoSuchFieldException -> 0x023c }
        r2 = "publicSourceDir";	 Catch:{ NoSuchFieldException -> 0x023c }
        r0 = a(r0, r2);	 Catch:{ NoSuchFieldException -> 0x023c }
        r11.n = r0;	 Catch:{ NoSuchFieldException -> 0x023c }
        goto L_0x023c;
    L_0x0230:
        r0 = new java.lang.IllegalStateException;
        r2 = "err.";
        r0.<init>(r2);
        throw r0;
        r0 = move-exception;
        r0.printStackTrace();
    L_0x023c:
        r0 = r1.getAbsolutePath();	 Catch:{ all -> 0x0244 }
        r11.a(r12, r0);	 Catch:{ all -> 0x0244 }
        return;
        r12 = move-exception;
        r12.printStackTrace();
    L_0x0248:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: i.runlibrary.b.n.a(android.app.Application):void");
    }
}