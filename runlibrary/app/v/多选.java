package i.runlibrary.app.v;

import android.widget.CheckBox;
import i.runlibrary.app.AppInfo;

public final class 多选 extends 按钮 {
    /* renamed from: 事件 */
    public 视图事件 f146;
    /* renamed from: 视图 */
    public CheckBox f147;

    public class 视图事件 extends i.runlibrary.app.v.按钮.视图事件 {
        private CheckBox d = null;

        public 视图事件(CheckBox checkBox) {
            super(checkBox);
            this.d = checkBox;
        }
    }

    public 多选() {
        this.f147 = null;
        this.f146 = null;
        this.f146 = new 视图事件(null);
    }

    public 多选(AppInfo appInfo, CheckBox checkBox) {
        super(appInfo, checkBox);
        this.f147 = null;
        this.f146 = null;
        this.f147 = checkBox;
        this.f146 = new 视图事件(checkBox);
    }

    /* renamed from: 选中状态 */
    public final void m749(Object obj) {
        CheckBox checkBox = this.f147;
        if (checkBox != null) {
            checkBox.setChecked(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 选中状态 */
    public final boolean m750() {
        CheckBox checkBox = this.f147;
        return checkBox == null ? false : checkBox.isChecked();
    }
}