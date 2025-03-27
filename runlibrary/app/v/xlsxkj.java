package i.runlibrary.app.v;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class xlsxkj extends vg {
    public ViewEvent sj;
    public SwipeRefreshLayout st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public xlsxkj() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public xlsxkj(AppInfo appInfo, SwipeRefreshLayout swipeRefreshLayout) {
        super(appInfo, swipeRefreshLayout);
        this.st = null;
        this.sj = null;
        this.st = swipeRefreshLayout;
        this.sj = new ViewEvent(this.v);
    }

    public final void jdtys(Object obj) {
        if (this.st != null) {
            String[] e = s.e(obj.toString());
            int[] iArr = new int[e.length];
            for (int i = 0; i < e.length; i++) {
                iArr[i] = ClientsUDP.a(e[i]);
            }
            ((SwipeRefreshLayout) this.v).setColorSchemeColors(iArr);
        }
    }

    public final void kg(Object obj) {
        SwipeRefreshLayout swipeRefreshLayout = this.st;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(obj.equals(Boolean.valueOf(true)));
        }
    }

    public final boolean kg() {
        SwipeRefreshLayout swipeRefreshLayout = this.st;
        return swipeRefreshLayout == null ? false : swipeRefreshLayout.isRefreshing();
    }
}