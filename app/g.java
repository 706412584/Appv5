package i.app;

import i.app.下载管理器.下载线程;
import java.util.Iterator;

final class g extends Thread {
    final /* synthetic */ 下载管理器 a;

    g(下载管理器 下载管理器) {
        this.a = 下载管理器;
    }

    public final void run() {
        while (this.a.a) {
            if (this.a.f2.f10 < this.a.f2.f9) {
                int i;
                Iterator it = this.a.f3.iterator();
                while (true) {
                    i = 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    下载线程 下载线程 = (下载线程) it.next();
                    if (下载线程.f13 == 0 && !下载线程.f23) {
                        下载线程.f13 = 1;
                        下载线程.a(下载线程);
                        i = 0;
                        break;
                    }
                }
                if (i != 0) {
                    this.a.a = false;
                    return;
                }
            }
            下载管理器.a();
        }
    }
}