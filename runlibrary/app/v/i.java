package i.runlibrary.app.v;

import android.text.InputFilter;
import android.text.Spanned;

final class i implements InputFilter {
    final /* synthetic */ wb a;

    i(wb wbVar) {
        this.a = wbVar;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return charSequence.length() <= 0 ? spanned.subSequence(i3, i4) : "";
    }
}