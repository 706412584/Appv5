package i.runlibrary.app.v;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import i.app.ClientsUDP;
import i.runlibrary.a.a;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class 侧滑窗体 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f128;
    /* renamed from: 视图 */
    public DrawerLayout f129;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 侧滑窗体() {
        this.f129 = null;
        this.f128 = null;
        this.f128 = new 视图事件(null);
    }

    public 侧滑窗体(AppInfo appInfo, DrawerLayout drawerLayout) {
        super(appInfo, drawerLayout);
        this.f129 = null;
        this.f128 = null;
        this.f129 = drawerLayout;
        this.f128 = new 视图事件(drawerLayout);
    }

    private static boolean a(Object obj) {
        if (obj instanceof String) {
            String obj2 = obj.toString();
            if (!obj2.equalsIgnoreCase("START")) {
                if (!obj2.equalsIgnoreCase("LEFT")) {
                    if (obj2.equalsIgnoreCase("END") || obj2.equalsIgnoreCase("RIGHT")) {
                        return true;
                    }
                }
            }
            return true;
        } else if (obj instanceof Integer) {
            int d = s.d(obj);
            if (d != 8388611) {
                if (d != 3) {
                    if (d == 8388613 || d == 5) {
                        return true;
                    }
                }
            }
            return true;
        }
        return true;
    }

    private static int a(String str) {
        return str.equalsIgnoreCase("closed") ? 1 : str.equalsIgnoreCase("open") ? 2 : str.equalsIgnoreCase("unlocked") ? 0 : Integer.parseInt(str);
    }

    /* renamed from: 关闭 */
    public final boolean m724(Object obj) {
        return m725(obj, Boolean.valueOf(true));
    }

    /* renamed from: 关闭 */
    public final boolean m725(Object obj, Object obj2) {
        boolean z = obj instanceof View;
        Boolean valueOf = Boolean.valueOf(true);
        if (z) {
            this.f129.closeDrawer((View) obj, obj2.equals(valueOf));
            return true;
        } else if (obj instanceof VC) {
            this.f129.closeDrawer(((VC) obj).v, obj2.equals(valueOf));
            return true;
        } else if (obj instanceof 基础) {
            this.f129.closeDrawer(((基础) obj).f90, obj2.equals(valueOf));
            return true;
        } else {
            boolean a = ClientsUDP.a(obj);
            if (a) {
                return false;
            }
            this.f129.closeDrawer(a, obj2.equals(valueOf));
            return true;
        }
    }

    /* renamed from: 打开 */
    public final boolean m726(Object obj) {
        return m727(obj, Boolean.valueOf(true));
    }

    /* renamed from: 打开 */
    public final boolean m727(Object obj, Object obj2) {
        boolean z = obj instanceof View;
        Boolean valueOf = Boolean.valueOf(true);
        if (z) {
            this.f129.openDrawer((View) obj, obj2.equals(valueOf));
            return true;
        } else if (obj instanceof VC) {
            this.f129.openDrawer(((VC) obj).v, obj2.equals(valueOf));
            return true;
        } else if (obj instanceof 基础) {
            this.f129.openDrawer(((基础) obj).f90, obj2.equals(valueOf));
            return true;
        } else {
            boolean a = ClientsUDP.a(obj);
            if (a) {
                return false;
            }
            this.f129.openDrawer(a, obj2.equals(valueOf));
            return true;
        }
    }

    /* renamed from: 是否打开 */
    public final boolean m728(Object obj) {
        if (obj instanceof View) {
            return this.f129.isDrawerOpen((View) obj);
        }
        if (obj instanceof VC) {
            return this.f129.isDrawerOpen(((VC) obj).v);
        }
        if (obj instanceof 基础) {
            return this.f129.isDrawerOpen(((基础) obj).f90);
        }
        boolean a = ClientsUDP.a(obj);
        return !a ? this.f129.isDrawerOpen(a) : false;
    }

    /* renamed from: 锁定模式 */
    public final void m729(Object obj) {
        this.f129.setDrawerLockMode(a.a(obj.toString()));
    }

    /* renamed from: 锁定模式 */
    public final void m730(Object obj, Object obj2) {
        this.f129.setDrawerLockMode(a.a(obj.toString()), ClientsUDP.a(obj2.toString()));
    }
}