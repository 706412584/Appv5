package i.runlibrary.app.v;

import android.graphics.ColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import i.app.ClientsUDP;
import i.runlibrary.a.i;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.c.a;

public class tx extends VC {
    public ViewEvent sj;
    public ImageView st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View a = null;

        public ViewEvent(View view) {
            super(view);
            this.a = view;
        }
    }

    public tx() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public tx(AppInfo appInfo, ImageView imageView) {
        super(appInfo, imageView);
        this.st = null;
        this.sj = null;
        this.st = imageView;
        this.sj = new ViewEvent(this.v);
    }

    public void gkb(Object obj) {
        ImageView imageView = this.st;
        if (imageView != null) {
            imageView.setAdjustViewBounds(obj.equals(Boolean.valueOf(true)));
        }
    }

    public void kztxdx(Object obj) {
        ImageView imageView = this.st;
        if (imageView != null) {
            ScaleType scaleType = obj.equals("center") ? ScaleType.CENTER : obj.equals("centercrop") ? ScaleType.CENTER_CROP : obj.equals("centerinside") ? ScaleType.CENTER_INSIDE : obj.equals("fitcenter") ? ScaleType.FIT_CENTER : obj.equals("fitend") ? ScaleType.FIT_END : obj.equals("fitstart") ? ScaleType.FIT_START : obj.equals("fitxy") ? ScaleType.FIT_XY : obj.equals("matrix") ? ScaleType.MATRIX : null;
            imageView.setScaleType(scaleType);
        }
    }

    public tx tx(Object obj) {
        if (this.st == null) {
            return;
        }
        if (this.a.c != null && (obj instanceof String)) {
            String obj2 = obj.toString();
            String toLowerCase = obj2.toLowerCase();
            if (toLowerCase.startsWith("http:") || toLowerCase.startsWith("https:") || toLowerCase.startsWith("ftp:")) {
                i.a(this.a.c, this.v, obj2, toLowerCase, false);
                return;
            }
        }
        this.st.setImageDrawable(a.a(obj, this.a.c));
        return;
    }

    public void zdg(Object obj) {
        ImageView imageView = this.st;
        if (imageView != null) {
            imageView.setMaxHeight(s.a(this.a, obj));
        }
    }

    public void zdk(Object obj) {
        ImageView imageView = this.st;
        if (imageView != null) {
            imageView.setMaxWidth(s.a(this.a, obj));
        }
    }

    public void zs(Object obj) {
        if (obj instanceof ColorFilter) {
            this.st.setColorFilter((ColorFilter) obj);
        } else {
            this.st.setColorFilter(ClientsUDP.a(obj));
        }
    }
}