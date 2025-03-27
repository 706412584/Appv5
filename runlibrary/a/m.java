package i.runlibrary.a;

public final class m extends Thread {
    final /* synthetic */ i a;
    private l b;

    public m(i iVar, l lVar) {
        this.a = iVar;
        this.b = lVar;
    }

    public final void run() {
        if (this.b.a == null) {
            i.a(this.a, this.b);
        } else {
            i.b(this.a, this.b);
        }
        this.a.l.addAndGet(-1);
    }
}