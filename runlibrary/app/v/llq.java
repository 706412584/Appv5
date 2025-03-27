package i.runlibrary.app.v;

import android.os.Build.VERSION;
import android.view.View;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import i.app.FileProvider;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.interfaces.onWebChromeClient;
import i.runlibrary.app.interfaces.onWebViewClient;

public final class llq extends vg {
    private boolean b;
    public ViewEvent sj;
    public WebView st;
    public onWebChromeClient wcct;

    public class ViewEvent extends i.runlibrary.app.ViewEvent {
        private View b = null;

        public ViewEvent(View view) {
            super(view);
            this.b = view;
        }
    }

    public llq() {
        this.st = null;
        this.sj = null;
        this.b = false;
        this.sj = new ViewEvent(null);
    }

    public llq(AppInfo appInfo, WebView webView) {
        super(appInfo, webView);
        this.st = null;
        this.sj = null;
        this.b = false;
        this.st = webView;
        this.sj = new ViewEvent(this.v);
    }

    public final String bt() {
        WebView webView = this.st;
        return webView == null ? null : webView.getTitle();
    }

    public final void csh() {
        if (!this.b) {
            if (this.st != null) {
                this.b = true;
                if (VERSION.SDK_INT >= 21) {
                    this.st.getSettings().setMixedContentMode(0);
                }
                this.st.getSettings().setAllowFileAccess(true);
                this.st.getSettings().setJavaScriptEnabled(true);
                this.st.getSettings().setAppCacheEnabled(true);
                this.st.getSettings().setAppCachePath(this.a.c.getApplicationContext().getDir("cache", 0).getPath());
                this.st.getSettings().setAppCacheMaxSize(8388608);
                this.st.getSettings().setDatabaseEnabled(true);
                this.st.getSettings().setDatabasePath(this.a.c.getApplicationContext().getDir("database", 0).getPath());
                this.st.getSettings().setDomStorageEnabled(true);
                this.st.getSettings().setGeolocationEnabled(true);
                this.st.getSettings().setLightTouchEnabled(true);
                this.st.getSettings().setCacheMode(-1);
                this.st.getSettings().setPluginState(PluginState.ON);
                this.st.getSettings().setSupportZoom(true);
                this.st.getSettings().setBuiltInZoomControls(true);
                this.st.getSettings().setUseWideViewPort(true);
                this.st.getSettings().setLoadWithOverviewMode(true);
                if (VERSION.SDK_INT >= 16) {
                    this.st.getSettings().setAllowUniversalAccessFromFileURLs(true);
                    this.st.getSettings().setAllowFileAccessFromFileURLs(true);
                }
                this.st.setScrollBarStyle(0);
                this.st.removeJavascriptInterface("searchBoxJavaBridge_");
                this.st.removeJavascriptInterface("accessibility");
                this.st.removeJavascriptInterface("accessibilityTraversal");
                this.st.setWebViewClient(new onWebViewClient());
                WebView webView = this.st;
                onWebChromeClient onwebchromeclient = new onWebChromeClient(this.st);
                this.wcct = onwebchromeclient;
                webView.setWebChromeClient(onwebchromeclient);
            }
        }
    }

    public final boolean kht() {
        WebView webView = this.st;
        return webView == null ? false : webView.canGoBack();
    }

    public final boolean kqj() {
        WebView webView = this.st;
        return webView == null ? false : webView.canGoForward();
    }

    public final void kzqjht(Object obj) {
        WebView webView = this.st;
        if (webView != null) {
            webView.goBackOrForward(s.d(obj));
        }
    }

    public final String wz() {
        WebView webView = this.st;
        return webView == null ? null : webView.getUrl();
    }

    public final void zrwz(Object obj) {
        if (this.st != null) {
            String obj2 = obj.toString();
            if (obj2.startsWith("@") || obj2.startsWith("%") || obj2.startsWith("$") || obj2.startsWith("/")) {
                obj2 = new e("file://").append(FileProvider.a(this.a.c, obj2)).toString();
            }
            this.st.loadUrl(obj2);
        }
    }

    public final void zrwz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        WebView webView = this.st;
        if (webView != null) {
            webView.getSettings().setDefaultTextEncodingName(obj3.toString());
            this.st.loadDataWithBaseURL((String) obj, (String) obj2, (String) obj4, (String) obj3, (String) obj5);
        }
    }
}