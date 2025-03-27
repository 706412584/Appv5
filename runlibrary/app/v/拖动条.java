package i.runlibrary.app.v;

import android.view.View;
import android.widget.SeekBar;
import i.runlibrary.app.AppInfo;

public final class 拖动条 extends 进度条 {
    /* renamed from: 事件 */
    public 视图事件 f159;
    /* renamed from: 视图 */
    public SeekBar f160;

    public class 视图事件 extends i.runlibrary.app.v.进度条.视图事件 {
        private View c = null;

        public 视图事件(View view) {
            super(view);
            this.c = view;
        }
    }

    public 拖动条() {
        this.f160 = null;
        this.f159 = null;
        this.f159 = new 视图事件(null);
    }

    public 拖动条(AppInfo appInfo, SeekBar seekBar) {
        super(appInfo, seekBar);
        this.f160 = null;
        this.f159 = null;
        this.f160 = seekBar;
        this.f159 = new 视图事件(seekBar);
    }
}