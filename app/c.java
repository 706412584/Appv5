package i.app;

import i.app.DownloadThreads.DownloadThread;
import i.app.DownloadThreads.DownloadThread.DownThread;
import java.net.DatagramSocket;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

final class c extends Thread {
    final /* synthetic */ DownThread a;

    c(DownThread downThread) {
        this.a = downThread;
    }

    public final void run() {
        this.a.a();
        HttpURLConnection a = DownloadThread.this.a(this.a.e, this.a.d);
        if (a != null) {
            ByteBuffer allocate = ByteBuffer.allocate(2097152);
            DatagramSocket datagramSocket = null;
            try {
                ReadableByteChannel newChannel = Channels.newChannel(a.getInputStream());
                while (!DownloadThread.this.sftzxz) {
                    int read = newChannel.read(allocate);
                    if (read == -1) {
                        break;
                    }
                    DownloadThread.this.writeTempFilerw(this.a.e, allocate);
                    this.a.b(read);
                    allocate.clear();
                }
                if (newChannel != null) {
                    try {
                        newChannel.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                DownloadThread.this.a(-1);
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
            } catch (Throwable th) {
                if (datagramSocket != null) {
                    try {
                        datagramSocket.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
        DownloadThread.this.a(true);
        this.a.a(-1);
    }
}