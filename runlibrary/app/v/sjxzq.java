package i.runlibrary.app.v;

import android.view.View;
import android.widget.TimePicker;
import i.runlibrary.app.AppInfo;

public final class sjxzq extends vg {
    public ViewEvent sj;
    public TimePicker st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public sjxzq() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public sjxzq(AppInfo appInfo, TimePicker timePicker) {
        super(appInfo, timePicker);
        this.st = null;
        this.sj = null;
        this.st = timePicker;
        this.sj = new ViewEvent(this.v);
    }

    public final int fz() {
        TimePicker timePicker = this.st;
        return timePicker == null ? -1 : timePicker.getCurrentMinute().intValue();
    }

    public final String sj() {
        return this.st == null ? null : this.st.getCurrentHour() + ":" + this.st.getCurrentMinute();
    }

    public final int xs() {
        TimePicker timePicker = this.st;
        return timePicker == null ? -1 : timePicker.getCurrentHour().intValue();
    }
}