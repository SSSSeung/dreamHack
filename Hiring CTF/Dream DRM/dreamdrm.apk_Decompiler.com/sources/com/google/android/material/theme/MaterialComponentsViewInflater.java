package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.q;
import androidx.appcompat.widget.s;
import com.google.android.material.button.MaterialButton;
import e.h0;
import f3.c;
import l3.a;
import s3.t;

public class MaterialComponentsViewInflater extends h0 {
    public final q a(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    public final s b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final androidx.appcompat.widget.t c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public final i0 d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    public final i1 e(Context context, AttributeSet attributeSet) {
        return new t3.a(context, attributeSet);
    }
}
