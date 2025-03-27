package i.runlibrary.app.v;

import android.view.View;
import android.widget.RadioGroup;
import i.runlibrary.app.AppInfo;

public final class dxbj extends xxbj {
    public ViewEvent sj;
    public RadioGroup st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public dxbj() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public dxbj(AppInfo appInfo, RadioGroup radioGroup) {
        super(appInfo, radioGroup);
        this.st = null;
        this.sj = null;
        this.st = radioGroup;
        this.sj = new ViewEvent(this.v);
    }
}