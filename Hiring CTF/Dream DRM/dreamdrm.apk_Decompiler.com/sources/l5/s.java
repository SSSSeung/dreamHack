package l5;

import b1.o;
import java.util.concurrent.atomic.AtomicReference;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final r f4159a = new r(new byte[0], 0, 0, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f4160b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference[] f4161c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4160b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i3 = 0; i3 < highestOneBit; i3++) {
            atomicReferenceArr[i3] = new AtomicReference();
        }
        f4161c = atomicReferenceArr;
    }

    public static final void a(r rVar) {
        boolean z5 = true;
        if (!(rVar.f4157f == null && rVar.f4158g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!rVar.f4155d) {
            Thread currentThread = Thread.currentThread();
            o.l(currentThread, "Thread.currentThread()");
            AtomicReference atomicReference = f4161c[(int) (currentThread.getId() & (((long) f4160b) - 1))];
            r rVar2 = (r) atomicReference.get();
            if (rVar2 != f4159a) {
                int i3 = rVar2 != null ? rVar2.f4154c : 0;
                if (i3 < 65536) {
                    rVar.f4157f = rVar2;
                    rVar.f4153b = 0;
                    rVar.f4154c = i3 + 8192;
                    while (true) {
                        if (!atomicReference.compareAndSet(rVar2, rVar)) {
                            if (atomicReference.get() != rVar2) {
                                z5 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (!z5) {
                        rVar.f4157f = null;
                    }
                }
            }
        }
    }

    public static final r b() {
        Thread currentThread = Thread.currentThread();
        o.l(currentThread, "Thread.currentThread()");
        AtomicReference atomicReference = f4161c[(int) (currentThread.getId() & (((long) f4160b) - 1))];
        r rVar = f4159a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return new r();
        }
        if (rVar2 == null) {
            atomicReference.set((Object) null);
            return new r();
        }
        atomicReference.set(rVar2.f4157f);
        rVar2.f4157f = null;
        rVar2.f4154c = 0;
        return rVar2;
    }
}
