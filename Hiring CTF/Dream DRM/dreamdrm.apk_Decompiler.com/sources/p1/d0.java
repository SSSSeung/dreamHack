package p1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class d0 extends q0 {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f4461a;

    /* renamed from: b  reason: collision with root package name */
    public final i1 f4462b = new i1(this);

    /* renamed from: c  reason: collision with root package name */
    public a0 f4463c;

    /* renamed from: d  reason: collision with root package name */
    public a0 f4464d;

    public static int b(View view, b0 b0Var) {
        return ((b0Var.c(view) / 2) + b0Var.d(view)) - ((b0Var.i() / 2) + b0Var.h());
    }

    public final int[] a(o0 o0Var, View view) {
        int[] iArr = new int[2];
        if (o0Var.d()) {
            iArr[0] = b(view, c(o0Var));
        } else {
            iArr[0] = 0;
        }
        if (o0Var.e()) {
            iArr[1] = b(view, d(o0Var));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final b0 c(o0 o0Var) {
        a0 a0Var = this.f4464d;
        if (a0Var == null || a0Var.f4435a != o0Var) {
            this.f4464d = new a0(o0Var, 0);
        }
        return this.f4464d;
    }

    public final b0 d(o0 o0Var) {
        a0 a0Var = this.f4463c;
        if (a0Var == null || a0Var.f4435a != o0Var) {
            this.f4463c = new a0(o0Var, 1);
        }
        return this.f4463c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r11 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r11.f4461a
            if (r0 != 0) goto L_0x0006
            goto L_0x006e
        L_0x0006:
            p1.o0 r0 = r0.getLayoutManager()
            if (r0 != 0) goto L_0x000d
            goto L_0x006e
        L_0x000d:
            boolean r1 = r0.e()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x001a
            p1.b0 r1 = r11.d(r0)
            goto L_0x0024
        L_0x001a:
            boolean r1 = r0.d()
            if (r1 == 0) goto L_0x0057
            p1.b0 r1 = r11.c(r0)
        L_0x0024:
            int r4 = r0.v()
            if (r4 != 0) goto L_0x002b
            goto L_0x0057
        L_0x002b:
            int r5 = r1.h()
            int r6 = r1.i()
            int r6 = r6 / 2
            int r6 = r6 + r5
            r5 = 2147483647(0x7fffffff, float:NaN)
            r7 = r3
        L_0x003a:
            if (r7 >= r4) goto L_0x0057
            android.view.View r8 = r0.u(r7)
            int r9 = r1.d(r8)
            int r10 = r1.c(r8)
            int r10 = r10 / 2
            int r10 = r10 + r9
            int r10 = r10 - r6
            int r9 = java.lang.Math.abs(r10)
            if (r9 >= r5) goto L_0x0054
            r2 = r8
            r5 = r9
        L_0x0054:
            int r7 = r7 + 1
            goto L_0x003a
        L_0x0057:
            if (r2 != 0) goto L_0x005a
            goto L_0x006e
        L_0x005a:
            int[] r0 = r11.a(r0, r2)
            r1 = r0[r3]
            r2 = 1
            if (r1 != 0) goto L_0x0067
            r4 = r0[r2]
            if (r4 == 0) goto L_0x006e
        L_0x0067:
            androidx.recyclerview.widget.RecyclerView r4 = r11.f4461a
            r0 = r0[r2]
            r4.g0(r1, r0, r3)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.d0.e():void");
    }
}
