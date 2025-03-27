package i.runlibrary.app.v;

import android.widget.CheckBox;
import i.runlibrary.app.AppInfo;

public final class dx extends an {
    public ViewEvent sj;
    public CheckBox st;

    public class ViewEvent extends i.runlibrary.app.v.an.ViewEvent {
        private CheckBox d = null;

        public ViewEvent(CheckBox checkBox) {
            super(checkBox);
            this.d = checkBox;
        }
    }

    public dx() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public dx(AppInfo appInfo, CheckBox checkBox) {
        super(appInfo, checkBox);
        this.st = null;
        this.sj = null;
        this.st = checkBox;
        this.sj = new ViewEvent(checkBox);
    }

    public final void xzzt(Object obj) {
        CheckBox checkBox = this.st;
        if (checkBox != null) {
            checkBox.setChecked(obj.equals(Boolean.valueOf(true)));
        }
    }

    public final boolean xzzt() {
        CheckBox checkBox = this.st;
        return checkBox == null ? false : checkBox.isChecked();
    }
}