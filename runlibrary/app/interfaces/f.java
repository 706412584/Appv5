package i.runlibrary.app.interfaces;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

final class f implements OnCancelListener {
    final /* synthetic */ JsPromptResult a;
    final /* synthetic */ onWebChromeClient b;

    f(onWebChromeClient onwebchromeclient, JsPromptResult jsPromptResult) {
        this.b = onwebchromeclient;
        this.a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.cancel();
    }
}