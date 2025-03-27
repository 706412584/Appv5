package i.runlibrary.c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import i.app.FileProvider;
import i.app.iActivity;
import i.runlibrary.a.s;
import java.util.HashMap;

public final class c extends Fragment {
    public static c a(String str, int i, String str2, int i2) {
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putString("iyu", str);
        bundle.putInt("layout", i);
        bundle.putString("pagename", str2);
        bundle.putInt("tabI", i2);
        cVar.setArguments(bundle);
        return cVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        int i = arguments.getInt("tabI");
        String stringBuffer = new StringBuffer().append(arguments.getString("pagename")).append(i).toString();
        iActivity iactivity = (iActivity) getActivity();
        View view = null;
        if (!iactivity._APPINFO._public_data_Cache.containsKey(stringBuffer)) {
            return null;
        }
        String string = arguments.getString("iyu");
        int i2 = arguments.getInt("layout");
        try {
            Class a = FileProvider.a(layoutInflater.getContext(), string);
            view = a.a(layoutInflater.getContext(), layoutInflater, i2, LinearLayout.class);
            iActivity a2 = a.a(iactivity._APPINFO, a);
            HashMap hashMap = (HashMap) iactivity._APPINFO._public_data_Cache.get(stringBuffer);
            r1 = new Object[4];
            r1[0] = iactivity._APPINFO._public_data_Cache.get(String.format("%s_$_this", new Object[]{r0}));
            r1[1] = this;
            r1[2] = hashMap;
            r1[3] = Integer.valueOf(i);
            view.setTag(r1);
            for (Object d : hashMap.keySet()) {
                int d2 = s.d(d);
                if (d2 > 0) {
                    a.a(iactivity.st.st(view, Integer.valueOf(d2)), hashMap.get(Integer.valueOf(d2)), d.b);
                }
            }
            if (a2 != null) {
                a2._$_viewAutomaticSettingEvent(iactivity, view);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }
}