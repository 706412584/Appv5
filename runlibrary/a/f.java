package i.runlibrary.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import i.app.Downcenter;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Random;
import java.util.zip.ZipOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.X509TrustManager;

public final class f {
    private static CookieManager a;
    private static X509TrustManager[] b;

    /*  JADX ERROR: NullPointerException in pass: BlockSplitter
        java.lang.NullPointerException: Attempt to invoke virtual method 'boolean jadx.core.dex.attributes.AttrNode.contains(jadx.core.dex.attributes.AType)' on a null object reference
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.connectExceptionHandlers(Unknown Source:64)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.setupConnections(Unknown Source:58)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.splitBasicBlocks(Unknown Source:22)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(Unknown Source:13)
        	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:9)
        	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:41)
        	at jadx.core.ProcessClass.process(Unknown Source:54)
        	at jadx.core.ProcessClass.processDependencies(Unknown Source:22)
        	at jadx.core.ProcessClass.process(Unknown Source:68)
        	at jadx.api.JadxDecompiler.processClass(Unknown Source:4)
        	at jadx.api.JavaClass.decompile(Unknown Source:19)
        */
    public static int a(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
        r0 = 0;
        i.runlibrary.a.d.a(r8, r0);
        r1 = new java.io.File;
        r1.<init>(r8);
        r8 = new java.io.File;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r1.getParent();
        r2 = r2.append(r3);
        r3 = "/";
        r2 = r2.append(r3);
        r3 = new java.util.Random;
        r3.<init>();
        r3 = r3.nextLong();
        r2 = r2.append(r3);
        r3 = ".xzz";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r8.<init>(r2);
        r2 = 0;
        r3 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x0071, IOException -> 0x006b }
        r7 = i.runlibrary.a.a.b(r7);	 Catch:{ MalformedURLException -> 0x0071, IOException -> 0x006b }
        r3.<init>(r7);	 Catch:{ MalformedURLException -> 0x0071, IOException -> 0x006b }
        r7 = r3.openConnection();	 Catch:{ MalformedURLException -> 0x0071, IOException -> 0x006b }
        r3 = r7 instanceof javax.net.ssl.HttpsURLConnection;	 Catch:{ MalformedURLException -> 0x0069, IOException -> 0x0067 }
        if (r3 == 0) goto L_0x0050;	 Catch:{ MalformedURLException -> 0x0069, IOException -> 0x0067 }
    L_0x004a:
        r3 = r7;	 Catch:{ MalformedURLException -> 0x0069, IOException -> 0x0067 }
        r3 = (javax.net.ssl.HttpsURLConnection) r3;	 Catch:{ MalformedURLException -> 0x0069, IOException -> 0x0067 }
        a(r3);	 Catch:{ MalformedURLException -> 0x0069, IOException -> 0x0067 }
    L_0x0050:
        r3 = r1.exists();	 Catch:{ MalformedURLException -> 0x0069, IOException -> 0x0067 }
        if (r3 == 0) goto L_0x0076;	 Catch:{ MalformedURLException -> 0x0069, IOException -> 0x0067 }
    L_0x0056:
        if (r9 != 0) goto L_0x0076;	 Catch:{ MalformedURLException -> 0x0069, IOException -> 0x0067 }
    L_0x0058:
        r9 = r7.getContentLength();	 Catch:{ MalformedURLException -> 0x0069, IOException -> 0x0067 }
        r3 = (long) r9;	 Catch:{ MalformedURLException -> 0x0069, IOException -> 0x0067 }
        r5 = r1.length();	 Catch:{ MalformedURLException -> 0x0069, IOException -> 0x0067 }
        r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r9 != 0) goto L_0x0076;
    L_0x0065:
        r7 = 1;
        return r7;
        r9 = move-exception;
        goto L_0x006d;
        r9 = move-exception;
        goto L_0x0073;
        r9 = move-exception;
        r7 = r2;
    L_0x006d:
        r9.printStackTrace();
        goto L_0x0076;
        r9 = move-exception;
        r7 = r2;
    L_0x0073:
        r9.printStackTrace();
    L_0x0076:
        r9 = -1;
        if (r7 != 0) goto L_0x007a;
    L_0x0079:
        return r9;
    L_0x007a:
        r7 = r7.getInputStream();	 Catch:{ IOException -> 0x00f3 }
        r8.createNewFile();	 Catch:{ IOException -> 0x00ee }
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r3 = new byte[r3];	 Catch:{ IOException -> 0x00ad }
        r4 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00ad }
        r4.<init>(r8);	 Catch:{ IOException -> 0x00ad }
    L_0x008a:
        r2 = r7.read(r3);	 Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
        if (r2 == r9) goto L_0x0094;	 Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
    L_0x0090:
        r4.write(r3, r0, r2);	 Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
        goto L_0x008a;
    L_0x0094:
        r4.close();	 Catch:{ IOException -> 0x0098 }
        goto L_0x009c;
        r9 = move-exception;
        r9.printStackTrace();
    L_0x009c:
        r7.close();	 Catch:{ IOException -> 0x00a0 }
        goto L_0x00c9;
        r7 = move-exception;
        r7.printStackTrace();
        goto L_0x00c9;
        r8 = move-exception;
        r2 = r4;
        goto L_0x00dd;
        r0 = move-exception;
        r2 = r4;
        goto L_0x00ae;
        r8 = move-exception;
        goto L_0x00dd;
        r0 = move-exception;
    L_0x00ae:
        r0.printStackTrace();	 Catch:{ all -> 0x00ab }
        r8.delete();	 Catch:{ Exception -> 0x00b5 }
        goto L_0x00b8;
    L_0x00b5:
        r0.printStackTrace();
    L_0x00b8:
        r2.close();	 Catch:{ IOException -> 0x00bc }
        goto L_0x00c0;
        r0 = move-exception;
        r0.printStackTrace();
    L_0x00c0:
        r7.close();	 Catch:{ IOException -> 0x00c4 }
        goto L_0x00c8;
        r7 = move-exception;
        r7.printStackTrace();
    L_0x00c8:
        r0 = -1;
    L_0x00c9:
        if (r0 != 0) goto L_0x00dc;
    L_0x00cb:
        r7 = r1.exists();
        if (r7 == 0) goto L_0x00d4;
    L_0x00d1:
        r1.delete();
    L_0x00d4:
        r8.renameTo(r1);	 Catch:{ Exception -> 0x00d8 }
        goto L_0x00dc;
        r7 = move-exception;
        r7.printStackTrace();
    L_0x00dc:
        return r0;
    L_0x00dd:
        r2.close();	 Catch:{ IOException -> 0x00e1 }
        goto L_0x00e5;
        r9 = move-exception;
        r9.printStackTrace();
    L_0x00e5:
        r7.close();	 Catch:{ IOException -> 0x00e9 }
        goto L_0x00ed;
        r7 = move-exception;
        r7.printStackTrace();
    L_0x00ed:
        throw r8;
        r7 = move-exception;
        r7.printStackTrace();
        return r9;
        r7 = move-exception;
        r7.printStackTrace();
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: i.runlibrary.a.f.a(java.lang.String, java.lang.String, boolean):int");
    }

    public static int a(String str, String str2, boolean z, String[] strArr, String str3, String str4, boolean z2, String str5) {
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        String str9 = str5;
        int i = 0;
        d.a(str6, false);
        File eVar = new e(str6);
        File eVar2 = new e(eVar.getParent() + "/" + new Random().nextLong() + ".xzz");
        try {
            URL eVar3 = new e(a.b(str));
            HttpURLConnection a = a(eVar3);
            if (str9 != null) {
                for (String str10 : str9.split("\\|\\|")) {
                    int indexOf = str10.indexOf(61);
                    if (indexOf != -1) {
                        a.setRequestProperty(str10.substring(0, indexOf).trim(), str10.substring(indexOf + 1).trim());
                    }
                }
            }
            if (str8 != null) {
                a.setRequestProperty("Cookie", str8);
            } else if (z2) {
                a(a, eVar3.toURI());
            }
            a(a, strArr, str7);
            int responseCode = a.getResponseCode();
            int i2 = 0;
            while (responseCode >= 300 && responseCode < 400 && i2 <= 8) {
                a().put(eVar3.toURI(), a.getHeaderFields());
                String headerField = a.getHeaderField("Location");
                if (headerField == null) {
                    break;
                }
                URL eVar4 = new e(a.b(u.a(eVar3.toURI(), headerField)));
                a.disconnect();
                a = a(eVar4);
                a(a, eVar4.toURI());
                a(a, null, str7);
                i2++;
                URL url = eVar4;
                responseCode = a.getResponseCode();
                eVar3 = url;
            }
            if (responseCode == 200) {
                if (z2) {
                    a().put(eVar3.toURI(), a.getHeaderFields());
                }
                InputStream inputStream = a.getInputStream();
                if (eVar.exists() && !z && (((long) inputStream.available()) == eVar.length() || ((long) a.getContentLength()) == eVar.length())) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return 1;
                }
                eVar2.createNewFile();
                byte[] bArr = new byte[1024];
                FileOutputStream fileInputStream = new FileInputStream(eVar2);
                while (true) {
                    i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    fileInputStream.write(bArr, 0, i2);
                }
                if (eVar.exists()) {
                    eVar.delete();
                }
                eVar2.renameTo(eVar);
                inputStream.close();
                fileInputStream.close();
                return i;
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                eVar2.delete();
            } catch (Exception unused) {
                e.printStackTrace();
            }
        }
        i = -1;
        return i;
    }

    public static int a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 7;
        Object obj = null;
        while (i < 17) {
            if (obj == null && bArr[i] != (byte) 0) {
                obj = 1;
            }
            if (obj != null) {
                stringBuilder.append(bArr[i]);
            }
            i++;
        }
        if (stringBuilder.length() > 0) {
            try {
                return Integer.parseInt(stringBuilder.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        String str2 = ";";
        String str3 = "=";
        String str4 = "";
        if (str.equals("cookie")) {
            for (HttpCookie httpCookie : a().getCookieStore().getCookies()) {
                str4 = str4 + httpCookie.getName() + str3 + httpCookie.getValue() + str2;
            }
            return str4;
        }
        if (str.equals("del cookie")) {
            a = null;
        } else {
            try {
                URI eVar = new e(str);
                CookieStore cookieStore = a().getCookieStore();
                String toLowerCase = eVar.getHost().toLowerCase();
                for (HttpCookie httpCookie2 : cookieStore.getCookies()) {
                    String toLowerCase2 = httpCookie2.getDomain().toLowerCase();
                    if ((toLowerCase2.startsWith(".") && toLowerCase.endsWith(toLowerCase2.substring(1))) || toLowerCase.endsWith(toLowerCase2)) {
                        str4 = str4 + httpCookie2.getName() + str3 + httpCookie2.getValue() + str2;
                    }
                }
                return str4;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public static String a(String str, String str2, String str3) {
        if (str3 == null) {
            str3 = "utf-8";
        }
        try {
            URL eVar = new e(a.b(str));
            return a(eVar, a(eVar), str2, str3, false);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str, String str2, String str3, String str4) {
        try {
            URL eVar = new e(a.b(str));
            HttpURLConnection a = a(eVar);
            a.setConnectTimeout(20000);
            a.setReadTimeout(20000);
            if (str4 != null) {
                a.setRequestProperty("Cookie", str4);
            }
            return a(eVar, a, str2, str3, false);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str, String str2, String str3, String str4, boolean z) {
        try {
            URL eVar = new e(a.b(str));
            HttpURLConnection a = a(eVar);
            a.setConnectTimeout(20000);
            a.setReadTimeout(20000);
            if (str4 != null) {
                a.setRequestProperty("Cookie", str4);
            } else if (z) {
                a(a, eVar.toURI());
            }
            return a(eVar, a, str2, str3, z);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str, String str2, String str3, String str4, boolean z, String str5, int i, int i2, String str6) {
        try {
            URLConnection openConnection;
            URL eVar = new e(a.b(str));
            if (str6 == null) {
                openConnection = eVar.openConnection();
            } else {
                int indexOf = str6.indexOf(58);
                if (indexOf != -1) {
                    String substring = str6.substring(0, indexOf);
                    indexOf = Integer.parseInt(str6.substring(indexOf + 1));
                    str6 = substring;
                } else {
                    indexOf = 80;
                }
                openConnection = eVar.openConnection(new Proxy(Type.HTTP, new Socket(str6, indexOf)));
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty("User-Agent", "Apache-HttpClient/UNAVAILABLE (java 1.4)");
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            if (str5 != null) {
                for (String str7 : str5.split("\\|\\|")) {
                    int indexOf2 = str7.indexOf(61);
                    if (indexOf2 != -1) {
                        httpURLConnection.setRequestProperty(str7.substring(0, indexOf2).trim(), str7.substring(indexOf2 + 1).trim());
                    }
                }
            }
            if (str4 != null) {
                httpURLConnection.setRequestProperty("Cookie", str4);
            } else if (z) {
                a(httpURLConnection, eVar.toURI());
            }
            return a(eVar, httpURLConnection, str2, str3, z);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str, String[] strArr, String str2) {
        if (str2 == null) {
            str2 = "utf-8";
        }
        try {
            URL eVar = new e(a.b(str));
            return a(eVar, a(eVar), strArr, str2, false);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str, String[] strArr, String str2, String str3) {
        try {
            URL eVar = new e(a.b(str));
            HttpURLConnection a = a(eVar);
            a.setConnectTimeout(20000);
            a.setReadTimeout(20000);
            if (str3 != null) {
                a.setRequestProperty("Cookie", str3);
            }
            return a(eVar, a, strArr, str2, false);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str, String[] strArr, String str2, String str3, boolean z) {
        try {
            URL eVar = new e(a.b(str));
            HttpURLConnection a = a(eVar);
            a.setConnectTimeout(20000);
            a.setReadTimeout(20000);
            if (str3 != null) {
                a.setRequestProperty("Cookie", str3);
            } else if (z) {
                a(a, eVar.toURI());
            }
            return a(eVar, a, strArr, str2, z);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str, String[] strArr, String str2, String str3, boolean z, String str4, int i, int i2, String str5) {
        try {
            URLConnection openConnection;
            URL eVar = new e(a.b(str));
            if (str5 == null) {
                openConnection = eVar.openConnection();
            } else {
                int indexOf = str5.indexOf(58);
                if (indexOf != -1) {
                    String substring = str5.substring(0, indexOf);
                    indexOf = Integer.parseInt(str5.substring(indexOf + 1));
                    str5 = substring;
                } else {
                    indexOf = 80;
                }
                openConnection = eVar.openConnection(new Proxy(Type.HTTP, new Socket(str5, indexOf)));
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty("User-Agent", "Apache-HttpClient/UNAVAILABLE (java 1.4)");
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            if (str4 != null) {
                for (String str6 : str4.split("\\|\\|")) {
                    int indexOf2 = str6.indexOf(61);
                    if (indexOf2 != -1) {
                        httpURLConnection.setRequestProperty(str6.substring(0, indexOf2).trim(), str6.substring(indexOf2 + 1).trim());
                    }
                }
            }
            if (str3 != null) {
                httpURLConnection.setRequestProperty("Cookie", str3);
            } else if (z) {
                a(httpURLConnection, eVar.toURI());
            }
            return a(eVar, httpURLConnection, strArr, str2, z);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str, String[] strArr, String[] strArr2, String str2, String str3) {
        String str4;
        Exception e;
        String[] strArr3 = strArr;
        String[] strArr4 = strArr2;
        String str5 = str2;
        String str6 = str3;
        String str7 = "******";
        try {
            String str8;
            String str9;
            String str10;
            int indexOf;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new e(a.b(str)).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.setRequestProperty("Charset", str5);
            httpURLConnection.setRequestProperty("Content-Type", new e("multipart/form-data;boundary=").append(str7).toString());
            int i = 61;
            int i2 = -1;
            if (str6 != null) {
                for (String str82 : str6.split("\\|\\|")) {
                    int indexOf2 = str82.indexOf(61);
                    if (indexOf2 != -1) {
                        httpURLConnection.setRequestProperty(str82.substring(0, indexOf2).trim(), str82.substring(indexOf2 + 1).trim());
                    }
                }
            }
            DataOutputStream zipOutputStream = new ZipOutputStream(httpURLConnection.getOutputStream());
            int length = strArr3.length;
            int i3 = 0;
            while (true) {
                str82 = "\"";
                str9 = "Content-Disposition: form-data; name=\"";
                str10 = "\r\n";
                str4 = "--";
                if (i3 >= length) {
                    break;
                }
                String str11 = strArr3[i3];
                indexOf = str11.indexOf(i);
                if (indexOf != -1) {
                    zipOutputStream.writeBytes(str4 + str7 + str10);
                    zipOutputStream.writeBytes(new e(str9).append(str11.substring(0, indexOf)).append(str82).append(str10).toString());
                    zipOutputStream.writeBytes(str10);
                    zipOutputStream.write(str11.substring(indexOf + 1).getBytes(str5));
                    zipOutputStream.writeBytes(str10);
                }
                i3++;
                i = 61;
            }
            zipOutputStream.writeBytes(str4 + str7 + str10);
            String str12 = strArr4.length > 1 ? "file[]" : "file";
            indexOf = strArr4.length;
            i = 0;
            Object obj = null;
            while (i < indexOf) {
                String str13;
                String str14 = strArr4[i];
                int indexOf3 = str14.indexOf(10);
                if (indexOf3 != i2) {
                    String trim = str14.substring(indexOf3 + 1).trim();
                    str13 = str12;
                    str12 = str14.substring(0, indexOf3).trim();
                    str14 = trim;
                } else {
                    str13 = str12;
                    str12 = str13;
                }
                File eVar = new e(str14);
                if (eVar.exists()) {
                    if (obj != null) {
                        zipOutputStream.writeBytes(str4 + str7 + str10);
                    }
                    zipOutputStream.write(new e(str9).append(str12).append("\"; filename=\"").append(eVar.getName()).append(str82).append(str10).append("Content-Type: ").append(q.a(eVar)).append(str10).toString().getBytes(str5));
                    zipOutputStream.writeBytes(str10);
                    FileInputStream fileInputStream = new FileInputStream(eVar);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        i2 = fileInputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        zipOutputStream.write(bArr, 0, i2);
                    }
                    fileInputStream.close();
                    zipOutputStream.writeBytes(str10);
                    obj = 1;
                }
                i++;
                str12 = str13;
                i2 = -1;
            }
            zipOutputStream.writeBytes(str4 + str7 + str4 + str10);
            zipOutputStream.flush();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str5));
            str4 = "";
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str4 = str4 + readLine;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return str4;
                }
            }
            zipOutputStream.close();
            inputStream.close();
        } catch (Exception e3) {
            e = e3;
            str4 = null;
            e.printStackTrace();
            return str4;
        }
        return str4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static String a(URL url, HttpURLConnection httpURLConnection, String str, String str2, boolean z) {
        StringBuffer stringBuffer;
        Exception e;
        try {
            a(httpURLConnection, str, str2);
            int responseCode = httpURLConnection.getResponseCode();
            int i = 0;
            while (responseCode >= 300 && responseCode < 400 && i <= 8) {
                a().put(url.toURI(), httpURLConnection.getHeaderFields());
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    break;
                }
                URL eVar = new e(a.b(u.a(url.toURI(), headerField)));
                httpURLConnection.disconnect();
                httpURLConnection = a(eVar);
                a(httpURLConnection, eVar.toURI());
                a(httpURLConnection, null, str2);
                i++;
                URL url2 = eVar;
                responseCode = httpURLConnection.getResponseCode();
                url = url2;
            }
            if (responseCode == 200) {
                if (z) {
                    a().put(url.toURI(), httpURLConnection.getHeaderFields());
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, str2);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                stringBuffer = new StringBuffer();
                try {
                    char[] cArr = new char[512];
                    while (true) {
                        i = bufferedReader.read(cArr);
                        if (i <= 0) {
                            break;
                        }
                        stringBuffer.append(cArr, 0, i);
                    }
                    inputStream.close();
                    inputStreamReader.close();
                    bufferedReader.close();
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (stringBuffer == null) {
                    }
                }
            } else {
                stringBuffer = null;
            }
        } catch (Exception e3) {
            e = e3;
            stringBuffer = null;
            e.printStackTrace();
            if (stringBuffer == null) {
            }
        }
        return stringBuffer == null ? null : stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static String a(URL url, HttpURLConnection httpURLConnection, String[] strArr, String str, boolean z) {
        StringBuffer stringBuffer;
        Exception e;
        try {
            b(httpURLConnection, strArr, str);
            int responseCode = httpURLConnection.getResponseCode();
            int i = 0;
            while (responseCode >= 300 && responseCode < 400 && i <= 8) {
                a().put(url.toURI(), httpURLConnection.getHeaderFields());
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    break;
                }
                URL eVar = new e(a.b(u.a(url.toURI(), headerField)));
                httpURLConnection.disconnect();
                httpURLConnection = a(eVar);
                a(httpURLConnection, eVar.toURI());
                b(httpURLConnection, null, str);
                i++;
                URL url2 = eVar;
                responseCode = httpURLConnection.getResponseCode();
                url = url2;
            }
            if (responseCode == 200) {
                if (z) {
                    a().put(url.toURI(), httpURLConnection.getHeaderFields());
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, str);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                stringBuffer = new StringBuffer();
                try {
                    char[] cArr = new char[512];
                    while (true) {
                        i = bufferedReader.read(cArr);
                        if (i <= 0) {
                            break;
                        }
                        stringBuffer.append(cArr, 0, i);
                    }
                    inputStream.close();
                    inputStreamReader.close();
                    bufferedReader.close();
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (stringBuffer == null) {
                    }
                }
            } else {
                stringBuffer = null;
            }
        } catch (Exception e3) {
            e = e3;
            stringBuffer = null;
            e.printStackTrace();
            if (stringBuffer == null) {
            }
        }
        return stringBuffer == null ? null : stringBuffer.toString();
    }

    private static CookieManager a() {
        if (a == null) {
            CookieManager cookieManager = new CookieManager();
            a = cookieManager;
            cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        }
        return a;
    }

    private static HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", "Apache-HttpClient/UNAVAILABLE (java 1.4)");
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        return httpURLConnection;
    }

    public static d a(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
        return;
    }

    private static void a(HttpURLConnection httpURLConnection, String str, String str2) {
        if (httpURLConnection instanceof HttpsURLConnection) {
            a((HttpsURLConnection) httpURLConnection);
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(false);
        if (str != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Charsert", str2);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", new e("application/json; charset=").append(str2).toString());
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), str2));
            printWriter.println(str);
            printWriter.flush();
            printWriter.close();
        }
        httpURLConnection.connect();
    }

    private static void a(HttpURLConnection httpURLConnection, URI uri) {
        try {
            CookieStore cookieStore = a().getCookieStore();
            String str = "";
            String toLowerCase = uri.getHost().toLowerCase();
            for (HttpCookie httpCookie : cookieStore.getCookies()) {
                String toLowerCase2 = httpCookie.getDomain().toLowerCase();
                if ((toLowerCase2.startsWith(".") && toLowerCase.endsWith(toLowerCase2.substring(1))) || toLowerCase.endsWith(toLowerCase2)) {
                    str = str + httpCookie.getName() + "=" + httpCookie.getValue() + ";";
                }
            }
            if (str.length() > 0) {
                httpURLConnection.setRequestProperty("Cookie", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void a(HttpURLConnection httpURLConnection, String[] strArr, String str) {
        if (httpURLConnection instanceof HttpsURLConnection) {
            a((HttpsURLConnection) httpURLConnection);
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(false);
        if (strArr != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < strArr.length; i++) {
                int indexOf = strArr[i].indexOf(61);
                if (indexOf != -1) {
                    StringBuffer append;
                    String str2;
                    indexOf++;
                    if (i == 0) {
                        append = stringBuffer.append(strArr[i].substring(0, indexOf));
                        str2 = strArr[i];
                    } else {
                        append = stringBuffer.append('&').append(strArr[i].substring(0, indexOf));
                        str2 = strArr[i];
                    }
                    append.append(Downcenter.a(str2.substring(indexOf), str));
                }
            }
            outputStream.write(stringBuffer.toString().getBytes());
            outputStream.flush();
            outputStream.close();
        }
        httpURLConnection.connect();
    }

    public static void a(HttpsURLConnection httpsURLConnection) {
        if (b == null) {
            b = new X509TrustManager[]{new g()};
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("TLS");
            instance.init(new KeyManager[0], b, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(instance.getSocketFactory());
            httpsURLConnection.setHostnameVerifier(new h());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] a(byte[] bArr, int i, File file) {
        r1 = new byte[32];
        int i2 = 0;
        r1[0] = (byte) 32;
        r1[1] = (byte) -93;
        r1[2] = (byte) 93;
        r1[3] = (byte) 0;
        r1[4] = (byte) 63;
        r1[5] = (byte) -63;
        r1[6] = (byte) i;
        r1[7] = (byte) 0;
        r1[8] = (byte) 0;
        r1[9] = (byte) 0;
        r1[10] = (byte) 0;
        r1[11] = (byte) 0;
        r1[12] = (byte) 0;
        r1[13] = (byte) 0;
        r1[14] = (byte) 0;
        r1[15] = (byte) 0;
        r1[16] = (byte) 0;
        int i3 = 17;
        r1[17] = (byte) 0;
        r1[18] = (byte) 0;
        r1[19] = (byte) 0;
        r1[20] = (byte) 0;
        r1[21] = (byte) 0;
        r1[22] = (byte) 0;
        r1[23] = (byte) 0;
        r1[24] = (byte) 0;
        r1[25] = (byte) 0;
        r1[26] = (byte) 0;
        r1[27] = (byte) 0;
        r1[28] = (byte) 0;
        r1[29] = (byte) 0;
        r1[30] = (byte) 0;
        r1[31] = (byte) 0;
        char[] toCharArray = String.valueOf(bArr.length).toCharArray();
        int length = (toCharArray.length > 10 ? 0 : 10 - toCharArray.length) + 7;
        for (char c : toCharArray) {
            if (length == 17) {
                break;
            }
            r1[length] = Byte.parseByte(String.valueOf(c));
            length++;
        }
        if (i == 2 && file != null) {
            String name = file.getName();
            byte[] bArr2 = null;
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf != -1) {
                bArr2 = name.substring(lastIndexOf + 1).getBytes();
            }
            if (bArr2 != null) {
                int length2 = bArr2.length;
                while (i2 < length2) {
                    byte b = bArr2[i2];
                    if (i3 == 32) {
                        break;
                    }
                    r1[i3] = b;
                    i3++;
                    i2++;
                }
            }
        }
        return r1;
    }

    private static int b(String str) {
        return str.replace(" ", "%20").replace("\\&", "%26");
    }

    public static String b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 17;
        while (i < 32 && bArr[i] != (byte) 0) {
            byteArrayOutputStream.write(bArr[i]);
            i++;
        }
        return byteArrayOutputStream.size() == 0 ? null : new String(byteArrayOutputStream.toByteArray());
    }

    private static void b(HttpURLConnection httpURLConnection, String[] strArr, String str) {
        if (httpURLConnection instanceof HttpsURLConnection) {
            a((HttpsURLConnection) httpURLConnection);
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(false);
        if (strArr != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < strArr.length; i++) {
                int indexOf = strArr[i].indexOf(61);
                if (indexOf != -1) {
                    StringBuffer append;
                    String str2;
                    indexOf++;
                    if (i == 0) {
                        append = stringBuffer.append(strArr[i].substring(0, indexOf));
                        str2 = strArr[i];
                    } else {
                        append = stringBuffer.append('&').append(strArr[i].substring(0, indexOf));
                        str2 = strArr[i];
                    }
                    append.append(Downcenter.a(str2.substring(indexOf), str));
                }
            }
            outputStream.write(stringBuffer.toString().getBytes());
            outputStream.flush();
            outputStream.close();
        }
        httpURLConnection.connect();
    }

    public static boolean c(byte[] bArr) {
        return bArr != null && bArr.length >= 32 && bArr[0] == (byte) 32 && bArr[1] == (byte) -93 && bArr[2] == (byte) 93 && bArr[3] == (byte) 0 && bArr[4] == (byte) 63 && bArr[5] == (byte) -63;
    }
}