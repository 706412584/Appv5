package i.runlibrary.b;

import android.media.projection.MediaProjection.Callback;

final class j extends Callback {
    final /* synthetic */ i a;

    private j(i iVar) {
        this.a = iVar;
    }

    /* synthetic */ j(i iVar, byte b) {
        this(iVar);
    }

    public final void onStop() {
        super.onStop();
        if (this.a.a) {
            this.a.a = false;
            this.a.c();
            this.a.j.release();
            this.a.i.stop();
            this.a.i.unregisterCallback(this.a.k);
            this.a.i = null;
        }
    }
}