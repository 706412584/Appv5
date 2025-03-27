package i.runlibrary.c;

import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import fr.castorflex.android.verticalviewpager.VerticalViewPager;

public final class b {
    public static LayoutParams a(ViewGroup viewGroup, int i, int i2) {
        return viewGroup instanceof LinearLayout ? new LayoutParams(i, i2) : viewGroup instanceof RelativeLayout ? new LayoutParams(i, i2) : viewGroup instanceof CoordinatorLayout ? new LayoutParams(i, i2) : viewGroup instanceof ConstraintLayout ? new LayoutParams(i, i2) : viewGroup instanceof RecyclerView ? new LayoutParams(i, i2) : viewGroup instanceof DrawerLayout ? new LayoutParams(i, i2) : viewGroup instanceof ViewPager ? new ViewPager.LayoutParams() : viewGroup instanceof VerticalViewPager ? new VerticalViewPager.LayoutParams() : viewGroup instanceof AppBarLayout ? new LayoutParams(i, i2) : viewGroup instanceof CollapsingToolbarLayout ? new LayoutParams(i, i2) : viewGroup instanceof Toolbar ? new LayoutParams(i, i2) : viewGroup instanceof RadioGroup ? new LayoutParams(i, i2) : viewGroup instanceof TableLayout ? new LayoutParams(i, i2) : viewGroup instanceof TableRow ? new LayoutParams(i, i2) : viewGroup instanceof FrameLayout ? new LayoutParams(i, i2) : null;
    }
}