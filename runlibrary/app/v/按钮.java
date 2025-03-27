package i.runlibrary.app.v;

import android.widget.Button;
import i.runlibrary.app.AppInfo;

public class 按钮 extends 文本 {
    /* renamed from: 事件 */
    public 视图事件 f138;
    /* renamed from: 视图 */
    public Button f139;

    public class 视图事件 extends i.runlibrary.app.v.文本.视图事件 {
        private Button a = null;

        public 视图事件(Button button) {
            super(button);
            this.a = button;
        }
    }

    public 按钮() {
        this.f139 = null;
        this.f138 = null;
        this.f138 = new 视图事件(null);
    }

    public 按钮(AppInfo appInfo, Button button) {
        super(appInfo, button);
        this.f139 = null;
        this.f138 = null;
        this.f139 = button;
        this.f138 = new 视图事件(button);
    }
}