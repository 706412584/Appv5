package i.runlibrary.app.v;

import android.view.View;
import android.widget.RatingBar;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class 评分 extends 进度条 {
    /* renamed from: 事件 */
    public 视图事件 f187;
    /* renamed from: 视图 */
    public RatingBar f188;

    public class 视图事件 extends i.runlibrary.app.v.进度条.视图事件 {
        private View c = null;

        public 视图事件(View view) {
            super(view);
            this.c = view;
        }
    }

    public 评分() {
        this.f188 = null;
        this.f187 = null;
        this.f187 = new 视图事件(null);
    }

    public 评分(AppInfo appInfo, RatingBar ratingBar) {
        super(appInfo, ratingBar);
        this.f188 = null;
        this.f187 = null;
        this.f188 = ratingBar;
        this.f187 = new 视图事件(ratingBar);
    }

    /* renamed from: 上限值 */
    public final void m793(Object obj) {
        RatingBar ratingBar = this.f188;
        if (ratingBar != null) {
            ratingBar.setMax(s.d(obj));
        }
    }

    /* renamed from: 允许用户操作 */
    public final void m859(Object obj) {
        RatingBar ratingBar = this.f188;
        if (ratingBar != null) {
            ratingBar.setIsIndicator(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 星数量 */
    public final void m860(Object obj) {
        RatingBar ratingBar = this.f188;
        if (ratingBar != null) {
            ratingBar.setNumStars(s.d(obj));
        }
    }

    /* renamed from: 评分 */
    public final float m861() {
        RatingBar ratingBar = this.f188;
        return ratingBar == null ? -1.0f : ratingBar.getRating();
    }

    /* renamed from: 评分 */
    public final void m376(Object obj) {
        RatingBar ratingBar = this.f188;
        if (ratingBar != null) {
            ratingBar.setRating(s.f(obj));
        }
    }
}