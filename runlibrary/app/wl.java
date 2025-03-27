package i.runlibrary.app;

import i.app.ClientsUDP;
import i.app.ClientsUDP.OnMessagesListener;
import i.app.Downcenter;
import i.app.Downcenter.OnFileDownStatusListener;
import i.app.DownloadThreads;
import i.app.DownloadThreads.OnDownloadThreadsListener;
import i.app.FileProvider;
import i.app.ServerSocket;
import i.runlibrary.a.a;
import i.runlibrary.a.f;
import i.runlibrary.a.o;
import i.runlibrary.a.s;
import i.runlibrary.app.gj.Animationx;
import java.lang.reflect.Array;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.HashMap;

public class wl {
    private AppInfo a = null;

    public interface OnWebListener {
        void web(web web, SelectionKey selectionKey, String str);
    }

    public class web extends o {
        public web(int i, String str, OnWebListener onWebListener) {
            super(i, str, onWebListener);
            if (onWebListener != null) {
                this.web = this;
            }
        }

        public void cw404(Object obj) {
            this.page404 = obj.toString();
        }

        public void cw500(Object obj) {
            this.page500 = obj.toString();
        }

        public void gb() {
            super.gb();
        }

        public void ks() {
            super.ks();
        }

        public ArrayList mime(Object obj, Object obj2) {
            this.MIME_list.add(String.format("%s:%s", new Object[]{obj, obj2}));
            return this.MIME_list;
        }

        public void mime(Object obj) {
            this.contentType = obj.toString();
        }

        public void mrym(Object obj) {
            this.defaultPage = obj.toString();
        }

        public boolean sc(SelectionKey selectionKey, Object obj) {
            return super.sc(selectionKey, Integer.valueOf(0), obj, null, null);
        }

        public boolean sc(SelectionKey selectionKey, Object obj, Object obj2, Object obj3, Object obj4) {
            return super.sc(selectionKey, obj, obj2, obj3, obj4);
        }
    }

    public wl(AppInfo appInfo) {
        this.a = appInfo;
    }

    private boolean a(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return false;
        }
        int length = Array.getLength(obj);
        if (length <= 0) {
            return new String[0];
        }
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = Array.get(obj, i).toString();
            int indexOf = strArr[i].indexOf(10);
            if (indexOf == -1) {
                strArr[i] = FileProvider.a(this.a.c, strArr[i]);
            } else {
                strArr[i] = strArr[i].substring(0, indexOf) + "\n" + FileProvider.a(this.a.c, strArr[i].substring(indexOf + 1));
            }
        }
        return strArr;
    }

    public void fw(Object obj) {
        FileProvider.a(this.a.c, String.valueOf(obj));
    }

    public HashMap hq(Object obj) {
        return a.a(String.valueOf(obj));
    }

    public Object hq(Object obj, Object obj2) {
        return f.a(String.valueOf(obj), null, (String) obj2);
    }

    public String hq(Object obj, Object obj2, Object obj3) {
        return f.a(String.valueOf(obj), s.b(obj2), (String) obj3);
    }

    public String hq(Object obj, Object obj2, Object obj3, Object obj4) {
        return f.a(String.valueOf(obj), s.b(obj2), (String) obj3, (String) obj4);
    }

    public String hq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return f.a(String.valueOf(obj), s.b(obj2), (String) obj3, (String) obj4, obj5.equals(Boolean.valueOf(true)));
    }

    public String hq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return f.a(String.valueOf(obj), s.b(obj2), (String) obj3, (String) obj4, obj5.equals(Boolean.valueOf(true)), (String) obj6, s.d(obj7), s.d(obj8), (String) obj9);
    }

    public String hqjson(Object obj, Object obj2, Object obj3) {
        return f.a(String.valueOf(obj), String.valueOf(obj2), (String) obj3);
    }

    public String hqjson(Object obj, Object obj2, Object obj3, Object obj4) {
        return f.a(String.valueOf(obj), String.valueOf(obj2), (String) obj3, (String) obj4);
    }

    public String hqjson(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return f.a(String.valueOf(obj), String.valueOf(obj2), (String) obj3, (String) obj4, obj5.equals(Boolean.valueOf(true)));
    }

    public String hqjson(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return f.a(String.valueOf(obj), String.valueOf(obj2), (String) obj3, (String) obj4, obj5.equals(Boolean.valueOf(true)), (String) obj6, s.d(obj7), s.d(obj8), (String) obj9);
    }

    public String scwj(Object obj, Object obj2, Object obj3, Object obj4) {
        return f.a(String.valueOf(obj), s.b(obj2), a(obj3), (String) obj4, null);
    }

    public String scwj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return f.a(String.valueOf(obj), s.b(obj2), a(obj3), (String) obj4, (String) obj5);
    }

    public ClientsUDP sjb(Object obj, OnMessagesListener onMessagesListener) {
        return new ClientsUDP(s.d(obj), onMessagesListener);
    }

    public ClientsUDP sjb(Object obj, Object obj2, Object obj3, OnMessagesListener onMessagesListener) {
        return new ClientsUDP(obj.toString(), s.d(obj2), s.d(obj3), onMessagesListener);
    }

    public ServerSocket tjz(Object obj, Object obj2, Object obj3, ServerSocket.OnMessagesListener onMessagesListener) {
        return new ServerSocket(this.a.c, obj.toString(), s.d(obj2), s.d(obj3), onMessagesListener);
    }

    public ServerSocket tjz(Object obj, Object obj2, Object obj3, Object obj4, ServerSocket.OnMessagesListener onMessagesListener) {
        return new ServerSocket(this.a.c, s.d(obj), s.d(obj2), s.d(obj3), obj4.equals(Boolean.valueOf(true)), onMessagesListener);
    }

    public web web(Object obj, Object obj2) {
        return new web(s.d(obj), FileProvider.a(this.a.c, obj2.toString()), null);
    }

    public web web(Object obj, Object obj2, OnWebListener onWebListener) {
        return new web(s.d(obj), FileProvider.a(this.a.c, obj2.toString()), onWebListener);
    }

    public Animationx xz(Object obj, Object obj2) {
        return f.a(String.valueOf(obj), FileProvider.a(this.a.c, String.valueOf(obj2)), false);
    }

    public int xz(Object obj, Object obj2, Object obj3) {
        return f.a(String.valueOf(obj), FileProvider.a(this.a.c, String.valueOf(obj2)), obj3.equals(Boolean.valueOf(true)));
    }

    public int xz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        String valueOf = String.valueOf(obj);
        d a = FileProvider.a(this.a.c, String.valueOf(obj2));
        Boolean valueOf2 = Boolean.valueOf(true);
        return f.a(valueOf, a, obj3.equals(valueOf2), s.b(obj4), (String) obj5, (String) obj6, obj7.equals(valueOf2), (String) obj8);
    }

    public Downcenter xzgl(Object obj, OnFileDownStatusListener onFileDownStatusListener) {
        return new Downcenter(this.a.c, obj, obj, onFileDownStatusListener);
    }

    public Downcenter xzgl(Object obj, Object obj2, OnFileDownStatusListener onFileDownStatusListener) {
        return new Downcenter(this.a.c, obj, obj2, onFileDownStatusListener);
    }

    public Downcenter xzgl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, OnFileDownStatusListener onFileDownStatusListener) {
        return new Downcenter(this.a.c, obj, obj2, s.d(obj3), s.d(obj4), obj5.equals(Boolean.valueOf(true)), onFileDownStatusListener);
    }

    public DownloadThreads xzglq(Object obj, Object obj2, OnDownloadThreadsListener onDownloadThreadsListener) {
        return new DownloadThreads(this.a.c, FileProvider.a(this.a.c, obj.toString()), FileProvider.a(this.a.c, obj2.toString()), onDownloadThreadsListener);
    }

    public DownloadThreads xzglq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, OnDownloadThreadsListener onDownloadThreadsListener) {
        return new DownloadThreads(this.a.c, FileProvider.a(this.a.c, obj.toString()), FileProvider.a(this.a.c, obj2.toString()), s.d(obj3), s.d(obj4), s.d(obj5), s.d(obj6), onDownloadThreadsListener);
    }
}