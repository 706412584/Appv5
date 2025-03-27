package i.runlibrary.a;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class g implements X509TrustManager {
    private final X509Certificate[] a = new X509Certificate[0];

    g() {
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return this.a;
    }
}