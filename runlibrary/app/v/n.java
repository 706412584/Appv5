package i.runlibrary.app.v;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

final class n extends PagerAdapter {
    final /* synthetic */ 滑动窗体 a;

    n(滑动窗体 滑动窗体) {
        this.a = 滑动窗体;
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