package i.runlibrary.app.v;

import android.view.View;
import android.widget.TimePicker;
import i.runlibrary.app.AppInfo;

public final class 时间选择器 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f165;
    /* renamed from: 视图 */
    public TimePicker f166;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 时间选择器() {
        this.f166 = null;
        this.f165 = null;
        this.f165 = new 视图事件(null);
    }

    public 时间选择器(AppInfo appInfo, TimePicker timePicker) {
        super(appInfo, timePicker);
        this.f166 = null;
        this.f165 = null;
        this.f166 = timePicker;
        this.f165 = new 视图事件(timePicker);
    }

    /* renamed from: 分钟 */
    public final int m804() {
        TimePicker timePicker = this.f166;
        return timePicker == null ? -1 : timePicker.getCurrentMinute().intValue();
    }

    /* renamed from: 小时 */
    public final int m805() {
        TimePicker timePicker = this.f166;
        return timePicker == null ? -1 : timePicker.getCurrentHour().intValue();
    }

    /* renamed from: 时间 */
    public final String m806() {
        return this.f166 == null ? null : this.f166.getCurrentHour() + ":" + this.f166.getCurrentMinute();
    }
}