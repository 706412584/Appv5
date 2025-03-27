package i.runlibrary.app.v;

import android.view.View;
import android.widget.FrameLayout;
import i.runlibrary.app.AppInfo;

public final class zbj extends vg {
    public ViewEvent sj;
    public FrameLayout st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public zbj() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public zbj(AppInfo appInfo, FrameLayout frameLayout) {
        super(appInfo, frameLayout);
        this.st = null;
        this.sj = null;
        this.st = frameLayout;
        this.sj = new ViewEvent(this.v);
    }
}