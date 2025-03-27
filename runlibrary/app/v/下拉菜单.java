package i.runlibrary.app.v;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import java.util.ArrayList;

public final class 下拉菜单 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f126;
    /* renamed from: 视图 */
    public Spinner f127;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 下拉菜单() {
        this.f127 = null;
        this.f126 = null;
        this.f126 = new 视图事件(null);
    }

    public 下拉菜单(AppInfo appInfo, Spinner spinner) {
        super(appInfo, spinner);
        this.f127 = null;
        this.f126 = null;
        this.f127 = spinner;
        this.f126 = new 视图事件(spinner);
    }

    /* renamed from: 列表项目总数 */
    public final int m502() {
        Spinner spinner = this.f127;
        return spinner == null ? -1 : spinner.getCount();
    }

    /* renamed from: 初始化 */
    public final void m720(Object obj) {
        if (obj != null) {
            if (this.f127 != null) {
                ArrayAdapter arrayAdapter;
                if (obj instanceof ArrayList) {
                    arrayAdapter = new ArrayAdapter(this.a.c, 17367048, (ArrayList) obj);
                } else if (obj instanceof String[]) {
                    arrayAdapter = new ArrayAdapter(this.a.c, 17367048, (String[]) obj);
                } else if (obj instanceof Object[]) {
                    arrayAdapter = new ArrayAdapter(this.a.c, 17367048, (Object[]) obj);
                } else {
                    arrayAdapter = new ArrayAdapter(this.a.c, 17367048, new Object[]{obj});
                }
                arrayAdapter.setDropDownViewResource(17367049);
                this.f127.setAdapter(arrayAdapter);
            }
        }
    }

    /* renamed from: 当前展示项目序号 */
    public final int m503() {
        Spinner spinner = this.f127;
        return spinner == null ? -1 : spinner.getLastVisiblePosition();
    }

    /* renamed from: 当前选择项目 */
    public final Object m721() {
        Spinner spinner = this.f127;
        return spinner == null ? null : spinner.getSelectedItem();
    }

    /* renamed from: 选中位置 */
    public final void m722(Object obj) {
        Spinner spinner = this.f127;
        if (spinner != null) {
            spinner.setSelection(s.d(obj));
        }
    }

    /* renamed from: 选中位置 */
    public final void m723(Object obj, Object obj2) {
        Spinner spinner = this.f127;
        if (spinner != null) {
            spinner.setSelection(s.d(obj), obj2.equals(Boolean.valueOf(true)));
        }
    }
}