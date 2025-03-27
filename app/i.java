package i.app;

import i.app.下载管理器.下载线程;
import i.app.下载管理器.下载线程.DownThread;
import java.net.DatagramSocket;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

final class i extends Thread {
    final /* synthetic */ DownThread a;

    i(DownThread downThread) {
        this.a = downThread;
    }

    public final void run() {
        this.a.a();
        HttpURLConnection a = 下载线程.this.a(this.a.e, this.a.d);
        if (a != null) {
            ByteBuffer allocate = ByteBuffer.allocate(2097152);
            DatagramSocket datagramSocket = null;
            try {
                ReadableByteChannel newChannel = Channels.newChannel(a.getInputStream());
                while (!下载线程.this.f23) {
                    int read = newChannel.read(allocate);
                    if (read == -1) {
                        break;
                    }
                    下载线程.this.writeTempFilerw(this.a.e, allocate);
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
                下载线程.this.a(-1);
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
        下载线程.this.a(true);
        this.a.a(-1);
    }
}