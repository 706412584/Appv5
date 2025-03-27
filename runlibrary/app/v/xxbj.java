package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.VC.wbjgz;

public class xxbj extends vg {
    public ViewEvent sj;
    public LinearLayout st;

    public class xxbjgz extends wbjgz {
        public LayoutParams gz;

        public xxbjgz(AppInfo appInfo, View view) {
            super(appInfo, view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.gz = layoutParams;
            if (layoutParams == null) {
                this.gz = new ViewGroup.LayoutParams(-2, -2);
            }
        }

        public void bjqz(Object obj) {
            this.gz.weight = (float) s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void dqfs(Object obj) {
            this.gz.gravity = s.g(obj.toString());
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }
    }

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public xxbj() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public xxbj(AppInfo appInfo, LinearLayout linearLayout) {
        super(appInfo, linearLayout);
        this.st = null;
        this.sj = null;
        this.st = linearLayout;
        this.sj = new ViewEvent(this.v);
    }

    public void dqfs(Object obj) {
        LinearLayout linearLayout = this.st;
        if (linearLayout != null) {
            linearLayout.setGravity(s.g(obj.toString()));
        }
    }

    public void fx(Object obj) {
        LinearLayout linearLayout = this.st;
        if (linearLayout != null) {
            linearLayout.setOrientation(s.d(obj));
        }
    }
}