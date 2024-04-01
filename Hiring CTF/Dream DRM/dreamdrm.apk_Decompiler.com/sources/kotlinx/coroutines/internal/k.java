package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class k {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3994e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3995f;

    /* renamed from: g  reason: collision with root package name */
    public static final r f3996g = new r("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f3997a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3998b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3999c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4000d;

    static {
        Class<k> cls = k.class;
        f3994e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f3995f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public k(int i3, boolean z5) {
        this.f3997a = i3;
        this.f3998b = z5;
        int i6 = i3 - 1;
        this.f3999c = i6;
        this.f4000d = new AtomicReferenceArray(i3);
        boolean z6 = false;
        if (i6 <= 1073741823) {
            if (!((i3 & i6) == 0 ? true : z6)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a(Object obj) {
        while (true) {
            long j6 = this._state;
            if ((3458764513820540928L & j6) != 0) {
                return (j6 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i3 = (int) ((1073741823 & j6) >> 0);
            int i6 = (int) ((1152921503533105152L & j6) >> 30);
            int i7 = this.f3999c;
            if (((i6 + 2) & i7) == (i3 & i7)) {
                return 1;
            }
            if (this.f3998b || this.f4000d.get(i6 & i7) == null) {
                if (f3995f.compareAndSet(this, j6, (-1152921503533105153L & j6) | (((long) ((i6 + 1) & 1073741823)) << 30))) {
                    this.f4000d.set(i6 & i7, obj);
                    k kVar = this;
                    while ((kVar._state & 1152921504606846976L) != 0) {
                        kVar = kVar.e();
                        AtomicReferenceArray atomicReferenceArray = kVar.f4000d;
                        int i8 = kVar.f3999c & i6;
                        Object obj2 = atomicReferenceArray.get(i8);
                        if (!(obj2 instanceof j) || ((j) obj2).f3993a != i6) {
                            kVar = null;
                            continue;
                        } else {
                            atomicReferenceArray.set(i8, obj);
                            continue;
                        }
                        if (kVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i9 = this.f3997a;
                if (i9 < 1024 || ((i6 - i3) & 1073741823) > (i9 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    public final boolean b() {
        long j6;
        do {
            j6 = this._state;
            if ((j6 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j6) != 0) {
                return false;
            }
        } while (!f3995f.compareAndSet(this, j6, j6 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j6 = this._state;
        return (((int) ((j6 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j6) >> 0))) & 1073741823;
    }

    public final boolean d() {
        long j6 = this._state;
        return ((int) ((1073741823 & j6) >> 0)) == ((int) ((j6 & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066 A[LOOP:3: B:16:0x0066->B:19:0x0072, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.k e() {
        /*
            r9 = this;
        L_0x0000:
            long r2 = r9._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f3995f
            r1 = r9
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r9._next
            kotlinx.coroutines.internal.k r0 = (kotlinx.coroutines.internal.k) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f3994e
            kotlinx.coroutines.internal.k r1 = new kotlinx.coroutines.internal.k
            int r4 = r9.f3997a
            int r4 = r4 * 2
            boolean r5 = r9.f3998b
            r1.<init>(r4, r5)
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r6 = 0
            long r4 = r4 >> r6
            int r4 = (int) r4
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r2
            r7 = 30
            long r5 = r5 >> r7
            int r5 = (int) r5
        L_0x003f:
            int r6 = r9.f3999c
            r7 = r4 & r6
            r6 = r6 & r5
            if (r7 == r6) goto L_0x005e
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r9.f4000d
            java.lang.Object r6 = r6.get(r7)
            if (r6 != 0) goto L_0x0053
            kotlinx.coroutines.internal.j r6 = new kotlinx.coroutines.internal.j
            r6.<init>(r4)
        L_0x0053:
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r1.f4000d
            int r8 = r1.f3999c
            r8 = r8 & r4
            r7.set(r8, r6)
            int r4 = r4 + 1
            goto L_0x003f
        L_0x005e:
            r4 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r4 = r4 & r2
            r1._state = r4
        L_0x0066:
            r4 = 0
            boolean r4 = r0.compareAndSet(r9, r4, r1)
            if (r4 == 0) goto L_0x006e
            goto L_0x001a
        L_0x006e:
            java.lang.Object r4 = r0.get(r9)
            if (r4 == 0) goto L_0x0066
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.k.e():kotlinx.coroutines.internal.k");
    }

    public final Object f() {
        while (true) {
            long j6 = this._state;
            if ((j6 & 1152921504606846976L) != 0) {
                return f3996g;
            }
            int i3 = (int) ((j6 & 1073741823) >> 0);
            int i6 = this.f3999c;
            int i7 = ((int) ((1152921503533105152L & j6) >> 30)) & i6;
            int i8 = i6 & i3;
            if (i7 == i8) {
                return null;
            }
            Object obj = this.f4000d.get(i8);
            if (obj == null) {
                if (this.f3998b) {
                    return null;
                }
            } else if (obj instanceof j) {
                return null;
            } else {
                long j7 = ((long) ((i3 + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f3995f.compareAndSet(this, j6, (j6 & -1073741824) | j7)) {
                    this.f4000d.set(this.f3999c & i3, (Object) null);
                    return obj2;
                } else if (this.f3998b) {
                    k kVar = this;
                    while (true) {
                        long j8 = kVar._state;
                        int i9 = (int) ((j8 & 1073741823) >> 0);
                        if ((j8 & 1152921504606846976L) != 0) {
                            kVar = kVar.e();
                        } else {
                            if (f3995f.compareAndSet(kVar, j8, (j8 & -1073741824) | j7)) {
                                kVar.f4000d.set(kVar.f3999c & i9, (Object) null);
                                kVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (kVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
