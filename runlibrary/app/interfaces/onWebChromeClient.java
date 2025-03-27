package i.runlibrary.app.interfaces;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.app.AlertDialog.Builder;
import i.app.iActivity;

public class onWebChromeClient extends WebChromeClient {
    public static int RequestCode = 79825985;
    private WebView a;
    public CustomViewCallback customViewCallback;
    public FrameLayout fullscreenContainer;
    public int originalSystemUiVisibility;

    public onWebChromeClient(WebView webView) {
        this.a = webView;
    }

    public void onHideCustomView() {
        Context context = this.a.getContext();
        if (context instanceof iActivity) {
            ((iActivity) context).onHideCustomViewX();
        } else {
            onHideCustomViewX();
        }
    }

    public void onHideCustomViewX() {
        FrameLayout frameLayout = this.fullscreenContainer;
        if (frameLayout != null) {
            Context context = frameLayout.getContext();
            ((ViewGroup) this.fullscreenContainer.getParent()).removeView(this.fullscreenContainer);
            if (context instanceof Activity) {
                ((Activity) context).getWindow().getDecorView().setSystemUiVisibility(this.originalSystemUiVisibility);
            }
            this.fullscreenContainer.removeAllViews();
            this.fullscreenContainer = null;
            CustomViewCallback customViewCallback = this.customViewCallback;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
        }
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        new Builder(webView.getContext()).setTitle("提示").setMessage(str2).setPositiveButton(17039370, new b(this, jsResult)).setOnCancelListener(new a(this, jsResult)).create().show();
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        str2 = "取消";
        new Builder(webView.getContext()).setTitle("提示").setMessage(str2).setPositiveButton("确定", new e(this, jsResult)).setNegativeButton(str2, new d(this, jsResult)).setOnCancelListener(new c(this, jsResult)).create().show();
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        EditText editText = new EditText(webView.getContext());
        editText.setText(str3);
        Builder view = new Builder(webView.getContext()).setTitle(str2).setView(editText);
        h hVar = new h(this, jsPromptResult, editText);
        view.setPositiveButton("确定", hVar).setNegativeButton("取消", new f(this, jsPromptResult)).setOnCancelListener(new f(this, jsPromptResult)).create().show();
        return true;
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
    }

    public void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        Context context = this.a.getContext();
        if (context instanceof iActivity) {
            ((iActivity) context).onShowCustomViewX((Activity) context, view, customViewCallback);
            return;
        }
        if (context instanceof Activity) {
            onShowCustomViewX((Activity) context, view, customViewCallback);
        }
    }

    public void onShowCustomViewX(Activity activity, View view, CustomViewCallback customViewCallback) {
        if (this.fullscreenContainer != null) {
            customViewCallback.onCustomViewHidden();
            this.fullscreenContainer = null;
            return;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.fullscreenContainer = frameLayout;
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        this.fullscreenContainer.setBackgroundColor(-16777216);
        Window window = activity.getWindow();
        this.originalSystemUiVisibility = window.getDecorView().getSystemUiVisibility();
        window.addContentView(this.fullscreenContainer, new LayoutParams(-1, -1));
        window.getDecorView().setSystemUiVisibility(5894);
        this.fullscreenContainer.addView(view);
        this.customViewCallback = customViewCallback;
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, FileChooserParams fileChooserParams) {
        if (iActivity.mUploadMessage2 != null) {
            return true;
        }
        Context context = webView.getContext();
        if (context instanceof Activity) {
            iActivity.mUploadMessage2 = valueCallback;
            Intent eVar = new e("android.intent.action.GET_CONTENT");
            eVar.addCategory("android.intent.category.OPENABLE");
            eVar.setType("*/*");
            ((Activity) context).startActivityForResult(Intent.createChooser(eVar, "文件选择器"), RequestCode);
        }
        return true;
    }
}