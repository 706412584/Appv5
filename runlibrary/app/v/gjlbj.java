package i.runlibrary.app.v;

import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.c.a;

public final class gjlbj extends vg {
    private gjl b;
    public ViewEvent sj;
    public Toolbar st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public class gjl {
        public ActionBar ab;

        public gjl() {
            this.ab = gjlbj.this.a.aa.getSupportActionBar();
        }

        public String bt() {
            return (String) this.ab.getTitle();
        }

        public void bt(Object obj) {
            this.ab.setTitle(obj.toString());
        }

        public int g() {
            return this.ab.getHeight();
        }

        public void xsbt(Object obj) {
            this.ab.setDisplayShowTitleEnabled(obj.equals(Boolean.valueOf(true)));
        }

        public int xsxx() {
            return this.ab.getDisplayOptions();
        }

        public void xsxx(Object obj) {
            this.ab.setDisplayOptions(s.d(obj));
        }

        public void xszdybj(Object obj) {
            this.ab.setDisplayShowCustomEnabled(obj.equals(Boolean.valueOf(true)));
        }

        public void yantx(Object obj) {
            gjlbj.this.st.setOverflowIcon(a.a(obj, gjlbj.this.a.c));
        }

        public void zanjtsj(OnClickListener onClickListener) {
            this.ab.setHomeButtonEnabled(true);
            this.ab.setDisplayShowHomeEnabled(true);
            gjlbj.this.st.setNavigationOnClickListener(onClickListener);
        }

        public void zanky(Object obj) {
            this.ab.setHomeButtonEnabled(obj.equals(Boolean.valueOf(true)));
        }

        public void zantx(Object obj) {
            this.ab.setHomeButtonEnabled(true);
            this.ab.setDisplayShowHomeEnabled(true);
            gjlbj.this.st.setNavigationIcon(a.a(obj, gjlbj.this.a.c));
        }

        public void zanxjt(Object obj) {
            this.ab.setDisplayHomeAsUpEnabled(obj.equals(Boolean.valueOf(true)));
        }

        public void zanxs(Object obj) {
            this.ab.setDisplayShowHomeEnabled(obj.equals(Boolean.valueOf(true)));
        }

        public String zbt() {
            return (String) this.ab.getSubtitle();
        }

        public void zbt(Object obj) {
            this.ab.setSubtitle(obj.toString());
        }

        public View zdybj() {
            return this.ab.getCustomView();
        }

        public void zdybj(Object obj) {
            View st = gjlbj.this.a.st(obj);
            if (st == null) {
                this.ab.setCustomView(st);
            }
        }
    }

    public gjlbj() {
        this.st = null;
        this.sj = null;
        this.b = null;
        this.sj = new ViewEvent(null);
    }

    public gjlbj(AppInfo appInfo, Toolbar toolbar) {
        super(appInfo, toolbar);
        this.st = null;
        this.sj = null;
        this.b = null;
        this.st = toolbar;
        this.sj = new ViewEvent(this.v);
    }

    public final boolean bdch(Object obj) {
        View st = this.a.st(obj);
        if (st != null && (st instanceof DrawerLayout)) {
            this.a.aa.getSupportActionBar().setHomeButtonEnabled(true);
        }
        return false;
    }

    public final void bt(Object obj) {
        Toolbar toolbar = this.st;
        if (toolbar != null) {
            toolbar.setTitle(obj.toString());
        }
    }

    public final void btwbjjs(Object obj) {
        Toolbar toolbar = this.st;
        if (toolbar != null) {
            toolbar.setTitleMarginEnd(s.a(this.a, obj.toString()));
        }
    }

    public final void btwbjks(Object obj) {
        Toolbar toolbar = this.st;
        if (toolbar != null) {
            toolbar.setTitleMarginStart(s.a(this.a, obj.toString()));
        }
    }

    public final void btwbjsb(Object obj) {
        Toolbar toolbar = this.st;
        if (toolbar != null) {
            toolbar.setTitleMarginTop(s.a(this.a, obj.toString()));
        }
    }

    public final void btwbjxb(Object obj) {
        Toolbar toolbar = this.st;
        if (toolbar != null) {
            toolbar.setTitleMarginBottom(s.a(this.a, obj.toString()));
        }
    }

    public final void btys(Object obj) {
        Toolbar toolbar = this.st;
        if (toolbar != null) {
            toolbar.setTitleTextColor(ClientsUDP.a(obj));
        }
    }

    public final double g(Object obj) {
        if (this.st == null) {
            return;
        }
        int i;
        LayoutParams layoutParams = this.v.getLayoutParams();
        if (obj.equals("-1")) {
            i = -1;
        } else {
            int i2 = -2;
            if (!obj.equals("-2")) {
                if (obj.equals("-3")) {
                    if (this.v instanceof Toolbar) {
                        TypedValue typedValue = new TypedValue();
                        if (this.a.c.getTheme().resolveAttribute(2130903045, typedValue, true)) {
                            i2 = TypedValue.complexToDimensionPixelSize(typedValue.data, this.a.c.getResources().getDisplayMetrics());
                        }
                    }
                    this.v.setLayoutParams(layoutParams);
                    return;
                }
                i = s.a(this.a, obj);
            }
            layoutParams.height = i2;
            this.v.setLayoutParams(layoutParams);
            return;
        }
        layoutParams.height = i;
        this.v.setLayoutParams(layoutParams);
        return;
    }

    public final gjl gjl() {
        try {
            this.a.aa.setSupportActionBar(this.st);
            gjl gjl = this.b;
            if (gjl == null) {
                this.b = new gjl();
            } else {
                gjl.ab = this.a.aa.getSupportActionBar();
            }
            return this.b;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void jdnrcr(Object obj, Object obj2) {
        Toolbar toolbar = this.st;
        if (toolbar != null) {
            toolbar.setContentInsetsAbsolute(s.a(this.a, obj.toString()), s.a(this.a, obj2.toString()));
        }
    }

    public final boolean tccdys(Object obj) {
        if (this.st == null) {
            return false;
        }
        int i;
        if (obj.equals("ThemeOverlay_AppCompat")) {
            i = 2131755618;
        } else if (obj.equals("ThemeOverlay_AppCompat_Dark")) {
            i = 2131755620;
        } else if (obj.equals("ThemeOverlay_AppCompat_ActionBar")) {
            i = 2131755619;
        } else if (obj.equals("ThemeOverlay_AppCompat_Dark_ActionBar")) {
            i = 2131755621;
        } else if (obj.equals("ThemeOverlay_AppCompat_Dialog")) {
            i = 2131755624;
        } else if (obj.equals("ThemeOverlay_AppCompat_Dialog_Alert")) {
            i = 2131755625;
        } else if (obj.equals("ThemeOverlay_AppCompat_Light")) {
            i = 2131755626;
        } else if (obj instanceof Number) {
            i = ((Number) obj).intValue();
        } else {
            String obj2 = obj.toString();
            if (!obj2.matches("[0-9]+")) {
                return false;
            }
            i = Integer.parseInt(obj2);
        }
        this.st.setPopupTheme(i);
        return true;
    }

    public final void xdnrcr(Object obj, Object obj2) {
        Toolbar toolbar = this.st;
        if (toolbar != null) {
            toolbar.setContentInsetsRelative(s.a(this.a, obj.toString()), s.a(this.a, obj2.toString()));
        }
    }

    public final void zbt(Object obj) {
        Toolbar toolbar = this.st;
        if (toolbar != null) {
            toolbar.setSubtitle(obj.toString());
        }
    }

    public final void zbtys(Object obj) {
        Toolbar toolbar = this.st;
        if (toolbar != null) {
            toolbar.setSubtitleTextColor(ClientsUDP.a(obj));
        }
    }
}