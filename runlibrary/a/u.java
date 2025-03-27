package i.runlibrary.a;

import i.app.Downcenter;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class u {
    private static int a(String str) {
        return str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
    }

    private static int a(String str, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2;
            }
        }
        return i;
    }

    private static int a(String str, int i, int i2) {
        for (i2--; i2 >= i; i2--) {
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2 + 1;
            }
        }
        return i;
    }

    private static int a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static int a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0163 A:{LOOP_END, LOOP:1: B:61:0x015d->B:63:0x0163} */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static String a(URI uri, String str) {
        String str2;
        String host;
        int a;
        Set set;
        StringBuffer append;
        int d;
        String substring;
        String str3 = str;
        String scheme = uri.getScheme();
        List<String> arrayList = new ArrayList();
        arrayList.add("");
        int a2 = a(str3, str.length());
        int a3 = a(str3, a2, str.length());
        int b = b(str3, a2, a3);
        String str4 = "http";
        String str5 = "https";
        if (b != -1) {
            if (str.regionMatches(true, a2, "https:", 0, 6)) {
                a2 += 6;
                str2 = str5;
            } else {
                if (str.regionMatches(true, a2, "http:", 0, 5)) {
                    a2 += 5;
                    str2 = str4;
                } else {
                    throw new e(new e("Expected URL scheme 'http' or 'https' but was '").append(str3.substring(0, b)).append("'").toString());
                }
            }
        } else if (scheme != null) {
            str2 = scheme;
        } else {
            throw new e("Expected URL scheme 'http' or 'https' but no colon was found");
        }
        int c = c(str3, a2, a3);
        if (c < 2) {
            if (scheme.equals(str2)) {
                host = uri.getHost();
                b = uri.getPort();
                if (b == -1) {
                    b = a.a(str2);
                }
                arrayList.clear();
                arrayList.addAll(Downcenter.a(uri.toString(), scheme));
                a = a(str3, a2, a3, "?#");
                a((List) arrayList, str3, a2, a);
                set = null;
                if (a < a3 && str3.charAt(a) == '?') {
                    set = a.b(str3.substring(a + 1, a(str3, a, a3, '#')));
                }
                append = new StringBuffer().append(str2).append("://").append(host);
                if (!((b == 80 && str2.equals(str4)) || (b == 443 && str2.equals(str5)))) {
                    append.append(':').append(b);
                }
                for (String append2 : arrayList) {
                    append.append('/').append(append2);
                }
                if (set != null) {
                    int i = 0;
                    for (String str6 : set) {
                        if (i == 0) {
                            append.append('?').append(str6);
                        } else if (i == 1) {
                            append.append('=').append(str6);
                            i = 2;
                        } else if (i == 2) {
                            append.append('&').append(str6);
                        }
                        i = 1;
                    }
                }
                return append.toString();
            }
        }
        a2 += c;
        while (true) {
            c = a(str3, a2, a3, "@/\\?#");
            char charAt = c != a3 ? str3.charAt(c) : 65535;
            if (charAt == 65535 || charAt == '#' || charAt == '/' || charAt == '\\' || charAt == '?') {
                d = d(str3, a2, c);
                b = d + 1;
            } else if (charAt == '@') {
                a2 = c + 1;
            }
        }
        d = d(str3, a2, c);
        b = d + 1;
        if (b < c) {
            substring = str3.substring(a2, d);
            a = e(str3, b, c);
            if (a != -1) {
                b = a;
            } else {
                throw new e(new e("Invalid URL port: \"").append(str3.substring(b, c)).append('\"').toString());
            }
        }
        String substring2 = str3.substring(a2, d);
        b = a.a(str2);
        substring = substring2;
        if (substring != null) {
            a2 = c;
            host = substring;
            a = a(str3, a2, a3, "?#");
            a((List) arrayList, str3, a2, a);
            set = null;
            set = a.b(str3.substring(a + 1, a(str3, a, a3, '#')));
            append = new StringBuffer().append(str2).append("://").append(host);
            append.append(':').append(b);
            while (r0.hasNext()) {
            }
            if (set != null) {
            }
            return append.toString();
        }
        throw new e(new e("Invalid URL host: \"").append(str3.substring(a2, d)).append('\"').toString());
    }

    private static void a(String str, String str2) {
        int indexOf = str.indexOf(47, str2.length() + 3);
        int a = a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a) {
            indexOf++;
            int a2 = a(str, indexOf, a, '/');
            arrayList.add(str.substring(indexOf, a2));
            indexOf = a2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b7 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(List list, String str, int i, int i2) {
        if (i != i2) {
            char charAt = str.charAt(i);
            String str2 = "";
            if (charAt != '/') {
                if (charAt != '\\') {
                    list.set(list.size() - 1, str2);
                    while (i < i2) {
                        Object obj;
                        int a = a(str, i, i2, "/\\");
                        Object obj2 = null;
                        Object obj3 = a < i2 ? 1 : null;
                        String substring = str.substring(i, a);
                        if (!substring.equals(".")) {
                            if (!substring.equalsIgnoreCase("%2e")) {
                                obj = null;
                                if (obj == null) {
                                    if (substring.equals("..") || substring.equalsIgnoreCase("%2e.") || substring.equalsIgnoreCase(".%2e") || substring.equalsIgnoreCase("%2e%2e")) {
                                        obj2 = 1;
                                    }
                                    if (obj2 == null) {
                                        if (((String) list.get(list.size() - 1)).isEmpty()) {
                                            list.set(list.size() - 1, substring);
                                        } else {
                                            list.add(substring);
                                        }
                                        if (obj3 != null) {
                                        }
                                    } else if (((String) list.remove(list.size() - 1)).isEmpty() && !list.isEmpty()) {
                                        list.set(list.size() - 1, str2);
                                    }
                                    list.add(str2);
                                }
                                if (obj3 == null) {
                                    a++;
                                }
                                i = a;
                            }
                        }
                        obj = 1;
                        if (obj == null) {
                        }
                        if (obj3 == null) {
                        }
                        i = a;
                    }
                }
            }
            list.clear();
            list.add(str2);
            i++;
            while (i < i2) {
            }
        }
    }

    private static int b(String str, int i, int i2) {
        if (i2 - i < 2) {
            return -1;
        }
        char charAt = str.charAt(i);
        if (charAt < 'a' || charAt > 'z') {
            if (charAt >= 'A') {
                if (charAt > 'Z') {
                }
            }
            return -1;
        }
        while (true) {
            i++;
            if (i >= i2) {
                break;
            }
            charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '+' || charAt == '-' || charAt == '.'))) {
                if (charAt == ':') {
                    return i;
                }
            }
        }
        return -1;
    }

    private static int b(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            Object substring;
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 != -1) {
                if (indexOf2 <= indexOf) {
                    arrayList.add(str.substring(i, indexOf2));
                    substring = str.substring(indexOf2 + 1, indexOf);
                    arrayList.add(substring);
                    i = indexOf + 1;
                }
            }
            arrayList.add(str.substring(i, indexOf));
            substring = null;
            arrayList.add(substring);
            i = indexOf + 1;
        }
        return arrayList;
    }

    private static int c(String str, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\\' && charAt != '/') {
                break;
            }
            i3++;
            i++;
        }
        return i3;
    }

    private static int d(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt == ':') {
                return i;
            }
            if (charAt == '[') {
                do {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } while (str.charAt(i) != ']');
            }
            i++;
        }
        return i2;
    }

    private static int e(String str, int i, int i2) {
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            return (parseInt <= 0 || parseInt > 65535) ? -1 : parseInt;
        } catch (NumberFormatException unused) {
        }
    }
}