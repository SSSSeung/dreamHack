package androidx.compose.ui.platform;

import android.view.View;
import androidx.lifecycle.r;
import i4.d;
import k4.h;
import o4.e;
import p4.i;
import w4.o;

public final class n extends h implements e {

    /* renamed from: h  reason: collision with root package name */
    public int f909h;

    /* renamed from: i  reason: collision with root package name */
    public /* synthetic */ Object f910i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ i f911j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ r f912k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 f913l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ View f914m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(i iVar, r rVar, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, d dVar) {
        super(2, dVar);
        this.f911j = iVar;
        this.f912k = rVar;
        this.f913l = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.f914m = view;
    }

    public final d b(Object obj, d dVar) {
        n nVar = new n(this.f911j, this.f912k, this.f913l, this.f914m, dVar);
        nVar.f910i = obj;
        return nVar;
    }

    public final Object h(Object obj, Object obj2) {
        f4.h hVar = f4.h.f2682a;
        ((n) b((o) obj, (d) obj2)).j(hVar);
        return hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f909h
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r5.f913l
            androidx.lifecycle.r r2 = r5.f912k
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x002c
            if (r0 != r3) goto L_0x0024
            java.lang.Object r0 = r5.f910i
            w4.i0 r0 = (w4.i0) r0
            com.bumptech.glide.c.M(r6)     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0018
            r0.n(r4)
        L_0x0018:
            androidx.lifecycle.t r6 = r2.h()
            r6.t(r1)
            f4.h r6 = f4.h.f2682a
            return r6
        L_0x0022:
            r6 = move-exception
            goto L_0x0041
        L_0x0024:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002c:
            com.bumptech.glide.c.M(r6)
            java.lang.Object r6 = r5.f910i
            w4.o r6 = (w4.o) r6
            p4.i r6 = r5.f911j     // Catch:{ all -> 0x003f }
            java.lang.Object r6 = r6.f4865d     // Catch:{ all -> 0x003f }
            a2.m.o(r6)     // Catch:{ all -> 0x003f }
            r5.f910i = r4     // Catch:{ all -> 0x003f }
            r5.f909h = r3     // Catch:{ all -> 0x003f }
            throw r4     // Catch:{ all -> 0x003f }
        L_0x003f:
            r6 = move-exception
            r0 = r4
        L_0x0041:
            if (r0 == 0) goto L_0x0046
            r0.n(r4)
        L_0x0046:
            androidx.lifecycle.t r0 = r2.h()
            r0.t(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.n.j(java.lang.Object):java.lang.Object");
    }
}
