package v4;

import b1.o;
import java.util.Iterator;
import o4.e;
import u4.f;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f5418a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5419b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5420c;

    /* renamed from: d  reason: collision with root package name */
    public final e f5421d;

    public c(CharSequence charSequence, int i3, int i6, h hVar) {
        o.m(charSequence, "input");
        this.f5418a = charSequence;
        this.f5419b = i3;
        this.f5420c = i6;
        this.f5421d = hVar;
    }

    public final Iterator iterator() {
        return new b(this);
    }
}
