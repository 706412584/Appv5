package i.runlibrary.app;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import i.app.FileProvider;
import i.runlibrary.a.s;
import i.runlibrary.app.gj.mtbf;
import i.runlibrary.app.gj.txcl;
import i.runlibrary.c.a;
import java.io.File;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicBoolean;

public class 工具 extends gj {
    private AppInfo a = null;
    private 动画 b = null;

    public class 动画 {
        /* renamed from: 位置移动 */
        public 动画操作 m407(Object obj, Object obj2, Object obj3, Object obj4) {
            try {
                return new 动画操作(new TranslateAnimation(s.f(obj), s.f(obj2), s.f(obj3), s.f(obj4)));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: 位置移动 */
        public 动画操作 m408(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            Exception e;
            try {
                try {
                    return new 动画操作(new TranslateAnimation(s.d(obj), s.f(obj2), s.d(obj3), s.f(obj4), s.d(obj5), s.f(obj6), s.d(obj7), s.f(obj8)));
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

        /* renamed from: 动画背景 */
        public 动画背景 m409(Object obj) {
            return new 动画背景(obj.equals(Boolean.valueOf(true)));
        }

        /* renamed from: 旋转 */
        public 动画操作 m410(Object obj, Object obj2) {
            try {
                return new 动画操作(new RotateAnimation(s.f(obj), s.f(obj2)));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: 旋转 */
        public 动画操作 m411(Object obj, Object obj2, Object obj3, Object obj4) {
            try {
                return new 动画操作(new RotateAnimation(s.f(obj), s.f(obj2), s.f(obj3), s.f(obj4)));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: 旋转 */
        public 动画操作 m412(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            Exception e;
            try {
                try {
                    return new 动画操作(new RotateAnimation(s.f(obj), s.f(obj2), s.d(obj3), s.f(obj4), s.d(obj5), s.f(obj6)));
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

        /* renamed from: 渐变伸缩 */
        public 动画操作 m413(Object obj, Object obj2, Object obj3, Object obj4) {
            try {
                return new 动画操作(new ScaleAnimation(s.f(obj), s.f(obj2), s.f(obj3), s.f(obj4)));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: 渐变伸缩 */
        public 动画操作 m414(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            Exception e;
            try {
                try {
                    return new 动画操作(new ScaleAnimation(s.f(obj), s.f(obj2), s.f(obj3), s.f(obj4), s.d(obj5), s.f(obj6), s.d(obj7), s.f(obj8)));
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

        /* renamed from: 渐变透明 */
        public 动画操作 m415(Object obj, Object obj2) {
            try {
                return new 动画操作(new RotateAnimation(s.f(obj), s.f(obj2)));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: 队列 */
        public 属性动画 m416(Object obj, Object obj2, Object obj3) {
            if (obj3 != null) {
                if (obj3.getClass().isArray()) {
                    View st = 工具.this.a.st(obj);
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
                    return new 属性动画(ObjectAnimator.ofFloat(st, obj2.toString(), fArr));
                }
            }
            return null;
        }

        /* renamed from: 队列同时 */
        public 属性动画 m417(Object obj) {
            if (obj != null) {
                if (obj.getClass().isArray()) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    int length = Array.getLength(obj);
                    Animator[] animatorArr = new Animator[length];
                    for (int i = 0; i < length; i++) {
                        Object obj2 = Array.get(obj, i);
                        if (obj2 instanceof Animator) {
                            animatorArr[i] = (Animator) obj2;
                        } else if (!(obj2 instanceof 属性动画)) {
                            return null;
                        } else {
                            animatorArr[i] = ((属性动画) obj2).f65;
                        }
                    }
                    animatorSet.playTogether(animatorArr);
                    return new 属性动画(animatorSet);
                }
            }
            return null;
        }

        /* renamed from: 队列顺序 */
        public 属性动画 m418(Object obj) {
            if (obj != null) {
                if (obj.getClass().isArray()) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    int length = Array.getLength(obj);
                    Animator[] animatorArr = new Animator[length];
                    for (int i = 0; i < length; i++) {
                        Object obj2 = Array.get(obj, i);
                        if (obj2 instanceof Animator) {
                            animatorArr[i] = (Animator) obj2;
                        } else if (!(obj2 instanceof 属性动画)) {
                            return null;
                        } else {
                            animatorArr[i] = ((属性动画) obj2).f65;
                        }
                    }
                    animatorSet.playSequentially(animatorArr);
                    return new 属性动画(animatorSet);
                }
            }
            return null;
        }

        /* renamed from: 集合 */
        public 动画操作 m419(Object obj) {
            Animation atomicBoolean;
            if (!(obj instanceof AnimationSet)) {
                if (obj instanceof 动画操作) {
                    动画操作 动画操作 = (动画操作) obj;
                    if (动画操作.f63 instanceof AnimationSet) {
                        obj = 动画操作.f63;
                    }
                }
                atomicBoolean = new AtomicBoolean(obj.equals(Boolean.valueOf(true)));
                return new 动画操作(atomicBoolean);
            }
            atomicBoolean = (AnimationSet) obj;
            return new 动画操作(atomicBoolean);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: 集合 */
        public 动画操作 m420(Object obj, Object obj2) {
            if (obj2 != null) {
                if (obj2.getClass().isArray()) {
                    AnimationSet atomicBoolean;
                    int length;
                    int i;
                    if (!(obj instanceof AnimationSet)) {
                        if (obj instanceof 动画操作) {
                            动画操作 动画操作 = (动画操作) obj;
                            if (动画操作.f63 instanceof AnimationSet) {
                                obj = 动画操作.f63;
                            }
                        }
                        atomicBoolean = new AtomicBoolean(obj.equals(Boolean.valueOf(true)));
                        length = Array.getLength(obj2);
                        for (i = 0; i < length; i++) {
                            Animation animation;
                            Object obj3 = Array.get(obj2, i);
                            if (obj3 instanceof Animation) {
                                animation = (Animation) obj3;
                            } else if (obj3 instanceof 动画操作) {
                                animation = ((动画操作) obj3).f63;
                            } else {
                            }
                            atomicBoolean.addAnimation(animation);
                        }
                        return new 动画操作(atomicBoolean);
                    }
                    atomicBoolean = (AnimationSet) obj;
                    length = Array.getLength(obj2);
                    while (i < length) {
                    }
                    return new 动画操作(atomicBoolean);
                }
            }
            return null;
        }
    }

    public class 动画操作 {
        /* renamed from: 动画 */
        public Animation f63;

        public 动画操作(Animation animation) {
            this.f63 = animation;
        }

        /* renamed from: 停留开始状态 */
        public void m421(Object obj) {
            this.f63.setFillBefore(obj.equals(Boolean.valueOf(true)));
        }

        /* renamed from: 停留结束状态 */
        public void m422(Object obj) {
            this.f63.setFillAfter(obj.equals(Boolean.valueOf(true)));
        }

        /* renamed from: 动画事件 */
        public void m423(AnimationListener animationListener) {
            this.f63.setAnimationListener(animationListener);
        }

        /* renamed from: 取消 */
        public void m424() {
            this.f63.cancel();
        }

        /* renamed from: 启用填充 */
        public void m425(Object obj) {
            this.f63.setFillEnabled(obj.equals(Boolean.valueOf(true)));
        }

        /* renamed from: 延迟执行 */
        public void m426(Object obj) {
            this.f63.setStartOffset(s.e(obj));
        }

        /* renamed from: 开始 */
        public void m427() {
            this.f63.start();
        }

        /* renamed from: 持续时长 */
        public void m428(Object obj) {
            this.f63.setDuration(s.e(obj));
        }

        /* renamed from: 添加 */
        public void m429(Object obj) {
            Animation animation = this.f63;
            if (animation instanceof AnimationSet) {
                if (obj instanceof Animation) {
                    ((AnimationSet) animation).addAnimation((Animation) obj);
                } else if (obj instanceof 动画操作) {
                    ((AnimationSet) animation).addAnimation(((动画操作) obj).f63);
                }
            }
        }

        /* renamed from: 重复执行 */
        public void m430(Object obj) {
            this.f63.setRepeatCount(s.d(obj));
        }

        /* renamed from: 重置 */
        public void m431() {
            this.f63.reset();
        }
    }

    public class 动画背景 extends AnimationDrawable {
        public 动画背景(boolean z) {
            setOneShot(z);
        }

        /* renamed from: 停止 */
        public void m432() {
            stop();
        }

        /* renamed from: 开始 */
        public void m433() {
            start();
        }

        /* renamed from: 正在运行 */
        public boolean m434() {
            return isRunning();
        }

        /* renamed from: 添加 */
        public void m435(Object obj, Object obj2) {
            addFrame(a.a(obj, 工具.this.a.c), s.d(obj2));
        }
    }

    public class 图像处理 {
        /* renamed from: 图像处理 */
        public txcl f64;

        public 图像处理(Bitmap bitmap, String str) {
            this.f64 = new txcl(bitmap, str);
        }

        /* renamed from: 保存 */
        public boolean m436() {
            return this.f64.bc();
        }

        /* renamed from: 保存 */
        public boolean m437(Object obj) {
            return this.f64.bc(obj);
        }

        /* renamed from: 保存 */
        public boolean m438(Object obj, Object obj2) {
            return this.f64.bc(obj, obj2);
        }

        /* renamed from: 保存 */
        public boolean m439(Object obj, Object obj2, Object obj3) {
            return this.f64.bc(obj, obj2, obj3);
        }

        /* renamed from: 反转 */
        public Bitmap m440(Object obj) {
            return this.f64.fz(obj);
        }

        /* renamed from: 旋转 */
        public Bitmap m441(Object obj) {
            return this.f64.xz(obj);
        }

        /* renamed from: 更新图像 */
        public void m442(Object obj) {
            this.f64.gxtx(obj);
        }

        /* renamed from: 缩放 */
        public Bitmap m443(Object obj) {
            return this.f64.sf(obj);
        }

        /* renamed from: 缩放 */
        public Bitmap m444(Object obj, Object obj2) {
            return this.f64.sf(obj, obj2);
        }

        /* renamed from: 裁剪 */
        public Bitmap m445(Object obj, Object obj2, Object obj3, Object obj4) {
            return this.f64.cj(obj, obj2, obj3, obj4);
        }
    }

    public class 媒体播放 {
        private mtbf b;

        public 媒体播放(MediaPlayer mediaPlayer, OnCompletionListener onCompletionListener) {
            this.b = new mtbf(mediaPlayer, onCompletionListener);
        }

        /* renamed from: 停止 */
        public void m446() {
            this.b.tz();
        }

        /* renamed from: 媒体时长 */
        public int m447() {
            return this.b.mtsc();
        }

        /* renamed from: 开始 */
        public void m448() {
            this.b.ks();
        }

        /* renamed from: 循环播放 */
        public void m449(Object obj) {
            this.b.xhbf(obj);
        }

        /* renamed from: 指定播放位置 */
        public void m450(Object obj) {
            this.b.zdbfwz(obj);
        }

        /* renamed from: 播放位置 */
        public int m451() {
            return this.b.bfwz();
        }

        /* renamed from: 播放状态 */
        public int m452() {
            return this.b.bfzt();
        }

        /* renamed from: 播放音量 */
        public void m453(Object obj, Object obj2) {
            this.b.bfyl(obj, obj2);
        }

        /* renamed from: 暂停 */
        public void m454() {
            this.b.zt();
        }

        /* renamed from: 自动释放 */
        public void m455() {
            this.b.zdsf();
        }

        /* renamed from: 释放 */
        public void m456() {
            this.b.sf();
        }

        /* renamed from: 重播 */
        public void m457() {
            this.b.cb();
        }
    }

    public class 属性动画 {
        /* renamed from: 动画 */
        public Animator f65;

        public 属性动画(Animator animator) {
            this.f65 = animator;
        }

        /* renamed from: 克隆 */
        public 属性动画 m458() {
            return new 属性动画(this.f65.clone());
        }

        /* renamed from: 动画监听事件 */
        public void m459(AnimatorListener animatorListener) {
            this.f65.addListener(animatorListener);
        }

        /* renamed from: 取消 */
        public void m460() {
            this.f65.cancel();
        }

        /* renamed from: 延迟执行 */
        public void m461(Object obj) {
            this.f65.setStartDelay(s.e(obj));
        }

        /* renamed from: 开始 */
        public void m462() {
            this.f65.start();
        }

        /* renamed from: 持续时长 */
        public void m428(Object obj) {
            this.f65.setDuration(s.e(obj));
        }

        /* renamed from: 控件 */
        public void m463(Object obj) {
            View st = 工具.this.a.st(obj);
            if (st != null) {
                this.f65.setTarget(st);
            }
        }

        /* renamed from: 正在运行 */
        public boolean m464() {
            return this.f65.isRunning();
        }
    }

    public 工具(AppInfo appInfo) {
        super(appInfo);
        this.a = appInfo;
    }

    /* renamed from: 关闭 */
    public void m390() {
        super.gb();
    }

    /* renamed from: 动画 */
    public 动画 m391() {
        if (this.b == null) {
            this.b = new 动画();
        }
        return this.b;
    }

    /* renamed from: 发通知 */
    public void m392(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super.ftz(obj, obj2, obj3, obj4, null, obj5, null, null);
    }

    /* renamed from: 发通知 */
    public void m393(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        super.ftz(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A:{RETURN} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: 图像处理 */
    public 图像处理 m394(Object obj) {
        Bitmap a;
        String absolutePath;
        Exception e;
        try {
            a = i.runlibrary.b.a.a(this.a.c, obj);
            try {
                File eVar = new e(FileProvider.a(this.a.c, obj.toString()));
                if (eVar.exists()) {
                    absolutePath = eVar.getAbsolutePath();
                    return a != null ? null : new 图像处理(a, absolutePath);
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

    /* renamed from: 媒体播放 */
    public 媒体播放 m395(Object obj) {
        return m396(obj, null);
    }

    /* renamed from: 媒体播放 */
    public 媒体播放 m396(Object obj, OnCompletionListener onCompletionListener) {
        return new 媒体播放(i.runlibrary.a.a.a(this.a, obj), onCompletionListener);
    }

    /* renamed from: 提示 */
    public void m397(Object obj) {
        super.ts(obj);
    }

    /* renamed from: 提示 */
    public void m398(Object obj, Object obj2) {
        super.ts(obj, obj2);
    }

    /* renamed from: 显示桌面 */
    public void m399() {
        super.xszm();
    }

    /* renamed from: 暂停 */
    public void m400(Object obj) {
        super.zt(obj);
    }

    /* renamed from: 界面线程 */
    public void m401(Runnable runnable) {
        super.jmxc(runnable);
    }

    /* renamed from: 线程 */
    public Thread m402(Thread thread) {
        return super.xc(thread);
    }

    /* renamed from: 跳转 */
    public void m403(Object obj) {
        super.tz(obj);
    }

    /* renamed from: 跳转 */
    public void m404(Object obj, Object obj2) {
        super.tz(obj, obj2);
    }

    /* renamed from: 跳转 */
    public void m405(Object obj, Object obj2, Object obj3) {
        super.tz(obj, obj2, obj3);
    }

    /* renamed from: 输出 */
    public void m406(Object obj) {
        super.sc(obj);
    }
}