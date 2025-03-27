package i.runlibrary.app.v;

import android.view.View;
import android.widget.SeekBar;
import i.runlibrary.app.AppInfo;

public final class tdt extends jdt {
    public ViewEvent sj;
    public SeekBar st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public tdt() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public tdt(AppInfo appInfo, SeekBar seekBar) {
        super(appInfo, seekBar);
        this.st = null;
        this.sj = null;
        this.st = seekBar;
        this.sj = new ViewEvent(this.v);
    }
}