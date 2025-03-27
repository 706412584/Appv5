package i.app;

import i.app.ClientsUDP.OnMessagesListener;
import java.net.DatagramSocket;

public class 数据报 extends ClientsUDP {
    public 数据报(int i, OnMessagesListener onMessagesListener) {
        super(i, onMessagesListener);
    }

    public 数据报(String str, int i, int i2, OnMessagesListener onMessagesListener) {
        super(str, i, i2, onMessagesListener);
    }

    public String ip() {
        return super.ip();
    }

    /* renamed from: 关闭 */
    public void m491() {
        super.gb();
    }

    /* renamed from: 开始 */
    public void m492() {
        super.ks();
    }

    /* renamed from: 数据长度 */
    public void m493(Object obj) {
        super.sjcd(obj);
    }

    /* renamed from: 是否关闭 */
    public boolean m467() {
        return super.sfgb();
    }

    /* renamed from: 本机ip */
    public String m469ip() {
        return super.bjip();
    }

    /* renamed from: 本机端口 */
    public int m470() {
        return super.bjdk();
    }

    /* renamed from: 端口 */
    public int m494() {
        return super.dk();
    }

    /* renamed from: 输出 */
    public boolean m495(Object obj) {
        return super.sc(obj);
    }

    /* renamed from: 输出 */
    public boolean m496(Object obj, Object obj2, Object obj3) {
        return super.sc(obj, obj2, obj3);
    }

    /* renamed from: 连接 */
    public DatagramSocket m497() {
        return super.lj();
    }
}