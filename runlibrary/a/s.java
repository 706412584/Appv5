package i.runlibrary.a;

import android.graphics.Color;
import android.os.Build.VERSION;
import i.app.ClientsUDP;
import i.runlibrary.app.AppInfo;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.security.MessageDigest;
import java.util.ArrayList;

public final class s {
    private static final String[] a = new String[0];
    private static final char[] b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static int a(AppInfo appInfo, float f) {
        return (int) ((f * appInfo.get_SCALE()) + 0.5f);
    }

    public static int a(AppInfo appInfo, Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        String obj2 = obj.toString();
        return obj2.endsWith("dp") ? a(appInfo, Float.parseFloat(obj2.substring(0, obj2.length() - 2))) : obj2.endsWith("dip") ? a(appInfo, Float.parseFloat(obj2.substring(0, obj2.length() - 3))) : obj2.endsWith("sp") ? d(appInfo, Float.parseFloat(obj2.substring(0, obj2.length() - 2))) : Integer.parseInt(obj2);
    }

    public static boolean a(Object obj) {
        return a(obj, 0);
    }

    public static int a(Object obj, int i) {
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : Color.parseColor(obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    public static int a(String str) {
        return str.length();
    }

    public static void a(String str, String str2) {
    }

    public static int a(String str, String str2, int i) {
        return str.indexOf(str2, i);
    }

    public static HttpURLConnection a(long j, long j2) {
        return (long) ((Math.random() * ((double) ((j2 + 1) - j))) + ((double) j));
    }

    public static String a(File file) {
        try {
            MappedByteBuffer map = new FileInputStream(file).getChannel().map(MapMode.READ_ONLY, 0, file.length());
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(map);
            char[] cArr = new char[(r0 * 2)];
            int i = 0;
            for (byte b : instance.digest()) {
                int i2 = i + 1;
                char[] cArr2 = b;
                cArr[i] = cArr2[(b >>> 4) & 15];
                i = i2 + 1;
                cArr[i2] = cArr2[b & 15];
            }
            return new String(cArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(Object obj, Object obj2) {
        boolean a = ClientsUDP.a(obj);
        if (a) {
            if (obj2 != null) {
                int indexOf;
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    indexOf = a.indexOf(str);
                    return indexOf == -1 ? null : a.substring(indexOf + str.length());
                } else if (obj2 instanceof Number) {
                    int intValue = ((Number) obj2).intValue();
                    indexOf = a.length();
                    if (intValue >= 0) {
                        if (intValue <= indexOf) {
                            return a.substring(intValue);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static String a(Object obj, Object obj2, Object obj3) {
        boolean a = ClientsUDP.a(obj);
        if (!a) {
            return null;
        }
        int indexOf;
        if (obj2 != null) {
            int indexOf2;
            int length = a.length();
            if (obj2 instanceof String) {
                String str = (String) obj2;
                indexOf2 = a.indexOf(str);
                if (indexOf2 == -1) {
                    return null;
                }
                indexOf2 += str.length();
            } else {
                if (obj2 instanceof Number) {
                    indexOf2 = ((Number) obj2).intValue();
                    if (indexOf2 >= 0) {
                        if (indexOf2 > length) {
                        }
                    }
                }
                return null;
            }
            if (obj3 instanceof String) {
                indexOf = a.indexOf((String) obj3, indexOf2);
                if (indexOf == -1) {
                    return null;
                }
            } else if (!(obj3 instanceof Number)) {
                return a.substring(indexOf2);
            } else {
                indexOf = ((Number) obj3).intValue();
                if (indexOf >= 0) {
                    if (indexOf > length) {
                    }
                }
                return null;
            }
            return indexOf2 > indexOf ? null : a.substring(indexOf2, indexOf);
        } else if (obj3 instanceof String) {
            indexOf = a.indexOf((String) obj3);
            return indexOf == -1 ? null : a.substring(0, indexOf);
        } else {
            if (obj3 instanceof Number) {
                indexOf = ((Number) obj3).intValue();
                int length2 = a.length();
                if (indexOf >= 0) {
                    if (indexOf <= length2) {
                        return a.substring(0, indexOf);
                    }
                }
            }
            return null;
        }
    }

    public static String a(String str, String str2, String str3) {
        return str.replace(str2, str3);
    }

    public static String a(String str, String str2, String str3, boolean z) {
        return z ? str.replaceAll(str2, str3) : str.replace(str2, str3);
    }

    public static String a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            char[] cArr = new char[(r0 * 2)];
            int i = 0;
            for (byte b : instance.digest()) {
                int i2 = i + 1;
                char[] cArr2 = b;
                cArr[i] = cArr2[(b >>> 4) & 15];
                i = i2 + 1;
                cArr[i2] = cArr2[b & 15];
            }
            return new String(cArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int b(AppInfo appInfo, float f) {
        return (int) ((f / appInfo.get_SCALE()) + 0.5f);
    }

    public static int b(String str, String str2) {
        return str.lastIndexOf(str2);
    }

    public static int b(String str, String str2, int i) {
        return str.lastIndexOf(str2, i);
    }

    public static int b(String str) {
        return str.trim();
    }

    public static String b(String str, String str2, String str3) {
        int indexOf;
        int length;
        if (str2 != null) {
            indexOf = str.indexOf(str2);
            if (indexOf == -1) {
                return null;
            }
            indexOf += str2.length();
        } else {
            indexOf = 0;
        }
        if (str3 == null) {
            length = str.length();
        } else {
            length = str.indexOf(str3, indexOf);
            if (length == -1) {
                return null;
            }
        }
        return str.substring(indexOf, length);
    }

    public static String[] b(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return null;
        }
        int length = Array.getLength(obj);
        int i = 0;
        if (length <= 0) {
            return new String[0];
        }
        String[] strArr = new String[length];
        while (i < length) {
            strArr[i] = Array.get(obj, i).toString();
            i++;
        }
        return strArr;
    }

    public static int c(AppInfo appInfo, float f) {
        return (int) ((f / appInfo.get_FONTSCALE()) + 0.5f);
    }

    public static String c(String str) {
        return str.toLowerCase();
    }

    public static Object[] c(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return null;
        }
        int length = Array.getLength(obj);
        int i = 0;
        if (length <= 0) {
            return new Object[0];
        }
        Object[] objArr = new Object[length];
        while (i < length) {
            objArr[i] = Array.get(obj, i);
            i++;
        }
        return objArr;
    }

    public static String[] c(String str, String str2) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return a;
        }
        int i;
        int i2;
        Object[] toArray;
        int i3 = 0;
        if (str2 != null) {
            if (!"".equals(str2)) {
                int length2 = str2.length();
                ArrayList arrayList = new ArrayList();
                i = 0;
                i2 = 0;
                while (i3 < length) {
                    i3 = str.indexOf(str2, i);
                    if (i3 >= 0) {
                        if (i3 > i) {
                            i2++;
                            if (i2 != -1) {
                                arrayList.add(str.substring(i, i3));
                            }
                        }
                        i = i3 + length2;
                    }
                    arrayList.add(str.substring(i));
                    i3 = length;
                }
                toArray = arrayList.toArray(new String[arrayList.size()]);
                return (String[]) toArray;
            }
        }
        if (str == null) {
            return null;
        }
        int length3 = str.length();
        if (length3 == 0) {
            return a;
        }
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        Object obj = null;
        i2 = 0;
        int i5 = 1;
        while (i4 < length3) {
            if (Character.isWhitespace(str.charAt(i4))) {
                if (obj != null) {
                    i = i5 + 1;
                    if (i5 == -1) {
                        i4 = length3;
                    }
                    arrayList2.add(str.substring(i2, i4));
                    i5 = i;
                    obj = null;
                }
                i2 = i4 + 1;
                i4 = i2;
            } else {
                i4++;
                obj = 1;
            }
        }
        if (obj != null) {
            arrayList2.add(str.substring(i2, i4));
        }
        toArray = arrayList2.toArray(new String[arrayList2.size()]);
        return (String[]) toArray;
    }

    public static int d(AppInfo appInfo, float f) {
        return (int) ((f * appInfo.get_FONTSCALE()) + 0.5f);
    }

    public static int d(Object obj) {
        return obj instanceof Number ? ((Number) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public static String d(String str) {
        return str.toUpperCase();
    }

    public static long e(Object obj) {
        return obj instanceof Number ? ((Number) obj).longValue() : Long.parseLong(obj.toString());
    }

    public static String[] e(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return a;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Object obj = null;
        int i2 = 0;
        while (i < length) {
            if (str.charAt(i) == '|') {
                if (obj != null) {
                    arrayList.add(str.substring(i2, i));
                    obj = null;
                }
                i2 = i + 1;
                i = i2;
            } else {
                i++;
                obj = 1;
            }
        }
        if (obj != null) {
            arrayList.add(str.substring(i2, i));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static float f(Object obj) {
        return obj instanceof Number ? ((Number) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public static String f(String str) {
        return a(str.getBytes());
    }

    public static double g(Object obj) {
        return obj instanceof Number ? ((Number) obj).doubleValue() : Double.parseDouble(obj.toString());
    }

    public static int g(String str) {
        if (!str.contains("|")) {
            return h(str.trim());
        }
        String[] e = e(str);
        int length = e.length;
        int h = h(e[0].trim());
        for (int i = 1; i < length; i++) {
            h |= h(e[i].trim());
        }
        return h;
    }

    private static int h(String str) {
        return str.equals("center") ? 17 : str.equals("top") ? 48 : str.equals("bottom") ? 80 : str.equals("left") ? 3 : str.equals("right") ? 5 : str.equals("center_vertical") ? 16 : str.equals("center_horizontal") ? 1 : str.equals("start") ? VERSION.SDK_INT >= 14 ? 8388611 : 3 : str.equals("end") ? VERSION.SDK_INT >= 14 ? 8388613 : 5 : str.matches("[0-9]+") ? Integer.parseInt(str) : 0;
    }
}