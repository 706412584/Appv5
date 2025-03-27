package i.runlibrary.app.v;

import android.view.View;
import android.widget.DatePicker;
import i.runlibrary.app.AppInfo;

public final class rqxzq extends vg {
    public ViewEvent sj;
    public DatePicker st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public rqxzq() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public rqxzq(AppInfo appInfo, DatePicker datePicker) {
        super(appInfo, datePicker);
        this.st = null;
        this.sj = null;
        this.st = datePicker;
        this.sj = new ViewEvent(this.v);
    }

    public final int n() {
        DatePicker datePicker = this.st;
        return datePicker == null ? -1 : datePicker.getYear();
    }

    public final int r() {
        DatePicker datePicker = this.st;
        return datePicker == null ? -1 : datePicker.getDayOfMonth();
    }

    public final String rq() {
        if (this.st == null) {
            return null;
        }
        String str = "-";
        return this.st.getYear() + str + (this.st.getMonth() + 1) + str + this.st.getDayOfMonth();
    }

    public final int y() {
        DatePicker datePicker = this.st;
        return datePicker == null ? -1 : datePicker.getMonth() + 1;
    }
}