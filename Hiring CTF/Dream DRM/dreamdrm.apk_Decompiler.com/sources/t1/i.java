package t1;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;
import p1.n;

public final class i extends p {
    public static final String[] B = {"android:visibility:visibility", "android:visibility:parent"};
    public int A = 3;

    public i() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        if (r9 == 0) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        if (r0.f5117e == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        if (r0.f5115c == 0) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static t1.f0 J(t1.w r8, t1.w r9) {
        /*
            t1.f0 r0 = new t1.f0
            r0.<init>()
            r1 = 0
            r0.f5113a = r1
            r0.f5114b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x002f
            java.util.HashMap r6 = r8.f5170a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x002f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f5115c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f5117e = r6
            goto L_0x0033
        L_0x002f:
            r0.f5115c = r4
            r0.f5117e = r3
        L_0x0033:
            if (r9 == 0) goto L_0x0052
            java.util.HashMap r6 = r9.f5170a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x0052
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f5116d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f5118f = r2
            goto L_0x0056
        L_0x0052:
            r0.f5116d = r4
            r0.f5118f = r3
        L_0x0056:
            r2 = 1
            if (r8 == 0) goto L_0x007a
            if (r9 == 0) goto L_0x007a
            int r8 = r0.f5115c
            int r9 = r0.f5116d
            if (r8 != r9) goto L_0x0068
            android.view.ViewGroup r3 = r0.f5117e
            android.view.ViewGroup r4 = r0.f5118f
            if (r3 != r4) goto L_0x0068
            goto L_0x008d
        L_0x0068:
            if (r8 == r9) goto L_0x0070
            if (r8 != 0) goto L_0x006d
            goto L_0x0089
        L_0x006d:
            if (r9 != 0) goto L_0x008d
            goto L_0x0080
        L_0x0070:
            android.view.ViewGroup r8 = r0.f5118f
            if (r8 != 0) goto L_0x0075
            goto L_0x0089
        L_0x0075:
            android.view.ViewGroup r8 = r0.f5117e
            if (r8 != 0) goto L_0x008d
            goto L_0x0080
        L_0x007a:
            if (r8 != 0) goto L_0x0083
            int r8 = r0.f5116d
            if (r8 != 0) goto L_0x0083
        L_0x0080:
            r0.f5114b = r2
            goto L_0x008b
        L_0x0083:
            if (r9 != 0) goto L_0x008d
            int r8 = r0.f5115c
            if (r8 != 0) goto L_0x008d
        L_0x0089:
            r0.f5114b = r1
        L_0x008b:
            r0.f5113a = r2
        L_0x008d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.i.J(t1.w, t1.w):t1.f0");
    }

    public final void H(w wVar) {
        View view = wVar.f5171b;
        int visibility = view.getVisibility();
        HashMap hashMap = wVar.f5170a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public final ObjectAnimator I(View view, float f6, float f7) {
        if (f6 == f7) {
            return null;
        }
        x.f5173a.y(view, f6);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, x.f5174b, new float[]{f7});
        ofFloat.addListener(new n(view));
        a(new h(this, 0, view));
        return ofFloat;
    }

    public final void d(w wVar) {
        H(wVar);
    }

    public final void g(w wVar) {
        H(wVar);
        wVar.f5170a.put("android:fade:transitionAlpha", Float.valueOf(x.f5173a.x(wVar.f5171b)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: t1.e0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: t1.d0} */
    /* JADX WARNING: type inference failed for: r17v11, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (J(n(r3, false), q(r3, false)).f5113a != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r2 = (java.lang.Float) r2.f5170a.get("android:fade:transitionAlpha");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator k(android.view.ViewGroup r23, t1.w r24, t1.w r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            t1.f0 r4 = J(r24, r25)
            boolean r5 = r4.f5113a
            if (r5 == 0) goto L_0x02d8
            android.view.ViewGroup r5 = r4.f5117e
            if (r5 != 0) goto L_0x0018
            android.view.ViewGroup r5 = r4.f5118f
            if (r5 == 0) goto L_0x02d8
        L_0x0018:
            boolean r5 = r4.f5114b
            r7 = 1
            java.lang.String r8 = "android:fade:transitionAlpha"
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            if (r5 == 0) goto L_0x006a
            int r1 = r0.A
            r1 = r1 & r7
            if (r1 != r7) goto L_0x0064
            if (r3 != 0) goto L_0x002b
            goto L_0x0064
        L_0x002b:
            android.view.View r1 = r3.f5171b
            if (r2 != 0) goto L_0x0046
            android.view.ViewParent r3 = r1.getParent()
            android.view.View r3 = (android.view.View) r3
            t1.w r4 = r0.n(r3, r11)
            t1.w r3 = r0.q(r3, r11)
            t1.f0 r3 = J(r4, r3)
            boolean r3 = r3.f5113a
            if (r3 == 0) goto L_0x0046
            goto L_0x0064
        L_0x0046:
            if (r2 == 0) goto L_0x0057
            java.util.HashMap r2 = r2.f5170a
            java.lang.Object r2 = r2.get(r8)
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 == 0) goto L_0x0057
            float r2 = r2.floatValue()
            goto L_0x0058
        L_0x0057:
            r2 = r9
        L_0x0058:
            int r3 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r9 = r2
        L_0x005e:
            android.animation.ObjectAnimator r1 = r0.I(r1, r9, r10)
            r6 = r1
            goto L_0x0065
        L_0x0064:
            r6 = 0
        L_0x0065:
            r16 = r6
            r6 = r0
            goto L_0x02db
        L_0x006a:
            int r4 = r4.f5116d
            int r5 = r0.A
            r12 = 2
            r5 = r5 & r12
            if (r5 == r12) goto L_0x0074
            goto L_0x02d8
        L_0x0074:
            if (r2 != 0) goto L_0x0078
            goto L_0x02d8
        L_0x0078:
            if (r3 == 0) goto L_0x007d
            android.view.View r3 = r3.f5171b
            goto L_0x007e
        L_0x007d:
            r3 = 0
        L_0x007e:
            android.view.View r5 = r2.f5171b
            r13 = 2131231069(0x7f08015d, float:1.8078209E38)
            java.lang.Object r14 = r5.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x0094
            r0 = r2
            r20 = r4
            r17 = r8
            r2 = r10
            r3 = 0
            goto L_0x022b
        L_0x0094:
            if (r3 == 0) goto L_0x00a5
            android.view.ViewParent r14 = r3.getParent()
            if (r14 != 0) goto L_0x009d
            goto L_0x00a5
        L_0x009d:
            r14 = 4
            if (r4 != r14) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            if (r5 != r3) goto L_0x00ab
        L_0x00a3:
            r14 = 0
            goto L_0x00a9
        L_0x00a5:
            if (r3 == 0) goto L_0x00ab
            r14 = r3
            r3 = 0
        L_0x00a9:
            r15 = r11
            goto L_0x00ae
        L_0x00ab:
            r15 = r7
            r3 = 0
            r14 = 0
        L_0x00ae:
            if (r15 == 0) goto L_0x021e
            android.view.ViewParent r15 = r5.getParent()
            if (r15 != 0) goto L_0x00bf
            r19 = r3
            r20 = r4
            r14 = r5
        L_0x00bb:
            r17 = r8
            goto L_0x0224
        L_0x00bf:
            android.view.ViewParent r15 = r5.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L_0x021e
            android.view.ViewParent r15 = r5.getParent()
            android.view.View r15 = (android.view.View) r15
            t1.w r6 = r0.q(r15, r7)
            t1.w r13 = r0.n(r15, r7)
            t1.f0 r6 = J(r6, r13)
            boolean r6 = r6.f5113a
            if (r6 != 0) goto L_0x0207
            boolean r6 = t1.v.f5167a
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r13 = r15.getScrollX()
            int r13 = -r13
            float r13 = (float) r13
            int r14 = r15.getScrollY()
            int r14 = -r14
            float r14 = (float) r14
            r6.setTranslate(r13, r14)
            t1.b0 r13 = t1.x.f5173a
            r13.z(r5, r6)
            r13.A(r1, r6)
            android.graphics.RectF r13 = new android.graphics.RectF
            int r14 = r5.getWidth()
            float r14 = (float) r14
            int r15 = r5.getHeight()
            float r15 = (float) r15
            r13.<init>(r9, r9, r14, r15)
            r6.mapRect(r13)
            float r14 = r13.left
            int r14 = java.lang.Math.round(r14)
            float r15 = r13.top
            int r15 = java.lang.Math.round(r15)
            float r9 = r13.right
            int r9 = java.lang.Math.round(r9)
            float r12 = r13.bottom
            int r12 = java.lang.Math.round(r12)
            android.widget.ImageView r11 = new android.widget.ImageView
            android.content.Context r10 = r5.getContext()
            r11.<init>(r10)
            android.widget.ImageView$ScaleType r10 = android.widget.ImageView.ScaleType.CENTER_CROP
            r11.setScaleType(r10)
            boolean r10 = t1.v.f5167a
            if (r10 == 0) goto L_0x0141
            boolean r10 = r5.isAttachedToWindow()
            r10 = r10 ^ r7
            boolean r17 = r23.isAttachedToWindow()
            goto L_0x0144
        L_0x0141:
            r10 = 0
            r17 = 0
        L_0x0144:
            boolean r18 = t1.v.f5168b
            if (r18 == 0) goto L_0x016d
            if (r10 == 0) goto L_0x016d
            if (r17 != 0) goto L_0x0155
            r19 = r3
            r20 = r4
            r17 = r8
            r0 = 0
            goto L_0x01ec
        L_0x0155:
            android.view.ViewParent r17 = r5.getParent()
            r7 = r17
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r17 = r7.indexOfChild(r5)
            r19 = r3
            android.view.ViewGroupOverlay r3 = r23.getOverlay()
            r3.add(r5)
            r3 = r17
            goto L_0x0171
        L_0x016d:
            r19 = r3
            r3 = 0
            r7 = 0
        L_0x0171:
            float r17 = r13.width()
            r20 = r4
            int r4 = java.lang.Math.round(r17)
            float r17 = r13.height()
            int r0 = java.lang.Math.round(r17)
            if (r4 <= 0) goto L_0x01db
            if (r0 <= 0) goto L_0x01db
            r17 = r8
            int r8 = r4 * r0
            float r8 = (float) r8
            r21 = 1233125376(0x49800000, float:1048576.0)
            float r8 = r21 / r8
            r2 = 1065353216(0x3f800000, float:1.0)
            float r8 = java.lang.Math.min(r2, r8)
            float r4 = (float) r4
            float r4 = r4 * r8
            int r4 = java.lang.Math.round(r4)
            float r0 = (float) r0
            float r0 = r0 * r8
            int r0 = java.lang.Math.round(r0)
            float r2 = r13.left
            float r2 = -r2
            float r13 = r13.top
            float r13 = -r13
            r6.postTranslate(r2, r13)
            r6.postScale(r8, r8)
            boolean r2 = t1.v.f5169c
            if (r2 == 0) goto L_0x01c9
            android.graphics.Picture r2 = new android.graphics.Picture
            r2.<init>()
            android.graphics.Canvas r0 = r2.beginRecording(r4, r0)
            r0.concat(r6)
            r5.draw(r0)
            r2.endRecording()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2)
            goto L_0x01de
        L_0x01c9:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r0, r2)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.concat(r6)
            r5.draw(r2)
            goto L_0x01de
        L_0x01db:
            r17 = r8
            r0 = 0
        L_0x01de:
            if (r18 == 0) goto L_0x01ec
            if (r10 == 0) goto L_0x01ec
            android.view.ViewGroupOverlay r2 = r23.getOverlay()
            r2.remove(r5)
            r7.addView(r5, r3)
        L_0x01ec:
            if (r0 == 0) goto L_0x01f1
            r11.setImageBitmap(r0)
        L_0x01f1:
            int r0 = r9 - r14
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r12 - r15
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r11.measure(r0, r2)
            r11.layout(r14, r15, r9, r12)
            r14 = r11
            goto L_0x0224
        L_0x0207:
            r19 = r3
            r20 = r4
            r17 = r8
            int r0 = r15.getId()
            android.view.ViewParent r2 = r15.getParent()
            if (r2 != 0) goto L_0x0224
            r2 = -1
            if (r0 == r2) goto L_0x0224
            r1.findViewById(r0)
            goto L_0x0224
        L_0x021e:
            r19 = r3
            r20 = r4
            goto L_0x00bb
        L_0x0224:
            r0 = r24
            r3 = r19
            r2 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
        L_0x022b:
            java.util.HashMap r0 = r0.f5170a
            if (r14 == 0) goto L_0x0299
            if (r7 != 0) goto L_0x0262
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r3 = r0.get(r3)
            int[] r3 = (int[]) r3
            r4 = 0
            r6 = r3[r4]
            r8 = 1
            r3 = r3[r8]
            r9 = 2
            int[] r9 = new int[r9]
            r1.getLocationOnScreen(r9)
            r4 = r9[r4]
            int r6 = r6 - r4
            int r4 = r14.getLeft()
            int r6 = r6 - r4
            r14.offsetLeftAndRight(r6)
            r4 = r9[r8]
            int r3 = r3 - r4
            int r4 = r14.getTop()
            int r3 = r3 - r4
            r14.offsetTopAndBottom(r3)
            android.view.ViewGroupOverlay r3 = r23.getOverlay()
            r3.add(r14)
        L_0x0262:
            t1.b0 r3 = t1.x.f5173a
            r3.getClass()
            r4 = r17
            java.lang.Object r0 = r0.get(r4)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L_0x0279
            float r10 = r0.floatValue()
            r0 = 0
            r6 = r22
            goto L_0x027d
        L_0x0279:
            r0 = 0
            r6 = r22
            r10 = r2
        L_0x027d:
            android.animation.ObjectAnimator r0 = r6.I(r14, r10, r0)
            if (r7 != 0) goto L_0x02d5
            if (r0 != 0) goto L_0x028d
            android.view.ViewGroupOverlay r1 = r23.getOverlay()
            r1.remove(r14)
            goto L_0x02d5
        L_0x028d:
            r2 = 2131231069(0x7f08015d, float:1.8078209E38)
            r5.setTag(r2, r14)
            t1.d0 r2 = new t1.d0
            r2.<init>(r6, r1, r14, r5)
            goto L_0x02ce
        L_0x0299:
            r6 = r22
            r4 = r17
            if (r3 == 0) goto L_0x02d9
            int r1 = r3.getVisibility()
            t1.b0 r5 = t1.x.f5173a
            r7 = 0
            r5.w(r3, r7)
            r5.getClass()
            java.lang.Object r0 = r0.get(r4)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L_0x02b9
            float r10 = r0.floatValue()
            goto L_0x02ba
        L_0x02b9:
            r10 = r2
        L_0x02ba:
            r0 = 0
            android.animation.ObjectAnimator r0 = r6.I(r3, r10, r0)
            if (r0 == 0) goto L_0x02d2
            t1.e0 r2 = new t1.e0
            r1 = r20
            r2.<init>(r3, r1)
            r0.addListener(r2)
            r0.addPauseListener(r2)
        L_0x02ce:
            r6.a(r2)
            goto L_0x02d5
        L_0x02d2:
            r5.w(r3, r1)
        L_0x02d5:
            r16 = r0
            goto L_0x02db
        L_0x02d8:
            r6 = r0
        L_0x02d9:
            r16 = 0
        L_0x02db:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.i.k(android.view.ViewGroup, t1.w, t1.w):android.animation.Animator");
    }

    public final /* bridge */ /* synthetic */ String[] p() {
        return B;
    }

    public final boolean r(w wVar, w wVar2) {
        if (!(wVar == null && wVar2 == null) && (wVar == null || wVar2 == null || wVar2.f5170a.containsKey("android:visibility:visibility") == wVar.f5170a.containsKey("android:visibility:visibility"))) {
            f0 J = J(wVar, wVar2);
            return J.f5113a && (J.f5115c == 0 || J.f5116d == 0);
        }
    }

    public i(int i3) {
        if ((i3 & -4) == 0) {
            this.A = i3;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
