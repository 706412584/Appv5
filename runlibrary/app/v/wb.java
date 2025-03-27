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

public class wb extends VC {
    public ViewEvent sj;
    public TextView st;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private TextView a = null;

        public ViewEvent(TextView textView) {
            super(textView);
            this.a = textView;
        }

        public boolean bjkjt(OnEditorActionListener onEditorActionListener) {
            TextView textView = this.a;
            if (textView == null) {
                return false;
            }
            textView.setOnEditorActionListener(onEditorActionListener);
            return true;
        }

        public boolean wbgx(TextWatcher textWatcher) {
            TextView textView = this.a;
            if (textView == null) {
                return false;
            }
            textView.addTextChangedListener(textWatcher);
            return true;
        }
    }

    public wb() {
        this.st = null;
        this.sj = null;
        this.sj = new ViewEvent(null);
    }

    public wb(AppInfo appInfo, TextView textView) {
        super(appInfo, textView);
        this.st = null;
        this.sj = null;
        this.st = textView;
        this.sj = new ViewEvent(textView);
    }

    public void ccycfs(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            String obj2 = obj.toString();
            TruncateAt valueOf = obj2.equals("start") ? TruncateAt.START : obj2.equals("end") ? TruncateAt.END : obj2.equals("middle") ? TruncateAt.MIDDLE : obj2.equals("marquee") ? TruncateAt.MARQUEE : TruncateAt.valueOf(obj2);
            textView.setEllipsize(valueOf);
        }
    }

    public void dqfs(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setGravity(s.g(obj.toString()));
        }
    }

    public int dzaj() {
        TextView textView = this.st;
        return textView == null ? -1 : textView.getImeOptions();
    }

    public void dzaj(Object obj) {
        TextView textView = this.st;
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

    public void kbj(Object obj) {
        if (this.st != null) {
            if (obj.equals(Boolean.valueOf(true))) {
                this.st.setFilters(new InputFilter[]{new h(this)});
                return;
            }
            this.st.setFilters(new InputFilter[]{new i(this)});
        }
    }

    public void pmdcfcs(Object obj) {
        TextView textView = this.st;
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

    public boolean qbdx(Object obj) {
        TextView textView = this.st;
        if (textView == null) {
            return false;
        }
        textView.setAllCaps(obj.equals(Boolean.valueOf(true)));
        return true;
    }

    public void spgdt(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setHorizontallyScrolling(obj.equals(Boolean.valueOf(true)));
        }
    }

    public boolean szhjj(Object obj, Object obj2) {
        if (this.st == null || VERSION.SDK_INT < 16) {
            return false;
        }
        this.st.setLineSpacing(s.f(obj), s.f(obj2));
        return true;
    }

    public void szhs(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setLines(s.d(obj));
        }
    }

    public void szyy(Object obj, Object obj2, Object obj3, Object obj4) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setShadowLayer(s.f(obj), s.f(obj2), s.f(obj3), ClientsUDP.a(obj4));
        }
    }

    public void szzt(Object obj) {
        TextView textView = this.st;
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

    public void szzx(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            Typeface typeface = textView.getTypeface();
            String obj2 = obj.toString();
            int i = obj2.equals("bold") ? 1 : obj2.equals("italic") ? 2 : obj2.equals("bolditalic") ? 3 : 0;
            textView.setTypeface(typeface, i);
        }
    }

    public String tszf() {
        TextView textView = this.st;
        return textView == null ? null : textView.getHint().toString();
    }

    public void tszf(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setHint(obj.toString());
        }
    }

    public void tszfys(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setHintTextColor(ClientsUDP.a(obj));
        }
    }

    public void wblx(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setInputType(a.a(obj.toString()));
        }
    }

    public void xsgb(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setCursorVisible(obj.equals(Boolean.valueOf(true)));
        }
    }

    public void xstyh(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setSingleLine(obj.equals(Boolean.valueOf(true)));
        }
    }

    public void xswkdlj(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            String obj2 = obj.toString();
            int i = obj2.equals("web") ? 1 : obj2.equals("email") ? 2 : obj2.equals("phone") ? 4 : obj2.equals("map") ? 8 : obj2.equals("all") ? 15 : 0;
            textView.setAutoLinkMask(i);
        }
    }

    public void xzwb(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setTextIsSelectable(obj.equals(Boolean.valueOf(true)));
        }
    }

    public void xzxscd(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setFilters(new InputFilter[]{new DatagramSocket(s.d(obj))});
        }
    }

    public void xzzfds(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setHighlightColor(ClientsUDP.a(obj));
        }
    }

    public void yxdzf(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setKeyListener(MessageDigest.getInstance(obj.toString()));
        }
    }

    public void yxljkdj(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setLinksClickable(obj.equals(Boolean.valueOf(true)));
        }
    }

    public void zdhs(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setMaxLines(s.d(obj));
        }
    }

    public String zf() {
        TextView textView = this.st;
        return textView == null ? null : textView.getText().toString();
    }

    public boolean zf(Object obj) {
        TextView textView = this.st;
        if (textView == null) {
            return false;
        }
        textView.setText(String.valueOf(obj));
        return true;
    }

    public boolean zfhtml(Object obj) {
        TextView textView = this.st;
        if (textView == null) {
            return false;
        }
        textView.setText(Html.fromHtml(String.valueOf(obj)));
        return true;
    }

    public void zfjg(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setTextScaleX(s.f(obj));
        }
    }

    public void zfljys(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setLinkTextColor(ClientsUDP.a(obj));
        }
    }

    public void zfys(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setTextColor(ClientsUDP.a(obj));
        }
    }

    public void ztdx(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setTextSize(2, (float) s.d(obj));
        }
    }

    public void zxhs(Object obj) {
        TextView textView = this.st;
        if (textView != null) {
            textView.setMinLines(s.d(obj));
        }
    }
}