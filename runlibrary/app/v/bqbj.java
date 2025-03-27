package i.runlibrary.app.v;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.Tab;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.c.a;

public final class bqbj extends spgd {
    public ViewEvent sj;
    public TabLayout st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public bqbj() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public bqbj(AppInfo appInfo, TabLayout tabLayout) {
        super(appInfo, tabLayout);
        this.st = null;
        this.sj = null;
        this.st = tabLayout;
        this.sj = new ViewEvent(this.v);
    }

    public final Tab bq(Object obj) {
        if (this.st == null) {
            return null;
        }
        if (obj instanceof Tab) {
            return (Tab) obj;
        }
        return this.st.getTabAt(s.d(obj));
    }

    public final void bqdqfs(Object obj) {
        TabLayout tabLayout = this.st;
        if (tabLayout != null) {
            tabLayout.setTabGravity(s.d(obj));
        }
    }

    public final Tab[] bqlb() {
        TabLayout tabLayout = this.st;
        if (tabLayout == null) {
            return null;
        }
        int tabCount = tabLayout.getTabCount();
        Tab[] tabArr = new Tab[tabCount];
        for (int i = 0; i < tabCount; i++) {
            tabArr[i] = this.st.getTabAt(i);
        }
        return tabArr;
    }

    public final void bqms(Object obj) {
        TabLayout tabLayout = this.st;
        if (tabLayout != null) {
            tabLayout.setTabMode(s.d(obj));
        }
    }

    public final void jbq(Object obj) {
        TabLayout tabLayout = this.st;
        if (tabLayout != null) {
            tabLayout.addTab(tabLayout.newTab().setText(obj.toString()));
        }
    }

    public final void jbq(Object obj, Object obj2) {
        TabLayout tabLayout = this.st;
        if (tabLayout != null) {
            this.st.addTab(tabLayout.newTab().setText(obj.toString()).setIcon(a.a(obj2, this.a.c)));
        }
    }

    public final boolean mrbq(Object obj) {
        if (this.st == null) {
            return false;
        }
        int d = s.d(obj);
        if (this.st.getTabCount() <= d) {
            return false;
        }
        this.st.getTabAt(d).select();
        return true;
    }

    public final void scbq() {
        TabLayout tabLayout = this.st;
        if (tabLayout != null) {
            tabLayout.removeAllTabs();
        }
    }

    public final boolean scbq(Object obj) {
        TabLayout tabLayout = this.st;
        if (tabLayout == null) {
            return false;
        }
        try {
            tabLayout.removeTabAt(s.d(obj));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            for (int i = 0; i < this.st.getTabCount(); i++) {
                if (String.valueOf(this.st.getTabAt(i).getText()).equals(obj)) {
                    this.st.removeTabAt(i);
                    return true;
                }
            }
            return false;
        }
    }

    public final void szbqlb(Object obj) {
        if (this.st != null) {
            String[] e = s.e(obj.toString());
            this.st.removeAllTabs();
            for (CharSequence charSequence : e) {
                TabLayout tabLayout = this.st;
                tabLayout.addTab(tabLayout.newTab().setText(charSequence));
            }
        }
    }

    public final boolean szwbyszt(Object obj) {
        if (this.st == null) {
            return false;
        }
        String[] e = s.e(obj.toString());
        if (e.length != 2) {
            return false;
        }
        this.st.setTabTextColors(ClientsUDP.a(e[0]), ClientsUDP.a(e[1]));
        return true;
    }

    public final void zsqgd(Object obj) {
        TabLayout tabLayout = this.st;
        if (tabLayout != null) {
            tabLayout.setSelectedTabIndicatorHeight(s.a(this.a, obj));
        }
    }

    public final void zsqys(Object obj) {
        TabLayout tabLayout = this.st;
        if (tabLayout != null) {
            tabLayout.setSelectedTabIndicatorColor(ClientsUDP.a(obj));
        }
    }
}