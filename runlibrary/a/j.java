package i.runlibrary.a;

final class j extends Thread {
    final /* synthetic */ i a;

    j(i iVar) {
        this.a = iVar;
    }

    public final void run() {
        while (true) {
            int size = this.a.d.size();
            if (size <= 0) {
                this.a.n.sendEmptyMessage(1);
                this.a.o = false;
                return;
            } else if (this.a.l.get() < 3) {
                this.a.l.addAndGet(1);
                size = this.a.k == 1000 ? size - 1 : 0;
                try {
                    l lVar = (l) this.a.d.get(size);
                    this.a.d.remove(size);
                    this.a.e.remove(size);
                    new m(this.a, lVar).start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                i.b();
            }
        }
    }
}