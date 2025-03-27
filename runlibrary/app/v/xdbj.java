package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.VC.wbjgz;

public class xdbj extends vg {
    public ViewEvent sj;
    public RelativeLayout st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public class xdbjgz extends wbjgz {
        public LayoutParams gz;

        public xdbjgz(AppInfo appInfo, View view) {
            super(appInfo, view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.gz = layoutParams;
            if (layoutParams == null) {
                this.gz = new ViewGroup.LayoutParams(-2, -2);
            }
        }

        public void czzy(Object obj) {
            gz(15, obj.equals(Boolean.valueOf(true)) ? -1 : 0);
        }

        public void dqfsb(Object obj) {
            gz(10, obj.equals(Boolean.valueOf(true)) ? -1 : 0);
        }

        public void dqfxb(Object obj) {
            gz(12, obj.equals(Boolean.valueOf(true)) ? -1 : 0);
        }

        public void dqfyb(Object obj) {
            gz(11, obj.equals(Boolean.valueOf(true)) ? -1 : 0);
        }

        public void dqfzb(Object obj) {
            gz(9, obj.equals(Boolean.valueOf(true)) ? -1 : 0);
        }

        public void dqjx(Object obj) {
            gz(4, s.d(obj));
        }

        public void dqsb(Object obj) {
            gz(6, s.d(obj));
        }

        public void dqxb(Object obj) {
            gz(8, s.d(obj));
        }

        public void dqyb(Object obj) {
            gz(7, s.d(obj));
        }

        public void dqzb(Object obj) {
            gz(5, s.d(obj));
        }

        public void gz(int i) {
            this.gz.addRule(i);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void gz(int i, int i2) {
            this.gz.addRule(i, i2);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void sbdqxb(Object obj) {
            gz(3, s.d(obj));
        }

        public void spzy(Object obj) {
            gz(14, obj.equals(Boolean.valueOf(true)) ? -1 : 0);
        }

        public void xbdqsb(Object obj) {
            gz(2, s.d(obj));
        }

        public void ybdqzb(Object obj) {
            gz(1, s.d(obj));
        }

        public void zbdqyb(Object obj) {
            gz(0, s.d(obj));
        }

        public void zy(Object obj) {
            gz(13, obj.equals(Boolean.valueOf(true)) ? -1 : 0);
        }
    }

    public xdbj() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public xdbj(AppInfo appInfo, RelativeLayout relativeLayout) {
        super(appInfo, relativeLayout);
        this.st = null;
        this.sj = null;
        this.st = relativeLayout;
        this.sj = new ViewEvent(this.v);
    }

    public void dqfs(String str) {
        RelativeLayout relativeLayout = this.st;
        if (relativeLayout != null) {
            relativeLayout.setGravity(s.g(str));
        }
    }
}