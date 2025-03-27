package i.runlibrary.app.v;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import i.app.ClientsUDP;
import i.runlibrary.a.a;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class chct extends vg {
    public ViewEvent sj;
    public DrawerLayout st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public chct() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public chct(AppInfo appInfo, DrawerLayout drawerLayout) {
        super(appInfo, drawerLayout);
        this.st = null;
        this.sj = null;
        this.st = drawerLayout;
        this.sj = new ViewEvent(this.v);
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
        return str.equals("closed") ? 1 : str.equals("open") ? 2 : str.equals("unlocked") ? 0 : Integer.parseInt(str);
    }

    public final boolean dk(Object obj) {
        return dk(obj, Boolean.valueOf(true));
    }

    public final boolean dk(Object obj, Object obj2) {
        boolean z = obj instanceof View;
        Boolean valueOf = Boolean.valueOf(true);
        if (z) {
            this.st.openDrawer((View) obj, obj2.equals(valueOf));
            return true;
        } else if (obj instanceof VC) {
            this.st.openDrawer(((VC) obj).v, obj2.equals(valueOf));
            return true;
        } else if (obj instanceof 基础) {
            this.st.openDrawer(((基础) obj).f90, obj2.equals(valueOf));
            return true;
        } else {
            boolean a = ClientsUDP.a(obj);
            if (a) {
                return false;
            }
            this.st.openDrawer(a, obj2.equals(valueOf));
            return true;
        }
    }

    public final boolean gb(Object obj) {
        return gb(obj, Boolean.valueOf(true));
    }

    public final boolean gb(Object obj, Object obj2) {
        boolean z = obj instanceof View;
        Boolean valueOf = Boolean.valueOf(true);
        if (z) {
            this.st.closeDrawer((View) obj, obj2.equals(valueOf));
            return true;
        } else if (obj instanceof VC) {
            this.st.closeDrawer(((VC) obj).v, obj2.equals(valueOf));
            return true;
        } else if (obj instanceof 基础) {
            this.st.closeDrawer(((基础) obj).f90, obj2.equals(valueOf));
            return true;
        } else {
            boolean a = ClientsUDP.a(obj);
            if (a) {
                return false;
            }
            this.st.closeDrawer(a, obj2.equals(valueOf));
            return true;
        }
    }

    public final void sdms(Object obj) {
        this.st.setDrawerLockMode(a.a(obj.toString()));
    }

    public final void sdms(Object obj, Object obj2) {
        this.st.setDrawerLockMode(a.a(obj.toString()), ClientsUDP.a(obj2.toString()));
    }

    public final boolean sfdk(Object obj) {
        if (obj instanceof View) {
            return this.st.isDrawerOpen((View) obj);
        }
        if (obj instanceof VC) {
            return this.st.isDrawerOpen(((VC) obj).v);
        }
        if (obj instanceof 基础) {
            return this.st.isDrawerOpen(((基础) obj).f90);
        }
        boolean a = ClientsUDP.a(obj);
        return !a ? this.st.isDrawerOpen(a) : false;
    }
}