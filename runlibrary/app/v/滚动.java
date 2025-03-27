package i.runlibrary.app.v;

import android.view.View;
import android.widget.ScrollView;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class 滚动 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f175;
    /* renamed from: 视图 */
    public ScrollView f176;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 滚动() {
        this.f176 = null;
        this.f175 = null;
        this.f175 = new 视图事件(null);
    }

    public 滚动(AppInfo appInfo, ScrollView scrollView) {
        super(appInfo, scrollView);
        this.f176 = null;
        this.f175 = null;
        this.f176 = scrollView;
        this.f175 = new 视图事件(scrollView);
    }

    /* renamed from: 加滚动位置 */
    public final void m833(Object obj, Object obj2) {
        ScrollView scrollView = this.f176;
        if (scrollView != null) {
            scrollView.smoothScrollBy(s.a(this.a, obj), s.a(this.a, obj2));
        }
    }

    /* renamed from: 滚动 */
    public final boolean m834(Object obj) {
        ScrollView scrollView = this.f176;
        if (scrollView == null) {
            return false;
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

    /* renamed from: 滚动位置 */
    public final void m809(Object obj, Object obj2) {
        ScrollView scrollView = this.f176;
        if (scrollView != null) {
            scrollView.smoothScrollTo(s.a(this.a, obj), s.a(this.a, obj2));
        }
    }

    /* renamed from: 滚动位置x */
    public final int m810x() {
        ScrollView scrollView = this.f176;
        return scrollView == null ? -1 : scrollView.getScrollX();
    }

    /* renamed from: 滚动位置y */
    public final int m811y() {
        ScrollView scrollView = this.f176;
        return scrollView == null ? -1 : scrollView.getScrollY();
    }
}