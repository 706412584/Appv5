package i.runlibrary.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import i.runlibrary.app.wl.OnWebListener;
import i.runlibrary.app.wl.web;
import i.runlibrary.app.网络;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.DatagramSocket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(Unknown Source:0)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(Unknown Source:49)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(Unknown Source:0)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(Unknown Source:28)
    	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:0)
    	at jadx.core.ProcessClass.process(Unknown Source:54)
    	at jadx.core.ProcessClass.processDependencies(Unknown Source:22)
    	at jadx.core.ProcessClass.process(Unknown Source:68)
    	at jadx.api.JadxDecompiler.processClass(Unknown Source:4)
    	at jadx.api.JavaClass.decompile(Unknown Source:19)
    */
public class o {
    public ArrayList MIME_list;
    private Selector a;
    private AtomicBoolean b;
    private AtomicBoolean c;
    public String contentType;
    private String d;
    public String defaultPage;
    private final String[] e;
    private final String[] f;
    private boolean g;
    public OnWebListener onweb;
    public String page404;
    public String page500;
    public web web;
    /* renamed from: web事件 */
    public 网络.OnWebListener f0web;
    /* renamed from: web服务器 */
    public 网络.web f1web;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: android.s.ￛﾦￛﾢￛﾨￛﾢ cannot be cast to android.s.xk in method: i.runlibrary.a.o.<init>(int, java.lang.String, i.runlibrary.app.wl$OnWebListener):void, dex: 
        	at jadx.core.dex.nodes.MethodNode.load(Unknown Source:89)
        	at jadx.core.dex.nodes.ClassNode.load(Unknown Source:45)
        	at jadx.core.ProcessClass.process(Unknown Source:24)
        	at jadx.core.ProcessClass.processDependencies(Unknown Source:22)
        	at jadx.core.ProcessClass.process(Unknown Source:68)
        	at jadx.api.JadxDecompiler.processClass(Unknown Source:4)
        	at jadx.api.JavaClass.decompile(Unknown Source:19)
        Caused by: java.lang.ClassCastException: android.s.ￛﾦￛﾢￛﾨￛﾢ cannot be cast to android.s.xk
        	at jadx.core.dex.instructions.InsnDecoder.filledNewArray(Unknown Source:1)
        	at jadx.core.dex.instructions.InsnDecoder.decode(Unknown Source:1108)
        	at jadx.core.dex.instructions.InsnDecoder.process(Unknown Source:19)
        	at jadx.core.dex.nodes.MethodNode.load(Unknown Source:36)
        	... 6 more
        */
    public o(int r1, java.lang.String r2, i.runlibrary.app.wl.OnWebListener r3) {
        /*
        // Can't load method instructions: Load method exception: android.s.ۦۢۨۢ cannot be cast to android.s.xk in method: i.runlibrary.a.o.<init>(int, java.lang.String, i.runlibrary.app.wl$OnWebListener):void, dex: 
        */
        throw new UnsupportedOperationException("Method not decompiled: i.runlibrary.a.o.<init>(int, java.lang.String, i.runlibrary.app.wl$OnWebListener):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: android.s.ￛﾦￛﾢￛﾨￛﾢ cannot be cast to android.s.xk in method: i.runlibrary.a.o.<init>(int, java.lang.String, i.runlibrary.app.￧ﾽﾑ￧ﾻﾜ$OnWebListener):void, dex: 
        	at jadx.core.dex.nodes.MethodNode.load(Unknown Source:89)
        	at jadx.core.dex.nodes.ClassNode.load(Unknown Source:45)
        	at jadx.core.ProcessClass.process(Unknown Source:24)
        	at jadx.core.ProcessClass.processDependencies(Unknown Source:22)
        	at jadx.core.ProcessClass.process(Unknown Source:68)
        	at jadx.api.JadxDecompiler.processClass(Unknown Source:4)
        	at jadx.api.JavaClass.decompile(Unknown Source:19)
        Caused by: java.lang.ClassCastException: android.s.ￛﾦￛﾢￛﾨￛﾢ cannot be cast to android.s.xk
        	at jadx.core.dex.instructions.InsnDecoder.filledNewArray(Unknown Source:1)
        	at jadx.core.dex.instructions.InsnDecoder.decode(Unknown Source:1108)
        	at jadx.core.dex.instructions.InsnDecoder.process(Unknown Source:19)
        	at jadx.core.dex.nodes.MethodNode.load(Unknown Source:36)
        	... 6 more
        */
    public o(int r1, java.lang.String r2, i.runlibrary.app.网络.OnWebListener r3) {
        /*
        // Can't load method instructions: Load method exception: android.s.ۦۢۨۢ cannot be cast to android.s.xk in method: i.runlibrary.a.o.<init>(int, java.lang.String, i.runlibrary.app.网络$OnWebListener):void, dex: 
        */
        throw new UnsupportedOperationException("Method not decompiled: i.runlibrary.a.o.<init>(int, java.lang.String, i.runlibrary.app.网络$OnWebListener):void");
    }

    private String a(File file) {
        String toLowerCase = file.getName().toLowerCase();
        int size = this.MIME_list.size();
        int i = 0;
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                String str = (String) this.MIME_list.get(i2);
                int indexOf = str.indexOf(58);
                if (indexOf != -1 && toLowerCase.endsWith(str.substring(0, indexOf))) {
                    return str.substring(indexOf + 1);
                }
            }
        }
        while (true) {
            String[] strArr = this.e;
            if (i >= strArr.length) {
                return null;
            }
            if (toLowerCase.endsWith(strArr[i])) {
                return this.f[i];
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d7 A:{LOOP_END, LOOP:1: B:23:0x00d1->B:25:0x00d7} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d7 A:{LOOP_END, LOOP:1: B:23:0x00d1->B:25:0x00d7} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(SelectionKey selectionKey, int i, long j, long j2, String str, String[] strArr) {
        if (this.c.get()) {
            String str2;
            StringBuffer append;
            SocketChannel socketChannel;
            ByteBuffer allocate;
            int i2 = 0;
            this.c.set(false);
            StringBuffer stringBuffer = new StringBuffer();
            String str3 = "HTTP/1.1 200 OK\r\n";
            if (i <= 0) {
                if (j2 > 0) {
                    str2 = "HTTP/1.1 206 Partial Content\r\n";
                }
                stringBuffer.append(str3);
                append = stringBuffer.append("Content-Type: ").append(str);
                str = "\r\n";
                append.append(str);
                stringBuffer.append("Connection: Keep-Alive\r\n");
                stringBuffer.append("Accept-Ranges: bytes\r\n");
                stringBuffer.append(new e("Content-Length: ").append(j).append(str).toString());
                stringBuffer.append(new e("Content-Range: bytes ").append(j2).append("-").append(j - 1).append("/").append(j).append(str).toString());
                if (strArr != null) {
                }
                stringBuffer.append(str);
                socketChannel = (SocketChannel) selectionKey.channel();
                allocate = ByteBuffer.allocate(1048576);
                allocate.clear();
                allocate.put(stringBuffer.toString().getBytes());
                allocate.flip();
                while (allocate.hasRemaining()) {
                }
                allocate.clear();
            } else if (i == 404) {
                str2 = "HTTP/1.1 404 Not Found\r\n";
            } else if (i == 200) {
                stringBuffer.append(str3);
                append = stringBuffer.append("Content-Type: ").append(str);
                str = "\r\n";
                append.append(str);
                stringBuffer.append("Connection: Keep-Alive\r\n");
                stringBuffer.append("Accept-Ranges: bytes\r\n");
                stringBuffer.append(new e("Content-Length: ").append(j).append(str).toString());
                stringBuffer.append(new e("Content-Range: bytes ").append(j2).append("-").append(j - 1).append("/").append(j).append(str).toString());
                if (strArr != null) {
                    i = strArr.length;
                    while (i2 < i) {
                        stringBuffer.append(strArr[i2] + str);
                        i2++;
                    }
                }
                stringBuffer.append(str);
                socketChannel = (SocketChannel) selectionKey.channel();
                allocate = ByteBuffer.allocate(1048576);
                allocate.clear();
                allocate.put(stringBuffer.toString().getBytes());
                allocate.flip();
                while (allocate.hasRemaining()) {
                    socketChannel.write(allocate);
                }
                allocate.clear();
            } else {
                str2 = "HTTP/1.1 500 Error\r\n";
            }
            stringBuffer.append(str2);
            append = stringBuffer.append("Content-Type: ").append(str);
            str = "\r\n";
            append.append(str);
            stringBuffer.append("Connection: Keep-Alive\r\n");
            stringBuffer.append("Accept-Ranges: bytes\r\n");
            stringBuffer.append(new e("Content-Length: ").append(j).append(str).toString());
            stringBuffer.append(new e("Content-Range: bytes ").append(j2).append("-").append(j - 1).append("/").append(j).append(str).toString());
            if (strArr != null) {
            }
            stringBuffer.append(str);
            socketChannel = (SocketChannel) selectionKey.channel();
            allocate = ByteBuffer.allocate(1048576);
            allocate.clear();
            allocate.put(stringBuffer.toString().getBytes());
            allocate.flip();
            while (allocate.hasRemaining()) {
            }
            allocate.clear();
        }
    }

    private void a(SelectionKey selectionKey, int i, byte[] bArr, String str, String[] strArr) {
        a(selectionKey, i, (long) bArr.length, 0, str, strArr);
        try {
            SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
            ByteBuffer allocate = ByteBuffer.allocate(1048576);
            allocate.clear();
            allocate.put(bArr);
            allocate.flip();
            while (allocate.hasRemaining()) {
                socketChannel.write(allocate);
            }
            allocate.clear();
            socketChannel.close();
        } catch (Exception unused) {
            if (selectionKey != null) {
                selectionKey.cancel();
                if (selectionKey.channel() != null) {
                    selectionKey.channel().close();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014e  */
    /* JADX WARNING: Missing block: B:47:0x00f9, code:
            if (r6.isDirectory() == false) goto L_0x00fc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(SelectionKey selectionKey, String str) {
        long longValue;
        String str2;
        File eVar;
        FileChannel fileChannel;
        SelectionKey selectionKey2 = selectionKey;
        String str3 = str;
        if (this.g) {
            网络.OnWebListener onWebListener = this.f0web;
            if (onWebListener != null) {
                onWebListener.web(this.f1web, selectionKey, str3);
                return;
            }
        }
        OnWebListener onWebListener2 = this.onweb;
        if (onWebListener2 != null) {
            onWebListener2.web(this.web, selectionKey, str3);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            for (String str4 : str3.split("\r\n")) {
                if (str4.contains("Range")) {
                    longValue = Long.valueOf(str4.substring(str4.lastIndexOf("=") + 1, str4.lastIndexOf("-"))).longValue();
                    break;
                }
            }
        }
        longValue = 0;
        long j = longValue;
        String str5 = " ";
        String str6 = null;
        if (str3.contains("GET")) {
            str2 = "GET ";
        } else if (str3.contains("POST")) {
            str2 = "POST ";
        } else {
            str2 = null;
            if (str2 != null) {
                str3 = str2.indexOf(63) != -1 ? s.b(str2, null, "?") : str2;
                if (str3 != null) {
                    str5 = "/";
                    if (str3.endsWith(str5) && this.defaultPage != null) {
                        str3 = String.format("%s%s", new Object[]{str3, this.defaultPage});
                    }
                    eVar = new e(this.d + str3);
                    if (eVar.exists()) {
                        String str7;
                        if (this.defaultPage != null && eVar.isDirectory()) {
                            eVar = new e(this.d + str3 + str5 + this.defaultPage);
                            if (eVar.exists()) {
                            }
                        }
                        if (eVar != null) {
                            str3 = a(eVar);
                            if (str3 == null) {
                                str3 = this.contentType;
                            }
                            str5 = str3;
                            if (str5 != null) {
                                try {
                                    str6 = new RandomAccessFile(eVar, "r").getChannel();
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                            }
                            str7 = str5;
                            fileChannel = str6;
                        } else {
                            fileChannel = null;
                            str7 = fileChannel;
                        }
                        if (fileChannel == null) {
                            if (eVar == null) {
                                str3 = this.page404;
                                if (str3 == null) {
                                    str3 = "%s 找不到页面";
                                }
                                str3 = String.format(str3, new Object[]{str2});
                            } else {
                                str3 = this.page500;
                                if (str3 == null) {
                                    str3 = "%s 打开页面失败，请检查是否添加文件的MIME";
                                }
                                str3 = String.format(str3, new Object[]{str2});
                            }
                            a(selectionKey, 404, str3.getBytes(), "text/html;charset=UTF-8", null);
                            return;
                        }
                        a(selectionKey, 0, fileChannel.size(), j, str7, null);
                        try {
                            a(selectionKey, fileChannel, j);
                            return;
                        } catch (Exception unused) {
                            fileChannel.close();
                            if (selectionKey2 != null) {
                                selectionKey.cancel();
                                if (selectionKey.channel() != null) {
                                    selectionKey.channel().close();
                                }
                            }
                            return;
                        }
                    }
                }
            }
            eVar = null;
            if (eVar != null) {
            }
            if (fileChannel == null) {
            }
        }
        str2 = s.b(str3, str2, str5);
        if (str2 != null) {
        }
        eVar = null;
        if (eVar != null) {
        }
        if (fileChannel == null) {
        }
    }

    private static void a(SelectionKey selectionKey, FileChannel fileChannel, long j) {
        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
        ByteBuffer allocate = ByteBuffer.allocate(1048576);
        allocate.clear();
        fileChannel.position(j);
        while (allocate.hasRemaining()) {
            if (-1 == fileChannel.read(allocate)) {
                allocate.flip();
                while (allocate.hasRemaining()) {
                    socketChannel.write(allocate);
                }
                allocate.clear();
                selectionKey.cancel();
                socketChannel.close();
                return;
            }
        }
        allocate.flip();
        while (allocate.hasRemaining()) {
            socketChannel.write(allocate);
        }
        allocate.clear();
    }

    public static byte[] toBytes(Object obj, String str, byte[] bArr) {
        try {
            if (obj instanceof byte[]) {
                return (byte[]) obj;
            }
            int i = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                byte[] bArr2 = new byte[length];
                while (i < length) {
                    bArr2[i] = (byte) iArr[i];
                    i++;
                }
                return bArr2;
            } else if (obj instanceof String) {
                return str == null ? obj.toString().getBytes() : obj.toString().getBytes(str);
            } else {
                ByteArrayOutputStream byteArrayOutputStream;
                if (obj instanceof InputStream) {
                    InputStream inputStream = (InputStream) obj;
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr3 = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr3, 0, 1024);
                        if (read == -1) {
                            return byteArrayOutputStream.toByteArray();
                        }
                        byteArrayOutputStream.write(bArr3, 0, read);
                    }
                } else if (obj instanceof Bitmap) {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) obj).compress(CompressFormat.PNG, 100, byteArrayOutputStream);
                    return byteArrayOutputStream.toByteArray();
                } else if (obj instanceof File) {
                    return d.a((File) obj);
                } else {
                    if (obj instanceof Byte) {
                        return new byte[]{((Byte) obj).byteValue()};
                    }
                    return bArr;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void gb() {
        this.b.set(true);
    }

    public void init(int i, String str) {
        this.d = new e(str).getAbsolutePath();
        try {
            this.b = new AtomicBoolean(false);
            this.c = new AtomicBoolean(false);
            this.a = Selector.open();
            ServerSocketChannel open = ServerSocketChannel.open();
            open.configureBlocking(false);
            open.socket().bind(new DatagramSocket(i), 1024);
            open.register(this.a, 16);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ks() {
        String[] strArr = new String[]{null};
        while (!this.b.get()) {
            try {
                this.a.select(0);
                Iterator it = this.a.selectedKeys().iterator();
                while (it.hasNext()) {
                    SelectionKey selectionKey = (SelectionKey) it.next();
                    try {
                        if (selectionKey.isValid()) {
                            if (selectionKey.isAcceptable()) {
                                SocketChannel accept = ((ServerSocketChannel) selectionKey.channel()).accept();
                                accept.configureBlocking(false);
                                accept.register(this.a, 1);
                            }
                            if (selectionKey.isReadable()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                                ByteBuffer allocate = ByteBuffer.allocate(1048576);
                                while (true) {
                                    allocate.clear();
                                    int read = socketChannel.read(allocate);
                                    if (read == 0) {
                                        break;
                                    } else if (-1 == read) {
                                        selectionKey.cancel();
                                        socketChannel.close();
                                        break;
                                    } else {
                                        allocate.flip();
                                        byte[] bArr = new byte[allocate.remaining()];
                                        allocate.get(bArr);
                                        stringBuffer.append(new String(bArr));
                                    }
                                }
                                String stringBuffer2 = stringBuffer.toString();
                                Object obj = (TextUtils.isEmpty(stringBuffer2) || !(stringBuffer2.contains("GET") || stringBuffer2.contains("POST"))) ? null : 1;
                                if (obj != null) {
                                    this.c.set(true);
                                    selectionKey.channel().register(this.a, 4);
                                    strArr[0] = stringBuffer2;
                                }
                            }
                            if (selectionKey.isWritable()) {
                                a(selectionKey, strArr[0]);
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        if (selectionKey != null) {
                            try {
                                selectionKey.cancel();
                                if (selectionKey.channel() != null) {
                                    selectionKey.channel().close();
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    it.remove();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        Selector selector = this.a;
        if (selector != null) {
            try {
                selector.close();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public boolean sc(SelectionKey selectionKey, Object obj, Object obj2, Object obj3, Object obj4) {
        try {
            byte[] toBytes = toBytes(obj2, null, null);
            if (toBytes == null) {
                return false;
            }
            String obj5;
            if (obj3 != null) {
                obj5 = obj3.toString();
            } else {
                obj5 = this.contentType;
                if (obj5 == null) {
                    obj5 = "text/html;charset=UTF-8";
                }
            }
            a(selectionKey, s.d(obj), toBytes, obj5, s.b(obj4));
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }
}