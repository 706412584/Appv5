package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.VC.wbjgz;

public final class xtbj extends vg {
    public ViewEvent sj;
    public CoordinatorLayout st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public class xtbjgz extends wbjgz {
        public LayoutParams gz;

        public xtbjgz(AppInfo appInfo, View view) {
            super(appInfo, view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.gz = layoutParams;
            if (layoutParams == null) {
                this.gz = new ViewGroup.LayoutParams(-2, -2);
            }
        }

        public boolean bhhdzj(Object obj) {
            try {
                this.gz.setBehavior((Behavior) (obj instanceof Class ? (Class) obj : Class.forName(obj.toString())).newInstance());
                if (this.v != null) {
                    this.v.setLayoutParams(this.gz);
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public void dqfs(Object obj) {
            this.gz.gravity = s.g(obj.toString());
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public boolean md(Object obj) {
            this.gz.setAnchorId(s.d(obj));
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
            return true;
        }

        public boolean mdwz(Object obj) {
            this.gz.anchorGravity = s.g(obj.toString());
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
            return true;
        }
    }

    public xtbj() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public xtbj(AppInfo appInfo, CoordinatorLayout coordinatorLayout) {
        super(appInfo, coordinatorLayout);
        this.st = null;
        this.sj = null;
        this.st = coordinatorLayout;
        this.sj = new ViewEvent(this.v);
    }
}