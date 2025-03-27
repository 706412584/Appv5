package i.runlibrary.app.v;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.EditText;
import android.widget.TextView;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.v.wb.ViewEvent;
import java.lang.reflect.Field;

public final class bjk extends wb {
    public ViewEvent sj;
    public EditText st;

    public bjk() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public bjk(AppInfo appInfo, EditText editText) {
        super(appInfo, editText);
        this.st = null;
        this.sj = null;
        this.st = editText;
        this.sj = new ViewEvent(editText);
    }

    public final boolean gbys(Object obj) {
        if (this.st == null) {
            return false;
        }
        try {
            if (VERSION.SDK_INT >= 29) {
                try {
                    ((Drawable) TextView.class.getMethod("getTextCursorDrawable", new Class[0]).invoke(this.st, new Object[0])).setColorFilter(ClientsUDP.a(obj), Mode.SRC_IN);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                int i = declaredField.getInt(this.st);
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(this.st);
                Field declaredField3 = obj2.getClass().getDeclaredField("mCursorDrawable");
                declaredField3.setAccessible(true);
                Drawable[] drawableArr = new Drawable[]{this.st.getContext().getResources().getDrawable(i)};
                drawableArr[0].setColorFilter(ClientsUDP.a(obj), Mode.SRC_IN);
                declaredField3.set(obj2, drawableArr);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void xzwz(Object obj) {
        EditText editText = this.st;
        if (editText != null) {
            editText.setSelection(s.d(obj));
        }
    }

    public final void xzwz(Object obj, Object obj2) {
        EditText editText = this.st;
        if (editText != null) {
            editText.setSelection(s.d(obj), s.d(obj2));
        }
    }

    public final int xzwzjw() {
        EditText editText = this.st;
        return editText == null ? -1 : editText.getSelectionEnd();
    }

    public final int xzwzks() {
        EditText editText = this.st;
        return editText == null ? -1 : editText.getSelectionStart();
    }
}