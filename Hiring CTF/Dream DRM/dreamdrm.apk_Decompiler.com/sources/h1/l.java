package h1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

public final class l implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public final TransformationMethod f3379a;

    public l(TransformationMethod transformationMethod) {
        this.f3379a = transformationMethod;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f3379a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || androidx.emoji2.text.l.a().b() != 1) {
            return charSequence;
        }
        androidx.emoji2.text.l a6 = androidx.emoji2.text.l.a();
        a6.getClass();
        return a6.f(0, charSequence.length(), charSequence);
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z5, int i3, Rect rect) {
        TransformationMethod transformationMethod = this.f3379a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z5, i3, rect);
        }
    }
}
