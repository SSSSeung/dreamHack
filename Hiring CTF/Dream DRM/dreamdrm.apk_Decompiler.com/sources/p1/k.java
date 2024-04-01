package p1;

import a2.m;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

public final class k extends l0 {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f4540s;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4541g = true;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f4542h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f4543i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f4544j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f4545k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f4546l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f4547m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f4548n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f4549o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f4550p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f4551q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f4552r = new ArrayList();

    public static void h(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((f1) arrayList.get(size)).f4483a.animate().cancel();
            } else {
                return;
            }
        }
    }

    public final boolean a(f1 f1Var, f1 f1Var2, k0 k0Var, k0 k0Var2) {
        int i3;
        int i6;
        int i7 = k0Var.f4553a;
        int i8 = k0Var.f4554b;
        if (f1Var2.o()) {
            int i9 = k0Var.f4553a;
            i3 = k0Var.f4554b;
            i6 = i9;
        } else {
            i6 = k0Var2.f4553a;
            i3 = k0Var2.f4554b;
        }
        if (f1Var == f1Var2) {
            return g(f1Var, i7, i8, i6, i3);
        }
        View view = f1Var.f4483a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(f1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(f1Var2);
        View view2 = f1Var2.f4483a;
        view2.setTranslationX((float) (-((int) (((float) (i6 - i7)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i3 - i8)) - translationY))));
        view2.setAlpha(0.0f);
        this.f4545k.add(new i(f1Var, f1Var2, i7, i8, i6, i3));
        return true;
    }

    public final void d(f1 f1Var) {
        View view = f1Var.f4483a;
        view.animate().cancel();
        ArrayList arrayList = this.f4544j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((j) arrayList.get(size)).f4528a == f1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(f1Var);
                arrayList.remove(size);
            }
        }
        j(f1Var, this.f4545k);
        if (this.f4542h.remove(f1Var)) {
            view.setAlpha(1.0f);
            c(f1Var);
        }
        if (this.f4543i.remove(f1Var)) {
            view.setAlpha(1.0f);
            c(f1Var);
        }
        ArrayList arrayList2 = this.f4548n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(f1Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f4547m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList5.get(size4)).f4528a == f1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(f1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList6 = this.f4546l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
                if (arrayList7.remove(f1Var)) {
                    view.setAlpha(1.0f);
                    c(f1Var);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f4551q.remove(f1Var);
                this.f4549o.remove(f1Var);
                this.f4552r.remove(f1Var);
                this.f4550p.remove(f1Var);
                i();
                return;
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f4544j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) arrayList.get(size);
            View view = jVar.f4528a.f4483a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(jVar.f4528a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f4542h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c((f1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f4543i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f1 f1Var = (f1) arrayList3.get(size3);
            f1Var.f4483a.setAlpha(1.0f);
            c(f1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f4545k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            i iVar = (i) arrayList4.get(size4);
            f1 f1Var2 = iVar.f4520a;
            if (f1Var2 != null) {
                k(iVar, f1Var2);
            }
            f1 f1Var3 = iVar.f4521b;
            if (f1Var3 != null) {
                k(iVar, f1Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f4547m;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        j jVar2 = (j) arrayList6.get(size6);
                        View view2 = jVar2.f4528a.f4483a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        c(jVar2.f4528a);
                        arrayList6.remove(size6);
                        if (arrayList6.isEmpty()) {
                            arrayList5.remove(arrayList6);
                        }
                    }
                }
            }
            ArrayList arrayList7 = this.f4546l;
            int size7 = arrayList7.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        f1 f1Var4 = (f1) arrayList8.get(size8);
                        f1Var4.f4483a.setAlpha(1.0f);
                        c(f1Var4);
                        arrayList8.remove(size8);
                        if (arrayList8.isEmpty()) {
                            arrayList7.remove(arrayList8);
                        }
                    }
                }
            }
            ArrayList arrayList9 = this.f4548n;
            int size9 = arrayList9.size();
            while (true) {
                size9--;
                if (size9 < 0) {
                    break;
                }
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        i iVar2 = (i) arrayList10.get(size10);
                        f1 f1Var5 = iVar2.f4520a;
                        if (f1Var5 != null) {
                            k(iVar2, f1Var5);
                        }
                        f1 f1Var6 = iVar2.f4521b;
                        if (f1Var6 != null) {
                            k(iVar2, f1Var6);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList9.remove(arrayList10);
                        }
                    }
                }
            }
            h(this.f4551q);
            h(this.f4550p);
            h(this.f4549o);
            h(this.f4552r);
            ArrayList arrayList11 = this.f4561b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                m.o(arrayList11.get(0));
                throw null;
            }
        }
    }

    public final boolean f() {
        return !this.f4543i.isEmpty() || !this.f4545k.isEmpty() || !this.f4544j.isEmpty() || !this.f4542h.isEmpty() || !this.f4550p.isEmpty() || !this.f4551q.isEmpty() || !this.f4549o.isEmpty() || !this.f4552r.isEmpty() || !this.f4547m.isEmpty() || !this.f4546l.isEmpty() || !this.f4548n.isEmpty();
    }

    public final boolean g(f1 f1Var, int i3, int i6, int i7, int i8) {
        View view = f1Var.f4483a;
        int translationX = i3 + ((int) view.getTranslationX());
        int translationY = i6 + ((int) f1Var.f4483a.getTranslationY());
        l(f1Var);
        int i9 = i7 - translationX;
        int i10 = i8 - translationY;
        if (i9 == 0 && i10 == 0) {
            c(f1Var);
            return false;
        }
        if (i9 != 0) {
            view.setTranslationX((float) (-i9));
        }
        if (i10 != 0) {
            view.setTranslationY((float) (-i10));
        }
        this.f4544j.add(new j(f1Var, translationX, translationY, i7, i8));
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f4561b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                m.o(arrayList.get(0));
                throw null;
            }
        }
    }

    public final void j(f1 f1Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                i iVar = (i) arrayList.get(size);
                if (k(iVar, f1Var) && iVar.f4520a == null && iVar.f4521b == null) {
                    arrayList.remove(iVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean k(i iVar, f1 f1Var) {
        if (iVar.f4521b == f1Var) {
            iVar.f4521b = null;
        } else if (iVar.f4520a != f1Var) {
            return false;
        } else {
            iVar.f4520a = null;
        }
        f1Var.f4483a.setAlpha(1.0f);
        View view = f1Var.f4483a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(f1Var);
        return true;
    }

    public final void l(f1 f1Var) {
        if (f4540s == null) {
            f4540s = new ValueAnimator().getInterpolator();
        }
        f1Var.f4483a.animate().setInterpolator(f4540s);
        d(f1Var);
    }
}
