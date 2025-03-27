package i.runlibrary.app.v;

import android.view.View;
import i.runlibrary.app.AppInfo;

public final class st extends VC {
    public ViewEvent sj;
    public View st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public st() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public st(AppInfo appInfo, View view) {
        super(appInfo, view);
        this.st = null;
        this.sj = null;
        this.st = view;
        this.sj = new ViewEvent(this.v);
    }
}