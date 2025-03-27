package i.runlibrary.app.v;

import android.graphics.drawable.Drawable;
import android.view.View;
import i.app.FileProvider;
import i.runlibrary.app.AppInfo;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public final class 动态图 extends 图像 {
    /* renamed from: 事件 */
    public 视图事件 f134;
    /* renamed from: 视图 */
    public GifImageView f135;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 动态图() {
        this.f135 = null;
        this.f134 = null;
        this.f134 = new 视图事件(null);
    }

    public 动态图(AppInfo appInfo, GifImageView gifImageView) {
        super(appInfo, gifImageView);
        this.f135 = null;
        this.f134 = null;
        this.f135 = gifImageView;
        this.f134 = new 视图事件(gifImageView);
    }

    /* renamed from: 图像 */
    public final void m739(Object obj) {
        GifImageView gifImageView = this.f135;
        if (gifImageView != null) {
            if (obj instanceof Drawable) {
                gifImageView.setImageDrawable((Drawable) obj);
                return;
            }
            try {
                String obj2 = obj.toString();
                if (obj2.startsWith("@")) {
                    this.f135.setImageDrawable(new GifDrawable(this.a.c.getAssets(), FileProvider.a(this.a.c, obj2)));
                    return;
                }
                if (!(obj2.startsWith("%") || obj2.startsWith("$"))) {
                    if (!obj2.startsWith("/")) {
                        if (obj2.matches("[0-9]+")) {
                            this.f135.setImageResource(Integer.parseInt(obj2));
                        }
                        return;
                    }
                }
                this.f135.setImageDrawable(new e(FileProvider.a(this.a.c, obj2)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}