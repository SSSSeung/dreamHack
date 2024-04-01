package e0;

import com.bumptech.glide.d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class g implements Future {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f2475d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f2476e;

    /* renamed from: f  reason: collision with root package name */
    public static final d f2477f;

    /* renamed from: g  reason: collision with root package name */
    public static final Object f2478g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f2479a;

    /* renamed from: b  reason: collision with root package name */
    public volatile c f2480b;

    /* renamed from: c  reason: collision with root package name */
    public volatile f f2481c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: e0.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: e0.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: e0.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: e0.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<e0.f> r0 = e0.f.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f2475d = r1
            java.lang.Class<e0.g> r1 = e0.g.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            f2476e = r2
            e0.d r2 = new e0.d     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<e0.c> r0 = e0.c.class
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0048 }
            r0 = 0
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            e0.e r2 = new e0.e
            r2.<init>()
        L_0x004e:
            f2477f = r2
            if (r0 == 0) goto L_0x005b
            java.util.logging.Logger r1 = f2476e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005b:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f2478g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.g.<clinit>():void");
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f2481c;
        } while (!f2477f.d(gVar, fVar, f.f2472c));
        while (fVar != null) {
            Thread thread = fVar.f2473a;
            if (thread != null) {
                fVar.f2473a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f2474b;
        }
        do {
            cVar = gVar.f2480b;
        } while (!f2477f.b(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f2466a;
            cVar.f2466a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f2466a;
            try {
                throw null;
            } catch (RuntimeException e6) {
                f2476e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", e6);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f2464a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof b) {
            ((b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        } else if (obj == f2478g) {
            return null;
        } else {
            return obj;
        }
    }

    public final void a(StringBuilder sb) {
        Object obj;
        String str = "]";
        boolean z5 = false;
        while (true) {
            try {
                obj = get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (ExecutionException e6) {
                sb.append("FAILURE, cause=[");
                sb.append(e6.getCause());
                sb.append(str);
                return;
            } catch (CancellationException unused2) {
                str = "CANCELLED";
                sb.append(str);
                return;
            } catch (RuntimeException e7) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e7.getClass());
                str = " thrown from get()]";
                sb.append(str);
                return;
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append(str);
    }

    public final boolean cancel(boolean z5) {
        Object obj = this.f2479a;
        if ((obj == null) || false) {
            if (f2477f.c(this, obj, f2475d ? new a(new CancellationException("Future.cancel() was called."), z5) : z5 ? a.f2462b : a.f2463c)) {
                b(this);
                return true;
            }
        }
        return false;
    }

    public final void d(f fVar) {
        fVar.f2473a = null;
        while (true) {
            f fVar2 = this.f2481c;
            if (fVar2 != f.f2472c) {
                f fVar3 = null;
                while (fVar2 != null) {
                    f fVar4 = fVar2.f2474b;
                    if (fVar2.f2473a != null) {
                        fVar3 = fVar2;
                    } else if (fVar3 != null) {
                        fVar3.f2474b = fVar4;
                        if (fVar3.f2473a == null) {
                        }
                    } else if (!f2477f.d(this, fVar2, fVar4)) {
                    }
                    fVar2 = fVar4;
                }
                return;
            }
            return;
        }
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2479a;
            if ((obj2 != null) && true) {
                return c(obj2);
            }
            f fVar = this.f2481c;
            f fVar2 = f.f2472c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    d dVar = f2477f;
                    dVar.z(fVar3, fVar);
                    if (dVar.d(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2479a;
                            } else {
                                d(fVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & true));
                        return c(obj);
                    }
                    fVar = this.f2481c;
                } while (fVar != fVar2);
            }
            return c(this.f2479a);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f2479a instanceof a;
    }

    public final boolean isDone() {
        return (this.f2479a != null) & true;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f2479a instanceof a) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    if (this instanceof ScheduledFuture) {
                        str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                    } else {
                        str = null;
                    }
                } catch (RuntimeException e6) {
                    str = "Exception thrown from implementation: " + e6.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                } else if (!isDone()) {
                    str2 = "PENDING";
                }
            }
            a(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            long r4 = r3.toNanos(r1)
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L_0x0170
            java.lang.Object r6 = r0.f2479a
            r7 = 1
            if (r6 == 0) goto L_0x0017
            r8 = r7
            goto L_0x0018
        L_0x0017:
            r8 = 0
        L_0x0018:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x0020
            java.lang.Object r1 = c(r6)
            return r1
        L_0x0020:
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x002c
            long r10 = java.lang.System.nanoTime()
            long r10 = r10 + r4
            goto L_0x002d
        L_0x002c:
            r10 = r8
        L_0x002d:
            r12 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x0087
            e0.f r6 = r0.f2481c
            e0.f r8 = e0.f.f2472c
            if (r6 == r8) goto L_0x0080
            e0.f r9 = new e0.f
            r9.<init>()
        L_0x003e:
            com.bumptech.glide.d r14 = f2477f
            r14.z(r9, r6)
            boolean r6 = r14.d(r0, r6, r9)
            if (r6 == 0) goto L_0x007c
        L_0x0049:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r4)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x0073
            java.lang.Object r4 = r0.f2479a
            if (r4 == 0) goto L_0x0058
            r5 = r7
            goto L_0x0059
        L_0x0058:
            r5 = 0
        L_0x0059:
            r5 = r5 & r7
            if (r5 == 0) goto L_0x0061
            java.lang.Object r1 = c(r4)
            return r1
        L_0x0061:
            long r4 = java.lang.System.nanoTime()
            long r4 = r10 - r4
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x0049
            r0.d(r9)
            r14 = r0
            r15 = r14
            r5 = r4
            r4 = r3
            goto L_0x00aa
        L_0x0073:
            r0.d(r9)
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        L_0x007c:
            e0.f r6 = r0.f2481c
            if (r6 != r8) goto L_0x003e
        L_0x0080:
            java.lang.Object r1 = r0.f2479a
            java.lang.Object r1 = c(r1)
            return r1
        L_0x0087:
            r14 = r0
            r15 = r14
            r5 = r4
            r4 = r3
        L_0x008b:
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x00b3
            java.lang.Object r5 = r15.f2479a
            if (r5 == 0) goto L_0x0095
            r6 = r7
            goto L_0x0096
        L_0x0095:
            r6 = 0
        L_0x0096:
            r6 = r6 & r7
            if (r6 == 0) goto L_0x009e
            java.lang.Object r1 = c(r5)
            return r1
        L_0x009e:
            boolean r5 = java.lang.Thread.interrupted()
            if (r5 != 0) goto L_0x00ad
            long r5 = java.lang.System.nanoTime()
            long r5 = r10 - r5
        L_0x00aa:
            r8 = 0
            goto L_0x008b
        L_0x00ad:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        L_0x00b3:
            java.lang.String r8 = r14.toString()
            java.lang.String r9 = r3.toString()
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r15 = "Waited "
            r11.<init>(r15)
            r11.append(r1)
            java.lang.String r1 = " "
            r11.append(r1)
            java.lang.String r2 = r3.toString()
            java.lang.String r2 = r2.toLowerCase(r10)
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            long r10 = r5 + r12
            r15 = 0
            int r3 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x0144
            java.lang.String r3 = " (plus "
            java.lang.String r2 = a2.m.h(r2, r3)
            long r5 = -r5
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r10 = r4.convert(r5, r3)
            long r3 = r4.toNanos(r10)
            long r5 = r5 - r3
            r3 = 0
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0105
            int r4 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            r7 = 0
        L_0x0105:
            if (r3 <= 0) goto L_0x0128
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r10)
            r3.append(r1)
            r3.append(r9)
            java.lang.String r2 = r3.toString()
            if (r7 == 0) goto L_0x0124
            java.lang.String r3 = ","
            java.lang.String r2 = a2.m.h(r2, r3)
        L_0x0124:
            java.lang.String r2 = a2.m.h(r2, r1)
        L_0x0128:
            if (r7 == 0) goto L_0x013e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " nanoseconds "
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L_0x013e:
            java.lang.String r1 = "delay)"
            java.lang.String r2 = a2.m.h(r2, r1)
        L_0x0144:
            boolean r1 = r14.isDone()
            if (r1 == 0) goto L_0x0156
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = " but future completed as timeout expired"
            java.lang.String r2 = a2.m.h(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x0156:
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " for "
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0170:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.g.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
