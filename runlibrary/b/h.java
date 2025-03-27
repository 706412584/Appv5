package i.runlibrary.b;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;

/*  JADX ERROR: NullPointerException in pass: ReSugarCode
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at jadx.core.dex.visitors.ReSugarCode.initClsEnumMap(Unknown Source:22)
    	at jadx.core.dex.visitors.ReSugarCode.visit(Unknown Source:0)
    	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:0)
    	at jadx.core.ProcessClass.process(Unknown Source:54)
    	at jadx.core.ProcessClass.processDependencies(Unknown Source:22)
    	at jadx.core.ProcessClass.process(Unknown Source:68)
    	at jadx.api.JadxDecompiler.processClass(Unknown Source:4)
    	at jadx.api.JavaClass.decompile(Unknown Source:19)
    */
/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at jadx.core.dex.visitors.ExtractFieldInit.checkStaticFieldsInit(Unknown Source:27)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(Unknown Source:22)
    	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:0)
    	at jadx.core.ProcessClass.process(Unknown Source:54)
    	at jadx.core.ProcessClass.processDependencies(Unknown Source:22)
    	at jadx.core.ProcessClass.process(Unknown Source:68)
    	at jadx.api.JadxDecompiler.processClass(Unknown Source:4)
    	at jadx.api.JavaClass.decompile(Unknown Source:19)
    */
public final class h {
    public static final String[] a = null;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: android.s.ￛﾦￛﾢￛﾨￛﾢ cannot be cast to android.s.xk in method: i.runlibrary.b.h.<clinit>():void, dex: 
        	at jadx.core.dex.nodes.MethodNode.load(Unknown Source:89)
        	at jadx.core.dex.nodes.ClassNode.load(Unknown Source:45)
        	at jadx.core.ProcessClass.process(Unknown Source:24)
        	at jadx.core.ProcessClass.processDependencies(Unknown Source:22)
        	at jadx.core.ProcessClass.process(Unknown Source:68)
        	at jadx.api.JadxDecompiler.processClass(Unknown Source:4)
        	at jadx.api.JavaClass.decompile(Unknown Source:19)
        Caused by: java.lang.ClassCastException: android.s.ￛﾦￛﾢￛﾨￛﾢ cannot be cast to android.s.xk
        	at jadx.core.dex.instructions.InsnDecoder.filledNewArray(Unknown Source:1)
        	at jadx.core.dex.instructions.InsnDecoder.decode(Unknown Source:1108)
        	at jadx.core.dex.instructions.InsnDecoder.process(Unknown Source:19)
        	at jadx.core.dex.nodes.MethodNode.load(Unknown Source:36)
        	... 6 more
        */
    static {
        /*
        // Can't load method instructions: Load method exception: android.s.ۦۢۨۢ cannot be cast to android.s.xk in method: i.runlibrary.b.h.<clinit>():void, dex: 
        */
        throw new UnsupportedOperationException("Method not decompiled: i.runlibrary.b.h.<clinit>():void");
    }

    public static int a(Activity activity, String str) {
        String[] strArr = new String[1];
        strArr[0] = str;
        return a(activity, strArr);
    }

    public static int a(Activity activity, String[] strArr) {
        if (VERSION.SDK_INT < 23) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(activity, str) != 0 || ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) {
                arrayList.add(str);
            }
        }
        int size = arrayList.size();
        if (size <= 0) {
            return 0;
        }
        ActivityCompat.requestPermissions(activity, (String[]) arrayList.toArray(new String[size]), 60542);
        return size;
    }

    public static boolean a(Activity activity, Context context, String str) {
        return VERSION.SDK_INT < 23 ? true : ContextCompat.checkSelfPermission(context, str) != 0 ? false : activity == null || !ActivityCompat.shouldShowRequestPermissionRationale(activity, str);
    }
}