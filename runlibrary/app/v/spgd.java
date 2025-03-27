package i.runlibrary.app.v;

import android.view.View;
import android.widget.HorizontalScrollView;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public class spgd extends vg {
    public ViewEvent sj;
    public HorizontalScrollView st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public spgd() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public spgd(AppInfo appInfo, HorizontalScrollView horizontalScrollView) {
        super(appInfo, horizontalScrollView);
        this.st = null;
        this.sj = null;
        this.st = horizontalScrollView;
        this.sj = new ViewEvent(this.v);
    }

    public gd gd(Object obj) {
        HorizontalScrollView horizontalScrollView = this.st;
        if (horizontalScrollView == null) {
            return null;
        }
        int intValue;
        if (obj instanceof Number) {
            intValue = ((Number) obj).intValue();
        } else {
            String obj2 = obj.toString();
            intValue = obj2.equalsIgnoreCase("down") ? 130 : obj2.equalsIgnoreCase("up") ? 33 : obj2.equalsIgnoreCase("left") ? 17 : obj2.equalsIgnoreCase("right") ? 66 : Integer.parseInt(obj2);
        }
        return horizontalScrollView.fullScroll(intValue);
    }

    public void gdwz(Object obj, Object obj2) {
        HorizontalScrollView horizontalScrollView = this.st;
        if (horizontalScrollView != null) {
            horizontalScrollView.smoothScrollTo(s.a(this.a, obj), s.a(this.a, obj2));
        }
    }

    public int gdwzx() {
        HorizontalScrollView horizontalScrollView = this.st;
        return horizontalScrollView == null ? -1 : horizontalScrollView.getScrollX();
    }

    public int gdwzy() {
        HorizontalScrollView horizontalScrollView = this.st;
        return horizontalScrollView == null ? -1 : horizontalScrollView.getScrollY();
    }

    public void jgdwz(Object obj, Object obj2) {
        HorizontalScrollView horizontalScrollView = this.st;
        if (horizontalScrollView != null) {
            horizontalScrollView.smoothScrollBy(s.a(this.a, obj), s.a(this.a, obj2));
        }
    }
}