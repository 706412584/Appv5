package i.runlibrary.app.v;

import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import i.runlibrary.a.d;
import i.runlibrary.app.AppInfo;
import java.io.File;

public final class 视频 extends 基础 {
    /* renamed from: 事件 */
    public 视图事件 f185;
    /* renamed from: 视图 */
    public VideoView f186;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 视频() {
        this.f186 = null;
        this.f185 = null;
        this.f185 = new 视图事件(null);
    }

    public 视频(AppInfo appInfo, VideoView videoView) {
        super(appInfo, videoView);
        this.f186 = null;
        this.f185 = null;
        this.f186 = videoView;
        this.f185 = new 视图事件(videoView);
    }

    /* renamed from: 停止 */
    public final void m851() {
        try {
            this.f186.stopPlayback();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: 媒体时长 */
    public final int m852() {
        try {
            return this.f186.getDuration();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: 恢复 */
    public final void m853() {
        try {
            this.f186.resume();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: 指定播放位置 */
    public final void m854(int i) {
        try {
            this.f186.seekTo(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: 播放 */
    public final void m855() {
        try {
            this.f186.requestFocus();
            this.f186.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: 播放位置 */
    public final int m451() {
        try {
            return this.f186.getCurrentPosition();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: 播放状态 */
    public final int m452() {
        try {
            return this.f186.isPlaying() ? 1 : 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: 暂停 */
    public final void m856() {
        try {
            this.f186.pause();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: 载入视频 */
    public final MediaController m857(Object obj) {
        return m858(obj, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: 载入视频 */
    public final MediaController m858(Object obj, OnCompletionListener onCompletionListener) {
        VideoView videoView;
        Uri uri;
        MediaController mediaController;
        if (obj instanceof Uri) {
            videoView = this.f186;
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
                            this.f186.setVideoPath(eVar.getAbsolutePath());
                            if (onCompletionListener != null) {
                                this.f186.setOnCompletionListener(onCompletionListener);
                            }
                            mediaController = new MediaController(this.a.c);
                            this.f186.setMediaController(mediaController);
                            return mediaController;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            videoView = this.f186;
            uri = Uri.parse(stringBuilder);
        }
        videoView.setVideoURI(uri);
        if (onCompletionListener != null) {
        }
        mediaController = new MediaController(this.a.c);
        this.f186.setMediaController(mediaController);
        return mediaController;
    }
}