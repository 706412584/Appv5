package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.线性布局.线性布局规则;

public final class 表格项 extends 线性布局 {
    /* renamed from: 事件 */
    public 视图事件 f104;
    /* renamed from: 视图 */
    public TableRow f105;

    public class 表格项规则 extends 线性布局规则 {
        /* renamed from: 规则 */
        public LayoutParams f106;

        public 表格项规则(AppInfo appInfo, View view) {
            super(appInfo, view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.f106 = layoutParams;
            if (layoutParams == null) {
                this.f106 = new ViewGroup.LayoutParams(-2, -2);
            }
        }

        /* renamed from: 占据列 */
        public void m658(Object obj) {
            this.f106.span = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f106);
            }
        }

        /* renamed from: 在第几列 */
        public void m659(Object obj) {
            this.f106.column = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f106);
            }
        }
    }

    public class 视图事件 extends i.runlibrary.app.v.线性布局.视图事件 {
        private View c = null;

        public 视图事件(View view) {
            super(view);
            this.c = view;
        }
    }

    public 表格项() {
        this.f105 = null;
        this.f104 = null;
        this.f104 = new 视图事件(null);
    }

    public 表格项(AppInfo appInfo, TableRow tableRow) {
        super(appInfo, tableRow);
        this.f105 = null;
        this.f104 = null;
        this.f105 = tableRow;
        this.f104 = new 视图事件(tableRow);
    }
}