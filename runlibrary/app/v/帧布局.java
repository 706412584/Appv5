package i.runlibrary.app.v;

import android.view.View;
import android.widget.FrameLayout;
import i.runlibrary.app.AppInfo;

public final class 帧布局 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f153;
    /* renamed from: 视图 */
    public FrameLayout f154;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 帧布局() {
        this.f154 = null;
        this.f153 = null;
        this.f153 = new 视图事件(null);
    }

    public 帧布局(AppInfo appInfo, FrameLayout frameLayout) {
        super(appInfo, frameLayout);
        this.f154 = null;
        this.f153 = null;
        this.f154 = frameLayout;
        this.f153 = new 视图事件(frameLayout);
    }
}