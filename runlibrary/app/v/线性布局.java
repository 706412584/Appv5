package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.基础.外边距规则;

public class 线性布局 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f119;
    /* renamed from: 视图 */
    public LinearLayout f120;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View a = null;

        public 视图事件(View view) {
            super(view);
            this.a = view;
        }
    }

    public class 线性布局规则 extends 外边距规则 {
        /* renamed from: 规则 */
        public LayoutParams f121;

        public 线性布局规则(AppInfo appInfo, View view) {
            super(appInfo, view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.f121 = layoutParams;
            if (layoutParams == null) {
                this.f121 = new ViewGroup.LayoutParams(-2, -2);
            }
        }

        /* renamed from: 对齐方式 */
        public void m385(Object obj) {
            this.f121.gravity = s.g(obj.toString());
            if (this.v != null) {
                this.v.setLayoutParams(this.f121);
            }
        }

        /* renamed from: 布局权重 */
        public void m710(Object obj) {
            this.f121.weight = (float) s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f121);
            }
        }
    }

    public 线性布局() {
        this.f120 = null;
        this.f119 = null;
        this.f119 = new 视图事件(null);
    }

    public 线性布局(AppInfo appInfo, LinearLayout linearLayout) {
        super(appInfo, linearLayout);
        this.f120 = null;
        this.f119 = null;
        this.f120 = linearLayout;
        this.f119 = new 视图事件(linearLayout);
    }

    /* renamed from: 对齐方式 */
    public void m385(Object obj) {
        LinearLayout linearLayout = this.f120;
        if (linearLayout != null) {
            linearLayout.setGravity(s.g(obj.toString()));
        }
    }

    /* renamed from: 方向 */
    public void m709(Object obj) {
        LinearLayout linearLayout = this.f120;
        if (linearLayout != null) {
            linearLayout.setOrientation(s.d(obj));
        }
    }
}