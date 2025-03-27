package i.runlibrary.app;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import i.runlibrary.a.r;
import i.runlibrary.a.s;
import i.runlibrary.app.sj.sjk;
import i.runlibrary.app.sj.zh;
import i.runlibrary.app.v.lbs.UserAdapter;
import i.runlibrary.app.v.v7lb;
import i.runlibrary.app.v.v7列表;
import i.runlibrary.app.v.列表操作.适配器;
import i.runlibrary.c.c;
import i.runlibrary.c.d;
import java.util.ArrayList;
import java.util.HashMap;

public class 数据 extends sj {
    private AppInfo a = null;
    private Bundle b = null;

    public class 列表 {
        private View b;

        public 列表(View view) {
            this.b = view;
        }

        private Object[] a() {
            Object[] objArr;
            Object tag = this.b.getTag();
            String str = "ivg";
            if (tag instanceof Object[]) {
                objArr = (Object[]) tag;
                if (objArr.length > 1 && ((objArr[1] instanceof 适配器) || (objArr[1] instanceof v7列表.适配器) || (objArr[1] instanceof UserAdapter) || (objArr[1] instanceof v7lb.UserAdapter) || (objArr[1] instanceof c) || str.equals(objArr[1]))) {
                    return objArr;
                }
            }
            while (true) {
                ViewParent parent = this.b.getParent();
                if (parent != null && (parent instanceof View)) {
                    View view = (View) parent;
                    this.b = view;
                    tag = view.getTag();
                    if (tag instanceof Object[]) {
                        objArr = (Object[]) tag;
                        if (objArr.length > 1 && ((objArr[1] instanceof 适配器) || (objArr[1] instanceof v7列表.适配器) || (objArr[1] instanceof UserAdapter) || (objArr[1] instanceof v7lb.UserAdapter) || (objArr[1] instanceof c) || str.equals(objArr[1]))) {
                            return objArr;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: v7列表适配器 */
        public v7列表.适配器 m18v7() {
            try {
                Object[] a = a();
                if (a != null && (a[1] instanceof v7列表.适配器)) {
                    return (v7列表.适配器) a[1];
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        /* renamed from: 列表数据 */
        public Object m19(Object obj, Object obj2) {
            try {
                Object[] a = a();
                if (a != null) {
                    if (a[1] instanceof 适配器) {
                        return ((HashMap) ((适配器) a[1]).f86.get(s.d(obj))).get(Integer.valueOf(s.d(obj2)));
                    }
                    if (a[1] instanceof v7列表.适配器) {
                        return ((HashMap) ((v7列表.适配器) a[1]).f89.get(s.d(obj))).get(Integer.valueOf(s.d(obj2)));
                    }
                    if (a[1] instanceof UserAdapter) {
                        return ((HashMap) ((UserAdapter) a[1]).list_S.get(s.d(obj))).get(Integer.valueOf(s.d(obj2)));
                    }
                    if (a[1] instanceof v7lb.UserAdapter) {
                        return ((HashMap) ((v7lb.UserAdapter) a[1]).list_S.get(s.d(obj))).get(Integer.valueOf(s.d(obj2)));
                    }
                    if (a[1] instanceof c) {
                        return ((HashMap) ((d) a[0]).a.get(s.d(obj))).get(Integer.valueOf(s.d(obj2)));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        /* renamed from: 列表数据 */
        public ArrayList m20() {
            try {
                Object[] a = a();
                if (a != null) {
                    if (a[1] instanceof 适配器) {
                        return ((适配器) a[1]).f86;
                    }
                    if (a[1] instanceof v7列表.适配器) {
                        return ((v7列表.适配器) a[1]).f89;
                    }
                    if (a[1] instanceof UserAdapter) {
                        return ((UserAdapter) a[1]).list_S;
                    }
                    if (a[1] instanceof v7lb.UserAdapter) {
                        return ((v7lb.UserAdapter) a[1]).list_S;
                    }
                    if (a[1] instanceof c) {
                        return ((d) a[0]).a;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        /* renamed from: 列表数据 */
        public HashMap m21(Object obj) {
            try {
                Object[] a = a();
                if (a != null) {
                    if (a[1] instanceof 适配器) {
                        return (HashMap) ((适配器) a[1]).f86.get(s.d(obj));
                    }
                    if (a[1] instanceof v7列表.适配器) {
                        return (HashMap) ((v7列表.适配器) a[1]).f89.get(s.d(obj));
                    }
                    if (a[1] instanceof UserAdapter) {
                        return (HashMap) ((UserAdapter) a[1]).list_S.get(s.d(obj));
                    }
                    if (a[1] instanceof v7lb.UserAdapter) {
                        return (HashMap) ((v7lb.UserAdapter) a[1]).list_S.get(s.d(obj));
                    }
                    if (a[1] instanceof c) {
                        return (HashMap) ((d) a[0]).a.get(s.d(obj));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        /* renamed from: 列表触发位置 */
        public int m22() {
            try {
                Object[] a = a();
                if (a != null) {
                    if (a[1] instanceof 适配器) {
                        return s.d(a[2]);
                    }
                    if (a[1] instanceof v7列表.适配器) {
                        return s.d(a[2]);
                    }
                    if (a[1] instanceof UserAdapter) {
                        return s.d(a[2]);
                    }
                    if (a[1] instanceof v7lb.UserAdapter) {
                        return s.d(a[2]);
                    }
                    if (a[1] instanceof c) {
                        return s.d(a[3]);
                    }
                    if ("ivg".equals(a[1])) {
                        return s.d(a[2]);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return -1;
        }

        /* renamed from: 列表触发数据 */
        public Object m23(Object obj) {
            try {
                Object[] a = a();
                if (a != null) {
                    if (a[1] instanceof 适配器) {
                        return ((HashMap) ((适配器) a[1]).f86.get(s.d(a[2]))).get(Integer.valueOf(s.d(obj)));
                    }
                    if (a[1] instanceof v7列表.适配器) {
                        return ((HashMap) ((v7列表.适配器) a[1]).f89.get(s.d(a[2]))).get(Integer.valueOf(s.d(obj)));
                    }
                    if (a[1] instanceof UserAdapter) {
                        return ((HashMap) ((UserAdapter) a[1]).list_S.get(s.d(a[2]))).get(Integer.valueOf(s.d(obj)));
                    }
                    if (a[1] instanceof v7lb.UserAdapter) {
                        return ((HashMap) ((v7lb.UserAdapter) a[1]).list_S.get(s.d(a[2]))).get(Integer.valueOf(s.d(obj)));
                    }
                    if (a[1] instanceof c) {
                        return ((HashMap) a[2]).get(Integer.valueOf(s.d(obj)));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        /* renamed from: 列表触发数据 */
        public HashMap m24() {
            try {
                Object[] a = a();
                if (a != null) {
                    if (a[1] instanceof 适配器) {
                        return (HashMap) ((适配器) a[1]).f86.get(s.d(a[2]));
                    }
                    if (a[1] instanceof v7列表.适配器) {
                        return (HashMap) ((v7列表.适配器) a[1]).f89.get(s.d(a[2]));
                    }
                    if (a[1] instanceof UserAdapter) {
                        return (HashMap) ((UserAdapter) a[1]).list_S.get(s.d(a[2]));
                    }
                    if (a[1] instanceof v7lb.UserAdapter) {
                        return (HashMap) ((v7lb.UserAdapter) a[1]).list_S.get(s.d(a[2]));
                    }
                    if (a[1] instanceof c) {
                        return (HashMap) a[2];
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        /* renamed from: 列表适配器 */
        public 适配器 m25() {
            try {
                Object[] a = a();
                if (a != null && (a[1] instanceof 适配器)) {
                    return (适配器) a[1];
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        /* JADX WARNING: Missing block: B:41:0x0082, code:
            return null;
     */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: 列表项目视图 */
        public View m26() {
            Object[] objArr;
            Object tag = this.b.getTag();
            String str = "ivg";
            if (tag instanceof Object[]) {
                objArr = (Object[]) tag;
                if (objArr.length > 1 && ((objArr[1] instanceof 适配器) || (objArr[1] instanceof v7列表.适配器) || (objArr[1] instanceof UserAdapter) || (objArr[1] instanceof v7lb.UserAdapter) || (objArr[1] instanceof c) || str.equals(objArr[1]))) {
                    return this.b;
                }
            }
            while (true) {
                ViewParent parent = this.b.getParent();
                if (parent != null && (parent instanceof View)) {
                    View view = (View) parent;
                    this.b = view;
                    tag = view.getTag();
                    if (tag instanceof Object[]) {
                        objArr = (Object[]) tag;
                        if (objArr.length > 1 && ((objArr[1] instanceof 适配器) || (objArr[1] instanceof v7列表.适配器) || (objArr[1] instanceof UserAdapter) || (objArr[1] instanceof v7lb.UserAdapter) || (objArr[1] instanceof c) || str.equals(objArr[1]))) {
                        }
                    }
                }
            }
            return this.b;
        }
    }

    public class 数据库 {
        private sjk b;
        /* renamed from: 数据库 */
        public SQLiteDatabase f38;
        /* renamed from: 新建 */
        public boolean f39 = this.b.xj;

        public 数据库(String str) {
            sjk sjk = new sjk(str);
            this.b = sjk;
            this.f38 = sjk.sjk;
        }

        /* renamed from: 创建数据 */
        public boolean m27(Object obj, Object obj2, Object obj3) {
            return this.b.cjsj(obj, obj2, obj3);
        }

        /* renamed from: 创建数据表 */
        public boolean m28(Object obj, Object obj2) {
            return this.b.cjsjb(obj, obj2);
        }

        /* renamed from: 删除数据 */
        public boolean m29(Object obj, Object obj2) {
            return this.b.scsj(obj, obj2);
        }

        /* renamed from: 删除数据库 */
        public boolean m30() {
            return this.b.scsjk();
        }

        /* renamed from: 删除数据表 */
        public boolean m31(Object obj) {
            return this.b.scsjb(obj);
        }

        /* renamed from: 存在数据表 */
        public boolean m32(Object obj) {
            return this.b.czsjb(obj);
        }

        /* renamed from: 更新数据 */
        public boolean m33(Object obj, Object obj2, Object obj3) {
            return this.b.gxsj(obj, obj2, obj3);
        }

        /* renamed from: 查询数据 */
        public 查询数据 m34(Object obj) {
            try {
                return new 查询数据(this.f38.rawQuery(obj.toString(), null));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: 查询数据 */
        public 查询数据 m35(Object obj, Object obj2, Object obj3) {
            try {
                return new 查询数据(r.c(this.f38, obj2.toString(), obj.toString(), obj3 == null ? null : obj3.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: 释放数据库 */
        public boolean m36() {
            return this.b.sfsjk();
        }
    }

    public class 查询数据 {
        /* renamed from: 光标 */
        public Cursor f40 = null;

        public 查询数据(Cursor cursor) {
            this.f40 = cursor;
        }

        /* renamed from: 上一行 */
        public boolean m37() {
            try {
                return this.f40.moveToPrevious();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: 下一行 */
        public boolean m38() {
            try {
                return this.f40.moveToNext();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: 指定位置 */
        public boolean m39(Object obj) {
            try {
                return this.f40.moveToPosition(s.d(obj));
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: 数据 */
        public void m40(Object obj) {
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: 最后一行 */
        public boolean m41() {
            try {
                return this.f40.moveToLast();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: 查询列数 */
        public int m42() {
            try {
                return this.f40.getColumnCount();
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        /* renamed from: 查询行数 */
        public int m43() {
            try {
                return this.f40.getCount();
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        /* renamed from: 第一行 */
        public boolean m44() {
            try {
                return this.f40.moveToFirst();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: 获取位置 */
        public int m45() {
            try {
                return this.f40.getPosition();
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        /* renamed from: 释放 */
        public void m46() {
            Cursor cursor = this.f40;
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public class 转换 {
        private zh b;

        public 转换() {
            this.b = new zh();
        }

        public 转换(Object obj) {
            this.b = new zh(obj);
        }

        /* renamed from: dp转px */
        public int m47dppx() {
            return this.b.dpzpx();
        }

        /* renamed from: dp转px */
        public int m48dppx(Object obj) {
            return this.b.dpzpx(obj);
        }

        /* renamed from: px转dp */
        public int m49pxdp() {
            return this.b.pxzdp();
        }

        /* renamed from: px转dp */
        public int m50pxdp(Object obj) {
            return this.b.pxzdp(obj);
        }

        /* renamed from: px转sp */
        public int m51pxsp() {
            return this.b.pxzsp();
        }

        /* renamed from: px转sp */
        public int m52pxsp(Object obj) {
            return this.b.pxzsp(obj);
        }

        /* renamed from: sp转px */
        public int m53sppx() {
            return this.b.spzpx();
        }

        /* renamed from: sp转px */
        public int m54sppx(Object obj) {
            return this.b.spzpx(obj);
        }

        /* renamed from: 类 */
        public Class m55() {
            return this.b.lei();
        }

        /* renamed from: 转bitmap */
        public Bitmap m56bitmap() {
            return this.b.zbitmap();
        }

        /* renamed from: 转bitmap */
        public Bitmap m57bitmap(Bitmap bitmap) {
            return this.b.zbitmap(bitmap);
        }

        /* renamed from: 转bitmap */
        public Bitmap m58bitmap(Object obj, Bitmap bitmap) {
            return this.b.zbitmap(obj, bitmap);
        }

        /* renamed from: 转双精小数 */
        public double m59() {
            return this.b.zdouble();
        }

        /* renamed from: 转双精小数 */
        public double m60(double d) {
            return this.b.zdouble(d);
        }

        /* renamed from: 转双精小数 */
        public double m61(Object obj, double d) {
            return this.b.zdouble(obj, d);
        }

        /* renamed from: 转字符串 */
        public String m62() {
            return this.b.zstring();
        }

        /* renamed from: 转字符串 */
        public String m63(Object obj) {
            return this.b.zstring(obj);
        }

        /* renamed from: 转字符串 */
        public String m64(Object obj, Object obj2) {
            return this.b.zstring(obj, obj2);
        }

        /* renamed from: 转字节 */
        public byte m65() {
            return this.b.zbyte();
        }

        /* renamed from: 转字节 */
        public byte m66(int i) {
            return this.b.zbyte(i);
        }

        /* renamed from: 转字节 */
        public byte m67(Object obj, int i) {
            return this.b.zbyte(obj, i);
        }

        /* renamed from: 转字节组 */
        public byte[] m68() {
            return this.b.zbytes();
        }

        /* renamed from: 转字节组 */
        public byte[] m69(Object obj, Object obj2, byte[] bArr) {
            return this.b.zbytes(obj, obj2, bArr);
        }

        /* renamed from: 转字节组 */
        public byte[] m70(Object obj, byte[] bArr) {
            return this.b.zbytes(obj, bArr);
        }

        /* renamed from: 转字节组 */
        public byte[] m71(byte[] bArr) {
            return this.b.zbytes(bArr);
        }

        /* renamed from: 转小数 */
        public float m72() {
            return this.b.zfloat();
        }

        /* renamed from: 转小数 */
        public float m73(float f) {
            return this.b.zfloat(f);
        }

        /* renamed from: 转小数 */
        public float m74(Object obj, float f) {
            return this.b.zfloat(obj, f);
        }

        /* renamed from: 转整型 */
        public int m75() {
            return this.b.zint();
        }

        /* renamed from: 转整型 */
        public int m76(int i) {
            return this.b.zint(i);
        }

        /* renamed from: 转整型 */
        public int m77(Object obj, int i) {
            return this.b.zint(obj, i);
        }

        /* renamed from: 转是否 */
        public boolean m78() {
            return this.b.zboolean();
        }

        /* renamed from: 转是否 */
        public boolean m79(Object obj, boolean z) {
            return this.b.zboolean(obj, z);
        }

        /* renamed from: 转是否 */
        public boolean m80(boolean z) {
            return this.b.zboolean(z);
        }

        /* renamed from: 转长整 */
        public long m81() {
            return this.b.zlong();
        }

        /* renamed from: 转长整 */
        public long m82(long j) {
            return this.b.zlong(j);
        }

        /* renamed from: 转长整 */
        public long m83(Object obj, long j) {
            return this.b.zlong(obj, j);
        }

        /* renamed from: 转颜色 */
        public int m84() {
            return this.b.zys();
        }

        /* renamed from: 转颜色 */
        public int m85(Object obj) {
            return this.b.zys(obj);
        }

        /* renamed from: 转颜色 */
        public int m86(Object obj, Object obj2) {
            return this.b.zys(obj, obj2);
        }
    }

    public 数据(AppInfo appInfo) {
        super(appInfo);
        this.a = appInfo;
    }

    public String md5(Object obj) {
        return super.md5(obj);
    }

    /* renamed from: 列表 */
    public 列表 m8(Object obj) {
        View st = this.a.st(obj);
        return st != null ? new 列表(st) : null;
    }

    /* renamed from: 实例 */
    public boolean m9(Object obj, Object obj2) {
        return super.sl(obj, obj2);
    }

    /* renamed from: 数据库 */
    public 数据库 m10(Object obj) {
        return new 数据库(obj.toString());
    }

    /* renamed from: 绘制 */
    public Drawable m11(int i) {
        return this.a.c.getResources().getDrawable(i);
    }

    /* renamed from: 绘制 */
    public Drawable m12(String str) {
        return this.a.c.getResources().getDrawable(this.a.getIdentifier(str, "drawable"));
    }

    /* renamed from: 获取uri */
    public String m13uri(Object obj) {
        return super.hquri(obj);
    }

    /* renamed from: 获取跳转 */
    public Bundle m14() {
        if (this.b == null) {
            if (this.a.a == null) {
                return null;
            }
            Bundle extras = this.a.a.getIntent().getExtras();
            this.b = extras;
            if (extras == null) {
                return null;
            }
        }
        return this.b;
    }

    /* renamed from: 获取跳转 */
    public String m15(Object obj) {
        if (this.b == null) {
            if (this.a.a == null) {
                return null;
            }
            Bundle extras = this.a.a.getIntent().getExtras();
            this.b = extras;
            if (extras == null) {
                return null;
            }
        }
        return this.b.getString(String.valueOf(obj));
    }

    /* renamed from: 转换 */
    public 转换 m16() {
        return new 转换();
    }

    /* renamed from: 转换 */
    public 转换 m17(Object obj) {
        return new 转换(obj);
    }
}