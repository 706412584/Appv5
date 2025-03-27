package i.runlibrary.app.interfaces;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

final class g implements OnClickListener {
    final /* synthetic */ JsPromptResult a;
    final /* synthetic */ onWebChromeClient b;

    g(onWebChromeClient onwebchromeclient, JsPromptResult jsPromptResult) {
        this.b = onwebchromeclient;
        this.a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.cancel();
    }
}