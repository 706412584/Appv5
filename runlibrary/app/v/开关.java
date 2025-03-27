package i.runlibrary.app.v;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import androidx.appcompat.widget.SwitchCompat;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class 开关 extends 按钮 {
    /* renamed from: 事件 */
    public 视图事件 f155;
    /* renamed from: 视图 */
    public SwitchCompat f156;

    public class 视图事件 extends i.runlibrary.app.v.按钮.视图事件 {
        private SwitchCompat d = null;

        public 视图事件(SwitchCompat switchCompat) {
            super(switchCompat);
            this.d = switchCompat;
        }
    }

    public 开关() {
        this.f156 = null;
        this.f155 = null;
        this.f155 = new 视图事件(null);
    }

    public 开关(AppInfo appInfo, SwitchCompat switchCompat) {
        super(appInfo, switchCompat);
        this.f156 = null;
        this.f155 = null;
        this.f156 = switchCompat;
        this.f155 = new 视图事件(switchCompat);
    }

    /* renamed from: 关闭状态显示字符 */
    public final void m781(Object obj) {
        SwitchCompat switchCompat = this.f156;
        if (switchCompat != null) {
            switchCompat.setTextOff(obj.toString());
        }
    }

    /* renamed from: 分割轨道 */
    public final void m782(Object obj) {
        SwitchCompat switchCompat = this.f156;
        if (switchCompat != null) {
            switchCompat.setSplitTrack(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 开关最小宽 */
    public final void m783(Object obj) {
        SwitchCompat switchCompat = this.f156;
        if (switchCompat != null) {
            switchCompat.setSwitchMinWidth(s.a(this.a, obj));
        }
    }

    /* renamed from: 开关颜色 */
    public final void m784(Object obj) {
        SwitchCompat switchCompat = this.f156;
        if (switchCompat != null) {
            switchCompat.setThumbTintList(ColorStateList.valueOf(ClientsUDP.a(obj)));
        }
    }

    /* renamed from: 开启状态显示字符 */
    public final void m785(Object obj) {
        SwitchCompat switchCompat = this.f156;
        if (switchCompat != null) {
            switchCompat.setTextOn(obj.toString());
        }
    }

    /* renamed from: 是否显示字符 */
    public final void m786(Object obj) {
        SwitchCompat switchCompat = this.f156;
        if (switchCompat != null) {
            switchCompat.setShowText(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 轨道拇指模式 */
    public final void m787(Object obj) {
        if (this.f156 != null) {
            SwitchCompat switchCompat;
            Mode mode;
            if (obj.equals("add")) {
                switchCompat = this.f156;
                mode = Mode.ADD;
            } else if (obj.equals("multiply")) {
                switchCompat = this.f156;
                mode = Mode.MULTIPLY;
            } else if (obj.equals("screen")) {
                switchCompat = this.f156;
                mode = Mode.SCREEN;
            } else if (obj.equals("src_atop")) {
                switchCompat = this.f156;
                mode = Mode.SRC_ATOP;
            } else if (obj.equals("src_in") || !obj.equals("src_over")) {
                switchCompat = this.f156;
                mode = Mode.SRC_IN;
            } else {
                switchCompat = this.f156;
                mode = Mode.SRC_OVER;
            }
            switchCompat.setThumbTintMode(mode);
        }
    }

    /* renamed from: 轨道跟踪模式 */
    public final void m788(Object obj) {
        if (this.f156 != null) {
            SwitchCompat switchCompat;
            Mode mode;
            if (obj.equals("add")) {
                switchCompat = this.f156;
                mode = Mode.ADD;
            } else if (obj.equals("multiply")) {
                switchCompat = this.f156;
                mode = Mode.MULTIPLY;
            } else if (obj.equals("screen")) {
                switchCompat = this.f156;
                mode = Mode.SCREEN;
            } else if (obj.equals("src_atop")) {
                switchCompat = this.f156;
                mode = Mode.SRC_ATOP;
            } else if (obj.equals("src_in") || !obj.equals("src_over")) {
                switchCompat = this.f156;
                mode = Mode.SRC_IN;
            } else {
                switchCompat = this.f156;
                mode = Mode.SRC_OVER;
            }
            switchCompat.setTrackTintMode(mode);
        }
    }

    /* renamed from: 轨道颜色 */
    public final void m789(Object obj) {
        SwitchCompat switchCompat = this.f156;
        if (switchCompat != null) {
            switchCompat.setTrackTintList(ColorStateList.valueOf(ClientsUDP.a(obj)));
        }
    }

    /* renamed from: 轨道颜色 */
    public final void m790(Object obj, Object obj2, Object obj3) {
        SwitchCompat switchCompat = this.f156;
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

    /* renamed from: 选中状态 */
    public final void m791(Object obj) {
        SwitchCompat switchCompat = this.f156;
        if (switchCompat != null) {
            switchCompat.setChecked(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 选中状态 */
    public final boolean m792() {
        SwitchCompat switchCompat = this.f156;
        return switchCompat == null ? false : switchCompat.isChecked();
    }
}