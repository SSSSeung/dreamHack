package androidx.lifecycle;

import androidx.fragment.app.l;

public abstract class w {

    /* renamed from: d  reason: collision with root package name */
    public final l f1388d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1389e;

    /* renamed from: f  reason: collision with root package name */
    public int f1390f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ y f1391g;

    public w(y yVar, l lVar) {
        this.f1391g = yVar;
        this.f1388d = lVar;
    }

    public final void c(boolean z5) {
        if (z5 != this.f1389e) {
            this.f1389e = z5;
            int i3 = z5 ? 1 : -1;
            y yVar = this.f1391g;
            int i6 = yVar.f1396c;
            yVar.f1396c = i3 + i6;
            if (!yVar.f1397d) {
                yVar.f1397d = true;
                while (true) {
                    try {
                        int i7 = yVar.f1396c;
                        if (i6 == i7) {
                            break;
                        }
                        i6 = i7;
                    } finally {
                        yVar.f1397d = false;
                    }
                }
            }
            if (this.f1389e) {
                yVar.c(this);
            }
        }
    }

    public void d() {
    }

    public abstract boolean e();
}
