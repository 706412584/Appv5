package i.runlibrary.b;

import java.io.File;
import java.util.Comparator;
import java.util.Map;

final class o implements Comparator {
    final /* synthetic */ Map a;
    final /* synthetic */ n b;

    o(n nVar, Map map) {
        this.b = nVar;
        this.a = map;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        if (file == null && file2 == null) {
            return 0;
        }
        if (file == null) {
            return -1;
        }
        if (file2 == null) {
            return 1;
        }
        String name = file.getName();
        String name2 = file2.getName();
        if (name.equals(name2)) {
            return 0;
        }
        String str = "test.dex";
        if (name.startsWith(str)) {
            return 1;
        }
        if (name2.startsWith(str)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) this.a.get(name)).booleanValue();
        boolean booleanValue2 = ((Boolean) this.a.get(name2)).booleanValue();
        if (!booleanValue || !booleanValue2) {
            return booleanValue ? -1 : booleanValue2 ? 1 : name.compareTo(name2);
        } else {
            int indexOf = name.indexOf(46);
            int indexOf2 = name2.indexOf(46);
            int parseInt = indexOf > 7 ? Integer.parseInt(name.substring(7, indexOf)) : 1;
            int parseInt2 = indexOf2 > 7 ? Integer.parseInt(name2.substring(7, indexOf2)) : 1;
            return parseInt == parseInt2 ? 0 : parseInt < parseInt2 ? -1 : 1;
        }
    }
}