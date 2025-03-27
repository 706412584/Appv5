package i.runlibrary.app.v;

import android.widget.RadioButton;
import i.runlibrary.app.AppInfo;

public final class 单选项 extends 按钮 {
    /* renamed from: 事件 */
    public 视图事件 f140;
    /* renamed from: 视图 */
    public RadioButton f141;

    public class 视图事件 extends i.runlibrary.app.v.按钮.视图事件 {
        private RadioButton d = null;

        public 视图事件(RadioButton radioButton) {
            super(radioButton);
            this.d = radioButton;
        }
    }

    public 单选项() {
        this.f141 = null;
        this.f140 = null;
        this.f140 = new 视图事件(null);
    }

    public 单选项(AppInfo appInfo, RadioButton radioButton) {
        super(appInfo, radioButton);
        this.f141 = null;
        this.f140 = null;
        this.f141 = radioButton;
        this.f140 = new 视图事件(radioButton);
    }

    /* renamed from: 选中状态 */
    public final void m740(Object obj) {
        RadioButton radioButton = this.f141;
        if (radioButton != null) {
            radioButton.setChecked(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 选中状态 */
    public final boolean m741() {
        RadioButton radioButton = this.f141;
        return radioButton == null ? false : radioButton.isChecked();
    }
}