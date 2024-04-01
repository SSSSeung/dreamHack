package e;

import a1.d;
import a2.n;
import a2.v;
import a2.w;
import a2.y;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.g4;
import androidx.appcompat.widget.p2;
import androidx.appcompat.widget.y3;
import androidx.compose.ui.platform.e;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import c2.j;
import h.b0;
import h.i;
import h.i0;
import h.m;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p0.c;
import s2.a;
import w0.b;
import w4.p;
import x0.d0;
import x0.e2;
import x0.g;
import x0.h2;
import x0.s;
import x0.u0;
import x0.u1;
import x0.w1;
import x0.x;
import x0.x1;
import y0.o;
import y0.r;

public class n0 implements p2, b0, m, g1, s, g, d, n1.d, a, e2.d {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2402d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2403e;

    public n0(int i3) {
        this.f2402d = i3;
        if (i3 == 7) {
            this.f2403e = Build.VERSION.SDK_INT >= 28 ? new e(0) : new e(1);
        } else if (i3 == 10) {
            this.f2403e = new ConcurrentHashMap();
        } else if (i3 == 14) {
            int i6 = Build.VERSION.SDK_INT;
            this.f2403e = i6 >= 30 ? new x1() : i6 >= 29 ? new w1() : new u1();
        } else if (i3 != 15) {
            this.f2403e = new ArrayDeque();
        } else {
            this.f2403e = new r(this);
        }
    }

    public static Object C(Object[] objArr, int i3, androidx.fragment.app.n0 n0Var) {
        int i6;
        boolean z5;
        int i7 = (i3 & 1) == 0 ? 400 : 700;
        boolean z6 = (i3 & 2) != 0;
        p0.g gVar = null;
        int i8 = Integer.MAX_VALUE;
        for (u0.g gVar2 : objArr) {
            int i9 = n0Var.f1217d;
            switch (i9) {
                case 0:
                    i6 = gVar2.f5256c;
                    break;
                default:
                    i6 = gVar2.f4391b;
                    break;
            }
            int abs = Math.abs(i6 - i7) * 2;
            switch (i9) {
                case 0:
                    z5 = gVar2.f5257d;
                    break;
                default:
                    z5 = gVar2.f4392c;
                    break;
            }
            int i10 = abs + (z5 == z6 ? 0 : 1);
            if (gVar == null || i8 > i10) {
                gVar = gVar2;
                i8 = i10;
            }
        }
        return gVar;
    }

    public Typeface A(Context context, InputStream inputStream) {
        File q5 = p.q(context);
        if (q5 == null) {
            return null;
        }
        try {
            if (!p.k(q5, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(q5.getPath());
            q5.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            q5.delete();
        }
    }

    public Typeface B(Context context, Resources resources, int i3, String str, int i6) {
        File q5 = p.q(context);
        if (q5 == null) {
            return null;
        }
        try {
            if (!p.j(q5, resources, i3)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(q5.getPath());
            q5.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            q5.delete();
        }
    }

    public u0.g D(int i3, u0.g[] gVarArr) {
        return (u0.g) C(gVarArr, i3, new androidx.fragment.app.n0(0));
    }

    public o E(int i3) {
        return null;
    }

    public boolean F(int i3, int i6, Bundle bundle) {
        return false;
    }

    public final void G() {
        ((e) this.f2403e).B();
    }

    public final Class a() {
        return ByteBuffer.class;
    }

    public final void b(h.o oVar, boolean z5) {
        if (oVar instanceof i0) {
            oVar.k().c(false);
        }
        b0 b0Var = ((androidx.appcompat.widget.m) this.f2403e).f660h;
        if (b0Var != null) {
            b0Var.b(oVar, z5);
        }
    }

    public final void c(h.o oVar) {
        m mVar = ((ActionMenuView) this.f2403e).f437y;
        if (mVar != null) {
            mVar.c(oVar);
        }
    }

    public final boolean d(h.o oVar, MenuItem menuItem) {
        androidx.appcompat.widget.p pVar = ((ActionMenuView) this.f2403e).D;
        if (pVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((y3) pVar).f864d.J.f328f).iterator();
        if (!it.hasNext()) {
            return false;
        }
        a2.m.o(it.next());
        throw null;
    }

    public final void e() {
        int i3 = this.f2402d;
        Object obj = this.f2403e;
        switch (i3) {
            case 16:
                ((InputContentInfo) obj).requestPermission();
                return;
            default:
                ((d) obj).e();
                return;
        }
    }

    public final ClipData f() {
        return ((ContentInfo) this.f2403e).getClip();
    }

    public final void g(h.o oVar, MenuItem menuItem) {
        ((i) this.f2403e).f3138j.removeCallbacksAndMessages(oVar);
    }

    public final Object h(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    public final boolean i(h.o oVar) {
        Object obj = this.f2403e;
        if (oVar == ((androidx.appcompat.widget.m) obj).f658f) {
            return false;
        }
        ((i0) oVar).A.getClass();
        ((androidx.appcompat.widget.m) obj).getClass();
        b0 b0Var = ((androidx.appcompat.widget.m) obj).f660h;
        if (b0Var != null) {
            return b0Var.i(oVar);
        }
        return false;
    }

    public final Uri j() {
        int i3 = this.f2402d;
        Object obj = this.f2403e;
        switch (i3) {
            case 16:
                return ((InputContentInfo) obj).getLinkUri();
            default:
                return ((d) obj).j();
        }
    }

    public final int k() {
        return ((ContentInfo) this.f2403e).getFlags();
    }

    public final void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: h.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(h.o r10, h.q r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f2403e
            h.i r0 = (h.i) r0
            android.os.Handler r1 = r0.f3138j
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            java.util.ArrayList r1 = r0.f3140l
            int r1 = r1.size()
            r3 = 0
        L_0x0011:
            r4 = -1
            if (r3 >= r1) goto L_0x0024
            java.util.ArrayList r5 = r0.f3140l
            java.lang.Object r5 = r5.get(r3)
            h.h r5 = (h.h) r5
            h.o r5 = r5.f3112b
            if (r10 != r5) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r3 = r3 + 1
            goto L_0x0011
        L_0x0024:
            r3 = r4
        L_0x0025:
            if (r3 != r4) goto L_0x0028
            return
        L_0x0028:
            int r3 = r3 + 1
            java.util.ArrayList r1 = r0.f3140l
            int r1 = r1.size()
            if (r3 >= r1) goto L_0x003b
            java.util.ArrayList r1 = r0.f3140l
            java.lang.Object r1 = r1.get(r3)
            r2 = r1
            h.h r2 = (h.h) r2
        L_0x003b:
            r5 = r2
            h.g r1 = new h.g
            r8 = 0
            r3 = r1
            r4 = r9
            r6 = r11
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 200(0xc8, double:9.9E-322)
            long r2 = r2 + r4
            android.os.Handler r11 = r0.f3138j
            r11.postAtTime(r1, r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.n0.m(h.o, h.q):void");
    }

    public final ContentInfo n() {
        return (ContentInfo) this.f2403e;
    }

    public final void o(int i3, Object obj) {
        h5.d.f3468d.o(i3, obj);
        ((ProfileInstallReceiver) this.f2403e).setResultCode(i3);
    }

    public void p(int i3) {
    }

    public void q(int i3) {
    }

    public final int r() {
        return ((ContentInfo) this.f2403e).getSource();
    }

    public final ClipDescription s() {
        int i3 = this.f2402d;
        Object obj = this.f2403e;
        switch (i3) {
            case 16:
                return ((InputContentInfo) obj).getDescription();
            default:
                return ((d) obj).s();
        }
    }

    public final Object t() {
        int i3 = this.f2402d;
        Object obj = this.f2403e;
        switch (i3) {
            case 25:
                c cVar = (c) obj;
                return new n((b.a) cVar.f4387b, (w0.c) cVar.f4388c);
            case 26:
                g4 g4Var = (g4) obj;
                return new v((d2.c) g4Var.f611a, (d2.c) g4Var.f612b, (d2.c) g4Var.f613c, (d2.c) g4Var.f614d, (w) g4Var.f615e, (y) g4Var.f616f, (w0.c) g4Var.f617g);
            default:
                try {
                    return new j(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e6) {
                    throw new RuntimeException(e6);
                }
        }
    }

    public final String toString() {
        switch (this.f2402d) {
            case 12:
                return "ContentInfoCompat{" + ((ContentInfo) this.f2403e) + "}";
            default:
                return super.toString();
        }
    }

    public final Object u() {
        return (InputContentInfo) this.f2403e;
    }

    public final h2 v(View view, h2 h2Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2403e;
        if (!b.a(coordinatorLayout.f953q, h2Var)) {
            coordinatorLayout.f953q = h2Var;
            boolean z5 = true;
            boolean z6 = h2Var.e() > 0;
            coordinatorLayout.f954r = z6;
            if (z6 || coordinatorLayout.getBackground() != null) {
                z5 = false;
            }
            coordinatorLayout.setWillNotDraw(z5);
            e2 e2Var = h2Var.f5572a;
            if (!e2Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    WeakHashMap weakHashMap = u0.f5622a;
                    if (d0.b(childAt) && ((l0.d) childAt.getLayoutParams()).f4053a != null && e2Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return h2Var;
    }

    public final Uri w() {
        int i3 = this.f2402d;
        Object obj = this.f2403e;
        switch (i3) {
            case 16:
                return ((InputContentInfo) obj).getContentUri();
            default:
                return ((d) obj).w();
        }
    }

    public o x(int i3) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface y(android.content.Context r10, p0.f r11, android.content.res.Resources r12, int r13) {
        /*
            r9 = this;
            androidx.fragment.app.n0 r0 = new androidx.fragment.app.n0
            r1 = 1
            r0.<init>(r1)
            p0.g[] r2 = r11.f4389a
            java.lang.Object r0 = C(r2, r13, r0)
            p0.g r0 = (p0.g) r0
            if (r0 != 0) goto L_0x0012
            r10 = 0
            return r10
        L_0x0012:
            int r8 = r0.f4395f
            java.lang.String r0 = r0.f4390a
            e.n0 r2 = q0.g.f4876a
            r3 = r10
            r4 = r12
            r5 = r8
            r6 = r0
            r7 = r13
            android.graphics.Typeface r10 = r2.B(r3, r4, r5, r6, r7)
            if (r10 == 0) goto L_0x002d
            r2 = 0
            java.lang.String r12 = q0.g.b(r12, r8, r0, r2, r13)
            k.e r13 = q0.g.f4877b
            r13.b(r12, r10)
        L_0x002d:
            java.lang.String r12 = "Could not retrieve font from family."
            java.lang.String r13 = "TypefaceCompatBaseImpl"
            r2 = 0
            if (r10 != 0) goto L_0x0037
        L_0x0035:
            r12 = r2
            goto L_0x0054
        L_0x0037:
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r4 = "native_instance"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch:{ NoSuchFieldException -> 0x004f, IllegalAccessException -> 0x004d }
            r0.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x004f, IllegalAccessException -> 0x004d }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ NoSuchFieldException -> 0x004f, IllegalAccessException -> 0x004d }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ NoSuchFieldException -> 0x004f, IllegalAccessException -> 0x004d }
            long r12 = r0.longValue()     // Catch:{ NoSuchFieldException -> 0x004f, IllegalAccessException -> 0x004d }
            goto L_0x0054
        L_0x004d:
            r0 = move-exception
            goto L_0x0050
        L_0x004f:
            r0 = move-exception
        L_0x0050:
            android.util.Log.e(r13, r12, r0)
            goto L_0x0035
        L_0x0054:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r9.f2403e
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r0.put(r12, r11)
        L_0x0063:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e.n0.y(android.content.Context, p0.f, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public Typeface z(Context context, u0.g[] gVarArr, int i3) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (gVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(D(i3, gVarArr).f5254a);
            try {
                Typeface A = A(context, inputStream);
                p.i(inputStream);
                return A;
            } catch (IOException unused) {
                p.i(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                p.i(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            p.i(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            p.i(inputStream2);
            throw th;
        }
    }

    public /* synthetic */ n0(int i3, Object obj) {
        this.f2402d = i3;
        this.f2403e = obj;
    }

    public n0(ContentInfo contentInfo) {
        this.f2402d = 12;
        contentInfo.getClass();
        this.f2403e = androidx.compose.ui.platform.d.j(contentInfo);
    }

    public n0(View view, int i3) {
        this.f2402d = i3;
        if (i3 != 23) {
            this.f2403e = Build.VERSION.SDK_INT >= 30 ? new x(view) : new x0.w(view);
        } else {
            this.f2403e = view.getOverlay();
        }
    }

    public n0(WindowInsetsController windowInsetsController) {
        this.f2402d = 13;
        this.f2403e = new x(windowInsetsController);
    }

    public n0(TextView textView) {
        this.f2402d = 20;
        if (textView != null) {
            this.f2403e = new h1.i(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }

    public n0(b1.v vVar) {
        this.f2402d = 9;
        this.f2403e = vVar;
    }

    public n0(Object obj) {
        this.f2402d = 16;
        this.f2403e = (InputContentInfo) obj;
    }
}
