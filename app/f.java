package i.app;

import i.app.ServerSocket.socketServer;
import java.io.IOException;
import java.io.InputStream;

final class f extends Thread {
    final /* synthetic */ socketServer a;

    f(socketServer socketserver) {
        this.a = socketserver;
    }

    public final void run() {
        InputStream inputStream;
        byte[] bArr = new byte[2048];
        try {
            inputStream = this.a.b.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
            inputStream = null;
        }
        while (!this.a.b.isClosed()) {
            try {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    socketServer.a(this.a, inputStream, read, bArr);
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        this.a.gb();
    }
}