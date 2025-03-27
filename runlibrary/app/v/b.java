package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

final class b extends PagerAdapter {
    final /* synthetic */ hdct a;

    b(hdct hdct) {
        this.a = hdct;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(this.a.b[i]);
    }

    public final int getCount() {
        return this.a.b.length;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View view = this.a.b[i];
        viewGroup.addView(view);
        return view;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}