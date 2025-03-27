package i.runlibrary.app;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Notification.Builder;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.RemoteViews;
import i.app.FileProvider;
import i.runlibrary.a.n;
import i.runlibrary.a.s;
import i.runlibrary.b.f;
import i.runlibrary.c.a;
import java.io.File;
import java.lang.reflect.Array;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;

public class gj {
    private AppInfo a = null;
    private dh b = null;

    public class Animationx {
        public Animation dh;

        public Animationx(Animation animation) {
            this.dh = animation;
        }

        public void cfzx(Object obj) {
            this.dh.setRepeatCount(s.d(obj));
        }

        public void cxsc(Object obj) {
            this.dh.setDuration(s.e(obj));
        }

        public void cz() {
            this.dh.reset();
        }

        public void dhsj(AnimationListener animationListener) {
            this.dh.setAnimationListener(animationListener);
        }

        public void ks() {
            this.dh.start();
        }

        public void qx() {
            this.dh.cancel();
        }

        public void qytc(Object obj) {
            this.dh.setFillEnabled(obj.equals(Boolean.valueOf(true)));
        }

        public void tj(Object obj) {
            Animation animation = this.dh;
            if (animation instanceof AnimationSet) {
                if (obj instanceof Animation) {
                    ((AnimationSet) animation).addAnimation((Animation) obj);
                } else if (obj instanceof Animationx) {
                    ((AnimationSet) animation).addAnimation(((Animationx) obj).dh);
                }
            }
        }

        public void tljszt(Object obj) {
            this.dh.setFillAfter(obj.equals(Boolean.valueOf(true)));
        }

        public void tlkszt(Object obj) {
            this.dh.setFillBefore(obj.equals(Boolean.valueOf(true)));
        }

        public void yczx(Object obj) {
            this.dh.setStartOffset(s.e(obj));
        }
    }

    public class Animatorx {
        public Animator dh;

        public Animatorx(Animator animator) {
            this.dh = animator;
        }

        public void cxsc(Object obj) {
            this.dh.setDuration(s.e(obj));
        }

        public void dhjtsj(AnimatorListener animatorListener) {
            this.dh.addListener(animatorListener);
        }

        public void kj(Object obj) {
            View st = gj.this.a.st(obj);
            if (st != null) {
                this.dh.setTarget(st);
            }
        }

        public Animatorx kl() {
            return new Animatorx(this.dh.clone());
        }

        public void ks() {
            this.dh.start();
        }

        public void qx() {
            this.dh.cancel();
        }

        public void yczx(Object obj) {
            this.dh.setStartDelay(s.e(obj));
        }

        public boolean zzyx() {
            return this.dh.isRunning();
        }
    }

    public class dh {
        public dhbj dhbj(Object obj) {
            return new dhbj(obj.equals(Boolean.valueOf(true)));
        }

        public Animatorx dl(Object obj, Object obj2, Object obj3) {
            if (obj3 != null) {
                if (obj3.getClass().isArray()) {
                    View st = gj.this.a.st(obj);
                    int length = Array.getLength(obj3);
                    float[] fArr = new float[length];
                    int i = 0;
                    while (i < length) {
                        try {
                            fArr[i] = s.f(Array.get(obj3, i));
                            i++;
                        } catch (Exception e) {
                            e.printStackTrace();
                            return null;
                        }
                    }
                    return new Animatorx(ObjectAnimator.ofFloat(st, obj2.toString(), fArr));
                }
            }
            return null;
        }

        public Animatorx dlsx(Object obj) {
            if (obj != null) {
                if (obj.getClass().isArray()) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    int length = Array.getLength(obj);
                    Animator[] animatorArr = new Animator[length];
                    for (int i = 0; i < length; i++) {
                        Object obj2 = Array.get(obj, i);
                        if (obj2 instanceof Animator) {
                            animatorArr[i] = (Animator) obj2;
                        } else if (!(obj2 instanceof Animatorx)) {
                            return null;
                        } else {
                            animatorArr[i] = ((Animatorx) obj2).dh;
                        }
                    }
                    animatorSet.playSequentially(animatorArr);
                    return new Animatorx(animatorSet);
                }
            }
            return null;
        }

        public Animatorx dlts(Object obj) {
            if (obj != null) {
                if (obj.getClass().isArray()) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    int length = Array.getLength(obj);
                    Animator[] animatorArr = new Animator[length];
                    for (int i = 0; i < length; i++) {
                        Object obj2 = Array.get(obj, i);
                        if (obj2 instanceof Animator) {
                            animatorArr[i] = (Animator) obj2;
                        } else if (!(obj2 instanceof Animatorx)) {
                            return null;
                        } else {
                            animatorArr[i] = ((Animatorx) obj2).dh;
                        }
                    }
                    animatorSet.playTogether(animatorArr);
                    return new Animatorx(animatorSet);
                }
            }
            return null;
        }

        public Animationx jbss(Object obj, Object obj2, Object obj3, Object obj4) {
            try {
                return new Animationx(new ScaleAnimation(s.f(obj), s.f(obj2), s.f(obj3), s.f(obj4)));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public Animationx jbss(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            Exception e;
            try {
                try {
                    return new Animationx(new ScaleAnimation(s.f(obj), s.f(obj2), s.f(obj3), s.f(obj4), s.d(obj5), s.f(obj6), s.d(obj7), s.f(obj8)));
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                return null;
            }
        }

        public Animationx jbtm(Object obj, Object obj2) {
            try {
                return new Animationx(new RotateAnimation(s.f(obj), s.f(obj2)));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public Animationx jh(Object obj) {
            Animation atomicBoolean;
            if (!(obj instanceof AnimationSet)) {
                if (obj instanceof Animationx) {
                    Animationx animationx = (Animationx) obj;
                    if (animationx.dh instanceof AnimationSet) {
                        obj = animationx.dh;
                    }
                }
                atomicBoolean = new AtomicBoolean(obj.equals(Boolean.valueOf(true)));
                return new Animationx(atomicBoolean);
            }
            atomicBoolean = (AnimationSet) obj;
            return new Animationx(atomicBoolean);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Animationx jh(Object obj, Object obj2) {
            if (obj2 != null) {
                if (obj2.getClass().isArray()) {
                    AnimationSet atomicBoolean;
                    int length;
                    int i;
                    if (!(obj instanceof AnimationSet)) {
                        if (obj instanceof Animationx) {
                            Animationx animationx = (Animationx) obj;
                            if (animationx.dh instanceof AnimationSet) {
                                obj = animationx.dh;
                            }
                        }
                        atomicBoolean = new AtomicBoolean(obj.equals(Boolean.valueOf(true)));
                        length = Array.getLength(obj2);
                        for (i = 0; i < length; i++) {
                            Animation animation;
                            Object obj3 = Array.get(obj2, i);
                            if (obj3 instanceof Animation) {
                                animation = (Animation) obj3;
                            } else if (obj3 instanceof Animationx) {
                                animation = ((Animationx) obj3).dh;
                            } else {
                            }
                            atomicBoolean.addAnimation(animation);
                        }
                        return new Animationx(atomicBoolean);
                    }
                    atomicBoolean = (AnimationSet) obj;
                    length = Array.getLength(obj2);
                    while (i < length) {
                    }
                    return new Animationx(atomicBoolean);
                }
            }
            return null;
        }

        public Animationx wzyd(Object obj, Object obj2, Object obj3, Object obj4) {
            try {
                return new Animationx(new TranslateAnimation(s.f(obj), s.f(obj2), s.f(obj3), s.f(obj4)));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public Animationx wzyd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            Exception e;
            try {
                try {
                    return new Animationx(new TranslateAnimation(s.d(obj), s.f(obj2), s.d(obj3), s.f(obj4), s.d(obj5), s.f(obj6), s.d(obj7), s.f(obj8)));
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                return null;
            }
        }

        public Animationx xz(Object obj, Object obj2) {
            try {
                return new Animationx(new RotateAnimation(s.f(obj), s.f(obj2)));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public Animationx xz(Object obj, Object obj2, Object obj3, Object obj4) {
            try {
                return new Animationx(new RotateAnimation(s.f(obj), s.f(obj2), s.f(obj3), s.f(obj4)));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public Animationx xz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            Exception e;
            try {
                try {
                    return new Animationx(new RotateAnimation(s.f(obj), s.f(obj2), s.d(obj3), s.f(obj4), s.d(obj5), s.f(obj6)));
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                return null;
            }
        }
    }

    public class dhbj extends AnimationDrawable {
        public dhbj(boolean z) {
            setOneShot(z);
        }

        public void ks() {
            start();
        }

        public void tj(Object obj, Object obj2) {
            addFrame(a.a(obj, gj.this.a.c), s.d(obj2));
        }

        public void tz() {
            stop();
        }

        public boolean zzyx() {
            return isRunning();
        }
    }

    public class mtbf {
        public MediaPlayer sjy;

        public mtbf(MediaPlayer mediaPlayer, OnCompletionListener onCompletionListener) {
            this.sjy = mediaPlayer;
            if (onCompletionListener != null) {
                mediaPlayer.setOnCompletionListener(onCompletionListener);
            }
        }

        public int bfwz() {
            try {
                return this.sjy.getCurrentPosition();
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        public void bfyl(Object obj, Object obj2) {
            try {
                float d = (float) s.d(obj);
                if (d > 0.0f) {
                    d /= 100.0f;
                }
                float d2 = (float) s.d(obj2);
                if (d2 > 0.0f) {
                    d2 /= 100.0f;
                }
                this.sjy.setVolume(d, d2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public int bfzt() {
            try {
                return this.sjy.isPlaying() ? 1 : 0;
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        public void cb() {
            try {
                this.sjy.reset();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void ks() {
            try {
                this.sjy.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public int mtsc() {
            try {
                return this.sjy.getDuration();
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        public void sf() {
            try {
                this.sjy.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void tz() {
            try {
                this.sjy.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void xhbf(Object obj) {
            try {
                this.sjy.setLooping(obj.equals(Boolean.valueOf(true)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void zdbfwz(Object obj) {
            try {
                this.sjy.seekTo(s.d(obj));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void zdsf() {
            try {
                this.sjy.setOnCompletionListener(new a(this));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void zt() {
            try {
                this.sjy.pause();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class txcl {
        private String b = null;
        private boolean c = false;
        public int g = -1;
        public int k = -1;
        public Bitmap tx = null;

        public txcl(Bitmap bitmap, String str) {
            this.tx = bitmap;
            this.b = str;
            this.k = bitmap.getWidth();
            this.g = bitmap.getHeight();
        }

        public boolean bc() {
            String str = this.b;
            if (str == null) {
                return false;
            }
            n.a(this.tx, 100, str);
            return true;
        }

        public boolean bc(Object obj) {
            n.a(this.tx, 100, FileProvider.a(gj.this.a.c, String.valueOf(obj)));
            return true;
        }

        public boolean bc(Object obj, Object obj2) {
            n.a(this.tx, s.d(obj2), FileProvider.a(gj.this.a.c, String.valueOf(obj)));
            return true;
        }

        public boolean bc(Object obj, Object obj2, Object obj3) {
            try {
                Intent a = i.runlibrary.b.a.a(gj.this.a.c, obj);
                if (a != null) {
                    n.a(a, s.d(obj3), FileProvider.a(gj.this.a.c, String.valueOf(obj2)));
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }

        public Bitmap cj(Object obj, Object obj2, Object obj3, Object obj4) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(this.tx, s.d(obj), s.d(obj2), s.d(obj3), s.d(obj4));
                if (this.c && createBitmap != null) {
                    this.tx = createBitmap;
                }
                return createBitmap;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public Bitmap fz(Object obj) {
            try {
                Bitmap createBitmap;
                Bitmap bitmap = this.tx;
                int d = s.d(obj);
                float[] fArr = d != 0 ? d != 1 ? null : new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f} : new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
                if (fArr != null) {
                    Matrix matrix = new Matrix();
                    matrix.setValues(fArr);
                    createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                } else {
                    createBitmap = null;
                }
                if (this.c && createBitmap != null) {
                    this.tx = createBitmap;
                }
                return createBitmap;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public void gxtx(Object obj) {
            this.c = obj.equals(Boolean.valueOf(true));
        }

        public Bitmap sf(Object obj) {
            try {
                Bitmap bitmap = this.tx;
                float f = s.f(obj);
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (this.c && createBitmap != null) {
                    this.tx = createBitmap;
                }
                return createBitmap;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public Bitmap sf(Object obj, Object obj2) {
            try {
                Bitmap bitmap = this.tx;
                int d = s.d(obj);
                int d2 = s.d(obj2);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                float f = ((float) d) / ((float) width);
                float f2 = ((float) d2) / ((float) height);
                Matrix matrix = new Matrix();
                matrix.postScale(f, f2);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                if (this.c && createBitmap != null) {
                    this.tx = createBitmap;
                }
                return createBitmap;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public Bitmap xz(Object obj) {
            try {
                Bitmap bitmap = this.tx;
                float f = s.f(obj);
                Matrix matrix = new Matrix();
                matrix.postRotate(f);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (this.c && createBitmap != null) {
                    this.tx = createBitmap;
                }
                return createBitmap;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public gj(AppInfo appInfo) {
        this.a = appInfo;
    }

    public dh dh() {
        if (this.b == null) {
            this.b = new dh();
        }
        return this.b;
    }

    public void ftz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ftz(obj, obj2, obj3, obj4, null, obj5, null, null);
    }

    public void ftz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Intent a;
        PendingIntent pendingIntent = null;
        if (obj6 != null) {
            a = i.runlibrary.b.a.a(this.a.c, obj6);
            if (!(a == null || obj7 == null || obj8 == null)) {
                Bundle a2 = i.runlibrary.b.a.a(obj7, obj8);
                if (a2 != null) {
                    a.putExtras(a2);
                }
            }
        } else {
            a = null;
        }
        NotificationManager notificationManager = (NotificationManager) this.a.c.getSystemService("notification");
        if (a != null) {
            pendingIntent = PendingIntent.getActivity(this.a.c, 0, a, 134217728);
        }
        Builder autoCancel = new Builder(this.a.c).setWhen(System.currentTimeMillis()).setTicker(obj.toString()).setContentTitle(obj2.toString()).setContentText(obj3.toString()).setAutoCancel(true);
        if (VERSION.SDK_INT >= 26) {
            String str = "i_message";
            notificationManager.createNotificationChannel(new NotificationChannel(str, "通知消息", 4));
            autoCancel.setChannelId(str);
        }
        if (obj5 instanceof Integer) {
            RemoteViews socket = new Socket(this.a.c.getPackageName(), s.d(obj5));
            if (VERSION.SDK_INT >= 24) {
                autoCancel.setCustomContentView(socket);
            } else {
                autoCancel.setContent(socket);
            }
        }
        if (obj4 instanceof Integer) {
            int d = s.d(obj4);
            autoCancel.setSmallIcon(d);
            autoCancel.setLargeIcon(BitmapFactory.decodeResource(this.a.c.getResources(), d));
        }
        autoCancel.setContentIntent(pendingIntent);
        notificationManager.notify(1, VERSION.SDK_INT >= 16 ? autoCancel.build() : autoCancel.getNotification());
    }

    public void gb() {
        if (this.a.a != null) {
            this.a.a.finish();
        }
    }

    public void jmxc(Runnable runnable) {
        if (Context.getMainLooper() != Looper.myLooper()) {
            this.a.getHandler().post(runnable);
        } else {
            runnable.run();
        }
    }

    public mtbf mtbf(Object obj) {
        return mtbf(obj, null);
    }

    public mtbf mtbf(Object obj, OnCompletionListener onCompletionListener) {
        return new mtbf(i.runlibrary.a.a.a(this.a, obj), onCompletionListener);
    }

    public void sc(Object obj) {
        String valueOf = String.valueOf(obj);
        System.out.println(valueOf);
        Log.v("iapp", valueOf);
        if (f.a == null) {
            FileProvider.a(this.a.c, valueOf);
        } else {
            i.runlibrary.a.a.a(valueOf);
        }
    }

    public void ts(Object obj) {
        i.runlibrary.b.a.a(this.a.c, String.valueOf(obj), 1);
    }

    public void ts(Object obj, Object obj2) {
        i.runlibrary.b.a.a(this.a.c, String.valueOf(obj), obj2 == null ? 1 : s.d(obj2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A:{RETURN} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public txcl txcl(Object obj) {
        Bitmap a;
        String absolutePath;
        Exception e;
        try {
            a = i.runlibrary.b.a.a(this.a.c, obj);
            try {
                File eVar = new e(FileProvider.a(this.a.c, obj.toString()));
                if (eVar.exists()) {
                    absolutePath = eVar.getAbsolutePath();
                    return a != null ? null : new txcl(a, absolutePath);
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                absolutePath = null;
                if (a != null) {
                }
            }
        } catch (Exception e3) {
            e = e3;
            a = null;
            e.printStackTrace();
            absolutePath = null;
            if (a != null) {
            }
        }
        absolutePath = null;
        if (a != null) {
        }
    }

    public void tz(Object obj) {
        Intent a = i.runlibrary.b.a.a(this.a.c, obj);
        if (a != null) {
            this.a.c.startActivity(a);
        }
    }

    public void tz(Object obj, Object obj2) {
        Intent a = i.runlibrary.b.a.a(this.a.c, obj);
        if (a != null) {
            if (obj2 instanceof Bundle) {
                a.putExtras((Bundle) obj2);
            }
            this.a.c.startActivity(a);
        }
    }

    public void tz(Object obj, Object obj2, Object obj3) {
        Intent a = i.runlibrary.b.a.a(this.a.c, obj);
        if (a != null) {
            Bundle a2 = i.runlibrary.b.a.a(obj2, obj3);
            if (a2 != null) {
                a.putExtras(a2);
            }
            this.a.c.startActivity(a);
        }
    }

    public Thread xc(Thread thread) {
        thread.setName(String.format("I_APP_Thread_%d", new Object[]{Long.valueOf(thread.getId())}));
        thread.start();
        return thread;
    }

    public void xszm() {
        Intent eVar = new e("android.intent.action.MAIN");
        eVar.addCategory("android.intent.category.HOME");
        eVar.addFlags(270532608);
        this.a.c.startActivity(eVar);
    }

    public void zt(Object obj) {
        try {
            Thread.sleep(s.e(obj));
        } catch (Exception unused) {
        }
    }
}