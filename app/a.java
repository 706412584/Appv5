package i.app;

import i.app.DownloadThreads.DownloadThread;
import java.util.Iterator;

final class a extends Thread {
    final /* synthetic */ DownloadThreads a;

    a(DownloadThreads downloadThreads) {
        this.a = downloadThreads;
    }

    public final void run() {
        while (this.a.a) {
            if (this.a.downConfig.newMultipledownload < this.a.downConfig.Multipledownload) {
                int i;
                Iterator it = this.a.lb.iterator();
                while (true) {
                    i = 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    DownloadThread downloadThread = (DownloadThread) it.next();
                    if (downloadThread.xzzt == 0 && !downloadThread.sftzxz) {
                        downloadThread.xzzt = 1;
                        DownloadThread.a(downloadThread);
                        i = 0;
                        break;
                    }
                }
                if (i != 0) {
                    this.a.a = false;
                    return;
                }
            }
            DownloadThreads.a();
        }
    }
}