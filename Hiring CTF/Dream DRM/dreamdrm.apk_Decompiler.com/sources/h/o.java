package h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.b;
import s0.a;
import x0.w0;

public class o implements a {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f3169y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f3170a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f3171b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3172c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3173d;

    /* renamed from: e  reason: collision with root package name */
    public m f3174e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f3175f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f3176g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3177h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f3178i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f3179j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3180k;

    /* renamed from: l  reason: collision with root package name */
    public int f3181l = 0;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f3182m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f3183n;

    /* renamed from: o  reason: collision with root package name */
    public View f3184o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3185p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3186q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3187r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3188s = false;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f3189t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList f3190u = new CopyOnWriteArrayList();

    /* renamed from: v  reason: collision with root package name */
    public q f3191v;
    public boolean w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3192x;

    public o(Context context) {
        boolean z5;
        boolean z6 = false;
        this.f3170a = context;
        Resources resources = context.getResources();
        this.f3171b = resources;
        this.f3175f = new ArrayList();
        this.f3176g = new ArrayList();
        this.f3177h = true;
        this.f3178i = new ArrayList();
        this.f3179j = new ArrayList();
        this.f3180k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z5 = w0.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z5 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z5) {
                z6 = true;
            }
        }
        this.f3173d = z6;
    }

    public final q a(int i3, int i6, int i7, CharSequence charSequence) {
        int i8;
        int i9 = (-65536 & i7) >> 16;
        if (i9 < 0 || i9 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i10 = (f3169y[i9] << 16) | (65535 & i7);
        q qVar = new q(this, i3, i6, i7, i10, charSequence, this.f3181l);
        ArrayList arrayList = this.f3175f;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((q) arrayList.get(size)).f3199d <= i10) {
                    i8 = size + 1;
                    break;
                }
            } else {
                i8 = 0;
                break;
            }
        }
        arrayList.add(i8, qVar);
        p(true);
        return qVar;
    }

    public final MenuItem add(int i3) {
        return a(0, 0, 0, this.f3171b.getString(i3));
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f3170a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005b
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            h.q r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.f3202g = r3
            if (r15 == 0) goto L_0x0058
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x0058
            r15[r14] = r4
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.o.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f3171b.getString(i3));
    }

    public final void b(c0 c0Var, Context context) {
        this.f3190u.add(new WeakReference(c0Var));
        c0Var.d(context, this);
        this.f3180k = true;
    }

    public final void c(boolean z5) {
        if (!this.f3188s) {
            this.f3188s = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3190u;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                c0 c0Var = (c0) weakReference.get();
                if (c0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    c0Var.b(this, z5);
                }
            }
            this.f3188s = false;
        }
    }

    public final void clear() {
        q qVar = this.f3191v;
        if (qVar != null) {
            d(qVar);
        }
        this.f3175f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f3183n = null;
        this.f3182m = null;
        this.f3184o = null;
        p(false);
    }

    public final void close() {
        c(true);
    }

    public boolean d(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3190u;
        boolean z5 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3191v == qVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                c0 c0Var = (c0) weakReference.get();
                if (c0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z5 = c0Var.i(qVar);
                    if (z5) {
                        break;
                    }
                }
            }
            v();
            if (z5) {
                this.f3191v = null;
            }
        }
        return z5;
    }

    public boolean e(o oVar, MenuItem menuItem) {
        m mVar = this.f3174e;
        return mVar != null && mVar.d(oVar, menuItem);
    }

    public boolean f(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3190u;
        boolean z5 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            c0 c0Var = (c0) weakReference.get();
            if (c0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z5 = c0Var.g(qVar);
                if (z5) {
                    break;
                }
            }
        }
        v();
        if (z5) {
            this.f3191v = qVar;
        }
        return z5;
    }

    public final MenuItem findItem(int i3) {
        MenuItem findItem;
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            q qVar = (q) this.f3175f.get(i6);
            if (qVar.f3196a == i3) {
                return qVar;
            }
            if (qVar.hasSubMenu() && (findItem = qVar.f3210o.findItem(i3)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final q g(int i3, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3189t;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        boolean n5 = n();
        for (int i6 = 0; i6 < size; i6++) {
            q qVar = (q) arrayList.get(i6);
            char c6 = n5 ? qVar.f3205j : qVar.f3203h;
            char[] cArr = keyData.meta;
            if ((c6 == cArr[0] && (metaState & 2) == 0) || ((c6 == cArr[2] && (metaState & 2) != 0) || (n5 && c6 == 8 && i3 == 67))) {
                return qVar;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f3175f.get(i3);
    }

    public final void h(ArrayList arrayList, int i3, KeyEvent keyEvent) {
        ArrayList arrayList2 = arrayList;
        int i6 = i3;
        KeyEvent keyEvent2 = keyEvent;
        boolean n5 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent2.getKeyData(keyData) || i6 == 67) {
            ArrayList arrayList3 = this.f3175f;
            int size = arrayList3.size();
            for (int i7 = 0; i7 < size; i7++) {
                q qVar = (q) arrayList3.get(i7);
                if (qVar.hasSubMenu()) {
                    qVar.f3210o.h(arrayList2, i6, keyEvent2);
                }
                char c6 = n5 ? qVar.f3205j : qVar.f3203h;
                if (((modifiers & 69647) == ((n5 ? qVar.f3206k : qVar.f3204i) & 69647)) && c6 != 0) {
                    char[] cArr = keyData.meta;
                    if (c6 != cArr[0] && c6 != cArr[2]) {
                        if (n5 && c6 == 8) {
                            if (i6 != 67) {
                            }
                        }
                    }
                    if (qVar.isEnabled()) {
                        arrayList2.add(qVar);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        if (this.f3192x) {
            return true;
        }
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((q) this.f3175f.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l6 = l();
        if (this.f3180k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3190u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                c0 c0Var = (c0) weakReference.get();
                if (c0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z5 |= c0Var.e();
                }
            }
            ArrayList arrayList = this.f3178i;
            ArrayList arrayList2 = this.f3179j;
            arrayList.clear();
            arrayList2.clear();
            if (z5) {
                int size = l6.size();
                for (int i3 = 0; i3 < size; i3++) {
                    q qVar = (q) l6.get(i3);
                    if (qVar.f()) {
                        arrayList.add(qVar);
                    } else {
                        arrayList2.add(qVar);
                    }
                }
            } else {
                arrayList2.addAll(l());
            }
            this.f3180k = false;
        }
    }

    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return g(i3, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public o k() {
        return this;
    }

    public final ArrayList l() {
        boolean z5 = this.f3177h;
        ArrayList arrayList = this.f3176g;
        if (!z5) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3175f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            q qVar = (q) arrayList2.get(i3);
            if (qVar.isVisible()) {
                arrayList.add(qVar);
            }
        }
        this.f3177h = false;
        this.f3180k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.f3172c;
    }

    public boolean o() {
        return this.f3173d;
    }

    public final void p(boolean z5) {
        if (!this.f3185p) {
            if (z5) {
                this.f3177h = true;
                this.f3180k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3190u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    c0 c0Var = (c0) weakReference.get();
                    if (c0Var == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        c0Var.h();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f3186q = true;
        if (z5) {
            this.f3187r = true;
        }
    }

    public final boolean performIdentifierAction(int i3, int i6) {
        return q(findItem(i3), (c0) null, i6);
    }

    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i6) {
        q g6 = g(i3, keyEvent);
        boolean q5 = g6 != null ? q(g6, (c0) null, i6) : false;
        if ((i6 & 2) != 0) {
            c(true);
        }
        return q5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005d, code lost:
        if (r1 != false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006c, code lost:
        if ((r9 & 1) == 0) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cb, code lost:
        if (r1 == false) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(android.view.MenuItem r7, h.c0 r8, int r9) {
        /*
            r6 = this;
            h.q r7 = (h.q) r7
            r0 = 0
            if (r7 == 0) goto L_0x00d1
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00d1
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f3211p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x0040
        L_0x0019:
            h.o r1 = r7.f3209n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L_0x0022
            goto L_0x0040
        L_0x0022:
            android.content.Intent r3 = r7.f3202g
            if (r3 == 0) goto L_0x0034
            android.content.Context r1 = r1.f3170a     // Catch:{ ActivityNotFoundException -> 0x002c }
            r1.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x002c }
            goto L_0x0040
        L_0x002c:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0034:
            h.r r1 = r7.A
            if (r1 == 0) goto L_0x0042
            android.view.ActionProvider r1 = r1.f3221a
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L_0x0042
        L_0x0040:
            r1 = r2
            goto L_0x0043
        L_0x0042:
            r1 = r0
        L_0x0043:
            h.r r3 = r7.A
            if (r3 == 0) goto L_0x0051
            android.view.ActionProvider r4 = r3.f3221a
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L_0x0051
            r4 = r2
            goto L_0x0052
        L_0x0051:
            r4 = r0
        L_0x0052:
            boolean r5 = r7.e()
            if (r5 == 0) goto L_0x0061
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00d0
            goto L_0x00cd
        L_0x0061:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x006f
            if (r4 == 0) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00d0
            goto L_0x00cd
        L_0x006f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0076
            r6.c(r0)
        L_0x0076:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x008a
            h.i0 r9 = new h.i0
            android.content.Context r5 = r6.f3170a
            r9.<init>(r5, r6, r7)
            r7.f3210o = r9
            java.lang.CharSequence r5 = r7.f3200e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x008a:
            h.i0 r7 = r7.f3210o
            if (r4 == 0) goto L_0x0098
            h.w r9 = r3.f3222b
            r9.getClass()
            android.view.ActionProvider r9 = r3.f3221a
            r9.onPrepareSubMenu(r7)
        L_0x0098:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f3190u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x00a1
            goto L_0x00ca
        L_0x00a1:
            if (r8 == 0) goto L_0x00a7
            boolean r0 = r8.k(r7)
        L_0x00a7:
            java.util.Iterator r8 = r9.iterator()
        L_0x00ab:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x00ca
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            h.c0 r4 = (h.c0) r4
            if (r4 != 0) goto L_0x00c3
            r9.remove(r3)
            goto L_0x00ab
        L_0x00c3:
            if (r0 != 0) goto L_0x00ab
            boolean r0 = r4.k(r7)
            goto L_0x00ab
        L_0x00ca:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00d0
        L_0x00cd:
            r6.c(r2)
        L_0x00d0:
            return r1
        L_0x00d1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.o.q(android.view.MenuItem, h.c0, int):boolean");
    }

    public final void r(c0 c0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3190u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            c0 c0Var2 = (c0) weakReference.get();
            if (c0Var2 == null || c0Var2 == c0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void removeGroup(int i3) {
        ArrayList arrayList;
        int size = size();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            arrayList = this.f3175f;
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (((q) arrayList.get(i7)).f3197b == i3) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            int size2 = arrayList.size() - i7;
            while (true) {
                int i8 = i6 + 1;
                if (i6 >= size2 || ((q) arrayList.get(i7)).f3197b != i3) {
                    p(true);
                } else {
                    if (i7 >= 0 && i7 < arrayList.size()) {
                        arrayList.remove(i7);
                    }
                    i6 = i8;
                }
            }
            p(true);
        }
    }

    public final void removeItem(int i3) {
        ArrayList arrayList;
        int size = size();
        int i6 = 0;
        while (true) {
            arrayList = this.f3175f;
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((q) arrayList.get(i6)).f3196a == i3) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0 && i6 < arrayList.size()) {
            arrayList.remove(i6);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItem item = getItem(i3);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((i0) item.getSubMenu()).s(bundle);
                }
            }
            int i6 = bundle.getInt("android:menu:expandedactionview");
            if (i6 > 0 && (findItem = findItem(i6)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void setGroupCheckable(int i3, boolean z5, boolean z6) {
        ArrayList arrayList = this.f3175f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            q qVar = (q) arrayList.get(i6);
            if (qVar.f3197b == i3) {
                qVar.f3218x = (qVar.f3218x & -5) | (z6 ? 4 : 0);
                qVar.setCheckable(z5);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z5) {
        this.w = z5;
    }

    public final void setGroupEnabled(int i3, boolean z5) {
        ArrayList arrayList = this.f3175f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            q qVar = (q) arrayList.get(i6);
            if (qVar.f3197b == i3) {
                qVar.setEnabled(z5);
            }
        }
    }

    public final void setGroupVisible(int i3, boolean z5) {
        ArrayList arrayList = this.f3175f;
        int size = arrayList.size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            q qVar = (q) arrayList.get(i6);
            if (qVar.f3197b == i3) {
                int i7 = qVar.f3218x;
                int i8 = (i7 & -9) | (z5 ? 0 : 8);
                qVar.f3218x = i8;
                if (i7 != i8) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            p(true);
        }
    }

    public void setQwertyMode(boolean z5) {
        this.f3172c = z5;
        p(false);
    }

    public final int size() {
        return this.f3175f.size();
    }

    public final void t(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = getItem(i3);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((i0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i3, CharSequence charSequence, int i6, Drawable drawable, View view) {
        if (view != null) {
            this.f3184o = view;
            this.f3182m = null;
            this.f3183n = null;
        } else {
            if (i3 > 0) {
                this.f3182m = this.f3171b.getText(i3);
            } else if (charSequence != null) {
                this.f3182m = charSequence;
            }
            if (i6 > 0) {
                Object obj = b.f4213a;
                this.f3183n = o0.b.b(this.f3170a, i6);
            } else if (drawable != null) {
                this.f3183n = drawable;
            }
            this.f3184o = null;
        }
        p(false);
    }

    public final void v() {
        this.f3185p = false;
        if (this.f3186q) {
            this.f3186q = false;
            p(this.f3187r);
        }
    }

    public final void w() {
        if (!this.f3185p) {
            this.f3185p = true;
            this.f3186q = false;
            this.f3187r = false;
        }
    }

    public final MenuItem add(int i3, int i6, int i7, int i8) {
        return a(i3, i6, i7, this.f3171b.getString(i8));
    }

    public final SubMenu addSubMenu(int i3, int i6, int i7, int i8) {
        return addSubMenu(i3, i6, i7, (CharSequence) this.f3171b.getString(i8));
    }

    public final MenuItem add(int i3, int i6, int i7, CharSequence charSequence) {
        return a(i3, i6, i7, charSequence);
    }

    public final SubMenu addSubMenu(int i3, int i6, int i7, CharSequence charSequence) {
        q a6 = a(i3, i6, i7, charSequence);
        i0 i0Var = new i0(this.f3170a, this, a6);
        a6.f3210o = i0Var;
        i0Var.setHeaderTitle(a6.f3200e);
        return i0Var;
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
