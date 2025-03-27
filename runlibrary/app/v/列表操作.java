package i.runlibrary.app.v;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import i.app.ClientsUDP;
import i.app.FileProvider;
import i.app.iActivity;
import i.runlibrary.a.i;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.c.a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class 列表操作 extends 视图组 {
    private 适配器 b;
    /* renamed from: 事件 */
    public 视图事件 f84;
    /* renamed from: 视图 */
    public AbsListView f85;

    public interface OnUserAdapterView {
        void getView(适配器 适配器, int i, View view);
    }

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private AbsListView b = null;

        public 视图事件(AbsListView absListView) {
            super(absListView);
            this.b = absListView;
        }
    }

    public class 适配器 extends BaseAdapter {
        int a;
        Class b;
        iActivity c;
        private AppInfo e;
        private i f;
        private OnUserAdapterView g;
        private LayoutInflater h;
        private j i;
        /* renamed from: 列表数据 */
        public ArrayList f86 = new ArrayList();

        public 适配器(AppInfo appInfo, Class cls, int i, OnUserAdapterView onUserAdapterView) {
            this.e = appInfo;
            this.b = cls;
            this.a = i;
            this.g = onUserAdapterView;
            this.h = LayoutInflater.from(appInfo.c);
            this.c = a.a(appInfo, cls);
            this.f = new i(appInfo.c, (BaseAdapter) this);
        }

        public int getCount() {
            return this.f86.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                this.i = new j(this, (byte) 0);
                view = this.h.inflate(this.a, null);
                view.setTag(new Object[]{this.i, this, Integer.valueOf(i)});
            } else {
                Object[] objArr = (Object[]) view.getTag();
                this.i = (j) objArr[0];
                objArr[2] = Integer.valueOf(i);
                view.setTag(objArr);
            }
            for (Entry entry : ((HashMap) this.f86.get(i)).entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                if (intValue > 0) {
                    View view2 = (View) this.i.a.get(Integer.valueOf(intValue));
                    if (view2 == null) {
                        view2 = view.findViewById(intValue);
                        if (view2 != null) {
                            this.i.a.put(Integer.valueOf(intValue), view2);
                        }
                    }
                    if (view2 != null) {
                        a.a(view2, entry.getValue(), this.f);
                    }
                }
            }
            iActivity iactivity = this.c;
            if (iactivity != null) {
                iactivity._$_viewAutomaticSettingEvent(this.e.a, view);
            }
            OnUserAdapterView onUserAdapterView = this.g;
            if (onUserAdapterView != null) {
                onUserAdapterView.getView(this, i, view);
            }
            return view;
        }

        /* renamed from: 删除 */
        public void m506() {
            this.f86.clear();
        }

        /* renamed from: 删除 */
        public boolean m146(Object obj) {
            if (obj instanceof HashMap) {
                return this.f86.remove(obj);
            }
            try {
                this.f86.remove(s.d(obj));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: 刷新 */
        public void m507() {
            notifyDataSetChanged();
        }

        /* renamed from: 加 */
        public boolean m508(Object obj, Object obj2) {
            int i = 0;
            if (obj.getClass().isArray() && obj2.getClass().isArray()) {
                Class cls = obj.getClass();
                if (int[].class.equals(cls) || Integer[].class.equals(cls)) {
                    int length = Array.getLength(obj);
                    int length2 = Array.getLength(obj2);
                    if (length > 0 && length == length2) {
                        HashMap hashMap = new HashMap();
                        while (i < length) {
                            hashMap.put(Integer.valueOf(s.d(Array.get(obj, i))), Array.get(obj2, i));
                            i++;
                        }
                        this.f86.add(hashMap);
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: 总数 */
        public int m509() {
            return this.f86.size();
        }

        /* renamed from: 获取 */
        public Object m510(Object obj, Object obj2) {
            return ((HashMap) this.f86.get(s.d(obj))).get(Integer.valueOf(s.d(obj2)));
        }

        /* renamed from: 获取 */
        public HashMap m511(Object obj) {
            return (HashMap) this.f86.get(s.d(obj));
        }

        /* renamed from: 设置 */
        public boolean m512(Object obj, Object obj2) {
            if (obj2 instanceof HashMap) {
                try {
                    this.f86.set(s.d(obj), (HashMap) obj2);
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }

        /* renamed from: 设置 */
        public boolean m513(Object obj, Object obj2, Object obj3) {
            try {
                ((HashMap) this.f86.get(s.d(obj))).put(Integer.valueOf(s.d(obj2)), obj3);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    public 列表操作() {
        this.f85 = null;
        this.f84 = null;
        this.b = null;
        this.f84 = new 视图事件(null);
    }

    public 列表操作(AppInfo appInfo, AbsListView absListView) {
        super(appInfo, absListView);
        this.f85 = null;
        this.f84 = null;
        this.b = null;
        this.f85 = absListView;
        this.f84 = new 视图事件(absListView);
    }

    /* renamed from: 列表缓存颜色提示 */
    public void m498(Object obj) {
        AbsListView absListView = this.f85;
        if (absListView != null) {
            absListView.setCacheColorHint(ClientsUDP.a(obj));
        }
    }

    /* renamed from: 列表适配器 */
    public 适配器 m499(Object obj, Object obj2) {
        return m500(obj, obj2, null);
    }

    /* renamed from: 列表适配器 */
    public 适配器 m500(Object obj, Object obj2, OnUserAdapterView onUserAdapterView) {
        Object a;
        try {
            a = obj instanceof Class ? (Class) obj : FileProvider.a(this.a.c, String.valueOf(obj));
        } catch (Exception e) {
            e.printStackTrace();
            a = null;
        }
        if (a == null) {
            return null;
        }
        int d = s.d(obj2);
        适配器 适配器 = this.b;
        if (适配器 != null && 适配器.a == d && this.b.b.equals(a)) {
            return this.b;
        }
        适配器 适配器2 = new 适配器(this.a, a, d, onUserAdapterView);
        this.b = 适配器2;
        this.f85.setAdapter(适配器2);
        return this.b;
    }

    /* renamed from: 列表选中背景 */
    public void m501(Object obj) {
        if (this.f85 != null) {
            this.f85.setSelector(a.a(obj, this.a.c));
        }
    }

    /* renamed from: 列表项目总数 */
    public int m502() {
        AbsListView absListView = this.f85;
        return absListView == null ? -1 : absListView.getCount();
    }

    /* renamed from: 当前展示项目序号 */
    public int m503() {
        AbsListView absListView = this.f85;
        return absListView == null ? -1 : absListView.getLastVisiblePosition();
    }

    /* renamed from: 当前选择项目 */
    public Object m504() {
        AbsListView absListView = this.f85;
        return absListView == null ? null : absListView.getSelectedItem();
    }

    /* renamed from: 选择位置 */
    public void m505(Object obj) {
        AbsListView absListView = this.f85;
        if (absListView != null) {
            int intValue;
            if (obj instanceof Number) {
                intValue = ((Number) obj).intValue();
            } else {
                String obj2 = obj.toString();
                intValue = obj2.equalsIgnoreCase("top") ? this.f85.getTop() : obj2.equalsIgnoreCase("bottom") ? this.f85.getBottom() : obj2.equalsIgnoreCase("left") ? this.f85.getLeft() : obj2.equalsIgnoreCase("right") ? this.f85.getRight() : Integer.parseInt(obj2);
            }
            absListView.setSelection(intValue);
        }
    }
}