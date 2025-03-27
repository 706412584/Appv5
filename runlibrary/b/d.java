package i.runlibrary.b;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.media.MediaRecorder;
import android.media.projection.MediaProjectionManager;
import android.os.Build.VERSION;
import android.os.Vibrator;
import android.view.View;
import i.app.FileProvider;
import i.runlibrary.a.n;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.net.DatagramSocket;
import java.util.ArrayList;

public class d {
    private AppInfo a;
    private i b = null;
    private MediaRecorder c = null;
    private Vibrator d = null;
    private CameraManager e = null;
    private String f = null;
    private Camera g = null;
    private SensorManager h = null;
    private ArrayList i = new ArrayList();
    private ArrayList j = new ArrayList();
    public k screenShotHelper = null;

    public d(AppInfo appInfo) {
        this.a = appInfo;
    }

    private boolean a(boolean z) {
        if (this.e == null) {
            this.e = (CameraManager) this.a.c.getSystemService("camera");
        }
        if (this.f == null) {
            this.f = initCameraManager(this.e, 1);
        }
        String str = this.f;
        if (str != null) {
            try {
                this.e.setTorchMode(str, z);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static String initCameraManager(CameraManager cameraManager, int i) {
        try {
            for (String str : cameraManager.getCameraIdList()) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (bool != null && bool.booleanValue() && num != null && num.intValue() == i) {
                    return str;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean cgq(Object obj, Object obj2, SensorEventListener sensorEventListener) {
        if (this.h == null) {
            this.h = (SensorManager) this.a.c.getSystemService("sensor");
        }
        Sensor defaultSensor = this.h.getDefaultSensor(s.d(obj));
        if (defaultSensor == null) {
            return false;
        }
        this.i.add(defaultSensor);
        this.j.add(sensorEventListener);
        this.h.registerListener(sensorEventListener, defaultSensor, s.d(obj2));
        return true;
    }

    public void cgqsf() {
        if (this.h != null) {
            int size = this.i.size();
            for (int i = 0; i < size; i++) {
                try {
                    this.h.unregisterListener((SensorEventListener) this.j.get(i), (Sensor) this.i.get(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        this.i.clear();
        this.j.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c A:{SYNTHETIC, Splitter: B:33:0x007c} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A:{SYNTHETIC, Splitter: B:25:0x006d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean jp(Object obj, Object obj2) {
        Exception e;
        Throwable th;
        int d = s.d(obj2);
        View decorView = this.a.a.getWindow().getDecorView();
        boolean z = true;
        decorView.setDrawingCacheEnabled(true);
        decorView.buildDrawingCache();
        Bitmap drawingCache = decorView.getDrawingCache();
        File eVar = obj instanceof File ? (File) obj : new e(FileProvider.a(this.a.c, obj.toString()));
        if (eVar.exists()) {
            eVar.delete();
        }
        i.runlibrary.a.d.a(eVar.getAbsolutePath(), false);
        DatagramSocket datagramSocket = null;
        try {
            eVar.createNewFile();
            FileOutputStream fileInputStream = new FileInputStream(eVar);
            try {
                drawingCache.compress(CompressFormat.JPEG, d, fileInputStream);
                fileInputStream.flush();
                try {
                    fileInputStream.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (Exception e3) {
                e2 = e3;
                datagramSocket = fileInputStream;
                try {
                    e2.printStackTrace();
                    if (datagramSocket != null) {
                        try {
                            datagramSocket.close();
                        } catch (Exception e22) {
                            e22.printStackTrace();
                        }
                    }
                    z = false;
                    decorView.setDrawingCacheEnabled(false);
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    if (datagramSocket != null) {
                        try {
                            datagramSocket.close();
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                datagramSocket = fileInputStream;
                if (datagramSocket != null) {
                }
                throw th;
            }
        } catch (Exception e5) {
            e22 = e5;
            e22.printStackTrace();
            if (datagramSocket != null) {
            }
            z = false;
            decorView.setDrawingCacheEnabled(false);
            return z;
        }
        decorView.setDrawingCacheEnabled(false);
        return z;
    }

    public void lpm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String a = FileProvider.a(this.a.c, obj.toString());
        i.runlibrary.a.d.a(a, false);
        i iVar = this.b;
        if (iVar == null) {
            iVar = new i(this.a.a);
            this.b = iVar;
            iVar.a(a, s.d(obj2), s.d(obj3), s.d(obj4), s.d(obj5));
            return;
        }
        iVar.b(a, s.d(obj2), s.d(obj3), s.d(obj4), s.d(obj5));
    }

    public boolean lpmhd(int i, int i2, Intent intent) {
        return this.b.a(i, i2, intent);
    }

    public void lpmks() {
        this.b.a(true);
    }

    public void lpmsf() {
        this.b.b();
        this.b = null;
    }

    public void lpmtz() {
        this.b.a(false);
    }

    public boolean ly(Object obj) {
        String absolutePath = (obj instanceof File ? (File) obj : new e(FileProvider.a(this.a.c, obj.toString()))).getAbsolutePath();
        i.runlibrary.a.d.a(absolutePath, false);
        if (this.c == null) {
            this.c = new MediaRecorder();
        }
        this.c.setAudioSource(1);
        this.c.setOutputFormat(0);
        this.c.setOutputFile(absolutePath);
        this.c.setAudioEncoder(0);
        this.c.prepare();
        this.c.start();
        return true;
    }

    public boolean lytz() {
        this.c.stop();
        this.c.release();
        this.c = null;
        return true;
    }

    public boolean psxp(Object obj) {
        File eVar = obj instanceof File ? (File) obj : new e(FileProvider.a(this.a.c, obj.toString()));
        if (eVar.exists()) {
            eVar.delete();
        }
        i.runlibrary.a.d.a(eVar.getAbsolutePath(), false);
        Intent eVar2 = new e("android.media.action.IMAGE_CAPTURE");
        if (VERSION.SDK_INT >= 24) {
            eVar2.addFlags(1);
        }
        eVar2.putExtra("output", m.a(this.a.c, eVar));
        eVar2.putExtra("outputFormat", (eVar.getAbsolutePath().toLowerCase().endsWith(".png") ? CompressFormat.PNG : CompressFormat.JPEG).toString());
        this.a.a.startActivityForResult(eVar2, m.a[0]);
        return true;
    }

    public boolean sgd() {
        if (VERSION.SDK_INT >= 23) {
            return a(true);
        }
        try {
            if (this.g == null) {
                this.g = Camera.open();
            }
            Parameters parameters = this.g.getParameters();
            parameters.setFlashMode("torch");
            this.g.setParameters(parameters);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean sgdtz() {
        if (VERSION.SDK_INT >= 23) {
            return a(false);
        }
        try {
            Parameters parameters = this.g.getParameters();
            parameters.setFlashMode("off");
            this.g.setParameters(parameters);
            this.g.release();
            this.g = null;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void spps() {
        Intent eVar = new e("android.media.action.VIDEO_CAPTURE");
        if (eVar.resolveActivity(this.a.c.getPackageManager()) != null) {
            this.a.a.startActivityForResult(eVar, m.a[2]);
        }
    }

    public void xcxz() {
        Intent eVar = new e("android.intent.action.GET_CONTENT");
        eVar.setType("video/*;image/*");
        if (VERSION.SDK_INT >= 19) {
            eVar.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        }
        this.a.a.startActivityForResult(eVar, m.a[1]);
    }

    public void xcxz(Object obj) {
        Intent eVar = new e("android.intent.action.PICK");
        eVar.setType(obj.toString());
        if (VERSION.SDK_INT >= 19) {
            eVar.putExtra("android.intent.extra.MIME_TYPES", obj.toString().split(";"));
        }
        this.a.a.startActivityForResult(eVar, m.a[1]);
    }

    public Bitmap xtjp() {
        k kVar = this.screenShotHelper;
        if (kVar == null) {
            return null;
        }
        kVar.c();
        int i = 0;
        do {
            Bitmap a = this.screenShotHelper.a();
            if (a != null) {
                return a;
            }
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            i += 10;
        } while (i <= 500);
        return null;
    }

    public Bitmap xtjp(Object obj) {
        if (this.screenShotHelper == null) {
            return null;
        }
        try {
            Thread.sleep((long) s.d(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xtjp();
    }

    public Bitmap xtjp(Object obj, String str) {
        return xtjp(obj, str, Integer.valueOf(70));
    }

    public Bitmap xtjp(Object obj, String str, Object obj2) {
        if (this.screenShotHelper != null) {
            Bitmap xtjp = xtjp(obj);
            if (xtjp != null) {
                n.a(xtjp, s.d(obj2), str);
                return xtjp;
            }
        }
        return null;
    }

    public boolean xtjpcsh() {
        try {
            this.screenShotHelper = null;
            this.a.a.startActivityForResult(((MediaProjectionManager) this.a.a.getSystemService("media_projection")).createScreenCaptureIntent(), m.a[4]);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public k xtjphd(Context context, int i, Intent intent) {
        k kVar = new k(context, i, intent);
        this.screenShotHelper = kVar;
        return kVar;
    }

    public boolean zd() {
        Vibrator vibrator = this.d;
        return vibrator != null ? vibrator.hasVibrator() : false;
    }

    public boolean zd(Object obj) {
        if (this.d == null) {
            this.d = (Vibrator) this.a.c.getSystemService("vibrator");
        }
        try {
            this.d.vibrate(s.e(obj));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean zd(Object obj, Object obj2) {
        if (this.d == null) {
            this.d = (Vibrator) this.a.c.getSystemService("vibrator");
        }
        if (obj != null && obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            try {
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = s.e(Array.get(obj, i));
                }
                Vibrator vibrator = this.d;
                int i2 = (obj2 == null || !obj2.equals(Boolean.valueOf(true))) ? -1 : 1;
                vibrator.vibrate(jArr, i2);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public void zdtz() {
        Vibrator vibrator = this.d;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    public boolean zzlpm() {
        return this.b.a();
    }
}