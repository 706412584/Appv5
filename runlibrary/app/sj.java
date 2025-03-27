package i.runlibrary.app;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import i.app.ClientsUDP;
import i.app.FileProvider;
import i.runlibrary.a.o;
import i.runlibrary.a.r;
import i.runlibrary.a.s;
import i.runlibrary.app.v.lbs.UserAdapter;
import i.runlibrary.app.v.v7lb;
import i.runlibrary.app.v.v7列表;
import i.runlibrary.app.v.列表操作.适配器;
import i.runlibrary.b.a;
import i.runlibrary.c.c;
import i.runlibrary.c.d;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;

public class sj {
    private AppInfo a = null;
    private Bundle b = null;

    public class cxsj {
        public Cursor cr = null;

        public cxsj(Cursor cursor) {
            this.cr = cursor;
        }

        public int cxhs() {
            try {
                return this.cr.getCount();
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        public int cxls() {
            try {
                return this.cr.getColumnCount();
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        public boolean dyh() {
            try {
                return this.cr.moveToFirst();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public int hqwz() {
            try {
                return this.cr.getPosition();
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        public void sf() {
            Cursor cursor = this.cr;
            if (cursor != null) {
                cursor.close();
            }
        }

        public String sj(Object obj) {
            try {
                return this.cr.getString(s.d(obj));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public boolean syh() {
            try {
                return this.cr.moveToPrevious();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public boolean xyh() {
            try {
                return this.cr.moveToNext();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public boolean zdwz(Object obj) {
            try {
                return this.cr.moveToPosition(s.d(obj));
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public boolean zhyh() {
            try {
                return this.cr.moveToLast();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public class lb {
        private View b;

        public lb(View view) {
            this.b = view;
        }

        private Object[] a() {
            Object[] objArr;
            Object tag = this.b.getTag();
            String str = "ivg";
            if (tag instanceof Object[]) {
                objArr = (Object[]) tag;
                if (objArr.length > 1 && ((objArr[1] instanceof UserAdapter) || (objArr[1] instanceof v7lb.UserAdapter) || (objArr[1] instanceof 适配器) || (objArr[1] instanceof v7列表.适配器) || (objArr[1] instanceof c) || str.equals(objArr[1]))) {
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
                        if (objArr.length > 1 && ((objArr[1] instanceof UserAdapter) || (objArr[1] instanceof v7lb.UserAdapter) || (objArr[1] instanceof 适配器) || (objArr[1] instanceof v7列表.适配器) || (objArr[1] instanceof c) || str.equals(objArr[1]))) {
                            return objArr;
                        }
                    }
                }
            }
            return null;
        }

        public Object lbcfsj(Object obj) {
            try {
                Object[] a = a();
                if (a != null) {
                    if (a[1] instanceof UserAdapter) {
                        return ((HashMap) ((UserAdapter) a[1]).list_S.get(s.d(a[2]))).get(Integer.valueOf(s.d(obj)));
                    }
                    if (a[1] instanceof v7lb.UserAdapter) {
                        return ((HashMap) ((v7lb.UserAdapter) a[1]).list_S.get(s.d(a[2]))).get(Integer.valueOf(s.d(obj)));
                    }
                    if (a[1] instanceof 适配器) {
                        return ((HashMap) ((适配器) a[1]).f86.get(s.d(a[2]))).get(Integer.valueOf(s.d(obj)));
                    }
                    if (a[1] instanceof v7列表.适配器) {
                        return ((HashMap) ((v7列表.适配器) a[1]).f89.get(s.d(a[2]))).get(Integer.valueOf(s.d(obj)));
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

        public HashMap lbcfsj() {
            try {
                Object[] a = a();
                if (a != null) {
                    if (a[1] instanceof UserAdapter) {
                        return (HashMap) ((UserAdapter) a[1]).list_S.get(s.d(a[2]));
                    }
                    if (a[1] instanceof v7lb.UserAdapter) {
                        return (HashMap) ((v7lb.UserAdapter) a[1]).list_S.get(s.d(a[2]));
                    }
                    if (a[1] instanceof 适配器) {
                        return (HashMap) ((适配器) a[1]).f86.get(s.d(a[2]));
                    }
                    if (a[1] instanceof v7列表.适配器) {
                        return (HashMap) ((v7列表.适配器) a[1]).f89.get(s.d(a[2]));
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

        public int lbcfwz() {
            try {
                Object[] a = a();
                if (a != null) {
                    if (a[1] instanceof UserAdapter) {
                        return s.d(a[2]);
                    }
                    if (a[1] instanceof v7lb.UserAdapter) {
                        return s.d(a[2]);
                    }
                    if (a[1] instanceof 适配器) {
                        return s.d(a[2]);
                    }
                    if (a[1] instanceof v7列表.适配器) {
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

        public Object lbsj(Object obj, Object obj2) {
            try {
                Object[] a = a();
                if (a != null) {
                    if (a[1] instanceof UserAdapter) {
                        return ((HashMap) ((UserAdapter) a[1]).list_S.get(s.d(obj))).get(Integer.valueOf(s.d(obj2)));
                    }
                    if (a[1] instanceof v7lb.UserAdapter) {
                        return ((HashMap) ((v7lb.UserAdapter) a[1]).list_S.get(s.d(obj))).get(Integer.valueOf(s.d(obj2)));
                    }
                    if (a[1] instanceof 适配器) {
                        return ((HashMap) ((适配器) a[1]).f86.get(s.d(obj))).get(Integer.valueOf(s.d(obj2)));
                    }
                    if (a[1] instanceof v7列表.适配器) {
                        return ((HashMap) ((v7列表.适配器) a[1]).f89.get(s.d(obj))).get(Integer.valueOf(s.d(obj2)));
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

        public ArrayList lbsj() {
            try {
                Object[] a = a();
                if (a != null) {
                    if (a[1] instanceof UserAdapter) {
                        return ((UserAdapter) a[1]).list_S;
                    }
                    if (a[1] instanceof v7lb.UserAdapter) {
                        return ((v7lb.UserAdapter) a[1]).list_S;
                    }
                    if (a[1] instanceof 适配器) {
                        return ((适配器) a[1]).f86;
                    }
                    if (a[1] instanceof v7列表.适配器) {
                        return ((v7列表.适配器) a[1]).f89;
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

        public HashMap lbsj(Object obj) {
            try {
                Object[] a = a();
                if (a != null) {
                    if (a[1] instanceof UserAdapter) {
                        return (HashMap) ((UserAdapter) a[1]).list_S.get(s.d(obj));
                    }
                    if (a[1] instanceof v7lb.UserAdapter) {
                        return (HashMap) ((v7lb.UserAdapter) a[1]).list_S.get(s.d(obj));
                    }
                    if (a[1] instanceof 适配器) {
                        return (HashMap) ((适配器) a[1]).f86.get(s.d(obj));
                    }
                    if (a[1] instanceof v7列表.适配器) {
                        return (HashMap) ((v7列表.适配器) a[1]).f89.get(s.d(obj));
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

        public UserAdapter lbspq() {
            try {
                Object[] a = a();
                if (a != null && (a[1] instanceof UserAdapter)) {
                    return (UserAdapter) a[1];
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
        public View lbxmst() {
            Object[] objArr;
            Object tag = this.b.getTag();
            String str = "ivg";
            if (tag instanceof Object[]) {
                objArr = (Object[]) tag;
                if (objArr.length > 1 && ((objArr[1] instanceof UserAdapter) || (objArr[1] instanceof v7lb.UserAdapter) || (objArr[1] instanceof 适配器) || (objArr[1] instanceof v7列表.适配器) || (objArr[1] instanceof c) || str.equals(objArr[1]))) {
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
                        if (objArr.length > 1 && ((objArr[1] instanceof UserAdapter) || (objArr[1] instanceof v7lb.UserAdapter) || (objArr[1] instanceof 适配器) || (objArr[1] instanceof v7列表.适配器) || (objArr[1] instanceof c) || str.equals(objArr[1]))) {
                        }
                    }
                }
            }
            return this.b;
        }

        public v7lb.UserAdapter v7lbspq() {
            try {
                Object[] a = a();
                if (a != null && (a[1] instanceof v7lb.UserAdapter)) {
                    return (v7lb.UserAdapter) a[1];
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public class sjk {
        private boolean b;
        private String c;
        public SQLiteDatabase sjk = null;
        public boolean xj = false;

        public sjk(String str) {
            if (str.contains("/") || str.contains("\\") || str.startsWith("@") || str.startsWith("$") || str.startsWith("%")) {
                this.c = FileProvider.a(sj.this.a.c, str);
                this.b = false;
            } else {
                this.b = true;
                this.c = str;
            }
            try {
                this.xj = r.b(sj.this.a.c, this.c, this.b);
                this.sjk = r.a(sj.this.a.c, this.c, this.b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public boolean cjsj(Object obj, Object obj2, Object obj3) {
            try {
                return r.a(this.sjk, obj.toString(), obj2.toString(), obj3.toString());
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public boolean cjsjb(Object obj, Object obj2) {
            try {
                return r.a(this.sjk, obj.toString(), obj2.toString());
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public cxsj cxsj(Object obj) {
            try {
                return new cxsj(this.sjk.rawQuery(obj.toString(), null));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public cxsj cxsj(Object obj, Object obj2, Object obj3) {
            try {
                return new cxsj(r.c(this.sjk, obj2.toString(), obj.toString(), obj3 == null ? null : obj3.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public boolean czsjb(Object obj) {
            try {
                return r.b(this.sjk, obj.toString());
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public boolean gxsj(Object obj, Object obj2, Object obj3) {
            try {
                return r.b(this.sjk, obj.toString(), obj2.toString(), obj3 == null ? null : obj3.toString());
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public boolean scsj(Object obj, Object obj2) {
            try {
                return r.b(this.sjk, obj.toString(), obj2 == null ? null : obj2.toString());
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public boolean scsjb(Object obj) {
            try {
                return r.a(this.sjk, obj.toString());
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public boolean scsjk() {
            try {
                Context context = sj.this.a.c;
                String str = this.c;
                if (this.b) {
                    return context.deleteDatabase(str);
                }
                boolean delete = new e(str).delete();
                new e(str + "-journal").delete();
                return delete;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public boolean sfsjk() {
            try {
                this.sjk.close();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public class zh {
        private Object b = null;

        public zh(Object obj) {
            this.b = obj;
        }

        public int dpzpx() {
            try {
                return s.a(sj.this.a, (float) s.d(this.b));
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        public int dpzpx(Object obj) {
            try {
                return s.a(sj.this.a, (float) s.d(obj));
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        public Class lei() {
            Object obj = this.b;
            return obj == null ? null : obj.getClass();
        }

        public int pxzdp() {
            try {
                return s.b(sj.this.a, (float) s.d(this.b));
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        public int pxzdp(Object obj) {
            try {
                return s.b(sj.this.a, (float) s.d(obj));
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        public int pxzsp() {
            try {
                return s.c(sj.this.a, (float) s.d(this.b));
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        public int pxzsp(Object obj) {
            try {
                return s.c(sj.this.a, (float) s.d(obj));
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        public int spzpx() {
            try {
                return s.d(sj.this.a, (float) s.d(this.b));
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        public int spzpx(Object obj) {
            try {
                return s.d(sj.this.a, (float) s.d(obj));
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        public Bitmap zbitmap() {
            return zbitmap(this.b, null);
        }

        public Bitmap zbitmap(Bitmap bitmap) {
            return zbitmap(this.b, bitmap);
        }

        public Bitmap zbitmap(Object obj, Bitmap bitmap) {
            try {
                if (obj instanceof Bitmap) {
                    return (Bitmap) obj;
                }
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                } else if (obj instanceof Drawable) {
                    return ((BitmapDrawable) obj).getBitmap();
                } else {
                    if (VERSION.SDK_INT >= 19 && (obj instanceof Image)) {
                        ByteBuffer buffer = ((Image) obj).getPlanes()[0].getBuffer();
                        int capacity = buffer.capacity();
                        byte[] bArr2 = new byte[capacity];
                        buffer.get(bArr2);
                        return BitmapFactory.decodeByteArray(bArr2, 0, capacity, null);
                    }
                    return bitmap;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public boolean zboolean() {
            return zboolean(false);
        }

        public boolean zboolean(Object obj, boolean z) {
            try {
                return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
            } catch (Exception e) {
                e.printStackTrace();
                return z;
            }
        }

        public boolean zboolean(boolean z) {
            try {
                Object obj = this.b;
                return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
            } catch (Exception e) {
                e.printStackTrace();
                return z;
            }
        }

        public byte zbyte() {
            return zbyte(0);
        }

        public byte zbyte(int i) {
            try {
                Object obj = this.b;
                return obj instanceof Integer ? ((Byte) obj).byteValue() : Byte.parseByte(obj.toString());
            } catch (Exception e) {
                e.printStackTrace();
                return (byte) i;
            }
        }

        public byte zbyte(Object obj, int i) {
            try {
                return obj instanceof Integer ? ((Byte) obj).byteValue() : Byte.parseByte(obj.toString());
            } catch (Exception e) {
                e.printStackTrace();
                return (byte) i;
            }
        }

        public byte[] zbytes() {
            return zbytes(this.b, null);
        }

        public byte[] zbytes(Object obj, Object obj2, byte[] bArr) {
            return o.toBytes(obj, obj2 == null ? null : obj2.toString(), bArr);
        }

        public byte[] zbytes(Object obj, byte[] bArr) {
            return zbytes(obj, null, bArr);
        }

        public byte[] zbytes(byte[] bArr) {
            return zbytes(this.b, bArr);
        }

        public double zdouble() {
            return zdouble(-1.0d);
        }

        public double zdouble(double d) {
            try {
                Object obj = this.b;
                return obj instanceof Double ? ((Double) obj).doubleValue() : s.g(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return d;
            }
        }

        public double zdouble(Object obj, double d) {
            try {
                return obj instanceof Double ? ((Double) obj).doubleValue() : s.g(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return d;
            }
        }

        public float zfloat() {
            return zfloat(-1.0f);
        }

        public float zfloat(float f) {
            try {
                Object obj = this.b;
                return obj instanceof Float ? ((Float) obj).floatValue() : s.f(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return f;
            }
        }

        public float zfloat(Object obj, float f) {
            try {
                return obj instanceof Float ? ((Float) obj).floatValue() : s.f(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return f;
            }
        }

        public int zint() {
            return zint(-1);
        }

        public int zint(int i) {
            try {
                Object obj = this.b;
                return obj instanceof Integer ? ((Integer) obj).intValue() : s.d(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return i;
            }
        }

        public int zint(Object obj, int i) {
            try {
                return obj instanceof Integer ? ((Integer) obj).intValue() : s.d(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return i;
            }
        }

        public long zlong() {
            return zlong(-1);
        }

        public long zlong(long j) {
            try {
                Object obj = this.b;
                return obj instanceof Long ? ((Long) obj).longValue() : s.e(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return j;
            }
        }

        public long zlong(Object obj, long j) {
            try {
                return obj instanceof Long ? ((Long) obj).longValue() : s.e(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return j;
            }
        }

        public String zstring() {
            return zstring(this.b, null);
        }

        public String zstring(Object obj) {
            return zstring(obj, null);
        }

        public String zstring(Object obj, Object obj2) {
            if (obj instanceof byte[]) {
                if (obj2 != null) {
                    return new String((byte[]) obj, obj2.toString());
                }
                try {
                    return new String((byte[]) obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return obj == null ? null : obj.toString();
        }

        public int zys() {
            return zys(Integer.valueOf(0));
        }

        public int zys(Object obj) {
            return s.a(this.b, ClientsUDP.a(obj));
        }

        public int zys(Object obj, Object obj2) {
            return s.a(obj, ClientsUDP.a(obj2));
        }
    }

    public sj(AppInfo appInfo) {
        this.a = appInfo;
    }

    public Bundle hqtz() {
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

    public String hqtz(Object obj) {
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

    public String hquri(Object obj) {
        Context context;
        Uri data;
        if (obj instanceof Intent) {
            context = this.a.c;
            data = ((Intent) obj).getData();
        } else if (!(obj instanceof Uri)) {
            return null;
        } else {
            context = this.a.c;
            data = (Uri) obj;
        }
        return a.a(context, data);
    }

    public Drawable hz(int i) {
        return this.a.c.getResources().getDrawable(i);
    }

    public Drawable hz(String str) {
        return this.a.c.getResources().getDrawable(this.a.getIdentifier(str, "drawable"));
    }

    public lb lb(Object obj) {
        View st = this.a.st(obj);
        return st != null ? new lb(st) : null;
    }

    public String md5(Object obj) {
        return obj == null ? null : obj instanceof File ? s.a((File) obj) : obj instanceof byte[] ? s.a((byte[]) obj) : s.f(obj.toString());
    }

    public sjk sjk(Object obj) {
        return new sjk(obj.toString());
    }

    public boolean sl(Object obj, Object obj2) {
        return obj.getClass().isInstance(obj2);
    }

    public zh zh() {
        return new zh();
    }

    public zh zh(Object obj) {
        return new zh(obj);
    }
}