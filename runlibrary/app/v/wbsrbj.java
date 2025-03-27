package i.runlibrary.app.v;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class wbsrbj extends xxbj {
    public ViewEvent sj;
    public TextInputLayout st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public wbsrbj() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public wbsrbj(AppInfo appInfo, TextInputLayout textInputLayout) {
        super(appInfo, textInputLayout);
        this.st = null;
        this.sj = null;
        this.st = textInputLayout;
        this.sj = new ViewEvent(this.v);
    }

    public final void cwtssfkj(Object obj) {
        TextInputLayout textInputLayout = this.st;
        if (textInputLayout != null) {
            textInputLayout.setErrorEnabled(obj.equals(Boolean.valueOf(true)));
        }
    }

    public final void cwtszf(Object obj) {
        TextInputLayout textInputLayout = this.st;
        if (textInputLayout != null) {
            textInputLayout.setError(obj.toString());
        }
    }

    public final void tjzssfkj(Object obj) {
        TextInputLayout textInputLayout = this.st;
        if (textInputLayout != null) {
            textInputLayout.setCounterEnabled(obj.equals(Boolean.valueOf(true)));
        }
    }

    public final void zdzfcd(Object obj) {
        TextInputLayout textInputLayout = this.st;
        if (textInputLayout != null) {
            textInputLayout.setCounterMaxLength(s.d(obj));
        }
    }
}