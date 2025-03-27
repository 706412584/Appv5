package i.runlibrary.app.v;

import android.widget.Button;
import i.runlibrary.app.AppInfo;

public class an extends wb {
    public ViewEvent sj;
    public Button st;
    /* renamed from: 视图 */
    public Button f94;

    public class ViewEvent extends i.runlibrary.app.v.wb.ViewEvent {
        private Button b = null;

        public ViewEvent(Button button) {
            super(button);
            this.b = button;
        }
    }

    public an() {
        this.st = null;
        this.f94 = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public an(AppInfo appInfo, Button button) {
        super(appInfo, button);
        this.st = null;
        this.f94 = null;
        this.sj = null;
        this.st = button;
        this.f94 = button;
        this.sj = new ViewEvent(button);
    }
}