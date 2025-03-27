package i.runlibrary.app;

import i.app.ClientsUDP;
import i.app.FileProvider;
import i.app.下载管理;
import i.app.下载管理.OnFileDownStatusListener;
import i.app.下载管理器;
import i.app.下载管理器.OnDownloadThreadsListener;
import i.app.套接字;
import i.app.套接字.OnMessagesListener;
import i.app.数据报;
import i.runlibrary.a.o;
import i.runlibrary.a.s;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;

public class 网络 extends wl {
    private AppInfo a = null;

    public interface OnWebListener {
        void web(web web, SelectionKey selectionKey, String str);
    }

    public class web extends o {
        public web(int i, String str, OnWebListener onWebListener) {
            super(i, str, onWebListener);
            if (onWebListener != null) {
                this.f1web = this;
            }
        }

        public ArrayList mime(Object obj, Object obj2) {
            this.MIME_list.add(String.format("%s:%s", new Object[]{obj, obj2}));
            return this.MIME_list;
        }

        public void mime(Object obj) {
            this.contentType = obj.toString();
        }

        /* renamed from: 关闭 */
        public void m193() {
            super.gb();
        }

        /* renamed from: 开始 */
        public void m194() {
            super.ks();
        }

        /* renamed from: 输出 */
        public boolean m195(SelectionKey selectionKey, Object obj) {
            return super.sc(selectionKey, Integer.valueOf(0), obj, null, null);
        }

        /* renamed from: 输出 */
        public boolean m196(SelectionKey selectionKey, Object obj, Object obj2, Object obj3, Object obj4) {
            return super.sc(selectionKey, obj, obj2, obj3, obj4);
        }

        /* renamed from: 错误404 */
        public void m197404(Object obj) {
            this.page404 = obj.toString();
        }

        /* renamed from: 错误500 */
        public void m198500(Object obj) {
            this.page500 = obj.toString();
        }

        /* renamed from: 默认页面 */
        public void m199(Object obj) {
            this.defaultPage = obj.toString();
        }
    }

    public 网络(AppInfo appInfo) {
        super(appInfo);
        this.a = appInfo;
    }

    /* renamed from: web服务器 */
    public web m166web(Object obj, Object obj2) {
        return new web(s.d(obj), FileProvider.a(this.a.c, obj2.toString()), null);
    }

    /* renamed from: web服务器 */
    public web m167web(Object obj, Object obj2, OnWebListener onWebListener) {
        return new web(s.d(obj), FileProvider.a(this.a.c, obj2.toString()), onWebListener);
    }

    /* renamed from: 上传文件 */
    public String m168(Object obj, Object obj2, Object obj3, Object obj4) {
        return super.scwj(obj, obj2, obj3, obj4);
    }

    /* renamed from: 上传文件 */
    public String m169(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return super.scwj(obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: 下载 */
    public int m170(Object obj, Object obj2) {
        return super.xz(obj, obj2);
    }

    /* renamed from: 下载 */
    public int m171(Object obj, Object obj2, Object obj3) {
        return super.xz(obj, obj2, obj3);
    }

    /* renamed from: 下载 */
    public int m172(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return super.xz(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    /* renamed from: 下载管理 */
    public 下载管理 m173(Object obj, OnFileDownStatusListener onFileDownStatusListener) {
        return new 下载管理(this.a.c, obj, obj, onFileDownStatusListener);
    }

    /* renamed from: 下载管理 */
    public 下载管理 m174(Object obj, Object obj2, OnFileDownStatusListener onFileDownStatusListener) {
        return new 下载管理(this.a.c, obj, obj2, onFileDownStatusListener);
    }

    /* renamed from: 下载管理 */
    public 下载管理 m175(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, OnFileDownStatusListener onFileDownStatusListener) {
        return new 下载管理(this.a.c, obj, obj2, s.d(obj3), s.d(obj4), obj5.equals(Boolean.valueOf(true)), onFileDownStatusListener);
    }

    /* renamed from: 下载管理器 */
    public 下载管理器 m176(Object obj, Object obj2, OnDownloadThreadsListener onDownloadThreadsListener) {
        return new 下载管理器(this.a.c, FileProvider.a(this.a.c, obj.toString()), FileProvider.a(this.a.c, obj2.toString()), onDownloadThreadsListener);
    }

    /* renamed from: 下载管理器 */
    public 下载管理器 m177(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, OnDownloadThreadsListener onDownloadThreadsListener) {
        return new 下载管理器(this.a.c, FileProvider.a(this.a.c, obj.toString()), FileProvider.a(this.a.c, obj2.toString()), s.d(obj3), s.d(obj4), s.d(obj5), s.d(obj6), onDownloadThreadsListener);
    }

    /* renamed from: 套接字 */
    public 套接字 m178(Object obj, Object obj2, Object obj3, OnMessagesListener onMessagesListener) {
        return new 套接字(this.a.c, obj.toString(), s.d(obj2), s.d(obj3), onMessagesListener);
    }

    /* renamed from: 套接字 */
    public 套接字 m179(Object obj, Object obj2, Object obj3, Object obj4, OnMessagesListener onMessagesListener) {
        return new 套接字(this.a.c, s.d(obj), s.d(obj2), s.d(obj3), obj4.equals(Boolean.valueOf(true)), onMessagesListener);
    }

    /* renamed from: 数据报 */
    public 数据报 m180(Object obj, ClientsUDP.OnMessagesListener onMessagesListener) {
        return new 数据报(s.d(obj), onMessagesListener);
    }

    /* renamed from: 数据报 */
    public 数据报 m181(Object obj, Object obj2, Object obj3, ClientsUDP.OnMessagesListener onMessagesListener) {
        return new ClientsUDP(obj.toString(), s.d(obj2), s.d(obj3), onMessagesListener);
    }

    /* renamed from: 获取 */
    public String m182(Object obj) {
        return super.hq(obj);
    }

    /* renamed from: 获取 */
    public String m183(Object obj, Object obj2) {
        return super.hq(obj, obj2);
    }

    /* renamed from: 获取 */
    public String m184(Object obj, Object obj2, Object obj3) {
        return super.hq(obj, obj2, obj3);
    }

    /* renamed from: 获取 */
    public String m185(Object obj, Object obj2, Object obj3, Object obj4) {
        return super.hq(obj, obj2, obj3, obj4);
    }

    /* renamed from: 获取 */
    public String m186(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return super.hq(obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: 获取 */
    public String m187(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return super.hq(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    /* renamed from: 获取json */
    public String m188json(Object obj, Object obj2, Object obj3) {
        return super.hqjson(obj, obj2, obj3);
    }

    /* renamed from: 获取json */
    public String m189json(Object obj, Object obj2, Object obj3, Object obj4) {
        return super.hqjson(obj, obj2, obj3, obj4);
    }

    /* renamed from: 获取json */
    public String m190json(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return super.hqjson(obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: 获取json */
    public String m191json(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return super.hqjson(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    /* renamed from: 访问 */
    public void m192(Object obj) {
        super.fw(obj);
    }
}