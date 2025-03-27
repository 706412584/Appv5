package i.runlibrary.app.v;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.Animation;
import i.app.ClientsUDP;
import i.runlibrary.a.i;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.gj.Animationx;
import i.runlibrary.app.v.bgx.bgxgz;
import i.runlibrary.app.v.xdbj.xdbjgz;
import i.runlibrary.app.v.xtbj.xtbjgz;
import i.runlibrary.app.v.xxbj.xxbjgz;
import i.runlibrary.app.v.ysbj.ysbjgz;
import i.runlibrary.app.v.yylbj.yylbjgz;
import i.runlibrary.app.v.zdgjlbj.zdgjlbjgz;
import i.runlibrary.app.工具.动画操作;
import i.runlibrary.c.a;

public class VC {
    AppInfo a = null;
    private gz b = null;
    private wbjgz c = null;
    public View v = null;

    public class gz {
        public AppInfo appInfo;
        public LayoutParams gz;
        public View v;

        public gz(AppInfo appInfo, View view) {
            this.appInfo = appInfo;
            this.v = view;
            LayoutParams layoutParams = view.getLayoutParams();
            this.gz = layoutParams;
            if (layoutParams == null) {
                this.gz = new LayoutParams(-2, -2);
            }
        }

        public int g() {
            return this.gz.height;
        }

        public double g(Object obj) {
            this.gz.height = s.a(this.appInfo, obj);
            View view = this.v;
            if (view == null) {
                return;
            }
            view.setLayoutParams(this.gz);
            return;
        }

        public int k() {
            return this.gz.width;
        }

        public void k(Object obj) {
            this.gz.width = s.a(this.appInfo, obj);
            View view = this.v;
            if (view != null) {
                view.setLayoutParams(this.gz);
            }
        }

        public void kg(Object obj, Object obj2) {
            this.gz.width = s.a(this.appInfo, obj);
            this.gz.height = s.a(this.appInfo, obj2);
            View view = this.v;
            if (view != null) {
                view.setLayoutParams(this.gz);
            }
        }
    }

    public class ckglqgz extends gz {
        public WindowManager.LayoutParams gz;

        public ckglqgz(AppInfo appInfo, View view) {
            super(appInfo, view);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
            this.gz = layoutParams;
            if (layoutParams == null) {
                this.gz = new LayoutParams(-2, -2);
            }
        }

        public int x() {
            return this.gz.x;
        }

        public void x(Object obj) {
            this.gz.x = s.a(this.appInfo, obj);
        }

        public void xy(Object obj) {
            this.gz.x = s.a(this.appInfo, obj);
            this.gz.y = s.a(this.appInfo, obj);
        }

        public int y() {
            return this.gz.y;
        }

        public void y(Object obj) {
            this.gz.y = s.a(this.appInfo, obj);
        }
    }

    public class wbjgz extends gz {
        public MarginLayoutParams gz;

        public wbjgz(AppInfo appInfo, View view) {
            super(appInfo, view);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            this.gz = marginLayoutParams;
            if (marginLayoutParams == null) {
                this.gz = new LayoutParams(-2, -2);
            }
        }

        public void wbj(Object obj, Object obj2, Object obj3, Object obj4) {
            this.gz.setMargins(s.a(this.appInfo, obj), s.a(this.appInfo, obj2), s.a(this.appInfo, obj3), s.a(this.appInfo, obj4));
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public int wbjsb() {
            return this.gz.topMargin;
        }

        public void wbjsb(Object obj) {
            this.gz.topMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public int wbjxb() {
            return this.gz.bottomMargin;
        }

        public void wbjxb(Object obj) {
            this.gz.bottomMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public int wbjyb() {
            return this.gz.rightMargin;
        }

        public void wbjyb(Object obj) {
            this.gz.rightMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public int wbjzb() {
            return this.gz.leftMargin;
        }

        public void wbjzb(Object obj) {
            this.gz.leftMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }
    }

    VC() {
    }

    VC(AppInfo appInfo, View view) {
        this.a = appInfo;
        this.v = view;
    }

    public bgxgz bgxgz() {
        return new bgxgz(this.a, this.v);
    }

    public Drawable bj() {
        View view = this.v;
        return view != null ? view.getBackground() : null;
    }

    public boolean bj(Object obj) {
        if (this.v == null) {
            return false;
        }
        if (this.a.c != null && (obj instanceof String)) {
            String obj2 = obj.toString();
            String toLowerCase = obj2.toLowerCase();
            if (toLowerCase.startsWith("http:") || toLowerCase.startsWith("https:") || toLowerCase.startsWith("ftp:")) {
                i.a(this.a.c, this.v, obj2, toLowerCase, true);
                return true;
            }
        }
        Drawable a = a.a(obj, this.a.c);
        if (a == null) {
            this.v.setBackgroundDrawable(null);
        } else {
            this.v.setBackgroundDrawable(a);
        }
        return true;
    }

    public void bkjbcd(Object obj) {
        this.v.setFadingEdgeLength(s.a(this.a, obj));
    }

    public boolean bwxgys(Object obj) {
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        this.v.setBackground(new RippleDrawable(ColorStateList.valueOf(ClientsUDP.a(obj)), this.v.getBackground(), this.v.getBackground()));
        return true;
    }

    public ckglqgz ckglqgz() {
        return new ckglqgz(this.a, this.v);
    }

    public boolean dh(Object obj) {
        View view;
        Animation animation;
        if (obj instanceof Animation) {
            view = this.v;
            animation = (Animation) obj;
        } else if (obj instanceof Animationx) {
            view = this.v;
            animation = ((Animationx) obj).dh;
        } else if (!(obj instanceof 动画操作)) {
            return false;
        } else {
            view = this.v;
            animation = ((动画操作) obj).f63;
        }
        view.startAnimation(animation);
        return true;
    }

    public View fkj() {
        View view = this.v;
        if (view != null) {
            try {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    return (View) parent;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public int g() {
        if (this.b == null) {
            this.b = gz();
        }
        gz gzVar = this.b;
        return gzVar == null ? -1 : gzVar.gz.height;
    }

    public double g(Object obj) {
        if (this.b == null) {
            this.b = gz();
        }
        gz gzVar = this.b;
        if (gzVar == null) {
            return;
        }
        gzVar.gz.height = s.a(this.a, obj);
        View view = this.v;
        if (view != null) {
            view.setLayoutParams(this.b.gz);
        }
        return;
    }

    public void gdgdzt(Object obj) {
        int i;
        View view = this.v;
        if (!obj.equals("always")) {
            if (obj.equals("if")) {
                i = 1;
            } else if (obj.equals("never")) {
                i = 2;
            }
            view.setOverScrollMode(i);
        }
        i = 0;
        view.setOverScrollMode(i);
    }

    public boolean gdsbkjbfx(Object obj) {
        if (obj.equals("none")) {
            this.v.setVerticalFadingEdgeEnabled(false);
            this.v.setHorizontalFadingEdgeEnabled(false);
            return true;
        }
        if (obj.equals("horizontal")) {
            this.v.setHorizontalFadingEdgeEnabled(true);
        } else if (!obj.equals("vertical")) {
            return false;
        } else {
            this.v.setVerticalFadingEdgeEnabled(true);
        }
        return true;
    }

    public void gdtfg(Object obj) {
        int i;
        View view = this.v;
        if (!obj.equals("insideoverlay")) {
            if (obj.equals("insideinset")) {
                i = 16777216;
            } else if (obj.equals("outsideoverlay")) {
                i = 33554432;
            } else if (obj.equals("outsideinset")) {
                i = 50331648;
            }
            view.setScrollBarStyle(i);
        }
        i = 0;
        view.setScrollBarStyle(i);
    }

    public gz gz() {
        return new gz(this.a, this.v);
    }

    public boolean hqjd(Object obj) {
        if (this.v == null) {
            return false;
        }
        boolean equals = obj.equals(Boolean.valueOf(true));
        this.v.setFocusable(equals);
        this.v.setFocusableInTouchMode(equals);
        return true;
    }

    public int id() {
        View view = this.v;
        return view != null ? view.getId() : -1;
    }

    public boolean id(Object obj) {
        View view = this.v;
        if (view == null) {
            return false;
        }
        view.setId(s.d(obj));
        return true;
    }

    public int k() {
        if (this.b == null) {
            this.b = gz();
        }
        gz gzVar = this.b;
        return gzVar == null ? -1 : gzVar.gz.width;
    }

    public void k(Object obj) {
        if (this.b == null) {
            this.b = gz();
        }
        gz gzVar = this.b;
        if (gzVar != null) {
            gzVar.gz.width = s.a(this.a, obj);
            View view = this.v;
            if (view != null) {
                view.setLayoutParams(this.b.gz);
            }
        }
    }

    public void kg(Object obj, Object obj2) {
        if (this.b == null) {
            this.b = gz();
        }
        gz gzVar = this.b;
        if (gzVar != null) {
            gzVar.gz.width = s.a(this.a, obj);
            this.b.gz.height = s.a(this.a, obj2);
            View view = this.v;
            if (view != null) {
                view.setLayoutParams(this.b.gz);
            }
        }
    }

    public int kjd() {
        View view = this.v;
        return view != null ? view.getVisibility() : -1;
    }

    public boolean kjd(Object obj) {
        if (this.v == null) {
            return false;
        }
        String valueOf = String.valueOf(obj);
        if (!valueOf.equals("visible")) {
            View view;
            int i;
            if (valueOf.equals("invisible")) {
                view = this.v;
                i = 4;
            } else if (valueOf.equals("gone")) {
                view = this.v;
                i = 8;
            } else if (valueOf.matches("[0-9]+")) {
                this.v.setVisibility(Integer.parseInt(valueOf));
                return true;
            }
            view.setVisibility(i);
            return true;
        }
        this.v.setVisibility(0);
        return true;
    }

    public boolean nbj(Object obj, Object obj2, Object obj3, Object obj4) {
        View view = this.v;
        if (view == null) {
            return false;
        }
        view.setPadding(s.a(this.a, obj), s.a(this.a, obj2), s.a(this.a, obj3), s.a(this.a, obj4));
        return true;
    }

    public int nbjs() {
        View view = this.v;
        return view != null ? view.getPaddingTop() : -1;
    }

    public int nbjx() {
        View view = this.v;
        return view != null ? view.getPaddingBottom() : -1;
    }

    public int nbjy() {
        View view = this.v;
        return view != null ? view.getPaddingRight() : -1;
    }

    public int nbjz() {
        View view = this.v;
        return view != null ? view.getPaddingLeft() : -1;
    }

    public boolean qjbj(Object obj) {
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        this.v.setForeground(a.a(obj, this.a.c));
        return true;
    }

    public boolean qy() {
        View view = this.v;
        return view != null ? view.isEnabled() : false;
    }

    public boolean qy(Object obj) {
        View view = this.v;
        if (view == null) {
            return false;
        }
        view.setEnabled(obj.equals(Boolean.valueOf(true)));
        return true;
    }

    public String toString() {
        if (this.v == null) {
            return "null";
        }
        return String.format("视图.%s@%s", new Object[]{Integer.valueOf(this.v.getId()), this.v});
    }

    public void wbj(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.c == null) {
            this.c = wbjgz();
        }
        wbjgz wbjgz = this.c;
        if (wbjgz != null) {
            wbjgz.gz.setMargins(s.a(this.a, obj), s.a(this.a, obj2), s.a(this.a, obj3), s.a(this.a, obj4));
            View view = this.v;
            if (view != null) {
                view.setLayoutParams(this.c.gz);
            }
        }
    }

    public wbjgz wbjgz() {
        return new wbjgz(this.a, this.v);
    }

    public int wbjsb() {
        if (this.c == null) {
            this.c = wbjgz();
        }
        wbjgz wbjgz = this.c;
        return wbjgz == null ? -1 : wbjgz.gz.topMargin;
    }

    public void wbjsb(Object obj) {
        if (this.c == null) {
            this.c = wbjgz();
        }
        wbjgz wbjgz = this.c;
        if (wbjgz != null) {
            wbjgz.gz.topMargin = s.a(this.a, obj);
            View view = this.v;
            if (view != null) {
                view.setLayoutParams(this.c.gz);
            }
        }
    }

    public int wbjxb() {
        if (this.c == null) {
            this.c = wbjgz();
        }
        wbjgz wbjgz = this.c;
        return wbjgz == null ? -1 : wbjgz.gz.bottomMargin;
    }

    public void wbjxb(Object obj) {
        if (this.c == null) {
            this.c = wbjgz();
        }
        wbjgz wbjgz = this.c;
        if (wbjgz != null) {
            wbjgz.gz.bottomMargin = s.a(this.a, obj);
            View view = this.v;
            if (view != null) {
                view.setLayoutParams(this.c.gz);
            }
        }
    }

    public int wbjyb() {
        if (this.c == null) {
            this.c = wbjgz();
        }
        wbjgz wbjgz = this.c;
        return wbjgz == null ? -1 : wbjgz.gz.rightMargin;
    }

    public void wbjyb(Object obj) {
        if (this.c == null) {
            this.c = wbjgz();
        }
        wbjgz wbjgz = this.c;
        if (wbjgz != null) {
            wbjgz.gz.rightMargin = s.a(this.a, obj);
            View view = this.v;
            if (view != null) {
                view.setLayoutParams(this.c.gz);
            }
        }
    }

    public int wbjzb() {
        if (this.c == null) {
            this.c = wbjgz();
        }
        wbjgz wbjgz = this.c;
        return wbjgz == null ? -1 : wbjgz.gz.leftMargin;
    }

    public void wbjzb(Object obj) {
        if (this.c == null) {
            this.c = wbjgz();
        }
        wbjgz wbjgz = this.c;
        if (wbjgz != null) {
            wbjgz.gz.leftMargin = s.a(this.a, obj);
            View view = this.v;
            if (view != null) {
                view.setLayoutParams(this.c.gz);
            }
        }
    }

    public int x() {
        View view = this.v;
        return view != null ? (int) view.getX() : -1;
    }

    public xdbjgz xdbjgz() {
        return new xdbjgz(this.a, this.v);
    }

    public boolean xsgdt(Object obj) {
        if (obj.equals("none")) {
            this.v.setVerticalScrollBarEnabled(false);
            this.v.setHorizontalScrollBarEnabled(false);
            return true;
        }
        if (obj.equals("horizontal")) {
            this.v.setHorizontalScrollBarEnabled(true);
        } else if (!obj.equals("vertical")) {
            return false;
        } else {
            this.v.setVerticalScrollBarEnabled(true);
        }
        return true;
    }

    public xtbjgz xtbjgz() {
        return new xtbjgz(this.a, this.v);
    }

    public xxbjgz xxbjgz() {
        return new xxbjgz(this.a, this.v);
    }

    public boolean xy(Object obj, Object obj2) {
        View view = this.v;
        if (view == null) {
            return false;
        }
        view.setX((float) s.a(this.a, obj));
        this.v.setY((float) s.a(this.a, obj2));
        return true;
    }

    public void xyca(Object obj) {
        this.v.setLongClickable(obj.equals(Boolean.valueOf(true)));
    }

    public boolean xydj() {
        View view = this.v;
        if (view == null) {
            return false;
        }
        view.isClickable();
        return true;
    }

    public boolean xydj(Object obj) {
        View view = this.v;
        if (view == null) {
            return false;
        }
        view.setClickable(obj.equals(Boolean.valueOf(true)));
        return true;
    }

    public int y() {
        View view = this.v;
        return view != null ? (int) view.getY() : -1;
    }

    public ysbjgz ysbjgz() {
        return new ysbjgz(this.a, this.v);
    }

    public boolean yydx(Object obj) {
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        this.v.setElevation((float) s.a(this.a, obj));
        return true;
    }

    public yylbjgz yylbjgz() {
        return new yylbjgz(this.a, this.v);
    }

    public zdgjlbjgz zdgjlbjgz() {
        return new zdgjlbjgz(this.a, this.v);
    }

    public boolean zxg(Object obj) {
        this.v.setMinimumHeight(s.a(this.a, obj));
        return true;
    }

    public boolean zxk(Object obj) {
        this.v.setMinimumWidth(s.a(this.a, obj));
        return true;
    }
}