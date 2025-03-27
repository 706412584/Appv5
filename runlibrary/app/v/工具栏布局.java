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

public final class 工具栏布局 extends 视图组 {
    private 工具栏 b;
    /* renamed from: 事件 */
    public 视图事件 f150;
    /* renamed from: 视图 */
    public Toolbar f151;

    public class 工具栏 {
        /* renamed from: 动作栏 */
        public ActionBar f152;

        public 工具栏() {
            this.f152 = 工具栏布局.this.a.aa.getSupportActionBar();
        }

        /* renamed from: 右按钮图像 */
        public void m765(Object obj) {
            工具栏布局.this.f151.setOverflowIcon(a.a(obj, 工具栏布局.this.a.c));
        }

        /* renamed from: 子标题 */
        public String m766() {
            return (String) this.f152.getSubtitle();
        }

        /* renamed from: 子标题 */
        public void m751(Object obj) {
            this.f152.setSubtitle(obj.toString());
        }

        /* renamed from: 左按钮可用 */
        public void m767(Object obj) {
            this.f152.setHomeButtonEnabled(obj.equals(Boolean.valueOf(true)));
        }

        /* renamed from: 左按钮图像 */
        public void m768(Object obj) {
            this.f152.setHomeButtonEnabled(true);
            this.f152.setDisplayShowHomeEnabled(true);
            工具栏布局.this.f151.setNavigationIcon(a.a(obj, 工具栏布局.this.a.c));
        }

        /* renamed from: 左按钮小箭头 */
        public void m769(Object obj) {
            this.f152.setDisplayHomeAsUpEnabled(obj.equals(Boolean.valueOf(true)));
        }

        /* renamed from: 左按钮显示 */
        public void m770(Object obj) {
            this.f152.setDisplayShowHomeEnabled(obj.equals(Boolean.valueOf(true)));
        }

        /* renamed from: 左按钮监听事件 */
        public void m771(OnClickListener onClickListener) {
            this.f152.setHomeButtonEnabled(true);
            this.f152.setDisplayShowHomeEnabled(true);
            工具栏布局.this.f151.setNavigationOnClickListener(onClickListener);
        }

        /* renamed from: 显示标题 */
        public void m772(Object obj) {
            this.f152.setDisplayShowTitleEnabled(obj.equals(Boolean.valueOf(true)));
        }

        /* renamed from: 显示自定义布局 */
        public void m773(Object obj) {
            this.f152.setDisplayShowCustomEnabled(obj.equals(Boolean.valueOf(true)));
        }

        /* renamed from: 显示选项 */
        public int m774() {
            return this.f152.getDisplayOptions();
        }

        /* renamed from: 显示选项 */
        public void m775(Object obj) {
            this.f152.setDisplayOptions(s.d(obj));
        }

        /* renamed from: 标题 */
        public String m776() {
            return (String) this.f152.getTitle();
        }

        /* renamed from: 标题 */
        public void m777(Object obj) {
            this.f152.setTitle(obj.toString());
        }

        /* renamed from: 自定义布局 */
        public View m778() {
            return this.f152.getCustomView();
        }

        /* renamed from: 自定义布局 */
        public void m779(Object obj) {
            View st = 工具栏布局.this.a.st(obj);
            if (st == null) {
                this.f152.setCustomView(st);
            }
        }

        /* renamed from: 高 */
        public int m780() {
            return this.f152.getHeight();
        }
    }

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 工具栏布局() {
        this.f151 = null;
        this.f150 = null;
        this.b = null;
        this.f150 = new 视图事件(null);
    }

    public 工具栏布局(AppInfo appInfo, Toolbar toolbar) {
        super(appInfo, toolbar);
        this.f151 = null;
        this.f150 = null;
        this.b = null;
        this.f151 = toolbar;
        this.f150 = new 视图事件(toolbar);
    }

    /* renamed from: 子标题 */
    public final void m751(Object obj) {
        Toolbar toolbar = this.f151;
        if (toolbar != null) {
            toolbar.setSubtitle(obj.toString());
        }
    }

    /* renamed from: 子标题颜色 */
    public final void m752(Object obj) {
        Toolbar toolbar = this.f151;
        if (toolbar != null) {
            toolbar.setSubtitleTextColor(ClientsUDP.a(obj));
        }
    }

    /* renamed from: 工具栏 */
    public final 工具栏 m753() {
        try {
            this.a.aa.setSupportActionBar(this.f151);
            工具栏 工具栏 = this.b;
            if (工具栏 == null) {
                this.b = new 工具栏();
            } else {
                工具栏.f152 = this.a.aa.getSupportActionBar();
            }
            return this.b;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: 弹出菜单样式 */
    public final boolean m754(Object obj) {
        if (this.f151 == null) {
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
        this.f151.setPopupTheme(i);
        return true;
    }

    /* renamed from: 标题 */
    public final void m755(Object obj) {
        Toolbar toolbar = this.f151;
        if (toolbar != null) {
            toolbar.setTitle(obj.toString());
        }
    }

    /* renamed from: 标题外边距上边 */
    public final void m756(Object obj) {
        Toolbar toolbar = this.f151;
        if (toolbar != null) {
            toolbar.setTitleMarginTop(s.a(this.a, obj.toString()));
        }
    }

    /* renamed from: 标题外边距下边 */
    public final void m757(Object obj) {
        Toolbar toolbar = this.f151;
        if (toolbar != null) {
            toolbar.setTitleMarginBottom(s.a(this.a, obj.toString()));
        }
    }

    /* renamed from: 标题外边距开始 */
    public final void m758(Object obj) {
        Toolbar toolbar = this.f151;
        if (toolbar != null) {
            toolbar.setTitleMarginStart(s.a(this.a, obj.toString()));
        }
    }

    /* renamed from: 标题外边距结束 */
    public final void m759(Object obj) {
        Toolbar toolbar = this.f151;
        if (toolbar != null) {
            toolbar.setTitleMarginEnd(s.a(this.a, obj.toString()));
        }
    }

    /* renamed from: 标题颜色 */
    public final void m760(Object obj) {
        Toolbar toolbar = this.f151;
        if (toolbar != null) {
            toolbar.setTitleTextColor(ClientsUDP.a(obj));
        }
    }

    /* renamed from: 相对内容插入 */
    public final void m761(Object obj, Object obj2) {
        Toolbar toolbar = this.f151;
        if (toolbar != null) {
            toolbar.setContentInsetsRelative(s.a(this.a, obj.toString()), s.a(this.a, obj2.toString()));
        }
    }

    /* renamed from: 绑定侧滑 */
    public final boolean m762(Object obj) {
        View st = this.a.st(obj);
        if (st != null && (st instanceof DrawerLayout)) {
            this.a.aa.getSupportActionBar().setHomeButtonEnabled(true);
        }
        return false;
    }

    /* renamed from: 绝对内容插入 */
    public final void m763(Object obj, Object obj2) {
        Toolbar toolbar = this.f151;
        if (toolbar != null) {
            toolbar.setContentInsetsAbsolute(s.a(this.a, obj.toString()), s.a(this.a, obj2.toString()));
        }
    }

    /* renamed from: 高 */
    public final void m764(Object obj) {
        Toolbar toolbar = this.f151;
        if (toolbar != null) {
            int i;
            LayoutParams layoutParams = toolbar.getLayoutParams();
            if (obj.equals("-1")) {
                i = -1;
            } else {
                int i2 = -2;
                if (!obj.equals("-2")) {
                    if (obj.equals("-3")) {
                        if (this.f151 instanceof Toolbar) {
                            TypedValue typedValue = new TypedValue();
                            if (this.a.c.getTheme().resolveAttribute(2130903045, typedValue, true)) {
                                i2 = TypedValue.complexToDimensionPixelSize(typedValue.data, this.a.c.getResources().getDisplayMetrics());
                            }
                        }
                        this.f151.setLayoutParams(layoutParams);
                    }
                    i = s.a(this.a, obj);
                }
                layoutParams.height = i2;
                this.f151.setLayoutParams(layoutParams);
            }
            layoutParams.height = i;
            this.f151.setLayoutParams(layoutParams);
        }
    }
}