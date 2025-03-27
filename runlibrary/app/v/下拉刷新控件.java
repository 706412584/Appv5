package i.runlibrary.app.v;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class 下拉刷新控件 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f124;
    /* renamed from: 视图 */
    public SwipeRefreshLayout f125;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 下拉刷新控件() {
        this.f125 = null;
        this.f124 = null;
        this.f124 = new 视图事件(null);
    }

    public 下拉刷新控件(AppInfo appInfo, SwipeRefreshLayout swipeRefreshLayout) {
        super(appInfo, swipeRefreshLayout);
        this.f125 = null;
        this.f124 = null;
        this.f125 = swipeRefreshLayout;
        this.f124 = new 视图事件(swipeRefreshLayout);
    }

    /* renamed from: 开关 */
    public final void m717(Object obj) {
        SwipeRefreshLayout swipeRefreshLayout = this.f125;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 开关 */
    public final boolean m718() {
        SwipeRefreshLayout swipeRefreshLayout = this.f125;
        return swipeRefreshLayout == null ? false : swipeRefreshLayout.isRefreshing();
    }

    /* renamed from: 进度条颜色 */
    public final void m719(Object obj) {
        if (this.f125 != null) {
            String[] e = s.e(obj.toString());
            int[] iArr = new int[e.length];
            for (int i = 0; i < e.length; i++) {
                iArr[i] = ClientsUDP.a(e[i]);
            }
            this.f125.setColorSchemeColors(iArr);
        }
    }
}