package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.d;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import r1.a;
import r1.b;

public class EmojiCompatInitializer implements b {
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public final Boolean b(Context context) {
        Object obj;
        m mVar = new m(context);
        if (l.f1012j == null) {
            synchronized (l.f1011i) {
                if (l.f1012j == null) {
                    l.f1012j = new l(mVar);
                }
            }
        }
        a c6 = a.c(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        c6.getClass();
        synchronized (a.f4913e) {
            try {
                obj = c6.f4914a.get(cls);
                if (obj == null) {
                    obj = c6.b(cls, new HashSet());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        final t h6 = ((r) obj).h();
        h6.a(new d() {
            public final void a(r rVar) {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new p(), 500);
                h6.t(this);
            }
        });
        return Boolean.TRUE;
    }
}
