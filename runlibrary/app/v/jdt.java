package i.runlibrary.app.v;

import android.view.View;
import android.widget.ProgressBar;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public class jdt extends VC {
    public ViewEvent sj;
    public ProgressBar st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public jdt() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public jdt(AppInfo appInfo, ProgressBar progressBar) {
        super(appInfo, progressBar);
        this.st = null;
        this.sj = null;
        this.st = progressBar;
        this.sj = new ViewEvent(this.v);
    }

    public int jdz() {
        ProgressBar progressBar = this.st;
        return progressBar == null ? -1 : progressBar.getProgress();
    }

    public void jdz(Object obj) {
        ProgressBar progressBar = this.st;
        if (progressBar != null) {
            progressBar.setProgress(s.d(obj));
        }
    }

    public void sxz(Object obj) {
        ProgressBar progressBar = this.st;
        if (progressBar != null) {
            progressBar.setMax(s.d(obj));
        }
    }
}