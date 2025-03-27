package i.runlibrary.app.interfaces;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class e implements OnClickListener {
    final /* synthetic */ JsResult a;
    final /* synthetic */ onWebChromeClient b;

    e(onWebChromeClient onwebchromeclient, JsResult jsResult) {
        this.b = onwebchromeclient;
        this.a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.confirm();
    }
}