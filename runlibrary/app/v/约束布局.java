package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import i.runlibrary.a.a;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.基础.外边距规则;

public final class 约束布局 extends 视图组 {
    /* renamed from: 事件 */
    public 视图事件 f116;
    /* renamed from: 视图 */
    public ConstraintLayout f117;

    public class 约束布局规则 extends 外边距规则 {
        /* renamed from: 规则 */
        public LayoutParams f118;

        public 约束布局规则(AppInfo appInfo, View view) {
            super(appInfo, view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.f118 = layoutParams;
            if (layoutParams == null) {
                this.f118 = new ViewGroup.LayoutParams(-2, -2);
            }
        }

        private static int a(String str) {
            return str.equalsIgnoreCase("spread_inside") ? 1 : (!str.equalsIgnoreCase("spread") && str.equalsIgnoreCase("packed")) ? 2 : 0;
        }

        /* renamed from: 上边给上边 */
        public void m683(Object obj) {
            this.f118.topToTop = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 上边给下边 */
        public void m684(Object obj) {
            this.f118.topToBottom = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 下边给上边 */
        public void m685(Object obj) {
            this.f118.bottomToTop = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 下边给下边 */
        public void m686(Object obj) {
            this.f118.bottomToBottom = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 右边给右边 */
        public void m687(Object obj) {
            this.f118.rightToRight = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 右边给左边 */
        public void m688(Object obj) {
            this.f118.rightToLeft = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 垂直划分空间 */
        public void m689(Object obj) {
            this.f118.verticalWeight = (float) s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 垂直形成锁链 */
        public void m690(Object obj) {
            this.f118.verticalChainStyle = a.a(obj.toString());
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 垂直权重 */
        public void m691(Object obj) {
            this.f118.verticalBias = s.f(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 基线给基线 */
        public void m692(Object obj) {
            this.f118.baselineToBaseline = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 外边距隐藏上边 */
        public void m693(Object obj) {
            this.f118.goneTopMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 外边距隐藏下边 */
        public void m694(Object obj) {
            this.f118.goneBottomMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 外边距隐藏右边 */
        public void m695(Object obj) {
            this.f118.goneRightMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 外边距隐藏左边 */
        public void m696(Object obj) {
            this.f118.goneLeftMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 外边距隐藏开始 */
        public void m697(Object obj) {
            this.f118.goneStartMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 外边距隐藏结束 */
        public void m698(Object obj) {
            this.f118.goneEndMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 宽高比例 */
        public void m699(Object obj) {
            this.f118.dimensionRatio = obj.toString();
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 左边给右边 */
        public void m700(Object obj) {
            this.f118.leftToRight = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 左边给左边 */
        public void m701(Object obj) {
            this.f118.leftToLeft = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 开始给开始 */
        public void m702(Object obj) {
            this.f118.startToStart = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 开始给结束 */
        public void m703(Object obj) {
            this.f118.startToEnd = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 水平划分空间 */
        public void m704(Object obj) {
            this.f118.horizontalWeight = (float) s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 水平形成锁链 */
        public void m705(Object obj) {
            this.f118.horizontalChainStyle = a.a(obj.toString());
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 水平权重 */
        public void m706(Object obj) {
            this.f118.horizontalBias = s.f(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 结束给开始 */
        public void m707(Object obj) {
            this.f118.endToStart = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }

        /* renamed from: 结束给结束 */
        public void m708(Object obj) {
            this.f118.endToEnd = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.f118);
            }
        }
    }

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 约束布局() {
        this.f117 = null;
        this.f116 = null;
        this.f116 = new 视图事件(null);
    }

    public 约束布局(AppInfo appInfo, ConstraintLayout constraintLayout) {
        super(appInfo, constraintLayout);
        this.f117 = null;
        this.f116 = null;
        this.f117 = constraintLayout;
        this.f116 = new 视图事件(constraintLayout);
    }
}