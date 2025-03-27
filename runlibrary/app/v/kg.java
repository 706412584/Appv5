package i.runlibrary.app.v;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import androidx.appcompat.widget.SwitchCompat;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class kg extends an {
    public ViewEvent sj;
    public SwitchCompat st;

    public class ViewEvent extends i.runlibrary.app.v.an.ViewEvent {
        private SwitchCompat d = null;

        public ViewEvent(SwitchCompat switchCompat) {
            super(switchCompat);
            this.d = switchCompat;
        }
    }

    public kg() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public kg(AppInfo appInfo, SwitchCompat switchCompat) {
        super(appInfo, switchCompat);
        this.st = null;
        this.sj = null;
        this.st = switchCompat;
        this.sj = new ViewEvent(switchCompat);
    }

    public final void fggd(Object obj) {
        SwitchCompat switchCompat = this.st;
        if (switchCompat != null) {
            switchCompat.setSplitTrack(obj.equals(Boolean.valueOf(true)));
        }
    }

    public final void gbztxszf(Object obj) {
        SwitchCompat switchCompat = this.st;
        if (switchCompat != null) {
            switchCompat.setTextOff(obj.toString());
        }
    }

    public final void gdgzms(Object obj) {
        if (this.st != null) {
            SwitchCompat switchCompat;
            Mode mode;
            if (obj.equals("add")) {
                switchCompat = this.st;
                mode = Mode.ADD;
            } else if (obj.equals("multiply")) {
                switchCompat = this.st;
                mode = Mode.MULTIPLY;
            } else if (obj.equals("screen")) {
                switchCompat = this.st;
                mode = Mode.SCREEN;
            } else if (obj.equals("src_atop")) {
                switchCompat = this.st;
                mode = Mode.SRC_ATOP;
            } else if (obj.equals("src_in") || !obj.equals("src_over")) {
                switchCompat = this.st;
                mode = Mode.SRC_IN;
            } else {
                switchCompat = this.st;
                mode = Mode.SRC_OVER;
            }
            switchCompat.setTrackTintMode(mode);
        }
    }

    public final void gdmzms(Object obj) {
        if (this.st != null) {
            SwitchCompat switchCompat;
            Mode mode;
            if (obj.equals("add")) {
                switchCompat = this.st;
                mode = Mode.ADD;
            } else if (obj.equals("multiply")) {
                switchCompat = this.st;
                mode = Mode.MULTIPLY;
            } else if (obj.equals("screen")) {
                switchCompat = this.st;
                mode = Mode.SCREEN;
            } else if (obj.equals("src_atop")) {
                switchCompat = this.st;
                mode = Mode.SRC_ATOP;
            } else if (obj.equals("src_in") || !obj.equals("src_over")) {
                switchCompat = this.st;
                mode = Mode.SRC_IN;
            } else {
                switchCompat = this.st;
                mode = Mode.SRC_OVER;
            }
            switchCompat.setThumbTintMode(mode);
        }
    }

    public final void gdys(Object obj) {
        SwitchCompat switchCompat = this.st;
        if (switchCompat != null) {
            switchCompat.setTrackTintList(ColorStateList.valueOf(ClientsUDP.a(obj)));
        }
    }

    public final void gdys(Object obj, Object obj2, Object obj3) {
        SwitchCompat switchCompat = this.st;
        if (switchCompat != null) {
            boolean a = ClientsUDP.a(obj);
            boolean a2 = ClientsUDP.a(obj2);
            boolean a3 = ClientsUDP.a(obj3);
            r2 = new int[3][];
            r1 = new int[3];
            r2[0] = new int[]{-16842910};
            r1[0] = a3;
            r2[1] = new int[]{16842912};
            r1[1] = a;
            r2[2] = new int[0];
            r1[2] = a2;
            switchCompat.setTrackTintList(new ColorStateList(r2, r1));
        }
    }

    public final void kgys(Object obj) {
        SwitchCompat switchCompat = this.st;
        if (switchCompat != null) {
            switchCompat.setThumbTintList(ColorStateList.valueOf(ClientsUDP.a(obj)));
        }
    }

    public final void kgzxk(Object obj) {
        SwitchCompat switchCompat = this.st;
        if (switchCompat != null) {
            switchCompat.setSwitchMinWidth(s.a(this.a, obj));
        }
    }

    public final void kqztxszf(Object obj) {
        SwitchCompat switchCompat = this.st;
        if (switchCompat != null) {
            switchCompat.setTextOn(obj.toString());
        }
    }

    public final void sfxszf(Object obj) {
        SwitchCompat switchCompat = this.st;
        if (switchCompat != null) {
            switchCompat.setShowText(obj.equals(Boolean.valueOf(true)));
        }
    }

    public final void xzzt(Object obj) {
        SwitchCompat switchCompat = this.st;
        if (switchCompat != null) {
            switchCompat.setChecked(obj.equals(Boolean.valueOf(true)));
        }
    }

    public final boolean xzzt() {
        SwitchCompat switchCompat = this.st;
        return switchCompat == null ? false : switchCompat.isChecked();
    }
}