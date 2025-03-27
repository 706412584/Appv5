package i.runlibrary.app.v;

import android.graphics.drawable.Drawable;
import android.view.View;
import i.app.FileProvider;
import i.runlibrary.app.AppInfo;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public final class dtt extends tx {
    public ViewEvent sj;
    public GifImageView st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public dtt() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public dtt(AppInfo appInfo, GifImageView gifImageView) {
        super(appInfo, gifImageView);
        this.st = null;
        this.sj = null;
        this.st = gifImageView;
        this.sj = new ViewEvent(this.v);
    }

    public final tx tx(Object obj) {
        GifImageView gifImageView = this.st;
        if (gifImageView == null) {
            return;
        }
        if (obj instanceof Drawable) {
            gifImageView.setImageDrawable((Drawable) obj);
            return;
        }
        try {
            String obj2 = obj.toString();
            if (obj2.startsWith("@")) {
                this.st.setImageDrawable(new GifDrawable(this.a.c.getAssets(), FileProvider.a(this.a.c, obj2)));
                return;
            }
            if (!(obj2.startsWith("%") || obj2.startsWith("$"))) {
                if (!obj2.startsWith("/")) {
                    if (obj2.matches("[0-9]+")) {
                        this.st.setImageResource(Integer.parseInt(obj2));
                    }
                    return;
                }
            }
            this.st.setImageDrawable(new e(FileProvider.a(this.a.c, obj2)));
            return;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}