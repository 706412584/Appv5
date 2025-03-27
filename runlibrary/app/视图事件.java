package i.runlibrary.app;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;

public class 视图事件 {
    private View a = null;

    public 视图事件(View view) {
        this.a = view;
    }

    /* renamed from: 单击 */
    public boolean m646(OnClickListener onClickListener) {
        View view = this.a;
        if (view == null) {
            return false;
        }
        view.setOnClickListener(onClickListener);
        return true;
    }

    /* renamed from: 获得焦点 */
    public boolean m647(OnFocusChangeListener onFocusChangeListener) {
        View view = this.a;
        if (view == null) {
            return false;
        }
        view.setOnFocusChangeListener(onFocusChangeListener);
        return true;
    }

    /* renamed from: 触屏 */
    public boolean m648(OnTouchListener onTouchListener) {
        View view = this.a;
        if (view == null) {
            return false;
        }
        view.setOnTouchListener(onTouchListener);
        return true;
    }

    /* renamed from: 触屏长按 */
    public boolean m649(OnLongClickListener onLongClickListener) {
        View view = this.a;
        if (view == null) {
            return false;
        }
        view.setOnLongClickListener(onLongClickListener);
        return true;
    }

    /* renamed from: 键盘触发 */
    public boolean m650(OnKeyListener onKeyListener) {
        View view = this.a;
        if (view == null) {
            return false;
        }
        view.setOnKeyListener(onKeyListener);
        return true;
    }
}