package i.runlibrary.b;

import android.app.Activity;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.MediaRecorder;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Environment;
import android.util.DisplayMetrics;
import java.io.IOException;

public final class i {
    private boolean a = false;
    private Activity b;
    private String c = (Environment.getExternalStorageDirectory().toString() + "/iapp.mp4");
    private int d = 1280;
    private int e = 720;
    private int f = 1024000;
    private int g = 30;
    private MediaProjectionManager h;
    private MediaProjection i;
    private VirtualDisplay j;
    private j k;
    private int l;
    private MediaRecorder m;

    public i(Activity activity) {
        this.b = activity;
    }

    private void c() {
        this.m.stop();
        this.m.reset();
    }

    private VirtualDisplay d() {
        return this.i.createVirtualDisplay("MainActivity", this.d, this.e, this.l, 16, this.m.getSurface(), null, null);
    }

    public final void a(String str, int i, int i2, int i3, int i4) {
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.l = displayMetrics.densityDpi;
        this.h = (MediaProjectionManager) this.b.getSystemService("media_projection");
        this.m = new MediaRecorder();
        this.k = new j(this, (byte) 0);
    }

    public final void a(boolean z) {
        this.a = z;
        if (z) {
            String str = this.c;
            this.m.setAudioSource(1);
            this.m.setVideoSource(2);
            this.m.setOutputFormat(2);
            this.m.setVideoEncoder(2);
            this.m.setAudioEncoder(1);
            this.m.setVideoEncodingBitRate(this.f);
            this.m.setVideoFrameRate(this.g);
            this.m.setVideoSize(this.d, this.e);
            this.m.setOutputFile(str);
            try {
                this.m.prepare();
            } catch (IOException e) {
                e.printStackTrace();
                this.b.finish();
            }
            if (this.i == null) {
                this.b.startActivityForResult(new Intent(this.h.createScreenCaptureIntent()), m.a[3]);
                return;
            }
            this.j = d();
            this.m.start();
            return;
        }
        c();
        this.j.release();
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean a(int i, int i2, Intent intent) {
        if (i != m.a[3]) {
            this.a = false;
            return false;
        } else if (i2 != -1) {
            this.a = false;
            return false;
        } else {
            MediaProjection mediaProjection = this.h.getMediaProjection(i2, intent);
            this.i = mediaProjection;
            mediaProjection.registerCallback(this.k, null);
            this.j = d();
            this.m.start();
            return true;
        }
    }

    public final void b() {
        if (this.a) {
            this.a = false;
        }
        MediaRecorder mediaRecorder = this.m;
        if (mediaRecorder != null) {
            mediaRecorder.release();
            this.m = null;
        }
        VirtualDisplay virtualDisplay = this.j;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.j = null;
        }
        MediaProjection mediaProjection = this.i;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(this.k);
            this.i.stop();
            this.i = null;
        }
    }

    public final void b(String str, int i, int i2, int i3, int i4) {
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }
}