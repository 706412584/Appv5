package i.runlibrary.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;

final class g implements ServiceConnection {
    final /* synthetic */ f a;

    g(f fVar) {
        this.a = fVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f.a = new Messenger(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}