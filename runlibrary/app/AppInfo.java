package i.runlibrary.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import i.app.iActivity;
import i.runlibrary.c.f;
import java.util.HashMap;

public class AppInfo {
    public HashMap _public_data_Cache = new HashMap();
    public HashMap _st_Cache = null;
    public Activity a = null;
    public AppCompatActivity aa = null;
    private Handler b = null;
    public Context c = null;
    private Resources d = null;
    private String e = null;
    private float f = -1.0f;
    private float g = -1.0f;

    public AppInfo(Activity activity, Context context) {
        this.a = activity;
        this.c = context;
        if (activity instanceof AppCompatActivity) {
            this.aa = (AppCompatActivity) activity;
        }
    }

    public AppInfo(iActivity iactivity) {
        this.a = iactivity;
        this.c = iactivity;
        if (iactivity instanceof AppCompatActivity) {
            this.aa = iactivity;
        }
    }

    public AppInfo(iActivity iactivity, Context context) {
        this.a = iactivity;
        this.c = context;
        if (iactivity instanceof AppCompatActivity) {
            this.aa = iactivity;
        }
    }

    public Handler getHandler() {
        if (this.b == null) {
            this.b = new Handler(this.c.getMainLooper());
        }
        return this.b;
    }

    public int getIdentifier(String str, String str2) {
        return getResources().getIdentifier(str, str2, getPackageName());
    }

    public String getPackageName() {
        if (this.e == null) {
            this.e = this.c.getPackageName();
        }
        return this.e;
    }

    public Resources getResources() {
        if (this.d == null) {
            this.d = this.c.getResources();
        }
        return this.d;
    }

    public float get_FONTSCALE() {
        if (this.g == -1.0f) {
            this.g = this.c.getResources().getDisplayMetrics().scaledDensity;
        }
        return this.g;
    }

    public float get_SCALE() {
        if (this.f == -1.0f) {
            this.f = this.c.getResources().getDisplayMetrics().density;
        }
        return this.f;
    }

    public View st(Object obj) {
        return f.findViewById(this, obj);
    }

    public View st(Object obj, Object obj2) {
        return f.findViewById(this, obj, obj2);
    }
}