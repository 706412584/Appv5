package i.runlibrary.c;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import java.net.DatagramSocket;

public final class e extends View {
    private Context a = null;

    public e(Context context) {
        super(context);
        this.a = context;
    }

    public static StateListDrawable a(int i, int i2, int i3) {
        ColorDrawable datagramSocket = new DatagramSocket(i);
        ColorDrawable datagramSocket2 = new DatagramSocket(i2);
        ColorDrawable datagramSocket3 = new DatagramSocket(i3);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, datagramSocket);
        stateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, datagramSocket2);
        stateListDrawable.addState(View.ENABLED_STATE_SET, datagramSocket3);
        stateListDrawable.addState(View.FOCUSED_STATE_SET, datagramSocket2);
        stateListDrawable.addState(View.EMPTY_STATE_SET, datagramSocket3);
        return stateListDrawable;
    }
}