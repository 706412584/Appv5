package i.runlibrary.app.v;

import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import i.runlibrary.a.d;
import i.runlibrary.app.AppInfo;
import java.io.File;

public final class sp extends VC {
    public ViewEvent sj;
    public VideoView st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public sp() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public sp(AppInfo appInfo, VideoView videoView) {
        super(appInfo, videoView);
        this.st = null;
        this.sj = null;
        this.st = videoView;
        this.sj = new ViewEvent(this.v);
    }

    public final void bf() {
        try {
            this.st.requestFocus();
            this.st.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final int bfwz() {
        try {
            return this.st.getCurrentPosition();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public final int bfzt() {
        try {
            return this.st.isPlaying() ? 1 : 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public final void hf() {
        try {
            this.st.resume();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final int mtsc() {
        try {
            return this.st.getDuration();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public final void tz() {
        try {
            this.st.stopPlayback();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void zdbfwz(int i) {
        try {
            this.st.seekTo(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final MediaController zrsp(Object obj) {
        return zrsp(obj, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MediaController zrsp(Object obj, OnCompletionListener onCompletionListener) {
        VideoView videoView;
        Uri uri;
        MediaController mediaController;
        if (obj instanceof Uri) {
            videoView = this.st;
            uri = (Uri) obj;
        } else {
            String stringBuilder;
            if (obj instanceof Number) {
                stringBuilder = new e("android.resource://").append(this.a.c.getPackageName()).append("/").append(obj).toString();
            } else {
                stringBuilder = obj.toString();
                String toLowerCase = stringBuilder.toLowerCase();
                if (!(toLowerCase.startsWith("http:") || toLowerCase.startsWith("https:") || toLowerCase.startsWith("rtsp:"))) {
                    if (!toLowerCase.startsWith("ftp:")) {
                        try {
                            File eVar = new e(d.f(this.a.c, stringBuilder));
                            if (!eVar.exists()) {
                                return null;
                            }
                            this.st.setVideoPath(eVar.getAbsolutePath());
                            if (onCompletionListener != null) {
                                this.st.setOnCompletionListener(onCompletionListener);
                            }
                            mediaController = new MediaController(this.a.c);
                            this.st.setMediaController(mediaController);
                            return mediaController;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            videoView = this.st;
            uri = Uri.parse(stringBuilder);
        }
        videoView.setVideoURI(uri);
        if (onCompletionListener != null) {
        }
        mediaController = new MediaController(this.a.c);
        this.st.setMediaController(mediaController);
        return mediaController;
    }

    public final void zt() {
        try {
            this.st.pause();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}