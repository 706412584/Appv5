package i.runlibrary.app.v;

import android.text.InputFilter;
import android.text.Spanned;

final class m implements InputFilter {
    final /* synthetic */ 文本 a;

    m(文本 文本) {
        this.a = 文本;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return charSequence.length() <= 0 ? spanned.subSequence(i3, i4) : "";
    }
}