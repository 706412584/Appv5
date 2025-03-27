package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.xxbj.xxbjgz;

public final class bgx extends xxbj {
    public ViewEvent sj;
    public TableRow st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public class bgxgz extends xxbjgz {
        public LayoutParams gz;

        public bgxgz(AppInfo appInfo, View view) {
            super(appInfo, view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.gz = layoutParams;
            if (layoutParams == null) {
                this.gz = new ViewGroup.LayoutParams(-2, -2);
            }
        }

        public void zdjl(Object obj) {
            this.gz.column = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }

        public void zjl(Object obj) {
            this.gz.span = s.d(obj);
            if (this.v != null) {
                this.v.setLayoutParams(this.gz);
            }
        }
    }

    public bgx() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public bgx(AppInfo appInfo, TableRow tableRow) {
        super(appInfo, tableRow);
        this.st = null;
        this.sj = null;
        this.st = tableRow;
        this.sj = new ViewEvent(this.v);
    }
}