package i.runlibrary.app.v;

import android.view.View;
import android.widget.HorizontalScrollView;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public class 水平滚动 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f167;
    /* renamed from: 视图 */
    public HorizontalScrollView f168;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 水平滚动() {
        this.f168 = null;
        this.f167 = null;
        this.f167 = new 视图事件(null);
    }

    public 水平滚动(AppInfo appInfo, HorizontalScrollView horizontalScrollView) {
        super(appInfo, horizontalScrollView);
        this.f168 = null;
        this.f167 = null;
        this.f168 = horizontalScrollView;
        this.f167 = new 视图事件(horizontalScrollView);
    }

    /* renamed from: 加滚动位置 */
    public void m807(Object obj, Object obj2) {
        HorizontalScrollView horizontalScrollView = this.f168;
        if (horizontalScrollView != null) {
            horizontalScrollView.smoothScrollBy(s.d(obj), s.d(obj2));
        }
    }

    /* renamed from: 滚动 */
    public boolean m808(Object obj) {
        HorizontalScrollView horizontalScrollView = this.f168;
        if (horizontalScrollView == null) {
            return false;
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

    /* renamed from: 滚动位置 */
    public void m809(Object obj, Object obj2) {
        HorizontalScrollView horizontalScrollView = this.f168;
        if (horizontalScrollView != null) {
            horizontalScrollView.smoothScrollTo(s.d(obj), s.d(obj2));
        }
    }

    /* renamed from: 滚动位置x */
    public int m810x() {
        HorizontalScrollView horizontalScrollView = this.f168;
        return horizontalScrollView == null ? -1 : horizontalScrollView.getScrollX();
    }

    /* renamed from: 滚动位置y */
    public int m811y() {
        HorizontalScrollView horizontalScrollView = this.f168;
        return horizontalScrollView == null ? -1 : horizontalScrollView.getScrollY();
    }
}