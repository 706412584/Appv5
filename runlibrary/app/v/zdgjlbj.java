package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.VC.wbjgz;
import i.runlibrary.c.a;

public final class zdgjlbj extends vg {
    public ViewEvent sj;
    public CollapsingToolbarLayout st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public class zdgjlbjgz extends wbjgz {
        public LayoutParams gz;

        public zdgjlbjgz(AppInfo appInfo, View view) {
            super(appInfo, view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.gz = layoutParams;
            if (layoutParams == null) {
                this.gz = new ViewGroup.LayoutParams(-2, -2);
            }
        }

        public void dqfs(Object obj) {
            this.gz.gravity = s.g(obj.toString());
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void zdms(String str) {
            LayoutParams layoutParams;
            int i;
            if (str.equalsIgnoreCase("pin")) {
                layoutParams = this.gz;
                i = 1;
            } else if (str.equalsIgnoreCase("parallax")) {
                layoutParams = this.gz;
                i = 2;
            } else if (str.equalsIgnoreCase("none")) {
                layoutParams = this.gz;
                i = 0;
            } else {
                return;
            }
            layoutParams.setCollapseMode(i);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }
    }

    public zdgjlbj() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public zdgjlbj(AppInfo appInfo, CollapsingToolbarLayout collapsingToolbarLayout) {
        super(appInfo, collapsingToolbarLayout);
        this.st = null;
        this.sj = null;
        this.st = collapsingToolbarLayout;
        this.sj = new ViewEvent(this.v);
    }

    public final void kzsbtdqfs(Object obj) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.st;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setExpandedTitleGravity(s.g(obj.toString()));
        }
    }

    public final void kzsbtwbj(Object obj, Object obj2, Object obj3, Object obj4) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.st;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setExpandedTitleMargin(s.a(this.a, obj), s.a(this.a, obj2), s.a(this.a, obj3), s.a(this.a, obj4));
        }
    }

    public final void kzsbtys(Object obj) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.st;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setExpandedTitleColor(ClientsUDP.a(obj));
        }
    }

    public final void sssbtdqfs(Object obj) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.st;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setCollapsedTitleGravity(s.g(obj.toString()));
        }
    }

    public final void sssbtys(Object obj) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.st;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setCollapsedTitleTextColor(ClientsUDP.a(obj));
        }
    }

    public final void wqhcbjys(Object obj) {
        if (this.st != null) {
            this.st.setContentScrim(a.a(obj, this.a.c));
        }
    }
}