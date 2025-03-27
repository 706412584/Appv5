package i.runlibrary.app.v;

import android.view.View;
import android.widget.TableLayout;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class bgbj extends xxbj {
    public ViewEvent sj;
    public TableLayout st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public bgbj() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public bgbj(AppInfo appInfo, TableLayout tableLayout) {
        super(appInfo, tableLayout);
        this.st = null;
        this.sj = null;
        this.st = tableLayout;
        this.sj = new ViewEvent(this.v);
    }

    public final boolean kssl(Object obj) {
        TableLayout tableLayout = this.st;
        return tableLayout == null ? false : tableLayout.isColumnShrinkable(s.d(obj));
    }

    public final boolean kszl(Object obj) {
        TableLayout tableLayout = this.st;
        return tableLayout == null ? false : tableLayout.isColumnStretchable(s.d(obj));
    }

    public final boolean qbkssl() {
        TableLayout tableLayout = this.st;
        return tableLayout == null ? false : tableLayout.isShrinkAllColumns();
    }

    public final boolean qbkszl() {
        TableLayout tableLayout = this.st;
        return tableLayout == null ? false : tableLayout.isStretchAllColumns();
    }

    public final void szkssl(Object obj) {
        TableLayout tableLayout = this.st;
        if (tableLayout != null) {
            tableLayout.setShrinkAllColumns(obj.equals(Boolean.valueOf(true)));
        }
    }

    public final void szkssl(Object obj, Object obj2) {
        TableLayout tableLayout = this.st;
        if (tableLayout != null) {
            tableLayout.setColumnShrinkable(s.d(obj), obj2.equals(Boolean.valueOf(true)));
        }
    }

    public final void szkszl(Object obj) {
        TableLayout tableLayout = this.st;
        if (tableLayout != null) {
            tableLayout.setStretchAllColumns(obj.equals(Boolean.valueOf(true)));
        }
    }

    public final void szkszl(Object obj, Object obj2) {
        TableLayout tableLayout = this.st;
        if (tableLayout != null) {
            tableLayout.setColumnStretchable(s.d(obj), obj2.equals(Boolean.valueOf(true)));
        }
    }

    public final void szycl(Object obj, Object obj2) {
        TableLayout tableLayout = this.st;
        if (tableLayout != null) {
            tableLayout.setColumnCollapsed(s.d(obj), obj2.equals(Boolean.valueOf(true)));
        }
    }

    public final boolean ycl(Object obj) {
        TableLayout tableLayout = this.st;
        return tableLayout == null ? false : tableLayout.isColumnCollapsed(s.d(obj));
    }
}