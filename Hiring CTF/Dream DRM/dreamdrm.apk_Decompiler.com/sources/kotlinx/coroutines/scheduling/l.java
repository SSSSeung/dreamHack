package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4042b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4043c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4044d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4045e;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray f4046a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<l> cls = l.class;
        f4042b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f4043c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f4044d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f4045e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final h a(h hVar, boolean z5) {
        if (z5) {
            return b(hVar);
        }
        h hVar2 = (h) f4042b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final h b(h hVar) {
        boolean z5 = true;
        if (hVar.f4032e.f1217d != 1) {
            z5 = false;
        }
        if (z5) {
            f4045e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return hVar;
        }
        int i3 = this.producerIndex & 127;
        while (this.f4046a.get(i3) != null) {
            Thread.yield();
        }
        this.f4046a.lazySet(i3, hVar);
        f4043c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final h d() {
        h hVar;
        while (true) {
            int i3 = this.consumerIndex;
            if (i3 - this.producerIndex == 0) {
                return null;
            }
            int i6 = i3 & 127;
            if (f4044d.compareAndSet(this, i3, i3 + 1) && (hVar = (h) this.f4046a.getAndSet(i6, (Object) null)) != null) {
                boolean z5 = true;
                if (hVar.f4032e.f1217d != 1) {
                    z5 = false;
                }
                if (z5) {
                    f4045e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final long e(l lVar) {
        int i3 = lVar.consumerIndex;
        int i6 = lVar.producerIndex;
        AtomicReferenceArray atomicReferenceArray = lVar.f4046a;
        while (true) {
            boolean z5 = true;
            if (i3 == i6) {
                break;
            }
            int i7 = i3 & 127;
            if (lVar.blockingTasksInBuffer == 0) {
                break;
            }
            h hVar = (h) atomicReferenceArray.get(i7);
            if (hVar != null) {
                if (hVar.f4032e.f1217d == 1) {
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i7, hVar, (Object) null)) {
                            if (atomicReferenceArray.get(i7) != hVar) {
                                z5 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z5) {
                        f4045e.decrementAndGet(lVar);
                        a(hVar, false);
                        return -1;
                    }
                } else {
                    continue;
                }
            }
            i3++;
        }
        return f(lVar, true);
    }

    public final long f(l lVar, boolean z5) {
        h hVar;
        boolean z6;
        do {
            hVar = (h) lVar.lastScheduledTask;
            if (hVar != null) {
                z6 = true;
                if (z5) {
                    if (!(hVar.f4032e.f1217d == 1)) {
                        return -2;
                    }
                }
                j.f4038e.getClass();
                long nanoTime = System.nanoTime() - hVar.f4031d;
                long j6 = j.f4034a;
                if (nanoTime >= j6) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4042b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(lVar, hVar, (Object) null)) {
                            if (atomicReferenceFieldUpdater.get(lVar) != hVar) {
                                z6 = false;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    return j6 - nanoTime;
                }
            } else {
                return -2;
            }
        } while (!z6);
        a(hVar, false);
        return -1;
    }
}
