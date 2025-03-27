package i.runlibrary.c;

import android.app.Activity;
import android.view.View;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.VC;
import i.runlibrary.app.v.基础;

public class f {
    public AppInfo appInfo = null;

    public f(AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    public static View findViewById(AppInfo appInfo, Object obj) {
        return obj instanceof View ? (View) obj : obj instanceof VC ? ((VC) obj).v : obj instanceof 基础 ? ((基础) obj).f90 : (!(obj instanceof Number) || appInfo.a == null) ? null : appInfo.a.findViewById(((Number) obj).intValue());
    }

    public static View findViewById(AppInfo appInfo, Object obj, Object obj2) {
        if (obj2 instanceof View) {
            return (View) obj2;
        }
        if (obj2 instanceof VC) {
            return ((VC) obj2).v;
        }
        if (obj2 instanceof 基础) {
            return ((基础) obj2).f90;
        }
        if (obj2 instanceof Number) {
            if (obj instanceof Number) {
                if (appInfo.a == null) {
                    return null;
                }
                View findViewById = appInfo.a.findViewById(((Number) obj).intValue());
                if (findViewById != null) {
                    return findViewById.findViewById(((Number) obj2).intValue());
                }
            } else if (obj instanceof Activity) {
                return ((Activity) obj).findViewById(((Number) obj2).intValue());
            } else {
                if (obj instanceof View) {
                    return ((View) obj).findViewById(((Number) obj2).intValue());
                }
                if (obj instanceof VC) {
                    return ((VC) obj).v.findViewById(((Number) obj2).intValue());
                }
                if (obj instanceof 基础) {
                    return ((基础) obj).f90.findViewById(((Number) obj2).intValue());
                }
            }
        }
        return null;
    }

    public View findViewById(Object obj) {
        return findViewById(this.appInfo, obj);
    }

    public View findViewById(Object obj, Object obj2) {
        return findViewById(this.appInfo, obj, obj2);
    }
}