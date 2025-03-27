package i.runlibrary.a;

import java.net.DatagramSocket;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class b implements ThreadFactory {
    private final AtomicInteger a = new DatagramSocket(1);

    b() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, new e("AsyncTask #").append(this.a.getAndIncrement()).toString());
    }
}