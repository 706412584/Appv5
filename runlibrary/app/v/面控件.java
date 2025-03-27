package i.runlibrary.app.v;

import android.view.SurfaceView;
import android.view.View;
import i.runlibrary.app.AppInfo;

public final class 面控件 extends 基础 {
    /* renamed from: 事件 */
    public 视图事件 f189;
    /* renamed from: 视图 */
    public SurfaceView f190;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 面控件() {
        this.f190 = null;
        this.f189 = null;
        this.f189 = new 视图事件(null);
    }

    public 面控件(AppInfo appInfo, SurfaceView surfaceView) {
        super(appInfo, surfaceView);
        this.f190 = null;
        this.f189 = null;
        this.f190 = surfaceView;
        this.f189 = new 视图事件(surfaceView);
    }
}