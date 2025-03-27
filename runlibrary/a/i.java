package i.runlibrary.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import i.app.FileProvider;
import java.io.File;
import java.lang.ref.SoftReference;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class i {
    public static i c;
    private static String m;
    public Context a;
    public HashMap b = new HashMap();
    private ArrayList d = new ArrayList();
    private ArrayList e = new ArrayList();
    private ArrayList f = new ArrayList();
    private ArrayList g = new ArrayList();
    private BaseAdapter h = null;
    private Adapter i = null;
    private FragmentStatePagerAdapter j = null;
    private int k = 0;
    private AtomicInteger l = new DatagramSocket(0);
    private Handler n;
    private boolean o = false;

    private i(Context context) {
        this.a = context;
        this.k = 2;
        d();
    }

    public i(Context context, BaseAdapter baseAdapter) {
        this.a = context;
        this.h = baseAdapter;
        this.k = 1;
        d();
    }

    public i(Context context, FragmentStatePagerAdapter fragmentStatePagerAdapter) {
        this.a = context;
        this.j = fragmentStatePagerAdapter;
        this.k = 1;
        d();
    }

    public i(Context context, Adapter adapter) {
        this.a = context;
        this.i = adapter;
        this.k = 1;
        d();
    }

    public static void a(Context context, View view, String str, String str2, boolean z) {
        if (c == null) {
            c = new i(context);
        }
        SoftReference softReference = (SoftReference) c.b.get(str2);
        Drawable drawable = softReference == null ? null : (Drawable) softReference.get();
        if (drawable == null) {
            i iVar = c;
            if (iVar.e.contains(str2)) {
                int i = iVar.k;
                if (i == 2 || i == 3) {
                    iVar.f.add(new l(iVar, str, str2, view, z));
                    iVar.g.add(str2);
                }
                return;
            }
            iVar.d.add(new l(iVar, str, str2, view, z));
            iVar.e.add(str2);
            iVar.c();
        } else if (z) {
            view.setBackgroundDrawable(drawable);
        } else {
            if (view instanceof ImageView) {
                ((ImageView) view).setImageDrawable(drawable);
            }
        }
    }

    private boolean a(Object obj) {
        Message message = new Message();
        message.what = 2;
        message.obj = obj;
        this.n.sendMessage(message);
        return;
    }

    private synchronized void a(String str, Drawable drawable) {
        while (true) {
            int indexOf = this.g.indexOf(str);
            if (indexOf != -1) {
                l lVar = (l) this.f.get(indexOf);
                this.f.remove(lVar);
                this.g.remove(str);
                lVar.g = drawable;
                a(lVar);
            }
        }
    }

    static /* synthetic */ void b() {
        try {
            Thread.sleep(300);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static /* synthetic */ void b(i iVar, l lVar) {
        int i = iVar.k;
        String str = "%s/temp/%s.img";
        File eVar;
        if (i == 1) {
            lVar.b = String.format(str, new Object[]{m, s.f(lVar.a)});
            eVar = new e(lVar.b);
            if ((eVar.exists() && new Date().getTime() - eVar.lastModified() >= 1800000) || f.a(lVar.a, lVar.b, false) >= 0) {
                Bitmap b = e.b(iVar.a, lVar.b);
                iVar.b.put(lVar.c, new SoftReference(new BitmapDrawable(iVar.a.getResources(), b)));
                if (b != null) {
                    iVar.n.sendEmptyMessage(1);
                }
            }
        } else if (i == 2 || i == 3) {
            lVar.b = String.format(str, new Object[]{m, s.f(lVar.a)});
            eVar = new e(lVar.b);
            if ((eVar.exists() && new Date().getTime() - eVar.lastModified() >= 1800000) || f.a(lVar.a, lVar.b, false) >= 0) {
                Drawable bitmapDrawable = new BitmapDrawable(iVar.a.getResources(), FileProvider.a(iVar.a, lVar.b));
                iVar.b.put(lVar.c, new SoftReference(bitmapDrawable));
                lVar.g = bitmapDrawable;
                iVar.a(lVar);
                if (iVar.g.contains(lVar.c)) {
                    iVar.a(lVar.c, bitmapDrawable);
                }
            }
        }
    }

    private void c() {
        if (!this.o) {
            this.o = true;
            new j(this).start();
        }
    }

    private void d() {
        if (m == null) {
            m = this.a.getFilesDir().getAbsolutePath();
        }
        this.n = new k(this, this.a.getMainLooper());
    }

    static /* synthetic */ void g(i iVar) {
        BaseAdapter baseAdapter = iVar.h;
        if (baseAdapter != null) {
            baseAdapter.notifyDataSetChanged();
            return;
        }
        Adapter adapter = iVar.i;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
            return;
        }
        FragmentStatePagerAdapter fragmentStatePagerAdapter = iVar.j;
        if (fragmentStatePagerAdapter != null) {
            fragmentStatePagerAdapter.notifyDataSetChanged();
        }
    }

    public final void a() {
        this.b.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        i iVar = c;
        if (iVar != null) {
            iVar.b.clear();
            c.d.clear();
            c.e.clear();
            c.f.clear();
            c.g.clear();
            c = null;
        }
    }

    public final void a(ImageView imageView, String str, String str2) {
        imageView.setImageDrawable(null);
        if (str != null) {
            if (this.e.contains(str2)) {
                int i = this.k;
                if (i == 2 || i == 3) {
                    this.f.add(new l(this, str, str2, imageView));
                    this.g.add(str2);
                }
                return;
            }
            this.d.add(new l(this, str, str2, imageView));
            this.e.add(str2);
            c();
        }
    }

    public final void b(ImageView imageView, String str, String str2) {
        imageView.setImageDrawable(null);
        if (str != null) {
            if (this.e.contains(str2)) {
                int i = this.k;
                if (i == 2 || i == 3) {
                    this.f.add(new l(this, imageView, str, str2));
                    this.g.add(str2);
                }
                return;
            }
            this.d.add(new l(this, imageView, str, str2));
            this.e.add(str2);
            c();
        }
    }
}