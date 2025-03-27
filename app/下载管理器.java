package i.app;

import android.content.Context;
import android.net.Uri;
import i.app.DownloadThreads.DownloadThread;
import i.runlibrary.a.d;
import i.runlibrary.a.s;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class 下载管理器 {
    private boolean a = true;
    /* renamed from: 下载配置 */
    public Configuration f2 = null;
    /* renamed from: 列表 */
    public ArrayList f3 = new ArrayList();

    public class Configuration {
        private OnDownloadThreadsListener b = null;
        private Context c = null;
        /* renamed from: 下载文件保存目录 */
        public String f4 = null;
        /* renamed from: 下载管理器 */
        public 下载管理器 f5 = null;
        /* renamed from: 临时文件保存目录 */
        public String f6 = null;
        /* renamed from: 临时文件格式 */
        public String f7 = ".temp";
        /* renamed from: 单任务开的线程个数 */
        public int f8 = 3;
        /* renamed from: 同时下载任务数量 */
        public int f9 = 3;
        /* renamed from: 当前同时下载任务数量 */
        public int f10 = 0;
        /* renamed from: 设置下载超时 */
        public int f11 = 20000;
        /* renamed from: 连接失败重试次数 */
        public int f12 = 3;
    }

    public interface OnDownloadThreadsListener {
        void resultStatus(int i, String str, Object obj, 下载线程 下载线程);
    }

    public class 下载线程 {
        private URL b = null;
        private long c = 0;
        private boolean d = true;
        private RandomAccessFile e = null;
        private FileChannel f = null;
        private ArrayList g = new ArrayList();
        private long h = 0;
        public String tempFileconfig = null;
        /* renamed from: 下载状态 */
        public int f13 = 0;
        /* renamed from: 下载百分比 */
        public int f14 = 0;
        /* renamed from: 下载管理器 */
        public 下载管理器 f15 = null;
        /* renamed from: 下载速度 */
        public int f16 = 0;
        /* renamed from: 下载配置 */
        public Configuration f17 = null;
        /* renamed from: 已下载 */
        public long f18 = 0;
        /* renamed from: 数据 */
        public Object f19 = null;
        /* renamed from: 文件名 */
        public String f20 = null;
        /* renamed from: 文件大小 */
        public long f21 = -1;
        /* renamed from: 文件路径 */
        public String f22 = null;
        /* renamed from: 是否停止下载 */
        public boolean f23 = true;
        /* renamed from: 标题 */
        public String f24 = null;
        /* renamed from: 目录 */
        public String f25 = null;
        /* renamed from: 线程上限 */
        public int f26 = 0;
        /* renamed from: 线程数量 */
        public int f27 = 0;
        /* renamed from: 编号 */
        public int f28 = 0;
        /* renamed from: 路劲md5 */
        public String f29md5 = null;
        /* renamed from: 链接 */
        public String f30 = null;

        public class DownThread {
            private int b;
            private long c;
            private long d;
            private long e;
            private long f;
            private long g = 0;

            public DownThread(int i, long j, long j2, long j3, long j4) {
                this.b = i;
                this.c = j;
                this.d = j2;
                this.e = j3;
                this.f = j4;
                this.g = j3 - j;
            }

            private synchronized void a() {
                下载线程 下载线程 = 下载线程.this;
                下载线程.f26--;
            }

            private synchronized void a(int i) {
                下载线程 下载线程 = 下载线程.this;
                下载线程.f27 += i;
            }

            private synchronized void b(int i) {
                long j = (long) i;
                this.g += j;
                this.e += j;
            }
        }

        public 下载线程(Configuration configuration, int i, String str, String str2, String str3, String str4, String str5, Object obj) {
            this.f17 = configuration;
            this.f28 = i;
            this.f29md5 = str4;
            this.f30 = str;
            this.b = new e(str);
            this.f22 = str2 + str3;
            this.f25 = str2;
            this.f20 = str3;
            this.f24 = str5;
            this.f19 = obj;
            this.f15 = configuration.f5;
            this.f23 = false;
        }

        private HttpURLConnection a(long j, long j2) {
            int i = 0;
            while (i < this.f17.f12) {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) this.b.openConnection();
                    if (!(j == -1 || j2 == -1)) {
                        httpURLConnection.setRequestProperty("Range", new e("bytes=").append(j).append("-").append(j2).toString());
                    }
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setConnectTimeout(this.f17.f11);
                    httpURLConnection.setRequestProperty("Referer", this.b.toString());
                    httpURLConnection.setRequestProperty("Accept-Language", "zh-CN");
                    httpURLConnection.setRequestProperty("Charset", "UTF-8");
                    httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                    if (((long) httpURLConnection.getContentLength()) != -1) {
                        return httpURLConnection;
                    }
                    i++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        private synchronized void a(int i) {
            this.f13 = i;
            this.f23 = true;
            Configuration configuration = this.f17;
            configuration.f10--;
        }

        private synchronized void a(boolean z) {
            long time = new Date().getTime();
            if (z || time >= this.h) {
                this.h = time + 1000;
                StringBuilder eVar = new e("<ys>");
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    DownThread downThread = (DownThread) it.next();
                    eVar.append("<Thread start=\"").append(downThread.c).append("\" end=\"").append(downThread.d).append("\" current=\"").append(downThread.e).append("\" size=\"").append(downThread.f).append("\"></Thread>");
                }
                eVar.append("</ys>");
                d.a(this.tempFileconfig, eVar.toString(), "utf-8");
            }
        }

        static /* synthetic */ long g(下载线程 下载线程) {
            Iterator it = 下载线程.g.iterator();
            long j = 1;
            while (it.hasNext()) {
                DownThread downThread = (DownThread) it.next();
                if (downThread.g > 0) {
                    j += downThread.g - 1;
                }
            }
            return j;
        }

        public synchronized void writeTempFilerw(long j, ByteBuffer byteBuffer) {
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                this.f.write(byteBuffer, j);
            }
            a(false);
        }

        /* renamed from: 停止 */
        public boolean m6() {
            if (this.f13 != 1) {
                return false;
            }
            this.f23 = true;
            return true;
        }

        /* renamed from: 开始 */
        public boolean m7() {
            int i = this.f13;
            if (!(i == 0 || i == 3)) {
                if (i != -1) {
                    return false;
                }
            }
            this.f13 = 0;
            this.f18 = 0;
            this.f23 = false;
            下载管理器.this.c();
            return true;
        }
    }

    public 下载管理器(Context context, String str, String str2, int i, int i2, int i3, int i4, OnDownloadThreadsListener onDownloadThreadsListener) {
        Configuration gVar = new g(this);
        this.f2 = gVar;
        gVar.f6 = str + File.separator;
        this.f2.f4 = str2 + File.separator;
        this.f2.f9 = i;
        this.f2.f8 = i2;
        this.f2.f12 = i3;
        this.f2.f11 = i4;
        this.f2.b = onDownloadThreadsListener;
        this.f2.c = context;
        this.f2.f5 = this;
        b();
    }

    public 下载管理器(Context context, String str, String str2, OnDownloadThreadsListener onDownloadThreadsListener) {
        Configuration gVar = new g(this);
        this.f2 = gVar;
        gVar.f6 = str + File.separator;
        this.f2.f4 = str2 + File.separator;
        this.f2.b = onDownloadThreadsListener;
        this.f2.c = context;
        this.f2.f5 = this;
        b();
    }

    private DownloadThread a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String valueOf;
        String obj6 = obj.toString();
        String obj7 = obj2.toString();
        String str = " ";
        if (obj6.contains(str)) {
            obj6 = obj6.replace(str, "%20");
        }
        if (obj6.getBytes().length != obj6.length()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : obj6.toCharArray()) {
                valueOf = String.valueOf(c);
                if (valueOf.getBytes().length == 1) {
                    stringBuilder.append(c);
                } else {
                    stringBuilder.append(Uri.encode(valueOf));
                }
            }
            obj6 = stringBuilder.toString();
        }
        String str2 = obj6;
        obj6 = obj7.replace('\\', '/');
        if (!obj6.endsWith("/")) {
            obj6 = obj6 + File.separator;
        }
        valueOf = obj6;
        d.a(valueOf, true);
        Object obj8 = null;
        try {
            obj8 = new 下载线程(this.f2, 0, str2, valueOf, obj3.toString(), s.f(str2.toLowerCase()), obj4.toString(), obj5);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (obj8 != null) {
            this.f3.add(obj8);
            obj8.f28 = this.f3.size() - 1;
            c();
        }
        return obj8;
    }

    static /* synthetic */ void a() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void b() {
        d.a(this.f2.f6, true);
        d.a(this.f2.f4, true);
        this.a = false;
    }

    private void c() {
        if (!this.a) {
            this.a = true;
            g gVar = new g(this);
            gVar.setName(new e("CeShi_").append(gVar.getId()).toString());
            gVar.start();
        }
    }

    /* renamed from: 加 */
    public 下载线程 m0(Object obj, Object obj2) {
        return a(obj, this.f2.f4, obj2, obj2, null);
    }

    /* renamed from: 加 */
    public 下载线程 m1(Object obj, Object obj2, Object obj3) {
        return a(obj, this.f2.f4, obj2, obj2, obj3);
    }

    /* renamed from: 加 */
    public void m2(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5 = obj;
    }

    /* renamed from: 加 */
    public 下载线程 m3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return a(obj, d.f(this.f2.c, obj2.toString()), obj3, obj4, obj5);
    }

    /* renamed from: 开始 */
    public void m4() {
        c();
    }

    /* renamed from: 获取下载 */
    public 下载线程 m5(Object obj) {
        Iterator it = this.f3.iterator();
        while (it.hasNext()) {
            下载线程 下载线程 = (下载线程) it.next();
            if (下载线程.f30.equals(obj)) {
                return 下载线程;
            }
        }
        return null;
    }
}