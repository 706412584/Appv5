package i.app;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import i.runlibrary.a.d;
import i.runlibrary.b.c;
import i.runlibrary.b.f;
import i.runlibrary.b.n;

public class applicationMain extends Application {
    public static void Create(Application application) {
        String str = "shi";
        try {
            ApplicationInfo applicationInfo = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                Bundle bundle = applicationInfo.metaData;
                if (str.equals(bundle.getString("i_app_debugRun"))) {
                    new n().a(application);
                } else if (str.equals(bundle.getString("i_app_multiDex")) && VERSION.SDK_INT < 21) {
                    n nVar = new n();
                    d.a((Context) application);
                }
                if (str.equals(bundle.getString("i_app_logOutput"))) {
                    f fVar = new f(application);
                }
                if (str.equals(bundle.getString("i_app_errLogOutput"))) {
                    c.a().a((Context) application);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean onCreate() {
        Create(this);
        super.onCreate();
        return;
    }
}