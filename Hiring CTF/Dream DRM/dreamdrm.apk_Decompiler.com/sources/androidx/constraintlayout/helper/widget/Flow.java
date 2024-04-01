package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import h0.e;
import h0.h;
import j0.r;
import j0.s;

public class Flow extends s {

    /* renamed from: l  reason: collision with root package name */
    public h f917l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        this.f917l = new h();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f3778b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 0) {
                    this.f917l.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    h hVar = this.f917l;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar.f0 = dimensionPixelSize;
                    hVar.f3328g0 = dimensionPixelSize;
                    hVar.f3329h0 = dimensionPixelSize;
                    hVar.f3330i0 = dimensionPixelSize;
                } else if (index == 11) {
                    h hVar2 = this.f917l;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar2.f3329h0 = dimensionPixelSize2;
                    hVar2.f3331j0 = dimensionPixelSize2;
                    hVar2.f3332k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f917l.f3330i0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f917l.f3331j0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f917l.f0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f917l.f3332k0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f917l.f3328g0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f917l.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f917l.f3338q0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f917l.f3339r0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f917l.f3340s0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f917l.f3342u0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f917l.f3341t0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f917l.f3343v0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f917l.f3344w0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f917l.f3346y0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f917l.A0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f917l.f3347z0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f917l.B0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f917l.f3345x0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f917l.E0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f917l.F0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f917l.C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f917l.D0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f917l.H0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f3653g = this.f917l;
        g();
    }

    public final void f(e eVar, boolean z5) {
        h hVar = this.f917l;
        int i3 = hVar.f3329h0;
        if (i3 <= 0 && hVar.f3330i0 <= 0) {
            return;
        }
        if (z5) {
            hVar.f3331j0 = hVar.f3330i0;
            hVar.f3332k0 = i3;
            return;
        }
        hVar.f3331j0 = i3;
        hVar.f3332k0 = hVar.f3330i0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: h0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v79, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v14, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v15, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r33v0 */
    /* JADX WARNING: type inference failed for: r33v2 */
    /* JADX WARNING: type inference failed for: r33v3 */
    /* JADX WARNING: type inference failed for: r33v4 */
    /* JADX WARNING: type inference failed for: r33v7 */
    /* JADX WARNING: type inference failed for: r33v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02ad, code lost:
        r10 = r6;
        r9 = r8;
        r16 = r18;
        r6 = r21;
        r7 = r22;
        r5 = r23;
        r8 = r40;
        r18 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        if (r8.f3339r0 == -1) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c1, code lost:
        if (r8.f3339r0 == -1) goto L_0x00c3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0293 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x029a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x071f  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0721  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x072e  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0730  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0749  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x074c  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x02d0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(h0.h r40, int r41, int r42) {
        /*
            r39 = this;
            r8 = r40
            int r9 = android.view.View.MeasureSpec.getMode(r41)
            int r10 = android.view.View.MeasureSpec.getSize(r41)
            int r11 = android.view.View.MeasureSpec.getMode(r42)
            int r12 = android.view.View.MeasureSpec.getSize(r42)
            r13 = 0
            if (r8 == 0) goto L_0x075b
            int r0 = r8.f3353e0
            r14 = 3
            r15 = 2
            r6 = 1
            if (r0 <= 0) goto L_0x0097
            h0.e r0 = r8.I
            if (r0 == 0) goto L_0x0025
            h0.f r0 = (h0.f) r0
            j0.e r0 = r0.f3298g0
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 != 0) goto L_0x002b
            r0 = r13
            goto L_0x008a
        L_0x002b:
            r1 = r13
        L_0x002c:
            int r2 = r8.f3353e0
            if (r1 >= r2) goto L_0x0089
            h0.e[] r2 = r8.f3352d0
            r2 = r2[r1]
            if (r2 != 0) goto L_0x0037
            goto L_0x0086
        L_0x0037:
            boolean r3 = r2 instanceof h0.i
            if (r3 == 0) goto L_0x003c
            goto L_0x0086
        L_0x003c:
            int r3 = r2.i(r13)
            int r4 = r2.i(r6)
            if (r3 != r14) goto L_0x0052
            int r5 = r2.f3280j
            if (r5 == r6) goto L_0x0052
            if (r4 != r14) goto L_0x0052
            int r5 = r2.f3281k
            if (r5 == r6) goto L_0x0052
            r5 = r6
            goto L_0x0053
        L_0x0052:
            r5 = r13
        L_0x0053:
            if (r5 == 0) goto L_0x0056
            goto L_0x0086
        L_0x0056:
            if (r3 != r14) goto L_0x0059
            r3 = r15
        L_0x0059:
            if (r4 != r14) goto L_0x005c
            r4 = r15
        L_0x005c:
            i0.b r5 = r8.f3336o0
            r5.f3507a = r3
            r5.f3508b = r4
            int r3 = r2.l()
            r5.f3509c = r3
            int r3 = r2.j()
            r5.f3510d = r3
            r0.a(r2, r5)
            int r3 = r5.f3511e
            r2.y(r3)
            int r3 = r5.f3512f
            r2.v(r3)
            int r3 = r5.f3513g
            r2.P = r3
            if (r3 <= 0) goto L_0x0083
            r3 = r6
            goto L_0x0084
        L_0x0083:
            r3 = r13
        L_0x0084:
            r2.w = r3
        L_0x0086:
            int r1 = r1 + 1
            goto L_0x002c
        L_0x0089:
            r0 = r6
        L_0x008a:
            if (r0 != 0) goto L_0x0097
            r8.f3334m0 = r13
            r8.f3335n0 = r13
            r8.f3333l0 = r13
            r1 = r39
            r0 = r8
            goto L_0x0751
        L_0x0097:
            int r5 = r8.f3331j0
            int r4 = r8.f3332k0
            int r3 = r8.f0
            int r2 = r8.f3328g0
            int[] r1 = new int[r15]
            int r0 = r10 - r5
            int r0 = r0 - r4
            int r14 = r8.I0
            if (r14 != r6) goto L_0x00ab
            int r0 = r12 - r3
            int r0 = r0 - r2
        L_0x00ab:
            r7 = -1
            if (r14 != 0) goto L_0x00b9
            int r14 = r8.f3338q0
            if (r14 != r7) goto L_0x00b4
            r8.f3338q0 = r13
        L_0x00b4:
            int r14 = r8.f3339r0
            if (r14 != r7) goto L_0x00c5
            goto L_0x00c3
        L_0x00b9:
            int r14 = r8.f3338q0
            if (r14 != r7) goto L_0x00bf
            r8.f3338q0 = r13
        L_0x00bf:
            int r14 = r8.f3339r0
            if (r14 != r7) goto L_0x00c5
        L_0x00c3:
            r8.f3339r0 = r13
        L_0x00c5:
            h0.e[] r7 = r8.f3352d0
            r14 = r13
            r16 = r14
        L_0x00ca:
            int r13 = r8.f3353e0
            r15 = 8
            if (r14 >= r13) goto L_0x00de
            h0.e[] r13 = r8.f3352d0
            r13 = r13[r14]
            int r13 = r13.V
            if (r13 != r15) goto L_0x00da
            int r16 = r16 + 1
        L_0x00da:
            int r14 = r14 + 1
            r15 = 2
            goto L_0x00ca
        L_0x00de:
            if (r16 <= 0) goto L_0x0100
            int r13 = r13 - r16
            h0.e[] r7 = new h0.e[r13]
            r13 = 0
            r14 = 0
        L_0x00e6:
            int r6 = r8.f3353e0
            if (r13 >= r6) goto L_0x00fd
            h0.e[] r6 = r8.f3352d0
            r6 = r6[r13]
            r18 = r1
            int r1 = r6.V
            if (r1 == r15) goto L_0x00f8
            r7[r14] = r6
            int r14 = r14 + 1
        L_0x00f8:
            int r13 = r13 + 1
            r1 = r18
            goto L_0x00e6
        L_0x00fd:
            r18 = r1
            goto L_0x0103
        L_0x0100:
            r18 = r1
            r14 = r13
        L_0x0103:
            r13 = r7
            r8.N0 = r13
            r8.O0 = r14
            int r1 = r8.G0
            java.util.ArrayList r7 = r8.J0
            if (r1 == 0) goto L_0x0656
            r6 = 1
            if (r1 == r6) goto L_0x02f9
            r6 = 2
            if (r1 == r6) goto L_0x011e
            r20 = r39
            r0 = r8
            r28 = r18
            r1 = 0
            r33 = 1
            goto L_0x0710
        L_0x011e:
            int r1 = r8.I0
            int r6 = r8.H0
            if (r1 != 0) goto L_0x014c
            if (r6 > 0) goto L_0x0147
            r6 = 0
            r7 = 0
            r15 = 0
        L_0x0129:
            r19 = r2
            if (r6 >= r14) goto L_0x014a
            if (r6 <= 0) goto L_0x0132
            int r2 = r8.C0
            int r7 = r7 + r2
        L_0x0132:
            r2 = r13[r6]
            if (r2 != 0) goto L_0x0137
            goto L_0x0142
        L_0x0137:
            int r2 = r8.C(r2, r0)
            int r2 = r2 + r7
            if (r2 <= r0) goto L_0x013f
            goto L_0x014a
        L_0x013f:
            int r15 = r15 + 1
            r7 = r2
        L_0x0142:
            int r6 = r6 + 1
            r2 = r19
            goto L_0x0129
        L_0x0147:
            r19 = r2
            r15 = r6
        L_0x014a:
            r6 = 0
            goto L_0x016f
        L_0x014c:
            r19 = r2
            if (r6 > 0) goto L_0x016e
            r2 = 0
            r6 = 0
            r7 = 0
        L_0x0153:
            if (r2 >= r14) goto L_0x016d
            if (r2 <= 0) goto L_0x015a
            int r15 = r8.D0
            int r6 = r6 + r15
        L_0x015a:
            r15 = r13[r2]
            if (r15 != 0) goto L_0x015f
            goto L_0x016a
        L_0x015f:
            int r15 = r8.B(r15, r0)
            int r15 = r15 + r6
            if (r15 <= r0) goto L_0x0167
            goto L_0x016d
        L_0x0167:
            int r7 = r7 + 1
            r6 = r15
        L_0x016a:
            int r2 = r2 + 1
            goto L_0x0153
        L_0x016d:
            r6 = r7
        L_0x016e:
            r15 = 0
        L_0x016f:
            int[] r2 = r8.M0
            if (r2 != 0) goto L_0x0178
            r2 = 2
            int[] r2 = new int[r2]
            r8.M0 = r2
        L_0x0178:
            if (r6 != 0) goto L_0x017d
            r2 = 1
            if (r1 == r2) goto L_0x0181
        L_0x017d:
            if (r15 != 0) goto L_0x0198
            if (r1 != 0) goto L_0x0198
        L_0x0181:
            r20 = r39
            r7 = r5
            r2 = r8
            r24 = r9
            r16 = r18
            r5 = r3
            r9 = r2
            r3 = r0
            r0 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r6
            r6 = r4
            r4 = r1
            r1 = 1
            goto L_0x02bf
        L_0x0198:
            r20 = r39
            r2 = r0
            r7 = r5
            r40 = r8
            r0 = r15
            r17 = 0
            r5 = r3
            r15 = r14
            r3 = r1
            r1 = r40
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r6
            r6 = r4
            r4 = r18
        L_0x01af:
            if (r17 != 0) goto L_0x02d0
            if (r3 != 0) goto L_0x01c3
            float r9 = (float) r15
            r41 = r1
            float r1 = (float) r0
            float r9 = r9 / r1
            r1 = r5
            r21 = r6
            double r5 = (double) r9
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r5
            goto L_0x01d2
        L_0x01c3:
            r41 = r1
            r1 = r5
            r21 = r6
            float r0 = (float) r15
            float r5 = (float) r9
            float r0 = r0 / r5
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
            int r0 = (int) r5
            r6 = r9
        L_0x01d2:
            h0.e[] r5 = r8.L0
            if (r5 == 0) goto L_0x01df
            int r9 = r5.length
            if (r9 >= r0) goto L_0x01da
            goto L_0x01df
        L_0x01da:
            r9 = 0
            java.util.Arrays.fill(r5, r9)
            goto L_0x01e4
        L_0x01df:
            r9 = 0
            h0.e[] r5 = new h0.e[r0]
            r8.L0 = r5
        L_0x01e4:
            h0.e[] r5 = r8.K0
            if (r5 == 0) goto L_0x01f2
            int r9 = r5.length
            if (r9 >= r6) goto L_0x01ed
            r9 = 0
            goto L_0x01f2
        L_0x01ed:
            r9 = 0
            java.util.Arrays.fill(r5, r9)
            goto L_0x01f6
        L_0x01f2:
            h0.e[] r5 = new h0.e[r6]
            r8.K0 = r5
        L_0x01f6:
            r5 = 0
        L_0x01f7:
            if (r5 >= r0) goto L_0x0255
            r9 = 0
        L_0x01fa:
            if (r9 >= r6) goto L_0x024b
            int r22 = r9 * r0
            int r22 = r22 + r5
            r23 = r1
            r1 = 1
            if (r3 != r1) goto L_0x0209
            int r1 = r5 * r6
            int r22 = r1 + r9
        L_0x0209:
            r1 = r22
            r22 = r7
            int r7 = r14.length
            if (r1 < r7) goto L_0x0211
            goto L_0x0215
        L_0x0211:
            r1 = r14[r1]
            if (r1 != 0) goto L_0x0218
        L_0x0215:
            r24 = r10
            goto L_0x0242
        L_0x0218:
            int r7 = r8.C(r1, r2)
            r24 = r10
            h0.e[] r10 = r8.L0
            r10 = r10[r5]
            if (r10 == 0) goto L_0x022a
            int r10 = r10.l()
            if (r10 >= r7) goto L_0x022e
        L_0x022a:
            h0.e[] r7 = r8.L0
            r7[r5] = r1
        L_0x022e:
            int r7 = r8.B(r1, r2)
            h0.e[] r10 = r8.K0
            r10 = r10[r9]
            if (r10 == 0) goto L_0x023e
            int r10 = r10.j()
            if (r10 >= r7) goto L_0x0242
        L_0x023e:
            h0.e[] r7 = r8.K0
            r7[r9] = r1
        L_0x0242:
            int r9 = r9 + 1
            r7 = r22
            r1 = r23
            r10 = r24
            goto L_0x01fa
        L_0x024b:
            r23 = r1
            r22 = r7
            r24 = r10
            int r5 = r5 + 1
            r9 = 0
            goto L_0x01f7
        L_0x0255:
            r23 = r1
            r22 = r7
            r24 = r10
            r1 = 0
            r5 = 0
        L_0x025d:
            if (r1 >= r0) goto L_0x0273
            h0.e[] r7 = r8.L0
            r7 = r7[r1]
            if (r7 == 0) goto L_0x0270
            if (r1 <= 0) goto L_0x026a
            int r9 = r8.C0
            int r5 = r5 + r9
        L_0x026a:
            int r7 = r8.C(r7, r2)
            int r7 = r7 + r5
            r5 = r7
        L_0x0270:
            int r1 = r1 + 1
            goto L_0x025d
        L_0x0273:
            r1 = 0
            r7 = 0
        L_0x0275:
            if (r1 >= r6) goto L_0x028b
            h0.e[] r9 = r8.K0
            r9 = r9[r1]
            if (r9 == 0) goto L_0x0288
            if (r1 <= 0) goto L_0x0282
            int r10 = r8.D0
            int r7 = r7 + r10
        L_0x0282:
            int r9 = r8.B(r9, r2)
            int r9 = r9 + r7
            r7 = r9
        L_0x0288:
            int r1 = r1 + 1
            goto L_0x0275
        L_0x028b:
            r1 = 0
            r4[r1] = r5
            r1 = 1
            r4[r1] = r7
            if (r3 != 0) goto L_0x029a
            if (r5 <= r2) goto L_0x02ad
            if (r0 <= r1) goto L_0x02ad
            int r0 = r0 + -1
            goto L_0x02a0
        L_0x029a:
            if (r7 <= r2) goto L_0x02ad
            if (r6 <= r1) goto L_0x02ad
            int r6 = r6 + -1
        L_0x02a0:
            r9 = r6
            r1 = r41
            r6 = r21
            r7 = r22
            r5 = r23
            r10 = r24
            goto L_0x01af
        L_0x02ad:
            r10 = r6
            r9 = r8
            r16 = r18
            r6 = r21
            r7 = r22
            r5 = r23
            r8 = r40
            r18 = r4
            r4 = r3
            r3 = r2
            r2 = r41
        L_0x02bf:
            r17 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r40 = r8
            r8 = r9
            r9 = r10
            r4 = r18
            r10 = r24
            r18 = r16
            goto L_0x01af
        L_0x02d0:
            r41 = r1
            r23 = r5
            r21 = r6
            r22 = r7
            r24 = r10
            r1 = 1
            int[] r2 = r8.M0
            r3 = 0
            r2[r3] = r0
            r2[r1] = r9
            r0 = r40
            r8 = r41
            r33 = r1
            r10 = r11
            r11 = r12
            r12 = r13
            r1 = r18
            r2 = r19
            r4 = r21
            r5 = r22
            r3 = r23
            r9 = r24
            goto L_0x0685
        L_0x02f9:
            r19 = r2
            r1 = r6
            r16 = 0
            int r6 = r8.I0
            if (r14 != 0) goto L_0x030d
            r20 = r39
            r33 = r1
            r0 = r8
            r1 = r18
            r2 = r19
            goto L_0x0685
        L_0x030d:
            r7.clear()
            h0.g r2 = new h0.g
            h0.d r15 = r8.f3293x
            r20 = r4
            h0.d r4 = r8.f3294y
            r21 = r5
            h0.d r5 = r8.f3295z
            r22 = r7
            h0.d r7 = r8.A
            r27 = r0
            r0 = r2
            r28 = r18
            r18 = r1
            r1 = r40
            r30 = r9
            r29 = r19
            r9 = r2
            r2 = r6
            r31 = r3
            r3 = r15
            r15 = r20
            r32 = r21
            r34 = r6
            r33 = r18
            r6 = r7
            r35 = r10
            r36 = r11
            r11 = r16
            r10 = r22
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.add(r9)
            if (r34 != 0) goto L_0x03d0
            r2 = r9
            r0 = 0
            r1 = 0
            r9 = 0
        L_0x0351:
            if (r9 >= r14) goto L_0x03cc
            r7 = r13[r9]
            r6 = r27
            int r16 = r8.C(r7, r6)
            int[] r3 = r7.f3273c0
            r4 = 0
            r3 = r3[r4]
            r4 = 3
            if (r3 != r4) goto L_0x0365
            int r0 = r0 + 1
        L_0x0365:
            r18 = r0
            if (r1 == r6) goto L_0x0370
            int r0 = r8.C0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r6) goto L_0x0377
        L_0x0370:
            h0.e r0 = r2.f3311b
            if (r0 == 0) goto L_0x0377
            r0 = r33
            goto L_0x0378
        L_0x0377:
            r0 = 0
        L_0x0378:
            if (r0 != 0) goto L_0x0386
            if (r9 <= 0) goto L_0x0386
            int r3 = r8.H0
            if (r3 <= 0) goto L_0x0386
            int r3 = r9 % r3
            if (r3 != 0) goto L_0x0386
            r0 = r33
        L_0x0386:
            if (r0 == 0) goto L_0x03b1
            h0.g r5 = new h0.g
            h0.d r3 = r8.f3293x
            h0.d r4 = r8.f3294y
            h0.d r2 = r8.f3295z
            h0.d r1 = r8.A
            r0 = r5
            r19 = r1
            r1 = r40
            r20 = r2
            r2 = r34
            r11 = r5
            r5 = r20
            r27 = r6
            r6 = r19
            r37 = r12
            r12 = r7
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.f3323n = r9
            r10.add(r11)
            r2 = r11
            goto L_0x03bf
        L_0x03b1:
            r27 = r6
            r37 = r12
            r12 = r7
            if (r9 <= 0) goto L_0x03bf
            int r0 = r8.C0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x03c1
        L_0x03bf:
            r1 = r16
        L_0x03c1:
            r2.a(r12)
            int r9 = r9 + 1
            r0 = r18
            r12 = r37
            r11 = 0
            goto L_0x0351
        L_0x03cc:
            r37 = r12
            goto L_0x0442
        L_0x03d0:
            r37 = r12
            r2 = r9
            r0 = 0
            r1 = 0
            r9 = 0
        L_0x03d6:
            if (r9 >= r14) goto L_0x0442
            r11 = r13[r9]
            r12 = r27
            int r16 = r8.B(r11, r12)
            int[] r3 = r11.f3273c0
            r3 = r3[r33]
            r4 = 3
            if (r3 != r4) goto L_0x03e9
            int r0 = r0 + 1
        L_0x03e9:
            r18 = r0
            if (r1 == r12) goto L_0x03f4
            int r0 = r8.D0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r12) goto L_0x03fb
        L_0x03f4:
            h0.e r0 = r2.f3311b
            if (r0 == 0) goto L_0x03fb
            r6 = r33
            goto L_0x03fc
        L_0x03fb:
            r6 = 0
        L_0x03fc:
            if (r6 != 0) goto L_0x040a
            if (r9 <= 0) goto L_0x040a
            int r0 = r8.H0
            if (r0 <= 0) goto L_0x040a
            int r0 = r9 % r0
            if (r0 != 0) goto L_0x040a
            r6 = r33
        L_0x040a:
            if (r6 == 0) goto L_0x0429
            h0.g r7 = new h0.g
            h0.d r3 = r8.f3293x
            h0.d r4 = r8.f3294y
            h0.d r5 = r8.f3295z
            h0.d r6 = r8.A
            r0 = r7
            r1 = r40
            r2 = r34
            r27 = r15
            r15 = r7
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r15.f3323n = r9
            r10.add(r15)
            r2 = r15
            goto L_0x0434
        L_0x0429:
            r27 = r15
            if (r9 <= 0) goto L_0x0434
            int r0 = r8.D0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x0436
        L_0x0434:
            r1 = r16
        L_0x0436:
            r2.a(r11)
            int r9 = r9 + 1
            r0 = r18
            r15 = r27
            r27 = r12
            goto L_0x03d6
        L_0x0442:
            r12 = r27
            r27 = r15
            int r1 = r10.size()
            int r2 = r8.f3331j0
            int r3 = r8.f0
            int r4 = r8.f3332k0
            int r5 = r8.f3328g0
            int[] r6 = r8.f3273c0
            r7 = 0
            r9 = r6[r7]
            r7 = 2
            if (r9 == r7) goto L_0x0461
            r6 = r6[r33]
            if (r6 != r7) goto L_0x045f
            goto L_0x0461
        L_0x045f:
            r6 = 0
            goto L_0x0463
        L_0x0461:
            r6 = r33
        L_0x0463:
            if (r0 <= 0) goto L_0x0587
            if (r6 == 0) goto L_0x0587
            r0 = 0
        L_0x0468:
            if (r0 >= r1) goto L_0x0587
            java.lang.Object r6 = r10.get(r0)
            h0.g r6 = (h0.g) r6
            if (r34 != 0) goto L_0x0477
            int r7 = r6.d()
            goto L_0x047b
        L_0x0477:
            int r7 = r6.c()
        L_0x047b:
            int r7 = r12 - r7
            int r9 = r6.f3325p
            if (r9 != 0) goto L_0x0487
            r19 = r2
            r20 = r3
            goto L_0x057d
        L_0x0487:
            int r11 = r6.f3324o
            int r7 = r7 / r9
            r9 = 0
        L_0x048b:
            h0.h r13 = r6.f3327r
            if (r9 >= r11) goto L_0x04fc
            int r14 = r6.f3323n
            int r14 = r14 + r9
            int r15 = r13.O0
            if (r14 < r15) goto L_0x049e
            r19 = r2
            r20 = r3
            r2 = 0
            r3 = 3
            goto L_0x0502
        L_0x049e:
            h0.e[] r15 = r13.N0
            r14 = r15[r14]
            int r15 = r6.f3310a
            if (r15 != 0) goto L_0x04ce
            if (r14 == 0) goto L_0x04c9
            int[] r15 = r14.f3273c0
            r19 = r2
            r16 = 0
            r2 = r15[r16]
            r20 = r3
            r3 = 3
            if (r2 != r3) goto L_0x04f5
            int r2 = r14.f3280j
            if (r2 != 0) goto L_0x04f4
            r2 = r15[r33]
            int r3 = r14.j()
            r17 = r2
            r18 = r3
            r16 = r7
            r2 = r33
            r15 = 3
            goto L_0x04ec
        L_0x04c9:
            r19 = r2
            r20 = r3
            goto L_0x04f4
        L_0x04ce:
            r19 = r2
            r20 = r3
            if (r14 == 0) goto L_0x04f4
            int[] r2 = r14.f3273c0
            r3 = r2[r33]
            r15 = 3
            if (r3 != r15) goto L_0x04f2
            int r3 = r14.f3281k
            if (r3 != 0) goto L_0x04f2
            r3 = 0
            r2 = r2[r3]
            int r3 = r14.l()
            r16 = r3
            r18 = r7
            r17 = r33
        L_0x04ec:
            r3 = r15
            r15 = r2
            r13.D(r14, r15, r16, r17, r18)
            goto L_0x04f5
        L_0x04f2:
            r3 = r15
            goto L_0x04f5
        L_0x04f4:
            r3 = 3
        L_0x04f5:
            int r9 = r9 + 1
            r2 = r19
            r3 = r20
            goto L_0x048b
        L_0x04fc:
            r19 = r2
            r20 = r3
            r3 = 3
            r2 = 0
        L_0x0502:
            r6.f3321l = r2
            r6.f3322m = r2
            r7 = 0
            r6.f3311b = r7
            r6.f3312c = r2
            int r2 = r6.f3324o
            r7 = 0
        L_0x050e:
            if (r7 >= r2) goto L_0x057d
            int r9 = r6.f3323n
            int r9 = r9 + r7
            int r11 = r13.O0
            if (r9 < r11) goto L_0x0518
            goto L_0x057d
        L_0x0518:
            h0.e[] r11 = r13.N0
            r9 = r11[r9]
            int r11 = r6.f3310a
            if (r11 != 0) goto L_0x054c
            int r11 = r9.l()
            int r14 = r13.C0
            int r15 = r9.V
            r3 = 8
            if (r15 != r3) goto L_0x052d
            r14 = 0
        L_0x052d:
            int r3 = r6.f3321l
            int r11 = r11 + r14
            int r11 = r11 + r3
            r6.f3321l = r11
            int r3 = r6.f3326q
            int r3 = r13.B(r9, r3)
            h0.e r11 = r6.f3311b
            if (r11 == 0) goto L_0x0541
            int r11 = r6.f3312c
            if (r11 >= r3) goto L_0x0547
        L_0x0541:
            r6.f3311b = r9
            r6.f3312c = r3
            r6.f3322m = r3
        L_0x0547:
            r16 = r2
            r2 = 8
            goto L_0x0577
        L_0x054c:
            int r3 = r6.f3326q
            int r3 = r13.C(r9, r3)
            int r11 = r6.f3326q
            int r11 = r13.B(r9, r11)
            int r14 = r13.D0
            int r15 = r9.V
            r16 = r2
            r2 = 8
            if (r15 != r2) goto L_0x0563
            r14 = 0
        L_0x0563:
            int r15 = r6.f3322m
            int r11 = r11 + r14
            int r11 = r11 + r15
            r6.f3322m = r11
            h0.e r11 = r6.f3311b
            if (r11 == 0) goto L_0x0571
            int r11 = r6.f3312c
            if (r11 >= r3) goto L_0x0577
        L_0x0571:
            r6.f3311b = r9
            r6.f3312c = r3
            r6.f3321l = r3
        L_0x0577:
            int r7 = r7 + 1
            r2 = r16
            r3 = 3
            goto L_0x050e
        L_0x057d:
            r2 = 8
            int r0 = r0 + 1
            r2 = r19
            r3 = r20
            goto L_0x0468
        L_0x0587:
            r19 = r2
            r20 = r3
            h0.d r0 = r8.A
            h0.d r2 = r8.f3295z
            h0.d r3 = r8.f3293x
            h0.d r6 = r8.f3294y
            r15 = r0
            r38 = r2
            r7 = r19
            r9 = r20
            r11 = 0
            r13 = 0
            r14 = 0
        L_0x059d:
            if (r11 >= r1) goto L_0x0650
            java.lang.Object r16 = r10.get(r11)
            r41 = r0
            r0 = r16
            h0.g r0 = (h0.g) r0
            if (r34 != 0) goto L_0x05fa
            int r5 = r1 + -1
            if (r11 >= r5) goto L_0x05c0
            int r5 = r11 + 1
            java.lang.Object r5 = r10.get(r5)
            h0.g r5 = (h0.g) r5
            h0.e r5 = r5.f3311b
            h0.d r5 = r5.f3294y
            r42 = r2
            r15 = r5
            r5 = 0
            goto L_0x05c6
        L_0x05c0:
            int r5 = r8.f3328g0
            r15 = r41
            r42 = r2
        L_0x05c6:
            h0.e r2 = r0.f3311b
            h0.d r2 = r2.A
            r16 = r0
            r17 = r34
            r18 = r3
            r19 = r6
            r20 = r38
            r21 = r15
            r22 = r7
            r23 = r9
            r24 = r4
            r25 = r5
            r26 = r12
            r16.e(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r6 = r0.d()
            int r6 = java.lang.Math.max(r13, r6)
            int r0 = r0.c()
            int r0 = r0 + r14
            if (r11 <= 0) goto L_0x05f5
            int r9 = r8.D0
            int r0 = r0 + r9
        L_0x05f5:
            r14 = r0
            r13 = r6
            r9 = 0
            r6 = r2
            goto L_0x0648
        L_0x05fa:
            r42 = r2
            int r2 = r1 + -1
            if (r11 >= r2) goto L_0x0610
            int r2 = r11 + 1
            java.lang.Object r2 = r10.get(r2)
            h0.g r2 = (h0.g) r2
            h0.e r2 = r2.f3311b
            h0.d r2 = r2.f3293x
            r38 = r2
            r2 = 0
            goto L_0x0614
        L_0x0610:
            int r2 = r8.f3332k0
            r38 = r42
        L_0x0614:
            h0.e r4 = r0.f3311b
            h0.d r4 = r4.f3295z
            r16 = r0
            r17 = r34
            r18 = r3
            r19 = r6
            r20 = r38
            r21 = r15
            r22 = r7
            r23 = r9
            r24 = r2
            r25 = r5
            r26 = r12
            r16.e(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r3 = r0.d()
            int r3 = r3 + r13
            int r0 = r0.c()
            int r0 = java.lang.Math.max(r14, r0)
            if (r11 <= 0) goto L_0x0643
            int r7 = r8.C0
            int r3 = r3 + r7
        L_0x0643:
            r14 = r0
            r13 = r3
            r3 = r4
            r7 = 0
            r4 = r2
        L_0x0648:
            int r11 = r11 + 1
            r0 = r41
            r2 = r42
            goto L_0x059d
        L_0x0650:
            r0 = 0
            r28[r0] = r13
            r28[r33] = r14
            goto L_0x0670
        L_0x0656:
            r29 = r2
            r31 = r3
            r27 = r4
            r32 = r5
            r30 = r9
            r35 = r10
            r36 = r11
            r37 = r12
            r28 = r18
            r33 = 1
            r12 = r0
            r10 = r7
            int r2 = r8.I0
            if (r14 != 0) goto L_0x068a
        L_0x0670:
            r20 = r39
            r0 = r8
            r4 = r27
            r1 = r28
            r2 = r29
            r9 = r30
            r3 = r31
            r5 = r32
            r10 = r35
            r11 = r36
            r12 = r37
        L_0x0685:
            r28 = r1
            r1 = 0
            goto L_0x0710
        L_0x068a:
            int r0 = r10.size()
            if (r0 != 0) goto L_0x06a5
            h0.g r9 = new h0.g
            h0.d r3 = r8.f3293x
            h0.d r4 = r8.f3294y
            h0.d r5 = r8.f3295z
            h0.d r6 = r8.A
            r0 = r9
            r1 = r40
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.add(r9)
            goto L_0x06e5
        L_0x06a5:
            r0 = 0
            java.lang.Object r1 = r10.get(r0)
            r9 = r1
            h0.g r9 = (h0.g) r9
            r9.f3312c = r0
            r1 = 0
            r9.f3311b = r1
            r9.f3321l = r0
            r9.f3322m = r0
            r9.f3323n = r0
            r9.f3324o = r0
            r9.f3325p = r0
            h0.d r0 = r8.f3293x
            h0.d r1 = r8.f3294y
            h0.d r3 = r8.f3295z
            h0.d r4 = r8.A
            int r5 = r8.f3331j0
            int r6 = r8.f0
            int r7 = r8.f3332k0
            int r10 = r8.f3328g0
            r16 = r9
            r17 = r2
            r18 = r0
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r10
            r26 = r12
            r16.e(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x06e5:
            r0 = 0
        L_0x06e6:
            if (r0 >= r14) goto L_0x06f0
            r1 = r13[r0]
            r9.a(r1)
            int r0 = r0 + 1
            goto L_0x06e6
        L_0x06f0:
            int r0 = r9.d()
            r1 = 0
            r28[r1] = r0
            int r0 = r9.c()
            r28[r33] = r0
            r20 = r39
            r0 = r8
            r4 = r27
            r2 = r29
            r9 = r30
            r3 = r31
            r5 = r32
            r10 = r35
            r11 = r36
            r12 = r37
        L_0x0710:
            r6 = r28[r1]
            int r6 = r6 + r5
            int r1 = r6 + r4
            r4 = r28[r33]
            int r4 = r4 + r3
            int r2 = r2 + r4
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r9 != r4) goto L_0x0721
            r1 = r10
            goto L_0x072c
        L_0x0721:
            if (r9 != r3) goto L_0x0728
            int r1 = java.lang.Math.min(r1, r10)
            goto L_0x072c
        L_0x0728:
            if (r9 != 0) goto L_0x072b
            goto L_0x072c
        L_0x072b:
            r1 = 0
        L_0x072c:
            if (r11 != r4) goto L_0x0730
            r2 = r12
            goto L_0x073b
        L_0x0730:
            if (r11 != r3) goto L_0x0737
            int r2 = java.lang.Math.min(r2, r12)
            goto L_0x073b
        L_0x0737:
            if (r11 != 0) goto L_0x073a
            goto L_0x073b
        L_0x073a:
            r2 = 0
        L_0x073b:
            r8.f3334m0 = r1
            r8.f3335n0 = r2
            r8.y(r1)
            r8.v(r2)
            int r1 = r8.f3353e0
            if (r1 <= 0) goto L_0x074c
            r13 = r33
            goto L_0x074d
        L_0x074c:
            r13 = 0
        L_0x074d:
            r8.f3333l0 = r13
            r1 = r20
        L_0x0751:
            int r2 = r0.f3334m0
            int r0 = r0.f3335n0
            r1.setMeasuredDimension(r2, r0)
            r0 = r39
            goto L_0x0761
        L_0x075b:
            r0 = r39
            r1 = r13
            r0.setMeasuredDimension(r1, r1)
        L_0x0761:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.h(h0.h, int, int):void");
    }

    public final void onMeasure(int i3, int i6) {
        h(this.f917l, i3, i6);
    }

    public void setFirstHorizontalBias(float f6) {
        this.f917l.f3346y0 = f6;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i3) {
        this.f917l.f3340s0 = i3;
        requestLayout();
    }

    public void setFirstVerticalBias(float f6) {
        this.f917l.f3347z0 = f6;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i3) {
        this.f917l.f3341t0 = i3;
        requestLayout();
    }

    public void setHorizontalAlign(int i3) {
        this.f917l.E0 = i3;
        requestLayout();
    }

    public void setHorizontalBias(float f6) {
        this.f917l.f3344w0 = f6;
        requestLayout();
    }

    public void setHorizontalGap(int i3) {
        this.f917l.C0 = i3;
        requestLayout();
    }

    public void setHorizontalStyle(int i3) {
        this.f917l.f3338q0 = i3;
        requestLayout();
    }

    public void setMaxElementsWrap(int i3) {
        this.f917l.H0 = i3;
        requestLayout();
    }

    public void setOrientation(int i3) {
        this.f917l.I0 = i3;
        requestLayout();
    }

    public void setPadding(int i3) {
        h hVar = this.f917l;
        hVar.f0 = i3;
        hVar.f3328g0 = i3;
        hVar.f3329h0 = i3;
        hVar.f3330i0 = i3;
        requestLayout();
    }

    public void setPaddingBottom(int i3) {
        this.f917l.f3328g0 = i3;
        requestLayout();
    }

    public void setPaddingLeft(int i3) {
        this.f917l.f3331j0 = i3;
        requestLayout();
    }

    public void setPaddingRight(int i3) {
        this.f917l.f3332k0 = i3;
        requestLayout();
    }

    public void setPaddingTop(int i3) {
        this.f917l.f0 = i3;
        requestLayout();
    }

    public void setVerticalAlign(int i3) {
        this.f917l.F0 = i3;
        requestLayout();
    }

    public void setVerticalBias(float f6) {
        this.f917l.f3345x0 = f6;
        requestLayout();
    }

    public void setVerticalGap(int i3) {
        this.f917l.D0 = i3;
        requestLayout();
    }

    public void setVerticalStyle(int i3) {
        this.f917l.f3339r0 = i3;
        requestLayout();
    }

    public void setWrapMode(int i3) {
        this.f917l.G0 = i3;
        requestLayout();
    }
}
