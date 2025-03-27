package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.LayoutParams;
import i.runlibrary.a.a;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.线性布局.线性布局规则;

public final class 应用栏布局 extends 线性布局 {
    /* renamed from: 事件 */
    public 视图事件 f110;
    /* renamed from: 视图 */
    public AppBarLayout f111;

    public class 应用栏布局规则 extends 线性布局规则 {
        /* renamed from: 规则 */
        public LayoutParams f112;

        public 应用栏布局规则(AppInfo appInfo, View view) {
            super(appInfo, view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.f112 = layoutParams;
            if (layoutParams == null) {
                this.f112 = new ViewGroup.LayoutParams(-2, -2);
            }
        }

        private static int a(String str) {
            return str.equalsIgnoreCase("exitUntilCollapsed") ? 2 : str.equalsIgnoreCase("enterAlwaysCollapsed") ? 8 : str.equalsIgnoreCase("scroll") ? 1 : str.equalsIgnoreCase("enterAlways") ? 4 : str.equalsIgnoreCase("snap") ? 16 : str.matches("[0-9]+") ? Integer.parseInt(str) : 1;
        }

        /* renamed from: 对齐方式 */
        public void m385(Object obj) {
            this.f112.gravity = s.g(obj.toString());
            if (this.v != null) {
                this.v.setLayoutParams(this.f112);
            }
        }

        /* renamed from: 滚动标识 */
        public void m663(String str) {
            LayoutParams layoutParams = this.f112;
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
            this.v.setLayoutParams(this.f112);
        }
    }

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 应用栏布局() {
        this.f111 = null;
        this.f110 = null;
        this.f110 = new 视图事件(null);
    }

    public 应用栏布局(AppInfo appInfo, AppBarLayout appBarLayout) {
        super(appInfo, appBarLayout);
        this.f111 = null;
        this.f110 = null;
        this.f111 = appBarLayout;
        this.f110 = new 视图事件(appBarLayout);
    }
}