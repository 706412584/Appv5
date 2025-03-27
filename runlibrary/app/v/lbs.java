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

public class lbs extends vg {
    private UserAdapter b;
    public ViewEvent sj;
    public AbsListView st;

    public interface OnUserAdapterView {
        void getView(UserAdapter userAdapter, int i, View view);
    }

    public class UserAdapter extends BaseAdapter {
        int a;
        Class b;
        iActivity c;
        private AppInfo e;
        private i f;
        private OnUserAdapterView g;
        private LayoutInflater h;
        private c i;
        public ArrayList list_S = new ArrayList();

        public UserAdapter(AppInfo appInfo, Class cls, int i, OnUserAdapterView onUserAdapterView) {
            this.e = appInfo;
            this.b = cls;
            this.a = i;
            this.g = onUserAdapterView;
            this.h = LayoutInflater.from(appInfo.c);
            this.c = a.a(appInfo, cls);
            this.f = new i(appInfo.c, (BaseAdapter) this);
        }

        public int getCount() {
            return this.list_S.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                this.i = new c(this, (byte) 0);
                view = this.h.inflate(this.a, null);
                view.setTag(new Object[]{this.i, this, Integer.valueOf(i)});
            } else {
                Object[] objArr = (Object[]) view.getTag();
                this.i = (c) objArr[0];
                objArr[2] = Integer.valueOf(i);
                view.setTag(objArr);
            }
            for (Entry entry : ((HashMap) this.list_S.get(i)).entrySet()) {
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

        public Object hq(Object obj, Object obj2) {
            return ((HashMap) this.list_S.get(s.d(obj))).get(Integer.valueOf(s.d(obj2)));
        }

        public HashMap hq(Object obj) {
            return (HashMap) this.list_S.get(s.d(obj));
        }

        public boolean j(Object obj, Object obj2) {
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
                        this.list_S.add(hashMap);
                        return true;
                    }
                }
            }
            return false;
        }

        public void sc() {
            this.list_S.clear();
        }

        public boolean sc(Object obj) {
            if (obj instanceof HashMap) {
                return this.list_S.remove(obj);
            }
            try {
                this.list_S.remove(s.d(obj));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public void sx() {
            notifyDataSetChanged();
        }

        public boolean sz(Object obj, Object obj2) {
            if (obj2 instanceof HashMap) {
                try {
                    this.list_S.set(s.d(obj), (HashMap) obj2);
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }

        public boolean sz(Object obj, Object obj2, Object obj3) {
            try {
                ((HashMap) this.list_S.get(s.d(obj))).put(Integer.valueOf(s.d(obj2)), obj3);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }

        public int zs() {
            return this.list_S.size();
        }
    }

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private AbsListView b = null;

        public ViewEvent(AbsListView absListView) {
            super(absListView);
            this.b = absListView;
        }
    }

    public lbs() {
        this.st = null;
        this.sj = null;
        this.b = null;
        this.sj = new ViewEvent(null);
    }

    public lbs(AppInfo appInfo, AbsListView absListView) {
        super(appInfo, absListView);
        this.st = null;
        this.sj = null;
        this.b = null;
        this.st = absListView;
        this.sj = new ViewEvent(absListView);
    }

    public Object dqxzxm() {
        AbsListView absListView = this.st;
        return absListView == null ? null : absListView.getSelectedItem();
    }

    public int dqzsxmxh() {
        AbsListView absListView = this.st;
        return absListView == null ? -1 : absListView.getLastVisiblePosition();
    }

    public void lbhcysts(Object obj) {
        AbsListView absListView = this.st;
        if (absListView != null) {
            absListView.setCacheColorHint(ClientsUDP.a(obj));
        }
    }

    public UserAdapter lbspq(Object obj, Object obj2) {
        return lbspq(obj, obj2, null);
    }

    public UserAdapter lbspq(Object obj, Object obj2, OnUserAdapterView onUserAdapterView) {
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
        UserAdapter userAdapter = this.b;
        if (userAdapter != null && userAdapter.a == d && this.b.b.equals(a)) {
            return this.b;
        }
        UserAdapter userAdapter2 = new UserAdapter(this.a, a, d, onUserAdapterView);
        this.b = userAdapter2;
        this.st.setAdapter(userAdapter2);
        return this.b;
    }

    public int lbxmzs() {
        AbsListView absListView = this.st;
        return absListView == null ? -1 : absListView.getCount();
    }

    public void lbxzbj(Object obj) {
        if (this.st != null) {
            this.st.setSelector(a.a(obj, this.a.c));
        }
    }

    public void xzwz(Object obj) {
        AbsListView absListView = this.st;
        if (absListView != null) {
            int intValue;
            if (obj instanceof Number) {
                intValue = ((Number) obj).intValue();
            } else {
                String obj2 = obj.toString();
                intValue = obj2.equalsIgnoreCase("top") ? this.st.getTop() : obj2.equalsIgnoreCase("bottom") ? this.st.getBottom() : obj2.equalsIgnoreCase("left") ? this.st.getLeft() : obj2.equalsIgnoreCase("right") ? this.st.getRight() : Integer.parseInt(obj2);
            }
            absListView.setSelection(intValue);
        }
    }
}