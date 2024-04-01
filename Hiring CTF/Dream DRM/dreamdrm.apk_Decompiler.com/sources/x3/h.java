package x3;

import c4.a;
import com.google.gson.reflect.TypeToken;
import java.util.Iterator;
import java.util.List;
import v3.a0;
import v3.b0;
import v3.n;

public final class h extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public a0 f5722a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f5723b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f5724c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TypeToken f5725d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i f5726e;

    public h(i iVar, boolean z5, boolean z6, n nVar, TypeToken typeToken) {
        this.f5726e = iVar;
        this.f5723b = z5;
        this.f5724c = nVar;
        this.f5725d = typeToken;
    }

    public final Object b(a aVar) {
        if (this.f5723b) {
            aVar.W();
            return null;
        }
        a0 a0Var = this.f5722a;
        if (a0Var == null) {
            n nVar = this.f5724c;
            List list = nVar.f5401e;
            b0 b0Var = this.f5726e;
            if (!list.contains(b0Var)) {
                b0Var = nVar.f5400d;
            }
            Iterator it = list.iterator();
            boolean z5 = false;
            while (true) {
                boolean hasNext = it.hasNext();
                TypeToken typeToken = this.f5725d;
                if (hasNext) {
                    b0 b0Var2 = (b0) it.next();
                    if (z5) {
                        a0 a6 = b0Var2.a(nVar, typeToken);
                        if (a6 != null) {
                            this.f5722a = a6;
                            a0Var = a6;
                            break;
                        }
                    } else if (b0Var2 == b0Var) {
                        z5 = true;
                    }
                } else {
                    throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
                }
            }
        }
        return a0Var.b(aVar);
    }
}
