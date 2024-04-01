package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.n;
import androidx.activity.result.c;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import e.l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import k.k;
import m1.a;

public abstract class v extends n {

    /* renamed from: s  reason: collision with root package name */
    public final l f1303s;

    /* renamed from: t  reason: collision with root package name */
    public final t f1304t = new t(this);

    /* renamed from: u  reason: collision with root package name */
    public boolean f1305u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1306v;
    public boolean w = true;

    public v() {
        l lVar = (l) this;
        this.f1303s = new l(2, new u(lVar));
        this.f302h.f4898b.c("android:support:fragments", new s(lVar));
        j(new t(lVar));
    }

    public static boolean l(l0 l0Var) {
        boolean z5 = false;
        for (r rVar : l0Var.f1173c.f()) {
            if (rVar != null) {
                u uVar = rVar.f1272v;
                if ((uVar == null ? null : uVar.f1298u) != null) {
                    z5 |= l(rVar.g());
                }
                d1 d1Var = rVar.Q;
                m mVar = m.f1373g;
                if (d1Var != null) {
                    d1Var.d();
                    if (d1Var.f1123e.f1382v.compareTo(mVar) >= 0) {
                        rVar.Q.f1123e.z();
                        z5 = true;
                    }
                }
                if (rVar.P.f1382v.compareTo(mVar) >= 0) {
                    rVar.P.z();
                    z5 = true;
                }
            }
        }
        return z5;
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1305u);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1306v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        if (getApplication() != null) {
            k kVar = ((a) new c(e(), a.f4173d, 0).d(a.class)).f4174c;
            if (kVar.f3899f > 0) {
                printWriter.print(str2);
                printWriter.println("Loaders:");
                if (kVar.f3899f > 0) {
                    a2.m.o(kVar.f3898e[0]);
                    printWriter.print(str2);
                    printWriter.print("  #");
                    printWriter.print(kVar.f3897d[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((u) this.f1303s.f1170b).f1297t.t(str, fileDescriptor, printWriter, strArr);
    }

    public final void onActivityResult(int i3, int i6, Intent intent) {
        this.f1303s.e();
        super.onActivityResult(i3, i6, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        l lVar = this.f1303s;
        lVar.e();
        super.onConfigurationChanged(configuration);
        ((u) lVar.f1170b).f1297t.h(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1304t.x(androidx.lifecycle.l.ON_CREATE);
        l0 l0Var = ((u) this.f1303s.f1170b).f1297t;
        l0Var.A = false;
        l0Var.B = false;
        l0Var.H.f1225h = false;
        l0Var.s(1);
    }

    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        super.onCreatePanelMenu(i3, menu);
        if (i3 != 0) {
            return true;
        }
        getMenuInflater();
        return ((u) this.f1303s.f1170b).f1297t.j() | true;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((u) this.f1303s.f1170b).f1297t.f1176f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        ((u) this.f1303s.f1170b).f1297t.k();
        this.f1304t.x(androidx.lifecycle.l.ON_DESTROY);
    }

    public final void onLowMemory() {
        super.onLowMemory();
        ((u) this.f1303s.f1170b).f1297t.l();
    }

    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        l lVar = this.f1303s;
        if (i3 == 0) {
            return ((u) lVar.f1170b).f1297t.n();
        }
        if (i3 != 6) {
            return false;
        }
        return ((u) lVar.f1170b).f1297t.i();
    }

    public final void onMultiWindowModeChanged(boolean z5) {
        ((u) this.f1303s.f1170b).f1297t.m(z5);
    }

    public final void onNewIntent(Intent intent) {
        this.f1303s.e();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i3, Menu menu) {
        if (i3 == 0) {
            ((u) this.f1303s.f1170b).f1297t.o();
        }
        super.onPanelClosed(i3, menu);
    }

    public final void onPause() {
        super.onPause();
        this.f1306v = false;
        ((u) this.f1303s.f1170b).f1297t.s(5);
        this.f1304t.x(androidx.lifecycle.l.ON_PAUSE);
    }

    public final void onPictureInPictureModeChanged(boolean z5) {
        ((u) this.f1303s.f1170b).f1297t.q(z5);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f1304t.x(androidx.lifecycle.l.ON_RESUME);
        l0 l0Var = ((u) this.f1303s.f1170b).f1297t;
        l0Var.A = false;
        l0Var.B = false;
        l0Var.H.f1225h = false;
        l0Var.s(7);
    }

    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        if (i3 == 0) {
            super.onPreparePanel(0, view, menu);
            return ((u) this.f1303s.f1170b).f1297t.r() | true;
        }
        super.onPreparePanel(i3, view, menu);
        return true;
    }

    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        this.f1303s.e();
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    public final void onResume() {
        l lVar = this.f1303s;
        lVar.e();
        super.onResume();
        this.f1306v = true;
        ((u) lVar.f1170b).f1297t.w(true);
    }

    public void onStart() {
        l lVar = this.f1303s;
        lVar.e();
        super.onStart();
        this.w = false;
        boolean z5 = this.f1305u;
        Object obj = lVar.f1170b;
        if (!z5) {
            this.f1305u = true;
            l0 l0Var = ((u) obj).f1297t;
            l0Var.A = false;
            l0Var.B = false;
            l0Var.H.f1225h = false;
            l0Var.s(4);
        }
        ((u) obj).f1297t.w(true);
        this.f1304t.x(androidx.lifecycle.l.ON_START);
        l0 l0Var2 = ((u) obj).f1297t;
        l0Var2.A = false;
        l0Var2.B = false;
        l0Var2.H.f1225h = false;
        l0Var2.s(5);
    }

    public final void onStateNotSaved() {
        this.f1303s.e();
    }

    public void onStop() {
        l lVar;
        super.onStop();
        this.w = true;
        do {
            lVar = this.f1303s;
        } while (l(((u) lVar.f1170b).f1297t));
        l0 l0Var = ((u) lVar.f1170b).f1297t;
        l0Var.B = true;
        l0Var.H.f1225h = true;
        l0Var.s(4);
        this.f1304t.x(androidx.lifecycle.l.ON_STOP);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((u) this.f1303s.f1170b).f1297t.f1176f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
