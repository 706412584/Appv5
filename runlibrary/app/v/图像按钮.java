package i.runlibrary.app.v;

import android.widget.ImageButton;
import i.runlibrary.app.AppInfo;

public class 图像按钮 extends 图像 {
    /* renamed from: 事件 */
    public 视图事件 f144;
    /* renamed from: 视图 */
    public ImageButton f145;

    public class 视图事件 extends i.runlibrary.app.v.图像.视图事件 {
        private ImageButton c = null;

        public 视图事件(ImageButton imageButton) {
            super(imageButton);
            this.c = imageButton;
        }
    }

    public 图像按钮() {
        this.f145 = null;
        this.f144 = null;
        this.f144 = new 视图事件(null);
    }

    public 图像按钮(AppInfo appInfo, ImageButton imageButton) {
        super(appInfo, imageButton);
        this.f145 = null;
        this.f144 = null;
        this.f145 = imageButton;
        this.f144 = new 视图事件(imageButton);
    }
}