package i.runlibrary.app.v;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.EditText;
import android.widget.TextView;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.文本.视图事件;
import java.lang.reflect.Field;

public final class 编辑框 extends 文本 {
    /* renamed from: 事件 */
    public 视图事件 f177;
    /* renamed from: 视图 */
    public EditText f178;

    public 编辑框() {
        this.f178 = null;
        this.f177 = null;
        this.f177 = new 视图事件(null);
    }

    public 编辑框(AppInfo appInfo, EditText editText) {
        super(appInfo, editText);
        this.f178 = null;
        this.f177 = null;
        this.f178 = editText;
        this.f177 = new 视图事件(editText);
    }

    /* renamed from: 光标颜色 */
    public final boolean m835(Object obj) {
        if (this.f178 == null) {
            return false;
        }
        try {
            if (VERSION.SDK_INT >= 29) {
                try {
                    ((Drawable) TextView.class.getMethod("getTextCursorDrawable", new Class[0]).invoke(this.f178, new Object[0])).setColorFilter(ClientsUDP.a(obj), Mode.SRC_IN);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                int i = declaredField.getInt(this.f178);
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(this.f178);
                Field declaredField3 = obj2.getClass().getDeclaredField("mCursorDrawable");
                declaredField3.setAccessible(true);
                Drawable[] drawableArr = new Drawable[]{this.f178.getContext().getResources().getDrawable(i)};
                drawableArr[0].setColorFilter(ClientsUDP.a(obj), Mode.SRC_IN);
                declaredField3.set(obj2, drawableArr);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: 选择位置 */
    public final void m836(Object obj) {
        EditText editText = this.f178;
        if (editText != null) {
            editText.setSelection(s.d(obj));
        }
    }

    /* renamed from: 选择位置 */
    public final void m837(Object obj, Object obj2) {
        EditText editText = this.f178;
        if (editText != null) {
            editText.setSelection(s.d(obj), s.d(obj2));
        }
    }

    /* renamed from: 选择位置开头 */
    public final int m838() {
        EditText editText = this.f178;
        return editText == null ? -1 : editText.getSelectionStart();
    }

    /* renamed from: 选择位置结尾 */
    public final int m839() {
        EditText editText = this.f178;
        return editText == null ? -1 : editText.getSelectionEnd();
    }
}