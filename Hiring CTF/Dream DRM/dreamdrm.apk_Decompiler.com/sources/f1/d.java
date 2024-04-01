package f1;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.activity.i;
import java.util.Arrays;
import java.util.WeakHashMap;
import x0.u0;

public final class d {

    /* renamed from: v  reason: collision with root package name */
    public static final c f2616v = new c(0);

    /* renamed from: a  reason: collision with root package name */
    public int f2617a;

    /* renamed from: b  reason: collision with root package name */
    public int f2618b;

    /* renamed from: c  reason: collision with root package name */
    public int f2619c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f2620d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f2621e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f2622f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f2623g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f2624h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f2625i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f2626j;

    /* renamed from: k  reason: collision with root package name */
    public int f2627k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f2628l;

    /* renamed from: m  reason: collision with root package name */
    public final float f2629m;

    /* renamed from: n  reason: collision with root package name */
    public final float f2630n;

    /* renamed from: o  reason: collision with root package name */
    public final int f2631o;

    /* renamed from: p  reason: collision with root package name */
    public final OverScroller f2632p;

    /* renamed from: q  reason: collision with root package name */
    public final com.bumptech.glide.d f2633q;

    /* renamed from: r  reason: collision with root package name */
    public View f2634r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2635s;

    /* renamed from: t  reason: collision with root package name */
    public final ViewGroup f2636t;

    /* renamed from: u  reason: collision with root package name */
    public final i f2637u = new i(5, this);

    public d(Context context, ViewGroup viewGroup, com.bumptech.glide.d dVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (dVar != null) {
            this.f2636t = viewGroup;
            this.f2633q = dVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f2631o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f2618b = viewConfiguration.getScaledTouchSlop();
            this.f2629m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f2630n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f2632p = new OverScroller(context, f2616v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public final void a() {
        this.f2619c = -1;
        float[] fArr = this.f2620d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2621e, 0.0f);
            Arrays.fill(this.f2622f, 0.0f);
            Arrays.fill(this.f2623g, 0.0f);
            Arrays.fill(this.f2624h, 0);
            Arrays.fill(this.f2625i, 0);
            Arrays.fill(this.f2626j, 0);
            this.f2627k = 0;
        }
        VelocityTracker velocityTracker = this.f2628l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2628l = null;
        }
    }

    public final void b(View view, int i3) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f2636t;
        if (parent == viewGroup) {
            this.f2634r = view;
            this.f2619c = i3;
            this.f2633q.u(view, i3);
            p(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean c(float f6, float f7, int i3, int i6) {
        float abs = Math.abs(f6);
        float abs2 = Math.abs(f7);
        if ((this.f2624h[i3] & i6) != i6 || (0 & i6) == 0 || (this.f2626j[i3] & i6) == i6 || (this.f2625i[i3] & i6) == i6) {
            return false;
        }
        int i7 = this.f2618b;
        if (abs <= ((float) i7) && abs2 <= ((float) i7)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f2633q.getClass();
        }
        return (this.f2625i[i3] & i6) == 0 && abs > ((float) this.f2618b);
    }

    public final boolean d(View view, float f6, float f7) {
        if (view == null) {
            return false;
        }
        com.bumptech.glide.d dVar = this.f2633q;
        boolean z5 = dVar.n(view) > 0;
        boolean z6 = dVar.o() > 0;
        if (!z5 || !z6) {
            return z5 ? Math.abs(f6) > ((float) this.f2618b) : z6 && Math.abs(f7) > ((float) this.f2618b);
        }
        float f8 = f7 * f7;
        int i3 = this.f2618b;
        return f8 + (f6 * f6) > ((float) (i3 * i3));
    }

    public final void e(int i3) {
        float[] fArr = this.f2620d;
        if (fArr != null) {
            int i6 = this.f2627k;
            boolean z5 = true;
            int i7 = 1 << i3;
            if ((i7 & i6) == 0) {
                z5 = false;
            }
            if (z5) {
                fArr[i3] = 0.0f;
                this.f2621e[i3] = 0.0f;
                this.f2622f[i3] = 0.0f;
                this.f2623g[i3] = 0.0f;
                this.f2624h[i3] = 0;
                this.f2625i[i3] = 0;
                this.f2626j[i3] = 0;
                this.f2627k = (~i7) & i6;
            }
        }
    }

    public final int f(int i3, int i6, int i7) {
        if (i3 == 0) {
            return 0;
        }
        int width = this.f2636t.getWidth();
        float f6 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i3)) / ((float) width)) - 0.5f) * 0.47123894f))) * f6) + f6;
        int abs = Math.abs(i6);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i3)) / ((float) i7)) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f2617a == 2) {
            OverScroller overScroller = this.f2632p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f2634r.getLeft();
            int top = currY - this.f2634r.getTop();
            if (left != 0) {
                View view = this.f2634r;
                WeakHashMap weakHashMap = u0.f5622a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f2634r;
                WeakHashMap weakHashMap2 = u0.f5622a;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f2633q.w(this.f2634r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f2636t.post(this.f2637u);
            }
        }
        return this.f2617a == 2;
    }

    public final View h(int i3, int i6) {
        ViewGroup viewGroup = this.f2636t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f2633q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i3 >= childAt.getLeft() && i3 < childAt.getRight() && i6 >= childAt.getTop() && i6 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f2634r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f2634r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f2632p
            r11 = 0
            if (r4 != 0) goto L_0x001e
            if (r5 != 0) goto L_0x001e
            r1.abortAnimation()
            r10.p(r11)
            return r11
        L_0x001e:
            android.view.View r12 = r10.f2634r
            float r0 = r10.f2630n
            int r0 = (int) r0
            float r6 = r10.f2629m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L_0x002e
            r13 = r11
            goto L_0x0035
        L_0x002e:
            if (r7 <= r6) goto L_0x0035
            if (r13 <= 0) goto L_0x0034
            r13 = r6
            goto L_0x0035
        L_0x0034:
            int r13 = -r6
        L_0x0035:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L_0x003c
            goto L_0x0043
        L_0x003c:
            if (r7 <= r6) goto L_0x0044
            if (r14 <= 0) goto L_0x0042
            r14 = r6
            goto L_0x0044
        L_0x0042:
            int r11 = -r6
        L_0x0043:
            r14 = r11
        L_0x0044:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L_0x005d
            float r11 = (float) r6
            float r6 = (float) r8
            goto L_0x005f
        L_0x005d:
            float r11 = (float) r11
            float r6 = (float) r9
        L_0x005f:
            float r11 = r11 / r6
            if (r14 == 0) goto L_0x0065
            float r0 = (float) r7
            float r6 = (float) r8
            goto L_0x0067
        L_0x0065:
            float r0 = (float) r0
            float r6 = (float) r9
        L_0x0067:
            float r0 = r0 / r6
            com.bumptech.glide.d r6 = r10.f2633q
            int r12 = r6.n(r12)
            int r12 = r10.f(r4, r13, r12)
            int r13 = r6.o()
            int r13 = r10.f(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.p(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.d.i(int, int, int, int):boolean");
    }

    public final boolean j(int i3) {
        if ((this.f2627k & (1 << i3)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i3 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2628l == null) {
            this.f2628l = VelocityTracker.obtain();
        }
        this.f2628l.addMovement(motionEvent);
        int i6 = 0;
        com.bumptech.glide.d dVar = this.f2633q;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f2617a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i6 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i6);
                            if (j(pointerId)) {
                                float x5 = motionEvent.getX(i6);
                                float y5 = motionEvent.getY(i6);
                                float f6 = x5 - this.f2620d[pointerId];
                                float f7 = y5 - this.f2621e[pointerId];
                                m(f6, f7, pointerId);
                                if (this.f2617a != 1) {
                                    View h6 = h((int) x5, (int) y5);
                                    if (d(h6, f6, f7) && s(h6, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i6++;
                        }
                    } else if (j(this.f2619c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f2619c);
                        float x6 = motionEvent.getX(findPointerIndex);
                        float y6 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f2622f;
                        int i7 = this.f2619c;
                        int i8 = (int) (x6 - fArr[i7]);
                        int i9 = (int) (y6 - this.f2623g[i7]);
                        int left = this.f2634r.getLeft() + i8;
                        int top = this.f2634r.getTop() + i9;
                        int left2 = this.f2634r.getLeft();
                        int top2 = this.f2634r.getTop();
                        if (i8 != 0) {
                            left = dVar.f(this.f2634r, left);
                            WeakHashMap weakHashMap = u0.f5622a;
                            this.f2634r.offsetLeftAndRight(left - left2);
                        }
                        if (i9 != 0) {
                            top = dVar.g(this.f2634r, top);
                            WeakHashMap weakHashMap2 = u0.f5622a;
                            this.f2634r.offsetTopAndBottom(top - top2);
                        }
                        if (!(i8 == 0 && i9 == 0)) {
                            dVar.w(this.f2634r, left, top);
                        }
                    } else {
                        return;
                    }
                    o(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x7 = motionEvent.getX(actionIndex);
                        float y7 = motionEvent.getY(actionIndex);
                        n(x7, y7, pointerId2);
                        if (this.f2617a == 0) {
                            s(h((int) x7, (int) y7), pointerId2);
                            if ((this.f2624h[pointerId2] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i10 = (int) x7;
                            int i11 = (int) y7;
                            View view = this.f2634r;
                            if (view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom()) {
                                i6 = 1;
                            }
                            if (i6 != 0) {
                                s(this.f2634r, pointerId2);
                                return;
                            }
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f2617a == 1 && pointerId3 == this.f2619c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i6 >= pointerCount2) {
                                    i3 = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i6);
                                if (pointerId4 != this.f2619c) {
                                    View h7 = h((int) motionEvent.getX(i6), (int) motionEvent.getY(i6));
                                    View view2 = this.f2634r;
                                    if (h7 == view2 && s(view2, pointerId4)) {
                                        i3 = this.f2619c;
                                        break;
                                    }
                                }
                                i6++;
                            }
                            if (i3 == -1) {
                                l();
                            }
                        }
                        e(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f2617a == 1) {
                    this.f2635s = true;
                    dVar.x(this.f2634r, 0.0f, 0.0f);
                    this.f2635s = false;
                    if (this.f2617a == 1) {
                        p(0);
                    }
                }
            } else if (this.f2617a == 1) {
                l();
            }
            a();
            return;
        }
        float x8 = motionEvent.getX();
        float y8 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View h8 = h((int) x8, (int) y8);
        n(x8, y8, pointerId5);
        s(h8, pointerId5);
        if ((this.f2624h[pointerId5] & 0) == 0) {
            return;
        }
        dVar.getClass();
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f2628l;
        float f6 = this.f2629m;
        velocityTracker.computeCurrentVelocity(1000, f6);
        float xVelocity = this.f2628l.getXVelocity(this.f2619c);
        float abs = Math.abs(xVelocity);
        float f7 = this.f2630n;
        float f8 = 0.0f;
        if (abs < f7) {
            xVelocity = 0.0f;
        } else if (abs > f6) {
            xVelocity = xVelocity > 0.0f ? f6 : -f6;
        }
        float yVelocity = this.f2628l.getYVelocity(this.f2619c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f7) {
            if (abs2 > f6) {
                if (yVelocity <= 0.0f) {
                    f6 = -f6;
                }
                f8 = f6;
            } else {
                f8 = yVelocity;
            }
        }
        this.f2635s = true;
        this.f2633q.x(this.f2634r, xVelocity, f8);
        this.f2635s = false;
        if (this.f2617a == 1) {
            p(0);
        }
    }

    public final void m(float f6, float f7, int i3) {
        boolean c6 = c(f6, f7, i3, 1);
        if (c(f7, f6, i3, 4)) {
            c6 |= true;
        }
        if (c(f6, f7, i3, 2)) {
            c6 |= true;
        }
        if (c(f7, f6, i3, 8)) {
            c6 |= true;
        }
        if (c6) {
            int[] iArr = this.f2625i;
            iArr[i3] = iArr[i3] | c6;
            this.f2633q.getClass();
        }
    }

    public final void n(float f6, float f7, int i3) {
        float[] fArr = this.f2620d;
        int i6 = 0;
        if (fArr == null || fArr.length <= i3) {
            int i7 = i3 + 1;
            float[] fArr2 = new float[i7];
            float[] fArr3 = new float[i7];
            float[] fArr4 = new float[i7];
            float[] fArr5 = new float[i7];
            int[] iArr = new int[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2621e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2622f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2623g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2624h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2625i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2626j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2620d = fArr2;
            this.f2621e = fArr3;
            this.f2622f = fArr4;
            this.f2623g = fArr5;
            this.f2624h = iArr;
            this.f2625i = iArr2;
            this.f2626j = iArr3;
        }
        float[] fArr9 = this.f2620d;
        this.f2622f[i3] = f6;
        fArr9[i3] = f6;
        float[] fArr10 = this.f2621e;
        this.f2623g[i3] = f7;
        fArr10[i3] = f7;
        int[] iArr7 = this.f2624h;
        int i8 = (int) f6;
        int i9 = (int) f7;
        ViewGroup viewGroup = this.f2636t;
        int left = viewGroup.getLeft();
        int i10 = this.f2631o;
        if (i8 < left + i10) {
            i6 = 1;
        }
        if (i9 < viewGroup.getTop() + i10) {
            i6 |= 4;
        }
        if (i8 > viewGroup.getRight() - i10) {
            i6 |= 2;
        }
        if (i9 > viewGroup.getBottom() - i10) {
            i6 |= 8;
        }
        iArr7[i3] = i6;
        this.f2627k |= 1 << i3;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < pointerCount; i3++) {
            int pointerId = motionEvent.getPointerId(i3);
            if (j(pointerId)) {
                float x5 = motionEvent.getX(i3);
                float y5 = motionEvent.getY(i3);
                this.f2622f[pointerId] = x5;
                this.f2623g[pointerId] = y5;
            }
        }
    }

    public final void p(int i3) {
        this.f2636t.removeCallbacks(this.f2637u);
        if (this.f2617a != i3) {
            this.f2617a = i3;
            this.f2633q.v(i3);
            if (this.f2617a == 0) {
                this.f2634r = null;
            }
        }
    }

    public final boolean q(int i3, int i6) {
        if (this.f2635s) {
            return i(i3, i6, (int) this.f2628l.getXVelocity(this.f2619c), (int) this.f2628l.getYVelocity(this.f2619c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if ((r0.f2624h[r2] & 0) != 0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        if (r13 != r12) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011c, code lost:
        if ((r0.f2624h[r1] & 0) != 0) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r19.getActionMasked()
            int r3 = r19.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r18.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f2628l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f2628l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f2628l
            r4.addMovement(r1)
            r4 = 1
            r5 = 0
            r6 = 2
            com.bumptech.glide.d r7 = r0.f2633q
            if (r2 == 0) goto L_0x00f7
            if (r2 == r4) goto L_0x00f3
            if (r2 == r6) goto L_0x006f
            r8 = 3
            if (r2 == r8) goto L_0x00f3
            r8 = 5
            if (r2 == r8) goto L_0x003f
            r6 = 6
            if (r2 == r6) goto L_0x0036
            goto L_0x0120
        L_0x0036:
            int r1 = r1.getPointerId(r3)
            r0.e(r1)
            goto L_0x0120
        L_0x003f:
            int r2 = r1.getPointerId(r3)
            float r8 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.n(r8, r1, r2)
            int r3 = r0.f2617a
            if (r3 != 0) goto L_0x005e
            int[] r1 = r0.f2624h
            r1 = r1[r2]
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0120
        L_0x0059:
            r7.getClass()
            goto L_0x0120
        L_0x005e:
            if (r3 != r6) goto L_0x0120
            int r3 = (int) r8
            int r1 = (int) r1
            android.view.View r1 = r0.h(r3, r1)
            android.view.View r3 = r0.f2634r
            if (r1 != r3) goto L_0x0120
            r0.s(r1, r2)
            goto L_0x0120
        L_0x006f:
            float[] r2 = r0.f2620d
            if (r2 == 0) goto L_0x0120
            float[] r2 = r0.f2621e
            if (r2 != 0) goto L_0x0079
            goto L_0x0120
        L_0x0079:
            int r2 = r19.getPointerCount()
            r3 = r5
        L_0x007e:
            if (r3 >= r2) goto L_0x00ef
            int r6 = r1.getPointerId(r3)
            boolean r8 = r0.j(r6)
            if (r8 != 0) goto L_0x008b
            goto L_0x00ec
        L_0x008b:
            float r8 = r1.getX(r3)
            float r9 = r1.getY(r3)
            float[] r10 = r0.f2620d
            r10 = r10[r6]
            float r10 = r8 - r10
            float[] r11 = r0.f2621e
            r11 = r11[r6]
            float r11 = r9 - r11
            int r8 = (int) r8
            int r9 = (int) r9
            android.view.View r8 = r0.h(r8, r9)
            if (r8 == 0) goto L_0x00af
            boolean r9 = r0.d(r8, r10, r11)
            if (r9 == 0) goto L_0x00af
            r9 = r4
            goto L_0x00b0
        L_0x00af:
            r9 = r5
        L_0x00b0:
            if (r9 == 0) goto L_0x00db
            int r12 = r8.getLeft()
            int r13 = (int) r10
            int r13 = r13 + r12
            int r13 = r7.f(r8, r13)
            int r14 = r8.getTop()
            int r15 = (int) r11
            int r15 = r15 + r14
            int r15 = r7.g(r8, r15)
            int r16 = r7.n(r8)
            int r17 = r7.o()
            if (r16 == 0) goto L_0x00d4
            if (r16 <= 0) goto L_0x00db
            if (r13 != r12) goto L_0x00db
        L_0x00d4:
            if (r17 == 0) goto L_0x00ef
            if (r17 <= 0) goto L_0x00db
            if (r15 != r14) goto L_0x00db
            goto L_0x00ef
        L_0x00db:
            r0.m(r10, r11, r6)
            int r10 = r0.f2617a
            if (r10 != r4) goto L_0x00e3
            goto L_0x00ef
        L_0x00e3:
            if (r9 == 0) goto L_0x00ec
            boolean r6 = r0.s(r8, r6)
            if (r6 == 0) goto L_0x00ec
            goto L_0x00ef
        L_0x00ec:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00ef:
            r18.o(r19)
            goto L_0x0120
        L_0x00f3:
            r18.a()
            goto L_0x0120
        L_0x00f7:
            float r2 = r19.getX()
            float r3 = r19.getY()
            int r1 = r1.getPointerId(r5)
            r0.n(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.h(r2, r3)
            android.view.View r3 = r0.f2634r
            if (r2 != r3) goto L_0x0117
            int r3 = r0.f2617a
            if (r3 != r6) goto L_0x0117
            r0.s(r2, r1)
        L_0x0117:
            int[] r2 = r0.f2624h
            r1 = r2[r1]
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0120
            goto L_0x0059
        L_0x0120:
            int r1 = r0.f2617a
            if (r1 != r4) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            r4 = r5
        L_0x0126:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.d.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i3) {
        if (view == this.f2634r && this.f2619c == i3) {
            return true;
        }
        if (view == null || !this.f2633q.C(view, i3)) {
            return false;
        }
        this.f2619c = i3;
        b(view, i3);
        return true;
    }
}
