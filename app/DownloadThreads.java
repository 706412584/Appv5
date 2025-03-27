package i.app;

import android.content.Context;
import android.net.Uri;
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

public class DownloadThreads {
    private boolean a = true;
    public Configuration downConfig = null;
    public ArrayList lb = new ArrayList();

    public class Configuration {
        public int ConnectTimeout = 20000;
        public int Failures = 3;
        public int Multipledownload = 3;
        public String SaveDirectory = null;
        public int Singletaskthreads = 3;
        private OnDownloadThreadsListener b = null;
        private Context c = null;
        public int newMultipledownload = 0;
        public String tempFileFormat = ".temp";
        public String tempFileSaveDirectory = null;
        public DownloadThreads xzglq = null;
    }

    public class DownloadThread {
        private URL b = null;
        public String bt = null;
        private long c = 0;
        private boolean d = true;
        public Configuration downConfig = null;
        private RandomAccessFile e = null;
        private FileChannel f = null;
        private ArrayList g = new ArrayList();
        private long h = 0;
        public int id = 0;
        public String lj = null;
        public String ljmd5 = null;
        public String ml = null;
        public boolean sftzxz = true;
        public Object sj = null;
        public String tempFileconfig = null;
        public long wjdx = -1;
        public String wjlj = null;
        public String wjm = null;
        public int xcsl = 0;
        public int xcsx = 0;
        public int xzbfb = 0;
        public DownloadThreads xzglq = null;
        public int xzsd = 0;
        public int xzzt = 0;
        public long yxz = 0;

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
                DownloadThread downloadThread = DownloadThread.this;
                downloadThread.xcsx--;
            }

            private synchronized void a(int i) {
                DownloadThread downloadThread = DownloadThread.this;
                downloadThread.xcsl += i;
            }

            private synchronized void b(int i) {
                long j = (long) i;
                this.g += j;
                this.e += j;
            }
        }

        public DownloadThread(Configuration configuration, int i, String str, String str2, String str3, String str4, String str5, Object obj) {
            this.downConfig = configuration;
            this.id = i;
            this.ljmd5 = str4;
            this.lj = str;
            this.b = new e(str);
            this.wjlj = str2 + str3;
            this.ml = str2;
            this.wjm = str3;
            this.bt = str5;
            this.sj = obj;
            this.xzglq = configuration.xzglq;
            this.sftzxz = false;
        }

        private HttpURLConnection a(long j, long j2) {
            int i = 0;
            while (i < this.downConfig.Failures) {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) this.b.openConnection();
                    if (!(j == -1 || j2 == -1)) {
                        httpURLConnection.setRequestProperty("Range", new e("bytes=").append(j).append("-").append(j2).toString());
                    }
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setConnectTimeout(this.downConfig.ConnectTimeout);
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
            this.xzzt = i;
            this.sftzxz = true;
            Configuration configuration = this.downConfig;
            configuration.newMultipledownload--;
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

        static /* synthetic */ long g(DownloadThread downloadThread) {
            Iterator it = downloadThread.g.iterator();
            long j = 1;
            while (it.hasNext()) {
                DownThread downThread = (DownThread) it.next();
                if (downThread.g > 0) {
                    j += downThread.g - 1;
                }
            }
            return j;
        }

        public boolean ks() {
            int i = this.xzzt;
            if (!(i == 0 || i == 3)) {
                if (i != -1) {
                    return false;
                }
            }
            this.xzzt = 0;
            this.yxz = 0;
            this.sftzxz = false;
            DownloadThreads.this.c();
            return true;
        }

        public boolean tz() {
            if (this.xzzt != 1) {
                return false;
            }
            this.sftzxz = true;
            return true;
        }

        public synchronized void writeTempFilerw(long j, ByteBuffer byteBuffer) {
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                this.f.write(byteBuffer, j);
            }
            a(false);
        }
    }

    public interface OnDownloadThreadsListener {
        void resultStatus(int i, String str, Object obj, DownloadThread downloadThread);
    }

    public DownloadThreads(Context context, String str, String str2, int i, int i2, int i3, int i4, OnDownloadThreadsListener onDownloadThreadsListener) {
        Configuration configuration = new Configuration();
        this.downConfig = configuration;
        configuration.tempFileSaveDirectory = str + File.separator;
        this.downConfig.SaveDirectory = str2 + File.separator;
        this.downConfig.Multipledownload = i;
        this.downConfig.Singletaskthreads = i2;
        this.downConfig.Failures = i3;
        this.downConfig.ConnectTimeout = i4;
        this.downConfig.b = onDownloadThreadsListener;
        this.downConfig.c = context;
        this.downConfig.xzglq = this;
        b();
    }

    public DownloadThreads(Context context, String str, String str2, OnDownloadThreadsListener onDownloadThreadsListener) {
        Configuration configuration = new Configuration();
        this.downConfig = configuration;
        configuration.tempFileSaveDirectory = str + File.separator;
        this.downConfig.SaveDirectory = str2 + File.separator;
        this.downConfig.b = onDownloadThreadsListener;
        this.downConfig.c = context;
        this.downConfig.xzglq = this;
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
            obj8 = new DownloadThread(this.downConfig, 0, str2, valueOf, obj3.toString(), s.f(str2.toLowerCase()), obj4.toString(), obj5);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (obj8 != null) {
            this.lb.add(obj8);
            obj8.id = this.lb.size() - 1;
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
        d.a(this.downConfig.tempFileSaveDirectory, true);
        d.a(this.downConfig.SaveDirectory, true);
        this.a = false;
    }

    private void c() {
        if (!this.a) {
            this.a = true;
            a configuration = new Configuration();
            configuration.setName(new e("CeShi_").append(configuration.getId()).toString());
            configuration.start();
        }
    }

    public DownloadThread hqxz(Object obj) {
        Iterator it = this.lb.iterator();
        while (it.hasNext()) {
            DownloadThread downloadThread = (DownloadThread) it.next();
            if (downloadThread.lj.equals(obj)) {
                return downloadThread;
            }
        }
        return null;
    }

    public DownloadThread j(Object obj, Object obj2) {
        return a(obj, this.downConfig.SaveDirectory, obj2, obj2, null);
    }

    public DownloadThread j(Object obj, Object obj2, Object obj3) {
        return a(obj, this.downConfig.SaveDirectory, obj2, obj2, obj3);
    }

    public DownloadThread j(Object obj, Object obj2, Object obj3, Object obj4) {
        return a(obj, this.downConfig.SaveDirectory, obj2, obj3, obj4);
    }

    public DownloadThread j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return a(obj, d.f(this.downConfig.c, obj2.toString()), obj3, obj4, obj5);
    }

    public void ks() {
        c();
    }
}