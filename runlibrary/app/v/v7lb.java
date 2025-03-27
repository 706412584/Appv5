package i.runlibrary.app.v;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
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

public final class v7lb extends vg {
    private UserAdapter b;
    public ViewEvent sj;
    public RecyclerView st;

    public interface OnUserAdapterView {
        void getView(UserAdapter userAdapter, int i, View view);
    }

    public class UserAdapter extends Adapter {
        int a;
        Class b;
        iActivity c;
        private AppInfo e;
        private i f;
        private OnUserAdapterView g;
        private LayoutInflater h;
        private LinearLayout i;
        public ArrayList list_S = new ArrayList();

        public UserAdapter(AppInfo appInfo, Class cls, int i, OnUserAdapterView onUserAdapterView) {
            this.e = appInfo;
            this.b = cls;
            this.a = i;
            this.g = onUserAdapterView;
            this.h = LayoutInflater.from(appInfo.c);
            this.i = new LinearLayout(appInfo.c);
            this.c = a.a(appInfo, cls);
            this.f = new i(appInfo.c, (Adapter) this);
        }

        public int getItemCount() {
            return this.list_S.size();
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

        public void onBindViewHolder(e eVar, int i) {
            eVar.a.setTag(new Object[]{eVar, this, Integer.valueOf(i)});
            for (Entry entry : ((HashMap) this.list_S.get(i)).entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                if (intValue > 0) {
                    View view = (View) eVar.b.get(Integer.valueOf(intValue));
                    if (view == null) {
                        view = eVar.a.findViewById(intValue);
                        if (view != null) {
                            eVar.b.put(Integer.valueOf(intValue), view);
                        }
                    }
                    if (view != null) {
                        a.a(view, entry.getValue(), this.f);
                    }
                }
            }
            iActivity iactivity = this.c;
            if (iactivity != null) {
                iactivity._$_viewAutomaticSettingEvent(this.e.a, eVar.a);
            }
            OnUserAdapterView onUserAdapterView = this.g;
            if (onUserAdapterView != null) {
                onUserAdapterView.getView(this, i, eVar.a);
            }
        }

        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new e(this, a.a(this.h, this.a, this.i));
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

        public void sx(int i) {
            notifyItemChanged(i);
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
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public v7lb() {
        this.st = null;
        this.sj = null;
        this.b = null;
        this.sj = new ViewEvent(null);
    }

    public v7lb(AppInfo appInfo, RecyclerView recyclerView) {
        super(appInfo, recyclerView);
        this.st = null;
        this.sj = null;
        this.b = null;
        this.st = recyclerView;
        this.sj = new ViewEvent(this.v);
    }

    public final int dqkjsl() {
        RecyclerView recyclerView = this.st;
        return recyclerView == null ? -1 : recyclerView.getLayoutManager().getChildCount();
    }

    public final int dykjxm() {
        RecyclerView recyclerView = this.st;
        if (recyclerView == null) {
            return -1;
        }
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            if (staggeredGridLayoutManager.getSpanCount() > 0) {
                return staggeredGridLayoutManager.findFirstVisibleItemPositions(null)[0];
            }
        }
        return -1;
    }

    public final void fgx(Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = this.st;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new d(this, s.a(this.a, obj), s.a(this.a, obj2), s.a(this.a, obj3), s.a(this.a, obj4)));
        }
    }

    public final boolean lbhddb(Object obj) {
        int zhkjxm = zhkjxm();
        if (zhkjxm != -1) {
            LayoutManager layoutManager = this.st.getLayoutManager();
            if (layoutManager.getChildCount() > 0 && zhkjxm > layoutManager.getItemCount() - s.d(obj)) {
                return true;
            }
        }
        return false;
    }

    public final int lbxmzs() {
        RecyclerView recyclerView = this.st;
        return recyclerView == null ? -1 : recyclerView.getLayoutManager().getItemCount();
    }

    public final UserAdapter v7lbspq(Object obj, Object obj2) {
        return v7lbspq(obj, obj2, null);
    }

    public final UserAdapter v7lbspq(Object obj, Object obj2, OnUserAdapterView onUserAdapterView) {
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
        this.b = new UserAdapter(this.a, a, d, onUserAdapterView);
        this.st.setLayoutManager(new LinearLayoutManager(this.a.c));
        this.st.setAdapter(this.b);
        return this.b;
    }

    public final void xzwz(Object obj) {
        RecyclerView recyclerView = this.st;
        if (recyclerView != null) {
            int intValue;
            if (obj instanceof Number) {
                intValue = ((Number) obj).intValue();
            } else {
                String obj2 = obj.toString();
                intValue = obj2.equalsIgnoreCase("top") ? this.st.getTop() : obj2.equalsIgnoreCase("bottom") ? this.st.getBottom() : obj2.equalsIgnoreCase("left") ? this.st.getLeft() : obj2.equalsIgnoreCase("right") ? this.st.getRight() : Integer.parseInt(obj2);
            }
            recyclerView.smoothScrollToPosition(intValue);
        }
    }

    public final int zhkjxm() {
        RecyclerView recyclerView = this.st;
        if (recyclerView == null) {
            return -1;
        }
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            if (staggeredGridLayoutManager.getSpanCount() > 0) {
                return staggeredGridLayoutManager.findLastVisibleItemPositions(null)[0];
            }
        }
        return -1;
    }
}