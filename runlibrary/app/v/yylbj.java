package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.LayoutParams;
import i.runlibrary.a.a;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.xxbj.xxbjgz;

public final class yylbj extends xxbj {
    public ViewEvent sj;
    public AppBarLayout st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public class yylbjgz extends xxbjgz {
        public LayoutParams gz;

        public yylbjgz(AppInfo appInfo, View view) {
            super(appInfo, view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.gz = layoutParams;
            if (layoutParams == null) {
                this.gz = new ViewGroup.LayoutParams(-2, -2);
            }
        }

        private static int a(String str) {
            return str.equalsIgnoreCase("exitUntilCollapsed") ? 2 : str.equalsIgnoreCase("enterAlwaysCollapsed") ? 8 : str.equalsIgnoreCase("scroll") ? 1 : str.equalsIgnoreCase("enterAlways") ? 4 : str.equalsIgnoreCase("snap") ? 16 : str.matches("[0-9]+") ? Integer.parseInt(str) : 1;
        }

        public void dqfs(Object obj) {
            this.gz.gravity = s.g(obj.toString());
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void gdbs(String str) {
            LayoutParams layoutParams = this.gz;
            int i = 1;
            if (str.contains("|")) {
                String[] e = s.e(str);
                int length = e.length;
                if (length == 2) {
                    length = a.a(e[0].trim());
                    str = e[1];
                } else if (length == 3) {
                    length = a.a(e[0].trim()) | a.a(e[1].trim());
                    str = e[2];
                } else if (length == 4) {
                    length = (a.a(e[0].trim()) | a.a(e[1].trim())) | a.a(e[2].trim());
                    str = e[3];
                }
                i = length | a.a(str.trim());
            } else {
                i = a.a(str.trim());
            }
            layoutParams.setScrollFlags(i);
            this.v.setLayoutParams(this.gz);
        }
    }

    public yylbj() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public yylbj(AppInfo appInfo, AppBarLayout appBarLayout) {
        super(appInfo, appBarLayout);
        this.st = null;
        this.sj = null;
        this.st = appBarLayout;
        this.sj = new ViewEvent(this.v);
    }
}