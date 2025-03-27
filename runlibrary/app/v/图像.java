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

public class 图像 extends 基础 {
    /* renamed from: 事件 */
    public 视图事件 f132;
    /* renamed from: 视图 */
    public ImageView f133;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 图像() {
        this.f133 = null;
        this.f132 = null;
        this.f132 = new 视图事件(null);
    }

    public 图像(AppInfo appInfo, ImageView imageView) {
        super(appInfo, imageView);
        this.f133 = null;
        this.f132 = null;
        this.f133 = imageView;
        this.f132 = new 视图事件(imageView);
    }

    /* renamed from: 图像 */
    public void m733(Object obj) {
        if (this.f133 != null) {
            if (this.a.c != null && (obj instanceof String)) {
                String obj2 = obj.toString();
                String toLowerCase = obj2.toLowerCase();
                if (toLowerCase.startsWith("http:") || toLowerCase.startsWith("https:") || toLowerCase.startsWith("ftp:")) {
                    i.a(this.a.c, this.f133, obj2, toLowerCase, false);
                    return;
                }
            }
            this.f133.setImageDrawable(a.a(obj, this.a.c));
        }
    }

    /* renamed from: 控制图像大小 */
    public void m734(Object obj) {
        ImageView imageView = this.f133;
        if (imageView != null) {
            ScaleType scaleType = obj.equals("center") ? ScaleType.CENTER : obj.equals("centercrop") ? ScaleType.CENTER_CROP : obj.equals("centerinside") ? ScaleType.CENTER_INSIDE : obj.equals("fitcenter") ? ScaleType.FIT_CENTER : obj.equals("fitend") ? ScaleType.FIT_END : obj.equals("fitstart") ? ScaleType.FIT_START : obj.equals("fitxy") ? ScaleType.FIT_XY : obj.equals("matrix") ? ScaleType.MATRIX : null;
            imageView.setScaleType(scaleType);
        }
    }

    /* renamed from: 最大宽 */
    public void m735(Object obj) {
        ImageView imageView = this.f133;
        if (imageView != null) {
            imageView.setMaxWidth(s.a(this.a, obj));
        }
    }

    /* renamed from: 最大高 */
    public void m736(Object obj) {
        ImageView imageView = this.f133;
        if (imageView != null) {
            imageView.setMaxHeight(s.a(this.a, obj));
        }
    }

    /* renamed from: 颜色过滤 */
    public void m737(Object obj) {
        if (obj instanceof ColorFilter) {
            this.f133.setColorFilter((ColorFilter) obj);
        } else {
            this.f133.setColorFilter(ClientsUDP.a(obj));
        }
    }

    /* renamed from: 高宽比 */
    public void m738(Object obj) {
        ImageView imageView = this.f133;
        if (imageView != null) {
            imageView.setAdjustViewBounds(obj.equals(Boolean.valueOf(true)));
        }
    }
}