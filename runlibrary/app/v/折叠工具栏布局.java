package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.基础.外边距规则;
import i.runlibrary.c.a;

public final class 折叠工具栏布局 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f101;
    /* renamed from: 视图 */
    public CollapsingToolbarLayout f102;

    public class 折叠工具栏布局规则 extends 外边距规则 {
        /* renamed from: 规则 */
        public LayoutParams f103;

        public 折叠工具栏布局规则(AppInfo appInfo, View view) {
            super(appInfo, view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.f103 = layoutParams;
            if (layoutParams == null) {
                this.f103 = new ViewGroup.LayoutParams(-2, -2);
            }
        }

        /* renamed from: 对齐方式 */
        public void m385(Object obj) {
            this.f103.gravity = s.g(obj.toString());
            if (this.v != null) {
                this.v.setLayoutParams(this.f103);
            }
        }

        /* renamed from: 折叠模式 */
        public void m657(String str) {
            LayoutParams layoutParams;
            int i;
            if (str.equalsIgnoreCase("pin")) {
                layoutParams = this.f103;
                i = 1;
            } else if (str.equalsIgnoreCase("parallax")) {
                layoutParams = this.f103;
                i = 2;
            } else if (str.equalsIgnoreCase("none")) {
                layoutParams = this.f103;
                i = 0;
            } else {
                return;
            }
            layoutParams.setCollapseMode(i);
            if (this.v != null) {
                this.v.setLayoutParams(this.f103);
            }
        }
    }

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 折叠工具栏布局() {
        this.f102 = null;
        this.f101 = null;
        this.f101 = new 视图事件(null);
    }

    public 折叠工具栏布局(AppInfo appInfo, CollapsingToolbarLayout collapsingToolbarLayout) {
        super(appInfo, collapsingToolbarLayout);
        this.f102 = null;
        this.f101 = null;
        this.f102 = collapsingToolbarLayout;
        this.f101 = new 视图事件(collapsingToolbarLayout);
    }

    /* renamed from: 完全滑出背景颜色 */
    public final void m651(Object obj) {
        if (this.f102 != null) {
            this.f102.setContentScrim(a.a(obj, this.a.c));
        }
    }

    /* renamed from: 扩张时标题外边距 */
    public final void m652(Object obj, Object obj2, Object obj3, Object obj4) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f102;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setExpandedTitleMargin(s.a(this.a, obj), s.a(this.a, obj2), s.a(this.a, obj3), s.a(this.a, obj4));
        }
    }

    /* renamed from: 扩张时标题对齐方式 */
    public final void m653(Object obj) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f102;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setExpandedTitleGravity(s.g(obj.toString()));
        }
    }

    /* renamed from: 扩张时标题颜色 */
    public final void m654(Object obj) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f102;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setExpandedTitleColor(ClientsUDP.a(obj));
        }
    }

    /* renamed from: 收缩时标题对齐方式 */
    public final void m655(Object obj) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f102;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setCollapsedTitleGravity(s.g(obj.toString()));
        }
    }

    /* renamed from: 收缩时标题颜色 */
    public final void m656(Object obj) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f102;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setCollapsedTitleTextColor(ClientsUDP.a(obj));
        }
    }
}