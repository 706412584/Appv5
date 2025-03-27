package i.runlibrary.app.v;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import i.runlibrary.app.AppInfo;

public final class 浮动动作按钮 extends 图像按钮 {
    /* renamed from: 事件 */
    public 视图事件 f173;
    /* renamed from: 视图 */
    public FloatingActionButton f174;

    public class 视图事件 extends i.runlibrary.app.v.图像按钮.视图事件 {
        private FloatingActionButton d = null;

        public 视图事件(FloatingActionButton floatingActionButton) {
            super(floatingActionButton);
            this.d = floatingActionButton;
        }
    }

    public 浮动动作按钮() {
        this.f174 = null;
        this.f173 = null;
        this.f173 = new 视图事件(null);
    }

    public 浮动动作按钮(AppInfo appInfo, FloatingActionButton floatingActionButton) {
        super(appInfo, floatingActionButton);
        this.f174 = null;
        this.f173 = null;
        this.f174 = floatingActionButton;
        this.f173 = new 视图事件(floatingActionButton);
    }
}