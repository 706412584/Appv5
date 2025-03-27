package i.runlibrary.app.v;

import android.view.View;
import androidx.cardview.widget.CardView;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class kp extends vg {
    public ViewEvent sj;
    public CardView st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public kp() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public kp(AppInfo appInfo, CardView cardView) {
        super(appInfo, cardView);
        this.st = null;
        this.sj = null;
        this.st = cardView;
        this.sj = new ViewEvent(this.v);
    }

    public final void fznrbjcd(Object obj) {
        CardView cardView = this.st;
        if (cardView != null) {
            cardView.setPreventCornerOverlap(obj.equals(Boolean.valueOf(true)));
        }
    }

    public final void kpbjys(Object obj) {
        CardView cardView = this.st;
        if (cardView != null) {
            cardView.setCardBackgroundColor(ClientsUDP.a(obj));
        }
    }

    public final void kpyjdx(Object obj) {
        CardView cardView = this.st;
        if (cardView != null) {
            cardView.setRadius((float) s.a(this.a, obj));
        }
    }

    public final void kpyydx(Object obj) {
        CardView cardView = this.st;
        if (cardView != null) {
            cardView.setCardElevation((float) s.a(this.a, obj));
        }
    }

    public final boolean nbj(Object obj, Object obj2, Object obj3, Object obj4) {
        CardView cardView = this.st;
        if (cardView == null) {
            return false;
        }
        cardView.setContentPadding(s.a(this.a, obj), s.a(this.a, obj2), s.a(this.a, obj3), s.a(this.a, obj4));
        return true;
    }

    public final void tchzyy(Object obj) {
        CardView cardView = this.st;
        if (cardView != null) {
            cardView.setUseCompatPadding(obj.equals(Boolean.valueOf(true)));
        }
    }

    public final void yyzdgd(Object obj) {
        CardView cardView = this.st;
        if (cardView != null) {
            cardView.setMaxCardElevation((float) s.a(this.a, obj));
        }
    }
}