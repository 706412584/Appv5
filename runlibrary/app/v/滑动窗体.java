package i.runlibrary.app.v;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.c.d;

public final class 滑动窗体 extends 视图组 {
    private View[] b;
    private 页面 c;
    /* renamed from: 事件 */
    public 视图事件 f99;
    /* renamed from: 视图 */
    public ViewPager f100;

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
        public void m643(Object obj, Object obj2) {
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
        public void m644(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            try {
                this.b.a(s.d(obj), obj2.toString(), obj3 instanceof Class ? ((Class) obj3).getName() : obj3.toString(), s.d(obj4), obj5, obj6);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: 释放 */
        public void m645() {
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

    public 滑动窗体() {
        this.f100 = null;
        this.f99 = null;
        this.b = null;
        this.c = null;
        this.f99 = new 视图事件(null);
    }

    public 滑动窗体(AppInfo appInfo, ViewPager viewPager) {
        super(appInfo, viewPager);
        this.f100 = null;
        this.f99 = null;
        this.b = null;
        this.c = null;
        this.f100 = viewPager;
        this.f99 = new 视图事件(viewPager);
    }

    /* renamed from: 展示界面 */
    public final int m638() {
        ViewPager viewPager = this.f100;
        return viewPager == null ? -1 : viewPager.getCurrentItem();
    }

    /* renamed from: 展示界面 */
    public final void m639(Object obj) {
        ViewPager viewPager = this.f100;
        if (viewPager != null) {
            viewPager.setCurrentItem(s.d(obj));
        }
    }

    /* renamed from: 界面 */
    public final void m594(View[] viewArr) {
        this.b = viewArr;
        this.f100.setAdapter(new n(this));
        this.f100.setOffscreenPageLimit(this.b.length);
    }

    /* renamed from: 界面 */
    public final View[] m640(Object obj, Object obj2) {
        View[] 界面 = m715(obj, obj2, Boolean.valueOf(false));
        this.b = 界面;
        m594(界面);
        return this.b;
    }

    /* renamed from: 绑定标签布局 */
    public final boolean m641(Object obj, Object obj2) {
        View st = this.a.st(obj);
        if (st == null || !(st instanceof TabLayout)) {
            return false;
        }
        ((TabLayout) st).setupWithViewPager(this.f100, obj2.equals(Boolean.valueOf(true)));
        return true;
    }

    /* renamed from: 缓存界面数量 */
    public final int m596() {
        ViewPager viewPager = this.f100;
        return viewPager == null ? -1 : viewPager.getOffscreenPageLimit();
    }

    /* renamed from: 缓存界面数量 */
    public final void m597(Object obj) {
        ViewPager viewPager = this.f100;
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(s.d(obj));
        }
    }

    /* renamed from: 页面 */
    public final 页面 m642() {
        if (this.c == null) {
            d dVar = new d(this.a.aa.getSupportFragmentManager(), this.a, this.f100);
            this.f100.setAdapter(dVar);
            this.f100.setOffscreenPageLimit(5);
            this.c = new 页面(dVar);
        }
        return this.c;
    }
}