package i.runlibrary.app.v;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;

final class d extends ItemDecoration {
    final /* synthetic */ v7lb a;
    private int b;
    private int c;
    private int d;
    private int e;

    public d(v7lb v7lb, int i, int i2, int i3, int i4) {
        this.a = v7lb;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        rect.left = this.b;
        rect.right = this.d;
        rect.bottom = this.e;
        rect.top = this.c;
    }
}