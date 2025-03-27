package i.runlibrary.app.v;

import android.view.View;
import android.widget.GridView;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class 网格视图 extends 列表操作 {
    /* renamed from: 事件 */
    public 视图事件 f179;
    /* renamed from: 视图 */
    public GridView f180;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 网格视图() {
        this.f180 = null;
        this.f179 = null;
        this.f179 = new 视图事件(null);
    }

    public 网格视图(AppInfo appInfo, GridView gridView) {
        super(appInfo, gridView);
        this.f180 = null;
        this.f179 = null;
        this.f180 = gridView;
        this.f179 = new 视图事件(gridView);
    }

    /* renamed from: 列宽 */
    public final void m840(Object obj) {
        GridView gridView = this.f180;
        if (gridView != null) {
            gridView.setColumnWidth(s.a(this.a, obj));
        }
    }

    /* renamed from: 对齐方式 */
    public final void m385(Object obj) {
        GridView gridView = this.f180;
        if (gridView != null) {
            gridView.setGravity(s.g(obj.toString()));
        }
    }
}