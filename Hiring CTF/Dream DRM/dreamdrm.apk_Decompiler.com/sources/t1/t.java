package t1;

public final class t extends q {

    /* renamed from: a  reason: collision with root package name */
    public final u f5166a;

    public t(u uVar) {
        this.f5166a = uVar;
    }

    public final void b(p pVar) {
        u uVar = this.f5166a;
        int i3 = uVar.C - 1;
        uVar.C = i3;
        if (i3 == 0) {
            uVar.D = false;
            uVar.m();
        }
        pVar.v(this);
    }

    public final void c() {
        u uVar = this.f5166a;
        if (!uVar.D) {
            uVar.F();
            uVar.D = true;
        }
    }
}
