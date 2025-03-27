package i.runlibrary.app.v;

import android.widget.ImageButton;
import i.runlibrary.app.AppInfo;

public class txan extends tx {
    public ViewEvent sj;
    public ImageButton st;

    public class ViewEvent extends i.runlibrary.app.v.tx.ViewEvent {
        private ImageButton a = null;

        public ViewEvent(ImageButton imageButton) {
            super(imageButton);
            this.a = imageButton;
        }
    }

    public txan() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public txan(AppInfo appInfo, ImageButton imageButton) {
        super(appInfo, imageButton);
        this.st = null;
        this.sj = null;
        this.st = imageButton;
        this.sj = new ViewEvent(imageButton);
    }
}