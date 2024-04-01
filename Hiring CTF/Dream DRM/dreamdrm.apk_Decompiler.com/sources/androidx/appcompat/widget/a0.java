package androidx.appcompat.widget;

import a0.a;
import a2.f0;
import a2.g;
import a2.j0;
import a2.k0;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.ui.platform.e;
import androidx.lifecycle.x;
import b2.c;
import b2.f;
import b2.j;
import b2.k;
import com.bumptech.glide.load.data.d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e.n0;
import e2.b0;
import e2.u;
import h2.o;
import h2.w;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k.b;
import r2.h;
import x0.h2;
import x0.s;
import x3.q;
import x3.y;
import y1.i;
import y1.l;

public final class a0 implements d, j, l, o, s, q {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f502d;

    /* renamed from: e  reason: collision with root package name */
    public Object f503e;

    /* renamed from: f  reason: collision with root package name */
    public Object f504f;

    public a0(int i3) {
        this.f502d = i3;
        if (i3 == 4) {
            this.f503e = new e(9);
            this.f504f = new a();
        } else if (i3 == 11) {
            this.f503e = new HashMap();
            this.f504f = new HashMap();
        } else if (i3 == 17) {
            this.f503e = new h(1000);
            this.f504f = com.bumptech.glide.e.u(10, new n0(28, (Object) this));
        } else if (i3 == 26) {
        } else {
            if (i3 == 22) {
                this.f503e = new AtomicReference();
                this.f504f = new b();
            } else if (i3 != 23) {
                switch (i3) {
                    case 13:
                        this.f503e = new c(0);
                        this.f504f = new a0(14);
                        return;
                    case 14:
                        this.f503e = new f((Object) null);
                        this.f504f = new HashMap();
                        return;
                    case 15:
                        this.f503e = new HashMap();
                        this.f504f = new c2.c(0);
                        return;
                    default:
                        this.f503e = new AtomicReference(com.bumptech.glide.e.f1706b);
                        this.f504f = new Object();
                        return;
                }
            } else {
                this.f503e = new ArrayList();
                this.f504f = new HashMap();
            }
        }
    }

    public static String o(int i3, int i6, Bitmap.Config config) {
        return "[" + i3 + "x" + i6 + "], " + config;
    }

    public final Object A() {
        f fVar = (f) this.f503e;
        while (true) {
            fVar = fVar.f1549d;
            Object obj = null;
            if (fVar.equals((f) this.f503e)) {
                return null;
            }
            ArrayList arrayList = fVar.f1547b;
            int size = arrayList != null ? arrayList.size() : 0;
            if (size > 0) {
                obj = fVar.f1547b.remove(size - 1);
            }
            if (obj != null) {
                return obj;
            }
            f fVar2 = fVar.f1549d;
            fVar2.f1548c = fVar.f1548c;
            fVar.f1548c.f1549d = fVar2;
            Object obj2 = fVar.f1546a;
            ((Map) this.f504f).remove(obj2);
            ((k) obj2).a();
        }
    }

    public final Bitmap a(int i3, int i6, Bitmap.Config config) {
        b2.b bVar = (b2.b) ((c) this.f503e).c();
        bVar.f1541b = i3;
        bVar.f1542c = i6;
        bVar.f1543d = config;
        return (Bitmap) ((a0) this.f504f).n(bVar);
    }

    public final void b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        b2.b bVar = (b2.b) ((c) this.f503e).c();
        bVar.f1541b = width;
        bVar.f1542c = height;
        bVar.f1543d = config;
        ((a0) this.f504f).y(bVar, bitmap);
    }

    public final void c(Bitmap bitmap, b2.d dVar) {
        IOException iOException = ((r2.e) this.f504f).f4925e;
        if (iOException != null) {
            if (bitmap != null) {
                dVar.b(bitmap);
            }
            throw iOException;
        }
    }

    public final int d(Bitmap bitmap) {
        return r2.l.c(bitmap);
    }

    public final boolean e(Object obj, File file, i iVar) {
        return ((l) this.f504f).e(new h2.d(((BitmapDrawable) ((f0) obj).get()).getBitmap(), (b2.d) this.f503e), file, iVar);
    }

    public final Bitmap f() {
        return (Bitmap) ((a0) this.f504f).A();
    }

    public final String g(int i3, int i6, Bitmap.Config config) {
        return o(i3, i6, config);
    }

    public final void h(Exception exc) {
        u uVar = (u) this.f503e;
        u uVar2 = ((k0) this.f504f).f98i;
        if (uVar2 != null && uVar2 == uVar) {
            k0 k0Var = (k0) this.f504f;
            a2.f fVar = k0Var.f99j;
            com.bumptech.glide.load.data.e eVar = ((u) this.f503e).f2546c;
            k0Var.f94e.c(fVar, exc, eVar, eVar.c());
        }
    }

    public final String i(Bitmap bitmap) {
        return o(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public final Object j() {
        try {
            return y.f5764a.b((Class) this.f503e);
        } catch (Exception e6) {
            throw new RuntimeException("Unable to create instance of " + ((Class) this.f503e) + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e6);
        }
    }

    public final int k(i iVar) {
        return ((l) this.f504f).k(iVar);
    }

    public final void l(Object obj) {
        u uVar = (u) this.f503e;
        u uVar2 = ((k0) this.f504f).f98i;
        if (uVar2 != null && uVar2 == uVar) {
            k0 k0Var = (k0) this.f504f;
            u uVar3 = (u) this.f503e;
            a2.q qVar = k0Var.f93d.f84p;
            if (obj == null || !qVar.a(uVar3.f2546c.c())) {
                g gVar = k0Var.f94e;
                y1.f fVar = uVar3.f2544a;
                com.bumptech.glide.load.data.e eVar = uVar3.f2546c;
                gVar.d(fVar, obj, eVar, eVar.c(), k0Var.f99j);
                return;
            }
            k0Var.f97h = obj;
            k0Var.f94e.b();
        }
    }

    public final void m() {
        w wVar = (w) this.f503e;
        synchronized (wVar) {
            wVar.f3444f = wVar.f3442d.length;
        }
    }

    public final Object n(k kVar) {
        f fVar = (f) ((Map) this.f504f).get(kVar);
        if (fVar == null) {
            fVar = new f(kVar);
            ((Map) this.f504f).put(kVar, fVar);
        } else {
            kVar.a();
        }
        f fVar2 = fVar.f1549d;
        fVar2.f1548c = fVar.f1548c;
        fVar.f1548c.f1549d = fVar2;
        f fVar3 = (f) this.f503e;
        fVar.f1549d = fVar3;
        f fVar4 = fVar3.f1548c;
        fVar.f1548c = fVar4;
        fVar4.f1549d = fVar;
        fVar.f1549d.f1548c = fVar;
        ArrayList arrayList = fVar.f1547b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return fVar.f1547b.remove(size - 1);
        }
        return null;
    }

    public final KeyListener p(KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? ((e) ((h1.b) this.f504f).f3358c).q(keyListener) : keyListener;
    }

    public final synchronized List q(String str) {
        List list;
        if (!((List) this.f503e).contains(str)) {
            ((List) this.f503e).add(str);
        }
        list = (List) ((Map) this.f504f).get(str);
        if (list == null) {
            list = new ArrayList();
            ((Map) this.f504f).put(str, list);
        }
        return list;
    }

    public final synchronized ArrayList r(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : (List) this.f503e) {
            List<m2.c> list = (List) ((Map) this.f504f).get(str);
            if (list != null) {
                for (m2.c cVar : list) {
                    if ((cVar.f4180a.isAssignableFrom(cls) && cls2.isAssignableFrom(cVar.f4181b)) && !arrayList.contains(cVar.f4181b)) {
                        arrayList.add(cVar.f4181b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final String s(y1.f fVar) {
        String str;
        synchronized (((h) this.f503e)) {
            str = (String) ((h) this.f503e).a(fVar);
        }
        if (str == null) {
            Object b6 = ((w0.c) this.f504f).b();
            b1.o.i(b6);
            c2.j jVar = (c2.j) b6;
            try {
                fVar.a(jVar.f1620d);
                byte[] digest = jVar.f1620d.digest();
                char[] cArr = r2.l.f4939b;
                synchronized (cArr) {
                    for (int i3 = 0; i3 < digest.length; i3++) {
                        byte b7 = digest[i3] & 255;
                        int i6 = i3 * 2;
                        char[] cArr2 = r2.l.f4938a;
                        cArr[i6] = cArr2[b7 >>> 4];
                        cArr[i6 + 1] = cArr2[b7 & 15];
                    }
                    str = new String(cArr);
                }
                ((w0.c) this.f504f).a(jVar);
            } catch (Throwable th) {
                ((w0.c) this.f504f).a(jVar);
                throw th;
            }
        }
        synchronized (((h) this.f503e)) {
            ((h) this.f503e).d(fVar, str);
        }
        return str;
    }

    /* JADX INFO: finally extract failed */
    public final void t(AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = ((EditText) this.f503e).getContext().obtainStyledAttributes(attributeSet, d.a.f2121i, i3, 0);
        try {
            boolean z5 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z5 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            ((e) ((h1.b) this.f504f).f3358c).A(z5);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final String toString() {
        switch (this.f502d) {
            case 7:
                return "Bounds{lower=" + ((q0.c) this.f503e) + " upper=" + ((q0.c) this.f504f) + "}";
            case 13:
                return "AttributeStrategy:\n  " + ((a0) this.f504f);
            case 14:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                f fVar = ((f) this.f503e).f1548c;
                boolean z5 = false;
                while (!fVar.equals((f) this.f503e)) {
                    sb.append('{');
                    sb.append(fVar.f1546a);
                    sb.append(':');
                    ArrayList arrayList = fVar.f1547b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    fVar = fVar.f1548c;
                    z5 = true;
                }
                if (z5) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final byte[] u(int i3) {
        Object obj = this.f504f;
        return ((b2.h) obj) == null ? new byte[i3] : (byte[]) ((b2.h) obj).c(i3, byte[].class);
    }

    public final h2 v(View view, h2 h2Var) {
        boolean z5;
        int i3;
        View view2 = view;
        h2 h2Var2 = h2Var;
        j0 j0Var = (j0) this.f503e;
        p1.k0 k0Var = (p1.k0) this.f504f;
        int i6 = k0Var.f4553a;
        int i7 = k0Var.f4555c;
        int i8 = k0Var.f4556d;
        j0Var.getClass();
        q0.c a6 = h2Var2.a(7);
        q0.c a7 = h2Var2.a(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) j0Var.f89b;
        bottomSheetBehavior.w = a6.f4870b;
        boolean F = b1.o.F(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z6 = bottomSheetBehavior.f1851o;
        if (z6) {
            int b6 = h2Var.b();
            bottomSheetBehavior.f1858v = b6;
            paddingBottom = b6 + i8;
        }
        boolean z7 = bottomSheetBehavior.f1852p;
        int i9 = a6.f4869a;
        if (z7) {
            paddingLeft = (F ? i7 : i6) + i9;
        }
        boolean z8 = bottomSheetBehavior.f1853q;
        int i10 = a6.f4871c;
        if (z8) {
            if (!F) {
                i6 = i7;
            }
            paddingRight = i6 + i10;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z9 = true;
        if (!bottomSheetBehavior.f1855s || marginLayoutParams.leftMargin == i9) {
            z5 = false;
        } else {
            marginLayoutParams.leftMargin = i9;
            z5 = true;
        }
        if (bottomSheetBehavior.f1856t && marginLayoutParams.rightMargin != i10) {
            marginLayoutParams.rightMargin = i10;
            z5 = true;
        }
        if (!bottomSheetBehavior.f1857u || marginLayoutParams.topMargin == (i3 = a6.f4870b)) {
            z9 = z5;
        } else {
            marginLayoutParams.topMargin = i3;
        }
        if (z9) {
            view2.setLayoutParams(marginLayoutParams);
        }
        view2.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z10 = j0Var.f88a;
        if (z10) {
            bottomSheetBehavior.f1849m = a7.f4872d;
        }
        if (z6 || z10) {
            bottomSheetBehavior.K();
        }
        return h2Var2;
    }

    public final InputConnection w(InputConnection inputConnection, EditorInfo editorInfo) {
        h1.b bVar = (h1.b) this.f504f;
        if (inputConnection != null) {
            return ((e) bVar.f3358c).w(inputConnection, editorInfo);
        }
        bVar.getClass();
        return null;
    }

    public final void x(u0.e eVar) {
        int i3 = eVar.f5249b;
        if (i3 == 0) {
            ((Handler) this.f504f).post(new u0.a(this, (n0) this.f503e, eVar.f5248a, 0));
        } else {
            ((Handler) this.f504f).post(new a.d(i3, 1, this, (n0) this.f503e));
        }
    }

    public final void y(k kVar, Object obj) {
        f fVar = (f) ((Map) this.f504f).get(kVar);
        if (fVar == null) {
            fVar = new f(kVar);
            f fVar2 = fVar.f1549d;
            fVar2.f1548c = fVar.f1548c;
            fVar.f1548c.f1549d = fVar2;
            f fVar3 = (f) this.f503e;
            fVar.f1549d = fVar3.f1549d;
            fVar.f1548c = fVar3;
            fVar3.f1549d = fVar;
            fVar.f1549d.f1548c = fVar;
            ((Map) this.f504f).put(kVar, fVar);
        } else {
            kVar.a();
        }
        if (fVar.f1547b == null) {
            fVar.f1547b = new ArrayList();
        }
        fVar.f1547b.add(obj);
    }

    public final void z(String str) {
        c2.b bVar;
        synchronized (this) {
            Object obj = ((Map) this.f503e).get(str);
            b1.o.i(obj);
            bVar = (c2.b) obj;
            int i3 = bVar.f1607b;
            if (i3 >= 1) {
                int i6 = i3 - 1;
                bVar.f1607b = i6;
                if (i6 == 0) {
                    c2.b bVar2 = (c2.b) ((Map) this.f503e).remove(str);
                    if (bVar2.equals(bVar)) {
                        c2.c cVar = (c2.c) this.f504f;
                        synchronized (cVar.f1608a) {
                            if (cVar.f1608a.size() < 10) {
                                cVar.f1608a.offer(bVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f1607b);
            }
        }
        bVar.f1606a.unlock();
    }

    public a0(int i3, int i6) {
        this.f502d = 5;
        this.f503e = new int[]{i3, i6};
        this.f504f = new float[]{0.0f, 1.0f};
    }

    public a0(int i3, int i6, int i7) {
        this.f502d = 5;
        this.f503e = new int[]{i3, i6, i7};
        this.f504f = new float[]{0.0f, 0.5f, 1.0f};
    }

    public a0(EditText editText) {
        this.f502d = 0;
        this.f503e = editText;
        this.f504f = new h1.b(editText);
    }

    public a0(TextView textView) {
        this.f502d = 1;
        textView.getClass();
        this.f503e = textView;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a0(androidx.activity.result.c cVar) {
        this(new b0(cVar));
        this.f502d = 18;
    }

    public a0(b0 b0Var) {
        this.f502d = 18;
        this.f504f = new x(3);
        this.f503e = b0Var;
    }

    public a0(e3.d dVar, e3.d dVar2) {
        this.f502d = 24;
        dVar.getClass();
        dVar2.getClass();
        if (0.0f <= 0.0f) {
            this.f503e = dVar;
            this.f504f = dVar2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public /* synthetic */ a0(Object obj, int i3, Object obj2) {
        this.f502d = i3;
        this.f503e = obj;
        this.f504f = obj2;
    }

    public /* synthetic */ a0(Object obj, Object obj2, int i3) {
        this.f502d = i3;
        this.f504f = obj;
        this.f503e = obj2;
    }

    public a0(ArrayList arrayList, ArrayList arrayList2) {
        this.f502d = 5;
        int size = arrayList.size();
        this.f503e = new int[size];
        this.f504f = new float[size];
        for (int i3 = 0; i3 < size; i3++) {
            ((int[]) this.f503e)[i3] = ((Integer) arrayList.get(i3)).intValue();
            ((float[]) this.f504f)[i3] = ((Float) arrayList2.get(i3)).floatValue();
        }
    }
}
