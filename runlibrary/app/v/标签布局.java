package i.runlibrary.app.v;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.Tab;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.c.a;

public final class 标签布局 extends 水平滚动 {
    /* renamed from: 事件 */
    public 视图事件 f169;
    /* renamed from: 视图 */
    public TabLayout f170;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 标签布局() {
        this.f170 = null;
        this.f169 = null;
        this.f169 = new 视图事件(null);
    }

    public 标签布局(AppInfo appInfo, TabLayout tabLayout) {
        super(appInfo, tabLayout);
        this.f170 = null;
        this.f169 = null;
        this.f170 = tabLayout;
        this.f169 = new 视图事件(tabLayout);
    }

    /* renamed from: 删除标签 */
    public final void m812() {
        TabLayout tabLayout = this.f170;
        if (tabLayout != null) {
            tabLayout.removeAllTabs();
        }
    }

    /* renamed from: 删除标签 */
    public final boolean m813(Object obj) {
        TabLayout tabLayout = this.f170;
        if (tabLayout == null) {
            return false;
        }
        try {
            tabLayout.removeTabAt(s.d(obj));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            for (int i = 0; i < this.f170.getTabCount(); i++) {
                if (String.valueOf(this.f170.getTabAt(i).getText()).equals(obj)) {
                    this.f170.removeTabAt(i);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: 加标签 */
    public final void m814(Object obj) {
        TabLayout tabLayout = this.f170;
        if (tabLayout != null) {
            tabLayout.addTab(tabLayout.newTab().setText(obj.toString()));
        }
    }

    /* renamed from: 加标签 */
    public final void m815(Object obj, Object obj2) {
        TabLayout tabLayout = this.f170;
        if (tabLayout != null) {
            this.f170.addTab(tabLayout.newTab().setText(obj.toString()).setIcon(a.a(obj2, this.a.c)));
        }
    }

    /* renamed from: 指示器颜色 */
    public final void m816(Object obj) {
        TabLayout tabLayout = this.f170;
        if (tabLayout != null) {
            tabLayout.setSelectedTabIndicatorColor(ClientsUDP.a(obj));
        }
    }

    /* renamed from: 指示器高度 */
    public final void m817(Object obj) {
        TabLayout tabLayout = this.f170;
        if (tabLayout != null) {
            tabLayout.setSelectedTabIndicatorHeight(s.a(this.a, obj));
        }
    }

    /* renamed from: 标签 */
    public final Tab m818(Object obj) {
        if (this.f170 == null) {
            return null;
        }
        if (obj instanceof Tab) {
            return (Tab) obj;
        }
        return this.f170.getTabAt(s.d(obj));
    }

    /* renamed from: 标签列表 */
    public final Tab[] m819() {
        TabLayout tabLayout = this.f170;
        if (tabLayout == null) {
            return null;
        }
        int tabCount = tabLayout.getTabCount();
        Tab[] tabArr = new Tab[tabCount];
        for (int i = 0; i < tabCount; i++) {
            tabArr[i] = this.f170.getTabAt(i);
        }
        return tabArr;
    }

    /* renamed from: 标签对齐方式 */
    public final void m820(Object obj) {
        TabLayout tabLayout = this.f170;
        if (tabLayout != null) {
            tabLayout.setTabGravity(s.d(obj));
        }
    }

    /* renamed from: 标签模式 */
    public final void m821(Object obj) {
        TabLayout tabLayout = this.f170;
        if (tabLayout != null) {
            tabLayout.setTabMode(s.d(obj));
        }
    }

    /* renamed from: 设置文本颜色状态 */
    public final boolean m822(Object obj) {
        if (this.f170 == null) {
            return false;
        }
        String[] e = s.e(obj.toString());
        if (e.length != 2) {
            return false;
        }
        this.f170.setTabTextColors(ClientsUDP.a(e[0]), ClientsUDP.a(e[1]));
        return true;
    }

    /* renamed from: 设置标签列表 */
    public final void m823(Object obj) {
        if (this.f170 != null) {
            String[] e = s.e(obj.toString());
            this.f170.removeAllTabs();
            for (CharSequence charSequence : e) {
                TabLayout tabLayout = this.f170;
                tabLayout.addTab(tabLayout.newTab().setText(charSequence));
            }
        }
    }

    /* renamed from: 默认标签 */
    public final boolean m824(Object obj) {
        if (this.f170 == null) {
            return false;
        }
        int d = s.d(obj);
        if (this.f170.getTabCount() <= d) {
            return false;
        }
        this.f170.getTabAt(d).select();
        return true;
    }
}