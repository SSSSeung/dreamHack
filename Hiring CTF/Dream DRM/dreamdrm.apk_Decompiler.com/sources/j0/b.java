package j0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import h0.e;
import h0.k;
import java.util.Arrays;
import java.util.HashMap;

public abstract class b extends View {

    /* renamed from: d  reason: collision with root package name */
    public int[] f3650d = new int[32];

    /* renamed from: e  reason: collision with root package name */
    public int f3651e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f3652f;

    /* renamed from: g  reason: collision with root package name */
    public k f3653g;

    /* renamed from: h  reason: collision with root package name */
    public String f3654h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f3655i = new HashMap();

    public b(Context context) {
        super(context);
        this.f3652f = context;
        e((AttributeSet) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x00a7
            int r0 = r6.length()
            if (r0 != 0) goto L_0x000a
            goto L_0x00a7
        L_0x000a:
            android.content.Context r0 = r5.f3652f
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L_0x0021
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L_0x0021:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L_0x0031
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x005b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L_0x004f
            java.util.HashMap r3 = r1.f934p
            if (r3 == 0) goto L_0x004f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x004f
            java.util.HashMap r3 = r1.f934p
            java.lang.Object r3 = r3.get(r6)
            goto L_0x0050
        L_0x004f:
            r3 = r2
        L_0x0050:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x005b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            if (r3 != 0) goto L_0x0064
            if (r1 == 0) goto L_0x0064
            int r3 = r5.d(r1, r6)
        L_0x0064:
            if (r3 != 0) goto L_0x0070
            java.lang.Class<j0.q> r1 = j0.q.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch:{ Exception -> 0x0070 }
            int r3 = r1.getInt(r2)     // Catch:{ Exception -> 0x0070 }
        L_0x0070:
            if (r3 != 0) goto L_0x0080
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L_0x0080:
            if (r3 == 0) goto L_0x008f
            java.util.HashMap r0 = r5.f3655i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.b(r3)
            goto L_0x00a7
        L_0x008f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.b.a(java.lang.String):void");
    }

    public final void b(int i3) {
        if (i3 != getId()) {
            int i6 = this.f3651e + 1;
            int[] iArr = this.f3650d;
            if (i6 > iArr.length) {
                this.f3650d = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f3650d;
            int i7 = this.f3651e;
            iArr2[i7] = i3;
            this.f3651e = i7 + 1;
        }
    }

    public final void c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i3 = 0; i3 < this.f3651e; i3++) {
                View view = (View) constraintLayout.f922d.get(this.f3650d[i3]);
                if (view != null) {
                    view.setVisibility(visibility);
                    if (elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f3652f.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = constraintLayout.getChildAt(i3);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f3778b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3654h = string;
                    setIds(string);
                }
            }
        }
    }

    public abstract void f(e eVar, boolean z5);

    public final void g() {
        if (this.f3653g != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof d) {
                ((d) layoutParams).f3677k0 = this.f3653g;
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3650d, this.f3651e);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f3654h;
        if (str != null) {
            setIds(str);
        }
    }

    public final void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i3, int i6) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f3654h = str;
        if (str != null) {
            int i3 = 0;
            this.f3651e = 0;
            while (true) {
                int indexOf = str.indexOf(44, i3);
                if (indexOf == -1) {
                    a(str.substring(i3));
                    return;
                } else {
                    a(str.substring(i3, indexOf));
                    i3 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3654h = null;
        this.f3651e = 0;
        for (int b6 : iArr) {
            b(b6);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3652f = context;
        e(attributeSet);
    }
}
