package i.runlibrary.app.v;

import android.view.View;
import android.widget.ProgressBar;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public class 进度条 extends 基础 {
    /* renamed from: 事件 */
    public 视图事件 f157;
    /* renamed from: 视图 */
    public ProgressBar f158;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View a = null;

        public 视图事件(View view) {
            super(view);
            this.a = view;
        }
    }

    public 进度条() {
        this.f158 = null;
        this.f157 = null;
        this.f157 = new 视图事件(null);
    }

    public 进度条(AppInfo appInfo, ProgressBar progressBar) {
        super(appInfo, progressBar);
        this.f158 = null;
        this.f157 = null;
        this.f158 = progressBar;
        this.f157 = new 视图事件(progressBar);
    }

    /* renamed from: 上限值 */
    public void m793(Object obj) {
        ProgressBar progressBar = this.f158;
        if (progressBar != null) {
            progressBar.setMax(s.d(obj));
        }
    }

    /* renamed from: 进度值 */
    public int m794() {
        ProgressBar progressBar = this.f158;
        return progressBar == null ? -1 : progressBar.getProgress();
    }

    /* renamed from: 进度值 */
    public void m795(Object obj) {
        ProgressBar progressBar = this.f158;
        if (progressBar != null) {
            progressBar.setProgress(s.d(obj));
        }
    }
}