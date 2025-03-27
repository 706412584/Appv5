package i.runlibrary.app.v;

import android.view.SurfaceView;
import android.view.View;
import i.runlibrary.app.AppInfo;

public final class mkj extends VC {
    public ViewEvent sj;
    public SurfaceView st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public mkj() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public mkj(AppInfo appInfo, SurfaceView surfaceView) {
        super(appInfo, surfaceView);
        this.st = null;
        this.sj = null;
        this.st = surfaceView;
        this.sj = new ViewEvent(this.v);
    }
}