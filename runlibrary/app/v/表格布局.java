package i.runlibrary.app.v;

import android.view.View;
import android.widget.TableLayout;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class 表格布局 extends 线性布局 {
    /* renamed from: 事件 */
    public 视图事件 f181;
    /* renamed from: 视图 */
    public TableLayout f182;

    public class 视图事件 extends i.runlibrary.app.v.线性布局.视图事件 {
        private View c = null;

        public 视图事件(View view) {
            super(view);
            this.c = view;
        }
    }

    public 表格布局() {
        this.f182 = null;
        this.f181 = null;
        this.f181 = new 视图事件(null);
    }

    public 表格布局(AppInfo appInfo, TableLayout tableLayout) {
        super(appInfo, tableLayout);
        this.f182 = null;
        this.f181 = null;
        this.f182 = tableLayout;
        this.f181 = new 视图事件(tableLayout);
    }

    /* renamed from: 全部可伸展列 */
    public final boolean m841() {
        TableLayout tableLayout = this.f182;
        return tableLayout == null ? false : tableLayout.isStretchAllColumns();
    }

    /* renamed from: 全部可收缩列 */
    public final boolean m842() {
        TableLayout tableLayout = this.f182;
        return tableLayout == null ? false : tableLayout.isShrinkAllColumns();
    }

    /* renamed from: 可伸展列 */
    public final boolean m843(Object obj) {
        TableLayout tableLayout = this.f182;
        return tableLayout == null ? false : tableLayout.isColumnStretchable(s.d(obj));
    }

    /* renamed from: 可收缩列 */
    public final boolean m844(Object obj) {
        TableLayout tableLayout = this.f182;
        return tableLayout == null ? false : tableLayout.isColumnShrinkable(s.d(obj));
    }

    /* renamed from: 设置可伸展列 */
    public final void m845(Object obj) {
        TableLayout tableLayout = this.f182;
        if (tableLayout != null) {
            tableLayout.setStretchAllColumns(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 设置可伸展列 */
    public final void m846(Object obj, Object obj2) {
        TableLayout tableLayout = this.f182;
        if (tableLayout != null) {
            tableLayout.setColumnStretchable(s.d(obj), obj2.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 设置可收缩列 */
    public final void m847(Object obj) {
        TableLayout tableLayout = this.f182;
        if (tableLayout != null) {
            tableLayout.setShrinkAllColumns(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 设置可收缩列 */
    public final void m848(Object obj, Object obj2) {
        TableLayout tableLayout = this.f182;
        if (tableLayout != null) {
            tableLayout.setColumnShrinkable(s.d(obj), obj2.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 设置隐藏列 */
    public final void m849(Object obj, Object obj2) {
        TableLayout tableLayout = this.f182;
        if (tableLayout != null) {
            tableLayout.setColumnCollapsed(s.d(obj), obj2.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 隐藏列 */
    public final boolean m850(Object obj) {
        TableLayout tableLayout = this.f182;
        return tableLayout == null ? false : tableLayout.isColumnCollapsed(s.d(obj));
    }
}