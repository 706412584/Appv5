package i.runlibrary.b;

import android.content.Context;
import android.os.Environment;
import i.app.FileProvider;
import i.runlibrary.a.d;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread.UncaughtExceptionHandler;

public final class c implements UncaughtExceptionHandler {
    private static c b = new c();
    private UncaughtExceptionHandler a;
    private Context c;
    private String d;

    private c() {
    }

    public static c a() {
        return b;
    }

    private boolean a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        while (true) {
            th.printStackTrace(printWriter);
            th = th.getCause();
            if (th == null) {
                break;
            }
        }
        printWriter.close();
        stringBuffer.append(stringWriter.toString());
        try {
            if (Environment.getExternalStorageState().equals("mounted")) {
                String replace = stringBuffer.toString().replace("\r", "").replace("\n", "\r\n");
                FileProvider.a(this.c, replace);
                new e(this.d).getParentFile().mkdirs();
                byte[] bytes = replace.getBytes();
                FileOutputStream eVar = new e(this.d);
                eVar.write(bytes);
                eVar.close();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final String a(Context context) {
        this.c = context;
        this.a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.d = context.getExternalFilesDir("") + new StringBuilder().append(d.a(context)) + "/.i/app/ErrLog/" + context.getPackageName() + ".log";
        return;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (th != null) {
            a(th);
        }
        this.a.uncaughtException(thread, th);
    }
}