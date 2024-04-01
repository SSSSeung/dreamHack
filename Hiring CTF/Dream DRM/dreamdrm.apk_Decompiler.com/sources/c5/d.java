package c5;

import a5.b;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f1676a;

    public d(b bVar) {
        this.f1676a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), bVar);
    }
}
