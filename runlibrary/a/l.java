package i.runlibrary.a;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

public final class l {
    public String a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    public ImageView e = null;
    public View f = null;
    public Drawable g = null;
    public boolean h = false;
    final /* synthetic */ i i;

    public l(i iVar, ImageView imageView, String str, String str2) {
        this.i = iVar;
        this.e = imageView;
        this.b = str;
        this.d = str2;
    }

    public l(i iVar, String str, String str2, View view, boolean z) {
        this.i = iVar;
        this.a = str;
        this.c = str2;
        this.f = view;
        this.h = z;
    }

    public l(i iVar, String str, String str2, ImageView imageView) {
        this.i = iVar;
        this.a = str;
        this.c = str2;
        this.e = imageView;
    }
}