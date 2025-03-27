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

public class 视图组 extends 基础 {
    /* renamed from: 事件 */
    public 视图事件 f122;
    /* renamed from: 视图 */
    public ViewGroup f123;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private ViewGroup b = null;

        public 视图事件(ViewGroup viewGroup) {
            super(viewGroup);
            this.b = viewGroup;
        }
    }

    public 视图组() {
        this.f123 = null;
        this.f122 = null;
        this.f122 = new 视图事件(null);
    }

    public 视图组(AppInfo appInfo, ViewGroup viewGroup) {
        super(appInfo, viewGroup);
        this.f123 = null;
        this.f122 = null;
        this.f123 = viewGroup;
        this.f122 = new 视图事件(viewGroup);
    }

    /* renamed from: 删除 */
    public boolean m146(Object obj) {
        ViewGroup viewGroup = this.f123;
        if (viewGroup != null) {
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

    /* renamed from: 删除全部 */
    public boolean m711() {
        ViewGroup viewGroup = this.f123;
        if (viewGroup == null) {
            return false;
        }
        viewGroup.removeAllViews();
        return true;
    }

    /* renamed from: 加 */
    public void m486(Object obj) {
        ViewGroup viewGroup = this.f123;
        if (viewGroup != null) {
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

    /* renamed from: 子列表 */
    public View[] m712() {
        ViewGroup viewGroup = this.f123;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        View[] viewArr = new View[childCount];
        for (int i = 0; i < childCount; i++) {
            viewArr[i] = viewGroup.getChildAt(i);
        }
        return viewArr;
    }

    /* renamed from: 是否限制超出父区域 */
    public void m713(Object obj) {
        this.f123.setClipChildren(obj.equals(Boolean.valueOf(true)));
    }

    /* renamed from: 界面 */
    public View[] m714(Object obj, Object obj2) {
        return m715(obj, obj2, Boolean.valueOf(true));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: 界面 */
    public View[] m715(Object obj, Object obj2, Object obj3) {
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
                                ViewGroup viewGroup = this.f123;
                                if (viewGroup == null) {
                                    return null;
                                }
                                ViewGroup viewGroup2;
                                LayoutInflater from;
                                try {
                                    Constructor declaredConstructor = viewGroup.getClass().getDeclaredConstructor(new Class[]{Context.class});
                                    declaredConstructor.setAccessible(true);
                                    viewGroup2 = (ViewGroup) declaredConstructor.newInstance(new Object[]{this.a.c});
                                    try {
                                        viewGroup2.setLayoutParams(new LayoutParams(-2, -2));
                                    } catch (Exception e2) {
                                        e = e2;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    viewGroup2 = null;
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
                                        viewArr[i] = a.a(from, s.d(Array.get(obj5, i)), viewGroup2);
                                        if (viewArr[i] == null) {
                                            return null;
                                        }
                                        if (obj3.equals(Boolean.valueOf(true))) {
                                            viewGroup.addView(viewArr[i]);
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
        return null;
    }

    /* renamed from: 适合系统窗口 */
    public void m716(Object obj) {
        this.f123.setFitsSystemWindows(obj.equals(Boolean.valueOf(true)));
    }
}