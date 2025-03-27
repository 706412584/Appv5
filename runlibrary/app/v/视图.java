package i.runlibrary.app.v;

import android.view.View;
import i.runlibrary.app.AppInfo;

public final class 视图 extends 基础 {
    /* renamed from: 事件 */
    public 视图事件 f183;
    /* renamed from: 视图 */
    public View f184;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 视图() {
        this.f184 = null;
        this.f183 = null;
        this.f183 = new 视图事件(null);
    }

    public 视图(AppInfo appInfo, View view) {
        super(appInfo, view);
        this.f184 = null;
        this.f183 = null;
        this.f184 = view;
        this.f183 = new 视图事件(view);
    }
}