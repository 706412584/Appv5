package i.runlibrary.app.v;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import i.runlibrary.app.AppInfo;

public final class qtgd extends vg {
    public ViewEvent sj;
    public NestedScrollView st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public qtgd() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public qtgd(AppInfo appInfo, NestedScrollView nestedScrollView) {
        super(appInfo, nestedScrollView);
        this.st = null;
        this.sj = null;
        this.st = nestedScrollView;
        this.sj = new ViewEvent(this.v);
    }
}