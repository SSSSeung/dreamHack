package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f1000a;

    public /* synthetic */ a(String str) {
        this.f1000a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f1000a);
        thread.setPriority(10);
        return thread;
    }
}
