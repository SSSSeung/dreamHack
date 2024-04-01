package s3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import q0.a;
import r0.b;
import x0.d0;
import x0.u0;

public final class s extends ArrayAdapter {

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f5046d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f5047e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t f5048f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context, int i3, String[] strArr) {
        super(context, i3, strArr);
        this.f5048f = tVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        t tVar = this.f5048f;
        ColorStateList colorStateList2 = tVar.f5056o;
        ColorStateList colorStateList3 = null;
        if (!(colorStateList2 != null)) {
            colorStateList = null;
        } else {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.f5047e = colorStateList;
        if (tVar.f5055n != 0) {
            if (tVar.f5056o != null) {
                int[] iArr2 = {16843623, -16842919};
                int[] iArr3 = {16842913, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{a.b(tVar.f5056o.getColorForState(iArr3, 0), tVar.f5055n), a.b(tVar.f5056o.getColorForState(iArr2, 0), tVar.f5055n), tVar.f5055n});
            }
        }
        this.f5046d = colorStateList3;
    }

    public final View getView(int i3, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i3, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            t tVar = this.f5048f;
            RippleDrawable rippleDrawable = null;
            if (tVar.getText().toString().contentEquals(textView.getText())) {
                if (tVar.f5055n != 0) {
                    ColorDrawable colorDrawable = new ColorDrawable(tVar.f5055n);
                    if (this.f5047e != null) {
                        b.h(colorDrawable, this.f5046d);
                        rippleDrawable = new RippleDrawable(this.f5047e, colorDrawable, (Drawable) null);
                    } else {
                        rippleDrawable = colorDrawable;
                    }
                }
            }
            WeakHashMap weakHashMap = u0.f5622a;
            d0.q(textView, rippleDrawable);
        }
        return view2;
    }
}
