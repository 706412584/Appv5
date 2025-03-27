package i.runlibrary.app.v;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import i.runlibrary.app.AppInfo;

public final class 嵌套滚动 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f148;
    /* renamed from: 视图 */
    public NestedScrollView f149;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 嵌套滚动() {
        this.f149 = null;
        this.f148 = null;
        this.f148 = new 视图事件(null);
    }

    public 嵌套滚动(AppInfo appInfo, NestedScrollView nestedScrollView) {
        super(appInfo, nestedScrollView);
        this.f149 = null;
        this.f148 = null;
        this.f149 = nestedScrollView;
        this.f148 = new 视图事件(nestedScrollView);
    }
}