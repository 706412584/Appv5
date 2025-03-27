package i.app;

import android.content.Context;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import i.runlibrary.a.a;
import i.runlibrary.a.d;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public class Downcenter {
    private Context a;
    private String b;
    private String c;
    private int d = -1;
    private Executor e = null;
    private int f = 25000;
    private boolean g = false;
    private OnFileDownStatusListener h;
    public ArrayList lb = new ArrayList();

    public class DownThread extends AsyncTask {
        public String bt;
        public long dx = -1;
        public Object sj;
        public String wjlj;
        public String wz;
        public long yxz = 0;

        public DownThread(String str, String str2, String str3, Object obj) {
            this.bt = str;
            this.wz = str2;
            this.wjlj = str3;
            this.sj = obj;
        }

        /*  JADX ERROR: NullPointerException in pass: BlockSplitter
            java.lang.NullPointerException: Attempt to invoke virtual method 'boolean jadx.core.dex.attributes.AttrNode.contains(jadx.core.dex.attributes.AType)' on a null object reference
            	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.connectExceptionHandlers(Unknown Source:64)
            	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.setupConnections(Unknown Source:58)
            	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.splitBasicBlocks(Unknown Source:22)
            	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(Unknown Source:13)
            	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:9)
            	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:41)
            	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:51)
            	at jadx.core.ProcessClass.process(Unknown Source:54)
            	at jadx.api.JadxDecompiler.processClass(Unknown Source:4)
            	at jadx.api.JavaClass.decompile(Unknown Source:19)
            */
        private int a(java.lang.String r10, java.lang.String r11, boolean r12) {
            /*
            r9 = this;
            r0 = 0;
            i.runlibrary.a.d.a(r11, r0);
            r1 = new java.io.File;
            r1.<init>(r11);
            r11 = new java.io.File;
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = i.app.Downcenter.this;
            r3 = r3.b;
            r2 = r2.append(r3);
            r3 = "/";
            r2 = r2.append(r3);
            r3 = new java.util.Random;
            r3.<init>();
            r3 = r3.nextLong();
            r2 = r2.append(r3);
            r3 = ".xzz";
            r2 = r2.append(r3);
            r2 = r2.toString();
            r11.<init>(r2);
            r2 = 0;
            r3 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x0073, IOException -> 0x006d }
            r3.<init>(r10);	 Catch:{ MalformedURLException -> 0x0073, IOException -> 0x006d }
            r10 = r3.openConnection();	 Catch:{ MalformedURLException -> 0x0073, IOException -> 0x006d }
            r3 = r10 instanceof javax.net.ssl.HttpsURLConnection;	 Catch:{ MalformedURLException -> 0x006b, IOException -> 0x0069 }
            if (r3 == 0) goto L_0x004e;	 Catch:{ MalformedURLException -> 0x006b, IOException -> 0x0069 }
        L_0x0048:
            r3 = r10;	 Catch:{ MalformedURLException -> 0x006b, IOException -> 0x0069 }
            r3 = (javax.net.ssl.HttpsURLConnection) r3;	 Catch:{ MalformedURLException -> 0x006b, IOException -> 0x0069 }
            i.runlibrary.a.f.a(r3);	 Catch:{ MalformedURLException -> 0x006b, IOException -> 0x0069 }
        L_0x004e:
            r3 = r10.getContentLength();	 Catch:{ MalformedURLException -> 0x006b, IOException -> 0x0069 }
            r3 = (long) r3;	 Catch:{ MalformedURLException -> 0x006b, IOException -> 0x0069 }
            r9.dx = r3;	 Catch:{ MalformedURLException -> 0x006b, IOException -> 0x0069 }
            r3 = r1.exists();	 Catch:{ MalformedURLException -> 0x006b, IOException -> 0x0069 }
            if (r3 == 0) goto L_0x0078;	 Catch:{ MalformedURLException -> 0x006b, IOException -> 0x0069 }
        L_0x005b:
            if (r12 != 0) goto L_0x0078;	 Catch:{ MalformedURLException -> 0x006b, IOException -> 0x0069 }
        L_0x005d:
            r3 = r9.dx;	 Catch:{ MalformedURLException -> 0x006b, IOException -> 0x0069 }
            r5 = r1.length();	 Catch:{ MalformedURLException -> 0x006b, IOException -> 0x0069 }
            r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
            if (r12 != 0) goto L_0x0078;
        L_0x0067:
            r10 = 1;
            return r10;
            r12 = move-exception;
            goto L_0x006f;
            r12 = move-exception;
            goto L_0x0075;
            r12 = move-exception;
            r10 = r2;
        L_0x006f:
            r12.printStackTrace();
            goto L_0x0078;
            r12 = move-exception;
            r10 = r2;
        L_0x0075:
            r12.printStackTrace();
        L_0x0078:
            r12 = -1;
            if (r10 != 0) goto L_0x007c;
        L_0x007b:
            return r12;
        L_0x007c:
            r10 = r10.getInputStream();	 Catch:{ IOException -> 0x010a }
            r3 = r9.dx;	 Catch:{ IOException -> 0x010a }
            r5 = -1;	 Catch:{ IOException -> 0x010a }
            r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));	 Catch:{ IOException -> 0x010a }
            if (r7 != 0) goto L_0x008f;	 Catch:{ IOException -> 0x010a }
        L_0x0088:
            r3 = r10.available();	 Catch:{ IOException -> 0x010a }
            r3 = (long) r3;	 Catch:{ IOException -> 0x010a }
            r9.dx = r3;	 Catch:{ IOException -> 0x010a }
        L_0x008f:
            r11.createNewFile();	 Catch:{ IOException -> 0x0105 }
            r3 = 3072; // 0xc00 float:4.305E-42 double:1.518E-320;
            r3 = new byte[r3];	 Catch:{ IOException -> 0x00c4 }
            r4 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00c4 }
            r4.<init>(r11);	 Catch:{ IOException -> 0x00c4 }
        L_0x009b:
            r2 = r10.read(r3);	 Catch:{ IOException -> 0x00bf, all -> 0x00bc }
            if (r2 == r12) goto L_0x00ab;	 Catch:{ IOException -> 0x00bf, all -> 0x00bc }
        L_0x00a1:
            r4.write(r3, r0, r2);	 Catch:{ IOException -> 0x00bf, all -> 0x00bc }
            r5 = r9.yxz;	 Catch:{ IOException -> 0x00bf, all -> 0x00bc }
            r7 = (long) r2;	 Catch:{ IOException -> 0x00bf, all -> 0x00bc }
            r5 = r5 + r7;	 Catch:{ IOException -> 0x00bf, all -> 0x00bc }
            r9.yxz = r5;	 Catch:{ IOException -> 0x00bf, all -> 0x00bc }
            goto L_0x009b;
        L_0x00ab:
            r4.close();	 Catch:{ IOException -> 0x00af }
            goto L_0x00b3;
            r12 = move-exception;
            r12.printStackTrace();
        L_0x00b3:
            r10.close();	 Catch:{ IOException -> 0x00b7 }
            goto L_0x00e0;
            r10 = move-exception;
            r10.printStackTrace();
            goto L_0x00e0;
            r11 = move-exception;
            r2 = r4;
            goto L_0x00f4;
            r0 = move-exception;
            r2 = r4;
            goto L_0x00c5;
            r11 = move-exception;
            goto L_0x00f4;
            r0 = move-exception;
        L_0x00c5:
            r0.printStackTrace();	 Catch:{ all -> 0x00c2 }
            r11.delete();	 Catch:{ Exception -> 0x00cc }
            goto L_0x00cf;
        L_0x00cc:
            r0.printStackTrace();
        L_0x00cf:
            r2.close();	 Catch:{ IOException -> 0x00d3 }
            goto L_0x00d7;
            r0 = move-exception;
            r0.printStackTrace();
        L_0x00d7:
            r10.close();	 Catch:{ IOException -> 0x00db }
            goto L_0x00df;
            r10 = move-exception;
            r10.printStackTrace();
        L_0x00df:
            r0 = -1;
        L_0x00e0:
            if (r0 != 0) goto L_0x00f3;
        L_0x00e2:
            r10 = r1.exists();
            if (r10 == 0) goto L_0x00eb;
        L_0x00e8:
            r1.delete();
        L_0x00eb:
            r11.renameTo(r1);	 Catch:{ Exception -> 0x00ef }
            goto L_0x00f3;
            r10 = move-exception;
            r10.printStackTrace();
        L_0x00f3:
            return r0;
        L_0x00f4:
            r2.close();	 Catch:{ IOException -> 0x00f8 }
            goto L_0x00fc;
            r12 = move-exception;
            r12.printStackTrace();
        L_0x00fc:
            r10.close();	 Catch:{ IOException -> 0x0100 }
            goto L_0x0104;
            r10 = move-exception;
            r10.printStackTrace();
        L_0x0104:
            throw r11;
            r10 = move-exception;
            r10.printStackTrace();
            return r12;
            r10 = move-exception;
            r10.printStackTrace();
            return r12;
            */
            throw new UnsupportedOperationException("Method not decompiled: i.app.Downcenter.DownThread.a(java.lang.String, java.lang.String, boolean):int");
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return Integer.valueOf(a(this.wz, this.wjlj, Downcenter.this.g));
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            Downcenter.this.h.resultStatus(Downcenter.this.lb.indexOf(this), this, Downcenter.this);
        }

        public void onProgressUpdate(Integer... numArr) {
        }

        public int zt() {
            return getStatus() == Status.RUNNING ? 1 : getStatus() == Status.FINISHED ? 2 : 0;
        }
    }

    public interface OnFileDownStatusListener {
        void resultStatus(int i, DownThread downThread, Downcenter downcenter);
    }

    public Downcenter(Context context, Object obj, OnFileDownStatusListener onFileDownStatusListener) {
        this.a = context;
        this.e = AsyncTask.THREAD_POOL_EXECUTOR;
        this.h = onFileDownStatusListener;
        a(obj.toString(), obj.toString());
    }

    public Downcenter(Context context, Object obj, Object obj2, int i, int i2, boolean z, OnFileDownStatusListener onFileDownStatusListener) {
        Executor a;
        this.a = context;
        this.d = i;
        this.f = i2;
        this.g = z;
        this.h = onFileDownStatusListener;
        if (i > 1) {
            a = a.a();
        } else {
            if (i != 1) {
                a = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            a(obj.toString(), obj2.toString());
        }
        this.e = a;
        a(obj.toString(), obj2.toString());
    }

    public Downcenter(Context context, Object obj, Object obj2, OnFileDownStatusListener onFileDownStatusListener) {
        this.a = context;
        this.e = AsyncTask.THREAD_POOL_EXECUTOR;
        this.h = onFileDownStatusListener;
        a(obj.toString(), obj2.toString());
    }

    private void a(String str, String str2) {
        str = FileProvider.a(this.a, str).replace('\\', '/');
        String str3 = "/";
        if (!str.endsWith(str3)) {
            str = str + File.separator;
        }
        str2 = FileProvider.a(this.a, str2).replace('\\', '/');
        if (!str2.endsWith(str3)) {
            str2 = str2 + File.separator;
        }
        d.a(str, true);
        d.a(str2, true);
        this.b = str;
        this.c = str2;
    }

    private void a(String str, String str2, String str3, Object obj) {
        DownThread downThread = new DownThread(str3, str, FileProvider.a(this.a, str2), obj);
        Executor executor = this.e;
        if (executor != null) {
            downThread.executeOnExecutor(executor, new String[0]);
        } else {
            downThread.execute(new String[0]);
        }
        this.lb.add(downThread);
    }

    public void j(Object obj) {
        String obj2 = obj.toString();
        String substring = obj2.substring(obj2.lastIndexOf(47) + 1);
        a(obj2, this.c + substring, substring, null);
    }

    public void j(Object obj, Object obj2) {
        String obj3 = obj.toString();
        String substring = obj3.substring(obj3.lastIndexOf(47) + 1);
        a(obj3, this.c + substring, substring, obj2);
    }

    public void j(Object obj, Object obj2, Object obj3) {
        String obj4 = obj.toString();
        d a = FileProvider.a(this.a, obj2.toString());
        a(obj4, a, a.substring(a.lastIndexOf(47) + 1), obj3);
    }

    public void j(Object obj, Object obj2, Object obj3, Object obj4) {
        a(obj.toString(), obj2.toString(), obj3.toString(), obj4);
    }

    public void ml(Object obj, Object obj2) {
        a(obj2.toString(), obj2.toString());
    }
}