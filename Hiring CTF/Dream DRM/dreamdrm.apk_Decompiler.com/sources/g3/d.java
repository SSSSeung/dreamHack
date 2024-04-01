package g3;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.e;
import com.google.android.material.chip.Chip;
import com.theori.dreamdrm.R;
import e.n0;
import f1.a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x0.c;
import x0.d0;
import x0.u0;
import y0.h;
import y0.o;

public final class d extends c {

    /* renamed from: o  reason: collision with root package name */
    public static final Rect f2856o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: p  reason: collision with root package name */
    public static final e f2857p = new e(17);

    /* renamed from: q  reason: collision with root package name */
    public static final e f2858q = new e(18);

    /* renamed from: d  reason: collision with root package name */
    public final Rect f2859d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f2860e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f2861f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f2862g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f2863h;

    /* renamed from: i  reason: collision with root package name */
    public final View f2864i;

    /* renamed from: j  reason: collision with root package name */
    public a f2865j;

    /* renamed from: k  reason: collision with root package name */
    public int f2866k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f2867l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f2868m = Integer.MIN_VALUE;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Chip f2869n;

    public d(Chip chip, Chip chip2) {
        this.f2869n = chip;
        if (chip2 != null) {
            this.f2864i = chip2;
            this.f2863h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
            chip2.setFocusable(true);
            WeakHashMap weakHashMap = u0.f5622a;
            if (d0.c(chip2) == 0) {
                d0.s(chip2, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final n0 b(View view) {
        if (this.f2865j == null) {
            this.f2865j = new a(this);
        }
        return this.f2865j;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    public final void d(View view, o oVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f5549a;
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f5796a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.f2869n;
        f fVar = chip.f1892h;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.T);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        oVar.i(chip.getText());
    }

    public final boolean j(int i3) {
        if (this.f2867l != i3) {
            return false;
        }
        this.f2867l = Integer.MIN_VALUE;
        if (i3 == 1) {
            Chip chip = this.f2869n;
            chip.f1900p = false;
            chip.refreshDrawableState();
        }
        q(i3, 8);
        return true;
    }

    public final o k(int i3) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        o oVar = new o(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f2856o;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        oVar.f5797b = -1;
        View view = this.f2864i;
        obtain.setParent(view);
        o(i3, oVar);
        if (oVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f2860e;
        oVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(view.getContext().getPackageName());
                oVar.f5798c = i3;
                obtain.setSource(view, i3);
                boolean z5 = false;
                if (this.f2866k == i3) {
                    obtain.setAccessibilityFocused(true);
                    oVar.a(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    oVar.a(64);
                }
                boolean z6 = this.f2867l == i3;
                if (z6) {
                    oVar.a(2);
                } else if (obtain.isFocusable()) {
                    oVar.a(1);
                }
                obtain.setFocused(z6);
                int[] iArr = this.f2862g;
                view.getLocationOnScreen(iArr);
                Rect rect3 = this.f2859d;
                obtain.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    oVar.f(rect3);
                    if (oVar.f5797b != -1) {
                        o oVar2 = new o(AccessibilityNodeInfo.obtain());
                        for (int i6 = oVar.f5797b; i6 != -1; i6 = oVar2.f5797b) {
                            oVar2.f5797b = -1;
                            AccessibilityNodeInfo accessibilityNodeInfo = oVar2.f5796a;
                            accessibilityNodeInfo.setParent(view, -1);
                            accessibilityNodeInfo.setBoundsInParent(rect);
                            o(i6, oVar2);
                            oVar2.f(rect2);
                            rect3.offset(rect2.left, rect2.top);
                        }
                    }
                    rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                }
                Rect rect4 = this.f2861f;
                if (view.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    if (rect3.intersect(rect4)) {
                        oVar.f5796a.setBoundsInScreen(rect3);
                        if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                            while (true) {
                                ViewParent parent = view.getParent();
                                if (parent instanceof View) {
                                    view = (View) parent;
                                    if (view.getAlpha() > 0.0f) {
                                        if (view.getVisibility() != 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else if (parent != null) {
                                    z5 = true;
                                }
                            }
                        }
                        if (z5) {
                            obtain.setVisibleToUser(true);
                        }
                    }
                }
                return oVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public final void l(ArrayList arrayList) {
        boolean z5 = false;
        arrayList.add(0);
        Rect rect = Chip.f1891z;
        Chip chip = this.f2869n;
        if (chip.c()) {
            f fVar = chip.f1892h;
            if (fVar != null && fVar.N) {
                z5 = true;
            }
            if (z5 && chip.f1895k != null) {
                arrayList.add(1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013f, code lost:
        if (r14 < ((r15 * r15) + ((r13 * 13) * r13))) goto L_0x0141;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x014b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.l(r3)
            k.k r4 = new k.k
            r4.<init>()
            r6 = 0
        L_0x0014:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0038
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            y0.o r7 = r0.k(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.d(r8, r7)
            int r6 = r6 + 1
            goto L_0x0014
        L_0x0038:
            int r3 = r0.f2867l
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L_0x0041
            r3 = r6
            goto L_0x0047
        L_0x0041:
            java.lang.Object r3 = r4.c(r3, r6)
            y0.o r3 = (y0.o) r3
        L_0x0047:
            androidx.compose.ui.platform.e r8 = f2857p
            androidx.compose.ui.platform.e r9 = f2858q
            r11 = 1
            android.view.View r12 = r0.f2864i
            r13 = 2
            if (r1 == r11) goto L_0x0153
            if (r1 == r13) goto L_0x0153
            r13 = 130(0x82, float:1.82E-43)
            r14 = 66
            r15 = 33
            r6 = 17
            if (r1 == r6) goto L_0x006c
            if (r1 == r15) goto L_0x006c
            if (r1 == r14) goto L_0x006c
            if (r1 != r13) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x006c:
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            int r5 = r0.f2867l
            java.lang.String r10 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r5 == r7) goto L_0x007f
            y0.o r2 = r0.n(r5)
            r2.f(r11)
            goto L_0x00b0
        L_0x007f:
            if (r2 == 0) goto L_0x0085
            r11.set(r2)
            goto L_0x00b0
        L_0x0085:
            int r2 = r12.getWidth()
            int r5 = r12.getHeight()
            if (r1 == r6) goto L_0x00ac
            if (r1 == r15) goto L_0x00a7
            if (r1 == r14) goto L_0x00a1
            if (r1 != r13) goto L_0x009b
            r5 = 0
            r12 = -1
            r11.set(r5, r12, r2, r12)
            goto L_0x00b0
        L_0x009b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r10)
            throw r1
        L_0x00a1:
            r2 = 0
            r12 = -1
            r11.set(r12, r2, r12, r5)
            goto L_0x00b0
        L_0x00a7:
            r12 = 0
            r11.set(r12, r5, r2, r5)
            goto L_0x00b0
        L_0x00ac:
            r12 = 0
            r11.set(r2, r12, r2, r5)
        L_0x00b0:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r11)
            if (r1 == r6) goto L_0x00df
            if (r1 == r15) goto L_0x00d4
            if (r1 == r14) goto L_0x00cb
            if (r1 != r13) goto L_0x00c5
            int r5 = r11.height()
            r6 = 1
            int r5 = r5 + r6
            int r5 = -r5
            goto L_0x00da
        L_0x00c5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r10)
            throw r1
        L_0x00cb:
            r6 = 1
            int r5 = r11.width()
            int r5 = r5 + r6
            int r5 = -r5
            r10 = 0
            goto L_0x00e6
        L_0x00d4:
            r6 = 1
            int r5 = r11.height()
            int r5 = r5 + r6
        L_0x00da:
            r10 = 0
            r2.offset(r10, r5)
            goto L_0x00e9
        L_0x00df:
            r6 = 1
            r10 = 0
            int r5 = r11.width()
            int r5 = r5 + r6
        L_0x00e6:
            r2.offset(r5, r10)
        L_0x00e9:
            r9.getClass()
            int r5 = r4.f3899f
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r9 = r10
            r16 = 0
        L_0x00f6:
            if (r9 >= r5) goto L_0x014e
            java.lang.Object[] r12 = r4.f3898e
            r12 = r12[r9]
            y0.o r12 = (y0.o) r12
            if (r12 != r3) goto L_0x0101
            goto L_0x014b
        L_0x0101:
            r8.getClass()
            r12.f(r6)
            boolean r13 = com.bumptech.glide.c.u(r1, r11, r6)
            if (r13 != 0) goto L_0x010e
            goto L_0x0143
        L_0x010e:
            boolean r13 = com.bumptech.glide.c.u(r1, r11, r2)
            if (r13 != 0) goto L_0x0115
            goto L_0x0141
        L_0x0115:
            boolean r13 = com.bumptech.glide.c.c(r1, r11, r6, r2)
            if (r13 == 0) goto L_0x011c
            goto L_0x0141
        L_0x011c:
            boolean r13 = com.bumptech.glide.c.c(r1, r11, r2, r6)
            if (r13 == 0) goto L_0x0123
            goto L_0x0143
        L_0x0123:
            int r13 = com.bumptech.glide.c.w(r1, r11, r6)
            int r14 = com.bumptech.glide.c.x(r1, r11, r6)
            int r15 = r13 * 13
            int r15 = r15 * r13
            int r14 = r14 * r14
            int r14 = r14 + r15
            int r13 = com.bumptech.glide.c.w(r1, r11, r2)
            int r15 = com.bumptech.glide.c.x(r1, r11, r2)
            int r17 = r13 * 13
            int r17 = r17 * r13
            int r15 = r15 * r15
            int r15 = r15 + r17
            if (r14 >= r15) goto L_0x0143
        L_0x0141:
            r13 = 1
            goto L_0x0144
        L_0x0143:
            r13 = r10
        L_0x0144:
            if (r13 == 0) goto L_0x014b
            r2.set(r6)
            r16 = r12
        L_0x014b:
            int r9 = r9 + 1
            goto L_0x00f6
        L_0x014e:
            r1 = r16
            r2 = -1
            goto L_0x01c1
        L_0x0153:
            r10 = 0
            java.util.WeakHashMap r2 = x0.u0.f5622a
            int r2 = x0.e0.d(r12)
            r5 = 1
            if (r2 != r5) goto L_0x015f
            r5 = 1
            goto L_0x0160
        L_0x015f:
            r5 = r10
        L_0x0160:
            r9.getClass()
            int r2 = r4.f3899f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r2)
            r9 = r10
        L_0x016b:
            if (r9 >= r2) goto L_0x0179
            java.lang.Object[] r11 = r4.f3898e
            r11 = r11[r9]
            y0.o r11 = (y0.o) r11
            r6.add(r11)
            int r9 = r9 + 1
            goto L_0x016b
        L_0x0179:
            f1.b r2 = new f1.b
            r2.<init>(r5, r8)
            java.util.Collections.sort(r6, r2)
            r2 = 1
            if (r1 == r2) goto L_0x01a6
            if (r1 != r13) goto L_0x019e
            int r1 = r6.size()
            if (r3 != 0) goto L_0x018e
            r12 = -1
            goto L_0x0192
        L_0x018e:
            int r12 = r6.lastIndexOf(r3)
        L_0x0192:
            int r12 = r12 + r2
            if (r12 >= r1) goto L_0x019b
            java.lang.Object r1 = r6.get(r12)
            r6 = r1
            goto L_0x019c
        L_0x019b:
            r6 = 0
        L_0x019c:
            r2 = -1
            goto L_0x01bb
        L_0x019e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01a6:
            int r1 = r6.size()
            if (r3 != 0) goto L_0x01ad
            goto L_0x01b1
        L_0x01ad:
            int r1 = r6.indexOf(r3)
        L_0x01b1:
            r2 = -1
            int r1 = r1 + r2
            if (r1 < 0) goto L_0x01ba
            java.lang.Object r6 = r6.get(r1)
            goto L_0x01bb
        L_0x01ba:
            r6 = 0
        L_0x01bb:
            r16 = r6
            y0.o r16 = (y0.o) r16
            r1 = r16
        L_0x01c1:
            if (r1 != 0) goto L_0x01c4
            goto L_0x01d9
        L_0x01c4:
            r5 = r10
        L_0x01c5:
            int r3 = r4.f3899f
            if (r5 >= r3) goto L_0x01d4
            java.lang.Object[] r3 = r4.f3898e
            r3 = r3[r5]
            if (r3 != r1) goto L_0x01d1
            r10 = r5
            goto L_0x01d5
        L_0x01d1:
            int r5 = r5 + 1
            goto L_0x01c5
        L_0x01d4:
            r10 = r2
        L_0x01d5:
            int[] r1 = r4.f3897d
            r7 = r1[r10]
        L_0x01d9:
            boolean r1 = r0.p(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.d.m(int, android.graphics.Rect):boolean");
    }

    public final o n(int i3) {
        if (i3 != -1) {
            return k(i3);
        }
        View view = this.f2864i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        o oVar = new o(obtain);
        WeakHashMap weakHashMap = u0.f5622a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                oVar.f5796a.addChild(view, ((Integer) arrayList.get(i6)).intValue());
            }
            return oVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public final void o(int i3, o oVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f5796a;
        CharSequence charSequence = "";
        if (i3 == 1) {
            Chip chip = this.f2869n;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            oVar.b(h.f5783e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription(charSequence);
        accessibilityNodeInfo.setBoundsInParent(Chip.f1891z);
    }

    public final boolean p(int i3) {
        int i6;
        View view = this.f2864i;
        if ((view.isFocused() || view.requestFocus()) && (i6 = this.f2867l) != i3) {
            if (i6 != Integer.MIN_VALUE) {
                j(i6);
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f2867l = i3;
                if (i3 == 1) {
                    Chip chip = this.f2869n;
                    chip.f1900p = true;
                    chip.refreshDrawableState();
                }
                q(i3, 8);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r5.f2864i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r6, int r7) {
        /*
            r5 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L_0x008b
            android.view.accessibility.AccessibilityManager r0 = r5.f2863h
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x000e
            goto L_0x008b
        L_0x000e:
            android.view.View r0 = r5.f2864i
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L_0x0017
            goto L_0x008b
        L_0x0017:
            r2 = -1
            if (r6 == r2) goto L_0x0081
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            y0.o r2 = r5.n(r6)
            java.util.List r3 = r7.getText()
            java.lang.CharSequence r4 = r2.g()
            r3.add(r4)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f5796a
            java.lang.CharSequence r3 = r2.getContentDescription()
            r7.setContentDescription(r3)
            boolean r3 = r2.isScrollable()
            r7.setScrollable(r3)
            boolean r3 = r2.isPassword()
            r7.setPassword(r3)
            boolean r3 = r2.isEnabled()
            r7.setEnabled(r3)
            boolean r3 = r2.isChecked()
            r7.setChecked(r3)
            java.util.List r3 = r7.getText()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x006b
            java.lang.CharSequence r3 = r7.getContentDescription()
            if (r3 == 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            r6.<init>(r7)
            throw r6
        L_0x006b:
            java.lang.CharSequence r2 = r2.getClassName()
            r7.setClassName(r2)
            y0.t.a(r7, r0, r6)
            android.content.Context r6 = r0.getContext()
            java.lang.String r6 = r6.getPackageName()
            r7.setPackageName(r6)
            goto L_0x0088
        L_0x0081:
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            r0.onInitializeAccessibilityEvent(r7)
        L_0x0088:
            r1.requestSendAccessibilityEvent(r0, r7)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.d.q(int, int):void");
    }
}
