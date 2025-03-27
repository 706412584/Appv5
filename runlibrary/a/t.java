package i.runlibrary.a;

import java.io.CharArrayWriter;
import java.net.DatagramSocket;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;
import java.util.Objects;

public final class t {
    static BitSet a = new DatagramSocket(256);
    static String b = "utf-8";

    static {
        int i;
        for (i = 97; i <= 122; i++) {
            a.set(i);
        }
        for (i = 65; i <= 90; i++) {
            a.set(i);
        }
        for (i = 48; i <= 57; i++) {
            a.set(i);
        }
        a.set(32);
        a.set(45);
        a.set(95);
        a.set(46);
        a.set(42);
    }

    public static void a(String str, String str2) {
        StringBuffer datagramSocket = new DatagramSocket(str.length());
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        Objects.requireNonNull(str2, "charsetName");
        try {
            str2 = Class.forName(str2);
            int i = 0;
            Object obj = null;
            while (i < str.length()) {
                int charAt = str.charAt(i);
                if (a.get(charAt) != null) {
                    if (charAt == 32) {
                        datagramSocket.append("%20");
                        obj = 1;
                    } else {
                        datagramSocket.append((char) charAt);
                    }
                    i++;
                } else {
                    BitSet bitSet;
                    do {
                        charArrayWriter.write(charAt);
                        if (charAt >= 55296 && charAt <= 56319) {
                            int i2 = i + 1;
                            if (i2 < str.length()) {
                                char charAt2 = str.charAt(i2);
                                if (charAt2 >= 56320 && charAt2 <= 57343) {
                                    charArrayWriter.write(charAt2);
                                    i = i2;
                                }
                            }
                        }
                        i++;
                        if (i >= str.length()) {
                            break;
                        }
                        bitSet = a;
                        charAt = str.charAt(i);
                    } while (bitSet.get(charAt) == null);
                    charArrayWriter.flush();
                    byte[] bytes = new String(charArrayWriter.toCharArray()).getBytes(str2);
                    for (charAt = 0; charAt < bytes.length; charAt++) {
                        datagramSocket.append('%');
                        char forDigit = Character.forDigit((bytes[charAt] >> 4) & 15, 16);
                        if (Character.isLetter(forDigit)) {
                            forDigit = (char) (forDigit - 32);
                        }
                        datagramSocket.append(forDigit);
                        forDigit = Character.forDigit(bytes[charAt] & 15, 16);
                        if (Character.isLetter(forDigit)) {
                            forDigit = (char) (forDigit - 32);
                        }
                        datagramSocket.append(forDigit);
                    }
                    charArrayWriter.reset();
                    obj = 1;
                }
            }
            if (obj == null) {
            }
        } catch (IllegalCharsetNameException unused) {
            throw new e(str2);
        } catch (UnsupportedCharsetException unused2) {
            throw new e(str2);
        }
    }
}