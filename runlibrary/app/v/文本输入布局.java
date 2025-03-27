package i.runlibrary.app.v;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;

public final class 文本输入布局 extends 线性布局 {
    /* renamed from: 事件 */
    public 视图事件 f161;
    /* renamed from: 视图 */
    public TextInputLayout f162;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 文本输入布局() {
        this.f162 = null;
        this.f161 = null;
        this.f161 = new 视图事件(null);
    }

    public 文本输入布局(AppInfo appInfo, TextInputLayout textInputLayout) {
        super(appInfo, textInputLayout);
        this.f162 = null;
        this.f161 = null;
        this.f162 = textInputLayout;
        this.f161 = new 视图事件(textInputLayout);
    }

    /* renamed from: 最大字符长度 */
    public final void m796(Object obj) {
        TextInputLayout textInputLayout = this.f162;
        if (textInputLayout != null) {
            textInputLayout.setCounterMaxLength(s.d(obj));
        }
    }

    /* renamed from: 统计字数是否可见 */
    public final void m797(Object obj) {
        TextInputLayout textInputLayout = this.f162;
        if (textInputLayout != null) {
            textInputLayout.setCounterEnabled(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 错误提示字符 */
    public final void m798(Object obj) {
        TextInputLayout textInputLayout = this.f162;
        if (textInputLayout != null) {
            textInputLayout.setError(obj.toString());
        }
    }

    /* renamed from: 错误提示是否可见 */
    public final void m799(Object obj) {
        TextInputLayout textInputLayout = this.f162;
        if (textInputLayout != null) {
            textInputLayout.setErrorEnabled(obj.equals(Boolean.valueOf(true)));
        }
    }
}