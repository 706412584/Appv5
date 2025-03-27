package i.runlibrary.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;

final class k extends Handler {
    final /* synthetic */ i a;

    k(i iVar, Looper looper) {
        this.a = iVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                l lVar = (l) message.obj;
                if (lVar.h) {
                    if (lVar.e != null) {
                        lVar.e.setBackgroundDrawable(lVar.g);
                        return;
                    } else if (lVar.f != null) {
                        lVar.f.setBackgroundDrawable(lVar.g);
                        return;
                    }
                } else if (lVar.e != null) {
                    lVar.e.setImageDrawable(lVar.g);
                    return;
                } else if (lVar.f instanceof ImageView) {
                    ((ImageView) lVar.f).setImageDrawable(lVar.g);
                }
            }
            return;
        }
        i.g(this.a);
    }
}