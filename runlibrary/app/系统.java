package i.runlibrary.app;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.hardware.SensorEventListener;
import android.os.Build;
import android.os.Build.VERSION;
import i.app.FileProvider;
import i.app.iClass;
import i.runlibrary.a.a;
import i.runlibrary.a.s;
import i.runlibrary.b.d;
import i.runlibrary.b.h;
import i.runlibrary.b.k;
import i.runlibrary.b.m;
import java.util.ArrayList;
import java.util.List;

public class 系统 extends xt {
    private AppInfo a = null;
    private 屏幕 b = null;
    private 设备信息 c = null;
    private 功能 d = null;

    public class 功能 {
        private d b;

        public 功能() {
            this.b = new iClass(系统.this.a);
        }

        /* renamed from: 传感器 */
        public boolean m102(Object obj, Object obj2, SensorEventListener sensorEventListener) {
            return this.b.cgq(obj, obj2, sensorEventListener);
        }

        /* renamed from: 传感器释放 */
        public void m103() {
            this.b.cgqsf();
        }

        /* renamed from: 录屏幕 */
        public void m104(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            this.b.lpm(obj, obj2, obj3, obj4, obj5);
        }

        /* renamed from: 录屏幕停止 */
        public void m105() {
            this.b.lpmtz();
        }

        /* renamed from: 录屏幕回调 */
        public boolean m106(int i, int i2, Intent intent) {
            return this.b.lpmhd(i, i2, intent);
        }

        /* renamed from: 录屏幕开始 */
        public void m107() {
            this.b.lpmks();
        }

        /* renamed from: 录屏幕释放 */
        public void m108() {
            this.b.lpmsf();
        }

        /* renamed from: 录音 */
        public boolean m109(Object obj) {
            try {
                return this.b.ly(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: 录音停止 */
        public boolean m110() {
            try {
                return this.b.lytz();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: 截屏 */
        public boolean m111(Object obj, Object obj2) {
            try {
                return this.b.jp(obj, obj2);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: 拍摄相片 */
        public boolean m112(Object obj) {
            try {
                return this.b.psxp(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: 振动 */
        public boolean m113(Object obj) {
            return this.b.zd(obj);
        }

        /* renamed from: 振动 */
        public boolean m114(Object obj, Object obj2) {
            return this.b.zd(obj, obj2);
        }

        /* renamed from: 振动停止 */
        public void m115() {
            this.b.zdtz();
        }

        /* renamed from: 振动状态 */
        public boolean m116() {
            return this.b.zd();
        }

        /* renamed from: 正在录屏幕 */
        public boolean m117() {
            return this.b.zzlpm();
        }

        /* renamed from: 相册选择 */
        public void m118() {
            this.b.xcxz();
        }

        /* renamed from: 相册选择 */
        public void m119(Object obj) {
            this.b.xcxz(obj);
        }

        /* renamed from: 系统截屏 */
        public Bitmap m120() {
            try {
                return this.b.xtjp();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: 系统截屏 */
        public Bitmap m121(Object obj) {
            try {
                return this.b.xtjp(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: 系统截屏 */
        public Bitmap m122(Object obj, Object obj2) {
            try {
                return this.b.xtjp(obj, FileProvider.a(系统.this.a.c, obj2.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: 系统截屏 */
        public Bitmap m123(Object obj, Object obj2, Object obj3) {
            try {
                return this.b.xtjp(obj, FileProvider.a(系统.this.a.c, obj2.toString()), obj3);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: 系统截屏初始化 */
        public boolean m124() {
            try {
                return this.b.xtjpcsh();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: 系统截屏回调 */
        public k m125(int i, int i2, Intent intent) {
            if (i == m.a[4] && i2 == -1 && intent != null) {
                try {
                    return this.b.xtjphd(系统.this.a.c, i2, intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        /* renamed from: 系统截屏释放 */
        public void m126() {
            try {
                this.b.screenShotHelper.b();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: 视频拍摄 */
        public void m127() {
            this.b.spps();
        }

        /* renamed from: 闪光灯 */
        public boolean m128() {
            return this.b.sgd();
        }

        /* renamed from: 闪光灯停止 */
        public boolean m129() {
            return this.b.sgdtz();
        }
    }

    public class 屏幕 {
        /* renamed from: 宽 */
        public int f48 = -1;
        /* renamed from: 状态栏 */
        public int f49 = -1;
        /* renamed from: 虚拟按键 */
        public int f50 = -1;
        /* renamed from: 高 */
        public int f51 = -1;

        /* renamed from: 亮度 */
        public void m130(Object obj) {
            a.d(系统.this.a.a, obj);
        }

        /* renamed from: 横竖屏 */
        public void m131(Object obj) {
            a.c(系统.this.a.a, obj);
        }

        /* renamed from: 状态栏 */
        public void m132(Object obj) {
            a.a(系统.this.a.a, obj);
        }

        /* renamed from: 状态栏 */
        public void m133(Object obj, Object obj2) {
            a.a(系统.this.a.a, obj, obj2);
        }

        /* renamed from: 虚拟按键 */
        public void m134(Object obj) {
            a.b(系统.this.a.a, obj);
        }
    }

    public class 应用列表 {
        /* renamed from: 包信息 */
        public PackageInfo f52;
        /* renamed from: 包名 */
        public String f53;
        /* renamed from: 图标 */
        public Drawable f54;
        /* renamed from: 标题 */
        public String f55;
        /* renamed from: 版本 */
        public String f56;
        /* renamed from: 版本号 */
        public int f57;
    }

    public class 权限管理 {
        /* renamed from: 权限 */
        public boolean m135(Object obj) {
            return obj == null ? false : h.a(系统.this.a.a, 系统.this.a.c, obj.toString());
        }

        /* renamed from: 请求权限 */
        public int m136() {
            try {
                return h.a(系统.this.a.a, 系统.this.a.a.getPackageManager().getPackageInfo(系统.this.a.a.getPackageName(), 4096).requestedPermissions);
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }

        /* renamed from: 请求权限 */
        public int m137(Object obj) {
            return obj == null ? 0 : obj.getClass().isArray() ? h.a(系统.this.a.a, s.b(obj)) : h.a(系统.this.a.a, obj.toString());
        }
    }

    public class 设备信息 {
        private String[] b = m.a();
        public int sdk = VERSION.SDK_INT;
        /* renamed from: 品牌 */
        public String f58 = Build.BRAND;
        /* renamed from: 型号 */
        public String f59 = Build.MODEL;
        /* renamed from: 版本 */
        public String f60 = VERSION.RELEASE;

        /* renamed from: cpu型号 */
        public String m138cpu() {
            return this.b[0];
        }

        /* renamed from: cpu类型 */
        public String m139cpu() {
            String str = VERSION.SDK_INT < 21 ? Build.CPU_ABI : Build.SUPPORTED_32_BIT_ABIS[0];
            String str2 = "arm";
            if (str.startsWith(str2)) {
                return str2;
            }
            str2 = "x86";
            return str.startsWith(str2) ? str2 : null;
        }

        /* renamed from: cpu频率 */
        public String m140cpu() {
            return this.b[1];
        }

        public String id() {
            return m.f(系统.this.a.c);
        }

        public String imei() {
            return m.d(系统.this.a.c);
        }

        public String imsi() {
            return m.e(系统.this.a.c);
        }
    }

    public 系统(AppInfo appInfo) {
        super(appInfo);
        this.a = appInfo;
    }

    /* renamed from: 剪切板写入 */
    public void m87(Object obj) {
        super.jqbxr(obj);
    }

    /* renamed from: 剪切板获取 */
    public String m88() {
        return super.jqbhq();
    }

    /* renamed from: 功能 */
    public 功能 m89() {
        if (this.d == null) {
            this.d = new 功能();
        }
        return this.d;
    }

    /* renamed from: 卸载应用 */
    public void m90(Object obj) {
        super.xzyy(obj);
    }

    /* renamed from: 发送短信 */
    public void m91(Object obj, Object obj2) {
        super.fsdx(obj, obj2);
    }

    /* renamed from: 屏幕 */
    public 屏幕 m92() {
        if (this.b == null) {
            this.b = new 屏幕();
            m.a(this.a.c, this.b);
            this.b.f49 = i.runlibrary.a.d.a(this.a.c);
            this.b.f50 = i.runlibrary.a.d.b(this.a.c);
        }
        return this.b;
    }

    /* renamed from: 应用列表 */
    public 应用列表[] m93(boolean z) {
        ArrayList arrayList = new ArrayList();
        List<PackageInfo> installedPackages = this.a.c.getPackageManager().getInstalledPackages(0);
        PackageManager packageManager = this.a.c.getPackageManager();
        for (PackageInfo packageInfo : installedPackages) {
            应用列表 应用列表;
            if (z) {
                应用列表 = new 应用列表();
            } else if ((packageInfo.applicationInfo.flags & 1) == 0) {
                应用列表 = new 应用列表();
            }
            应用列表.f53 = packageInfo.packageName;
            应用列表.f54 = packageInfo.applicationInfo.loadIcon(packageManager);
            应用列表.f55 = packageInfo.applicationInfo.loadLabel(packageManager).toString();
            应用列表.f56 = packageInfo.versionName;
            应用列表.f57 = packageInfo.versionCode;
            应用列表.f52 = packageInfo;
            arrayList.add(应用列表);
        }
        return (应用列表[]) arrayList.toArray(new 应用列表[arrayList.size()]);
    }

    /* renamed from: 打开应用 */
    public void m94(Object obj) {
        super.dkyy(obj);
    }

    /* renamed from: 打开应用 */
    public void m95(Object obj, Object obj2) {
        super.dkyy(obj, obj2);
    }

    /* renamed from: 拨打电话 */
    public void m96(Object obj) {
        super.bddh(obj);
    }

    /* renamed from: 时间 */
    public String m97(Object obj) {
        return super.sj(obj);
    }

    /* renamed from: 权限管理 */
    public 权限管理 m98() {
        return new 权限管理();
    }

    /* renamed from: 设备休眠 */
    public void m99(Object obj) {
        super.sbxm(obj);
    }

    /* renamed from: 设备信息 */
    public 设备信息 m100() {
        if (this.c == null) {
            this.c = new 设备信息();
        }
        return this.c;
    }

    /* renamed from: 隐藏虚拟键盘 */
    public void m101() {
        super.ycxnjp();
    }
}