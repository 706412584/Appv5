package i.runlibrary.b;

import java.util.Enumeration;
import java.util.NoSuchElementException;

final class p implements Enumeration {
    final /* synthetic */ n a;
    private Enumeration[] b;
    private int c;

    private p(n nVar, Enumeration[] enumerationArr) {
        this.a = nVar;
        this.c = 0;
        this.b = enumerationArr;
    }

    /* synthetic */ p(n nVar, Enumeration[] enumerationArr, byte b) {
        this(nVar, enumerationArr);
    }

    public final boolean hasMoreElements() {
        while (true) {
            int i = this.c;
            Enumeration[] enumerationArr = this.b;
            if (i >= enumerationArr.length) {
                return false;
            }
            if (enumerationArr[i] != null && enumerationArr[i].hasMoreElements()) {
                return true;
            }
            this.c++;
        }
    }

    public final Object nextElement() {
        if (hasMoreElements()) {
            return this.b[this.c].nextElement();
        }
        throw new NoSuchElementException();
    }
}