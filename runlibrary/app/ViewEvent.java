package i.runlibrary.app;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;

public class ViewEvent {
    private View a = null;

    public ViewEvent(View view) {
        this.a = view;
    }

    public boolean cp(OnTouchListener onTouchListener) {
        View view = this.a;
        if (view == null) {
            return false;
        }
        view.setOnTouchListener(onTouchListener);
        return true;
    }

    public boolean cpca(OnLongClickListener onLongClickListener) {
        View view = this.a;
        if (view == null) {
            return false;
        }
        view.setOnLongClickListener(onLongClickListener);
        return true;
    }

    public boolean dj(OnClickListener onClickListener) {
        View view = this.a;
        if (view == null) {
            return false;
        }
        view.setOnClickListener(onClickListener);
        return true;
    }

    public boolean hdjd(OnFocusChangeListener onFocusChangeListener) {
        View view = this.a;
        if (view == null) {
            return false;
        }
        view.setOnFocusChangeListener(onFocusChangeListener);
        return true;
    }

    public boolean jpcf(OnKeyListener onKeyListener) {
        View view = this.a;
        if (view == null) {
            return false;
        }
        view.setOnKeyListener(onKeyListener);
        return true;
    }
}