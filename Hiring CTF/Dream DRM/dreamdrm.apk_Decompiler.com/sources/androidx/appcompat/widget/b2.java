package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.activity.i;
import b1.g;
import com.theori.dreamdrm.R;
import java.lang.reflect.InvocationTargetException;

public class b2 extends ListView {

    /* renamed from: d  reason: collision with root package name */
    public final Rect f514d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public int f515e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f516f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f517g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f518h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f519i;

    /* renamed from: j  reason: collision with root package name */
    public z1 f520j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f521k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f522l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f523m;

    /* renamed from: n  reason: collision with root package name */
    public g f524n;

    /* renamed from: o  reason: collision with root package name */
    public i f525o;

    public b2(Context context, boolean z5) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.f522l = z5;
        setCacheColorHint(0);
    }

    public final int a(int i3, int i6) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i7 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i7;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i3, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i9 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i6) {
                return i6;
            }
        }
        return i7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0017
            r0 = 2
            if (r3 == r0) goto L_0x0015
            r0 = 3
            if (r3 == r0) goto L_0x001e
            r0 = r4
            goto L_0x0143
        L_0x0015:
            r0 = r4
            goto L_0x0018
        L_0x0017:
            r0 = r5
        L_0x0018:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0021
        L_0x001e:
            r0 = r5
            goto L_0x0143
        L_0x0021:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0035
            r5 = r4
            goto L_0x0143
        L_0x0035:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f523m = r4
            androidx.appcompat.widget.w1.a(r1, r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x004f
            r1.setPressed(r4)
        L_0x004f:
            r16.layoutChildren()
            int r0 = r1.f519i
            if (r0 == r9) goto L_0x006c
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006c
            if (r0 == r10) goto L_0x006c
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x006c
            r0.setPressed(r5)
        L_0x006c:
            r1.f519i = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            androidx.appcompat.widget.w1.a(r10, r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x0088
            r10.setPressed(r4)
        L_0x0088:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0092
            if (r8 == r9) goto L_0x0092
            r12 = r4
            goto L_0x0093
        L_0x0092:
            r12 = r5
        L_0x0093:
            if (r12 == 0) goto L_0x0098
            r11.setVisible(r5, r5)
        L_0x0098:
            int r0 = r10.getLeft()
            int r13 = r10.getTop()
            int r14 = r10.getRight()
            int r15 = r10.getBottom()
            android.graphics.Rect r5 = r1.f514d
            r5.set(r0, r13, r14, r15)
            int r0 = r5.left
            int r13 = r1.f515e
            int r0 = r0 - r13
            r5.left = r0
            int r0 = r5.top
            int r13 = r1.f516f
            int r0 = r0 - r13
            r5.top = r0
            int r0 = r5.right
            int r13 = r1.f517g
            int r0 = r0 + r13
            r5.right = r0
            int r0 = r5.bottom
            int r13 = r1.f518h
            int r0 = r0 + r13
            r5.bottom = r0
            boolean r0 = t0.b.a()
            if (r0 == 0) goto L_0x00d4
            boolean r0 = androidx.appcompat.widget.y1.a(r16)
            goto L_0x00e3
        L_0x00d4:
            java.lang.reflect.Field r0 = androidx.appcompat.widget.a2.f505a
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00dd }
            goto L_0x00e3
        L_0x00dd:
            r0 = move-exception
            r13 = r0
            r13.printStackTrace()
        L_0x00e2:
            r0 = 0
        L_0x00e3:
            boolean r13 = r10.isEnabled()
            if (r13 == r0) goto L_0x0109
            r0 = r0 ^ r4
            boolean r13 = t0.b.a()
            if (r13 == 0) goto L_0x00f4
            androidx.appcompat.widget.y1.b(r1, r0)
            goto L_0x0104
        L_0x00f4:
            java.lang.reflect.Field r13 = androidx.appcompat.widget.a2.f505a
            if (r13 == 0) goto L_0x0104
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            r13.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            goto L_0x0104
        L_0x0100:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0104:
            if (r8 == r9) goto L_0x0109
            r16.refreshDrawableState()
        L_0x0109:
            if (r12 == 0) goto L_0x0123
            float r0 = r5.exactCenterX()
            float r5 = r5.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x011b
            r12 = r4
            goto L_0x011c
        L_0x011b:
            r12 = 0
        L_0x011c:
            r13 = 0
            r11.setVisible(r12, r13)
            r0.b.e(r11, r0, r5)
        L_0x0123:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x012e
            if (r8 == r9) goto L_0x012e
            r0.b.e(r0, r7, r6)
        L_0x012e:
            androidx.appcompat.widget.z1 r0 = r1.f520j
            if (r0 == 0) goto L_0x0135
            r5 = 0
            r0.f874e = r5
        L_0x0135:
            r16.refreshDrawableState()
            if (r3 != r4) goto L_0x0141
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
        L_0x0141:
            r0 = r4
            r5 = 0
        L_0x0143:
            if (r0 == 0) goto L_0x0147
            if (r5 == 0) goto L_0x0160
        L_0x0147:
            r3 = 0
            r1.f523m = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r5 = r1.f519i
            int r6 = r16.getFirstVisiblePosition()
            int r5 = r5 - r6
            android.view.View r5 = r1.getChildAt(r5)
            if (r5 == 0) goto L_0x0160
            r5.setPressed(r3)
        L_0x0160:
            if (r0 == 0) goto L_0x0177
            b1.g r3 = r1.f524n
            if (r3 != 0) goto L_0x016d
            b1.g r3 = new b1.g
            r3.<init>(r1)
            r1.f524n = r3
        L_0x016d:
            b1.g r3 = r1.f524n
            boolean r5 = r3.f1511s
            r3.f1511s = r4
            r3.d(r1, r2)
            goto L_0x0185
        L_0x0177:
            b1.g r2 = r1.f524n
            if (r2 == 0) goto L_0x0185
            boolean r3 = r2.f1511s
            if (r3 == 0) goto L_0x0182
            r2.e()
        L_0x0182:
            r3 = 0
            r2.f1511s = r3
        L_0x0185:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b2.b(android.view.MotionEvent, int):boolean");
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f514d;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.f525o == null) {
            super.drawableStateChanged();
            z1 z1Var = this.f520j;
            if (z1Var != null) {
                z1Var.f874e = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.f523m && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public final boolean hasFocus() {
        return this.f522l || super.hasFocus();
    }

    public final boolean hasWindowFocus() {
        return this.f522l || super.hasWindowFocus();
    }

    public final boolean isFocused() {
        return this.f522l || super.isFocused();
    }

    public final boolean isInTouchMode() {
        return (this.f522l && this.f521k) || super.isInTouchMode();
    }

    public final void onDetachedFromWindow() {
        this.f525o = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i3 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f525o == null) {
            i iVar = new i(2, this);
            this.f525o = iVar;
            post(iVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i3 < 30 || !x1.f848d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            x1.f845a.invoke(this, new Object[]{Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1});
                            x1.f846b.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                            x1.f847c.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                        } catch (IllegalAccessException | InvocationTargetException e6) {
                            e6.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f523m && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f519i = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        i iVar = this.f525o;
        if (iVar != null) {
            b2 b2Var = (b2) iVar.f293e;
            b2Var.f525o = null;
            b2Var.removeCallbacks(iVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z5) {
        this.f521k = z5;
    }

    public void setSelector(Drawable drawable) {
        z1 z1Var = drawable != null ? new z1(drawable) : null;
        this.f520j = z1Var;
        super.setSelector(z1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f515e = rect.left;
        this.f516f = rect.top;
        this.f517g = rect.right;
        this.f518h = rect.bottom;
    }
}
