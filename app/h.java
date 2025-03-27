package i.app;

import i.app.下载管理器.Configuration;
import i.app.下载管理器.下载线程;
import i.app.下载管理器.下载线程.DownThread;
import i.runlibrary.a.a;
import i.runlibrary.a.d;
import i.runlibrary.a.s;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;

final class h extends Thread {
    final /* synthetic */ 下载线程 a;

    h(下载线程 下载线程) {
        this.a = 下载线程;
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
            this.a.f17.b.resultStatus(this.a.f13, this.a.f22, this.a.f19, this.a);
            return;
        }
        下载线程 下载线程;
        Object obj;
        下载线程 下载线程2;
        long j;
        下载线程 下载线程3;
        DownThread downThread;
        this.a.f21 = (long) a.getContentLength();
        if (!"bytes".equals(a.getHeaderField("Accept-Ranges"))) {
            this.a.d = false;
            a = this.a.a(32, 64);
            if (a != null) {
                long[] a2 = a.a(a);
                if (a2 != null && a2[0] == 32 && a2[1] == 64 && a2[2] == this.a.f21) {
                    this.a.d = true;
                }
            }
        }
        File eVar = new e(this.a.f22);
        if (eVar.exists()) {
            if (eVar.length() == this.a.f21) {
                this.a.a(2);
                下载线程 = this.a;
                下载线程.f18 = 下载线程.f21;
                this.a.f17.b.resultStatus(this.a.f13, this.a.f22, this.a.f19, this.a);
                return;
            }
            eVar.delete();
        }
        下载线程 下载线程4 = this.a;
        下载线程4.f26 = 下载线程4.f17.f8;
        下载线程4 = this.a;
        下载线程4.c = 下载线程4.f21 / ((long) this.a.f26);
        File eVar2 = new e(this.a.f17.f6 + this.a.f29md5 + this.a.f17.f7);
        if (eVar2.exists()) {
            if (eVar2.length() == this.a.f21) {
                obj = 1;
                this.a.e = new RandomAccessFile(eVar2, "rw");
                下载线程2 = this.a;
                下载线程2.f = 下载线程2.e.getChannel();
                this.a.g.clear();
                this.a.tempFileconfig = this.a.f17.f6 + this.a.f29md5 + this.a.f17.f7 + ".config";
                if (this.a.d || this.a.f21 <= 2097152) {
                    j = this.a.f21 - 1;
                    下载线程3 = this.a;
                    downThread = new DownThread(下载线程3.g.size() + 1, 0, j, 0, j);
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
                                            if (parseLong4 == this.a.f21) {
                                                ArrayList c = this.a.g;
                                                下载线程 下载线程5 = this.a;
                                                c.add(new DownThread(下载线程5.g.size() + 1, parseLong, parseLong2, parseLong3, parseLong4));
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
                        int i = this.a.f26 - 1;
                        long j2 = this.a.f21 - 1;
                        for (int i2 = 0; i2 < i; i2++) {
                            parseLong = j2 - this.a.c;
                            ArrayList c2 = this.a.g;
                            下载线程2 = this.a;
                            DownThread downThread2 = r8;
                            j2 = parseLong;
                            DownThread downThread3 = new DownThread(下载线程2.g.size() + 1, parseLong, j2, parseLong, j2);
                            c2.add(downThread2);
                        }
                        ArrayList c3 = this.a.g;
                        下载线程2 = this.a;
                        c3.add(new DownThread(下载线程2.g.size() + 1, 0, j2, 0, j2));
                    }
                    this.a.a(true);
                    Iterator it = this.a.g.iterator();
                    while (it.hasNext()) {
                        DownThread.a((DownThread) it.next());
                    }
                }
                while (this.a.f27 > 0) {
                    long j3 = this.a.f18;
                    try {
                        Thread.sleep(1600);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    下载线程 = this.a;
                    下载线程.f18 = 下载线程.g(下载线程);
                    下载线程 = this.a;
                    下载线程.f16 = (int) (下载线程.f18 - j3);
                    下载线程 = this.a;
                    下载线程.f14 = (int) ((下载线程.f18 * 100) / this.a.f21);
                }
                if (this.a.f23) {
                    下载线程 = this.a;
                    下载线程.f18 = 下载线程.f21;
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
                    this.a.f13 = 2;
                    this.a.f23 = true;
                    this.a.f17.b.resultStatus(this.a.f13, this.a.f22, this.a.f19, this.a);
                    Configuration configuration = this.a.f17;
                    configuration.f10--;
                    return;
                }
                this.a.a(3);
                this.a.f17.b.resultStatus(this.a.f13, this.a.f22, this.a.f19, this.a);
                return;
            }
        }
        a.a(eVar2, this.a.f21);
        obj = null;
        try {
            this.a.e = new RandomAccessFile(eVar2, "rw");
            下载线程2 = this.a;
            下载线程2.f = 下载线程2.e.getChannel();
            this.a.g.clear();
            this.a.tempFileconfig = this.a.f17.f6 + this.a.f29md5 + this.a.f17.f7 + ".config";
            if (this.a.d) {
            }
            j = this.a.f21 - 1;
            下载线程3 = this.a;
            downThread = new DownThread(下载线程3.g.size() + 1, 0, j, 0, j);
            this.a.g.add(downThread);
            this.a.a(true);
            DownThread.a(downThread);
            while (this.a.f27 > 0) {
            }
            if (this.a.f23) {
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            this.a.a(-1);
            this.a.f17.b.resultStatus(this.a.f13, this.a.f22, this.a.f19, this.a);
        }
    }
}