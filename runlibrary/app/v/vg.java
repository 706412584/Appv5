package i.runlibrary.app.v;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import i.app.FileProvider;
import i.app.iActivity;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.c.a;
import i.runlibrary.c.b;
import i.runlibrary.c.f;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;

public class vg extends VC {
    public ViewEvent sj;
    public ViewGroup st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private ViewGroup b = null;

        public ViewEvent(ViewGroup viewGroup) {
            super(viewGroup);
            this.b = viewGroup;
        }
    }

    public vg() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public vg(AppInfo appInfo, ViewGroup viewGroup) {
        super(appInfo, viewGroup);
        this.st = null;
        this.sj = null;
        this.st = viewGroup;
        this.sj = new ViewEvent(viewGroup);
    }

    public void j(Object obj) {
        if (this.v != null && (this.v instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) this.v;
            View findViewById = obj instanceof VC ? ((VC) obj).v : obj instanceof 基础 ? ((基础) obj).f90 : f.findViewById(this.a, obj);
            if (findViewById != null && viewGroup.indexOfChild(findViewById) == -1) {
                LayoutParams layoutParams = findViewById.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams = b.a(viewGroup, layoutParams.width, layoutParams.height);
                    if (layoutParams != null) {
                        findViewById.setLayoutParams(layoutParams);
                    }
                }
                viewGroup.addView(findViewById);
            }
        }
    }

    public View[] jm(Object obj, Object obj2) {
        return jm(obj, obj2, Boolean.valueOf(true));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public View[] jm(Object obj, Object obj2, Object obj3) {
        Exception e;
        View[] viewArr;
        int i;
        Object obj4 = obj;
        Object obj5 = obj2;
        if (obj4 != null) {
            if (obj5 != null) {
                if (obj.getClass().isArray()) {
                    if (obj2.getClass().isArray()) {
                        int length = Array.getLength(obj);
                        if (length != 0) {
                            if (length == Array.getLength(obj2)) {
                                if (this.v != null) {
                                    if (this.v instanceof ViewGroup) {
                                        ViewGroup viewGroup;
                                        LayoutInflater from;
                                        ViewGroup viewGroup2 = (ViewGroup) this.v;
                                        try {
                                            Constructor declaredConstructor = this.v.getClass().getDeclaredConstructor(new Class[]{Context.class});
                                            declaredConstructor.setAccessible(true);
                                            viewGroup = (ViewGroup) declaredConstructor.newInstance(new Object[]{this.a.c});
                                            try {
                                                viewGroup.setLayoutParams(new LayoutParams(-2, -2));
                                            } catch (Exception e2) {
                                                e = e2;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            viewGroup = null;
                                            e.printStackTrace();
                                            from = LayoutInflater.from(this.a.c);
                                            viewArr = new View[length];
                                            i = 0;
                                            while (i < length) {
                                            }
                                            return viewArr;
                                        }
                                        from = LayoutInflater.from(this.a.c);
                                        viewArr = new View[length];
                                        i = 0;
                                        while (i < length) {
                                            Class a;
                                            Object obj6 = Array.get(obj4, i);
                                            try {
                                                a = obj6 instanceof Class ? (Class) obj6 : FileProvider.a(this.a.c, String.valueOf(obj6));
                                            } catch (Exception e4) {
                                                e4.printStackTrace();
                                                a = null;
                                            }
                                            if (a == null) {
                                                return null;
                                            }
                                            try {
                                                viewArr[i] = a.a(from, s.d(Array.get(obj5, i)), viewGroup);
                                                if (viewArr[i] == null) {
                                                    return null;
                                                }
                                                if (obj3.equals(Boolean.valueOf(true))) {
                                                    viewGroup2.addView(viewArr[i]);
                                                }
                                                iActivity a2 = a.a(this.a, a);
                                                viewArr[i].setTag(new Object[]{a2, "ivg", Integer.valueOf(i)});
                                                if (a2 != null) {
                                                    a2._$_viewAutomaticSettingEvent(this.a.a, viewArr[i]);
                                                }
                                                i++;
                                            } catch (Exception e42) {
                                                e42.printStackTrace();
                                                return null;
                                            }
                                        }
                                        return viewArr;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public boolean sc(Object obj) {
        if (this.v != null && (this.v instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) this.v;
            View findViewById = obj instanceof VC ? ((VC) obj).v : obj instanceof 基础 ? ((基础) obj).f90 : f.findViewById(this.a, obj);
            if (findViewById != null) {
                int indexOfChild = viewGroup.indexOfChild(findViewById);
                if (indexOfChild != -1) {
                    viewGroup.removeViewAt(indexOfChild);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean scqb() {
        if (this.v == null || !(this.v instanceof ViewGroup)) {
            return false;
        }
        ((ViewGroup) this.v).removeAllViews();
        return true;
    }

    public void sfxzccfqy(Object obj) {
        this.st.setClipChildren(obj.equals(Boolean.valueOf(true)));
    }

    public void shxtck(Object obj) {
        this.v.setFitsSystemWindows(obj.equals(Boolean.valueOf(true)));
    }

    public View[] zlb() {
        if (this.v == null || !(this.v instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) this.v;
        int childCount = viewGroup.getChildCount();
        View[] viewArr = new View[childCount];
        for (int i = 0; i < childCount; i++) {
            viewArr[i] = viewGroup.getChildAt(i);
        }
        return viewArr;
    }
}