package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import i.runlibrary.a.a;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.VC.wbjgz;

public final class ysbj extends vg {
    public ViewEvent sj;
    public ConstraintLayout st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public class ysbjgz extends wbjgz {
        public LayoutParams gz;

        public ysbjgz(AppInfo appInfo, View view) {
            super(appInfo, view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.gz = layoutParams;
            if (layoutParams == null) {
                this.gz = new ViewGroup.LayoutParams(-2, -2);
            }
        }

        private static int a(String str) {
            return str.equalsIgnoreCase("spread_inside") ? 1 : (!str.equalsIgnoreCase("spread") && str.equalsIgnoreCase("packed")) ? 2 : 0;
        }

        public void czhfkj(Object obj) {
            this.gz.verticalWeight = (float) s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void czqz(Object obj) {
            this.gz.verticalBias = s.f(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void czxcsl(Object obj) {
            this.gz.verticalChainStyle = a.a(obj.toString());
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void jsgjs(Object obj) {
            this.gz.endToEnd = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void jsgks(Object obj) {
            this.gz.endToStart = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void jxgjx(Object obj) {
            this.gz.baselineToBaseline = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void kgbl(Object obj) {
            this.gz.dimensionRatio = obj.toString();
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void ksgjs(Object obj) {
            this.gz.startToEnd = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void ksgks(Object obj) {
            this.gz.startToStart = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void sbgsb(Object obj) {
            this.gz.topToTop = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void sbgxb(Object obj) {
            this.gz.topToBottom = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void sphfkj(Object obj) {
            this.gz.horizontalWeight = (float) s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void spqz(Object obj) {
            this.gz.horizontalBias = s.f(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void spxcsl(Object obj) {
            this.gz.horizontalChainStyle = a.a(obj.toString());
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void wbjycjs(Object obj) {
            this.gz.goneEndMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void wbjycks(Object obj) {
            this.gz.goneStartMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void wbjycsb(Object obj) {
            this.gz.goneTopMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void wbjycxb(Object obj) {
            this.gz.goneBottomMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void wbjycyb(Object obj) {
            this.gz.goneRightMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void wbjyczb(Object obj) {
            this.gz.goneLeftMargin = s.a(this.appInfo, obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void xbgsb(Object obj) {
            this.gz.bottomToTop = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void xbgxb(Object obj) {
            this.gz.bottomToBottom = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void ybgyb(Object obj) {
            this.gz.rightToRight = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void ybgzb(Object obj) {
            this.gz.rightToLeft = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void zbgyb(Object obj) {
            this.gz.leftToRight = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void zbgzb(Object obj) {
            this.gz.leftToLeft = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }
    }

    public ysbj() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public ysbj(AppInfo appInfo, ConstraintLayout constraintLayout) {
        super(appInfo, constraintLayout);
        this.st = null;
        this.sj = null;
        this.st = constraintLayout;
        this.sj = new ViewEvent(this.v);
    }
}