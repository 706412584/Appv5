package i.runlibrary.app.v;

import android.view.View;
import android.widget.ScrollView;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class gd extends vg {
    public ViewEvent sj;
    public ScrollView st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public gd() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public gd(AppInfo appInfo, ScrollView scrollView) {
        super(appInfo, scrollView);
        this.st = null;
        this.sj = null;
        this.st = scrollView;
        this.sj = new ViewEvent(this.v);
    }

    public final gd gd(Object obj) {
        ScrollView scrollView = this.st;
        if (scrollView == null) {
            return null;
        }
        int intValue;
        if (obj instanceof Number) {
            intValue = ((Number) obj).intValue();
        } else {
            String obj2 = obj.toString();
            intValue = obj2.equalsIgnoreCase("down") ? 130 : obj2.equalsIgnoreCase("up") ? 33 : obj2.equalsIgnoreCase("left") ? 17 : obj2.equalsIgnoreCase("right") ? 66 : Integer.parseInt(obj2);
        }
        return scrollView.fullScroll(intValue);
    }

    public final void gdwz(Object obj, Object obj2) {
        ScrollView scrollView = this.st;
        if (scrollView != null) {
            scrollView.smoothScrollTo(s.a(this.a, obj), s.a(this.a, obj2));
        }
    }

    public final int gdwzx() {
        ScrollView scrollView = this.st;
        return scrollView == null ? -1 : scrollView.getScrollX();
    }

    public final int gdwzy() {
        ScrollView scrollView = this.st;
        return scrollView == null ? -1 : scrollView.getScrollY();
    }

    public final void jgdwz(Object obj, Object obj2) {
        ScrollView scrollView = this.st;
        if (scrollView != null) {
            scrollView.smoothScrollBy(s.a(this.a, obj), s.a(this.a, obj2));
        }
    }
}