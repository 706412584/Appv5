package i.runlibrary.a;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

final class h implements HostnameVerifier {
    h() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}