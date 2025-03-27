package i.runlibrary.app.v;

import android.view.View;
import android.widget.DatePicker;
import i.runlibrary.app.AppInfo;

public final class 日期选择器 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f163;
    /* renamed from: 视图 */
    public DatePicker f164;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 日期选择器() {
        this.f164 = null;
        this.f163 = null;
        this.f163 = new 视图事件(null);
    }

    public 日期选择器(AppInfo appInfo, DatePicker datePicker) {
        super(appInfo, datePicker);
        this.f164 = null;
        this.f163 = null;
        this.f164 = datePicker;
        this.f163 = new 视图事件(datePicker);
    }

    /* renamed from: 年 */
    public final int m800() {
        DatePicker datePicker = this.f164;
        return datePicker == null ? -1 : datePicker.getYear();
    }

    /* renamed from: 日 */
    public final int m801() {
        DatePicker datePicker = this.f164;
        return datePicker == null ? -1 : datePicker.getDayOfMonth();
    }

    /* renamed from: 日期 */
    public final String m802() {
        if (this.f164 == null) {
            return null;
        }
        String str = "-";
        return this.f164.getYear() + str + (this.f164.getMonth() + 1) + str + this.f164.getDayOfMonth();
    }

    /* renamed from: 月 */
    public final int m803() {
        DatePicker datePicker = this.f164;
        return datePicker == null ? -1 : datePicker.getMonth() + 1;
    }
}