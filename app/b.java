package i.app;

import i.app.DownloadThreads.Configuration;
import i.app.DownloadThreads.DownloadThread;
import i.app.DownloadThreads.DownloadThread.DownThread;
import i.runlibrary.a.a;
import i.runlibrary.a.d;
import i.runlibrary.a.s;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;

final class b extends Thread {
    final /* synthetic */ DownloadThread a;

    b(DownloadThread downloadThread) {
        this.a = downloadThread;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        String str = "\"";
        HttpURLConnection a = this.a.a(-1, -1);
        if (a == null) {
            this.a.a(-1);
            this.a.downConfig.b.resultStatus(this.a.xzzt, this.a.wjlj, this.a.sj, this.a);
            return;
        }
        DownloadThread downloadThread;
        Object obj;
        DownloadThread downloadThread2;
        long j;
        DownloadThread downloadThread3;
        DownThread downThread;
        this.a.wjdx = (long) a.getContentLength();
        if (!"bytes".equals(a.getHeaderField("Accept-Ranges"))) {
            this.a.d = false;
            a = this.a.a(32, 64);
            if (a != null) {
                long[] a2 = a.a(a);
                if (a2 != null && a2[0] == 32 && a2[1] == 64 && a2[2] == this.a.wjdx) {
                    this.a.d = true;
                }
            }
        }
        File eVar = new e(this.a.wjlj);
        if (eVar.exists()) {
            if (eVar.length() == this.a.wjdx) {
                this.a.a(2);
                downloadThread = this.a;
                downloadThread.yxz = downloadThread.wjdx;
                this.a.downConfig.b.resultStatus(this.a.xzzt, this.a.wjlj, this.a.sj, this.a);
                return;
            }
            eVar.delete();
        }
        DownloadThread downloadThread4 = this.a;
        downloadThread4.xcsx = downloadThread4.downConfig.Singletaskthreads;
        downloadThread4 = this.a;
        downloadThread4.c = downloadThread4.wjdx / ((long) this.a.xcsx);
        File eVar2 = new e(this.a.downConfig.tempFileSaveDirectory + this.a.ljmd5 + this.a.downConfig.tempFileFormat);
        if (eVar2.exists()) {
            if (eVar2.length() == this.a.wjdx) {
                obj = 1;
                this.a.e = new RandomAccessFile(eVar2, "rw");
                downloadThread2 = this.a;
                downloadThread2.f = downloadThread2.e.getChannel();
                this.a.g.clear();
                this.a.tempFileconfig = this.a.downConfig.tempFileSaveDirectory + this.a.ljmd5 + this.a.downConfig.tempFileFormat + ".config";
                if (this.a.d || this.a.wjdx <= 2097152) {
                    j = this.a.wjdx - 1;
                    downloadThread3 = this.a;
                    downThread = new DownThread(downloadThread3.g.size() + 1, 0, j, 0, j);
                    this.a.g.add(downThread);
                    this.a.a(true);
                    DownThread.a(downThread);
                } else {
                    long parseLong;
                    if (obj != null) {
                        String a3 = Downcenter.a(this.a.tempFileconfig, "utf-8");
                        if (a3 != null) {
                            String str2 = "</Thread>";
                            if (a3.contains(str2)) {
                                for (String str3 : s.c(a3, "<Thread")) {
                                    if (str3.contains(str2) || str3.contains("/>")) {
                                        try {
                                            parseLong = Long.parseLong(s.b(str3, " start=\"", str));
                                            long parseLong2 = Long.parseLong(s.b(str3, " end=\"", str));
                                            long parseLong3 = Long.parseLong(s.b(str3, " current=\"", str));
                                            long parseLong4 = Long.parseLong(s.b(str3, " size=\"", str));
                                            if (parseLong4 == this.a.wjdx) {
                                                ArrayList c = this.a.g;
                                                DownloadThread downloadThread5 = this.a;
                                                c.add(new DownThread(downloadThread5.g.size() + 1, parseLong, parseLong2, parseLong3, parseLong4));
                                            }
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                            }
                        }
                        obj = null;
                        break;
                    }
                    if (obj == null) {
                        int i = this.a.xcsx - 1;
                        long j2 = this.a.wjdx - 1;
                        for (int i2 = 0; i2 < i; i2++) {
                            parseLong = j2 - this.a.c;
                            ArrayList c2 = this.a.g;
                            downloadThread2 = this.a;
                            DownThread downThread2 = r8;
                            j2 = parseLong;
                            DownThread downThread3 = new DownThread(downloadThread2.g.size() + 1, parseLong, j2, parseLong, j2);
                            c2.add(downThread2);
                        }
                        ArrayList c3 = this.a.g;
                        downloadThread2 = this.a;
                        c3.add(new DownThread(downloadThread2.g.size() + 1, 0, j2, 0, j2));
                    }
                    this.a.a(true);
                    Iterator it = this.a.g.iterator();
                    while (it.hasNext()) {
                        DownThread.a((DownThread) it.next());
                    }
                }
                while (this.a.xcsl > 0) {
                    long j3 = this.a.yxz;
                    try {
                        Thread.sleep(1600);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    downloadThread = this.a;
                    downloadThread.yxz = DownloadThread.g(downloadThread);
                    downloadThread = this.a;
                    downloadThread.xzsd = (int) (downloadThread.yxz - j3);
                    downloadThread = this.a;
                    downloadThread.xzbfb = (int) ((downloadThread.yxz * 100) / this.a.wjdx);
                }
                if (this.a.sftzxz) {
                    downloadThread = this.a;
                    downloadThread.yxz = downloadThread.wjdx;
                    try {
                        if (this.a.e != null) {
                            this.a.e.close();
                        }
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    if (!eVar2.renameTo(eVar)) {
                        d.a(eVar2.getAbsolutePath(), eVar.getAbsolutePath(), true);
                        eVar2.delete();
                    }
                    new e(this.a.tempFileconfig).delete();
                    this.a.xzzt = 2;
                    this.a.sftzxz = true;
                    this.a.downConfig.b.resultStatus(this.a.xzzt, this.a.wjlj, this.a.sj, this.a);
                    Configuration configuration = this.a.downConfig;
                    configuration.newMultipledownload--;
                    return;
                }
                this.a.a(3);
                this.a.downConfig.b.resultStatus(this.a.xzzt, this.a.wjlj, this.a.sj, this.a);
                return;
            }
        }
        a.a(eVar2, this.a.wjdx);
        obj = null;
        try {
            this.a.e = new RandomAccessFile(eVar2, "rw");
            downloadThread2 = this.a;
            downloadThread2.f = downloadThread2.e.getChannel();
            this.a.g.clear();
            this.a.tempFileconfig = this.a.downConfig.tempFileSaveDirectory + this.a.ljmd5 + this.a.downConfig.tempFileFormat + ".config";
            if (this.a.d) {
            }
            j = this.a.wjdx - 1;
            downloadThread3 = this.a;
            downThread = new DownThread(downloadThread3.g.size() + 1, 0, j, 0, j);
            this.a.g.add(downThread);
            this.a.a(true);
            DownThread.a(downThread);
            while (this.a.xcsl > 0) {
            }
            if (this.a.sftzxz) {
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            this.a.a(-1);
            this.a.downConfig.b.resultStatus(this.a.xzzt, this.a.wjlj, this.a.sj, this.a);
        }
    }
}