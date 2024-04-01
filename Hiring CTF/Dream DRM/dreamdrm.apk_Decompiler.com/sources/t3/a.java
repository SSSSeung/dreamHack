package t3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.i1;
import b1.o;
import b1.v;
import com.theori.dreamdrm.R;

public final class a extends i1 {
    public a(Context context, AttributeSet attributeSet) {
        super(o.c0(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        boolean z5 = true;
        if (v.M(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = y2.a.f5836q;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int m6 = m(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(m6 == -1 ? false : z5)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    l(resourceId, theme);
                }
            }
        }
    }

    public static int m(Context context, TypedArray typedArray, int... iArr) {
        int i3 = -1;
        for (int i6 = 0; i6 < iArr.length && i3 < 0; i6++) {
            int i7 = iArr[i6];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i7, typedValue) || typedValue.type != 2) {
                i3 = typedArray.getDimensionPixelSize(i7, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i3 = dimensionPixelSize;
            }
        }
        return i3;
    }

    public final void l(int i3, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i3, y2.a.f5835p);
        int m6 = m(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (m6 >= 0) {
            setLineHeight(m6);
        }
    }

    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        if (v.M(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            l(i3, context.getTheme());
        }
    }
}
