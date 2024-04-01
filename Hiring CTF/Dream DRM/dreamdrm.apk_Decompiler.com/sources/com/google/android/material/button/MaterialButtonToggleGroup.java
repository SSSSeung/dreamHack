package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import b1.o;
import b1.v;
import com.google.android.material.timepicker.h;
import com.theori.dreamdrm.R;
import d3.d;
import e2.f;
import g0.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p3.j;
import p3.k;
import x0.d0;
import x0.e0;
import x0.m;
import x0.u0;
import y2.a;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f1878n = 0;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1879d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final f f1880e = new f(this);

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet f1881f = new LinkedHashSet();

    /* renamed from: g  reason: collision with root package name */
    public final g f1882g = new g(2, this);

    /* renamed from: h  reason: collision with root package name */
    public Integer[] f1883h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1884i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1885j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1886k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1887l;

    /* renamed from: m  reason: collision with root package name */
    public HashSet f1888m = new HashSet();

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(o.c0(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131756058), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray G = v.G(getContext(), attributeSet, a.f5829j, R.attr.materialButtonToggleGroupStyle, 2131756058, new int[0]);
        setSingleSelection(G.getBoolean(3, false));
        this.f1887l = G.getResourceId(1, -1);
        this.f1886k = G.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(G.getBoolean(0, true));
        G.recycle();
        WeakHashMap weakHashMap = u0.f5622a;
        d0.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (d(i3)) {
                return i3;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i3 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if ((getChildAt(i6) instanceof MaterialButton) && d(i6)) {
                i3++;
            }
        }
        return i3;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = u0.f5622a;
            materialButton.setId(e0.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f1880e);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i3 = firstVisibleChildIndex + 1; i3 < getChildCount(); i3++) {
                MaterialButton c6 = c(i3);
                int min = Math.min(c6.getStrokeWidth(), c(i3 - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams = c6.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
                if (getOrientation() == 0) {
                    m.g(layoutParams2, 0);
                    m.h(layoutParams2, -min);
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.bottomMargin = 0;
                    layoutParams2.topMargin = -min;
                    m.h(layoutParams2, 0);
                }
                c6.setLayoutParams(layoutParams2);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                m.g(layoutParams3, 0);
                m.h(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i3, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f1879d.add(new d(shapeAppearanceModel.f4805e, shapeAppearanceModel.f4808h, shapeAppearanceModel.f4806f, shapeAppearanceModel.f4807g));
        materialButton.setEnabled(isEnabled());
        u0.l(materialButton, new a3.a(1, this));
    }

    public final void b(int i3, boolean z5) {
        if (i3 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i3);
            return;
        }
        HashSet hashSet = new HashSet(this.f1888m);
        if (z5 && !hashSet.contains(Integer.valueOf(i3))) {
            if (this.f1885j && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i3));
        } else if (!z5 && hashSet.contains(Integer.valueOf(i3))) {
            if (!this.f1886k || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i3));
            }
        } else {
            return;
        }
        e(hashSet);
    }

    public final MaterialButton c(int i3) {
        return (MaterialButton) getChildAt(i3);
    }

    public final boolean d(int i3) {
        return getChildAt(i3).getVisibility() != 8;
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f1882g);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            treeMap.put(c(i3), Integer.valueOf(i3));
        }
        this.f1883h = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set set) {
        HashSet hashSet = this.f1888m;
        this.f1888m = new HashSet(set);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            int id = c(i3).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f1884i = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f1884i = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f1881f.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i3 = 0; i3 < childCount; i3++) {
            MaterialButton c6 = c(i3);
            if (c6.getVisibility() != 8) {
                k shapeAppearanceModel = c6.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                j jVar = new j(shapeAppearanceModel);
                d dVar2 = (d) this.f1879d.get(i3);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z5 = getOrientation() == 0;
                    p3.a aVar = d.f2175e;
                    if (i3 == firstVisibleChildIndex) {
                        dVar = z5 ? o.F(this) ? new d(aVar, aVar, dVar2.f2177b, dVar2.f2178c) : new d(dVar2.f2176a, dVar2.f2179d, aVar, aVar) : new d(dVar2.f2176a, aVar, dVar2.f2177b, aVar);
                    } else if (i3 == lastVisibleChildIndex) {
                        dVar = z5 ? o.F(this) ? new d(dVar2.f2176a, dVar2.f2179d, aVar, aVar) : new d(aVar, aVar, dVar2.f2177b, dVar2.f2178c) : new d(aVar, dVar2.f2179d, aVar, dVar2.f2178c);
                    } else {
                        dVar2 = null;
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    jVar.f4793e = new p3.a(0.0f);
                    jVar.f4794f = new p3.a(0.0f);
                    jVar.f4795g = new p3.a(0.0f);
                    jVar.f4796h = new p3.a(0.0f);
                } else {
                    jVar.f4793e = dVar2.f2176a;
                    jVar.f4796h = dVar2.f2179d;
                    jVar.f4794f = dVar2.f2177b;
                    jVar.f4795g = dVar2.f2178c;
                }
                c6.setShapeAppearanceModel(new k(jVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f1885j || this.f1888m.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f1888m.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            int id = c(i3).getId();
            if (this.f1888m.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i3, int i6) {
        Integer[] numArr = this.f1883h;
        if (numArr != null && i6 < numArr.length) {
            return numArr[i6].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i6;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i3 = this.f1887l;
        if (i3 != -1) {
            e(Collections.singleton(Integer.valueOf(i3)));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f1885j ? 1 : 2));
    }

    public final void onMeasure(int i3, int i6) {
        f();
        a();
        super.onMeasure(i3, i6);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((d3.a) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f1879d.remove(indexOfChild);
        }
        f();
        a();
    }

    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            c(i3).setEnabled(z5);
        }
    }

    public void setSelectionRequired(boolean z5) {
        this.f1886k = z5;
    }

    public void setSingleSelection(int i3) {
        setSingleSelection(getResources().getBoolean(i3));
    }

    public void setSingleSelection(boolean z5) {
        if (this.f1885j != z5) {
            this.f1885j = z5;
            e(new HashSet());
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            c(i3).setA11yClassName((this.f1885j ? RadioButton.class : ToggleButton.class).getName());
        }
    }
}
