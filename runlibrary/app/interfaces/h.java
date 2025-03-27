package i.runlibrary.app.interfaces;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class h implements OnClickListener {
    final /* synthetic */ JsPromptResult a;
    final /* synthetic */ EditText b;
    final /* synthetic */ onWebChromeClient c;

    h(onWebChromeClient onwebchromeclient, JsPromptResult jsPromptResult, EditText editText) {
        this.c = onwebchromeclient;
        this.a = jsPromptResult;
        this.b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.confirm(this.b.getText().toString());
    }
}