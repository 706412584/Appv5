package i.app;

import i.runlibrary.app.AppInfo;
import i.runlibrary.app.gj;
import i.runlibrary.app.iapp;
import i.runlibrary.app.sj;
import i.runlibrary.app.st;
import i.runlibrary.app.wj;
import i.runlibrary.app.wl;
import i.runlibrary.app.xt;
import i.runlibrary.app.zf;
import i.runlibrary.app.字符;
import i.runlibrary.app.工具;
import i.runlibrary.app.数据;
import i.runlibrary.app.文件;
import i.runlibrary.app.系统;
import i.runlibrary.app.网络;
import i.runlibrary.app.视图;

public class iClass {
    public AppInfo _APPINFO = null;
    public gj gj;
    public final iapp iapp;
    public sj sj;
    public st st;
    public wj wj;
    public wl wl;
    public xt xt;
    public zf zf;
    /* renamed from: 字符 */
    public 字符 f66;
    /* renamed from: 工具 */
    public 工具 f67;
    /* renamed from: 数据 */
    public 数据 f68;
    /* renamed from: 文件 */
    public 文件 f69;
    /* renamed from: 系统 */
    public 系统 f70;
    /* renamed from: 网络 */
    public 网络 f71;
    /* renamed from: 视图 */
    public 视图 f72;

    public iClass(AppInfo appInfo) {
        iapp iapp = new iapp();
        this.iapp = iapp;
        this._APPINFO = appInfo;
        st iclass = new iClass(appInfo);
        iapp.st = iclass;
        this.st = iclass;
        sj iclass2 = new iClass(appInfo);
        iapp.sj = iclass2;
        this.sj = iclass2;
        wj iclass3 = new iClass(appInfo);
        iapp.wj = iclass3;
        this.wj = iclass3;
        gj iclass4 = new iClass(appInfo);
        iapp.gj = iclass4;
        this.gj = iclass4;
        wl iclass5 = new iClass(appInfo);
        iapp.wl = iclass5;
        this.wl = iclass5;
        zf iclass6 = new iClass(appInfo);
        iapp.zf = iclass6;
        this.zf = iclass6;
        xt iclass7 = new iClass(appInfo);
        iapp.xt = iclass7;
        this.xt = iclass7;
        视图 iclass8 = new iClass(appInfo);
        iapp.f47 = iclass8;
        this.f72 = iclass8;
        数据 iclass9 = new iClass(appInfo);
        iapp.f43 = iclass9;
        this.f68 = iclass9;
        文件 iclass10 = new iClass(appInfo);
        iapp.f44 = iclass10;
        this.f69 = iclass10;
        工具 iclass11 = new iClass(appInfo);
        iapp.f42 = iclass11;
        this.f67 = iclass11;
        网络 iclass12 = new iClass(appInfo);
        iapp.f46 = iclass12;
        this.f71 = iclass12;
        字符 iclass13 = new iClass(appInfo);
        iapp.f41 = iclass13;
        this.f66 = iclass13;
        系统 iclass14 = new iClass(appInfo);
        iapp.f45 = iclass14;
        this.f70 = iclass14;
    }
}