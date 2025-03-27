package i.runlibrary.app.v;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.c.d;

public final class hdct extends vg {
    private View[] b;
    private ym c;
    public ViewEvent sj;
    public ViewPager st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public class ym {
        private d b;

        public ym(d dVar) {
            this.b = dVar;
        }

        public void j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            try {
                this.b.a(s.d(obj), obj2.toString(), obj3 instanceof Class ? ((Class) obj3).getName() : obj3.toString(), s.d(obj4), obj5, obj6);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void sc(Object obj) {
            try {
                this.b.a(s.d(obj));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void sf() {
            try {
                this.b.b();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void xgbt(Object obj, Object obj2) {
            try {
                this.b.a(s.d(obj), obj2.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public int ymsl() {
            try {
                return this.b.a();
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }
    }

    public hdct() {
        this.st = null;
        this.sj = null;
        this.b = null;
        this.c = null;
        this.sj = new ViewEvent(null);
    }

    public hdct(AppInfo appInfo, ViewPager viewPager) {
        super(appInfo, viewPager);
        this.st = null;
        this.sj = null;
        this.b = null;
        this.c = null;
        this.st = viewPager;
        this.sj = new ViewEvent(viewPager);
    }

    public final boolean bdbqbj(Object obj, Object obj2) {
        View st = this.a.st(obj);
        if (st == null || !(st instanceof TabLayout)) {
            return false;
        }
        ((TabLayout) st).setupWithViewPager((ViewPager) this.v, obj2.equals(Boolean.valueOf(true)));
        return true;
    }

    public final int hcjmsl() {
        ViewPager viewPager = this.st;
        return viewPager == null ? -1 : viewPager.getOffscreenPageLimit();
    }

    public final void hcjmsl(Object obj) {
        ViewPager viewPager = this.st;
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(s.d(obj));
        }
    }

    public final void jm(View[] viewArr) {
        this.b = viewArr;
        this.st.setAdapter(new b(this));
        this.st.setOffscreenPageLimit(this.b.length);
    }

    public final View[] jm(Object obj, Object obj2) {
        View[] jm = jm(obj, obj2, Boolean.valueOf(false));
        this.b = jm;
        jm(jm);
        return this.b;
    }

    public final ym ym() {
        if (this.c == null) {
            d dVar = new d(this.a.aa.getSupportFragmentManager(), this.a, this.st);
            this.st.setAdapter(dVar);
            this.st.setOffscreenPageLimit(5);
            this.c = new ym(dVar);
        }
        return this.c;
    }

    public final int zsjm() {
        ViewPager viewPager = this.st;
        return viewPager == null ? -1 : viewPager.getCurrentItem();
    }

    public final void zsjm(Object obj) {
        ViewPager viewPager = this.st;
        if (viewPager != null) {
            viewPager.setCurrentItem(s.d(obj));
        }
    }
}