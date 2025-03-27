package i.runlibrary.app.v;

import android.view.View;
import fr.castorflex.android.verticalviewpager.VerticalViewPager;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.c.d;

public final class 垂直滑动窗体 extends 视图组 {
    private View[] b;
    private 页面 c;
    /* renamed from: 事件 */
    public 视图事件 f95;
    /* renamed from: 视图 */
    public VerticalViewPager f96;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public class 页面 {
        private d b;

        public 页面(d dVar) {
            this.b = dVar;
        }

        /* renamed from: 修改标题 */
        public void m599(Object obj, Object obj2) {
            try {
                this.b.a(s.d(obj), obj2.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: 删除 */
        public boolean m146(Object obj) {
            try {
                this.b.a(s.d(obj));
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }

        /* renamed from: 加 */
        public void m600(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            try {
                this.b.a(s.d(obj), obj2.toString(), obj3 instanceof Class ? ((Class) obj3).getName() : obj3.toString(), s.d(obj4), obj5, obj6);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: 释放 */
        public void m601() {
            try {
                this.b.b();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: 页面数量 */
        public int m602() {
            try {
                return this.b.a();
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }
    }

    public 垂直滑动窗体() {
        this.f96 = null;
        this.f95 = null;
        this.b = null;
        this.c = null;
        this.f95 = new 视图事件(null);
    }

    public 垂直滑动窗体(AppInfo appInfo, VerticalViewPager verticalViewPager) {
        super(appInfo, verticalViewPager);
        this.f96 = null;
        this.f95 = null;
        this.b = null;
        this.c = null;
        this.f96 = verticalViewPager;
        this.f95 = new 视图事件(verticalViewPager);
    }

    /* renamed from: 展示界面 */
    public final int m592() {
        VerticalViewPager verticalViewPager = this.f96;
        return verticalViewPager == null ? -1 : verticalViewPager.getCurrentItem();
    }

    /* renamed from: 展示界面 */
    public final void m593(Object obj) {
        VerticalViewPager verticalViewPager = this.f96;
        if (verticalViewPager != null) {
            verticalViewPager.setCurrentItem(s.d(obj));
        }
    }

    /* renamed from: 界面 */
    public final void m594(View[] viewArr) {
        this.b = viewArr;
        this.f96.setAdapter(new k(this));
        this.f96.setOffscreenPageLimit(this.b.length);
    }

    /* renamed from: 界面 */
    public final View[] m595(Object obj, Object obj2) {
        View[] 界面 = m715(obj, obj2, Boolean.valueOf(false));
        this.b = 界面;
        m594(界面);
        return this.b;
    }

    /* renamed from: 缓存界面数量 */
    public final int m596() {
        VerticalViewPager verticalViewPager = this.f96;
        return verticalViewPager == null ? -1 : verticalViewPager.getOffscreenPageLimit();
    }

    /* renamed from: 缓存界面数量 */
    public final void m597(Object obj) {
        VerticalViewPager verticalViewPager = this.f96;
        if (verticalViewPager != null) {
            verticalViewPager.setOffscreenPageLimit(s.d(obj));
        }
    }

    /* renamed from: 页面 */
    public final 页面 m598() {
        if (this.c == null) {
            d dVar = new d(this.a.aa.getSupportFragmentManager(), this.a, this.f96);
            this.f96.setAdapter(dVar);
            this.f96.setOffscreenPageLimit(5);
            this.c = new 页面(dVar);
        }
        return this.c;
    }
}