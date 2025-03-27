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

public final class 浏览器 extends 视图组 {
    private boolean b;
    public onWebChromeClient wcct;
    /* renamed from: 事件 */
    public 视图事件 f171;
    /* renamed from: 视图 */
    public WebView f172;

    public class 视图事件 extends i.runlibrary.app.视图事件 {
        private View b = null;

        public 视图事件(View view) {
            super(view);
            this.b = view;
        }
    }

    public 浏览器() {
        this.f172 = null;
        this.f171 = null;
        this.b = false;
        this.f171 = new 视图事件(null);
    }

    public 浏览器(AppInfo appInfo, WebView webView) {
        super(appInfo, webView);
        this.f172 = null;
        this.f171 = null;
        this.b = false;
        this.f172 = webView;
        this.f171 = new 视图事件(webView);
    }

    /* renamed from: 初始化 */
    public final void m825() {
        if (!this.b) {
            if (this.f172 != null) {
                this.b = true;
                if (VERSION.SDK_INT >= 21) {
                    this.f172.getSettings().setMixedContentMode(0);
                }
                this.f172.getSettings().setAllowFileAccess(true);
                this.f172.getSettings().setJavaScriptEnabled(true);
                this.f172.getSettings().setAppCacheEnabled(true);
                this.f172.getSettings().setAppCachePath(this.a.c.getApplicationContext().getDir("cache", 0).getPath());
                this.f172.getSettings().setAppCacheMaxSize(8388608);
                this.f172.getSettings().setDatabaseEnabled(true);
                this.f172.getSettings().setDatabasePath(this.a.c.getApplicationContext().getDir("database", 0).getPath());
                this.f172.getSettings().setDomStorageEnabled(true);
                this.f172.getSettings().setGeolocationEnabled(true);
                this.f172.getSettings().setLightTouchEnabled(true);
                this.f172.getSettings().setCacheMode(-1);
                this.f172.getSettings().setPluginState(PluginState.ON);
                this.f172.getSettings().setSupportZoom(true);
                this.f172.getSettings().setBuiltInZoomControls(true);
                this.f172.getSettings().setUseWideViewPort(true);
                this.f172.getSettings().setLoadWithOverviewMode(true);
                if (VERSION.SDK_INT >= 16) {
                    this.f172.getSettings().setAllowUniversalAccessFromFileURLs(true);
                    this.f172.getSettings().setAllowFileAccessFromFileURLs(true);
                }
                this.f172.setScrollBarStyle(0);
                this.f172.removeJavascriptInterface("searchBoxJavaBridge_");
                this.f172.removeJavascriptInterface("accessibility");
                this.f172.removeJavascriptInterface("accessibilityTraversal");
                this.f172.setWebViewClient(new onWebViewClient());
                WebView webView = this.f172;
                onWebChromeClient onwebchromeclient = new onWebChromeClient(this.f172);
                this.wcct = onwebchromeclient;
                webView.setWebChromeClient(onwebchromeclient);
            }
        }
    }

    /* renamed from: 可前进 */
    public final boolean m826() {
        WebView webView = this.f172;
        return webView == null ? false : webView.canGoForward();
    }

    /* renamed from: 可后退 */
    public final boolean m827() {
        WebView webView = this.f172;
        return webView == null ? false : webView.canGoBack();
    }

    /* renamed from: 控制前进后退 */
    public final void m828(Object obj) {
        WebView webView = this.f172;
        if (webView != null) {
            webView.goBackOrForward(s.d(obj));
        }
    }

    /* renamed from: 标题 */
    public final String m829() {
        WebView webView = this.f172;
        return webView == null ? null : webView.getTitle();
    }

    /* renamed from: 网址 */
    public final String m830() {
        WebView webView = this.f172;
        return webView == null ? null : webView.getUrl();
    }

    /* renamed from: 载入网址 */
    public final void m831(Object obj) {
        if (this.f172 != null) {
            String obj2 = obj.toString();
            if (obj2.startsWith("@") || obj2.startsWith("%") || obj2.startsWith("$") || obj2.startsWith("/")) {
                obj2 = new e("file://").append(FileProvider.a(this.a.c, obj2)).toString();
            }
            this.f172.loadUrl(obj2);
        }
    }

    /* renamed from: 载入网址 */
    public final void m832(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        WebView webView = this.f172;
        if (webView != null) {
            webView.getSettings().setDefaultTextEncodingName(obj3.toString());
            this.f172.loadDataWithBaseURL((String) obj, (String) obj2, (String) obj4, (String) obj3, (String) obj5);
        }
    }
}