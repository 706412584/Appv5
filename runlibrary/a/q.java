package i.runlibrary.a;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import i.runlibrary.b.m;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class q {
    private static final String[][] a;

    static {
        r0 = new String[69][];
        String str = "application/octet-stream";
        r0[7] = new String[]{".bin", str};
        r0[8] = new String[]{".bmp", "image/bmp"};
        String str2 = "text/plain";
        r0[9] = new String[]{".c", str2};
        r0[10] = new String[]{".class", str};
        r0[11] = new String[]{".conf", str2};
        r0[12] = new String[]{".cpp", str2};
        r0[13] = new String[]{".doc", "application/msword"};
        r0[14] = new String[]{".docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"};
        r0[15] = new String[]{".xls", "application/vnd.ms-excel"};
        r0[16] = new String[]{".xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"};
        r0[17] = new String[]{".exe", str};
        r0[18] = new String[]{".gif", "image/gif"};
        r0[19] = new String[]{".gtar", "application/x-gtar"};
        r0[20] = new String[]{".gz", "application/x-gzip"};
        r0[21] = new String[]{".h", str2};
        str = "text/html";
        r0[22] = new String[]{".htm", str};
        r0[23] = new String[]{".html", str};
        r0[24] = new String[]{".jar", "application/java-archive"};
        r0[25] = new String[]{".java", str2};
        str = "image/jpeg";
        r0[26] = new String[]{".jpeg", str};
        r0[27] = new String[]{".jpg", str};
        r0[28] = new String[]{".js", "application/x-javascript"};
        r0[29] = new String[]{".log", str2};
        r0[30] = new String[]{".m3u", "audio/x-mpegurl"};
        str = "audio/mp4a-latm";
        r0[31] = new String[]{".m4a", str};
        r0[32] = new String[]{".m4b", str};
        r0[33] = new String[]{".m4p", str};
        r0[34] = new String[]{".m4u", "video/vnd.mpegurl"};
        r0[35] = new String[]{".m4v", "video/x-m4v"};
        r0[36] = new String[]{".mov", "video/quicktime"};
        str = "audio/x-mpeg";
        r0[37] = new String[]{".mp2", str};
        r0[38] = new String[]{".mp3", str};
        str = "video/mp4";
        r0[39] = new String[]{".mp4", str};
        r0[40] = new String[]{".mpc", "application/vnd.mpohun.certificate"};
        String str3 = "video/mpeg";
        r0[41] = new String[]{".mpe", str3};
        r0[42] = new String[]{".mpeg", str3};
        r0[43] = new String[]{".mpg", str3};
        r0[44] = new String[]{".mpg4", str};
        r0[45] = new String[]{".mpga", "audio/mpeg"};
        r0[46] = new String[]{".msg", "application/vnd.ms-outlook"};
        r0[47] = new String[]{".ogg", "audio/ogg"};
        r0[48] = new String[]{".pdf", "application/pdf"};
        r0[49] = new String[]{".png", "image/png"};
        str = "application/vnd.ms-powerpoint";
        r0[50] = new String[]{".pps", str};
        r0[51] = new String[]{".ppt", str};
        r0[52] = new String[]{".pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation"};
        r0[53] = new String[]{".prop", str2};
        r0[54] = new String[]{".rc", str2};
        r0[55] = new String[]{".rmvb", "audio/x-pn-realaudio"};
        r0[56] = new String[]{".rtf", "application/rtf"};
        r0[57] = new String[]{".sh", str2};
        r0[58] = new String[]{".tar", "application/x-tar"};
        r0[59] = new String[]{".tgz", "application/x-compressed"};
        r0[60] = new String[]{".txt", str2};
        r0[61] = new String[]{".wav", "audio/x-wav"};
        r0[62] = new String[]{".wma", "audio/x-ms-wma"};
        r0[63] = new String[]{".wmv", "audio/x-ms-wmv"};
        r0[64] = new String[]{".wps", "application/vnd.ms-works"};
        r0[65] = new String[]{".xml", str2};
        r0[66] = new String[]{".z", "application/x-compress"};
        r0[67] = new String[]{".zip", "application/x-zip-compressed"};
        r0[68] = new String[]{"", "*/*"};
        a = r0;
    }

    public static String a(File file) {
        if (VERSION.SDK_INT >= 26) {
            try {
                String probeContentType = Files.probeContentType(Paths.get(file.toURI()));
                if (probeContentType != null) {
                    return probeContentType;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf, name.length()).toLowerCase();
            if (name.length() != 0) {
                int i = 0;
                while (true) {
                    String[][] strArr = a;
                    if (i >= strArr.length) {
                        break;
                    } else if (name.equals(strArr[i][0])) {
                        return strArr[i][1];
                    } else {
                        i++;
                    }
                }
            }
        }
        return "*/*";
    }

    public static void a(Context context, File file) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        m.a(context, intent, file, a(file));
        context.startActivity(intent);
    }
}