package i.runlibrary.app.v;

import android.widget.ListView;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.c.a;

public class lb extends lbs {
    public ViewEvent sj;
    public ListView st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private ListView b = null;

        public ViewEvent(ListView listView) {
            super(listView);
            this.b = listView;
        }
    }

    public lb() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public lb(AppInfo appInfo, ListView listView) {
        super(appInfo, listView);
        this.st = null;
        this.sj = null;
        this.st = listView;
        this.sj = new ViewEvent(listView);
    }

    public int dykjxm() {
        ListView listView = this.st;
        return listView == null ? -1 : listView.getFirstVisiblePosition();
    }

    public void fgxgd(String str) {
        ListView listView = this.st;
        if (listView != null) {
            listView.setDividerHeight(s.a(this.a, (Object) str));
        }
    }

    public void fgxys(Object obj) {
        if (this.st != null) {
            this.st.setDivider(a.a(obj, this.a.c));
        }
    }

    public boolean lbhddb(Object obj) {
        int zhkjxm = zhkjxm();
        return zhkjxm != -1 && zhkjxm > this.st.getCount() - s.d(obj);
    }

    public int lbxmzs() {
        ListView listView = this.st;
        return listView == null ? -1 : listView.getCount();
    }

    public int zhkjxm() {
        ListView listView = this.st;
        return listView == null ? -1 : listView.getLastVisiblePosition();
    }
}