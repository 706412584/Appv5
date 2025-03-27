package i.runlibrary.b;

import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.net.URL;
import java.util.Enumeration;

final class q extends BaseDexClassLoader {
    final /* synthetic */ n a;
    private final ClassLoader b;

    private q(n nVar, String str, File file, String str2, ClassLoader classLoader) {
        this.a = nVar;
        super(str, file, str2, ClassLoader.getSystemClassLoader());
        this.b = classLoader;
    }

    /* synthetic */ q(n nVar, String str, File file, String str2, ClassLoader classLoader, byte b) {
        this(nVar, str, file, str2, classLoader);
    }

    protected final Class findClass(String str) {
        Class findClass;
        try {
            findClass = super.findClass(str);
        } catch (ClassNotFoundException unused) {
            findClass = null;
        }
        return findClass != null ? findClass : this.b.loadClass(str);
    }

    public final URL getResource(String str) {
        URL resource = Object.class.getClassLoader().getResource(str);
        if (resource != null) {
            return resource;
        }
        resource = findResource(str);
        return resource != null ? resource : this.b.getResource(str);
    }

    public final Enumeration getResources(String str) {
        return new p(this.a, new Enumeration[]{Object.class.getClassLoader().getResources(str), findResources(str), this.b.getResources(str)}, (byte) 0);
    }
}