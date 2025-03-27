package i.runlibrary.app.v;

import android.view.View;
import androidx.cardview.widget.CardView;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class 卡片 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f142;
    /* renamed from: 视图 */
    public CardView f143;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 卡片() {
        this.f143 = null;
        this.f142 = null;
        this.f142 = new 视图事件(null);
    }

    public 卡片(AppInfo appInfo, CardView cardView) {
        super(appInfo, cardView);
        this.f143 = null;
        this.f142 = null;
        this.f143 = cardView;
        this.f142 = new 视图事件(cardView);
    }

    /* renamed from: 内边距 */
    public final boolean m742(Object obj, Object obj2, Object obj3, Object obj4) {
        CardView cardView = this.f143;
        if (cardView == null) {
            return false;
        }
        cardView.setContentPadding(s.a(this.a, obj), s.a(this.a, obj2), s.a(this.a, obj3), s.a(this.a, obj4));
        return true;
    }

    /* renamed from: 卡片圆角大小 */
    public final void m743(Object obj) {
        CardView cardView = this.f143;
        if (cardView != null) {
            cardView.setRadius((float) s.a(this.a, obj));
        }
    }

    /* renamed from: 卡片背景颜色 */
    public final void m744(Object obj) {
        CardView cardView = this.f143;
        if (cardView != null) {
            cardView.setCardBackgroundColor(ClientsUDP.a(obj));
        }
    }

    /* renamed from: 卡片阴影大小 */
    public final void m745(Object obj) {
        CardView cardView = this.f143;
        if (cardView != null) {
            cardView.setCardElevation((float) s.a(this.a, obj));
        }
    }

    /* renamed from: 填充绘制阴影 */
    public final void m746(Object obj) {
        CardView cardView = this.f143;
        if (cardView != null) {
            cardView.setUseCompatPadding(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 防止内容边角重叠 */
    public final void m747(Object obj) {
        CardView cardView = this.f143;
        if (cardView != null) {
            cardView.setPreventCornerOverlap(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 阴影最大高度 */
    public final void m748(Object obj) {
        CardView cardView = this.f143;
        if (cardView != null) {
            cardView.setMaxCardElevation((float) s.a(this.a, obj));
        }
    }
}