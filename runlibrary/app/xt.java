package i.runlibrary.app;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.hardware.SensorEventListener;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import i.app.FileProvider;
import i.runlibrary.a.a;
import i.runlibrary.a.s;
import i.runlibrary.b.d;
import i.runlibrary.b.h;
import i.runlibrary.b.k;
import i.runlibrary.b.m;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

public class xt {
    private AppInfo a = null;
    private pm b = null;
    private sbxx c = null;
    private gn d = null;

    public class gn extends d {
        public gn() {
            super(xt.this.a);
        }

        public boolean cgq(Object obj, Object obj2, SensorEventListener sensorEventListener) {
            return super.cgq(obj, obj2, sensorEventListener);
        }

        public void cgqsf() {
            super.cgqsf();
        }

        public boolean jp(Object obj, Object obj2) {
            try {
                return super.jp(obj, obj2);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public void lpm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            super.lpm(obj, obj2, obj3, obj4, obj5);
        }

        public boolean lpmhd(int i, int i2, Intent intent) {
            return super.lpmhd(i, i2, intent);
        }

        public void lpmks() {
            super.lpmks();
        }

        public void lpmsf() {
            super.lpmsf();
        }

        public void lpmtz() {
            super.lpmtz();
        }

        public boolean ly(Object obj) {
            try {
                return super.ly(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public boolean lytz() {
            try {
                return super.lytz();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public boolean psxp(Object obj) {
            try {
                return super.psxp(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public boolean sgd() {
            return super.sgd();
        }

        public boolean sgdtz() {
            return super.sgdtz();
        }

        public void spps() {
            super.spps();
        }

        public void xcxz() {
            super.xcxz();
        }

        public void xcxz(Object obj) {
            super.xcxz(obj);
        }

        public Bitmap xtjp() {
            try {
                return super.xtjp();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public Bitmap xtjp(Object obj) {
            try {
                return super.xtjp(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public Bitmap xtjp(Object obj, Object obj2) {
            try {
                return super.xtjp(obj, FileProvider.a(xt.this.a.c, obj2.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public Bitmap xtjp(Object obj, Object obj2, Object obj3) {
            try {
                return super.xtjp(obj, FileProvider.a(xt.this.a.c, obj2.toString()), obj3);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public boolean xtjpcsh() {
            try {
                return super.xtjpcsh();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public k xtjphd(int i, int i2, Intent intent) {
            if (i == m.a[4] && i2 == -1 && intent != null) {
                try {
                    return super.xtjphd(xt.this.a.c, i2, intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        public void xtjpsf() {
            try {
                this.screenShotHelper.b();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public boolean zd() {
            return super.zd();
        }

        public boolean zd(Object obj) {
            return super.zd(obj);
        }

        public boolean zd(Object obj, Object obj2) {
            return super.zd(obj, obj2);
        }

        public void zdtz() {
            super.zdtz();
        }

        public boolean zzlpm() {
            return super.zzlpm();
        }
    }

    public class pm {
        public int g = -1;
        public int k = -1;
        public int xnaj = -1;
        public int ztl = -1;

        public void hsp(Object obj) {
            a.c(xt.this.a.a, obj);
        }

        public void ld(Object obj) {
            a.d(xt.this.a.a, obj);
        }

        public void xnaj(Object obj) {
            a.b(xt.this.a.a, obj);
        }

        public void ztl(Object obj) {
            a.a(xt.this.a.a, obj);
        }

        public void ztl(Object obj, Object obj2) {
            a.a(xt.this.a.a, obj, obj2);
        }
    }

    public class qxgl {
        public int qqqx() {
            try {
                return h.a(xt.this.a.a, xt.this.a.a.getPackageManager().getPackageInfo(xt.this.a.a.getPackageName(), 4096).requestedPermissions);
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }

        public int qqqx(Object obj) {
            return obj == null ? 0 : obj.getClass().isArray() ? h.a(xt.this.a.a, s.b(obj)) : h.a(xt.this.a.a, obj.toString());
        }

        public boolean qx(Object obj) {
            return obj == null ? false : h.a(xt.this.a.a, xt.this.a.c, obj.toString());
        }
    }

    public class sbxx {
        private String[] b = m.a();
        public String bb = VERSION.RELEASE;
        public String pp = Build.BRAND;
        public int sdk = VERSION.SDK_INT;
        public String xh = Build.MODEL;

        public String cpulx() {
            String str = VERSION.SDK_INT < 21 ? Build.CPU_ABI : Build.SUPPORTED_32_BIT_ABIS[0];
            String str2 = "arm";
            if (str.startsWith(str2)) {
                return str2;
            }
            str2 = "x86";
            return str.startsWith(str2) ? str2 : null;
        }

        public String cpupl() {
            return this.b[1];
        }

        public String cpuxh() {
            return this.b[0];
        }

        public String id() {
            return m.f(xt.this.a.c);
        }

        public String imei() {
            return m.d(xt.this.a.c);
        }

        public String imsi() {
            return m.e(xt.this.a.c);
        }
    }

    public class yylb {
        public String bb;
        public int bbh;
        public String bm;
        public String bt;
        public PackageInfo bxx;
        public Drawable tb;
    }

    public xt(AppInfo appInfo) {
        this.a = appInfo;
    }

    public void bddh(Object obj) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.DIAL");
        intent.setData(Uri.parse(new e("tel:").append(obj).toString()));
        this.a.c.startActivity(intent);
    }

    public void dkyy(Object obj) {
        FileProvider.a(this.a.c, (String) obj);
    }

    public void dkyy(Object obj, Object obj2) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName((String) obj, (String) obj2));
        this.a.c.startActivity(intent);
    }

    public void fsdx(Object obj, Object obj2) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(new e("smsto:").append(obj).toString()));
        intent.putExtra("sms_body", obj2.toString());
        this.a.c.startActivity(intent);
    }

    public gn gn() {
        if (this.d == null) {
            this.d = new gn();
        }
        return this.d;
    }

    public String jqbhq() {
        return m.c(this.a.c);
    }

    public void jqbxr(Object obj) {
        m.a(obj == null ? "" : obj.toString(), this.a.c);
    }

    public pm pm() {
        if (this.b == null) {
            this.b = new gn();
            m.a(this.a.c, this.b);
            this.b.ztl = i.runlibrary.a.d.a(this.a.c);
            this.b.xnaj = i.runlibrary.a.d.b(this.a.c);
        }
        return this.b;
    }

    public qxgl qxgl() {
        return new gn();
    }

    public void sbxm(Object obj) {
        if (obj.equals(Boolean.valueOf(true))) {
            this.a.a.getWindow().clearFlags(128);
        } else {
            this.a.a.getWindow().setFlags(128, 128);
        }
    }

    public sbxx sbxx() {
        if (this.c == null) {
            this.c = new gn();
        }
        return this.c;
    }

    public String sj(Object obj) {
        if (obj instanceof Number) {
            return m.a(((Number) obj).intValue());
        }
        Calendar.getInstance().setTimeInMillis(new Date().getTime());
        Formatter formatter = new Formatter(Locale.CHINA);
        String obj2 = obj.toString();
        if (obj2.length() == 1) {
            return formatter.format(new e("%1$t").append(obj2).toString(), new Object[]{r0}).toString();
        }
        return formatter.format(obj2, new Object[]{r0}).toString();
    }

    public void xzyy(Object obj) {
        this.a.c.startActivity(new Intent("android.intent.action.DELETE", Uri.parse(new e("package:").append(obj).toString())));
    }

    public void ycxnjp() {
        m.a(this.a.a);
    }

    public yylb[] yylb(boolean z) {
        ArrayList arrayList = new ArrayList();
        List<PackageInfo> installedPackages = this.a.c.getPackageManager().getInstalledPackages(0);
        PackageManager packageManager = this.a.c.getPackageManager();
        for (PackageInfo packageInfo : installedPackages) {
            yylb gnVar;
            if (z) {
                gnVar = new gn();
            } else if ((packageInfo.applicationInfo.flags & 1) == 0) {
                gnVar = new gn();
            }
            gnVar.bm = packageInfo.packageName;
            gnVar.tb = packageInfo.applicationInfo.loadIcon(packageManager);
            gnVar.bt = packageInfo.applicationInfo.loadLabel(packageManager).toString();
            gnVar.bb = packageInfo.versionName;
            gnVar.bbh = packageInfo.versionCode;
            gnVar.bxx = packageInfo;
            arrayList.add(gnVar);
        }
        return (yylb[]) arrayList.toArray(new yylb[arrayList.size()]);
    }
}