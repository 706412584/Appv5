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
import i.runlibrary.app.v.协调布局.协调布局规则;
import i.runlibrary.app.v.应用栏布局.应用栏布局规则;
import i.runlibrary.app.v.折叠工具栏布局.折叠工具栏布局规则;
import i.runlibrary.app.v.相对布局.相对布局规则;
import i.runlibrary.app.v.约束布局.约束布局规则;
import i.runlibrary.app.v.线性布局.线性布局规则;
import i.runlibrary.app.v.表格项.表格项规则;
import i.runlibrary.app.工具.动画操作;
import i.runlibrary.c.a;

public class 基础 {
    AppInfo a = null;
    private 规则 b = null;
    private 外边距规则 c = null;
    /* renamed from: 控件 */
    public View f90 = null;

    public class 规则 {
        public AppInfo appInfo;
        public View v;
        /* renamed from: 规则 */
        public LayoutParams f91;

        public 规则(AppInfo appInfo, View view) {
            this.appInfo = appInfo;
            this.v = view;
            LayoutParams layoutParams = view.getLayoutParams();
            this.f91 = layoutParams;
            if (layoutParams == null) {
                this.f91 = new LayoutParams(-2, -2);
            }
        }

        /* renamed from: 宽 */
        public int m581() {
            return this.f91.width;
        }

        /* renamed from: 宽 */
        public void m582(Object obj) {
            this.f91.width = s.a(this.appInfo, obj);
            View view = this.v;
            if (view != null) {
                view.setLayoutParams(this.f91);
            }
        }

        /* renamed from: 宽高 */
        public void m583(Object obj, Object obj2) {
            this.f91.width = s.a(this.appInfo, obj);
            this.f91.height = s.a(this.appInfo, obj2);
            View view = this.v;
            if (view != null) {
                view.setLayoutParams(this.f91);
            }
        }

        /* renamed from: 高 */
        public int m584() {
            return this.f91.height;
        }

        /* renamed from: 高 */
        public void m585(Object obj) {
            this.f91.height = s.a(this.appInfo, obj);
            View view = this.v;
            if (view != null) {
                view.setLayoutParams(this.f91);
            }
        }
    }

    public class 外边距规则 extends 规则 {
        /* renamed from: 规则 */
        public MarginLayoutParams f92;

        public 外边距规则(AppInfo appInfo, View view) {
            super(appInfo, view);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            this.f92 = marginLayoutParams;
            if (marginLayoutParams == null) {
                this.f92 = new LayoutParams(-2, -2);
            }
        }

        /* renamed from: 外边距 */
        public void m545(Object obj, Object obj2, Object obj3, Object obj4) {
            this.f92.setMargins(s.a(this.appInfo, obj), s.a(this.appInfo, obj2), s.a(this.appInfo, obj3), s.a(this.appInfo, obj4));
            if (this.v != null) {
                this.v.setLayoutParams(this.f92);
            }
        }

        /* renamed from: 外边距上边 */
        public int m586() {
            return this.f92.topMargin;
        }

        /* renamed from: 外边距上边 */
        public void m547(Object obj) {
            this.f92.topMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f92);
            }
        }

        /* renamed from: 外边距下边 */
        public int m587() {
            return this.f92.bottomMargin;
        }

        /* renamed from: 外边距下边 */
        public void m588(Object obj) {
            this.f92.bottomMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f92);
            }
        }

        /* renamed from: 外边距右边 */
        public int m589() {
            return this.f92.rightMargin;
        }

        /* renamed from: 外边距右边 */
        public void m551(Object obj) {
            this.f92.rightMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f92);
            }
        }

        /* renamed from: 外边距左边 */
        public int m590() {
            return this.f92.leftMargin;
        }

        /* renamed from: 外边距左边 */
        public void m591(Object obj) {
            this.f92.leftMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f92);
            }
        }
    }

    public class 窗口管理器规则 extends 规则 {
        /* renamed from: 规则 */
        public WindowManager.LayoutParams f93;

        public 窗口管理器规则(AppInfo appInfo, View view) {
            super(appInfo, view);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
            this.f93 = layoutParams;
            if (layoutParams == null) {
                this.f93 = new LayoutParams(-2, -2);
            }
        }

        public int x() {
            return this.f93.x;
        }

        public void x(Object obj) {
            this.f93.x = s.a(this.appInfo, obj);
        }

        public void xy(Object obj) {
            this.f93.x = s.a(this.appInfo, obj);
            this.f93.y = s.a(this.appInfo, obj);
        }

        public int y() {
            return this.f93.y;
        }

        public void y(Object obj) {
            this.f93.y = s.a(this.appInfo, obj);
        }
    }

    基础() {
    }

    基础(AppInfo appInfo, View view) {
        this.a = appInfo;
        this.f90 = view;
    }

    public int id() {
        View view = this.f90;
        return view != null ? view.getId() : -1;
    }

    public boolean id(Object obj) {
        View view = this.f90;
        if (view == null) {
            return false;
        }
        view.setId(s.d(obj));
        return true;
    }

    public String toString() {
        if (this.f90 == null) {
            return "null";
        }
        return String.format("视图.%s@%s", new Object[]{Integer.valueOf(this.f90.getId()), this.f90});
    }

    public int x() {
        View view = this.f90;
        return view != null ? (int) view.getX() : -1;
    }

    public boolean xy(Object obj, Object obj2) {
        View view = this.f90;
        if (view == null) {
            return false;
        }
        view.setX((float) s.a(this.a, obj));
        this.f90.setY((float) s.a(this.a, obj2));
        return true;
    }

    public int y() {
        View view = this.f90;
        return view != null ? (int) view.getY() : -1;
    }

    /* renamed from: 内边距 */
    public boolean m530(Object obj, Object obj2, Object obj3, Object obj4) {
        View view = this.f90;
        if (view == null) {
            return false;
        }
        view.setPadding(s.a(this.a, obj), s.a(this.a, obj2), s.a(this.a, obj3), s.a(this.a, obj4));
        return true;
    }

    /* renamed from: 内边距上 */
    public int m531() {
        View view = this.f90;
        return view != null ? view.getPaddingTop() : -1;
    }

    /* renamed from: 内边距下 */
    public int m532() {
        View view = this.f90;
        return view != null ? view.getPaddingBottom() : -1;
    }

    /* renamed from: 内边距右 */
    public int m533() {
        View view = this.f90;
        return view != null ? view.getPaddingRight() : -1;
    }

    /* renamed from: 内边距左 */
    public int m534() {
        View view = this.f90;
        return view != null ? view.getPaddingLeft() : -1;
    }

    /* renamed from: 前景背景 */
    public boolean m535(Object obj) {
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        this.f90.setForeground(a.a(obj, this.a.c));
        return true;
    }

    /* renamed from: 动画 */
    public boolean m536(Object obj) {
        View view;
        Animation animation;
        if (obj instanceof Animation) {
            view = this.f90;
            animation = (Animation) obj;
        } else if (obj instanceof Animationx) {
            view = this.f90;
            animation = ((Animationx) obj).dh;
        } else if (!(obj instanceof 动画操作)) {
            return false;
        } else {
            view = this.f90;
            animation = ((动画操作) obj).f63;
        }
        view.startAnimation(animation);
        return true;
    }

    /* renamed from: 协调布局规则 */
    public 协调布局规则 m537() {
        return new 协调布局规则(this.a, this.f90);
    }

    /* renamed from: 可见度 */
    public int m538() {
        View view = this.f90;
        return view != null ? view.getVisibility() : -1;
    }

    /* renamed from: 可见度 */
    public boolean m539(Object obj) {
        if (this.f90 == null) {
            return false;
        }
        String valueOf = String.valueOf(obj);
        if (!valueOf.equals("visible")) {
            View view;
            int i;
            if (valueOf.equals("invisible")) {
                view = this.f90;
                i = 4;
            } else if (valueOf.equals("gone")) {
                view = this.f90;
                i = 8;
            } else if (valueOf.matches("[0-9]+")) {
                this.f90.setVisibility(Integer.parseInt(valueOf));
                return true;
            }
            view.setVisibility(i);
            return true;
        }
        this.f90.setVisibility(0);
        return true;
    }

    /* renamed from: 启用 */
    public boolean m540() {
        View view = this.f90;
        return view != null ? view.isEnabled() : false;
    }

    /* renamed from: 启用 */
    public boolean m541(Object obj) {
        View view = this.f90;
        if (view == null) {
            return false;
        }
        view.setEnabled(obj.equals(Boolean.valueOf(true)));
        return true;
    }

    /* renamed from: 响应单击 */
    public boolean m542() {
        View view = this.f90;
        if (view == null) {
            return false;
        }
        view.isClickable();
        return true;
    }

    /* renamed from: 响应单击 */
    public boolean m543(Object obj) {
        View view = this.f90;
        if (view == null) {
            return false;
        }
        view.setClickable(obj.equals(Boolean.valueOf(true)));
        return true;
    }

    /* renamed from: 响应长按 */
    public void m544(Object obj) {
        this.f90.setLongClickable(obj.equals(Boolean.valueOf(true)));
    }

    /* renamed from: 外边距 */
    public void m545(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.c == null) {
            this.c = m554();
        }
        外边距规则 外边距规则 = this.c;
        if (外边距规则 != null) {
            外边距规则.f92.setMargins(s.a(this.a, obj), s.a(this.a, obj2), s.a(this.a, obj3), s.a(this.a, obj4));
            View view = this.f90;
            if (view != null) {
                view.setLayoutParams(this.c.f92);
            }
        }
    }

    /* renamed from: 外边距上边 */
    public int m546() {
        if (this.c == null) {
            this.c = m554();
        }
        外边距规则 外边距规则 = this.c;
        return 外边距规则 == null ? -1 : 外边距规则.f92.topMargin;
    }

    /* renamed from: 外边距上边 */
    public void m547(Object obj) {
        if (this.c == null) {
            this.c = m554();
        }
        外边距规则 外边距规则 = this.c;
        if (外边距规则 != null) {
            外边距规则.f92.topMargin = s.a(this.a, obj);
            View view = this.f90;
            if (view != null) {
                view.setLayoutParams(this.c.f92);
            }
        }
    }

    /* renamed from: 外边距下边 */
    public int m548() {
        if (this.c == null) {
            this.c = m554();
        }
        外边距规则 外边距规则 = this.c;
        return 外边距规则 == null ? -1 : 外边距规则.f92.bottomMargin;
    }

    /* renamed from: 外边距下边 */
    public void m549(Object obj) {
        if (this.c == null) {
            this.c = m554();
        }
        外边距规则 外边距规则 = this.c;
        if (外边距规则 != null) {
            外边距规则.f92.bottomMargin = s.a(this.a, obj);
            View view = this.f90;
            if (view != null) {
                view.setLayoutParams(this.c.f92);
            }
        }
    }

    /* renamed from: 外边距右边 */
    public int m550() {
        if (this.c == null) {
            this.c = m554();
        }
        外边距规则 外边距规则 = this.c;
        return 外边距规则 == null ? -1 : 外边距规则.f92.rightMargin;
    }

    /* renamed from: 外边距右边 */
    public void m551(Object obj) {
        if (this.c == null) {
            this.c = m554();
        }
        外边距规则 外边距规则 = this.c;
        if (外边距规则 != null) {
            外边距规则.f92.rightMargin = s.a(this.a, obj);
            View view = this.f90;
            if (view != null) {
                view.setLayoutParams(this.c.f92);
            }
        }
    }

    /* renamed from: 外边距左边 */
    public int m552() {
        if (this.c == null) {
            this.c = m554();
        }
        外边距规则 外边距规则 = this.c;
        return 外边距规则 == null ? -1 : 外边距规则.f92.leftMargin;
    }

    /* renamed from: 外边距左边 */
    public void m553(Object obj) {
        if (this.c == null) {
            this.c = m554();
        }
        外边距规则 外边距规则 = this.c;
        if (外边距规则 != null) {
            外边距规则.f92.leftMargin = s.a(this.a, obj);
            View view = this.f90;
            if (view != null) {
                view.setLayoutParams(this.c.f92);
            }
        }
    }

    /* renamed from: 外边距规则 */
    public 外边距规则 m554() {
        return new 外边距规则(this.a, this.f90);
    }

    /* renamed from: 宽 */
    public int m555() {
        if (this.b == null) {
            this.b = m575();
        }
        规则 规则 = this.b;
        return 规则 == null ? -1 : 规则.f91.width;
    }

    /* renamed from: 宽 */
    public void m556(Object obj) {
        if (this.b == null) {
            this.b = m575();
        }
        规则 规则 = this.b;
        if (规则 != null) {
            规则.f91.width = s.a(this.a, obj);
            View view = this.f90;
            if (view != null) {
                view.setLayoutParams(this.b.f91);
            }
        }
    }

    /* renamed from: 宽高 */
    public void m557(Object obj, Object obj2) {
        if (this.b == null) {
            this.b = m575();
        }
        规则 规则 = this.b;
        if (规则 != null) {
            规则.f91.width = s.a(this.a, obj);
            this.b.f91.height = s.a(this.a, obj2);
            View view = this.f90;
            if (view != null) {
                view.setLayoutParams(this.b.f91);
            }
        }
    }

    /* renamed from: 应用栏布局规则 */
    public 应用栏布局规则 m558() {
        return new 应用栏布局规则(this.a, this.f90);
    }

    /* renamed from: 折叠工具栏布局规则 */
    public 折叠工具栏布局规则 m559() {
        return new 折叠工具栏布局规则(this.a, this.f90);
    }

    /* renamed from: 显示滚动条 */
    public boolean m560(Object obj) {
        if (obj.equals("none")) {
            this.f90.setVerticalScrollBarEnabled(false);
            this.f90.setHorizontalScrollBarEnabled(false);
            return true;
        }
        if (obj.equals("horizontal")) {
            this.f90.setHorizontalScrollBarEnabled(true);
        } else if (!obj.equals("vertical")) {
            return false;
        } else {
            this.f90.setVerticalScrollBarEnabled(true);
        }
        return true;
    }

    /* renamed from: 最小宽 */
    public boolean m561(Object obj) {
        this.f90.setMinimumWidth(s.a(this.a, obj));
        return true;
    }

    /* renamed from: 最小高 */
    public boolean m562(Object obj) {
        this.f90.setMinimumHeight(s.a(this.a, obj));
        return true;
    }

    /* renamed from: 波纹效果颜色 */
    public boolean m563(Object obj) {
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        this.f90.setBackground(new RippleDrawable(ColorStateList.valueOf(ClientsUDP.a(obj)), this.f90.getBackground(), this.f90.getBackground()));
        return true;
    }

    /* renamed from: 滚动时边框渐变放向 */
    public boolean m564(Object obj) {
        if (obj.equals("none")) {
            this.f90.setVerticalFadingEdgeEnabled(false);
            this.f90.setHorizontalFadingEdgeEnabled(false);
            return true;
        }
        if (obj.equals("horizontal")) {
            this.f90.setHorizontalFadingEdgeEnabled(true);
        } else if (!obj.equals("vertical")) {
            return false;
        } else {
            this.f90.setVerticalFadingEdgeEnabled(true);
        }
        return true;
    }

    /* renamed from: 滚动条风格 */
    public void m565(Object obj) {
        int i;
        View view = this.f90;
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

    /* renamed from: 父控件 */
    public View m566() {
        View view = this.f90;
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

    /* renamed from: 相对布局规则 */
    public 相对布局规则 m567() {
        return new 相对布局规则(this.a, this.f90);
    }

    /* renamed from: 窗口管理器规则 */
    public 窗口管理器规则 m568() {
        return new 窗口管理器规则(this.a, this.f90);
    }

    /* renamed from: 约束布局规则 */
    public 约束布局规则 m569() {
        return new 约束布局规则(this.a, this.f90);
    }

    /* renamed from: 线性布局规则 */
    public 线性布局规则 m570() {
        return new 线性布局规则(this.a, this.f90);
    }

    /* renamed from: 背景 */
    public Drawable m571() {
        View view = this.f90;
        return view != null ? view.getBackground() : null;
    }

    /* renamed from: 背景 */
    public boolean m572(Object obj) {
        if (this.f90 == null) {
            return false;
        }
        if (this.a.c != null && (obj instanceof String)) {
            String obj2 = obj.toString();
            String toLowerCase = obj2.toLowerCase();
            if (toLowerCase.startsWith("http:") || toLowerCase.startsWith("https:") || toLowerCase.startsWith("ftp:")) {
                i.a(this.a.c, this.f90, obj2, toLowerCase, true);
                return true;
            }
        }
        Drawable a = a.a(obj, this.a.c);
        if (a == null) {
            this.f90.setBackgroundDrawable(null);
        } else {
            this.f90.setBackgroundDrawable(a);
        }
        return true;
    }

    /* renamed from: 获取焦点 */
    public boolean m573(Object obj) {
        if (this.f90 == null) {
            return false;
        }
        boolean equals = obj.equals(Boolean.valueOf(true));
        this.f90.setFocusable(equals);
        this.f90.setFocusableInTouchMode(equals);
        return true;
    }

    /* renamed from: 表格项规则 */
    public 表格项规则 m574() {
        return new 表格项规则(this.a, this.f90);
    }

    /* renamed from: 规则 */
    public 规则 m575() {
        return new 规则(this.a, this.f90);
    }

    /* renamed from: 边框渐变长度 */
    public void m576(Object obj) {
        this.f90.setFadingEdgeLength(s.d(obj));
    }

    /* renamed from: 过度滚动状态 */
    public void m577(Object obj) {
        int i;
        View view = this.f90;
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

    /* renamed from: 阴影大小 */
    public boolean m578(Object obj) {
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        this.f90.setElevation((float) s.a(this.a, obj));
        return true;
    }

    /* renamed from: 高 */
    public int m579() {
        if (this.b == null) {
            this.b = m575();
        }
        规则 规则 = this.b;
        return 规则 == null ? -1 : 规则.f91.height;
    }

    /* renamed from: 高 */
    public void m580(Object obj) {
        if (this.b == null) {
            this.b = m575();
        }
        规则 规则 = this.b;
        if (规则 != null) {
            规则.f91.height = s.a(this.a, obj);
            View view = this.f90;
            if (view != null) {
                view.setLayoutParams(this.b.f91);
            }
        }
    }
}