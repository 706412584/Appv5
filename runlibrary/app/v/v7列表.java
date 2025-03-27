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

public final class v7列表 extends 视图组 {
    private 适配器 b;
    /* renamed from: 事件 */
    public 视图事件 f87;
    /* renamed from: 视图 */
    public RecyclerView f88;

    public interface OnUserAdapterView {
        void getView(适配器 适配器, int i, View view);
    }

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public class 适配器 extends Adapter {
        int a;
        Class b;
        iActivity c;
        private AppInfo e;
        private i f;
        private OnUserAdapterView g;
        private LayoutInflater h;
        private LinearLayout i;
        /* renamed from: 列表数据 */
        public ArrayList f89 = new ArrayList();

        public 适配器(AppInfo appInfo, Class cls, int i, OnUserAdapterView onUserAdapterView) {
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
            return this.f89.size();
        }

        public void onBindViewHolder(g gVar, int i) {
            gVar.a.setTag(new Object[]{gVar, this, Integer.valueOf(i)});
            for (Entry entry : ((HashMap) this.f89.get(i)).entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                if (intValue > 0) {
                    View view = (View) gVar.b.get(Integer.valueOf(intValue));
                    if (view == null) {
                        view = gVar.a.findViewById(intValue);
                        if (view != null) {
                            gVar.b.put(Integer.valueOf(intValue), view);
                        }
                    }
                    if (view != null) {
                        a.a(view, entry.getValue(), this.f);
                    }
                }
            }
            iActivity iactivity = this.c;
            if (iactivity != null) {
                iactivity._$_viewAutomaticSettingEvent(this.e.a, gVar.a);
            }
            OnUserAdapterView onUserAdapterView = this.g;
            if (onUserAdapterView != null) {
                onUserAdapterView.getView(this, i, gVar.a);
            }
        }

        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new g(this, a.a(this.h, this.a, this.i));
        }

        /* renamed from: 删除 */
        public void m522() {
            this.f89.clear();
        }

        /* renamed from: 删除 */
        public boolean m146(Object obj) {
            if (obj instanceof HashMap) {
                return this.f89.remove(obj);
            }
            try {
                this.f89.remove(s.d(obj));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: 刷新 */
        public void m523() {
            notifyDataSetChanged();
        }

        /* renamed from: 刷新 */
        public void m524(int i) {
            notifyItemChanged(i);
        }

        /* renamed from: 加 */
        public boolean m525(Object obj, Object obj2) {
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
                        this.f89.add(hashMap);
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: 总数 */
        public int m526() {
            return this.f89.size();
        }

        /* renamed from: 获取 */
        public Object m527(Object obj, Object obj2) {
            return ((HashMap) this.f89.get(s.d(obj))).get(Integer.valueOf(s.d(obj2)));
        }

        /* renamed from: 获取 */
        public HashMap m528(Object obj) {
            return (HashMap) this.f89.get(s.d(obj));
        }

        /* renamed from: 设置 */
        public boolean m512(Object obj, Object obj2) {
            if (obj2 instanceof HashMap) {
                try {
                    this.f89.set(s.d(obj), (HashMap) obj2);
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }

        /* renamed from: 设置 */
        public boolean m529(Object obj, Object obj2, Object obj3) {
            try {
                ((HashMap) this.f89.get(s.d(obj))).put(Integer.valueOf(s.d(obj2)), obj3);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    public v7列表() {
        this.f88 = null;
        this.f87 = null;
        this.b = null;
        this.f87 = new 视图事件(null);
    }

    public v7列表(AppInfo appInfo, RecyclerView recyclerView) {
        super(appInfo, recyclerView);
        this.f88 = null;
        this.f87 = null;
        this.b = null;
        this.f88 = recyclerView;
        this.f87 = new 视图事件(recyclerView);
    }

    /* renamed from: v7列表适配器 */
    public final 适配器 m514v7(Object obj, Object obj2) {
        return m515v7(obj, obj2, null);
    }

    /* renamed from: v7列表适配器 */
    public final 适配器 m515v7(Object obj, Object obj2, OnUserAdapterView onUserAdapterView) {
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
        this.b = new 适配器(this.a, a, d, onUserAdapterView);
        this.f88.setLayoutManager(new LinearLayoutManager(this.a.c));
        this.f88.setAdapter(this.b);
        return this.b;
    }

    /* renamed from: 分割线 */
    public final void m516(Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = this.f88;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new f(this, s.a(this.a, obj), s.a(this.a, obj2), s.a(this.a, obj3), s.a(this.a, obj4)));
        }
    }

    /* renamed from: 列表滑动底部 */
    public final boolean m517(Object obj) {
        int 最后可见项目 = m519();
        if (最后可见项目 != -1) {
            LayoutManager layoutManager = this.f88.getLayoutManager();
            if (layoutManager.getChildCount() > 0 && 最后可见项目 > layoutManager.getItemCount() - s.d(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: 列表项目总数 */
    public final int m502() {
        RecyclerView recyclerView = this.f88;
        return recyclerView == null ? -1 : recyclerView.getLayoutManager().getItemCount();
    }

    /* renamed from: 当前可见数量 */
    public final int m518() {
        RecyclerView recyclerView = this.f88;
        return recyclerView == null ? -1 : recyclerView.getLayoutManager().getChildCount();
    }

    /* renamed from: 最后可见项目 */
    public final int m519() {
        RecyclerView recyclerView = this.f88;
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

    /* renamed from: 第一可见项目 */
    public final int m520() {
        RecyclerView recyclerView = this.f88;
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

    /* renamed from: 选择位置 */
    public final void m521(Object obj) {
        RecyclerView recyclerView = this.f88;
        if (recyclerView != null) {
            int intValue;
            if (obj instanceof Number) {
                intValue = ((Number) obj).intValue();
            } else {
                String obj2 = obj.toString();
                intValue = obj2.equalsIgnoreCase("top") ? this.f88.getTop() : obj2.equalsIgnoreCase("bottom") ? this.f88.getBottom() : obj2.equalsIgnoreCase("left") ? this.f88.getLeft() : obj2.equalsIgnoreCase("right") ? this.f88.getRight() : Integer.parseInt(obj2);
            }
            recyclerView.smoothScrollToPosition(intValue);
        }
    }
}