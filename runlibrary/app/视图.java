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
import i.runlibrary.app.v.bgbj;
import i.runlibrary.app.v.bjk;
import i.runlibrary.app.v.bqbj;
import i.runlibrary.app.v.czhdct;
import i.runlibrary.app.v.dxbj;
import i.runlibrary.app.v.gd;
import i.runlibrary.app.v.gjlbj;
import i.runlibrary.app.v.jdt;
import i.runlibrary.app.v.kg;
import i.runlibrary.app.v.lb;
import i.runlibrary.app.v.pf;
import i.runlibrary.app.v.sjxzq;
import i.runlibrary.app.v.tdt;
import i.runlibrary.app.v.txan;
import i.runlibrary.app.v.v7列表;
import i.runlibrary.app.v.wb;
import i.runlibrary.app.v.wbsrbj;
import i.runlibrary.app.v.wgst;
import i.runlibrary.app.v.xdbj;
import i.runlibrary.app.v.xlsxkj;
import i.runlibrary.app.v.xxbj;
import i.runlibrary.app.v.ysbj;
import i.runlibrary.app.v.zbj;
import i.runlibrary.app.v.zdgjlbj;
import i.runlibrary.app.v.下拉刷新控件;
import i.runlibrary.app.v.下拉菜单;
import i.runlibrary.app.v.侧滑窗体;
import i.runlibrary.app.v.列表;
import i.runlibrary.app.v.动态图;
import i.runlibrary.app.v.协调布局;
import i.runlibrary.app.v.单选布局;
import i.runlibrary.app.v.单选项;
import i.runlibrary.app.v.卡片;
import i.runlibrary.app.v.图像;
import i.runlibrary.app.v.图像按钮;
import i.runlibrary.app.v.垂直滑动窗体;
import i.runlibrary.app.v.基础;
import i.runlibrary.app.v.多选;
import i.runlibrary.app.v.嵌套滚动;
import i.runlibrary.app.v.工具栏布局;
import i.runlibrary.app.v.帧布局;
import i.runlibrary.app.v.应用栏布局;
import i.runlibrary.app.v.开关;
import i.runlibrary.app.v.折叠工具栏布局;
import i.runlibrary.app.v.拖动条;
import i.runlibrary.app.v.按钮;
import i.runlibrary.app.v.文本;
import i.runlibrary.app.v.文本输入布局;
import i.runlibrary.app.v.日期选择器;
import i.runlibrary.app.v.时间选择器;
import i.runlibrary.app.v.标签布局;
import i.runlibrary.app.v.水平滚动;
import i.runlibrary.app.v.浏览器;
import i.runlibrary.app.v.浮动动作按钮;
import i.runlibrary.app.v.滑动窗体;
import i.runlibrary.app.v.滚动;
import i.runlibrary.app.v.相对布局;
import i.runlibrary.app.v.约束布局;
import i.runlibrary.app.v.线性布局;
import i.runlibrary.app.v.编辑框;
import i.runlibrary.app.v.网格视图;
import i.runlibrary.app.v.表格布局;
import i.runlibrary.app.v.表格项;
import i.runlibrary.app.v.视频;
import i.runlibrary.app.v.评分;
import i.runlibrary.app.v.进度条;
import i.runlibrary.app.v.面控件;
import i.runlibrary.c.f;
import java.lang.reflect.Array;
import java.util.HashMap;
import pl.droidsonroids.gif.GifImageView;

public final class 视图 extends f {

    public class 悬浮窗 {
        private WindowManager b;
        private View c;
        /* renamed from: 规则 */
        public LayoutParams f62 = new LayoutParams();

        public 悬浮窗(WindowManager windowManager, View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams;
            int i5;
            this.b = windowManager;
            this.c = view;
            if (VERSION.SDK_INT >= 26) {
                layoutParams = this.f62;
                i5 = 2038;
            } else if (VERSION.SDK_INT >= 25 || VERSION.SDK_INT < 23) {
                layoutParams = this.f62;
                i5 = 2003;
            } else {
                layoutParams = this.f62;
                i5 = 2005;
            }
            layoutParams.type = i5;
            this.f62.format = 1;
            this.f62.gravity = 51;
            m384(Integer.valueOf(i), Integer.valueOf(i2));
            xy(Integer.valueOf(i3), Integer.valueOf(i4));
            this.f62.flags = 24;
            try {
                windowManager.addView(view, this.f62);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void xy(Object obj, Object obj2) {
            this.f62.x = s.a(视图.this.appInfo, obj);
            this.f62.y = s.a(视图.this.appInfo, obj2);
        }

        /* renamed from: 宽高 */
        public void m384(Object obj, Object obj2) {
            this.f62.width = s.a(视图.this.appInfo, obj);
            this.f62.height = s.a(视图.this.appInfo, obj2);
        }

        /* renamed from: 对齐方式 */
        public void m385(Object obj) {
            this.f62.gravity = s.d(obj);
        }

        /* renamed from: 更新 */
        public void m386() {
            try {
                this.b.updateViewLayout(this.c, this.f62);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: 添加 */
        public void m387() {
            try {
                this.b.addView(this.c, this.f62);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: 相应事件 */
        public void m388(Object obj) {
            LayoutParams layoutParams;
            int i;
            if (obj.equals(Boolean.valueOf(true))) {
                layoutParams = this.f62;
                i = 40;
            } else {
                layoutParams = this.f62;
                i = 24;
            }
            layoutParams.flags = i;
        }

        /* renamed from: 移除 */
        public void m389() {
            try {
                this.b.removeView(this.c);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public 视图(AppInfo appInfo) {
        super(appInfo);
    }

    /* renamed from: v7列表 */
    public final v7列表 m239v7() {
        RecyclerView recyclerView = new RecyclerView(this.appInfo.c);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new v7列表(this.appInfo, recyclerView);
    }

    /* renamed from: v7列表 */
    public final v7列表 m240v7(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof RecyclerView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new v7列表(this.appInfo, (RecyclerView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (v7列表) obj2;
        }
        v7列表 v7列表 = new v7列表(this.appInfo, (RecyclerView) findViewById);
        this.appInfo._st_Cache.put(findViewById, v7列表);
        return v7列表;
    }

    /* renamed from: v7列表 */
    public final v7列表 m241v7(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof RecyclerView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new v7列表(this.appInfo, (RecyclerView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (v7列表) obj2;
        }
        v7列表 v7列表 = new v7列表(this.appInfo, (RecyclerView) findViewById);
        this.appInfo._st_Cache.put(findViewById, v7列表);
        return v7列表;
    }

    /* renamed from: 下拉刷新控件 */
    public final 下拉刷新控件 m242() {
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(this.appInfo.c);
        swipeRefreshLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new xlsxkj(this.appInfo, swipeRefreshLayout);
    }

    /* renamed from: 下拉刷新控件 */
    public final 下拉刷新控件 m243(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof SwipeRefreshLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xlsxkj(this.appInfo, (SwipeRefreshLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (下拉刷新控件) obj2;
        }
        下拉刷新控件 xlsxkj = new xlsxkj(this.appInfo, (SwipeRefreshLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, xlsxkj);
        return xlsxkj;
    }

    /* renamed from: 下拉刷新控件 */
    public final 下拉刷新控件 m244(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof SwipeRefreshLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xlsxkj(this.appInfo, (SwipeRefreshLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (下拉刷新控件) obj2;
        }
        下拉刷新控件 xlsxkj = new xlsxkj(this.appInfo, (SwipeRefreshLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, xlsxkj);
        return xlsxkj;
    }

    /* renamed from: 下拉菜单 */
    public final 下拉菜单 m245() {
        Spinner spinner = new Spinner(this.appInfo.c);
        spinner.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 下拉菜单(this.appInfo, spinner);
    }

    /* renamed from: 下拉菜单 */
    public final 下拉菜单 m246(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof Spinner)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 下拉菜单(this.appInfo, (Spinner) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (下拉菜单) obj2;
        }
        下拉菜单 下拉菜单 = new 下拉菜单(this.appInfo, (Spinner) findViewById);
        this.appInfo._st_Cache.put(findViewById, 下拉菜单);
        return 下拉菜单;
    }

    /* renamed from: 下拉菜单 */
    public final 下拉菜单 m247(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof Spinner)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 下拉菜单(this.appInfo, (Spinner) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (下拉菜单) obj2;
        }
        下拉菜单 下拉菜单 = new 下拉菜单(this.appInfo, (Spinner) findViewById);
        this.appInfo._st_Cache.put(findViewById, 下拉菜单);
        return 下拉菜单;
    }

    /* renamed from: 侧滑窗体 */
    public final 侧滑窗体 m248() {
        DrawerLayout drawerLayout = new DrawerLayout(this.appInfo.c);
        drawerLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new 侧滑窗体(this.appInfo, drawerLayout);
    }

    /* renamed from: 侧滑窗体 */
    public final 侧滑窗体 m249(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof DrawerLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 侧滑窗体(this.appInfo, (DrawerLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (侧滑窗体) obj2;
        }
        侧滑窗体 侧滑窗体 = new 侧滑窗体(this.appInfo, (DrawerLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, 侧滑窗体);
        return 侧滑窗体;
    }

    /* renamed from: 侧滑窗体 */
    public final 侧滑窗体 m250(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof DrawerLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 侧滑窗体(this.appInfo, (DrawerLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (侧滑窗体) obj2;
        }
        侧滑窗体 侧滑窗体 = new 侧滑窗体(this.appInfo, (DrawerLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, 侧滑窗体);
        return 侧滑窗体;
    }

    /* renamed from: 列表 */
    public final 列表 m251() {
        ListView listView = new ListView(this.appInfo.c);
        listView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new lb(this.appInfo, listView);
    }

    /* renamed from: 列表 */
    public final 列表 m252(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof ListView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new lb(this.appInfo, (ListView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (列表) obj2;
        }
        列表 lbVar = new lb(this.appInfo, (ListView) findViewById);
        this.appInfo._st_Cache.put(findViewById, lbVar);
        return lbVar;
    }

    /* renamed from: 列表 */
    public final 列表 m253(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof ListView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new lb(this.appInfo, (ListView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (列表) obj2;
        }
        列表 lbVar = new lb(this.appInfo, (ListView) findViewById);
        this.appInfo._st_Cache.put(findViewById, lbVar);
        return lbVar;
    }

    /* renamed from: 动态图 */
    public final 动态图 m254() {
        GifImageView gifImageView = new GifImageView(this.appInfo.c);
        gifImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 动态图(this.appInfo, gifImageView);
    }

    /* renamed from: 动态图 */
    public final 动态图 m255(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof GifImageView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 动态图(this.appInfo, (GifImageView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (动态图) obj2;
        }
        动态图 动态图 = new 动态图(this.appInfo, (GifImageView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 动态图);
        return 动态图;
    }

    /* renamed from: 动态图 */
    public final 动态图 m256(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof GifImageView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 动态图(this.appInfo, (GifImageView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (动态图) obj2;
        }
        动态图 动态图 = new 动态图(this.appInfo, (GifImageView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 动态图);
        return 动态图;
    }

    /* renamed from: 协调布局 */
    public final 协调布局 m257() {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(this.appInfo.c);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 协调布局(this.appInfo, coordinatorLayout);
    }

    /* renamed from: 协调布局 */
    public final 协调布局 m258(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof CoordinatorLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 协调布局(this.appInfo, (CoordinatorLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (协调布局) obj2;
        }
        协调布局 协调布局 = new 协调布局(this.appInfo, (CoordinatorLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, 协调布局);
        return 协调布局;
    }

    /* renamed from: 协调布局 */
    public final 协调布局 m259(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof CoordinatorLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 协调布局(this.appInfo, (CoordinatorLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (协调布局) obj2;
        }
        协调布局 协调布局 = new 协调布局(this.appInfo, (CoordinatorLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, 协调布局);
        return 协调布局;
    }

    /* renamed from: 单选布局 */
    public final 单选布局 m260() {
        RadioGroup radioGroup = new RadioGroup(this.appInfo.c);
        radioGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new dxbj(this.appInfo, radioGroup);
    }

    /* renamed from: 单选布局 */
    public final 单选布局 m261(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof RadioGroup)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new dxbj(this.appInfo, (RadioGroup) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (单选布局) obj2;
        }
        单选布局 dxbj = new dxbj(this.appInfo, (RadioGroup) findViewById);
        this.appInfo._st_Cache.put(findViewById, dxbj);
        return dxbj;
    }

    /* renamed from: 单选布局 */
    public final 单选布局 m262(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof RadioGroup)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new dxbj(this.appInfo, (RadioGroup) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (单选布局) obj2;
        }
        单选布局 dxbj = new dxbj(this.appInfo, (RadioGroup) findViewById);
        this.appInfo._st_Cache.put(findViewById, dxbj);
        return dxbj;
    }

    /* renamed from: 单选项 */
    public final 单选项 m263() {
        RadioButton radioButton = new RadioButton(this.appInfo.c);
        radioButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 单选项(this.appInfo, radioButton);
    }

    /* renamed from: 单选项 */
    public final 单选项 m264(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof RadioButton)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 单选项(this.appInfo, (RadioButton) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (单选项) obj2;
        }
        单选项 单选项 = new 单选项(this.appInfo, (RadioButton) findViewById);
        this.appInfo._st_Cache.put(findViewById, 单选项);
        return 单选项;
    }

    /* renamed from: 单选项 */
    public final 单选项 m265(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof RadioButton)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 单选项(this.appInfo, (RadioButton) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (单选项) obj2;
        }
        单选项 单选项 = new 单选项(this.appInfo, (RadioButton) findViewById);
        this.appInfo._st_Cache.put(findViewById, 单选项);
        return 单选项;
    }

    /* renamed from: 卡片 */
    public final 卡片 m266() {
        CardView cardView = new CardView(this.appInfo.c);
        cardView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 卡片(this.appInfo, cardView);
    }

    /* renamed from: 卡片 */
    public final 卡片 m267(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof CardView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 卡片(this.appInfo, (CardView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (卡片) obj2;
        }
        卡片 卡片 = new 卡片(this.appInfo, (CardView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 卡片);
        return 卡片;
    }

    /* renamed from: 卡片 */
    public final 卡片 m268(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof CardView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 卡片(this.appInfo, (CardView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (卡片) obj2;
        }
        卡片 卡片 = new 卡片(this.appInfo, (CardView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 卡片);
        return 卡片;
    }

    /* renamed from: 图像 */
    public final 图像 m269() {
        ImageView imageView = new ImageView(this.appInfo.c);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 图像(this.appInfo, imageView);
    }

    /* renamed from: 图像 */
    public final 图像 m270(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof ImageView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 图像(this.appInfo, (ImageView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (图像) obj2;
        }
        图像 图像 = new 图像(this.appInfo, (ImageView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 图像);
        return 图像;
    }

    /* renamed from: 图像 */
    public final 图像 m271(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof ImageView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 图像(this.appInfo, (ImageView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (图像) obj2;
        }
        图像 图像 = new 图像(this.appInfo, (ImageView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 图像);
        return 图像;
    }

    /* renamed from: 图像按钮 */
    public final 图像按钮 m272() {
        ImageButton imageButton = new ImageButton(this.appInfo.c);
        imageButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new txan(this.appInfo, imageButton);
    }

    /* renamed from: 图像按钮 */
    public final 图像按钮 m273(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof ImageButton)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new txan(this.appInfo, (ImageButton) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (图像按钮) obj2;
        }
        图像按钮 txan = new txan(this.appInfo, (ImageButton) findViewById);
        this.appInfo._st_Cache.put(findViewById, txan);
        return txan;
    }

    /* renamed from: 图像按钮 */
    public final 图像按钮 m274(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof ImageButton)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new txan(this.appInfo, (ImageButton) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (图像按钮) obj2;
        }
        图像按钮 txan = new txan(this.appInfo, (ImageButton) findViewById);
        this.appInfo._st_Cache.put(findViewById, txan);
        return txan;
    }

    /* renamed from: 垂直滑动窗体 */
    public final 垂直滑动窗体 m275() {
        VerticalViewPager verticalViewPager = new VerticalViewPager(this.appInfo.c);
        verticalViewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new czhdct(this.appInfo, verticalViewPager);
    }

    /* renamed from: 垂直滑动窗体 */
    public final 垂直滑动窗体 m276(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof VerticalViewPager)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new czhdct(this.appInfo, (VerticalViewPager) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (垂直滑动窗体) obj2;
        }
        垂直滑动窗体 czhdct = new czhdct(this.appInfo, (VerticalViewPager) findViewById);
        this.appInfo._st_Cache.put(findViewById, czhdct);
        return czhdct;
    }

    /* renamed from: 垂直滑动窗体 */
    public final 垂直滑动窗体 m277(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof VerticalViewPager)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new czhdct(this.appInfo, (VerticalViewPager) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (垂直滑动窗体) obj2;
        }
        垂直滑动窗体 czhdct = new czhdct(this.appInfo, (VerticalViewPager) findViewById);
        this.appInfo._st_Cache.put(findViewById, czhdct);
        return czhdct;
    }

    /* renamed from: 多选 */
    public final 多选 m278() {
        CheckBox checkBox = new CheckBox(this.appInfo.c);
        checkBox.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 多选(this.appInfo, checkBox);
    }

    /* renamed from: 多选 */
    public final 多选 m279(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof CheckBox)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 多选(this.appInfo, (CheckBox) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (多选) obj2;
        }
        多选 多选 = new 多选(this.appInfo, (CheckBox) findViewById);
        this.appInfo._st_Cache.put(findViewById, 多选);
        return 多选;
    }

    /* renamed from: 多选 */
    public final 多选 m280(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof CheckBox)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 多选(this.appInfo, (CheckBox) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (多选) obj2;
        }
        多选 多选 = new 多选(this.appInfo, (CheckBox) findViewById);
        this.appInfo._st_Cache.put(findViewById, 多选);
        return 多选;
    }

    /* renamed from: 嵌套滚动 */
    public final 嵌套滚动 m281() {
        NestedScrollView nestedScrollView = new NestedScrollView(this.appInfo.c);
        nestedScrollView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 嵌套滚动(this.appInfo, nestedScrollView);
    }

    /* renamed from: 嵌套滚动 */
    public final 嵌套滚动 m282(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof NestedScrollView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 嵌套滚动(this.appInfo, (NestedScrollView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (嵌套滚动) obj2;
        }
        嵌套滚动 嵌套滚动 = new 嵌套滚动(this.appInfo, (NestedScrollView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 嵌套滚动);
        return 嵌套滚动;
    }

    /* renamed from: 嵌套滚动 */
    public final 嵌套滚动 m283(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof NestedScrollView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 嵌套滚动(this.appInfo, (NestedScrollView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (嵌套滚动) obj2;
        }
        嵌套滚动 嵌套滚动 = new 嵌套滚动(this.appInfo, (NestedScrollView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 嵌套滚动);
        return 嵌套滚动;
    }

    /* renamed from: 工具栏布局 */
    public final 工具栏布局 m284() {
        Toolbar toolbar = new Toolbar(this.appInfo.c);
        toolbar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new gjlbj(this.appInfo, toolbar);
    }

    /* renamed from: 工具栏布局 */
    public final 工具栏布局 m285(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof Toolbar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new gjlbj(this.appInfo, (Toolbar) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (工具栏布局) obj2;
        }
        工具栏布局 gjlbj = new gjlbj(this.appInfo, (Toolbar) findViewById);
        this.appInfo._st_Cache.put(findViewById, gjlbj);
        return gjlbj;
    }

    /* renamed from: 工具栏布局 */
    public final 工具栏布局 m286(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof Toolbar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new gjlbj(this.appInfo, (Toolbar) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (工具栏布局) obj2;
        }
        工具栏布局 gjlbj = new gjlbj(this.appInfo, (Toolbar) findViewById);
        this.appInfo._st_Cache.put(findViewById, gjlbj);
        return gjlbj;
    }

    /* renamed from: 帧布局 */
    public final 帧布局 m287() {
        FrameLayout frameLayout = new FrameLayout(this.appInfo.c);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new zbj(this.appInfo, frameLayout);
    }

    /* renamed from: 帧布局 */
    public final 帧布局 m288(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof FrameLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new zbj(this.appInfo, (FrameLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (帧布局) obj2;
        }
        帧布局 zbj = new zbj(this.appInfo, (FrameLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, zbj);
        return zbj;
    }

    /* renamed from: 帧布局 */
    public final 帧布局 m289(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof FrameLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new zbj(this.appInfo, (FrameLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (帧布局) obj2;
        }
        帧布局 zbj = new zbj(this.appInfo, (FrameLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, zbj);
        return zbj;
    }

    /* renamed from: 应用栏布局 */
    public final 应用栏布局 m290() {
        AppBarLayout appBarLayout = new AppBarLayout(this.appInfo.c);
        appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new 应用栏布局(this.appInfo, appBarLayout);
    }

    /* renamed from: 应用栏布局 */
    public final 应用栏布局 m291(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof AppBarLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 应用栏布局(this.appInfo, (AppBarLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (应用栏布局) obj2;
        }
        应用栏布局 应用栏布局 = new 应用栏布局(this.appInfo, (AppBarLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, 应用栏布局);
        return 应用栏布局;
    }

    /* renamed from: 应用栏布局 */
    public final 应用栏布局 m292(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof AppBarLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 应用栏布局(this.appInfo, (AppBarLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (应用栏布局) obj2;
        }
        应用栏布局 应用栏布局 = new 应用栏布局(this.appInfo, (AppBarLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, 应用栏布局);
        return 应用栏布局;
    }

    /* renamed from: 开关 */
    public final 开关 m293() {
        SwitchCompat switchCompat = new SwitchCompat(this.appInfo.c);
        switchCompat.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new kg(this.appInfo, switchCompat);
    }

    /* renamed from: 开关 */
    public final 开关 m294(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof SwitchCompat)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new kg(this.appInfo, (SwitchCompat) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (开关) obj2;
        }
        开关 kgVar = new kg(this.appInfo, (SwitchCompat) findViewById);
        this.appInfo._st_Cache.put(findViewById, kgVar);
        return kgVar;
    }

    /* renamed from: 开关 */
    public final 开关 m295(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof SwitchCompat)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new kg(this.appInfo, (SwitchCompat) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (开关) obj2;
        }
        开关 kgVar = new kg(this.appInfo, (SwitchCompat) findViewById);
        this.appInfo._st_Cache.put(findViewById, kgVar);
        return kgVar;
    }

    /* renamed from: 弹出菜单 */
    public final PopupMenu m296(Object obj, OnMenuItemClickListener onMenuItemClickListener) {
        PopupMenu popupMenu = new PopupMenu(this.appInfo.c, m369(obj));
        popupMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        return popupMenu;
    }

    /* renamed from: 弹出菜单 */
    public final PopupMenu m297(Object obj, Object obj2, Object obj3, OnMenuItemClickListener onMenuItemClickListener) {
        PopupMenu popupMenu = new PopupMenu(this.appInfo.c, m369(obj2));
        popupMenu.getMenuInflater().inflate(s.d(obj3), popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(onMenuItemClickListener);
        if (obj.equals(Boolean.valueOf(true))) {
            popupMenu.show();
        }
        return popupMenu;
    }

    /* renamed from: 弹出菜单 */
    public final PopupMenu m298(Object obj, Object obj2, Object obj3, Object obj4, OnMenuItemClickListener onMenuItemClickListener) {
        if (obj3.getClass().isArray() && obj4.getClass().isArray()) {
            Class cls = obj3.getClass();
            if (int[].class.equals(cls) || Integer[].class.equals(cls)) {
                int length = Array.getLength(obj3);
                int length2 = Array.getLength(obj4);
                if (length > 0 && length == length2) {
                    PopupMenu popupMenu = new PopupMenu(this.appInfo.c, m369(obj2));
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

    /* renamed from: 弹窗 */
    public final AlertDialog m299(Object obj, Object obj2) {
        return m303(null, obj, obj2, null, null, null, null, null, null);
    }

    /* renamed from: 弹窗 */
    public final AlertDialog m300(Object obj, Object obj2, Object obj3) {
        return m303(obj, obj2, obj3, null, null, null, null, null, null);
    }

    /* renamed from: 弹窗 */
    public final AlertDialog m301(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m303(obj, obj2, obj3, obj4, null, null, obj5, null, null);
    }

    /* renamed from: 弹窗 */
    public final AlertDialog m302(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return m303(obj, obj2, obj3, obj4, obj5, null, obj6, obj7, null);
    }

    /* renamed from: 弹窗 */
    public final AlertDialog m303(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Builder builder = new Builder(this.appInfo.c);
        if (obj != null) {
            if (obj instanceof Drawable) {
                builder.setIcon((Drawable) obj);
            } else if (obj instanceof Integer) {
                builder.setIcon(s.d(obj));
            }
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

    /* renamed from: 弹窗提醒 */
    public final boolean m304(Object obj, Object obj2, Object obj3) {
        try {
            Snackbar.make(m369(obj), obj2.toString(), s.d(obj3)).show();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: 弹窗提醒 */
    public final boolean m305(Object obj, Object obj2, Object obj3, Object obj4, View.OnClickListener onClickListener) {
        try {
            Snackbar.make(m369(obj), obj2.toString(), s.d(obj3)).setAction(obj4.toString(), onClickListener).show();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: 弹窗提醒 */
    public final boolean m306(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, View.OnClickListener onClickListener) {
        try {
            Snackbar.make(m369(obj), obj2.toString(), s.d(obj3)).setAction(obj4.toString(), onClickListener).setActionTextColor(ClientsUDP.a(obj5)).show();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: 悬浮窗 */
    public final 悬浮窗 m307(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new 悬浮窗((WindowManager) this.appInfo.c.getSystemService("window"), m369(obj), s.d(obj2), s.d(obj3), s.d(obj4), s.d(obj5));
    }

    /* renamed from: 折叠工具栏布局 */
    public final 折叠工具栏布局 m308() {
        CollapsingToolbarLayout collapsingToolbarLayout = new CollapsingToolbarLayout(this.appInfo.c);
        collapsingToolbarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new zdgjlbj(this.appInfo, collapsingToolbarLayout);
    }

    /* renamed from: 折叠工具栏布局 */
    public final 折叠工具栏布局 m309(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof CollapsingToolbarLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new zdgjlbj(this.appInfo, (CollapsingToolbarLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (折叠工具栏布局) obj2;
        }
        折叠工具栏布局 zdgjlbj = new zdgjlbj(this.appInfo, (CollapsingToolbarLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, zdgjlbj);
        return zdgjlbj;
    }

    /* renamed from: 折叠工具栏布局 */
    public final 折叠工具栏布局 m310(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof CollapsingToolbarLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new zdgjlbj(this.appInfo, (CollapsingToolbarLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (折叠工具栏布局) obj2;
        }
        折叠工具栏布局 zdgjlbj = new zdgjlbj(this.appInfo, (CollapsingToolbarLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, zdgjlbj);
        return zdgjlbj;
    }

    /* renamed from: 拖动条 */
    public final 拖动条 m311() {
        SeekBar seekBar = new SeekBar(this.appInfo.c);
        seekBar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new tdt(this.appInfo, seekBar);
    }

    /* renamed from: 拖动条 */
    public final 拖动条 m312(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof SeekBar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new tdt(this.appInfo, (SeekBar) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (拖动条) obj2;
        }
        拖动条 tdt = new tdt(this.appInfo, (SeekBar) findViewById);
        this.appInfo._st_Cache.put(findViewById, tdt);
        return tdt;
    }

    /* renamed from: 拖动条 */
    public final 拖动条 m313(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof SeekBar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new tdt(this.appInfo, (SeekBar) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (拖动条) obj2;
        }
        拖动条 tdt = new tdt(this.appInfo, (SeekBar) findViewById);
        this.appInfo._st_Cache.put(findViewById, tdt);
        return tdt;
    }

    /* renamed from: 按钮 */
    public final 按钮 m314() {
        Button button = new Button(this.appInfo.c);
        button.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 按钮(this.appInfo, button);
    }

    /* renamed from: 按钮 */
    public final 按钮 m315(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof Button)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 按钮(this.appInfo, (Button) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (按钮) obj2;
        }
        按钮 按钮 = new 按钮(this.appInfo, (Button) findViewById);
        this.appInfo._st_Cache.put(findViewById, 按钮);
        return 按钮;
    }

    /* renamed from: 按钮 */
    public final 按钮 m316(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof Button)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 按钮(this.appInfo, (Button) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (按钮) obj2;
        }
        按钮 按钮 = new 按钮(this.appInfo, (Button) findViewById);
        this.appInfo._st_Cache.put(findViewById, 按钮);
        return 按钮;
    }

    /* renamed from: 文本 */
    public final 文本 m317() {
        TextView textView = new TextView(this.appInfo.c);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new wb(this.appInfo, textView);
    }

    /* renamed from: 文本 */
    public final 文本 m318(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof TextView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new wb(this.appInfo, (TextView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (文本) obj2;
        }
        文本 wbVar = new wb(this.appInfo, (TextView) findViewById);
        this.appInfo._st_Cache.put(findViewById, wbVar);
        return wbVar;
    }

    /* renamed from: 文本 */
    public final 文本 m319(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof TextView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new wb(this.appInfo, (TextView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (文本) obj2;
        }
        文本 wbVar = new wb(this.appInfo, (TextView) findViewById);
        this.appInfo._st_Cache.put(findViewById, wbVar);
        return wbVar;
    }

    /* renamed from: 文本输入布局 */
    public final 文本输入布局 m320() {
        TextInputLayout textInputLayout = new TextInputLayout(this.appInfo.c);
        textInputLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new wbsrbj(this.appInfo, textInputLayout);
    }

    /* renamed from: 文本输入布局 */
    public final 文本输入布局 m321(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof TextInputLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new wbsrbj(this.appInfo, (TextInputLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (文本输入布局) obj2;
        }
        文本输入布局 wbsrbj = new wbsrbj(this.appInfo, (TextInputLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, wbsrbj);
        return wbsrbj;
    }

    /* renamed from: 文本输入布局 */
    public final 文本输入布局 m322(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof TextInputLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new wbsrbj(this.appInfo, (TextInputLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (文本输入布局) obj2;
        }
        文本输入布局 wbsrbj = new wbsrbj(this.appInfo, (TextInputLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, wbsrbj);
        return wbsrbj;
    }

    /* renamed from: 日期选择器 */
    public final 日期选择器 m323() {
        DatePicker datePicker = new DatePicker(this.appInfo.c);
        datePicker.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 日期选择器(this.appInfo, datePicker);
    }

    /* renamed from: 日期选择器 */
    public final 日期选择器 m324(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof DatePicker)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 日期选择器(this.appInfo, (DatePicker) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (日期选择器) obj2;
        }
        日期选择器 日期选择器 = new 日期选择器(this.appInfo, (DatePicker) findViewById);
        this.appInfo._st_Cache.put(findViewById, 日期选择器);
        return 日期选择器;
    }

    /* renamed from: 日期选择器 */
    public final 日期选择器 m325(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof DatePicker)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 日期选择器(this.appInfo, (DatePicker) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (日期选择器) obj2;
        }
        日期选择器 日期选择器 = new 日期选择器(this.appInfo, (DatePicker) findViewById);
        this.appInfo._st_Cache.put(findViewById, 日期选择器);
        return 日期选择器;
    }

    /* renamed from: 时间选择器 */
    public final 时间选择器 m326() {
        TimePicker timePicker = new TimePicker(this.appInfo.c);
        timePicker.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new sjxzq(this.appInfo, timePicker);
    }

    /* renamed from: 时间选择器 */
    public final 时间选择器 m327(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof TimePicker)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new sjxzq(this.appInfo, (TimePicker) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (时间选择器) obj2;
        }
        时间选择器 sjxzq = new sjxzq(this.appInfo, (TimePicker) findViewById);
        this.appInfo._st_Cache.put(findViewById, sjxzq);
        return sjxzq;
    }

    /* renamed from: 时间选择器 */
    public final 时间选择器 m328(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof TimePicker)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new sjxzq(this.appInfo, (TimePicker) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (时间选择器) obj2;
        }
        时间选择器 sjxzq = new sjxzq(this.appInfo, (TimePicker) findViewById);
        this.appInfo._st_Cache.put(findViewById, sjxzq);
        return sjxzq;
    }

    /* renamed from: 标签布局 */
    public final 标签布局 m329() {
        TabLayout tabLayout = new TabLayout(this.appInfo.c);
        tabLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new bqbj(this.appInfo, tabLayout);
    }

    /* renamed from: 标签布局 */
    public final 标签布局 m330(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof TabLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new bqbj(this.appInfo, (TabLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (标签布局) obj2;
        }
        标签布局 bqbj = new bqbj(this.appInfo, (TabLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, bqbj);
        return bqbj;
    }

    /* renamed from: 标签布局 */
    public final 标签布局 m331(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof TabLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new bqbj(this.appInfo, (TabLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (标签布局) obj2;
        }
        标签布局 bqbj = new bqbj(this.appInfo, (TabLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, bqbj);
        return bqbj;
    }

    /* renamed from: 水平滚动 */
    public final 水平滚动 m332() {
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.appInfo.c);
        horizontalScrollView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 水平滚动(this.appInfo, horizontalScrollView);
    }

    /* renamed from: 水平滚动 */
    public final 水平滚动 m333(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof HorizontalScrollView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 水平滚动(this.appInfo, (HorizontalScrollView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (水平滚动) obj2;
        }
        水平滚动 水平滚动 = new 水平滚动(this.appInfo, (HorizontalScrollView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 水平滚动);
        return 水平滚动;
    }

    /* renamed from: 水平滚动 */
    public final 水平滚动 m334(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof HorizontalScrollView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 水平滚动(this.appInfo, (HorizontalScrollView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (水平滚动) obj2;
        }
        水平滚动 水平滚动 = new 水平滚动(this.appInfo, (HorizontalScrollView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 水平滚动);
        return 水平滚动;
    }

    /* renamed from: 浏览器 */
    public final 浏览器 m335() {
        WebView webView = new WebView(this.appInfo.c);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 浏览器(this.appInfo, webView);
    }

    /* renamed from: 浏览器 */
    public final 浏览器 m336(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof WebView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 浏览器(this.appInfo, (WebView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (浏览器) obj2;
        }
        浏览器 浏览器 = new 浏览器(this.appInfo, (WebView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 浏览器);
        return 浏览器;
    }

    /* renamed from: 浏览器 */
    public final 浏览器 m337(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof WebView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 浏览器(this.appInfo, (WebView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (浏览器) obj2;
        }
        浏览器 浏览器 = new 浏览器(this.appInfo, (WebView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 浏览器);
        return 浏览器;
    }

    /* renamed from: 浮动动作按钮 */
    public final 浮动动作按钮 m338() {
        FloatingActionButton floatingActionButton = new FloatingActionButton(this.appInfo.c);
        floatingActionButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 浮动动作按钮(this.appInfo, floatingActionButton);
    }

    /* renamed from: 浮动动作按钮 */
    public final 浮动动作按钮 m339(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof FloatingActionButton)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 浮动动作按钮(this.appInfo, (FloatingActionButton) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (浮动动作按钮) obj2;
        }
        浮动动作按钮 浮动动作按钮 = new 浮动动作按钮(this.appInfo, (FloatingActionButton) findViewById);
        this.appInfo._st_Cache.put(findViewById, 浮动动作按钮);
        return 浮动动作按钮;
    }

    /* renamed from: 浮动动作按钮 */
    public final 浮动动作按钮 m340(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof FloatingActionButton)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 浮动动作按钮(this.appInfo, (FloatingActionButton) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (浮动动作按钮) obj2;
        }
        浮动动作按钮 浮动动作按钮 = new 浮动动作按钮(this.appInfo, (FloatingActionButton) findViewById);
        this.appInfo._st_Cache.put(findViewById, 浮动动作按钮);
        return 浮动动作按钮;
    }

    /* renamed from: 清空缓存 */
    public final void m341() {
        if (this.appInfo._st_Cache != null) {
            this.appInfo._st_Cache.clear();
        }
    }

    /* renamed from: 滑动窗体 */
    public final 滑动窗体 m342() {
        ViewPager viewPager = new ViewPager(this.appInfo.c);
        viewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new 滑动窗体(this.appInfo, viewPager);
    }

    /* renamed from: 滑动窗体 */
    public final 滑动窗体 m343(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof ViewPager)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 滑动窗体(this.appInfo, (ViewPager) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (滑动窗体) obj2;
        }
        滑动窗体 滑动窗体 = new 滑动窗体(this.appInfo, (ViewPager) findViewById);
        this.appInfo._st_Cache.put(findViewById, 滑动窗体);
        return 滑动窗体;
    }

    /* renamed from: 滑动窗体 */
    public final 滑动窗体 m344(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof ViewPager)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 滑动窗体(this.appInfo, (ViewPager) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (滑动窗体) obj2;
        }
        滑动窗体 滑动窗体 = new 滑动窗体(this.appInfo, (ViewPager) findViewById);
        this.appInfo._st_Cache.put(findViewById, 滑动窗体);
        return 滑动窗体;
    }

    /* renamed from: 滚动 */
    public final 滚动 m345() {
        ScrollView scrollView = new ScrollView(this.appInfo.c);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new gd(this.appInfo, scrollView);
    }

    /* renamed from: 滚动 */
    public final 滚动 m346(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof ScrollView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new gd(this.appInfo, (ScrollView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (滚动) obj2;
        }
        滚动 gdVar = new gd(this.appInfo, (ScrollView) findViewById);
        this.appInfo._st_Cache.put(findViewById, gdVar);
        return gdVar;
    }

    /* renamed from: 滚动 */
    public final 滚动 m347(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof ScrollView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new gd(this.appInfo, (ScrollView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (滚动) obj2;
        }
        滚动 gdVar = new gd(this.appInfo, (ScrollView) findViewById);
        this.appInfo._st_Cache.put(findViewById, gdVar);
        return gdVar;
    }

    /* renamed from: 相对布局 */
    public final 相对布局 m348() {
        RelativeLayout relativeLayout = new RelativeLayout(this.appInfo.c);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new xdbj(this.appInfo, relativeLayout);
    }

    /* renamed from: 相对布局 */
    public final 相对布局 m349(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof RelativeLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xdbj(this.appInfo, (RelativeLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (相对布局) obj2;
        }
        相对布局 xdbj = new xdbj(this.appInfo, (RelativeLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, xdbj);
        return xdbj;
    }

    /* renamed from: 相对布局 */
    public final 相对布局 m350(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof RelativeLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xdbj(this.appInfo, (RelativeLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (相对布局) obj2;
        }
        相对布局 xdbj = new xdbj(this.appInfo, (RelativeLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, xdbj);
        return xdbj;
    }

    /* renamed from: 约束布局 */
    public final 约束布局 m351() {
        ConstraintLayout constraintLayout = new ConstraintLayout(this.appInfo.c);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new ysbj(this.appInfo, constraintLayout);
    }

    /* renamed from: 约束布局 */
    public final 约束布局 m352(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof ConstraintLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new ysbj(this.appInfo, (ConstraintLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (约束布局) obj2;
        }
        约束布局 ysbj = new ysbj(this.appInfo, (ConstraintLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, ysbj);
        return ysbj;
    }

    /* renamed from: 约束布局 */
    public final 约束布局 m353(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof ConstraintLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new ysbj(this.appInfo, (ConstraintLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (约束布局) obj2;
        }
        约束布局 ysbj = new ysbj(this.appInfo, (ConstraintLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, ysbj);
        return ysbj;
    }

    /* renamed from: 线性布局 */
    public final 线性布局 m354() {
        LinearLayout linearLayout = new LinearLayout(this.appInfo.c);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        return new xxbj(this.appInfo, linearLayout);
    }

    /* renamed from: 线性布局 */
    public final 线性布局 m355(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof LinearLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xxbj(this.appInfo, (LinearLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (线性布局) obj2;
        }
        线性布局 xxbj = new xxbj(this.appInfo, (LinearLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, xxbj);
        return xxbj;
    }

    /* renamed from: 线性布局 */
    public final 线性布局 m356(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof LinearLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new xxbj(this.appInfo, (LinearLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (线性布局) obj2;
        }
        线性布局 xxbj = new xxbj(this.appInfo, (LinearLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, xxbj);
        return xxbj;
    }

    /* renamed from: 编辑框 */
    public final 编辑框 m357() {
        EditText editText = new EditText(this.appInfo.c);
        editText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new bjk(this.appInfo, editText);
    }

    /* renamed from: 编辑框 */
    public final 编辑框 m358(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof EditText)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new bjk(this.appInfo, (EditText) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (编辑框) obj2;
        }
        编辑框 bjk = new bjk(this.appInfo, (EditText) findViewById);
        this.appInfo._st_Cache.put(findViewById, bjk);
        return bjk;
    }

    /* renamed from: 编辑框 */
    public final 编辑框 m359(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof EditText)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new bjk(this.appInfo, (EditText) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (编辑框) obj2;
        }
        编辑框 bjk = new bjk(this.appInfo, (EditText) findViewById);
        this.appInfo._st_Cache.put(findViewById, bjk);
        return bjk;
    }

    /* renamed from: 网格视图 */
    public final 网格视图 m360() {
        GridView gridView = new GridView(this.appInfo.c);
        gridView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new wgst(this.appInfo, gridView);
    }

    /* renamed from: 网格视图 */
    public final 网格视图 m361(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof GridView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new wgst(this.appInfo, (GridView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (网格视图) obj2;
        }
        网格视图 wgst = new wgst(this.appInfo, (GridView) findViewById);
        this.appInfo._st_Cache.put(findViewById, wgst);
        return wgst;
    }

    /* renamed from: 网格视图 */
    public final 网格视图 m362(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof GridView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new wgst(this.appInfo, (GridView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (网格视图) obj2;
        }
        网格视图 wgst = new wgst(this.appInfo, (GridView) findViewById);
        this.appInfo._st_Cache.put(findViewById, wgst);
        return wgst;
    }

    /* renamed from: 表格布局 */
    public final 表格布局 m363() {
        TableLayout tableLayout = new TableLayout(this.appInfo.c);
        tableLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new bgbj(this.appInfo, tableLayout);
    }

    /* renamed from: 表格布局 */
    public final 表格布局 m364(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof TableLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new bgbj(this.appInfo, (TableLayout) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (表格布局) obj2;
        }
        表格布局 bgbj = new bgbj(this.appInfo, (TableLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, bgbj);
        return bgbj;
    }

    /* renamed from: 表格布局 */
    public final 表格布局 m365(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof TableLayout)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new bgbj(this.appInfo, (TableLayout) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (表格布局) obj2;
        }
        表格布局 bgbj = new bgbj(this.appInfo, (TableLayout) findViewById);
        this.appInfo._st_Cache.put(findViewById, bgbj);
        return bgbj;
    }

    /* renamed from: 表格项 */
    public final 表格项 m366() {
        TableRow tableRow = new TableRow(this.appInfo.c);
        tableRow.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 表格项(this.appInfo, tableRow);
    }

    /* renamed from: 表格项 */
    public final 表格项 m367(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof TableRow)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 表格项(this.appInfo, (TableRow) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (表格项) obj2;
        }
        表格项 表格项 = new 表格项(this.appInfo, (TableRow) findViewById);
        this.appInfo._st_Cache.put(findViewById, 表格项);
        return 表格项;
    }

    /* renamed from: 表格项 */
    public final 表格项 m368(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof TableRow)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 表格项(this.appInfo, (TableRow) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (表格项) obj2;
        }
        表格项 表格项 = new 表格项(this.appInfo, (TableRow) findViewById);
        this.appInfo._st_Cache.put(findViewById, 表格项);
        return 表格项;
    }

    /* renamed from: 视图 */
    public final View m369(Object obj) {
        return findViewById(obj);
    }

    /* renamed from: 视图 */
    public final View m370(Object obj, Object obj2) {
        return findViewById(obj, obj2);
    }

    /* renamed from: 视频 */
    public final 视频 m371() {
        VideoView videoView = new VideoView(this.appInfo.c);
        videoView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 视频(this.appInfo, videoView);
    }

    /* renamed from: 视频 */
    public final 视频 m372(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof VideoView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 视频(this.appInfo, (VideoView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (视频) obj2;
        }
        视频 视频 = new 视频(this.appInfo, (VideoView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 视频);
        return 视频;
    }

    /* renamed from: 视频 */
    public final 视频 m373(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof VideoView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 视频(this.appInfo, (VideoView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (视频) obj2;
        }
        视频 视频 = new 视频(this.appInfo, (VideoView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 视频);
        return 视频;
    }

    /* renamed from: 设置缓存 */
    public final void m374(boolean z) {
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

    /* renamed from: 评分 */
    public final 评分 m375() {
        RatingBar ratingBar = new RatingBar(this.appInfo.c);
        ratingBar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new pf(this.appInfo, ratingBar);
    }

    /* renamed from: 评分 */
    public final void m376(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof RatingBar)) {
            return null;
        }
        if (this.appInfo._st_Cache != null) {
            Object obj2 = this.appInfo._st_Cache.get(findViewById);
            if (obj2 == null) {
                评分 pfVar = new pf(this.appInfo, (RatingBar) findViewById);
                this.appInfo._st_Cache.put(findViewById, pfVar);
            }
        }
    }

    /* renamed from: 评分 */
    public final 评分 m377(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof RatingBar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new pf(this.appInfo, (RatingBar) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (评分) obj2;
        }
        评分 pfVar = new pf(this.appInfo, (RatingBar) findViewById);
        this.appInfo._st_Cache.put(findViewById, pfVar);
        return pfVar;
    }

    /* renamed from: 进度条 */
    public final 进度条 m378() {
        ProgressBar progressBar = new ProgressBar(this.appInfo.c);
        progressBar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new jdt(this.appInfo, progressBar);
    }

    /* renamed from: 进度条 */
    public final 进度条 m379(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof ProgressBar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new jdt(this.appInfo, (ProgressBar) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (进度条) obj2;
        }
        进度条 jdt = new jdt(this.appInfo, (ProgressBar) findViewById);
        this.appInfo._st_Cache.put(findViewById, jdt);
        return jdt;
    }

    /* renamed from: 进度条 */
    public final 进度条 m380(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof ProgressBar)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new jdt(this.appInfo, (ProgressBar) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (进度条) obj2;
        }
        进度条 jdt = new jdt(this.appInfo, (ProgressBar) findViewById);
        this.appInfo._st_Cache.put(findViewById, jdt);
        return jdt;
    }

    /* renamed from: 面控件 */
    public final 面控件 m381() {
        SurfaceView surfaceView = new SurfaceView(this.appInfo.c);
        surfaceView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new 面控件(this.appInfo, surfaceView);
    }

    /* renamed from: 面控件 */
    public final 面控件 m382(Object obj) {
        View findViewById = findViewById(obj);
        if (!(findViewById instanceof SurfaceView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 面控件(this.appInfo, (SurfaceView) findViewById);
        }
        Object obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (面控件) obj2;
        }
        面控件 面控件 = new 面控件(this.appInfo, (SurfaceView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 面控件);
        return 面控件;
    }

    /* renamed from: 面控件 */
    public final 面控件 m383(Object obj, Object obj2) {
        View findViewById = findViewById(obj, obj2);
        if (!(findViewById instanceof SurfaceView)) {
            return null;
        }
        if (this.appInfo._st_Cache == null) {
            return new 面控件(this.appInfo, (SurfaceView) findViewById);
        }
        obj2 = this.appInfo._st_Cache.get(findViewById);
        if (obj2 != null) {
            return (面控件) obj2;
        }
        面控件 面控件 = new 面控件(this.appInfo, (SurfaceView) findViewById);
        this.appInfo._st_Cache.put(findViewById, 面控件);
        return 面控件;
    }
}