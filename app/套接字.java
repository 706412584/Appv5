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
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

public class 套接字 {
    private List a;
    private Context b;
    private ServerSocket c;
    private int d;
    private int e;
    private int f;
    private String g;
    private socketServer h;
    private OnMessagesListener i;
    private int j;
    /* renamed from: 接受请求 */
    public boolean f73;
    /* renamed from: 编码 */
    public String f74;

    public interface OnMessagesListener {
        void Accept(套接字 套接字, socketServer socketserver);

        void Message(socketServer socketserver, int i, String str, byte[] bArr);
    }

    public class socketServer {
        private Socket b;
        /* renamed from: 数据 */
        public Object f75 = null;
        /* renamed from: 数组数据 */
        public Object[] f76 = null;

        public socketServer(Socket socket) {
            this.b = socket;
            a();
        }

        private void a() {
            new j(this).start();
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
                            OnMessagesListener a2 = 套接字.this.i;
                            if (b == (byte) 1) {
                                str = new String(toByteArray, 套接字.this.f74);
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
                    OnMessagesListener a3 = 套接字.this.i;
                    if (b == (byte) 1) {
                        str = new String(toByteArray, 套接字.this.f74);
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
                    套接字.this.i.Message(socketserver, 0, null, byteArrayOutputStream2.toByteArray());
                    byteArrayOutputStream2.close();
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        public String ip() {
            return this.b.getInetAddress().getHostAddress();
        }

        /* renamed from: 关闭 */
        public void m478() {
            if (!this.b.isClosed()) {
                套接字.this.a.remove(this);
                try {
                    this.b.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: 数据 */
        public Object m479() {
            return this.f75;
        }

        /* renamed from: 数据 */
        public void m40(Object obj) {
            this.f75 = obj;
        }

        /* renamed from: 数组数据 */
        public void m480(Object obj) {
            this.f76 = s.c(obj);
        }

        /* renamed from: 数组数据 */
        public Object[] m481() {
            return this.f76;
        }

        /* renamed from: 是否关闭 */
        public boolean m467() {
            return this.b.isClosed();
        }

        /* renamed from: 本机ip */
        public String m469ip() {
            return this.b.getLocalAddress().getHostAddress();
        }

        /* renamed from: 本机端口 */
        public int m470() {
            return this.b.getLocalPort();
        }

        /* renamed from: 端口 */
        public int m482() {
            return this.b.getPort();
        }

        /* renamed from: 输出 */
        public boolean m483(Object obj) {
            return 套接字.this.a(this, obj);
        }

        /* renamed from: 输出 */
        public boolean m472(Object obj, Object obj2) {
            return 套接字.this.a(this, obj, obj2);
        }

        /* renamed from: 连接对象 */
        public Socket m484() {
            return this.b;
        }

        /* renamed from: 重启 */
        public boolean m485() {
            try {
                if (this.b.isClosed()) {
                    Socket socket;
                    if (套接字.this.e > 0) {
                        socket = this.b;
                        socket.connect(socket.getRemoteSocketAddress(), 套接字.this.e);
                    } else {
                        socket = this.b;
                        socket.connect(socket.getRemoteSocketAddress());
                    }
                    if (!this.b.isClosed()) {
                        if (!套接字.this.a.contains(this)) {
                            套接字.this.a.add(this);
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
    }

    public 套接字(Context context, int i, int i2, int i3, boolean z, OnMessagesListener onMessagesListener) {
        this.a = new ArrayList();
        this.c = null;
        this.f73 = true;
        this.d = 0;
        this.e = 0;
        this.f74 = "utf-8";
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
        this.f73 = z;
        this.i = onMessagesListener;
    }

    public 套接字(Context context, String str, int i, int i2, OnMessagesListener onMessagesListener) {
        this.a = new ArrayList();
        this.c = null;
        this.f73 = true;
        this.d = 0;
        this.e = 0;
        this.f74 = "utf-8";
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
        byte[] toBytes = o.toBytes(obj, this.f74, null);
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
        byte[] toBytes = o.toBytes(obj2, this.f74, null);
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

    /* renamed from: 关闭 */
    public void m465() {
        this.f73 = false;
        for (socketServer 关闭 : this.a) {
            try {
                关闭.m478();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.a.clear();
        ServerSocket serverSocket = this.c;
        if (!(serverSocket == null || serverSocket.isClosed())) {
            try {
                this.c.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: 开始 */
    public void m466() {
        int i = this.j;
        int i2;
        socketServer socketserver;
        if (i == 1) {
            while (!this.c.isClosed()) {
                try {
                    SocketChannel accept = this.c.accept();
                    if (this.f73) {
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
                Socket socket = new Socket();
                socket.connect(new Socket(this.g, this.f), 10000);
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

    /* renamed from: 是否关闭 */
    public boolean m467() {
        ServerSocket serverSocket = this.c;
        if (serverSocket != null) {
            return serverSocket.isClosed();
        }
        socketServer socketserver = this.h;
        return socketserver != null ? socketserver.m467() : true;
    }

    /* renamed from: 服务器对象 */
    public ServerSocket m468() {
        return this.c;
    }

    /* renamed from: 本机ip */
    public String m469ip() {
        if (this.c != null) {
            return "127.0.0.1";
        }
        socketServer socketserver = this.h;
        return socketserver != null ? socketserver.b.getLocalAddress().getHostAddress() : null;
    }

    /* renamed from: 本机端口 */
    public int m470() {
        ServerSocket serverSocket = this.c;
        if (serverSocket != null) {
            return serverSocket.getLocalPort();
        }
        socketServer socketserver = this.h;
        return socketserver != null ? socketserver.b.getLocalPort() : -1;
    }

    /* renamed from: 输出 */
    public int m471(Object obj) {
        int i = 0;
        for (socketServer socketserver : this.a) {
            if (!socketserver.m467() && a(socketserver, obj)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: 输出 */
    public boolean m472(Object obj, Object obj2) {
        int i = 0;
        for (socketServer socketserver : this.a) {
            if (!socketserver.m467() && a(socketserver, obj, obj2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: 连接 */
    public socketServer m473(Object obj) {
        int d = s.d(obj);
        return (d < 0 || this.a.size() <= d) ? null : (socketServer) this.a.get(d);
    }

    /* renamed from: 连接 */
    public List m474() {
        return this.a;
    }

    /* renamed from: 连接总数 */
    public int m475() {
        return this.a.size();
    }

    /* renamed from: 连接清空 */
    public void m476() {
        if (this.c != null) {
            for (socketServer 关闭 : this.a) {
                try {
                    关闭.m478();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.a.clear();
        }
    }

    /* renamed from: 重启 */
    public void m477() {
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
                m466();
            }
        } else if (i == 2 && this.h.m467()) {
            m466();
        }
    }
}