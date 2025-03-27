package i.runlibrary.app;

import i.app.FileProvider;
import i.runlibrary.a.d;
import i.runlibrary.a.s;
import i.runlibrary.app.v.lb;
import java.io.File;
import java.io.InputStream;

public class wj {
    private AppInfo a = null;

    public wj(AppInfo appInfo) {
        this.a = appInfo;
    }

    public boolean cz(Object obj) {
        return d.b(this.a.c, (String) obj);
    }

    public File[] czwj(Object obj, Object obj2) {
        return obj instanceof File ? FileProvider.a((File) obj, s.b(obj2)) : FileProvider.a(new e(FileProvider.a(this.a.c, obj.toString())), s.b(obj2));
    }

    public boolean dk(Object obj) {
        d.h(this.a.c, (String) obj);
        return;
    }

    public String dqwb(Object obj) {
        return d.a(this.a.c, (String) obj, "utf-8");
    }

    public String dqwb(Object obj, Object obj2) {
        return d.a(this.a.c, (String) obj, (String) obj2);
    }

    public long dx(Object obj) {
        return d.d(this.a.c, (String) obj);
    }

    public boolean fz(Object obj, Object obj2) {
        return d.a(this.a.c, (String) obj, (String) obj2, false);
    }

    public boolean fz(Object obj, Object obj2, Object obj3) {
        return d.a(this.a.c, (String) obj, (String) obj2, obj3.equals(Boolean.valueOf(true)));
    }

    public String hqml(Object obj) {
        return d.f(this.a.c, (String) obj);
    }

    public int jy(Object obj, Object obj2) {
        return d.a(this.a.c, (String) obj, null, (String) obj2, false);
    }

    public int jy(Object obj, Object obj2, Object obj3) {
        return d.a(this.a.c, (String) obj, null, (String) obj2, obj3.equals(Boolean.valueOf(true)));
    }

    public int jy(Object obj, Object obj2, Object obj3, Object obj4) {
        return d.a(this.a.c, (String) obj, (String) obj2, (String) obj3, obj4.equals(Boolean.valueOf(true)));
    }

    public String[] lb(Object obj) {
        return d.e(this.a.c, (String) obj);
    }

    public lb lb(Object obj, Object obj2) {
        return d.b(this.a.c, (String) obj, obj2.equals(Boolean.valueOf(true)));
    }

    public int lx(Object obj) {
        return d.c(this.a.c, (String) obj);
    }

    public int sc(Object obj) {
        return d.a(this.a.c, (String) obj, false);
    }

    public boolean sc(Object obj, Object obj2) {
        return d.a(this.a.c, (String) obj, obj2.equals(Boolean.valueOf(true)));
    }

    public File wj(Object obj) {
        return new e(FileProvider.a(this.a.c, obj.toString()));
    }

    public boolean xrwb(Object obj, Object obj2) {
        return d.a(this.a.c, (String) obj, (String) obj2, "utf-8");
    }

    public boolean xrwb(Object obj, Object obj2, Object obj3) {
        return d.a(this.a.c, (String) obj, (String) obj2, (String) obj3);
    }

    public boolean xrzjsz(Object obj, Object obj2) {
        return obj2 instanceof byte[] ? d.a(d.f(this.a.c, obj.toString()), (byte[]) obj2) : false;
    }

    public int ys(Object obj, Object obj2) {
        return d.b(this.a.c, (String) obj, (String) obj2);
    }

    public byte[] zjsz(Object obj) {
        return obj instanceof File ? d.a((File) obj) : obj instanceof InputStream ? d.a((InputStream) obj) : d.g(this.a.c, (String) obj);
    }

    public boolean zy(Object obj, Object obj2) {
        return d.b(this.a.c, (String) obj, (String) obj2, false);
    }

    public boolean zy(Object obj, Object obj2, Object obj3) {
        return d.b(this.a.c, (String) obj, (String) obj2, obj3.equals(Boolean.valueOf(true)));
    }
}