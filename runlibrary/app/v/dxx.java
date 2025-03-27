package i.runlibrary.app.v;

import android.widget.RadioButton;
import i.runlibrary.app.AppInfo;

public final class dxx extends an {
    public ViewEvent sj;
    public RadioButton st;

    public class ViewEvent extends i.runlibrary.app.v.an.ViewEvent {
        private RadioButton d = null;

        public ViewEvent(RadioButton radioButton) {
            super(radioButton);
            this.d = radioButton;
        }
    }

    public dxx() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public dxx(AppInfo appInfo, RadioButton radioButton) {
        super(appInfo, radioButton);
        this.st = null;
        this.sj = null;
        this.st = radioButton;
        this.sj = new ViewEvent(radioButton);
    }

    public final void xzzt(Object obj) {
        RadioButton radioButton = this.st;
        if (radioButton != null) {
            radioButton.setChecked(obj.equals(Boolean.valueOf(true)));
        }
    }

    public final boolean xzzt() {
        RadioButton radioButton = this.st;
        return radioButton == null ? false : radioButton.isChecked();
    }
}