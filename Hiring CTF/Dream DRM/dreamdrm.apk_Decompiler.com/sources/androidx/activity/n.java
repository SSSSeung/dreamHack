package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.c;
import androidx.activity.result.e;
import androidx.fragment.app.v;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.h;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.m;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.t;
import b.a;
import b1.o;
import com.theori.dreamdrm.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l1.b;
import n0.g;
import q1.d;
import q1.f;

public abstract class n extends g implements n0, h, f, z, e {

    /* renamed from: e  reason: collision with root package name */
    public final a f299e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final c f300f;

    /* renamed from: g  reason: collision with root package name */
    public final t f301g;

    /* renamed from: h  reason: collision with root package name */
    public final q1.e f302h;

    /* renamed from: i  reason: collision with root package name */
    public m0 f303i;

    /* renamed from: j  reason: collision with root package name */
    public y f304j;

    /* renamed from: k  reason: collision with root package name */
    public final m f305k;

    /* renamed from: l  reason: collision with root package name */
    public final p f306l;

    /* renamed from: m  reason: collision with root package name */
    public final h f307m;

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList f308n;

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList f309o;

    /* renamed from: p  reason: collision with root package name */
    public final CopyOnWriteArrayList f310p;

    /* renamed from: q  reason: collision with root package name */
    public final CopyOnWriteArrayList f311q;

    /* renamed from: r  reason: collision with root package name */
    public final CopyOnWriteArrayList f312r;

    public n() {
        boolean z5 = false;
        this.f300f = new c((Runnable) new d(0, this));
        t tVar = new t(this);
        this.f301g = tVar;
        q1.e i3 = androidx.fragment.app.n0.i(this);
        this.f302h = i3;
        q1.c cVar = null;
        this.f304j = null;
        v vVar = (v) this;
        m mVar = new m(vVar);
        this.f305k = mVar;
        this.f306l = new p(mVar, new e(vVar));
        new AtomicInteger();
        this.f307m = new h();
        this.f308n = new CopyOnWriteArrayList();
        this.f309o = new CopyOnWriteArrayList();
        this.f310p = new CopyOnWriteArrayList();
        this.f311q = new CopyOnWriteArrayList();
        this.f312r = new CopyOnWriteArrayList();
        tVar.a(new ComponentActivity$2(vVar));
        tVar.a(new ComponentActivity$3(vVar));
        tVar.a(new ComponentActivity$4(vVar));
        i3.a();
        m mVar2 = tVar.f1382v;
        if ((mVar2 == m.f1371e || mVar2 == m.f1372f) ? true : z5) {
            d dVar = i3.f4898b;
            dVar.getClass();
            Iterator it = dVar.f4891a.iterator();
            while (true) {
                j.e eVar = (j.e) it;
                if (!eVar.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) eVar.next();
                o.l(entry, "components");
                q1.c cVar2 = (q1.c) entry.getValue();
                if (o.c((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    cVar = cVar2;
                    break;
                }
            }
            if (cVar == null) {
                i0 i0Var = new i0(this.f302h.f4898b, vVar);
                this.f302h.f4898b.c("androidx.lifecycle.internal.SavedStateHandlesProvider", i0Var);
                this.f301g.a(new SavedStateHandleAttacher(i0Var));
            }
            this.f302h.f4898b.c("android:support:activity-result", new f(vVar));
            j(new g(vVar));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final b a() {
        l1.d dVar = new l1.d(l1.a.f4075b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f4076a;
        if (application != null) {
            linkedHashMap.put(androidx.compose.ui.platform.e.f888e, getApplication());
        }
        linkedHashMap.put(o.f1518e, this);
        linkedHashMap.put(o.f1519f, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            linkedHashMap.put(o.f1520g, getIntent().getExtras());
        }
        return dVar;
    }

    public final d b() {
        return this.f302h.f4898b;
    }

    public final m0 e() {
        if (getApplication() != null) {
            if (this.f303i == null) {
                l lVar = (l) getLastNonConfigurationInstance();
                if (lVar != null) {
                    this.f303i = lVar.f294a;
                }
                if (this.f303i == null) {
                    this.f303i = new m0();
                }
            }
            return this.f303i;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final t h() {
        return this.f301g;
    }

    public final void j(b.b bVar) {
        a aVar = this.f299e;
        aVar.getClass();
        if (((Context) aVar.f1481b) != null) {
            bVar.a();
        }
        ((Set) aVar.f1480a).add(bVar);
    }

    public final y k() {
        if (this.f304j == null) {
            this.f304j = new y(new i(0, this));
            this.f301g.a(new ComponentActivity$6(this));
        }
        return this.f304j;
    }

    public void onActivityResult(int i3, int i6, Intent intent) {
        if (!this.f307m.a(i3, i6, intent)) {
            super.onActivityResult(i3, i6, intent);
        }
    }

    public final void onBackPressed() {
        k().b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f308n.iterator();
        while (it.hasNext()) {
            ((u0.d) ((w0.a) it.next())).a(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f302h.b(bundle);
        a aVar = this.f299e;
        aVar.getClass();
        aVar.f1481b = this;
        for (b.b a6 : (Set) aVar.f1480a) {
            a6.a();
        }
        super.onCreate(bundle);
        int i3 = h0.f1360e;
        androidx.fragment.app.n0.r(this);
    }

    public boolean onCreatePanelMenu(int i3, Menu menu) {
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f300f.f328f).iterator();
        if (!it.hasNext()) {
            return true;
        }
        a2.m.o(it.next());
        throw null;
    }

    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f300f.f328f).iterator();
        if (!it.hasNext()) {
            return false;
        }
        a2.m.o(it.next());
        throw null;
    }

    public final void onMultiWindowModeChanged(boolean z5, Configuration configuration) {
        super.onMultiWindowModeChanged(z5, configuration);
        Iterator it = this.f311q.iterator();
        while (it.hasNext()) {
            ((u0.d) ((w0.a) it.next())).a(new androidx.compose.ui.platform.e());
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f310p.iterator();
        while (it.hasNext()) {
            ((u0.d) ((w0.a) it.next())).a(intent);
        }
    }

    public void onPanelClosed(int i3, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f300f.f328f).iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i3, menu);
        } else {
            a2.m.o(it.next());
            throw null;
        }
    }

    public final void onPictureInPictureModeChanged(boolean z5, Configuration configuration) {
        super.onPictureInPictureModeChanged(z5, configuration);
        Iterator it = this.f312r.iterator();
        while (it.hasNext()) {
            ((u0.d) ((w0.a) it.next())).a(new androidx.compose.ui.platform.e());
        }
    }

    public boolean onPreparePanel(int i3, View view, Menu menu) {
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f300f.f328f).iterator();
        if (!it.hasNext()) {
            return true;
        }
        a2.m.o(it.next());
        throw null;
    }

    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (!this.f307m.a(i3, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i3, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        l lVar;
        m0 m0Var = this.f303i;
        if (m0Var == null && (lVar = (l) getLastNonConfigurationInstance()) != null) {
            m0Var = lVar.f294a;
        }
        if (m0Var == null) {
            return null;
        }
        l lVar2 = new l();
        lVar2.f294a = m0Var;
        return lVar2;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        t tVar = this.f301g;
        if (tVar instanceof t) {
            tVar.z();
        }
        super.onSaveInstanceState(bundle);
        this.f302h.c(bundle);
    }

    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.f309o.iterator();
        while (it.hasNext()) {
            ((u0.d) ((w0.a) it.next())).a(Integer.valueOf(i3));
        }
    }

    public final void reportFullyDrawn() {
        try {
            if (o.D()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            p pVar = this.f306l;
            synchronized (pVar.f316a) {
                pVar.f317b = true;
                Iterator it = pVar.f318c.iterator();
                while (it.hasNext()) {
                    ((o4.a) it.next()).a();
                }
                pVar.f318c.clear();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        View decorView = getWindow().getDecorView();
        o.m(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        o.m(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        o.m(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        o.m(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        o.m(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        m mVar = this.f305k;
        if (!mVar.f297f) {
            mVar.f297f = true;
            decorView6.getViewTreeObserver().addOnDrawListener(mVar);
        }
        super.setContentView(view);
    }

    public final void startActivityForResult(Intent intent, int i3) {
        super.startActivityForResult(intent, i3);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i6, int i7, int i8) {
        super.startIntentSenderForResult(intentSender, i3, intent, i6, i7, i8);
    }

    public final void startActivityForResult(Intent intent, int i3, Bundle bundle) {
        super.startActivityForResult(intent, i3, bundle);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i6, int i7, int i8, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i3, intent, i6, i7, i8, bundle);
    }
}
