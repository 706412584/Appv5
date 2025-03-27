package i.runlibrary.app;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.VideoView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import fr.castorflex.android.verticalviewpager.VerticalViewPager;
import i.app.ClientsUDP;
import i.runlibrary.a.s;
import i.runlibrary.app.v.VC;
import i.runlibrary.app.v.an;
import i.runlibrary.app.v.bgbj;
import i.runlibrary.app.v.bgx;
import i.runlibrary.app.v.bjk;
import i.runlibrary.app.v.bqbj;
import i.runlibrary.app.v.chct;
import i.runlibrary.app.v.czhdct;
import i.runlibrary.app.v.dtt;
import i.runlibrary.app.v.dx;
import i.runlibrary.app.v.dxbj;
import i.runlibrary.app.v.dxx;
import i.runlibrary.app.v.fddzan;
import i.runlibrary.app.v.gd;
import i.runlibrary.app.v.gjlbj;
import i.runlibrary.app.v.hdct;
import i.runlibrary.app.v.jdt;
import i.runlibrary.app.v.kg;
import i.runlibrary.app.v.kp;
import i.runlibrary.app.v.lb;
import i.runlibrary.app.v.llq;
import i.runlibrary.app.v.mkj;
import i.runlibrary.app.v.pf;
import i.runlibrary.app.v.qtgd;
import i.runlibrary.app.v.rqxzq;
import i.runlibrary.app.v.sjxzq;
import i.runlibrary.app.v.sp;
import i.runlibrary.app.v.spgd;
import i.runlibrary.app.v.tdt;
import i.runlibrary.app.v.tx;
import i.runlibrary.app.v.txan;
import i.runlibrary.app.v.v7lb;
import i.runlibrary.app.v.wb;
import i.runlibrary.app.v.wbsrbj;
import i.runlibrary.app.v.wgst;
import i.runlibrary.app.v.xdbj;
import i.runlibrary.app.v.xlcd;
import i.runlibrary.app.v.xlsxkj;
import i.runlibrary.app.v.xtbj;
import i.runlibrary.app.v.xxbj;
import i.runlibrary.app.v.ysbj;
import i.runlibrary.app.v.yylbj;
import i.runlibrary.app.v.zbj;
import i.runlibrary.app.v.zdgjlbj;
import i.runlibrary.app.v.基础;
import i.runlibrary.c.a;
import i.runlibrary.c.f;
import java.lang.reflect.Array;
import java.util.HashMap;
import pl.droidsonroids.gif.GifImageView;

public final class st extends f {

    public class xfc {
        private WindowManager b;
        private View c;
        public LayoutParams gz = new LayoutParams();

        public xfc(WindowManager windowManager, View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams;
            int i5;
            this.b = windowManager;
            this.c = view;
            if (VERSION.SDK_INT >= 26) {
                layoutParams = this.gz;
                i5 = 2038;
            } else if (VERSION.SDK_INT >= 25 || VERSION.SDK_INT < 23) {
                layoutParams = this.gz;
                i5 = 2003;
            } else {
                layoutParams = this.gz;
                i5 = 2005;
            }
            layoutParams.type = i5;
            this.gz.format = 1;
            this.gz.gravity = 51;
            kg(Integer.valueOf(i), Integer.valueOf(i2));
            xy(Integer.valueOf(i3), Integer.valueOf(i4));
            this.gz.flags = 24;
            try {
                windowManager.addView(view, this.gz);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void dqfs(Object obj) {
            this.gz.gravity = s.d(obj);
        }

        public void gx() {
            try {
                this.b.updateViewLayout(this.c, this.gz);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void kg(Object obj, Object obj2) {
            this.gz.width = s.a(st.this.appInfo, obj);
            this.gz.height = s.a(st.this.appInfo, obj2);
        }

        public void tj() {
            try {
                this.b.addView(this.c, this.gz);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void xy(Object obj, Object obj2) {
            this.gz.x = s.a(st.this.appInfo, obj);
            this.gz.y = s.a(st.this.appInfo, obj2);
        }

        public void xysj(Object obj) {
            LayoutParams layoutParams;
            int i;
            if (obj.equals(Boolean.valueOf(true))) {
                layoutParams = this.gz;
                i = 40;
            } else {
                layoutParams = this.gz;
                i = 24;
            }
            layoutParams.flags = i;
        }

        public void yc() {
            try {
                this.b.removeView(this.c);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public st(AppInfo appInfo) {
        super(appInfo);
    }

    public final an an() {
        Button button = new Button(this.appInfo.c);
        button.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new an(this.appInfo, button);
    }

    public final an an(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof Button)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new an(this.appInfo, (Button) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (an) obj2;
        }
        an anVar = new an(this.appInfo, (Button) findViewById);
        this.appInfo._st_Cache.put(findViewById, anVar);
        return anVar;
    }

    public final an an(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof Button)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new an(this.appInfo, (Button) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (an) obj2;
        }
        an anVar = new an(this.appInfo, (Button) findViewById);
        this.appInfo._st_Cache.put(findViewById, anVar);
        return anVar;
    }

    public final bgbj bgbj() {
        TableLayout tableLayout = new TableLayout(this.appInfo.c);
        tableLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new bgbj(this.appInfo, tableLayout);
    }

    public final bgbj bgbj(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof TableLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new bgbj(this.appInfo, (TableLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (bgbj) obj2;
        }
        bgbj bgbj = new bgbj(this.appInfo, (TableLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, bgbj);
        return bgbj;
    }

    public final bgbj bgbj(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof TableLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new bgbj(this.appInfo, (TableLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (bgbj) obj2;
        }
        bgbj bgbj = new bgbj(this.appInfo, (TableLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, bgbj);
        return bgbj;
    }

    public final bgx bgx() {
        TableRow tableRow = new TableRow(this.appInfo.c);
        tableRow.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new bgx(this.appInfo, tableRow);
    }

    public final bgx bgx(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof TableRow)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new bgx(this.appInfo, (TableRow) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (bgx) obj2;
        }
        bgx bgx = new bgx(this.appInfo, (TableRow) findViewById);
        this.appInfo._st_Cache.put(findViewById, bgx);
        return bgx;
    }

    public final bgx bgx(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof TableRow)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new bgx(this.appInfo, (TableRow) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (bgx) obj2;
        }
        bgx bgx = new bgx(this.appInfo, (TableRow) findViewById);
        this.appInfo._st_Cache.put(findViewById, bgx);
        return bgx;
    }

    public final bjk bjk() {
        EditText editText = new EditText(this.appInfo.c);
        editText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new bjk(this.appInfo, editText);
    }

    public final bjk bjk(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof EditText)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new bjk(this.appInfo, (EditText) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (bjk) obj2;
        }
        bjk bjk = new bjk(this.appInfo, (EditText) findViewById);
        this.appInfo._st_Cache.put(findViewById, bjk);
        return bjk;
    }

    public final bjk bjk(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof EditText)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new bjk(this.appInfo, (EditText) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (bjk) obj2;
        }
        bjk bjk = new bjk(this.appInfo, (EditText) findViewById);
        this.appInfo._st_Cache.put(findViewById, bjk);
        return bjk;
    }

    public final bqbj bqbj() {
        TabLayout tabLayout = new TabLayout(this.appInfo.c);
        tabLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new bqbj(this.appInfo, tabLayout);
    }

    public final bqbj bqbj(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof TabLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new bqbj(this.appInfo, (TabLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (bqbj) obj2;
        }
        bqbj bqbj = new bqbj(this.appInfo, (TabLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, bqbj);
        return bqbj;
    }

    public final bqbj bqbj(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof TabLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new bqbj(this.appInfo, (TabLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (bqbj) obj2;
        }
        bqbj bqbj = new bqbj(this.appInfo, (TabLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, bqbj);
        return bqbj;
    }

    public final chct chct() {
        DrawerLayout drawerLayout = new DrawerLayout(this.appInfo.c);
        drawerLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new chct(this.appInfo, drawerLayout);
    }

    public final chct chct(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof DrawerLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new chct(this.appInfo, (DrawerLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (chct) obj2;
        }
        chct chct = new chct(this.appInfo, (DrawerLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, chct);
        return chct;
    }

    public final chct chct(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof DrawerLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new chct(this.appInfo, (DrawerLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (chct) obj2;
        }
        chct chct = new chct(this.appInfo, (DrawerLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, chct);
        return chct;
    }

    public final czhdct czhdct() {
        VerticalViewPager verticalViewPager = new VerticalViewPager(this.appInfo.c);
        verticalViewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new czhdct(this.appInfo, verticalViewPager);
    }

    public final czhdct czhdct(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof VerticalViewPager)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new czhdct(this.appInfo, (VerticalViewPager) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (czhdct) obj2;
        }
        czhdct czhdct = new czhdct(this.appInfo, (VerticalViewPager) findViewById);
        this.appInfo._st_Cache.put(findViewById, czhdct);
        return czhdct;
    }

    public final czhdct czhdct(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof VerticalViewPager)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new czhdct(this.appInfo, (VerticalViewPager) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (czhdct) obj2;
        }
        czhdct czhdct = new czhdct(this.appInfo, (VerticalViewPager) findViewById);
        this.appInfo._st_Cache.put(findViewById, czhdct);
        return czhdct;
    }

    public final dtt dtt() {
        GifImageView gifImageView = new GifImageView(this.appInfo.c);
        gifImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new dtt(this.appInfo, gifImageView);
    }

    public final dtt dtt(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof GifImageView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new dtt(this.appInfo, (GifImageView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (dtt) obj2;
        }
        dtt dtt = new dtt(this.appInfo, (GifImageView) findViewById);
        this.appInfo._st_Cache.put(findViewById, dtt);
        return dtt;
    }

    public final dtt dtt(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof GifImageView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new dtt(this.appInfo, (GifImageView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (dtt) obj2;
        }
        dtt dtt = new dtt(this.appInfo, (GifImageView) findViewById);
        this.appInfo._st_Cache.put(findViewById, dtt);
        return dtt;
    }

    public final dx dx() {
        CheckBox checkBox = new CheckBox(this.appInfo.c);
        checkBox.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new dx(this.appInfo, checkBox);
    }

    public final dx dx(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof CheckBox)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new dx(this.appInfo, (CheckBox) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (dx) obj2;
        }
        dx dxVar = new dx(this.appInfo, (CheckBox) findViewById);
        this.appInfo._st_Cache.put(findViewById, dxVar);
        return dxVar;
    }

    public final dx dx(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof CheckBox)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new dx(this.appInfo, (CheckBox) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (dx) obj2;
        }
        dx dxVar = new dx(this.appInfo, (CheckBox) findViewById);
        this.appInfo._st_Cache.put(findViewById, dxVar);
        return dxVar;
    }

    public final dxbj dxbj() {
        RadioGroup radioGroup = new RadioGroup(this.appInfo.c);
        radioGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new dxbj(this.appInfo, radioGroup);
    }

    public final dxbj dxbj(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof RadioGroup)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new dxbj(this.appInfo, (RadioGroup) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (dxbj) obj2;
        }
        dxbj dxbj = new dxbj(this.appInfo, (RadioGroup) findViewById);
        this.appInfo._st_Cache.put(findViewById, dxbj);
        return dxbj;
    }

    public final dxbj dxbj(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof RadioGroup)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new dxbj(this.appInfo, (RadioGroup) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (dxbj) obj2;
        }
        dxbj dxbj = new dxbj(this.appInfo, (RadioGroup) findViewById);
        this.appInfo._st_Cache.put(findViewById, dxbj);
        return dxbj;
    }

    public final dxx dxx() {
        RadioButton radioButton = new RadioButton(this.appInfo.c);
        radioButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new dxx(this.appInfo, radioButton);
    }

    public final dxx dxx(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof RadioButton)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new dxx(this.appInfo, (RadioButton) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (dxx) obj2;
        }
        dxx dxx = new dxx(this.appInfo, (RadioButton) findViewById);
        this.appInfo._st_Cache.put(findViewById, dxx);
        return dxx;
    }

    public final dxx dxx(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof RadioButton)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new dxx(this.appInfo, (RadioButton) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (dxx) obj2;
        }
        dxx dxx = new dxx(this.appInfo, (RadioButton) findViewById);
        this.appInfo._st_Cache.put(findViewById, dxx);
        return dxx;
    }

    public final fddzan fddzan() {
        FloatingActionButton floatingActionButton = new FloatingActionButton(this.appInfo.c);
        floatingActionButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new fddzan(this.appInfo, floatingActionButton);
    }

    public final fddzan fddzan(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof FloatingActionButton)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new fddzan(this.appInfo, (FloatingActionButton) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (fddzan) obj2;
        }
        fddzan fddzan = new fddzan(this.appInfo, (FloatingActionButton) findViewById);
        this.appInfo._st_Cache.put(findViewById, fddzan);
        return fddzan;
    }

    public final fddzan fddzan(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof FloatingActionButton)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new fddzan(this.appInfo, (FloatingActionButton) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (fddzan) obj2;
        }
        fddzan fddzan = new fddzan(this.appInfo, (FloatingActionButton) findViewById);
        this.appInfo._st_Cache.put(findViewById, fddzan);
        return fddzan;
    }

    public final gd gd() {
        ScrollView scrollView = new ScrollView(this.appInfo.c);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new gd(this.appInfo, scrollView);
    }

    public final gd gd(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof ScrollView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new gd(this.appInfo, (ScrollView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (gd) obj2;
        }
        gd gdVar = new gd(this.appInfo, (ScrollView) findViewById);
        this.appInfo._st_Cache.put(findViewById, gdVar);
        return gdVar;
    }

    public final gd gd(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof ScrollView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new gd(this.appInfo, (ScrollView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (gd) obj2;
        }
        gd gdVar = new gd(this.appInfo, (ScrollView) findViewById);
        this.appInfo._st_Cache.put(findViewById, gdVar);
        return gdVar;
    }

    public final gjlbj gjlbj() {
        Toolbar toolbar = new Toolbar(this.appInfo.c);
        toolbar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new gjlbj(this.appInfo, toolbar);
    }

    public final gjlbj gjlbj(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof Toolbar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new gjlbj(this.appInfo, (Toolbar) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (gjlbj) obj2;
        }
        gjlbj gjlbj = new gjlbj(this.appInfo, (Toolbar) findViewById);
        this.appInfo._st_Cache.put(findViewById, gjlbj);
        return gjlbj;
    }

    public final gjlbj gjlbj(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof Toolbar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new gjlbj(this.appInfo, (Toolbar) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (gjlbj) obj2;
        }
        gjlbj gjlbj = new gjlbj(this.appInfo, (Toolbar) findViewById);
        this.appInfo._st_Cache.put(findViewById, gjlbj);
        return gjlbj;
    }

    public final hdct hdct() {
        ViewPager viewPager = new ViewPager(this.appInfo.c);
        viewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new hdct(this.appInfo, viewPager);
    }

    public final hdct hdct(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof ViewPager)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new hdct(this.appInfo, (ViewPager) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (hdct) obj2;
        }
        hdct hdct = new hdct(this.appInfo, (ViewPager) findViewById);
        this.appInfo._st_Cache.put(findViewById, hdct);
        return hdct;
    }

    public final hdct hdct(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof ViewPager)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new hdct(this.appInfo, (ViewPager) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (hdct) obj2;
        }
        hdct hdct = new hdct(this.appInfo, (ViewPager) findViewById);
        this.appInfo._st_Cache.put(findViewById, hdct);
        return hdct;
    }

    public final jdt jdt() {
        ProgressBar progressBar = new ProgressBar(this.appInfo.c);
        progressBar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new jdt(this.appInfo, progressBar);
    }

    public final jdt jdt(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof ProgressBar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new jdt(this.appInfo, (ProgressBar) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (jdt) obj2;
        }
        jdt jdt = new jdt(this.appInfo, (ProgressBar) findViewById);
        this.appInfo._st_Cache.put(findViewById, jdt);
        return jdt;
    }

    public final jdt jdt(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof ProgressBar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new jdt(this.appInfo, (ProgressBar) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (jdt) obj2;
        }
        jdt jdt = new jdt(this.appInfo, (ProgressBar) findViewById);
        this.appInfo._st_Cache.put(findViewById, jdt);
        return jdt;
    }

    public final kg kg() {
        SwitchCompat switchCompat = new SwitchCompat(this.appInfo.c);
        switchCompat.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new kg(this.appInfo, switchCompat);
    }

    public final kg kg(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof SwitchCompat)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new kg(this.appInfo, (SwitchCompat) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (kg) obj2;
        }
        kg kgVar = new kg(this.appInfo, (SwitchCompat) findViewById);
        this.appInfo._st_Cache.put(findViewById, kgVar);
        return kgVar;
    }

    public final void kg(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof SwitchCompat)) {
            return null;
        }
        if (this.appInfo._st_Cache != null) {
            obj2 = this.appInfo._st_Cache.get(findViewById);
            if (obj2 == null) {
                kg kgVar = new kg(this.appInfo, (SwitchCompat) findViewById);
                this.appInfo._st_Cache.put(findViewById, kgVar);
            }
        }
    }

    public final kp kp() {
        CardView cardView = new CardView(this.appInfo.c);
        cardView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new kp(this.appInfo, cardView);
    }

    public final kp kp(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof CardView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new kp(this.appInfo, (CardView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (kp) obj2;
        }
        kp kpVar = new kp(this.appInfo, (CardView) findViewById);
        this.appInfo._st_Cache.put(findViewById, kpVar);
        return kpVar;
    }

    public final kp kp(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof CardView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new kp(this.appInfo, (CardView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (kp) obj2;
        }
        kp kpVar = new kp(this.appInfo, (CardView) findViewById);
        this.appInfo._st_Cache.put(findViewById, kpVar);
        return kpVar;
    }

    public final lb lb() {
        ListView listView = new ListView(this.appInfo.c);
        listView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new lb(this.appInfo, listView);
    }

    public final lb lb(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof ListView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new lb(this.appInfo, (ListView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (lb) obj2;
        }
        lb lbVar = new lb(this.appInfo, (ListView) findViewById);
        this.appInfo._st_Cache.put(findViewById, lbVar);
        return lbVar;
    }

    public final lb lb(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof ListView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new lb(this.appInfo, (ListView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (lb) obj2;
        }
        lb lbVar = new lb(this.appInfo, (ListView) findViewById);
        this.appInfo._st_Cache.put(findViewById, lbVar);
        return lbVar;
    }

    public final llq llq() {
        WebView webView = new WebView(this.appInfo.c);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new llq(this.appInfo, webView);
    }

    public final llq llq(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof WebView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new llq(this.appInfo, (WebView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (llq) obj2;
        }
        llq llq = new llq(this.appInfo, (WebView) findViewById);
        this.appInfo._st_Cache.put(findViewById, llq);
        return llq;
    }

    public final llq llq(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof WebView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new llq(this.appInfo, (WebView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (llq) obj2;
        }
        llq llq = new llq(this.appInfo, (WebView) findViewById);
        this.appInfo._st_Cache.put(findViewById, llq);
        return llq;
    }

    public final mkj mkj() {
        SurfaceView surfaceView = new SurfaceView(this.appInfo.c);
        surfaceView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new mkj(this.appInfo, surfaceView);
    }

    public final mkj mkj(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof SurfaceView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new mkj(this.appInfo, (SurfaceView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (mkj) obj2;
        }
        mkj mkj = new mkj(this.appInfo, (SurfaceView) findViewById);
        this.appInfo._st_Cache.put(findViewById, mkj);
        return mkj;
    }

    public final mkj mkj(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof SurfaceView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new mkj(this.appInfo, (SurfaceView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (mkj) obj2;
        }
        mkj mkj = new mkj(this.appInfo, (SurfaceView) findViewById);
        this.appInfo._st_Cache.put(findViewById, mkj);
        return mkj;
    }

    public final pf pf() {
        RatingBar ratingBar = new RatingBar(this.appInfo.c);
        ratingBar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new pf(this.appInfo, ratingBar);
    }

    public final pf pf(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof RatingBar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new pf(this.appInfo, (RatingBar) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (pf) obj2;
        }
        pf pfVar = new pf(this.appInfo, (RatingBar) findViewById);
        this.appInfo._st_Cache.put(findViewById, pfVar);
        return pfVar;
    }

    public final pf pf(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof RatingBar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new pf(this.appInfo, (RatingBar) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (pf) obj2;
        }
        pf pfVar = new pf(this.appInfo, (RatingBar) findViewById);
        this.appInfo._st_Cache.put(findViewById, pfVar);
        return pfVar;
    }

    public final void qkhc() {
        if (this.appInfo._st_Cache != null) {
            this.appInfo._st_Cache.clear();
        }
    }

    public final qtgd qtgd() {
        NestedScrollView nestedScrollView = new NestedScrollView(this.appInfo.c);
        nestedScrollView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new qtgd(this.appInfo, nestedScrollView);
    }

    public final qtgd qtgd(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof NestedScrollView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new qtgd(this.appInfo, (NestedScrollView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (qtgd) obj2;
        }
        qtgd qtgd = new qtgd(this.appInfo, (NestedScrollView) findViewById);
        this.appInfo._st_Cache.put(findViewById, qtgd);
        return qtgd;
    }

    public final qtgd qtgd(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof NestedScrollView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new qtgd(this.appInfo, (NestedScrollView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (qtgd) obj2;
        }
        qtgd qtgd = new qtgd(this.appInfo, (NestedScrollView) findViewById);
        this.appInfo._st_Cache.put(findViewById, qtgd);
        return qtgd;
    }

    public final rqxzq rqxzq() {
        DatePicker datePicker = new DatePicker(this.appInfo.c);
        datePicker.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new rqxzq(this.appInfo, datePicker);
    }

    public final rqxzq rqxzq(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof DatePicker)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new rqxzq(this.appInfo, (DatePicker) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (rqxzq) obj2;
        }
        rqxzq rqxzq = new rqxzq(this.appInfo, (DatePicker) findViewById);
        this.appInfo._st_Cache.put(findViewById, rqxzq);
        return rqxzq;
    }

    public final rqxzq rqxzq(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof DatePicker)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new rqxzq(this.appInfo, (DatePicker) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (rqxzq) obj2;
        }
        rqxzq rqxzq = new rqxzq(this.appInfo, (DatePicker) findViewById);
        this.appInfo._st_Cache.put(findViewById, rqxzq);
        return rqxzq;
    }

    public final sjxzq sjxzq() {
        TimePicker timePicker = new TimePicker(this.appInfo.c);
        timePicker.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new sjxzq(this.appInfo, timePicker);
    }

    public final sjxzq sjxzq(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof TimePicker)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new sjxzq(this.appInfo, (TimePicker) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (sjxzq) obj2;
        }
        sjxzq sjxzq = new sjxzq(this.appInfo, (TimePicker) findViewById);
        this.appInfo._st_Cache.put(findViewById, sjxzq);
        return sjxzq;
    }

    public final sjxzq sjxzq(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof TimePicker)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new sjxzq(this.appInfo, (TimePicker) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (sjxzq) obj2;
        }
        sjxzq sjxzq = new sjxzq(this.appInfo, (TimePicker) findViewById);
        this.appInfo._st_Cache.put(findViewById, sjxzq);
        return sjxzq;
    }

    public final sp sp() {
        VideoView videoView = new VideoView(this.appInfo.c);
        videoView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new sp(this.appInfo, videoView);
    }

    public final sp sp(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof VideoView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new sp(this.appInfo, (VideoView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (sp) obj2;
        }
        sp spVar = new sp(this.appInfo, (VideoView) findViewById);
        this.appInfo._st_Cache.put(findViewById, spVar);
        return spVar;
    }

    public final sp sp(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof VideoView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new sp(this.appInfo, (VideoView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (sp) obj2;
        }
        sp spVar = new sp(this.appInfo, (VideoView) findViewById);
        this.appInfo._st_Cache.put(findViewById, spVar);
        return spVar;
    }

    public final spgd spgd() {
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.appInfo.c);
        horizontalScrollView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new spgd(this.appInfo, horizontalScrollView);
    }

    public final spgd spgd(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof HorizontalScrollView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new spgd(this.appInfo, (HorizontalScrollView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (spgd) obj2;
        }
        spgd spgd = new spgd(this.appInfo, (HorizontalScrollView) findViewById);
        this.appInfo._st_Cache.put(findViewById, spgd);
        return spgd;
    }

    public final spgd spgd(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof HorizontalScrollView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new spgd(this.appInfo, (HorizontalScrollView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (spgd) obj2;
        }
        spgd spgd = new spgd(this.appInfo, (HorizontalScrollView) findViewById);
        this.appInfo._st_Cache.put(findViewById, spgd);
        return spgd;
    }

    public final View st(Object obj) {
        return findViewById(obj);
    }

    public final View st(Object obj, Object obj2) {
        return findViewById(obj, obj2);
    }

    public final void szhc(boolean z) {
        AppInfo appInfo;
        HashMap hashMap;
        if (z) {
            appInfo = this.appInfo;
            hashMap = new HashMap();
        } else {
            appInfo = this.appInfo;
            hashMap = null;
        }
        appInfo._st_Cache = hashMap;
    }

    public final AlertDialog tc(Object obj, Object obj2) {
        return tc(null, obj, obj2, null, null, null, null, null, null);
    }

    public final AlertDialog tc(Object obj, Object obj2, Object obj3) {
        return tc(obj, obj2, obj3, null, null, null, null, null, null);
    }

    public final AlertDialog tc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return tc(obj, obj2, obj3, obj4, null, null, obj5, null, null);
    }

    public final AlertDialog tc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return tc(obj, obj2, obj3, obj4, obj5, null, obj6, obj7, null);
    }

    public final AlertDialog tc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Builder builder = new Builder(this.appInfo.c);
        if (obj != null) {
            Drawable drawable;
            if (obj instanceof Drawable) {
                drawable = (Drawable) obj;
            } else if (obj instanceof Integer) {
                builder.setIcon(s.d(obj));
            } else {
                drawable = a.a(obj, this.appInfo.c);
            }
            builder.setIcon(drawable);
        }
        if (obj2 != null) {
            if (obj2 instanceof String) {
                builder.setTitle(obj2.toString());
            } else if (obj2 instanceof Integer) {
                builder.setTitle(s.d(obj2));
            }
        }
        if (obj3 != null) {
            if (obj3 instanceof String) {
                builder.setMessage(obj3.toString());
            } else if (obj3 instanceof View) {
                builder.setView((View) obj3);
            } else {
                View view;
                if (obj3 instanceof VC) {
                    view = ((VC) obj3).v;
                } else if (obj3 instanceof 基础) {
                    view = ((基础) obj3).f90;
                } else if (obj3 instanceof Integer) {
                    builder.setMessage(s.d(obj3));
                }
                builder.setView(view);
            }
        }
        if (obj4 != null) {
            if (obj7 instanceof OnClickListener) {
                builder.setPositiveButton(obj4.toString(), (OnClickListener) obj7);
            } else {
                builder.setPositiveButton(obj4.toString(), null);
            }
        }
        if (obj5 != null) {
            if (obj8 instanceof OnClickListener) {
                builder.setNegativeButton(obj5.toString(), (OnClickListener) obj8);
            } else {
                builder.setNegativeButton(obj5.toString(), null);
            }
        }
        if (obj6 != null) {
            if (obj9 instanceof OnClickListener) {
                builder.setNeutralButton(obj6.toString(), (OnClickListener) obj9);
            } else {
                builder.setNeutralButton(obj6.toString(), null);
            }
        }
        return builder.show();
    }

    public final PopupMenu tccd(Object obj, OnMenuItemClickListener onMenuItemClickListener) {
        PopupMenu popupMenu = new PopupMenu(this.appInfo.c, st(obj));
        popupMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        return popupMenu;
    }

    public final PopupMenu tccd(Object obj, Object obj2, Object obj3, OnMenuItemClickListener onMenuItemClickListener) {
        PopupMenu popupMenu = new PopupMenu(this.appInfo.c, st(obj2));
        popupMenu.getMenuInflater().inflate(s.d(obj3), popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        if (obj.equals(Boolean.valueOf(true))) {
            popupMenu.show();
        }
        return popupMenu;
    }

    public final PopupMenu tccd(Object obj, Object obj2, Object obj3, Object obj4, OnMenuItemClickListener onMenuItemClickListener) {
        if (obj3.getClass().isArray() && obj4.getClass().isArray()) {
            Class cls = obj3.getClass();
            if (int[].class.equals(cls) || Integer[].class.equals(cls)) {
                int length = Array.getLength(obj3);
                int length2 = Array.getLength(obj4);
                if (length > 0 && length == length2) {
                    PopupMenu popupMenu = new PopupMenu(this.appInfo.c, st(obj2));
                    for (int i = 0; i < length; i++) {
                        popupMenu.getMenu().add(i, i, s.d(Array.get(obj3, i)), String.valueOf(Array.get(obj4, i)));
                    }
                    popupMenu.setOnMenuItemClickListener(onMenuItemClickListener);
                    if (obj.equals(Boolean.valueOf(true))) {
                        popupMenu.show();
                    }
                    return popupMenu;
                }
            }
        }
        return null;
    }

    public final boolean tctx(Object obj, Object obj2, Object obj3) {
        try {
            Snackbar.make(st(obj), obj2.toString(), s.d(obj3)).show();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean tctx(Object obj, Object obj2, Object obj3, Object obj4, View.OnClickListener onClickListener) {
        try {
            Snackbar.make(st(obj), obj2.toString(), s.d(obj3)).setAction(obj4.toString(), onClickListener).show();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean tctx(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, View.OnClickListener onClickListener) {
        try {
            Snackbar.make(st(obj), obj2.toString(), s.d(obj3)).setAction(obj4.toString(), onClickListener).setActionTextColor(ClientsUDP.a(obj5)).show();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final tdt tdt() {
        SeekBar seekBar = new SeekBar(this.appInfo.c);
        seekBar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new tdt(this.appInfo, seekBar);
    }

    public final tdt tdt(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof SeekBar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new tdt(this.appInfo, (SeekBar) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (tdt) obj2;
        }
        tdt tdt = new tdt(this.appInfo, (SeekBar) findViewById);
        this.appInfo._st_Cache.put(findViewById, tdt);
        return tdt;
    }

    public final tdt tdt(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof SeekBar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new tdt(this.appInfo, (SeekBar) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (tdt) obj2;
        }
        tdt tdt = new tdt(this.appInfo, (SeekBar) findViewById);
        this.appInfo._st_Cache.put(findViewById, tdt);
        return tdt;
    }

    public final tx tx() {
        ImageView imageView = new ImageView(this.appInfo.c);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new tx(this.appInfo, imageView);
    }

    public final tx tx(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof ImageView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new tx(this.appInfo, (ImageView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (tx) obj2;
        }
        tx txVar = new tx(this.appInfo, (ImageView) findViewById);
        this.appInfo._st_Cache.put(findViewById, txVar);
        return txVar;
    }

    public final tx tx(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof ImageView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new tx(this.appInfo, (ImageView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (tx) obj2;
        }
        tx txVar = new tx(this.appInfo, (ImageView) findViewById);
        this.appInfo._st_Cache.put(findViewById, txVar);
        return txVar;
    }

    public final txan txan() {
        ImageButton imageButton = new ImageButton(this.appInfo.c);
        imageButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new txan(this.appInfo, imageButton);
    }

    public final txan txan(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof ImageButton)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new txan(this.appInfo, (ImageButton) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (txan) obj2;
        }
        txan txan = new txan(this.appInfo, (ImageButton) findViewById);
        this.appInfo._st_Cache.put(findViewById, txan);
        return txan;
    }

    public final txan txan(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof ImageButton)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new txan(this.appInfo, (ImageButton) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (txan) obj2;
        }
        txan txan = new txan(this.appInfo, (ImageButton) findViewById);
        this.appInfo._st_Cache.put(findViewById, txan);
        return txan;
    }

    public final v7lb v7lb() {
        RecyclerView recyclerView = new RecyclerView(this.appInfo.c);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new v7lb(this.appInfo, recyclerView);
    }

    public final v7lb v7lb(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof RecyclerView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new v7lb(this.appInfo, (RecyclerView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (v7lb) obj2;
        }
        v7lb v7lb = new v7lb(this.appInfo, (RecyclerView) findViewById);
        this.appInfo._st_Cache.put(findViewById, v7lb);
        return v7lb;
    }

    public final v7lb v7lb(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof RecyclerView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new v7lb(this.appInfo, (RecyclerView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (v7lb) obj2;
        }
        v7lb v7lb = new v7lb(this.appInfo, (RecyclerView) findViewById);
        this.appInfo._st_Cache.put(findViewById, v7lb);
        return v7lb;
    }

    public final wb wb() {
        TextView textView = new TextView(this.appInfo.c);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new wb(this.appInfo, textView);
    }

    public final wb wb(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof TextView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new wb(this.appInfo, (TextView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (wb) obj2;
        }
        wb wbVar = new wb(this.appInfo, (TextView) findViewById);
        this.appInfo._st_Cache.put(findViewById, wbVar);
        return wbVar;
    }

    public final wb wb(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof TextView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new wb(this.appInfo, (TextView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (wb) obj2;
        }
        wb wbVar = new wb(this.appInfo, (TextView) findViewById);
        this.appInfo._st_Cache.put(findViewById, wbVar);
        return wbVar;
    }

    public final wbsrbj wbsrbj() {
        TextInputLayout textInputLayout = new TextInputLayout(this.appInfo.c);
        textInputLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new wbsrbj(this.appInfo, textInputLayout);
    }

    public final wbsrbj wbsrbj(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof TextInputLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new wbsrbj(this.appInfo, (TextInputLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (wbsrbj) obj2;
        }
        wbsrbj wbsrbj = new wbsrbj(this.appInfo, (TextInputLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, wbsrbj);
        return wbsrbj;
    }

    public final wbsrbj wbsrbj(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof TextInputLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new wbsrbj(this.appInfo, (TextInputLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (wbsrbj) obj2;
        }
        wbsrbj wbsrbj = new wbsrbj(this.appInfo, (TextInputLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, wbsrbj);
        return wbsrbj;
    }

    public final wgst wgst() {
        GridView gridView = new GridView(this.appInfo.c);
        gridView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new wgst(this.appInfo, gridView);
    }

    public final wgst wgst(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof GridView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new wgst(this.appInfo, (GridView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (wgst) obj2;
        }
        wgst wgst = new wgst(this.appInfo, (GridView) findViewById);
        this.appInfo._st_Cache.put(findViewById, wgst);
        return wgst;
    }

    public final wgst wgst(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof GridView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new wgst(this.appInfo, (GridView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (wgst) obj2;
        }
        wgst wgst = new wgst(this.appInfo, (GridView) findViewById);
        this.appInfo._st_Cache.put(findViewById, wgst);
        return wgst;
    }

    public final xdbj xdbj() {
        RelativeLayout relativeLayout = new RelativeLayout(this.appInfo.c);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new xdbj(this.appInfo, relativeLayout);
    }

    public final xdbj xdbj(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof RelativeLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xdbj(this.appInfo, (RelativeLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (xdbj) obj2;
        }
        xdbj xdbj = new xdbj(this.appInfo, (RelativeLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, xdbj);
        return xdbj;
    }

    public final xdbj xdbj(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof RelativeLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xdbj(this.appInfo, (RelativeLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (xdbj) obj2;
        }
        xdbj xdbj = new xdbj(this.appInfo, (RelativeLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, xdbj);
        return xdbj;
    }

    public final xfc xfc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new xfc((WindowManager) this.appInfo.c.getSystemService("window"), st(obj), s.d(obj2), s.d(obj3), s.d(obj4), s.d(obj5));
    }

    public final xlcd xlcd() {
        Spinner spinner = new Spinner(this.appInfo.c);
        spinner.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new xlcd(this.appInfo, spinner);
    }

    public final xlcd xlcd(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof Spinner)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xlcd(this.appInfo, (Spinner) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (xlcd) obj2;
        }
        xlcd xlcd = new xlcd(this.appInfo, (Spinner) findViewById);
        this.appInfo._st_Cache.put(findViewById, xlcd);
        return xlcd;
    }

    public final xlcd xlcd(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof Spinner)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xlcd(this.appInfo, (Spinner) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (xlcd) obj2;
        }
        xlcd xlcd = new xlcd(this.appInfo, (Spinner) findViewById);
        this.appInfo._st_Cache.put(findViewById, xlcd);
        return xlcd;
    }

    public final xlsxkj xlsxkj() {
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(this.appInfo.c);
        swipeRefreshLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new xlsxkj(this.appInfo, swipeRefreshLayout);
    }

    public final xlsxkj xlsxkj(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof SwipeRefreshLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xlsxkj(this.appInfo, (SwipeRefreshLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (xlsxkj) obj2;
        }
        xlsxkj xlsxkj = new xlsxkj(this.appInfo, (SwipeRefreshLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, xlsxkj);
        return xlsxkj;
    }

    public final xlsxkj xlsxkj(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof SwipeRefreshLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xlsxkj(this.appInfo, (SwipeRefreshLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (xlsxkj) obj2;
        }
        xlsxkj xlsxkj = new xlsxkj(this.appInfo, (SwipeRefreshLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, xlsxkj);
        return xlsxkj;
    }

    public final xtbj xtbj() {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(this.appInfo.c);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new xtbj(this.appInfo, coordinatorLayout);
    }

    public final xtbj xtbj(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof CoordinatorLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xtbj(this.appInfo, (CoordinatorLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (xtbj) obj2;
        }
        xtbj xtbj = new xtbj(this.appInfo, (CoordinatorLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, xtbj);
        return xtbj;
    }

    public final xtbj xtbj(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof CoordinatorLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xtbj(this.appInfo, (CoordinatorLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (xtbj) obj2;
        }
        xtbj xtbj = new xtbj(this.appInfo, (CoordinatorLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, xtbj);
        return xtbj;
    }

    public final xxbj xxbj() {
        LinearLayout linearLayout = new LinearLayout(this.appInfo.c);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        return new xxbj(this.appInfo, linearLayout);
    }

    public final xxbj xxbj(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof LinearLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xxbj(this.appInfo, (LinearLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (xxbj) obj2;
        }
        xxbj xxbj = new xxbj(this.appInfo, (LinearLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, xxbj);
        return xxbj;
    }

    public final xxbj xxbj(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof LinearLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xxbj(this.appInfo, (LinearLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (xxbj) obj2;
        }
        xxbj xxbj = new xxbj(this.appInfo, (LinearLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, xxbj);
        return xxbj;
    }

    public final ysbj ysbj() {
        ConstraintLayout constraintLayout = new ConstraintLayout(this.appInfo.c);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new ysbj(this.appInfo, constraintLayout);
    }

    public final ysbj ysbj(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof ConstraintLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new ysbj(this.appInfo, (ConstraintLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (ysbj) obj2;
        }
        ysbj ysbj = new ysbj(this.appInfo, (ConstraintLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, ysbj);
        return ysbj;
    }

    public final ysbj ysbj(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof ConstraintLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new ysbj(this.appInfo, (ConstraintLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (ysbj) obj2;
        }
        ysbj ysbj = new ysbj(this.appInfo, (ConstraintLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, ysbj);
        return ysbj;
    }

    public final yylbj yylbj() {
        AppBarLayout appBarLayout = new AppBarLayout(this.appInfo.c);
        appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new yylbj(this.appInfo, appBarLayout);
    }

    public final yylbj yylbj(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof AppBarLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new yylbj(this.appInfo, (AppBarLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (yylbj) obj2;
        }
        yylbj yylbj = new yylbj(this.appInfo, (AppBarLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, yylbj);
        return yylbj;
    }

    public final yylbj yylbj(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof AppBarLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new yylbj(this.appInfo, (AppBarLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (yylbj) obj2;
        }
        yylbj yylbj = new yylbj(this.appInfo, (AppBarLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, yylbj);
        return yylbj;
    }

    public final zbj zbj() {
        FrameLayout frameLayout = new FrameLayout(this.appInfo.c);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new zbj(this.appInfo, frameLayout);
    }

    public final zbj zbj(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof FrameLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new zbj(this.appInfo, (FrameLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (zbj) obj2;
        }
        zbj zbj = new zbj(this.appInfo, (FrameLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, zbj);
        return zbj;
    }

    public final zbj zbj(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof FrameLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new zbj(this.appInfo, (FrameLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (zbj) obj2;
        }
        zbj zbj = new zbj(this.appInfo, (FrameLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, zbj);
        return zbj;
    }

    public final zdgjlbj zdgjlbj() {
        CollapsingToolbarLayout collapsingToolbarLayout = new CollapsingToolbarLayout(this.appInfo.c);
        collapsingToolbarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new zdgjlbj(this.appInfo, collapsingToolbarLayout);
    }

    public final zdgjlbj zdgjlbj(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof CollapsingToolbarLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new zdgjlbj(this.appInfo, (CollapsingToolbarLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (zdgjlbj) obj2;
        }
        zdgjlbj zdgjlbj = new zdgjlbj(this.appInfo, (CollapsingToolbarLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, zdgjlbj);
        return zdgjlbj;
    }

    public final zdgjlbj zdgjlbj(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof CollapsingToolbarLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new zdgjlbj(this.appInfo, (CollapsingToolbarLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (zdgjlbj) obj2;
        }
        zdgjlbj zdgjlbj = new zdgjlbj(this.appInfo, (CollapsingToolbarLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, zdgjlbj);
        return zdgjlbj;
    }
}