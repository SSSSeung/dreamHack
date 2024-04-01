package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public final class a implements j0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1067a;

    /* renamed from: b  reason: collision with root package name */
    public int f1068b;

    /* renamed from: c  reason: collision with root package name */
    public int f1069c;

    /* renamed from: d  reason: collision with root package name */
    public int f1070d;

    /* renamed from: e  reason: collision with root package name */
    public int f1071e;

    /* renamed from: f  reason: collision with root package name */
    public int f1072f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1073g;

    /* renamed from: h  reason: collision with root package name */
    public String f1074h;

    /* renamed from: i  reason: collision with root package name */
    public int f1075i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1076j;

    /* renamed from: k  reason: collision with root package name */
    public int f1077k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f1078l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f1079m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f1080n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1081o;

    /* renamed from: p  reason: collision with root package name */
    public final l0 f1082p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1083q;

    /* renamed from: r  reason: collision with root package name */
    public int f1084r;

    public a(l0 l0Var) {
        l0Var.D();
        u uVar = l0Var.f1186p;
        if (uVar != null) {
            uVar.f1295r.getClassLoader();
        }
        this.f1067a = new ArrayList();
        this.f1081o = false;
        this.f1084r = -1;
        this.f1082p = l0Var;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (l0.G(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1073g) {
            return true;
        }
        l0 l0Var = this.f1082p;
        if (l0Var.f1174d == null) {
            l0Var.f1174d = new ArrayList();
        }
        l0Var.f1174d.add(this);
        return true;
    }

    public final void b(t0 t0Var) {
        this.f1067a.add(t0Var);
        t0Var.f1288c = this.f1068b;
        t0Var.f1289d = this.f1069c;
        t0Var.f1290e = this.f1070d;
        t0Var.f1291f = this.f1071e;
    }

    public final void c(int i3) {
        if (this.f1073g) {
            if (l0.G(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i3);
            }
            ArrayList arrayList = this.f1067a;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                t0 t0Var = (t0) arrayList.get(i6);
                r rVar = t0Var.f1287b;
                if (rVar != null) {
                    rVar.f1270t += i3;
                    if (l0.G(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + t0Var.f1287b + " to " + t0Var.f1287b.f1270t);
                    }
                }
            }
        }
    }

    public final int d(boolean z5) {
        if (!this.f1083q) {
            if (l0.G(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new e1());
                f("  ", printWriter, true);
                printWriter.close();
            }
            this.f1083q = true;
            boolean z6 = this.f1073g;
            l0 l0Var = this.f1082p;
            this.f1084r = z6 ? l0Var.f1179i.getAndIncrement() : -1;
            l0Var.u(this, z5);
            return this.f1084r;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void e(int i3, r rVar, String str, int i6) {
        Class<?> cls = rVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = rVar.A;
            if (str2 == null || str.equals(str2)) {
                rVar.A = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + rVar + ": was " + rVar.A + " now " + str);
            }
        }
        if (i3 != 0) {
            if (i3 != -1) {
                int i7 = rVar.f1274y;
                if (i7 == 0 || i7 == i3) {
                    rVar.f1274y = i3;
                    rVar.f1275z = i3;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + rVar + ": was " + rVar.f1274y + " now " + i3);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + rVar + " with tag " + str + " to container view with no id");
            }
        }
        b(new t0(i6, rVar));
        rVar.f1271u = this.f1082p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z5) {
        String str2;
        if (z5) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1074h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1084r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1083q);
            if (this.f1072f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1072f));
            }
            if (!(this.f1068b == 0 && this.f1069c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1068b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1069c));
            }
            if (!(this.f1070d == 0 && this.f1071e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1070d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1071e));
            }
            if (!(this.f1075i == 0 && this.f1076j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1075i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1076j);
            }
            if (!(this.f1077k == 0 && this.f1078l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1077k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1078l);
            }
        }
        ArrayList arrayList = this.f1067a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                t0 t0Var = (t0) arrayList.get(i3);
                switch (t0Var.f1286a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + t0Var.f1286a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(t0Var.f1287b);
                if (z5) {
                    if (!(t0Var.f1288c == 0 && t0Var.f1289d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(t0Var.f1288c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(t0Var.f1289d));
                    }
                    if (t0Var.f1290e != 0 || t0Var.f1291f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(t0Var.f1290e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(t0Var.f1291f));
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f1067a;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            t0 t0Var = (t0) arrayList.get(i3);
            r rVar = t0Var.f1287b;
            if (rVar != null) {
                if (rVar.K != null) {
                    rVar.f().f1228c = false;
                }
                int i6 = this.f1072f;
                if (!(rVar.K == null && i6 == 0)) {
                    rVar.f();
                    rVar.K.f1233h = i6;
                }
                ArrayList arrayList2 = this.f1079m;
                ArrayList arrayList3 = this.f1080n;
                rVar.f();
                p pVar = rVar.K;
                pVar.f1234i = arrayList2;
                pVar.f1235j = arrayList3;
            }
            int i7 = t0Var.f1286a;
            l0 l0Var = this.f1082p;
            switch (i7) {
                case 1:
                    rVar.F(t0Var.f1288c, t0Var.f1289d, t0Var.f1290e, t0Var.f1291f);
                    l0Var.U(rVar, false);
                    l0Var.a(rVar);
                    break;
                case 3:
                    rVar.F(t0Var.f1288c, t0Var.f1289d, t0Var.f1290e, t0Var.f1291f);
                    l0Var.P(rVar);
                    break;
                case 4:
                    rVar.F(t0Var.f1288c, t0Var.f1289d, t0Var.f1290e, t0Var.f1291f);
                    l0Var.F(rVar);
                    break;
                case 5:
                    rVar.F(t0Var.f1288c, t0Var.f1289d, t0Var.f1290e, t0Var.f1291f);
                    l0Var.U(rVar, false);
                    l0.Y(rVar);
                    break;
                case 6:
                    rVar.F(t0Var.f1288c, t0Var.f1289d, t0Var.f1290e, t0Var.f1291f);
                    l0Var.g(rVar);
                    break;
                case 7:
                    rVar.F(t0Var.f1288c, t0Var.f1289d, t0Var.f1290e, t0Var.f1291f);
                    l0Var.U(rVar, false);
                    l0Var.c(rVar);
                    break;
                case 8:
                    l0Var.W(rVar);
                    break;
                case 9:
                    l0Var.W((r) null);
                    break;
                case 10:
                    l0Var.V(rVar, t0Var.f1293h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + t0Var.f1286a);
            }
        }
    }

    public final void h() {
        ArrayList arrayList = this.f1067a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t0 t0Var = (t0) arrayList.get(size);
            r rVar = t0Var.f1287b;
            if (rVar != null) {
                if (rVar.K != null) {
                    rVar.f().f1228c = true;
                }
                int i3 = this.f1072f;
                int i6 = 8194;
                if (i3 != 4097) {
                    i6 = i3 != 4099 ? i3 != 8194 ? 0 : 4097 : 4099;
                }
                if (!(rVar.K == null && i6 == 0)) {
                    rVar.f();
                    rVar.K.f1233h = i6;
                }
                ArrayList arrayList2 = this.f1080n;
                ArrayList arrayList3 = this.f1079m;
                rVar.f();
                p pVar = rVar.K;
                pVar.f1234i = arrayList2;
                pVar.f1235j = arrayList3;
            }
            int i7 = t0Var.f1286a;
            l0 l0Var = this.f1082p;
            switch (i7) {
                case 1:
                    rVar.F(t0Var.f1288c, t0Var.f1289d, t0Var.f1290e, t0Var.f1291f);
                    l0Var.U(rVar, true);
                    l0Var.P(rVar);
                    break;
                case 3:
                    rVar.F(t0Var.f1288c, t0Var.f1289d, t0Var.f1290e, t0Var.f1291f);
                    l0Var.a(rVar);
                    break;
                case 4:
                    rVar.F(t0Var.f1288c, t0Var.f1289d, t0Var.f1290e, t0Var.f1291f);
                    l0Var.getClass();
                    l0.Y(rVar);
                    break;
                case 5:
                    rVar.F(t0Var.f1288c, t0Var.f1289d, t0Var.f1290e, t0Var.f1291f);
                    l0Var.U(rVar, true);
                    l0Var.F(rVar);
                    break;
                case 6:
                    rVar.F(t0Var.f1288c, t0Var.f1289d, t0Var.f1290e, t0Var.f1291f);
                    l0Var.c(rVar);
                    break;
                case 7:
                    rVar.F(t0Var.f1288c, t0Var.f1289d, t0Var.f1290e, t0Var.f1291f);
                    l0Var.U(rVar, true);
                    l0Var.g(rVar);
                    break;
                case 8:
                    l0Var.W((r) null);
                    break;
                case 9:
                    l0Var.W(rVar);
                    break;
                case 10:
                    l0Var.V(rVar, t0Var.f1292g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + t0Var.f1286a);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1084r >= 0) {
            sb.append(" #");
            sb.append(this.f1084r);
        }
        if (this.f1074h != null) {
            sb.append(" ");
            sb.append(this.f1074h);
        }
        sb.append("}");
        return sb.toString();
    }
}
