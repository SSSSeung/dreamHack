package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import b1.o;
import g4.n;
import java.util.List;
import r1.a;
import r1.b;

public final class ProcessLifecycleInitializer implements b {
    public final List a() {
        return n.f2906d;
    }

    public final Object b(Context context) {
        o.m(context, "context");
        a c6 = a.c(context);
        o.l(c6, "getInstance(context)");
        if (c6.f4915b.contains(ProcessLifecycleInitializer.class)) {
            if (!o.f1377a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                o.j(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new n());
            }
            e0 e0Var = e0.f1351l;
            e0Var.getClass();
            e0Var.f1356h = new Handler();
            e0Var.f1357i.x(l.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            o.j(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new c0(e0Var));
            return e0Var;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
