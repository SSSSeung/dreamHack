package l3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.i0;
import b1.b;
import b1.o;
import b1.v;
import com.theori.dreamdrm.R;

public final class a extends i0 {

    /* renamed from: j  reason: collision with root package name */
    public static final int[][] f4107j = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f4108h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4109i;

    public a(Context context, AttributeSet attributeSet) {
        super(o.c0(context, attributeSet, R.attr.radioButtonStyle, 2131756051), attributeSet);
        Context context2 = getContext();
        TypedArray G = v.G(context2, attributeSet, y2.a.f5833n, R.attr.radioButtonStyle, 2131756051, new int[0]);
        if (G.hasValue(0)) {
            b.c(this, o.u(context2, G, 0));
        }
        this.f4109i = G.getBoolean(1, false);
        G.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4108h == null) {
            int u3 = v.u(this, R.attr.colorControlActivated);
            int u5 = v.u(this, R.attr.colorOnSurface);
            int u6 = v.u(this, R.attr.colorSurface);
            this.f4108h = new ColorStateList(f4107j, new int[]{v.C(u6, u3, 1.0f), v.C(u6, u5, 0.54f), v.C(u6, u5, 0.38f), v.C(u6, u5, 0.38f)});
        }
        return this.f4108h;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4109i && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z5) {
        this.f4109i = z5;
        b.c(this, z5 ? getMaterialThemeColorsTintList() : null);
    }
}
