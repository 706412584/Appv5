package i.runlibrary.app.v;

import android.view.View;
import android.widget.RadioGroup;
import i.runlibrary.app.AppInfo;

public final class 单选布局 extends 线性布局 {
    /* renamed from: 事件 */
    public 视图事件 f136;
    /* renamed from: 视图 */
    public RadioGroup f137;

    public class 视图事件 extends i.runlibrary.app.v.线性布局.视图事件 {
        private View c = null;

        public 视图事件(View view) {
            super(view);
            this.c = view;
        }
    }

    public 单选布局() {
        this.f137 = null;
        this.f136 = null;
        this.f136 = new 视图事件(null);
    }

    public 单选布局(AppInfo appInfo, RadioGroup radioGroup) {
        super(appInfo, radioGroup);
        this.f137 = null;
        this.f136 = null;
        this.f137 = radioGroup;
        this.f136 = new 视图事件(radioGroup);
    }
}