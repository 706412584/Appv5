package i.runlibrary.app.interfaces;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class d implements OnClickListener {
    final /* synthetic */ JsResult a;
    final /* synthetic */ onWebChromeClient b;

    d(onWebChromeClient onwebchromeclient, JsResult jsResult) {
        this.b = onwebchromeclient;
        this.a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.cancel();
    }
}