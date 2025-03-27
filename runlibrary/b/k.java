package i.runlibrary.b;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.Image.Plane;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;

public final class k {
    public Bitmap a = null;
    private l b = null;
    private ImageReader c;
    private MediaProjection d;
    private VirtualDisplay e;
    private final SoftReference f;

    public k(Context context, int i, Intent intent) {
        SoftReference softReference = new SoftReference(context);
        this.f = softReference;
        this.d = ((MediaProjectionManager) ((Context) softReference.get()).getSystemService("media_projection")).getMediaProjection(i, intent);
        this.c = ImageReader.newInstance(d(), e(), 1, 1);
    }

    private static int d() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    private static int e() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public final Bitmap a() {
        Image acquireLatestImage = this.c.acquireLatestImage();
        if (acquireLatestImage == null) {
            return null;
        }
        int width = acquireLatestImage.getWidth();
        int height = acquireLatestImage.getHeight();
        Plane[] planes = acquireLatestImage.getPlanes();
        ByteBuffer buffer = planes[0].getBuffer();
        int pixelStride = planes[0].getPixelStride();
        Bitmap createBitmap = Bitmap.createBitmap(((planes[0].getRowStride() - (pixelStride * width)) / pixelStride) + width, height, Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(buffer);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, width, height);
        acquireLatestImage.close();
        return createBitmap2;
    }

    public final void b() {
        ImageReader imageReader = this.c;
        if (imageReader != null) {
            try {
                imageReader.close();
                this.c = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        VirtualDisplay virtualDisplay = this.e;
        if (virtualDisplay != null) {
            try {
                virtualDisplay.release();
                this.e = null;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        MediaProjection mediaProjection = this.d;
        if (mediaProjection != null) {
            try {
                mediaProjection.stop();
                this.d = null;
            } catch (Exception e22) {
                e22.printStackTrace();
            }
        }
    }

    public final void c() {
        this.e = this.d.createVirtualDisplay("screen-mirror", d(), e(), Resources.getSystem().getDisplayMetrics().densityDpi, 16, this.c.getSurface(), null, null);
    }
}