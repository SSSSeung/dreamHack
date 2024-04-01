package l5;

import b1.o;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class x {

    /* renamed from: d  reason: collision with root package name */
    public static final w f4164d = new w();

    /* renamed from: a  reason: collision with root package name */
    public boolean f4165a;

    /* renamed from: b  reason: collision with root package name */
    public long f4166b;

    /* renamed from: c  reason: collision with root package name */
    public long f4167c;

    public x a() {
        this.f4165a = false;
        return this;
    }

    public x b() {
        this.f4167c = 0;
        return this;
    }

    public long c() {
        if (this.f4165a) {
            return this.f4166b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public x d(long j6) {
        this.f4165a = true;
        this.f4166b = j6;
        return this;
    }

    public boolean e() {
        return this.f4165a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f4165a && this.f4166b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j6, TimeUnit timeUnit) {
        o.m(timeUnit, "unit");
        if (j6 >= 0) {
            this.f4167c = timeUnit.toNanos(j6);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j6).toString());
    }
}
