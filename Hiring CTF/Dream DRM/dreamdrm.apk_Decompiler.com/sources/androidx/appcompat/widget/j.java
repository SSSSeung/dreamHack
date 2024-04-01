package androidx.appcompat.widget;

import android.app.Application;
import android.os.Process;
import android.util.Log;
import android.view.View;
import com.github.barteksc.pdfviewer.PDFView;
import h.m;
import h.o;
import java.lang.reflect.Method;
import java.util.List;
import java.util.PriorityQueue;
import n0.c;
import n0.d;
import t2.h;
import w2.a;
import w4.e;
import y.i;

public final class j implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f643d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f644e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f645f;

    public /* synthetic */ j(Object obj, int i3, Object obj2) {
        this.f643d = i3;
        this.f645f = obj;
        this.f644e = obj2;
    }

    public final void run() {
        m mVar;
        boolean z5 = true;
        switch (this.f643d) {
            case 0:
                m mVar2 = (m) this.f645f;
                o oVar = mVar2.f658f;
                if (!(oVar == null || (mVar = oVar.f3174e) == null)) {
                    mVar.c(oVar);
                }
                View view = (View) mVar2.f663k;
                if (!(view == null || view.getWindowToken() == null)) {
                    h hVar = (h) this.f644e;
                    if (!hVar.b()) {
                        if (hVar.f3090f == null) {
                            z5 = false;
                        } else {
                            hVar.d(0, 0, false, false);
                        }
                    }
                    if (z5) {
                        mVar2.f674v = hVar;
                    }
                }
                mVar2.f675x = null;
                return;
            case 1:
                ((c) this.f644e).f4214a = this.f645f;
                return;
            case 2:
                ((Application) this.f644e).unregisterActivityLifecycleCallbacks((c) this.f645f);
                return;
            case 3:
                try {
                    Method method = d.f4223d;
                    Object obj = this.f645f;
                    Object obj2 = this.f644e;
                    if (method != null) {
                        method.invoke(obj2, new Object[]{obj, Boolean.FALSE, "AppCompat recreation"});
                        return;
                    }
                    d.f4224e.invoke(obj2, new Object[]{obj, Boolean.FALSE});
                    return;
                } catch (RuntimeException e6) {
                    if (e6.getClass() == RuntimeException.class && e6.getMessage() != null && e6.getMessage().startsWith("Unable to stop")) {
                        throw e6;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                Process.setThreadPriority(10);
                ((Runnable) this.f644e).run();
                return;
            case 5:
                PDFView pDFView = ((h) this.f645f).f5231c;
                a aVar = (a) this.f644e;
                if (pDFView.M == 2) {
                    pDFView.M = 3;
                }
                if (aVar.f5470e) {
                    i iVar = pDFView.f1795h;
                    synchronized (((List) iVar.f5776d)) {
                        if (((List) iVar.f5776d).size() >= 6) {
                            ((a) ((List) iVar.f5776d).remove(0)).f5468c.recycle();
                        }
                        ((List) iVar.f5776d).add(aVar);
                    }
                } else {
                    i iVar2 = pDFView.f1795h;
                    synchronized (iVar2.f5777e) {
                        iVar2.a();
                        ((PriorityQueue) iVar2.f5775c).offer(aVar);
                    }
                }
                pDFView.invalidate();
                return;
            case 6:
                PDFView pDFView2 = ((h) this.f645f).f5231c;
                u2.a aVar2 = (u2.a) this.f644e;
                pDFView2.getClass();
                Log.e("PDFView", "Cannot open page " + aVar2.f5339d, aVar2.getCause());
                return;
            default:
                ((e) ((w4.d) this.f644e)).k((x4.c) this.f645f);
                return;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, int i3) {
        this.f643d = i3;
        this.f644e = obj;
        this.f645f = obj2;
    }
}
