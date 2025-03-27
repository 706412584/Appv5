package i.runlibrary.c;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import i.runlibrary.a.i;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public final class d extends FragmentStatePagerAdapter {
    public static i b;
    public ArrayList a = new ArrayList();
    private AppInfo c;
    private int d = 0;
    private String e;
    private ArrayList f = new ArrayList();
    private ArrayList g = new ArrayList();

    public d(FragmentManager fragmentManager, AppInfo appInfo, View view) {
        super(fragmentManager);
        this.e = new e("$_FragmentStatePagerAdapter_").append(view.getId()).append('_').toString();
        appInfo._public_data_Cache.put(new StringBuffer().append(this.e).append("_$_this").toString(), this);
        this.c = appInfo;
        i iVar = b;
        if (iVar != null) {
            iVar.a();
        }
        b = new i(appInfo.c, (FragmentStatePagerAdapter) this);
    }

    public final int a() {
        return this.g.size();
    }

    public final void a(int i) {
        if (i == -1) {
            i = this.f.size() - 1;
        }
        this.f.remove(i);
        this.g.remove(i);
        this.a.remove(i);
    }

    public final void a(int i, String str) {
        if (i == -1) {
            i = this.f.size() - 1;
        }
        this.f.set(i, str);
    }

    public final void a(int i, String str, String str2, int i2, Object obj, Object obj2) {
        HashMap hashMap = new HashMap();
        if (obj.getClass().isArray() && obj2.getClass().isArray()) {
            Class cls = obj.getClass();
            if (int[].class.equals(cls) || Integer[].class.equals(cls)) {
                int length = Array.getLength(obj);
                int length2 = Array.getLength(obj2);
                if (length > 0 && length == length2) {
                    for (length2 = 0; length2 < length; length2++) {
                        hashMap.put(Integer.valueOf(s.d(Array.get(obj, length2))), Array.get(obj2, length2));
                    }
                }
            }
        }
        this.c._public_data_Cache.put(new StringBuffer().append(this.e).append(this.d).toString(), hashMap);
        if (i == -1) {
            this.a.add(hashMap);
            this.f.add(str);
            this.g.add(c.a(str2, i2, this.e, this.d));
        } else {
            this.a.add(i, hashMap);
            this.f.add(str);
            this.g.add(i, c.a(str2, i2, this.e, this.d));
        }
        notifyDataSetChanged();
        this.d++;
    }

    public final void b() {
        HashMap hashMap = new HashMap();
        for (Object valueOf : this.c._public_data_Cache.keySet()) {
            String valueOf2 = String.valueOf(valueOf);
            if (valueOf2 != null && valueOf2.startsWith(this.e)) {
                this.c._public_data_Cache.remove(valueOf2);
            }
        }
        this.f.clear();
        this.g.clear();
        this.a.clear();
        b.a();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        super.destroyItem(viewGroup, i, obj);
    }

    public final int getCount() {
        return this.g.size();
    }

    public final Object getItem(int i) {
        return (Fragment) this.g.get(i);
    }

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final CharSequence getPageTitle(int i) {
        return (CharSequence) this.f.get(i);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        return super.instantiateItem(viewGroup, i);
    }
}