package i.runlibrary.app.v;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import i.runlibrary.app.AppInfo;

public final class fddzan extends txan {
    public ViewEvent sj;
    public FloatingActionButton st;

    public class ViewEvent extends i.runlibrary.app.v.txan.ViewEvent {
        private FloatingActionButton d = null;

        public ViewEvent(FloatingActionButton floatingActionButton) {
            super(floatingActionButton);
            this.d = floatingActionButton;
        }
    }

    public fddzan() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public fddzan(AppInfo appInfo, FloatingActionButton floatingActionButton) {
        super(appInfo, floatingActionButton);
        this.st = null;
        this.sj = null;
        this.st = floatingActionButton;
        this.sj = new ViewEvent(floatingActionButton);
    }
}