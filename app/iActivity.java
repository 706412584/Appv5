package i.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import i.runlibrary.a.d;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.gj;
import i.runlibrary.app.iapp;
import i.runlibrary.app.interfaces.onWebChromeClient;
import i.runlibrary.app.sj;
import i.runlibrary.app.st;
import i.runlibrary.app.wj;
import i.runlibrary.app.wl;
import i.runlibrary.app.xt;
import i.runlibrary.app.zf;
import i.runlibrary.app.字符;
import i.runlibrary.app.工具;
import i.runlibrary.app.数据;
import i.runlibrary.app.文件;
import i.runlibrary.app.系统;
import i.runlibrary.app.网络;
import i.runlibrary.app.视图;
import i.runlibrary.b.e;
import i.runlibrary.b.h;
import i.runlibrary.b.m;
import java.io.File;
import java.util.ArrayList;

public class iActivity extends AppCompatActivity {
    public static boolean isPermissions;
    public static ValueCallback mUploadMessage2;
    public final AppInfo _APPINFO;
    public CustomViewCallback customViewCallback;
    public FrameLayout fullscreenContainer;
    public final gj gj;
    public final iapp iapp;
    public int originalSystemUiVisibility;
    public final sj sj;
    public final st st;
    public final wj wj;
    public final wl wl;
    public final xt xt;
    public final zf zf;
    /* renamed from: 字符 */
    public final 字符 f31;
    /* renamed from: 工具 */
    public final 工具 f32;
    /* renamed from: 数据 */
    public final 数据 f33;
    /* renamed from: 文件 */
    public final 文件 f34;
    /* renamed from: 系统 */
    public final 系统 f35;
    /* renamed from: 网络 */
    public final 网络 f36;
    /* renamed from: 视图 */
    public final 视图 f37;

    public iActivity() {
        AppInfo appInfo = new AppInfo(this);
        this._APPINFO = appInfo;
        iapp iapp = new iapp();
        this.iapp = iapp;
        st iclass = new iClass(appInfo);
        iapp.st = iclass;
        this.st = iclass;
        sj iclass2 = new iClass(appInfo);
        iapp.sj = iclass2;
        this.sj = iclass2;
        wj iclass3 = new iClass(appInfo);
        iapp.wj = iclass3;
        this.wj = iclass3;
        gj iclass4 = new iClass(appInfo);
        iapp.gj = iclass4;
        this.gj = iclass4;
        wl iclass5 = new iClass(appInfo);
        iapp.wl = iclass5;
        this.wl = iclass5;
        zf iclass6 = new iClass(appInfo);
        iapp.zf = iclass6;
        this.zf = iclass6;
        xt iclass7 = new iClass(appInfo);
        iapp.xt = iclass7;
        this.xt = iclass7;
        视图 iclass8 = new iClass(appInfo);
        iapp.f47 = iclass8;
        this.f37 = iclass8;
        数据 iclass9 = new iClass(appInfo);
        iapp.f43 = iclass9;
        this.f33 = iclass9;
        文件 iclass10 = new iClass(appInfo);
        iapp.f44 = iclass10;
        this.f34 = iclass10;
        工具 iclass11 = new iClass(appInfo);
        iapp.f42 = iclass11;
        this.f32 = iclass11;
        网络 iclass12 = new iClass(appInfo);
        iapp.f46 = iclass12;
        this.f36 = iclass12;
        字符 iclass13 = new iClass(appInfo);
        iapp.f41 = iclass13;
        this.f31 = iclass13;
        系统 iclass14 = new iClass(appInfo);
        iapp.f45 = iclass14;
        this.f35 = iclass14;
    }

    public void _$_viewAutomaticSettingEvent(Activity activity, View view) {
        __layoutIsLoaded(activity, view);
    }

    public void __layoutIsLoaded(Activity activity, View view) {
    }

    public View findViewById(Activity activity, View view, int i) {
        return view == null ? activity == null ? null : activity.findViewById(i) : view.findViewById(i);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == onWebChromeClient.RequestCode) {
            try {
                if (mUploadMessage2 != null) {
                    if (VERSION.SDK_INT >= 21) {
                        mUploadMessage2.onReceiveValue(FileChooserParams.parseResult(i2, intent));
                    } else {
                        Uri data;
                        if (intent != null) {
                            if (i2 == -1) {
                                data = intent.getData();
                                mUploadMessage2.onReceiveValue(new Uri[]{data});
                            }
                        }
                        data = null;
                        mUploadMessage2.onReceiveValue(new Uri[]{data});
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            mUploadMessage2 = null;
        }
    }

    protected void onCreate(Bundle bundle) {
        String str = "android.intent.extra.STREAM";
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 23) {
            try {
                ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                    bundle = applicationInfo.metaData;
                    String str2 = "shi";
                    if (VERSION.SDK_INT >= 30) {
                        String str3 = "i_app_debugRun";
                        if (str2.equals(bundle.getString(str3))) {
                            Intent intent = getIntent();
                            int i = 0;
                            if (intent != null) {
                                if (intent.hasExtra(str3)) {
                                    if (intent.hasExtra(str)) {
                                        str3 = String.format("%s/tempFile/i", new Object[]{getFilesDir().getAbsoluteFile()});
                                        File eVar = new e(String.format("%s/i.run", new Object[]{str3}));
                                        if (!eVar.exists()) {
                                            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(str);
                                            if (parcelableArrayListExtra != null) {
                                                if (parcelableArrayListExtra.size() != 0) {
                                                    String[] stringArrayExtra = intent.getStringArrayExtra("names");
                                                    if (stringArrayExtra != null) {
                                                        for (int i2 = 0; i2 < stringArrayExtra.length; i2++) {
                                                            e.a(this, (Uri) parcelableArrayListExtra.get(i2), new e(String.format("%s%s", new Object[]{str3, stringArrayExtra[i2]})));
                                                        }
                                                    }
                                                    d.a(eVar.getPath(), "1", "utf-8");
                                                }
                                            }
                                        }
                                        i = m.b((Activity) this);
                                    }
                                }
                            }
                            if (i != 0) {
                                return;
                            }
                        }
                    }
                    if (str2.equals(bundle.getString("i_app_autoPermission")) && !isPermissions) {
                        isPermissions = true;
                        try {
                            h.a((Activity) this, getPackageManager().getPackageInfo(getPackageName(), 4096).requestedPermissions);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void onHideCustomViewX() {
        FrameLayout frameLayout = this.fullscreenContainer;
        if (frameLayout != null) {
            Context context = frameLayout.getContext();
            ((ViewGroup) this.fullscreenContainer.getParent()).removeView(this.fullscreenContainer);
            if (context instanceof Activity) {
                ((Activity) context).getWindow().getDecorView().setSystemUiVisibility(this.originalSystemUiVisibility);
            }
            this.fullscreenContainer.removeAllViews();
            this.fullscreenContainer = null;
            CustomViewCallback customViewCallback = this.customViewCallback;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || this.fullscreenContainer == null) {
            return false;
        }
        onHideCustomViewX();
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 60542 && strArr != null) {
            int length = iArr.length;
            if (length == strArr.length) {
                Object obj = 1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (iArr[i2] == -1) {
                        for (String equals : h.a) {
                            if (equals.equals(strArr[i2])) {
                                obj = null;
                                break;
                            }
                        }
                        if (obj == null) {
                            break;
                        }
                    }
                }
            }
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        d.b((Context) this);
    }

    public void onShowCustomViewX(Activity activity, View view, CustomViewCallback customViewCallback) {
        if (this.fullscreenContainer != null) {
            customViewCallback.onCustomViewHidden();
            this.fullscreenContainer = null;
            return;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.fullscreenContainer = frameLayout;
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        this.fullscreenContainer.setBackgroundColor(-16777216);
        Window window = activity.getWindow();
        this.originalSystemUiVisibility = window.getDecorView().getSystemUiVisibility();
        window.addContentView(this.fullscreenContainer, new LayoutParams(-1, -1));
        window.getDecorView().setSystemUiVisibility(5894);
        this.fullscreenContainer.addView(view);
        this.customViewCallback = customViewCallback;
    }
}