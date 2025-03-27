package i.runlibrary.app.v;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import i.app.ClientsUDP;
import i.app.FileProvider;
import i.runlibrary.a.a;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import java.net.DatagramSocket;
import java.security.MessageDigest;

public class 文本 extends 基础 {
    /* renamed from: 事件 */
    public 视图事件 f97;
    /* renamed from: 视图 */
    public TextView f98;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private TextView a = null;

        public 视图事件(TextView textView) {
            super(textView);
            this.a = textView;
        }

        /* renamed from: 文本更新 */
        public boolean m636(TextWatcher textWatcher) {
            TextView textView = this.a;
            if (textView == null) {
                return false;
            }
            textView.addTextChangedListener(textWatcher);
            return true;
        }

        /* renamed from: 编辑框监听 */
        public boolean m637(OnEditorActionListener onEditorActionListener) {
            TextView textView = this.a;
            if (textView == null) {
                return false;
            }
            textView.setOnEditorActionListener(onEditorActionListener);
            return true;
        }
    }

    public 文本() {
        this.f98 = null;
        this.f97 = null;
        this.f97 = new 视图事件(null);
    }

    public 文本(AppInfo appInfo, TextView textView) {
        super(appInfo, textView);
        this.f98 = null;
        this.f97 = null;
        this.f98 = textView;
        this.f97 = new 视图事件(textView);
    }

    /* renamed from: 允许的字符 */
    public void m603(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setKeyListener(MessageDigest.getInstance(obj.toString()));
        }
    }

    /* renamed from: 允许链接可点击 */
    public void m604(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setLinksClickable(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 全部大写 */
    public boolean m605(Object obj) {
        TextView textView = this.f98;
        if (textView == null) {
            return false;
        }
        textView.setAllCaps(obj.equals(Boolean.valueOf(true)));
        return true;
    }

    /* renamed from: 动作按键 */
    public int m606() {
        TextView textView = this.f98;
        return textView == null ? -1 : textView.getImeOptions();
    }

    /* renamed from: 动作按键 */
    public void m607(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            int i;
            if (!obj.equals("actionnone")) {
                if (obj.equals("actiongo")) {
                    i = 2;
                } else if (obj.equals("actionsearch")) {
                    i = 3;
                } else if (obj.equals("actionsend")) {
                    i = 4;
                } else if (obj.equals("actionnext")) {
                    i = 5;
                } else if (obj.equals("actiondone")) {
                    i = 6;
                } else if (obj instanceof Number) {
                    i = ((Number) obj).intValue();
                } else {
                    String obj2 = obj.toString();
                    if (obj2.matches("[0-9]+")) {
                        i = Integer.parseInt(obj2);
                    }
                }
                textView.setImeOptions(i);
            }
            i = 1;
            textView.setImeOptions(i);
        }
    }

    /* renamed from: 可编辑 */
    public void m608(Object obj) {
        if (this.f98 != null) {
            if (obj.equals(Boolean.valueOf(true))) {
                this.f98.setFilters(new InputFilter[]{new l(this)});
                return;
            }
            this.f98.setFilters(new InputFilter[]{new m(this)});
        }
    }

    /* renamed from: 字体大小 */
    public void m609(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setTextSize(2, (float) s.d(obj));
        }
    }

    /* renamed from: 字符 */
    public String m610() {
        TextView textView = this.f98;
        return textView == null ? null : textView.getText().toString();
    }

    /* renamed from: 字符 */
    public boolean m611(Object obj) {
        TextView textView = this.f98;
        if (textView == null) {
            return false;
        }
        textView.setText(String.valueOf(obj));
        return true;
    }

    /* renamed from: 字符html */
    public boolean m612html(Object obj) {
        TextView textView = this.f98;
        if (textView == null) {
            return false;
        }
        textView.setText(Html.fromHtml(String.valueOf(obj)));
        return true;
    }

    /* renamed from: 字符链接颜色 */
    public void m613(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setLinkTextColor(ClientsUDP.a(obj));
        }
    }

    /* renamed from: 字符间隔 */
    public void m614(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setTextScaleX(s.f(obj));
        }
    }

    /* renamed from: 字符颜色 */
    public void m615(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setTextColor(ClientsUDP.a(obj));
        }
    }

    /* renamed from: 对齐方式 */
    public void m385(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setGravity(s.g(obj.toString()));
        }
    }

    /* renamed from: 提示字符 */
    public String m616() {
        TextView textView = this.f98;
        return textView == null ? null : textView.getHint().toString();
    }

    /* renamed from: 提示字符 */
    public void m617(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setHint(obj.toString());
        }
    }

    /* renamed from: 提示字符颜色 */
    public void m618(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setHintTextColor(ClientsUDP.a(obj));
        }
    }

    /* renamed from: 文本类型 */
    public void m619(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setInputType(a.a(obj.toString()));
        }
    }

    /* renamed from: 显示为可点击链接 */
    public void m620(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            String obj2 = obj.toString();
            int i = obj2.equals("web") ? 1 : obj2.equals("email") ? 2 : obj2.equals("phone") ? 4 : obj2.equals("map") ? 8 : obj2.equals("all") ? 15 : 0;
            textView.setAutoLinkMask(i);
        }
    }

    /* renamed from: 显示光标 */
    public void m621(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setCursorVisible(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 显示同一行 */
    public void m622(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setSingleLine(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 最大行数 */
    public void m623(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setMaxLines(s.d(obj));
        }
    }

    /* renamed from: 最小行数 */
    public void m624(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setMinLines(s.d(obj));
        }
    }

    /* renamed from: 水平滚动条 */
    public void m625(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setHorizontallyScrolling(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 设置字体 */
    public void m626(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            Typeface typeface;
            String obj2 = obj.toString();
            if (!obj2.equals("normal")) {
                if (obj2.equals("sans")) {
                    typeface = Typeface.SANS_SERIF;
                } else if (obj2.equals("serif")) {
                    typeface = Typeface.SERIF;
                } else if (obj2.equals("monospace")) {
                    typeface = Typeface.MONOSPACE;
                } else if (obj2.startsWith("@")) {
                    typeface = Typeface.createFromAsset(this.a.c.getAssets(), FileProvider.a(this.a.c, obj2));
                } else if (obj2.startsWith("%") || obj2.startsWith("$") || obj2.startsWith("/")) {
                    typeface = Typeface.createFromFile(FileProvider.a(this.a.c, obj2));
                }
                textView.setTypeface(typeface);
            }
            typeface = null;
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: 设置字形 */
    public void m627(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            Typeface typeface = textView.getTypeface();
            String obj2 = obj.toString();
            int i = obj2.equals("bold") ? 1 : obj2.equals("italic") ? 2 : obj2.equals("bolditalic") ? 3 : 0;
            textView.setTypeface(typeface, i);
        }
    }

    /* renamed from: 设置行数 */
    public void m628(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setLines(s.d(obj));
        }
    }

    /* renamed from: 设置行间距 */
    public boolean m629(Object obj, Object obj2) {
        if (this.f98 == null || VERSION.SDK_INT < 16) {
            return false;
        }
        this.f98.setLineSpacing(s.f(obj), s.f(obj2));
        return true;
    }

    /* renamed from: 设置阴影 */
    public void m630(Object obj, Object obj2, Object obj3, Object obj4) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setShadowLayer(s.f(obj), s.f(obj2), s.f(obj3), ClientsUDP.a(obj4));
        }
    }

    /* renamed from: 超长隐藏方式 */
    public void m631(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            String obj2 = obj.toString();
            TruncateAt valueOf = obj2.equals("start") ? TruncateAt.START : obj2.equals("end") ? TruncateAt.END : obj2.equals("middle") ? TruncateAt.MIDDLE : obj2.equals("marquee") ? TruncateAt.MARQUEE : TruncateAt.valueOf(obj2);
            textView.setEllipsize(valueOf);
        }
    }

    /* renamed from: 跑马灯重复次数 */
    public void m632(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            int i;
            if (obj.equals("marquee_forever")) {
                i = -1;
            } else if (obj instanceof Number) {
                i = ((Number) obj).intValue();
            } else {
                String obj2 = obj.toString();
                i = obj2.matches("[0-9]+") ? Integer.parseInt(obj2) : 1;
            }
            textView.setMarqueeRepeatLimit(i);
        }
    }

    /* renamed from: 选中字符底色 */
    public void m633(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setHighlightColor(ClientsUDP.a(obj));
        }
    }

    /* renamed from: 选择文本 */
    public void m634(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setTextIsSelectable(obj.equals(Boolean.valueOf(true)));
        }
    }

    /* renamed from: 限制显示长度 */
    public void m635(Object obj) {
        TextView textView = this.f98;
        if (textView != null) {
            textView.setFilters(new InputFilter[]{new DatagramSocket(s.d(obj))});
        }
    }
}