package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import h0.f;
import h0.i;
import j0.b;
import j0.d;
import j0.e;
import j0.h;
import j0.n;
import j0.o;
import j0.p;
import j0.r;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f921s = 0;

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray f922d = new SparseArray();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f923e = new ArrayList(4);

    /* renamed from: f  reason: collision with root package name */
    public final f f924f = new f();

    /* renamed from: g  reason: collision with root package name */
    public int f925g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f926h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f927i = Integer.MAX_VALUE;

    /* renamed from: j  reason: collision with root package name */
    public int f928j = Integer.MAX_VALUE;

    /* renamed from: k  reason: collision with root package name */
    public boolean f929k = true;

    /* renamed from: l  reason: collision with root package name */
    public int f930l = 263;

    /* renamed from: m  reason: collision with root package name */
    public n f931m = null;

    /* renamed from: n  reason: collision with root package name */
    public h f932n = null;

    /* renamed from: o  reason: collision with root package name */
    public int f933o = -1;

    /* renamed from: p  reason: collision with root package name */
    public HashMap f934p = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    public final SparseArray f935q = new SparseArray();

    /* renamed from: r  reason: collision with root package name */
    public final e f936r = new e(this);

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public final h0.e a(View view) {
        if (view == this) {
            return this.f924f;
        }
        if (view == null) {
            return null;
        }
        return ((d) view.getLayoutParams()).f3677k0;
    }

    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
    }

    public final void b(AttributeSet attributeSet, int i3) {
        f fVar = this.f924f;
        fVar.U = this;
        e eVar = this.f936r;
        fVar.f3298g0 = eVar;
        fVar.f0.f3524f = eVar;
        this.f922d.put(getId(), this);
        this.f931m = null;
        boolean z5 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f3778b, i3, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 9) {
                    this.f925g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f925g);
                } else if (index == 10) {
                    this.f926h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f926h);
                } else if (index == 7) {
                    this.f927i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f927i);
                } else if (index == 8) {
                    this.f928j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f928j);
                } else if (index == 89) {
                    this.f930l = obtainStyledAttributes.getInt(index, this.f930l);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.f932n = new h(getContext(), resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f932n = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f931m = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f931m = null;
                    }
                    this.f933o = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i7 = this.f930l;
        fVar.f3307p0 = i7;
        if ((i7 & 256) == 256) {
            z5 = true;
        }
        g0.e.f2791p = z5;
    }

    public final boolean c() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final void d(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f934p == null) {
                this.f934p = new HashMap();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f934p.put(str, Integer.valueOf(num.intValue()));
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f923e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                ((b) arrayList.get(i3)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i7 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i8 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f6 = (float) i7;
                        float f7 = (float) i8;
                        float f8 = (float) (i7 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f9 = f7;
                        float f10 = f7;
                        float f11 = f8;
                        float f12 = f6;
                        Paint paint2 = paint;
                        canvas2.drawLine(f6, f9, f11, f10, paint);
                        float parseInt4 = (float) (i8 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f13 = f8;
                        float f14 = parseInt4;
                        canvas2.drawLine(f13, f10, f11, f14, paint);
                        float f15 = parseInt4;
                        float f16 = f12;
                        canvas2.drawLine(f13, f15, f16, f14, paint);
                        float f17 = f12;
                        canvas2.drawLine(f17, f15, f16, f10, paint);
                        paint.setColor(-16711936);
                        float f18 = f8;
                        Paint paint3 = paint;
                        canvas2.drawLine(f17, f10, f18, parseInt4, paint);
                        canvas2.drawLine(f17, parseInt4, f18, f10, paint);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02ab A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r27 = this;
            r0 = r27
            int r1 = r27.getChildCount()
            r2 = 0
            r3 = r2
        L_0x0008:
            r4 = 1
            if (r3 >= r1) goto L_0x001a
            android.view.View r5 = r0.getChildAt(r3)
            boolean r5 = r5.isLayoutRequested()
            if (r5 == 0) goto L_0x0017
            r1 = r4
            goto L_0x001b
        L_0x0017:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x001a:
            r1 = r2
        L_0x001b:
            if (r1 == 0) goto L_0x051a
            boolean r3 = r27.isInEditMode()
            int r5 = r27.getChildCount()
            r6 = r2
        L_0x0026:
            if (r6 >= r5) goto L_0x0039
            android.view.View r7 = r0.getChildAt(r6)
            h0.e r7 = r0.a(r7)
            if (r7 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r7.s()
        L_0x0036:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x0039:
            android.util.SparseArray r6 = r0.f922d
            r7 = 0
            r8 = -1
            h0.f r9 = r0.f924f
            if (r3 == 0) goto L_0x00a2
            r10 = r2
        L_0x0042:
            if (r10 >= r5) goto L_0x00a2
            android.view.View r11 = r0.getChildAt(r10)
            android.content.res.Resources r12 = r27.getResources()     // Catch:{ NotFoundException -> 0x009f }
            int r13 = r11.getId()     // Catch:{ NotFoundException -> 0x009f }
            java.lang.String r12 = r12.getResourceName(r13)     // Catch:{ NotFoundException -> 0x009f }
            int r13 = r11.getId()     // Catch:{ NotFoundException -> 0x009f }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NotFoundException -> 0x009f }
            r0.d(r12, r13)     // Catch:{ NotFoundException -> 0x009f }
            r13 = 47
            int r13 = r12.indexOf(r13)     // Catch:{ NotFoundException -> 0x009f }
            if (r13 == r8) goto L_0x006d
            int r13 = r13 + 1
            java.lang.String r12 = r12.substring(r13)     // Catch:{ NotFoundException -> 0x009f }
        L_0x006d:
            int r11 = r11.getId()     // Catch:{ NotFoundException -> 0x009f }
            if (r11 != 0) goto L_0x0074
            goto L_0x008f
        L_0x0074:
            java.lang.Object r13 = r6.get(r11)     // Catch:{ NotFoundException -> 0x009f }
            android.view.View r13 = (android.view.View) r13     // Catch:{ NotFoundException -> 0x009f }
            if (r13 != 0) goto L_0x008d
            android.view.View r13 = r0.findViewById(r11)     // Catch:{ NotFoundException -> 0x009f }
            if (r13 == 0) goto L_0x008d
            if (r13 == r0) goto L_0x008d
            android.view.ViewParent r11 = r13.getParent()     // Catch:{ NotFoundException -> 0x009f }
            if (r11 != r0) goto L_0x008d
            r0.onViewAdded(r13)     // Catch:{ NotFoundException -> 0x009f }
        L_0x008d:
            if (r13 != r0) goto L_0x0091
        L_0x008f:
            r11 = r9
            goto L_0x009d
        L_0x0091:
            if (r13 != 0) goto L_0x0095
            r11 = r7
            goto L_0x009d
        L_0x0095:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()     // Catch:{ NotFoundException -> 0x009f }
            j0.d r11 = (j0.d) r11     // Catch:{ NotFoundException -> 0x009f }
            h0.e r11 = r11.f3677k0     // Catch:{ NotFoundException -> 0x009f }
        L_0x009d:
            r11.W = r12     // Catch:{ NotFoundException -> 0x009f }
        L_0x009f:
            int r10 = r10 + 1
            goto L_0x0042
        L_0x00a2:
            int r10 = r0.f933o
            if (r10 == r8) goto L_0x00b3
            r10 = r2
        L_0x00a7:
            if (r10 >= r5) goto L_0x00b3
            android.view.View r11 = r0.getChildAt(r10)
            r11.getId()
            int r10 = r10 + 1
            goto L_0x00a7
        L_0x00b3:
            j0.n r10 = r0.f931m
            if (r10 == 0) goto L_0x00ba
            r10.a(r0)
        L_0x00ba:
            java.util.ArrayList r10 = r9.f3296d0
            r10.clear()
            java.util.ArrayList r10 = r0.f923e
            int r11 = r10.size()
            if (r11 <= 0) goto L_0x0160
            r13 = r2
        L_0x00c8:
            if (r13 >= r11) goto L_0x0160
            java.lang.Object r14 = r10.get(r13)
            j0.b r14 = (j0.b) r14
            boolean r15 = r14.isInEditMode()
            if (r15 == 0) goto L_0x00db
            java.lang.String r15 = r14.f3654h
            r14.setIds(r15)
        L_0x00db:
            h0.k r15 = r14.f3653g
            if (r15 != 0) goto L_0x00e1
            goto L_0x0158
        L_0x00e1:
            r15.f3353e0 = r2
            h0.e[] r15 = r15.f3352d0
            java.util.Arrays.fill(r15, r7)
            r15 = r2
        L_0x00e9:
            int r8 = r14.f3651e
            if (r15 >= r8) goto L_0x0153
            int[] r8 = r14.f3650d
            r8 = r8[r15]
            java.lang.Object r16 = r6.get(r8)
            android.view.View r16 = (android.view.View) r16
            if (r16 != 0) goto L_0x011e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r7 = r14.f3655i
            java.lang.Object r8 = r7.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r2 = r14.d(r0, r8)
            if (r2 == 0) goto L_0x011e
            int[] r12 = r14.f3650d
            r12[r15] = r2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r7.put(r12, r8)
            java.lang.Object r2 = r6.get(r2)
            r16 = r2
            android.view.View r16 = (android.view.View) r16
        L_0x011e:
            r2 = r16
            if (r2 == 0) goto L_0x014d
            h0.k r7 = r14.f3653g
            h0.e r2 = r0.a(r2)
            r7.getClass()
            if (r2 == r7) goto L_0x014d
            if (r2 != 0) goto L_0x0130
            goto L_0x014d
        L_0x0130:
            int r8 = r7.f3353e0
            int r8 = r8 + r4
            h0.e[] r12 = r7.f3352d0
            int r4 = r12.length
            if (r8 <= r4) goto L_0x0143
            int r4 = r12.length
            r8 = 2
            int r4 = r4 * r8
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r12, r4)
            h0.e[] r4 = (h0.e[]) r4
            r7.f3352d0 = r4
        L_0x0143:
            h0.e[] r4 = r7.f3352d0
            int r8 = r7.f3353e0
            r4[r8] = r2
            r2 = 1
            int r8 = r8 + r2
            r7.f3353e0 = r8
        L_0x014d:
            int r15 = r15 + 1
            r2 = 0
            r4 = 1
            r7 = 0
            goto L_0x00e9
        L_0x0153:
            h0.k r2 = r14.f3653g
            r2.a()
        L_0x0158:
            int r13 = r13 + 1
            r2 = 0
            r4 = 1
            r7 = 0
            r8 = -1
            goto L_0x00c8
        L_0x0160:
            r2 = 0
        L_0x0161:
            if (r2 >= r5) goto L_0x0169
            r0.getChildAt(r2)
            int r2 = r2 + 1
            goto L_0x0161
        L_0x0169:
            android.util.SparseArray r2 = r0.f935q
            r2.clear()
            r4 = 0
            r2.put(r4, r9)
            int r4 = r27.getId()
            r2.put(r4, r9)
            r4 = 0
        L_0x017a:
            if (r4 >= r5) goto L_0x018e
            android.view.View r7 = r0.getChildAt(r4)
            h0.e r8 = r0.a(r7)
            int r7 = r7.getId()
            r2.put(r7, r8)
            int r4 = r4 + 1
            goto L_0x017a
        L_0x018e:
            r4 = 0
        L_0x018f:
            if (r4 >= r5) goto L_0x051a
            android.view.View r7 = r0.getChildAt(r4)
            h0.e r8 = r0.a(r7)
            if (r8 != 0) goto L_0x019d
            r14 = 0
            goto L_0x0203
        L_0x019d:
            android.view.ViewGroup$LayoutParams r10 = r7.getLayoutParams()
            r15 = r10
            j0.d r15 = (j0.d) r15
            java.util.ArrayList r10 = r9.f3296d0
            r10.add(r8)
            h0.e r10 = r8.I
            if (r10 == 0) goto L_0x01b8
            h0.f r10 = (h0.f) r10
            java.util.ArrayList r10 = r10.f3296d0
            r10.remove(r8)
            r14 = 0
            r8.I = r14
            goto L_0x01b9
        L_0x01b8:
            r14 = 0
        L_0x01b9:
            r8.I = r9
            r15.a()
            int r10 = r7.getVisibility()
            r8.V = r10
            r8.U = r7
            boolean r10 = r7 instanceof j0.b
            if (r10 == 0) goto L_0x01d1
            j0.b r7 = (j0.b) r7
            boolean r10 = r9.f3299h0
            r7.f(r8, r10)
        L_0x01d1:
            boolean r7 = r15.Y
            if (r7 == 0) goto L_0x0215
            h0.i r8 = (h0.i) r8
            int r7 = r15.f3671h0
            int r10 = r15.f3673i0
            float r11 = r15.f3675j0
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r13 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r13 == 0) goto L_0x01ed
            if (r13 <= 0) goto L_0x0203
            r8.f3348d0 = r11
            r11 = -1
            r8.f3349e0 = r11
            r8.f0 = r11
            goto L_0x0203
        L_0x01ed:
            r11 = -1
            if (r7 == r11) goto L_0x01f9
            if (r7 <= r11) goto L_0x0203
            r8.f3348d0 = r12
            r8.f3349e0 = r7
            r8.f0 = r11
            goto L_0x0203
        L_0x01f9:
            if (r10 == r11) goto L_0x0203
            if (r10 <= r11) goto L_0x0203
            r8.f3348d0 = r12
            r8.f3349e0 = r11
            r8.f0 = r10
        L_0x0203:
            r20 = r1
            r22 = r3
            r21 = r4
            r17 = r5
            r19 = r9
            r18 = r14
            r0 = 2
            r3 = 1
            r4 = 0
            r11 = -1
            goto L_0x050b
        L_0x0215:
            int r7 = r15.f3658a0
            int r10 = r15.f3660b0
            int r13 = r15.f3662c0
            int r12 = r15.f3664d0
            int r11 = r15.f3666e0
            int r0 = r15.f0
            r17 = r5
            float r5 = r15.f3669g0
            int r14 = r15.f3679m
            r19 = r9
            h0.c r9 = h0.c.f3254f
            r20 = r1
            h0.c r1 = h0.c.f3252d
            r21 = r4
            h0.c r4 = h0.c.f3255g
            r22 = r3
            h0.c r3 = h0.c.f3253e
            r23 = r5
            r5 = -1
            if (r14 == r5) goto L_0x0263
            java.lang.Object r0 = r2.get(r14)
            r12 = r0
            h0.e r12 = (h0.e) r12
            if (r12 == 0) goto L_0x025c
            float r0 = r15.f3681o
            int r14 = r15.f3680n
            h0.c r13 = h0.c.f3257i
            r5 = 0
            r10 = r8
            r11 = r13
            r18 = 0
            r7 = r15
            r15 = r5
            r10.o(r11, r12, r13, r14, r15)
            r8.f3292v = r0
            r25 = r1
            r5 = r7
            goto L_0x037c
        L_0x025c:
            r18 = 0
            r25 = r1
            r5 = r15
            goto L_0x037c
        L_0x0263:
            r14 = r5
            r5 = r15
            r18 = 0
            if (r7 == r14) goto L_0x0276
            java.lang.Object r7 = r2.get(r7)
            h0.e r7 = (h0.e) r7
            if (r7 == 0) goto L_0x0295
            int r10 = r5.leftMargin
            r14 = r1
        L_0x0274:
            r15 = r10
            goto L_0x0284
        L_0x0276:
            if (r10 == r14) goto L_0x0295
            java.lang.Object r7 = r2.get(r10)
            h0.e r7 = (h0.e) r7
            if (r7 == 0) goto L_0x0295
            int r10 = r5.leftMargin
            r14 = r9
            goto L_0x0274
        L_0x0284:
            r10 = r8
            r24 = r11
            r11 = r1
            r25 = r1
            r1 = r12
            r12 = r7
            r7 = r13
            r13 = r14
            r14 = r15
            r15 = r24
            r10.o(r11, r12, r13, r14, r15)
            goto L_0x0299
        L_0x0295:
            r25 = r1
            r1 = r12
            r7 = r13
        L_0x0299:
            r10 = -1
            if (r7 == r10) goto L_0x02ab
            java.lang.Object r1 = r2.get(r7)
            h0.e r1 = (h0.e) r1
            if (r1 == 0) goto L_0x02c0
            int r7 = r5.rightMargin
            r12 = r1
            r14 = r7
            r13 = r25
            goto L_0x02ba
        L_0x02ab:
            if (r1 == r10) goto L_0x02c0
            java.lang.Object r1 = r2.get(r1)
            h0.e r1 = (h0.e) r1
            if (r1 == 0) goto L_0x02c0
            int r7 = r5.rightMargin
            r12 = r1
            r14 = r7
            r13 = r9
        L_0x02ba:
            r10 = r8
            r11 = r9
            r15 = r0
            r10.o(r11, r12, r13, r14, r15)
        L_0x02c0:
            int r0 = r5.f3670h
            r1 = -1
            if (r0 == r1) goto L_0x02d6
            java.lang.Object r0 = r2.get(r0)
            h0.e r0 = (h0.e) r0
            if (r0 == 0) goto L_0x02ef
            int r7 = r5.topMargin
            int r10 = r5.f3687u
            r12 = r0
            r13 = r3
            r14 = r7
            r15 = r10
            goto L_0x02ea
        L_0x02d6:
            int r0 = r5.f3672i
            if (r0 == r1) goto L_0x02ef
            java.lang.Object r0 = r2.get(r0)
            h0.e r0 = (h0.e) r0
            if (r0 == 0) goto L_0x02ef
            int r1 = r5.topMargin
            int r7 = r5.f3687u
            r12 = r0
            r14 = r1
            r13 = r4
            r15 = r7
        L_0x02ea:
            r10 = r8
            r11 = r3
            r10.o(r11, r12, r13, r14, r15)
        L_0x02ef:
            int r0 = r5.f3674j
            r1 = -1
            if (r0 == r1) goto L_0x0305
            java.lang.Object r0 = r2.get(r0)
            h0.e r0 = (h0.e) r0
            if (r0 == 0) goto L_0x031e
            int r7 = r5.bottomMargin
            int r10 = r5.w
            r12 = r0
            r13 = r3
            r14 = r7
            r15 = r10
            goto L_0x0319
        L_0x0305:
            int r0 = r5.f3676k
            if (r0 == r1) goto L_0x031e
            java.lang.Object r0 = r2.get(r0)
            h0.e r0 = (h0.e) r0
            if (r0 == 0) goto L_0x031e
            int r1 = r5.bottomMargin
            int r7 = r5.w
            r12 = r0
            r14 = r1
            r13 = r4
            r15 = r7
        L_0x0319:
            r10 = r8
            r11 = r4
            r10.o(r11, r12, r13, r14, r15)
        L_0x031e:
            int r0 = r5.f3678l
            r1 = -1
            if (r0 == r1) goto L_0x036b
            java.lang.Object r0 = r6.get(r0)
            android.view.View r0 = (android.view.View) r0
            int r1 = r5.f3678l
            java.lang.Object r1 = r2.get(r1)
            h0.e r1 = (h0.e) r1
            if (r1 == 0) goto L_0x036b
            if (r0 == 0) goto L_0x036b
            android.view.ViewGroup$LayoutParams r7 = r0.getLayoutParams()
            boolean r7 = r7 instanceof j0.d
            if (r7 == 0) goto L_0x036b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            j0.d r0 = (j0.d) r0
            r7 = 1
            r5.X = r7
            r0.X = r7
            h0.c r10 = h0.c.f3256h
            h0.d r11 = r8.h(r10)
            h0.d r1 = r1.h(r10)
            r10 = -1
            r12 = 0
            r11.b(r1, r12, r10, r7)
            r8.w = r7
            h0.e r0 = r0.f3677k0
            r0.w = r7
            h0.d r0 = r8.h(r3)
            r0.h()
            h0.d r0 = r8.h(r4)
            r0.h()
        L_0x036b:
            r0 = 0
            int r1 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x0374
            r1 = r23
            r8.S = r1
        L_0x0374:
            float r1 = r5.A
            int r7 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x037c
            r8.T = r1
        L_0x037c:
            if (r22 == 0) goto L_0x038d
            int r0 = r5.P
            r1 = -1
            if (r0 != r1) goto L_0x0387
            int r7 = r5.Q
            if (r7 == r1) goto L_0x038d
        L_0x0387:
            int r1 = r5.Q
            r8.N = r0
            r8.O = r1
        L_0x038d:
            boolean r0 = r5.V
            r1 = 4
            r7 = 3
            r10 = -2
            if (r0 != 0) goto L_0x03bf
            int r0 = r5.width
            r11 = -1
            if (r0 != r11) goto L_0x03b7
            boolean r0 = r5.S
            if (r0 == 0) goto L_0x03a1
            r8.w(r7)
            goto L_0x03a4
        L_0x03a1:
            r8.w(r1)
        L_0x03a4:
            r0 = r25
            h0.d r0 = r8.h(r0)
            int r11 = r5.leftMargin
            r0.f3265e = r11
            h0.d r0 = r8.h(r9)
            int r9 = r5.rightMargin
            r0.f3265e = r9
            goto L_0x03d0
        L_0x03b7:
            r8.w(r7)
            r0 = 0
            r8.y(r0)
            goto L_0x03d0
        L_0x03bf:
            r0 = 1
            r8.w(r0)
            int r0 = r5.width
            r8.y(r0)
            int r0 = r5.width
            if (r0 != r10) goto L_0x03d0
            r0 = 2
            r8.w(r0)
        L_0x03d0:
            boolean r0 = r5.W
            if (r0 != 0) goto L_0x03fd
            int r0 = r5.height
            r11 = -1
            if (r0 != r11) goto L_0x03f5
            boolean r0 = r5.T
            if (r0 == 0) goto L_0x03e1
            r8.x(r7)
            goto L_0x03e4
        L_0x03e1:
            r8.x(r1)
        L_0x03e4:
            h0.d r0 = r8.h(r3)
            int r1 = r5.topMargin
            r0.f3265e = r1
            h0.d r0 = r8.h(r4)
            int r1 = r5.bottomMargin
            r0.f3265e = r1
            goto L_0x040f
        L_0x03f5:
            r8.x(r7)
            r0 = 0
            r8.v(r0)
            goto L_0x040f
        L_0x03fd:
            r0 = 1
            r11 = -1
            r8.x(r0)
            int r0 = r5.height
            r8.v(r0)
            int r0 = r5.height
            if (r0 != r10) goto L_0x040f
            r0 = 2
            r8.x(r0)
        L_0x040f:
            java.lang.String r0 = r5.B
            if (r0 == 0) goto L_0x04ab
            int r1 = r0.length()
            if (r1 != 0) goto L_0x041b
            goto L_0x04ab
        L_0x041b:
            int r1 = r0.length()
            r3 = 44
            int r3 = r0.indexOf(r3)
            if (r3 <= 0) goto L_0x044d
            int r4 = r1 + -1
            if (r3 >= r4) goto L_0x044d
            r4 = 0
            java.lang.String r7 = r0.substring(r4, r3)
            java.lang.String r4 = "W"
            boolean r4 = r7.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x043a
            r4 = 0
            goto L_0x0445
        L_0x043a:
            java.lang.String r4 = "H"
            boolean r4 = r7.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0444
            r4 = 1
            goto L_0x0445
        L_0x0444:
            r4 = r11
        L_0x0445:
            int r3 = r3 + 1
            r26 = r4
            r4 = r3
            r3 = r26
            goto L_0x044f
        L_0x044d:
            r3 = r11
            r4 = 0
        L_0x044f:
            r7 = 58
            int r7 = r0.indexOf(r7)
            if (r7 < 0) goto L_0x0491
            int r1 = r1 + -1
            if (r7 >= r1) goto L_0x0491
            java.lang.String r1 = r0.substring(r4, r7)
            int r7 = r7 + 1
            java.lang.String r0 = r0.substring(r7)
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x04a0
            int r4 = r0.length()
            if (r4 <= 0) goto L_0x04a0
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x04a0 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04a0 }
            r4 = 0
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x04a0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x04a0
            r4 = 1
            if (r3 != r4) goto L_0x048b
            float r0 = r0 / r1
            float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x04a0 }
            goto L_0x04a1
        L_0x048b:
            float r1 = r1 / r0
            float r0 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x04a0 }
            goto L_0x04a1
        L_0x0491:
            java.lang.String r0 = r0.substring(r4)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x04a0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04a0 }
            goto L_0x04a1
        L_0x04a0:
            r0 = 0
        L_0x04a1:
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x04ae
            r8.L = r0
            r8.M = r3
            goto L_0x04ae
        L_0x04ab:
            r1 = 0
            r8.L = r1
        L_0x04ae:
            float r0 = r5.D
            float[] r1 = r8.Z
            r4 = 0
            r1[r4] = r0
            float r0 = r5.E
            r3 = 1
            r1[r3] = r0
            int r0 = r5.F
            r8.X = r0
            int r0 = r5.G
            r8.Y = r0
            int r0 = r5.H
            int r1 = r5.J
            int r7 = r5.L
            float r9 = r5.N
            r8.f3280j = r0
            r8.f3283m = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != r1) goto L_0x04d4
            r7 = r4
        L_0x04d4:
            r8.f3284n = r7
            r8.f3285o = r9
            r7 = 0
            int r10 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r10 <= 0) goto L_0x04e8
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x04e8
            if (r0 != 0) goto L_0x04e8
            r0 = 2
            r8.f3280j = r0
        L_0x04e8:
            int r0 = r5.I
            int r9 = r5.K
            int r10 = r5.M
            float r5 = r5.O
            r8.f3281k = r0
            r8.f3286p = r9
            if (r10 != r1) goto L_0x04f7
            r10 = r4
        L_0x04f7:
            r8.f3287q = r10
            r8.f3288r = r5
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x050a
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x050a
            if (r0 != 0) goto L_0x050a
            r0 = 2
            r8.f3281k = r0
            goto L_0x050b
        L_0x050a:
            r0 = 2
        L_0x050b:
            int r1 = r21 + 1
            r0 = r27
            r4 = r1
            r5 = r17
            r9 = r19
            r1 = r20
            r3 = r22
            goto L_0x018f
        L_0x051a:
            r20 = r1
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.e():boolean");
    }

    public final void forceLayout() {
        this.f929k = true;
        super.forceLayout();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f928j;
    }

    public int getMaxWidth() {
        return this.f927i;
    }

    public int getMinHeight() {
        return this.f926h;
    }

    public int getMinWidth() {
        return this.f925g;
    }

    public int getOptimizationLevel() {
        return this.f924f.f3307p0;
    }

    public void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            d dVar = (d) childAt.getLayoutParams();
            h0.e eVar = dVar.f3677k0;
            if (childAt.getVisibility() != 8 || dVar.Y || dVar.Z || isInEditMode) {
                int m6 = eVar.m();
                int n5 = eVar.n();
                childAt.layout(m6, n5, eVar.l() + m6, eVar.j() + n5);
            }
        }
        ArrayList arrayList = this.f923e;
        int size = arrayList.size();
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((b) arrayList.get(i10)).getClass();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x072b  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x072e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0396 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0193  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            boolean r3 = r28.c()
            h0.f r4 = r0.f924f
            r4.f3299h0 = r3
            boolean r3 = r0.f929k
            androidx.activity.result.c r5 = r4.f3297e0
            i0.e r6 = r4.f0
            r7 = 4
            r8 = 3
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L_0x0050
            r0.f929k = r10
            boolean r3 = r28.e()
            if (r3 == 0) goto L_0x0050
            java.lang.Object r3 = r5.f327e
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            java.util.ArrayList r11 = r4.f3296d0
            int r11 = r11.size()
            r12 = r10
        L_0x0030:
            if (r12 >= r11) goto L_0x004e
            java.util.ArrayList r13 = r4.f3296d0
            java.lang.Object r13 = r13.get(r12)
            h0.e r13 = (h0.e) r13
            int[] r14 = r13.f3273c0
            r15 = r14[r10]
            if (r15 == r8) goto L_0x0048
            if (r15 == r7) goto L_0x0048
            r14 = r14[r9]
            if (r14 == r8) goto L_0x0048
            if (r14 != r7) goto L_0x004b
        L_0x0048:
            r3.add(r13)
        L_0x004b:
            int r12 = r12 + 1
            goto L_0x0030
        L_0x004e:
            r6.f3520b = r9
        L_0x0050:
            int r3 = r0.f930l
            int r11 = android.view.View.MeasureSpec.getMode(r29)
            int r12 = android.view.View.MeasureSpec.getSize(r29)
            int r13 = android.view.View.MeasureSpec.getMode(r30)
            int r14 = android.view.View.MeasureSpec.getSize(r30)
            int r15 = r28.getPaddingTop()
            int r15 = java.lang.Math.max(r10, r15)
            int r7 = r28.getPaddingBottom()
            int r7 = java.lang.Math.max(r10, r7)
            int r8 = r15 + r7
            int r9 = r28.getPaddingWidth()
            j0.e r10 = r0.f936r
            r10.f3693b = r15
            r10.f3694c = r7
            r10.f3695d = r9
            r10.f3696e = r8
            r10.f3697f = r1
            r10.f3698g = r2
            int r7 = r28.getPaddingStart()
            r2 = 0
            int r7 = java.lang.Math.max(r2, r7)
            int r1 = r28.getPaddingEnd()
            int r1 = java.lang.Math.max(r2, r1)
            if (r7 > 0) goto L_0x00a5
            if (r1 <= 0) goto L_0x009c
            goto L_0x00a5
        L_0x009c:
            int r1 = r28.getPaddingLeft()
            int r7 = java.lang.Math.max(r2, r1)
            goto L_0x00ac
        L_0x00a5:
            boolean r2 = r28.c()
            if (r2 == 0) goto L_0x00ac
            r7 = r1
        L_0x00ac:
            int r12 = r12 - r9
            int r14 = r14 - r8
            int r1 = r10.f3696e
            int r2 = r10.f3695d
            int r8 = r28.getChildCount()
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = r10
            r10 = 1073741824(0x40000000, float:2.0)
            if (r11 == r9) goto L_0x00da
            if (r11 == 0) goto L_0x00d1
            if (r11 == r10) goto L_0x00c4
            r10 = 1
            goto L_0x00d5
        L_0x00c4:
            int r10 = r0.f927i
            int r10 = r10 - r2
            int r10 = java.lang.Math.min(r10, r12)
            r21 = r12
            r12 = r9
            r9 = r10
            r10 = 1
            goto L_0x00eb
        L_0x00d1:
            if (r8 != 0) goto L_0x00d4
            goto L_0x00dc
        L_0x00d4:
            r10 = 2
        L_0x00d5:
            r21 = r12
            r12 = r9
            r9 = 0
            goto L_0x00eb
        L_0x00da:
            if (r8 != 0) goto L_0x00e4
        L_0x00dc:
            int r10 = r0.f925g
            r9 = 0
            int r10 = java.lang.Math.max(r9, r10)
            goto L_0x00e5
        L_0x00e4:
            r10 = r12
        L_0x00e5:
            r9 = r10
            r21 = r12
            r10 = 2
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00eb:
            if (r13 == r12) goto L_0x0109
            if (r13 == 0) goto L_0x0101
            r12 = 1073741824(0x40000000, float:2.0)
            if (r13 == r12) goto L_0x00f5
            r8 = 1
            goto L_0x0105
        L_0x00f5:
            int r8 = r0.f928j
            int r8 = r8 - r1
            int r8 = java.lang.Math.min(r8, r14)
            r12 = r8
            r22 = r14
            r8 = 1
            goto L_0x0118
        L_0x0101:
            if (r8 != 0) goto L_0x0104
            goto L_0x010b
        L_0x0104:
            r8 = 2
        L_0x0105:
            r22 = r14
            r12 = 0
            goto L_0x0118
        L_0x0109:
            if (r8 != 0) goto L_0x0113
        L_0x010b:
            int r8 = r0.f926h
            r12 = 0
            int r8 = java.lang.Math.max(r12, r8)
            goto L_0x0114
        L_0x0113:
            r8 = r14
        L_0x0114:
            r12 = r8
            r22 = r14
            r8 = 2
        L_0x0118:
            int r14 = r4.l()
            if (r9 != r14) goto L_0x0124
            int r14 = r4.j()
            if (r12 == r14) goto L_0x0127
        L_0x0124:
            r14 = 1
            r6.f3521c = r14
        L_0x0127:
            r14 = 0
            r4.N = r14
            r4.O = r14
            int r14 = r0.f927i
            int r14 = r14 - r2
            r23 = r6
            int[] r6 = r4.f3291u
            r24 = r13
            r13 = 0
            r6[r13] = r14
            int r14 = r0.f928j
            int r14 = r14 - r1
            r18 = 1
            r6[r18] = r14
            r4.Q = r13
            r4.R = r13
            r4.w(r10)
            r4.y(r9)
            r4.x(r8)
            r4.v(r12)
            int r8 = r0.f925g
            int r2 = r8 - r2
            if (r2 >= 0) goto L_0x0156
            r2 = 0
        L_0x0156:
            r4.Q = r2
            int r2 = r0.f926h
            int r1 = r2 - r1
            if (r1 >= 0) goto L_0x015f
            r1 = 0
        L_0x015f:
            r4.R = r1
            r4.f3301j0 = r7
            r4.f3302k0 = r15
            r5.getClass()
            j0.e r1 = r4.f3298g0
            java.util.ArrayList r2 = r4.f3296d0
            int r2 = r2.size()
            int r7 = r4.l()
            int r8 = r4.j()
            r9 = r3 & 128(0x80, float:1.794E-43)
            r10 = 128(0x80, float:1.794E-43)
            if (r9 != r10) goto L_0x0180
            r9 = 1
            goto L_0x0181
        L_0x0180:
            r9 = 0
        L_0x0181:
            if (r9 != 0) goto L_0x0190
            r10 = 64
            r3 = r3 & r10
            if (r3 != r10) goto L_0x018a
            r3 = 1
            goto L_0x018b
        L_0x018a:
            r3 = 0
        L_0x018b:
            if (r3 == 0) goto L_0x018e
            goto L_0x0190
        L_0x018e:
            r3 = 0
            goto L_0x0191
        L_0x0190:
            r3 = 1
        L_0x0191:
            if (r3 == 0) goto L_0x01e8
            r10 = 0
        L_0x0194:
            if (r10 >= r2) goto L_0x01e8
            java.util.ArrayList r12 = r4.f3296d0
            java.lang.Object r12 = r12.get(r10)
            h0.e r12 = (h0.e) r12
            int[] r13 = r12.f3273c0
            r14 = 0
            r15 = r13[r14]
            r14 = 3
            if (r15 != r14) goto L_0x01a8
            r15 = 1
            goto L_0x01a9
        L_0x01a8:
            r15 = 0
        L_0x01a9:
            r17 = 1
            r13 = r13[r17]
            if (r13 != r14) goto L_0x01b1
            r13 = 1
            goto L_0x01b2
        L_0x01b1:
            r13 = 0
        L_0x01b2:
            if (r15 == 0) goto L_0x01bf
            if (r13 == 0) goto L_0x01bf
            float r13 = r12.L
            r14 = 0
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x01bf
            r13 = 1
            goto L_0x01c0
        L_0x01bf:
            r13 = 0
        L_0x01c0:
            boolean r14 = r12.q()
            if (r14 == 0) goto L_0x01c9
            if (r13 == 0) goto L_0x01c9
            goto L_0x01e7
        L_0x01c9:
            boolean r14 = r12.r()
            if (r14 == 0) goto L_0x01d2
            if (r13 == 0) goto L_0x01d2
            goto L_0x01e7
        L_0x01d2:
            boolean r13 = r12 instanceof h0.h
            if (r13 == 0) goto L_0x01d7
            goto L_0x01e7
        L_0x01d7:
            boolean r13 = r12.q()
            if (r13 != 0) goto L_0x01e7
            boolean r12 = r12.r()
            if (r12 == 0) goto L_0x01e4
            goto L_0x01e7
        L_0x01e4:
            int r10 = r10 + 1
            goto L_0x0194
        L_0x01e7:
            r3 = 0
        L_0x01e8:
            r10 = 1073741824(0x40000000, float:2.0)
            r12 = r24
            if (r11 != r10) goto L_0x01f0
            if (r12 == r10) goto L_0x01f2
        L_0x01f0:
            if (r9 == 0) goto L_0x01f4
        L_0x01f2:
            r10 = 1
            goto L_0x01f5
        L_0x01f4:
            r10 = 0
        L_0x01f5:
            r3 = r3 & r10
            if (r3 == 0) goto L_0x044f
            r3 = 0
            r10 = r6[r3]
            r3 = r21
            int r3 = java.lang.Math.min(r10, r3)
            r10 = 1
            r6 = r6[r10]
            r14 = r22
            int r6 = java.lang.Math.min(r6, r14)
            r13 = 1073741824(0x40000000, float:2.0)
            if (r11 != r13) goto L_0x021c
            int r14 = r4.l()
            if (r14 == r3) goto L_0x021c
            r4.y(r3)
            r3 = r23
            r3.f3520b = r10
            goto L_0x021e
        L_0x021c:
            r3 = r23
        L_0x021e:
            if (r12 != r13) goto L_0x022b
            int r14 = r4.j()
            if (r14 == r6) goto L_0x022b
            r4.v(r6)
            r3.f3520b = r10
        L_0x022b:
            if (r11 != r13) goto L_0x03a7
            if (r12 != r13) goto L_0x03a7
            r6 = r9 & 1
            boolean r9 = r3.f3520b
            h0.f r10 = r3.f3519a
            if (r9 != 0) goto L_0x023e
            boolean r9 = r3.f3521c
            if (r9 == 0) goto L_0x023c
            goto L_0x023e
        L_0x023c:
            r14 = 0
            goto L_0x026d
        L_0x023e:
            java.util.ArrayList r9 = r10.f3296d0
            java.util.Iterator r9 = r9.iterator()
        L_0x0244:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x025e
            java.lang.Object r13 = r9.next()
            h0.e r13 = (h0.e) r13
            r14 = 0
            r13.f3268a = r14
            i0.j r15 = r13.f3274d
            r15.n()
            i0.l r13 = r13.f3275e
            r13.m()
            goto L_0x0244
        L_0x025e:
            r14 = 0
            r10.f3268a = r14
            i0.j r9 = r10.f3274d
            r9.n()
            i0.l r9 = r10.f3275e
            r9.m()
            r3.f3521c = r14
        L_0x026d:
            h0.f r9 = r3.f3522d
            r3.b(r9)
            r10.N = r14
            r10.O = r14
            int r9 = r10.i(r14)
            r13 = 1
            int r14 = r10.i(r13)
            boolean r13 = r3.f3520b
            if (r13 == 0) goto L_0x0286
            r3.c()
        L_0x0286:
            int r13 = r10.m()
            int r15 = r10.n()
            i0.j r0 = r10.f3274d
            r21 = r1
            i0.f r1 = r0.f3552h
            r1.d(r13)
            i0.l r1 = r10.f3275e
            r22 = r7
            i0.f r7 = r1.f3552h
            r7.d(r15)
            r3.g()
            java.util.ArrayList r7 = r3.f3523e
            r23 = r8
            i0.g r8 = r0.f3549e
            r24 = r5
            i0.g r5 = r1.f3549e
            r25 = r2
            r2 = 2
            if (r9 == r2) goto L_0x02b9
            if (r14 != r2) goto L_0x02b5
            goto L_0x02b9
        L_0x02b5:
            r26 = r12
        L_0x02b7:
            r2 = 1
            goto L_0x0306
        L_0x02b9:
            if (r6 == 0) goto L_0x02d2
            java.util.Iterator r2 = r7.iterator()
        L_0x02bf:
            boolean r26 = r2.hasNext()
            if (r26 == 0) goto L_0x02d2
            java.lang.Object r26 = r2.next()
            i0.m r26 = (i0.m) r26
            boolean r26 = r26.k()
            if (r26 != 0) goto L_0x02bf
            r6 = 0
        L_0x02d2:
            if (r6 == 0) goto L_0x02ed
            r2 = 2
            if (r9 != r2) goto L_0x02ed
            r2 = 1
            r10.w(r2)
            r26 = r12
            r2 = 0
            int r12 = r3.d(r10, r2)
            r10.y(r12)
            int r2 = r10.l()
            r8.d(r2)
            goto L_0x02ef
        L_0x02ed:
            r26 = r12
        L_0x02ef:
            if (r6 == 0) goto L_0x02b7
            r2 = 2
            if (r14 != r2) goto L_0x02b7
            r2 = 1
            r10.x(r2)
            int r6 = r3.d(r10, r2)
            r10.v(r6)
            int r6 = r10.j()
            r5.d(r6)
        L_0x0306:
            int[] r6 = r10.f3273c0
            r27 = r4
            r12 = 0
            r4 = r6[r12]
            if (r4 == r2) goto L_0x0315
            r2 = 4
            if (r4 != r2) goto L_0x0313
            goto L_0x0315
        L_0x0313:
            r0 = 0
            goto L_0x0340
        L_0x0315:
            int r2 = r10.l()
            int r2 = r2 + r13
            i0.f r0 = r0.f3553i
            r0.d(r2)
            int r2 = r2 - r13
            r8.d(r2)
            r3.g()
            r0 = 1
            r2 = r6[r0]
            if (r2 == r0) goto L_0x032e
            r0 = 4
            if (r2 != r0) goto L_0x033c
        L_0x032e:
            int r0 = r10.j()
            int r0 = r0 + r15
            i0.f r1 = r1.f3553i
            r1.d(r0)
            int r0 = r0 - r15
            r5.d(r0)
        L_0x033c:
            r3.g()
            r0 = 1
        L_0x0340:
            java.util.Iterator r1 = r7.iterator()
        L_0x0344:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x035d
            java.lang.Object r2 = r1.next()
            i0.m r2 = (i0.m) r2
            h0.e r3 = r2.f3546b
            if (r3 != r10) goto L_0x0359
            boolean r3 = r2.f3551g
            if (r3 != 0) goto L_0x0359
            goto L_0x0344
        L_0x0359:
            r2.e()
            goto L_0x0344
        L_0x035d:
            java.util.Iterator r1 = r7.iterator()
        L_0x0361:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0396
            java.lang.Object r2 = r1.next()
            i0.m r2 = (i0.m) r2
            if (r0 != 0) goto L_0x0374
            h0.e r3 = r2.f3546b
            if (r3 != r10) goto L_0x0374
            goto L_0x0361
        L_0x0374:
            i0.f r3 = r2.f3552h
            boolean r3 = r3.f3536j
            if (r3 != 0) goto L_0x037b
            goto L_0x0394
        L_0x037b:
            i0.f r3 = r2.f3553i
            boolean r3 = r3.f3536j
            if (r3 != 0) goto L_0x0386
            boolean r3 = r2 instanceof i0.h
            if (r3 != 0) goto L_0x0386
            goto L_0x0394
        L_0x0386:
            i0.g r3 = r2.f3549e
            boolean r3 = r3.f3536j
            if (r3 != 0) goto L_0x0361
            boolean r3 = r2 instanceof i0.c
            if (r3 != 0) goto L_0x0361
            boolean r2 = r2 instanceof i0.h
            if (r2 != 0) goto L_0x0361
        L_0x0394:
            r0 = 0
            goto L_0x0397
        L_0x0396:
            r0 = 1
        L_0x0397:
            r10.w(r9)
            r10.x(r14)
            r2 = r0
            r5 = r26
            r1 = r27
            r0 = 1073741824(0x40000000, float:2.0)
            r4 = 2
            goto L_0x043f
        L_0x03a7:
            r21 = r1
            r25 = r2
            r27 = r4
            r24 = r5
            r22 = r7
            r23 = r8
            r26 = r12
            boolean r0 = r3.f3520b
            h0.f r1 = r3.f3519a
            if (r0 == 0) goto L_0x0404
            java.util.ArrayList r0 = r1.f3296d0
            java.util.Iterator r0 = r0.iterator()
        L_0x03c1:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x03e7
            java.lang.Object r2 = r0.next()
            h0.e r2 = (h0.e) r2
            r4 = 0
            r2.f3268a = r4
            i0.j r5 = r2.f3274d
            i0.g r6 = r5.f3549e
            r6.f3536j = r4
            r5.f3551g = r4
            r5.n()
            i0.l r2 = r2.f3275e
            i0.g r5 = r2.f3549e
            r5.f3536j = r4
            r2.f3551g = r4
            r2.m()
            goto L_0x03c1
        L_0x03e7:
            r4 = 0
            r1.f3268a = r4
            i0.j r0 = r1.f3274d
            i0.g r2 = r0.f3549e
            r2.f3536j = r4
            r0.f3551g = r4
            r0.n()
            i0.l r0 = r1.f3275e
            i0.g r2 = r0.f3549e
            r2.f3536j = r4
            r0.f3551g = r4
            r0.m()
            r3.c()
            goto L_0x0405
        L_0x0404:
            r4 = 0
        L_0x0405:
            h0.f r0 = r3.f3522d
            r3.b(r0)
            r1.N = r4
            r1.O = r4
            i0.j r0 = r1.f3274d
            i0.f r0 = r0.f3552h
            r0.d(r4)
            i0.l r0 = r1.f3275e
            i0.f r0 = r0.f3552h
            r0.d(r4)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r11 != r0) goto L_0x042f
            r1 = r27
            boolean r2 = r1.D(r4, r9)
            r3 = 1
            r18 = r2 & 1
            r4 = r3
            r2 = r18
            r5 = r26
            goto L_0x0436
        L_0x042f:
            r1 = r27
            r3 = 1
            r2 = r3
            r5 = r26
            r4 = 0
        L_0x0436:
            if (r5 != r0) goto L_0x043f
            boolean r6 = r1.D(r3, r9)
            r2 = r2 & r6
            int r4 = r4 + 1
        L_0x043f:
            if (r2 == 0) goto L_0x045c
            if (r11 != r0) goto L_0x0445
            r3 = 1
            goto L_0x0446
        L_0x0445:
            r3 = 0
        L_0x0446:
            if (r5 != r0) goto L_0x044a
            r0 = 1
            goto L_0x044b
        L_0x044a:
            r0 = 0
        L_0x044b:
            r1.z(r3, r0)
            goto L_0x045c
        L_0x044f:
            r21 = r1
            r25 = r2
            r1 = r4
            r24 = r5
            r22 = r7
            r23 = r8
            r2 = 0
            r4 = 0
        L_0x045c:
            if (r2 == 0) goto L_0x0465
            r0 = 2
            if (r4 == r0) goto L_0x0462
            goto L_0x0465
        L_0x0462:
            r3 = r1
            goto L_0x06f3
        L_0x0465:
            if (r25 <= 0) goto L_0x04e5
            java.util.ArrayList r0 = r1.f3296d0
            int r0 = r0.size()
            j0.e r2 = r1.f3298g0
            r3 = 0
        L_0x0470:
            if (r3 >= r0) goto L_0x04bd
            java.util.ArrayList r4 = r1.f3296d0
            java.lang.Object r4 = r4.get(r3)
            h0.e r4 = (h0.e) r4
            boolean r5 = r4 instanceof h0.i
            if (r5 == 0) goto L_0x047f
            goto L_0x048f
        L_0x047f:
            i0.j r5 = r4.f3274d
            i0.g r5 = r5.f3549e
            boolean r5 = r5.f3536j
            if (r5 == 0) goto L_0x0493
            i0.l r5 = r4.f3275e
            i0.g r5 = r5.f3549e
            boolean r5 = r5.f3536j
            if (r5 == 0) goto L_0x0493
        L_0x048f:
            r5 = r24
            r8 = 3
            goto L_0x04b8
        L_0x0493:
            r5 = 0
            int r6 = r4.i(r5)
            r5 = 1
            int r7 = r4.i(r5)
            r8 = 3
            if (r6 != r8) goto L_0x04ac
            int r6 = r4.f3280j
            if (r6 == r5) goto L_0x04ac
            if (r7 != r8) goto L_0x04ac
            int r6 = r4.f3281k
            if (r6 == r5) goto L_0x04ac
            r5 = 1
            goto L_0x04ad
        L_0x04ac:
            r5 = 0
        L_0x04ad:
            if (r5 == 0) goto L_0x04b2
            r5 = r24
            goto L_0x04b8
        L_0x04b2:
            r5 = r24
            r6 = 0
            r5.i(r2, r4, r6)
        L_0x04b8:
            int r3 = r3 + 1
            r24 = r5
            goto L_0x0470
        L_0x04bd:
            r5 = r24
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.f3692a
            int r2 = r0.getChildCount()
            r3 = 0
        L_0x04c6:
            if (r3 >= r2) goto L_0x04ce
            r0.getChildAt(r3)
            int r3 = r3 + 1
            goto L_0x04c6
        L_0x04ce:
            java.util.ArrayList r0 = r0.f923e
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x04e7
            r3 = 0
        L_0x04d7:
            if (r3 >= r2) goto L_0x04e7
            java.lang.Object r4 = r0.get(r3)
            j0.b r4 = (j0.b) r4
            r4.getClass()
            int r3 = r3 + 1
            goto L_0x04d7
        L_0x04e5:
            r5 = r24
        L_0x04e7:
            int r0 = r1.f3307p0
            java.lang.Object r2 = r5.f327e
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r4 = r22
            r6 = r23
            if (r25 <= 0) goto L_0x04fa
            r5.k(r1, r4, r6)
        L_0x04fa:
            if (r3 <= 0) goto L_0x06e2
            int[] r7 = r1.f3273c0
            r8 = 0
            r9 = r7[r8]
            r8 = 2
            if (r9 != r8) goto L_0x0506
            r9 = 1
            goto L_0x0507
        L_0x0506:
            r9 = 0
        L_0x0507:
            r10 = 1
            r7 = r7[r10]
            if (r7 != r8) goto L_0x050e
            r7 = 1
            goto L_0x050f
        L_0x050e:
            r7 = 0
        L_0x050f:
            int r8 = r1.l()
            java.lang.Object r10 = r5.f329g
            h0.f r10 = (h0.f) r10
            int r11 = r10.Q
            int r8 = java.lang.Math.max(r8, r11)
            int r11 = r1.j()
            int r10 = r10.R
            int r10 = java.lang.Math.max(r11, r10)
            r11 = r8
            r12 = r10
            r8 = 0
            r10 = 0
        L_0x052b:
            h0.c r13 = h0.c.f3255g
            h0.c r14 = h0.c.f3254f
            if (r8 >= r3) goto L_0x05cb
            java.lang.Object r15 = r2.get(r8)
            h0.e r15 = (h0.e) r15
            r16 = r0
            boolean r0 = r15 instanceof h0.h
            if (r0 != 0) goto L_0x0547
            r27 = r1
            r22 = r4
            r23 = r6
            r4 = r21
            goto L_0x05bd
        L_0x0547:
            int r0 = r15.l()
            r27 = r1
            int r1 = r15.j()
            r22 = r4
            r23 = r6
            r4 = r21
            r6 = 1
            boolean r17 = r5.i(r4, r15, r6)
            r6 = r10 | r17
            int r10 = r15.l()
            r17 = r6
            int r6 = r15.j()
            if (r10 == r0) goto L_0x058f
            r15.y(r10)
            if (r9 == 0) goto L_0x058d
            int r0 = r15.m()
            int r10 = r15.J
            int r0 = r0 + r10
            if (r0 <= r11) goto L_0x058d
            int r0 = r15.m()
            int r10 = r15.J
            int r0 = r0 + r10
            h0.d r10 = r15.h(r14)
            int r10 = r10.c()
            int r10 = r10 + r0
            int r0 = java.lang.Math.max(r11, r10)
            r11 = r0
        L_0x058d:
            r14 = 1
            goto L_0x0591
        L_0x058f:
            r14 = r17
        L_0x0591:
            if (r6 == r1) goto L_0x05b7
            r15.v(r6)
            if (r7 == 0) goto L_0x05b6
            int r0 = r15.n()
            int r1 = r15.K
            int r0 = r0 + r1
            if (r0 <= r12) goto L_0x05b6
            int r0 = r15.n()
            int r1 = r15.K
            int r0 = r0 + r1
            h0.d r1 = r15.h(r13)
            int r1 = r1.c()
            int r1 = r1 + r0
            int r0 = java.lang.Math.max(r12, r1)
            r12 = r0
        L_0x05b6:
            r14 = 1
        L_0x05b7:
            h0.h r15 = (h0.h) r15
            boolean r0 = r15.f3333l0
            r0 = r0 | r14
            r10 = r0
        L_0x05bd:
            int r8 = r8 + 1
            r21 = r4
            r0 = r16
            r4 = r22
            r6 = r23
            r1 = r27
            goto L_0x052b
        L_0x05cb:
            r16 = r0
            r27 = r1
            r22 = r4
            r23 = r6
            r4 = r21
            r0 = 0
        L_0x05d6:
            r1 = 2
            if (r0 >= r1) goto L_0x06b9
            r6 = 0
        L_0x05da:
            if (r6 >= r3) goto L_0x0690
            java.lang.Object r8 = r2.get(r6)
            h0.e r8 = (h0.e) r8
            boolean r15 = r8 instanceof h0.j
            if (r15 == 0) goto L_0x05ea
            boolean r15 = r8 instanceof h0.h
            if (r15 == 0) goto L_0x060b
        L_0x05ea:
            boolean r15 = r8 instanceof h0.i
            if (r15 == 0) goto L_0x05ef
            goto L_0x060b
        L_0x05ef:
            int r15 = r8.V
            r1 = 8
            if (r15 != r1) goto L_0x05f6
            goto L_0x060b
        L_0x05f6:
            i0.j r1 = r8.f3274d
            i0.g r1 = r1.f3549e
            boolean r1 = r1.f3536j
            if (r1 == 0) goto L_0x0607
            i0.l r1 = r8.f3275e
            i0.g r1 = r1.f3549e
            boolean r1 = r1.f3536j
            if (r1 == 0) goto L_0x0607
            goto L_0x060b
        L_0x0607:
            boolean r1 = r8 instanceof h0.h
            if (r1 == 0) goto L_0x0613
        L_0x060b:
            r17 = r2
            r20 = r3
            r21 = r4
            goto L_0x0685
        L_0x0613:
            int r1 = r8.l()
            int r15 = r8.j()
            r17 = r2
            int r2 = r8.P
            r20 = r3
            r3 = 1
            boolean r18 = r5.i(r4, r8, r3)
            r10 = r10 | r18
            int r3 = r8.l()
            r21 = r4
            int r4 = r8.j()
            if (r3 == r1) goto L_0x0657
            r8.y(r3)
            if (r9 == 0) goto L_0x0656
            int r1 = r8.m()
            int r3 = r8.J
            int r1 = r1 + r3
            if (r1 <= r11) goto L_0x0656
            int r1 = r8.m()
            int r3 = r8.J
            int r1 = r1 + r3
            h0.d r3 = r8.h(r14)
            int r3 = r3.c()
            int r3 = r3 + r1
            int r11 = java.lang.Math.max(r11, r3)
        L_0x0656:
            r10 = 1
        L_0x0657:
            if (r4 == r15) goto L_0x067c
            r8.v(r4)
            if (r7 == 0) goto L_0x067b
            int r1 = r8.n()
            int r3 = r8.K
            int r1 = r1 + r3
            if (r1 <= r12) goto L_0x067b
            int r1 = r8.n()
            int r3 = r8.K
            int r1 = r1 + r3
            h0.d r3 = r8.h(r13)
            int r3 = r3.c()
            int r3 = r3 + r1
            int r12 = java.lang.Math.max(r12, r3)
        L_0x067b:
            r10 = 1
        L_0x067c:
            boolean r1 = r8.w
            if (r1 == 0) goto L_0x0685
            int r1 = r8.P
            if (r2 == r1) goto L_0x0685
            r10 = 1
        L_0x0685:
            int r6 = r6 + 1
            r2 = r17
            r3 = r20
            r4 = r21
            r1 = 2
            goto L_0x05da
        L_0x0690:
            r17 = r2
            r20 = r3
            r21 = r4
            if (r10 == 0) goto L_0x06a3
            r1 = r22
            r2 = r23
            r3 = r27
            r5.k(r3, r1, r2)
            r10 = 0
            goto L_0x06a9
        L_0x06a3:
            r1 = r22
            r2 = r23
            r3 = r27
        L_0x06a9:
            int r0 = r0 + 1
            r22 = r1
            r23 = r2
            r27 = r3
            r2 = r17
            r3 = r20
            r4 = r21
            goto L_0x05d6
        L_0x06b9:
            r1 = r22
            r2 = r23
            r3 = r27
            if (r10 == 0) goto L_0x06e5
            r5.k(r3, r1, r2)
            int r0 = r3.l()
            if (r0 >= r11) goto L_0x06cf
            r3.y(r11)
            r0 = 1
            goto L_0x06d0
        L_0x06cf:
            r0 = 0
        L_0x06d0:
            int r4 = r3.j()
            if (r4 >= r12) goto L_0x06db
            r3.v(r12)
            r14 = 1
            goto L_0x06dc
        L_0x06db:
            r14 = r0
        L_0x06dc:
            if (r14 == 0) goto L_0x06e5
            r5.k(r3, r1, r2)
            goto L_0x06e5
        L_0x06e2:
            r16 = r0
            r3 = r1
        L_0x06e5:
            r0 = r16
            r3.f3307p0 = r0
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L_0x06f0
            r9 = 1
            goto L_0x06f1
        L_0x06f0:
            r9 = 0
        L_0x06f1:
            g0.e.f2791p = r9
        L_0x06f3:
            int r0 = r3.l()
            int r1 = r3.j()
            boolean r2 = r3.f3308q0
            boolean r3 = r3.f3309r0
            r4 = r19
            int r5 = r4.f3696e
            int r4 = r4.f3695d
            int r0 = r0 + r4
            int r1 = r1 + r5
            r4 = r29
            r5 = 0
            int r0 = android.view.View.resolveSizeAndState(r0, r4, r5)
            r4 = r30
            int r1 = android.view.View.resolveSizeAndState(r1, r4, r5)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r4
            r1 = r1 & r4
            r4 = r28
            int r5 = r4.f927i
            int r0 = java.lang.Math.min(r5, r0)
            int r5 = r4.f928j
            int r1 = java.lang.Math.min(r5, r1)
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r2 == 0) goto L_0x072c
            r0 = r0 | r5
        L_0x072c:
            if (r3 == 0) goto L_0x072f
            r1 = r1 | r5
        L_0x072f:
            r4.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        h0.e a6 = a(view);
        if ((view instanceof p) && !(a6 instanceof i)) {
            d dVar = (d) view.getLayoutParams();
            i iVar = new i();
            dVar.f3677k0 = iVar;
            dVar.Y = true;
            iVar.B(dVar.R);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.g();
            ((d) view.getLayoutParams()).Z = true;
            ArrayList arrayList = this.f923e;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.f922d.put(view.getId(), view);
        this.f929k = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f922d.remove(view.getId());
        h0.e a6 = a(view);
        this.f924f.f3296d0.remove(a6);
        a6.I = null;
        this.f923e.remove(view);
        this.f929k = true;
    }

    public final void removeView(View view) {
        super.removeView(view);
    }

    public final void requestLayout() {
        this.f929k = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f931m = nVar;
    }

    public void setId(int i3) {
        int id = getId();
        SparseArray sparseArray = this.f922d;
        sparseArray.remove(id);
        super.setId(i3);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i3) {
        if (i3 != this.f928j) {
            this.f928j = i3;
            requestLayout();
        }
    }

    public void setMaxWidth(int i3) {
        if (i3 != this.f927i) {
            this.f927i = i3;
            requestLayout();
        }
    }

    public void setMinHeight(int i3) {
        if (i3 != this.f926h) {
            this.f926h = i3;
            requestLayout();
        }
    }

    public void setMinWidth(int i3) {
        if (i3 != this.f925g) {
            this.f925g = i3;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(o oVar) {
        h hVar = this.f932n;
        if (hVar != null) {
            hVar.getClass();
        }
    }

    public void setOptimizationLevel(int i3) {
        this.f930l = i3;
        this.f924f.f3307p0 = i3;
        g0.e.f2791p = (i3 & 256) == 256;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        b(attributeSet, i3);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d(layoutParams);
    }
}
