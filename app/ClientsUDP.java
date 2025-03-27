package i.app;

import i.runlibrary.a.o;
import i.runlibrary.a.s;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientsUDP {
    private DatagramSocket a = null;
    private InetAddress b = null;
    public String bm = "utf-8";
    private int c;
    private byte[] d = new byte[6144];
    private OnMessagesListener e = null;

    public interface OnMessagesListener {
        void Message(ClientsUDP clientsUDP, DatagramPacket datagramPacket, byte[] bArr, String str, int i);
    }

    public ClientsUDP(int i, OnMessagesListener onMessagesListener) {
        this.e = onMessagesListener;
        try {
            this.a = new DatagramSocket(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ClientsUDP(String str, int i, int i2, OnMessagesListener onMessagesListener) {
        this.e = onMessagesListener;
        try {
            this.a = new DatagramSocket(i2);
            this.b = InetAddress.getByName(str);
            this.c = i;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean a(Object obj) {
        byte[] toBytes = o.toBytes(obj, this.bm, null);
        if (toBytes != null) {
            try {
                this.a.send(new DatagramPacket(toBytes, toBytes.length, this.b, this.c));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public int bjdk() {
        return this.a.getLocalPort();
    }

    public String bjip() {
        return this.a.getLocalAddress().getHostAddress();
    }

    public int dk() {
        return this.a.getPort();
    }

    public void gb() {
        DatagramSocket datagramSocket = this.a;
        if (!(datagramSocket == null || datagramSocket.isClosed())) {
            try {
                this.a.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String ip() {
        return this.a.getInetAddress().getHostAddress();
    }

    public void ks() {
        byte[] bArr = this.d;
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
        while (!this.a.isClosed()) {
            try {
                this.a.receive(datagramPacket);
                int length = datagramPacket.getLength();
                if (length > 0) {
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(datagramPacket.getData(), 0, bArr2, 0, length);
                    this.e.Message(this, datagramPacket, bArr2, datagramPacket.getAddress().getHostAddress(), datagramPacket.getPort());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public DatagramSocket lj() {
        return this.a;
    }

    public boolean sc(Object obj) {
        return a(obj);
    }

    public boolean sc(Object obj, Object obj2, Object obj3) {
        try {
            this.b = InetAddress.getByName(obj.toString());
            this.c = s.d(obj2);
            return a(obj3);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean sfgb() {
        return this.a.isClosed();
    }

    public void sjcd(Object obj) {
        this.d = new byte[s.d(obj)];
    }
}