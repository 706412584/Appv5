package i.runlibrary.app.v;

import android.view.View;
import android.widget.RatingBar;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class pf extends jdt {
    public ViewEvent sj;
    public RatingBar st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public pf() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public pf(AppInfo appInfo, RatingBar ratingBar) {
        super(appInfo, ratingBar);
        this.st = null;
        this.sj = null;
        this.st = ratingBar;
        this.sj = new ViewEvent(this.v);
    }

    public final float pf() {
        RatingBar ratingBar = this.st;
        return ratingBar == null ? -1.0f : ratingBar.getRating();
    }

    public final pf pf(Object obj) {
        RatingBar ratingBar = this.st;
        if (ratingBar == null) {
            return;
        }
        ratingBar.setRating(s.f(obj));
        return;
    }

    public final void sxz(Object obj) {
        RatingBar ratingBar = this.st;
        if (ratingBar != null) {
            ratingBar.setMax(s.d(obj));
        }
    }

    public final void xsl(Object obj) {
        RatingBar ratingBar = this.st;
        if (ratingBar != null) {
            ratingBar.setNumStars(s.d(obj));
        }
    }

    public final void yxyhcz(Object obj) {
        RatingBar ratingBar = this.st;
        if (ratingBar != null) {
            ratingBar.setIsIndicator(obj.equals(Boolean.valueOf(true)));
        }
    }
}