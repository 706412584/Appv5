package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.基础.外边距规则;

public class 相对布局 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f113;
    /* renamed from: 视图 */
    public RelativeLayout f114;

    public class 相对布局规则 extends 外边距规则 {
        /* renamed from: 规则 */
        public LayoutParams f115;

        public 相对布局规则(AppInfo appInfo, View view) {
            super(appInfo, view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.f115 = layoutParams;
            if (layoutParams == null) {
                this.f115 = new ViewGroup.LayoutParams(-2, -2);
            }
        }

        /* renamed from: 上边对齐下边 */
        public void m665(Object obj) {
            m682(3, s.d(obj));
        }

        /* renamed from: 下边对齐上边 */
        public void m666(Object obj) {
            m682(2, s.d(obj));
        }

        /* renamed from: 右边对齐左边 */
        public void m667(Object obj) {
            m682(1, s.d(obj));
        }

        /* renamed from: 垂直至于 */
        public void m668(Object obj) {
            m682(15, obj.equals(Boolean.valueOf(true)) ? -1 : 0);
        }

        /* renamed from: 对齐上边 */
        public void m669(Object obj) {
            m682(6, s.d(obj));
        }

        /* renamed from: 对齐下边 */
        public void m670(Object obj) {
            m682(8, s.d(obj));
        }

        /* renamed from: 对齐右边 */
        public void m671(Object obj) {
            m682(7, s.d(obj));
        }

        /* renamed from: 对齐基线 */
        public void m672(Object obj) {
            m682(4, s.d(obj));
        }

        /* renamed from: 对齐左边 */
        public void m673(Object obj) {
            m682(5, s.d(obj));
        }

        /* renamed from: 对齐父上边 */
        public void m674(Object obj) {
            m682(10, obj.equals(Boolean.valueOf(true)) ? -1 : 0);
        }

        /* renamed from: 对齐父下边 */
        public void m675(Object obj) {
            m682(12, obj.equals(Boolean.valueOf(true)) ? -1 : 0);
        }

        /* renamed from: 对齐父右边 */
        public void m676(Object obj) {
            m682(11, obj.equals(Boolean.valueOf(true)) ? -1 : 0);
        }

        /* renamed from: 对齐父左边 */
        public void m677(Object obj) {
            m682(9, obj.equals(Boolean.valueOf(true)) ? -1 : 0);
        }

        /* renamed from: 左边对齐右边 */
        public void m678(Object obj) {
            m682(0, s.d(obj));
        }

        /* renamed from: 水平至于 */
        public void m679(Object obj) {
            m682(14, obj.equals(Boolean.valueOf(true)) ? -1 : 0);
        }

        /* renamed from: 至于 */
        public void m680(Object obj) {
            m682(13, obj.equals(Boolean.valueOf(true)) ? -1 : 0);
        }

        /* renamed from: 规则 */
        public void m681(int i) {
            this.f115.addRule(i);
            if (this.v != null) {
                this.v.setLayoutParams(this.f115);
            }
        }

        /* renamed from: 规则 */
        public void m682(int i, int i2) {
            this.f115.addRule(i, i2);
            if (this.v != null) {
                this.v.setLayoutParams(this.f115);
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

    public 相对布局() {
        this.f114 = null;
        this.f113 = null;
        this.f113 = new 视图事件(null);
    }

    public 相对布局(AppInfo appInfo, RelativeLayout relativeLayout) {
        super(appInfo, relativeLayout);
        this.f114 = null;
        this.f113 = null;
        this.f114 = relativeLayout;
        this.f113 = new 视图事件(relativeLayout);
    }

    /* renamed from: 对齐方式 */
    public void m664(String str) {
        RelativeLayout relativeLayout = this.f114;
        if (relativeLayout != null) {
            relativeLayout.setGravity(s.g(str));
        }
    }
}