package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.基础.外边距规则;

public final class 协调布局 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f107;
    /* renamed from: 视图 */
    public CoordinatorLayout f108;

    public class 协调布局规则 extends 外边距规则 {
        /* renamed from: 规则 */
        public LayoutParams f109;

        public 协调布局规则(AppInfo appInfo, View view) {
            super(appInfo, view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.f109 = layoutParams;
            if (layoutParams == null) {
                this.f109 = new ViewGroup.LayoutParams(-2, -2);
            }
        }

        /* renamed from: 包含滑动组件 */
        public boolean m660(Object obj) {
            try {
                this.f109.setBehavior((Behavior) (obj instanceof Class ? (Class) obj : Class.forName(obj.toString())).newInstance());
                if (this.v != null) {
                    this.v.setLayoutParams(this.f109);
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: 对齐方式 */
        public void m385(Object obj) {
            this.f109.gravity = s.g(obj.toString());
            if (this.v != null) {
                this.v.setLayoutParams(this.f109);
            }
        }

        /* renamed from: 锚点 */
        public boolean m661(Object obj) {
            this.f109.setAnchorId(s.d(obj));
            if (this.v != null) {
                this.v.setLayoutParams(this.f109);
            }
            return true;
        }

        /* renamed from: 锚点位置 */
        public boolean m662(Object obj) {
            this.f109.anchorGravity = s.g(obj.toString());
            if (this.v != null) {
                this.v.setLayoutParams(this.f109);
            }
            return true;
        }
    }

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 协调布局() {
        this.f108 = null;
        this.f107 = null;
        this.f107 = new 视图事件(null);
    }

    public 协调布局(AppInfo appInfo, CoordinatorLayout coordinatorLayout) {
        super(appInfo, coordinatorLayout);
        this.f108 = null;
        this.f107 = null;
        this.f108 = coordinatorLayout;
        this.f107 = new 视图事件(coordinatorLayout);
    }
}