package g5;

import c5.a;
import java.util.List;

public final class r extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u f3008e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3009f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f3010g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(String str, u uVar, int i3, List list, boolean z5) {
        super(str, true);
        this.f3008e = uVar;
        this.f3009f = i3;
        this.f3010g = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a() {
        /*
            r3 = this;
            g5.u r0 = r3.f3008e
            androidx.compose.ui.platform.e r0 = r0.f3029o
            java.util.List r1 = r3.f3010g
            r0.getClass()
            java.lang.String r0 = "responseHeaders"
            b1.o.m(r1, r0)
            g5.u r0 = r3.f3008e     // Catch:{ IOException -> 0x002e }
            g5.b0 r0 = r0.B     // Catch:{ IOException -> 0x002e }
            int r1 = r3.f3009f     // Catch:{ IOException -> 0x002e }
            g5.b r2 = g5.b.f2928j     // Catch:{ IOException -> 0x002e }
            r0.p(r1, r2)     // Catch:{ IOException -> 0x002e }
            g5.u r0 = r3.f3008e     // Catch:{ IOException -> 0x002e }
            monitor-enter(r0)     // Catch:{ IOException -> 0x002e }
            g5.u r1 = r3.f3008e     // Catch:{ all -> 0x002b }
            java.util.LinkedHashSet r1 = r1.D     // Catch:{ all -> 0x002b }
            int r2 = r3.f3009f     // Catch:{ all -> 0x002b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x002b }
            r1.remove(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            goto L_0x002e
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            throw r1     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.r.a():long");
    }
}
