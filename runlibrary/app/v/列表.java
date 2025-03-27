package i.runlibrary.app.v;

import android.widget.ListView;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.c.a;

public class 列表 extends 列表操作 {
    /* renamed from: 事件 */
    public 视图事件 f130;
    /* renamed from: 视图 */
    public ListView f131;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private ListView b = null;

        public 视图事件(ListView listView) {
            super(listView);
            this.b = listView;
        }
    }

    public 列表() {
        this.f131 = null;
        this.f130 = null;
        this.f130 = new 视图事件(null);
    }

    public 列表(AppInfo appInfo, ListView listView) {
        super(appInfo, listView);
        this.f131 = null;
        this.f130 = null;
        this.f131 = listView;
        this.f130 = new 视图事件(listView);
    }

    /* renamed from: 分割线颜色 */
    public void m731(Object obj) {
        if (this.f131 != null) {
            this.f131.setDivider(a.a(obj, this.a.c));
        }
    }

    /* renamed from: 分割线高度 */
    public void m732(String str) {
        ListView listView = this.f131;
        if (listView != null) {
            listView.setDividerHeight(s.a(this.a, (Object) str));
        }
    }

    /* renamed from: 列表滑动底部 */
    public boolean m517(Object obj) {
        int 最后可见项目 = m519();
        return 最后可见项目 != -1 && 最后可见项目 > this.f131.getCount() - s.d(obj);
    }

    /* renamed from: 列表项目总数 */
    public int m502() {
        ListView listView = this.f131;
        return listView == null ? -1 : listView.getCount();
    }

    /* renamed from: 最后可见项目 */
    public int m519() {
        ListView listView = this.f131;
        return listView == null ? -1 : listView.getLastVisiblePosition();
    }

    /* renamed from: 第一可见项目 */
    public int m520() {
        ListView listView = this.f131;
        return listView == null ? -1 : listView.getFirstVisiblePosition();
    }
}