package i.runlibrary.app.interfaces;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

final class c implements OnCancelListener {
    final /* synthetic */ JsResult a;
    final /* synthetic */ onWebChromeClient b;

    c(onWebChromeClient onwebchromeclient, JsResult jsResult) {
        this.b = onwebchromeclient;
        this.a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.cancel();
    }
}