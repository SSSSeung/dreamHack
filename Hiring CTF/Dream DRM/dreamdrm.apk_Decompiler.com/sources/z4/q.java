package z4;

import b1.o;
import java.util.ArrayList;
import v4.i;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6059a = new ArrayList(20);

    public final void a(String str, String str2) {
        o.m(str, "name");
        o.m(str2, "value");
        ArrayList arrayList = this.f6059a;
        arrayList.add(str);
        arrayList.add(i.n0(str2).toString());
    }

    public final r b() {
        Object[] array = this.f6059a.toArray(new String[0]);
        if (array != null) {
            return new r((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void c(String str) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f6059a;
            if (i3 < arrayList.size()) {
                if (i.T(str, (String) arrayList.get(i3))) {
                    arrayList.remove(i3);
                    arrayList.remove(i3);
                    i3 -= 2;
                }
                i3 += 2;
            } else {
                return;
            }
        }
    }
}
