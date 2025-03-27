package i.runlibrary.app;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import i.runlibrary.app.gj.mtbf;

final class a implements OnCompletionListener {
    final /* synthetic */ mtbf a;

    a(mtbf mtbf) {
        this.a = mtbf;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.release();
    }
}