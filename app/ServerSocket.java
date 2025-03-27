package i.app;

import android.content.Context;
import i.runlibrary.a.f;
import i.runlibrary.a.o;
import i.runlibrary.a.s;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

public class ServerSocket {
    private List a;
    private Context b;
    public String bm;
    private java.net.ServerSocket c;
    private int d;
    private int e;
    private int f;
    private String g;
    private socketServer h;
    private OnMessagesListener i;
    private int j;
    public boolean jsqq;

    public interface OnMessagesListener {
        void Accept(ServerSocket serverSocket, socketServer socketserver);

        void Message(socketServer socketserver, int i, String str, byte[] bArr);
    }

    public class socketServer {
        private Socket b;
        public Object obj = null;
        public Object[] objsz = null;

        public socketServer(Socket socket) {
            this.b = socket;
            a();
        }

        private void a() {
            new f(this).start();
        }

        static /* synthetic */ void a(socketServer socketserver, InputStream inputStream, int i, byte[] bArr) {
            while (true) {
                String str = null;
                int i2 = 1;
                int i3 = 0;
                if (i >= 32 && f.c(bArr)) {
                    byte b = bArr[6];
                    int a = f.a(bArr);
                    if (b == (byte) 2) {
                        str = f.b(bArr);
                    }
                    if (a <= 0) {
                        break;
                    }
                    byte[] toByteArray;
                    int i4;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    if (i > 32) {
                        int i5 = i - 32;
                        if (i5 <= a) {
                            byteArrayOutputStream.write(bArr, 32, i5);
                            if (a > i5) {
                                a -= i5;
                            }
                        } else {
                            byteArrayOutputStream.write(bArr, 32, a);
                        }
                        if (a <= i5) {
                            toByteArray = byteArrayOutputStream.toByteArray();
                            OnMessagesListener a2 = ServerSocket.this.i;
                            if (b == (byte) 1) {
                                str = new String(toByteArray, ServerSocket.this.bm);
                            }
                            a2.Message(socketserver, b, str, toByteArray);
                            byteArrayOutputStream.close();
                            if (i5 > a) {
                                i4 = i5 - a;
                                toByteArray = new byte[i4];
                                for (a += 32; a < i; a++) {
                                    toByteArray[i3] = bArr[a];
                                    i3++;
                                }
                                i = i4;
                                bArr = toByteArray;
                            } else {
                                return;
                            }
                        }
                        i = i5;
                    }
                    while (!socketserver.b.isClosed()) {
                        i = inputStream.read(bArr);
                        if (i > 0) {
                            if (i > a) {
                                byteArrayOutputStream.write(bArr, 0, a);
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                            if (a == i) {
                                break;
                            }
                            a -= i;
                        }
                    }
                    if (a > i) {
                        break;
                    }
                    toByteArray = byteArrayOutputStream.toByteArray();
                    OnMessagesListener a3 = ServerSocket.this.i;
                    if (b == (byte) 1) {
                        str = new String(toByteArray, ServerSocket.this.bm);
                    }
                    a3.Message(socketserver, b, str, toByteArray);
                    byteArrayOutputStream.close();
                    if (i <= a) {
                        break;
                    }
                    i4 = i - a;
                    toByteArray = new byte[i4];
                    while (a < i) {
                        toByteArray[i3] = bArr[a];
                        i3++;
                        a++;
                    }
                    i = i4;
                    bArr = toByteArray;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    while (true) {
                        byteArrayOutputStream2.write(bArr, 0, i);
                        while (!socketserver.b.isClosed() && inputStream.available() > 0) {
                            i = inputStream.read(bArr);
                            if (i > 0) {
                                if (i >= 32 && f.c(bArr)) {
                                    break;
                                }
                            }
                        }
                    }
                    i2 = 0;
                    ServerSocket.this.i.Message(socketserver, 0, null, byteArrayOutputStream2.toByteArray());
                    byteArrayOutputStream2.close();
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        public int bjdk() {
            return this.b.getLocalPort();
        }

        public String bjip() {
            return this.b.getLocalAddress().getHostAddress();
        }

        public boolean cq() {
            try {
                if (this.b.isClosed()) {
                    Socket socket;
                    if (ServerSocket.this.e > 0) {
                        socket = this.b;
                        socket.connect(socket.getRemoteSocketAddress(), ServerSocket.this.e);
                    } else {
                        socket = this.b;
                        socket.connect(socket.getRemoteSocketAddress());
                    }
                    if (!this.b.isClosed()) {
                        if (!ServerSocket.this.a.contains(this)) {
                            ServerSocket.this.a.add(this);
                        }
                        a();
                    }
                    return true;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }

        public int dk() {
            return this.b.getPort();
        }

        public void gb() {
            if (!this.b.isClosed()) {
                ServerSocket.this.a.remove(this);
                try {
                    this.b.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public String ip() {
            return this.b.getInetAddress().getHostAddress();
        }

        public Socket ljdx() {
            return this.b;
        }

        public boolean sc(Object obj) {
            return ServerSocket.this.a(this, obj);
        }

        public boolean sc(Object obj, Object obj2) {
            return ServerSocket.this.a(this, obj, obj2);
        }

        public boolean sfgb() {
            return this.b.isClosed();
        }

        public Object sj() {
            return this.obj;
        }

        public void sj(Object obj) {
            this.obj = obj;
        }

        public void szsj(Object obj) {
            this.objsz = s.c(obj);
        }

        public Object[] szsj() {
            return this.objsz;
        }
    }

    public ServerSocket(Context context, int i, int i2, int i3, boolean z, OnMessagesListener onMessagesListener) {
        this.a = new ArrayList();
        this.c = null;
        this.jsqq = true;
        this.d = 0;
        this.e = 0;
        this.bm = "utf-8";
        this.h = null;
        this.i = null;
        this.j = 0;
        this.j = 1;
        this.b = context;
        try {
            this.c = new DatagramSocket(i);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (i2 > 0) {
            try {
                this.c.setSoTimeout(i2);
            } catch (SocketException e2) {
                e2.printStackTrace();
            }
        }
        this.f = i;
        this.d = i2;
        this.e = i3;
        this.jsqq = z;
        this.i = onMessagesListener;
    }

    public ServerSocket(Context context, String str, int i, int i2, OnMessagesListener onMessagesListener) {
        this.a = new ArrayList();
        this.c = null;
        this.jsqq = true;
        this.d = 0;
        this.e = 0;
        this.bm = "utf-8";
        this.h = null;
        this.i = null;
        this.j = 0;
        this.j = 2;
        this.b = context;
        this.g = str;
        this.f = i;
        this.e = i2;
        this.i = onMessagesListener;
    }

    private boolean a(socketServer socketserver, Object obj) {
        byte[] toBytes = o.toBytes(obj, this.bm, null);
        return toBytes != null ? a(socketserver.b, toBytes) : false;
    }

    private boolean a(socketServer socketserver, Object obj, Object obj2) {
        File file;
        int d = s.d(obj);
        if (d == 2) {
            obj2 = obj2 instanceof File ? (File) obj2 : new e(FileProvider.a(this.b, obj2.toString()));
            if (obj2.exists()) {
                if (obj2.isFile()) {
                    file = obj2;
                }
            }
            return false;
        }
        file = null;
        byte[] toBytes = o.toBytes(obj2, this.bm, null);
        return toBytes != null && a(socketserver.b, f.a(toBytes, d, file)) && a(socketserver.b, toBytes);
    }

    private static boolean a(Socket socket, byte[] bArr) {
        try {
            socket.getOutputStream().write(bArr);
            socket.getOutputStream().flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public int bjdk() {
        java.net.ServerSocket serverSocket = this.c;
        if (serverSocket != null) {
            return serverSocket.getLocalPort();
        }
        socketServer socketserver = this.h;
        return socketserver != null ? socketserver.b.getLocalPort() : -1;
    }

    public String bjip() {
        if (this.c != null) {
            return "127.0.0.1";
        }
        socketServer socketserver = this.h;
        return socketserver != null ? socketserver.b.getLocalAddress().getHostAddress() : null;
    }

    public void cq() {
        int i = this.j;
        if (i == 1) {
            if (this.c.isClosed()) {
                try {
                    this.c = new DatagramSocket(this.f);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                i = this.d;
                if (i > 0) {
                    try {
                        this.c.setSoTimeout(i);
                    } catch (SocketException e2) {
                        e2.printStackTrace();
                    }
                }
                ks();
            }
        } else if (i == 2 && this.h.sfgb()) {
            ks();
        }
    }

    public java.net.ServerSocket fwd() {
        return this.c;
    }

    public void gb() {
        this.jsqq = false;
        for (socketServer gb : this.a) {
            try {
                gb.gb();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.a.clear();
        java.net.ServerSocket serverSocket = this.c;
        if (!(serverSocket == null || serverSocket.isClosed())) {
            try {
                this.c.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void ks() {
        int i = this.j;
        int i2;
        socketServer socketserver;
        if (i == 1) {
            while (!this.c.isClosed()) {
                try {
                    SocketChannel accept = this.c.accept();
                    if (this.jsqq) {
                        i2 = this.e;
                        if (i2 > 0) {
                            accept.setSoTimeout(i2);
                        }
                        socketserver = new socketServer(accept);
                        this.a.add(socketserver);
                        this.i.Accept(this, socketserver);
                    } else {
                        accept.close();
                    }
                } catch (SocketTimeoutException e) {
                    e.printStackTrace();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                this.c.close();
                return;
            } catch (IOException e22) {
                e22.printStackTrace();
                return;
            }
        }
        if (i == 2) {
            try {
                Socket socket = new Socket(this.g, this.f);
                i2 = this.e;
                if (i2 != 0) {
                    socket.setSoTimeout(i2);
                }
                socketserver = new socketServer(socket);
                this.h = socketserver;
                this.a.add(socketserver);
            } catch (IOException e222) {
                e222.printStackTrace();
            }
        }
    }

    public socketServer lj(Object obj) {
        int d = s.d(obj);
        return (d < 0 || this.a.size() <= d) ? null : (socketServer) this.a.get(d);
    }

    public List lj() {
        return this.a;
    }

    public void ljqk() {
        if (this.c != null) {
            for (socketServer gb : this.a) {
                try {
                    gb.gb();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.a.clear();
        }
    }

    public int ljzs() {
        return this.a.size();
    }

    public int sc(Object obj) {
        int i = 0;
        for (socketServer socketserver : this.a) {
            if (!socketserver.sfgb() && a(socketserver, obj)) {
                i++;
            }
        }
        return i;
    }

    public boolean sc(Object obj, Object obj2) {
        int i = 0;
        for (socketServer socketserver : this.a) {
            if (!socketserver.sfgb() && a(socketserver, obj, obj2)) {
                i++;
            }
        }
        return i;
    }

    public boolean sfgb() {
        java.net.ServerSocket serverSocket = this.c;
        if (serverSocket != null) {
            return serverSocket.isClosed();
        }
        socketServer socketserver = this.h;
        return socketserver != null ? socketserver.sfgb() : true;
    }
}