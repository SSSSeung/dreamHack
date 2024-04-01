package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import b1.o;
import com.theori.dreamdrm.R;
import j0.i;
import j0.j;
import j0.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n0.b;
import x0.u0;
import y2.a;

class ClockFaceView extends f implements d {
    public final SparseArray A;
    public final c B;
    public final int[] C;
    public final float[] D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public String[] I;
    public float J;
    public final ColorStateList K;
    public final ClockHandView w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f2071x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    public final RectF f2072y = new RectF();

    /* renamed from: z  reason: collision with root package name */
    public final Rect f2073z = new Rect();

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SparseArray sparseArray = new SparseArray();
        this.A = sparseArray;
        this.D = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f5822c, R.attr.materialClockStyle, 2131756118);
        Resources resources = getResources();
        ColorStateList u3 = o.u(context, obtainStyledAttributes, 1);
        this.K = u3;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.w = clockHandView;
        this.E = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = u3.getColorForState(new int[]{16842913}, u3.getDefaultColor());
        this.C = new int[]{colorForState, colorForState, u3.getDefaultColor()};
        clockHandView.f2076f.add(this);
        int defaultColor = b.a(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList u5 = o.u(context, obtainStyledAttributes, 0);
        setBackgroundColor(u5 != null ? u5.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.B = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.I = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z5 = false;
        for (int i3 = 0; i3 < Math.max(this.I.length, size); i3++) {
            TextView textView = (TextView) sparseArray.get(i3);
            if (i3 >= this.I.length) {
                removeView(textView);
                sparseArray.remove(i3);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, this, false);
                    sparseArray.put(i3, textView);
                    addView(textView);
                }
                textView.setText(this.I[i3]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i3));
                int i6 = (i3 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i6));
                z5 = i6 > 1 ? true : z5;
                u0.l(textView, this.B);
                textView.setTextColor(this.K);
            }
        }
        ClockHandView clockHandView2 = this.w;
        if (clockHandView2.f2075e && !z5) {
            clockHandView2.f2086p = 1;
        }
        clockHandView2.f2075e = z5;
        clockHandView2.invalidate();
        this.F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.G = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.H = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public final void f() {
        n nVar = new n();
        nVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i6 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i6 == null) {
                    i6 = 1;
                }
                if (!hashMap.containsKey(i6)) {
                    hashMap.put(i6, new ArrayList());
                }
                ((List) hashMap.get(i6)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(((float) this.f2094u) * 0.66f) : this.f2094u;
            float f6 = 0.0f;
            for (View id : list) {
                int id2 = id.getId();
                HashMap hashMap2 = nVar.f3776c;
                if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                    hashMap2.put(Integer.valueOf(id2), new i());
                }
                j jVar = ((i) hashMap2.get(Integer.valueOf(id2))).f3713d;
                jVar.w = R.id.circle_center;
                jVar.f3747x = round;
                jVar.f3748y = f6;
                f6 += 360.0f / ((float) list.size());
            }
        }
        nVar.a(this);
        setConstraintSet((n) null);
        requestLayout();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.A;
            if (i7 < sparseArray.size()) {
                ((TextView) sparseArray.get(i7)).setVisibility(0);
                i7++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.w.f2080j;
        float f6 = Float.MAX_VALUE;
        TextView textView = null;
        int i3 = 0;
        while (true) {
            sparseArray = this.A;
            int size = sparseArray.size();
            rectF = this.f2072y;
            rect = this.f2071x;
            if (i3 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i3);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f6) {
                    textView = textView2;
                    f6 = height;
                }
            }
            i3++;
        }
        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
            TextView textView3 = (TextView) sparseArray.get(i6);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f2073z;
                textView3.getLineBounds(0, rect2);
                rectF.inset((float) rect2.left, (float) rect2.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.C, this.D, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.I.length, false, 1));
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        super.onLayout(z5, i3, i6, i7, i8);
        g();
    }

    public final void onMeasure(int i3, int i6) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.H) / Math.max(Math.max(((float) this.F) / ((float) displayMetrics.heightPixels), ((float) this.G) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
