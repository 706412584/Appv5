package i.runlibrary.app.v;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import java.util.ArrayList;

public final class xlcd extends vg {
    public ViewEvent sj;
    public Spinner st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public xlcd() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public xlcd(AppInfo appInfo, Spinner spinner) {
        super(appInfo, spinner);
        this.st = null;
        this.sj = null;
        this.st = spinner;
        this.sj = new ViewEvent(this.v);
    }

    public final void csh(Object obj) {
        if (obj != null) {
            if (this.st != null) {
                ArrayAdapter arrayAdapter;
                if (obj instanceof ArrayList) {
                    arrayAdapter = new ArrayAdapter(this.a.c, 17367048, (ArrayList) obj);
                } else if (obj instanceof String[]) {
                    arrayAdapter = new ArrayAdapter(this.a.c, 17367048, (String[]) obj);
                } else if (obj instanceof Object[]) {
                    arrayAdapter = new ArrayAdapter(this.a.c, 17367048, (Object[]) obj);
                } else {
                    arrayAdapter = new ArrayAdapter(this.a.c, 17367048, new Object[]{obj});
                }
                arrayAdapter.setDropDownViewResource(17367049);
                this.st.setAdapter(arrayAdapter);
            }
        }
    }

    public final Object dqxzxm() {
        Spinner spinner = this.st;
        return spinner == null ? null : spinner.getSelectedItem();
    }

    public final int dqzsxmxh() {
        Spinner spinner = this.st;
        return spinner == null ? -1 : spinner.getLastVisiblePosition();
    }

    public final int lbxmzs() {
        Spinner spinner = this.st;
        return spinner == null ? -1 : spinner.getCount();
    }

    public final void xzwz(Object obj) {
        Spinner spinner = this.st;
        if (spinner != null) {
            spinner.setSelection(s.d(obj));
        }
    }

    public final void xzwz(Object obj, Object obj2) {
        Spinner spinner = this.st;
        if (spinner != null) {
            spinner.setSelection(s.d(obj), obj2.equals(Boolean.valueOf(true)));
        }
    }
}