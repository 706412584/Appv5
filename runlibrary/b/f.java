package i.runlibrary.b;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.Messenger;

public final class f {
    public static Messenger a;

    public f(Context context) {
        Intent eVar = new e("i.app.communication.MESSENGER_SERVICE");
        eVar.setPackage("com.iapp.app");
        context.bindService(eVar, new g(this), 1);
    }

    public static d a(Context context, String str) {
        Intent eVar = new e("XW_Messenger_broadcast_ip");
        eVar.setPackage("com.iapp.app");
        eVar.putExtra("type", 1);
        eVar.putExtra("log", str);
        context.sendBroadcast(eVar);
        return;
    }

    public static int a(String str) {
        try {
            if (a != null) {
                Message message = new Message();
                message.what = 1;
                message.getData().putString("log", str);
                a.send(message);
            }
            return;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}