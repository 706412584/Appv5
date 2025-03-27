package i.runlibrary.app.v;

import android.view.View;
import android.widget.GridView;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class wgst extends lbs {
    public ViewEvent sj;
    public GridView st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public wgst() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public wgst(AppInfo appInfo, GridView gridView) {
        super(appInfo, gridView);
        this.st = null;
        this.sj = null;
        this.st = gridView;
        this.sj = new ViewEvent(this.v);
    }

    public final void dqfs(Object obj) {
        GridView gridView = this.st;
        if (gridView != null) {
            gridView.setGravity(s.g(obj.toString()));
        }
    }

    public final void lk(Object obj) {
        GridView gridView = this.st;
        if (gridView != null) {
            gridView.setColumnWidth(s.a(this.a, obj));
        }
    }
}