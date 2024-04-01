package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.theori.dreamdrm.R;
import java.util.WeakHashMap;
import k3.k;
import x0.e0;
import x0.u0;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: d  reason: collision with root package name */
    public final Chip f2069d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f2070e;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.f2069d = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        EditText editText = textInputLayout.getEditText();
        this.f2070e = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        WeakHashMap weakHashMap = u0.f5622a;
        editText.setId(e0.a());
        e0.h((TextView) findViewById(R.id.material_label), editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final boolean isChecked() {
        return this.f2069d.isChecked();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2070e.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public final void setChecked(boolean z5) {
        Chip chip = this.f2069d;
        chip.setChecked(z5);
        int i3 = 0;
        int i6 = z5 ? 0 : 4;
        EditText editText = this.f2070e;
        editText.setVisibility(i6);
        if (z5) {
            i3 = 8;
        }
        chip.setVisibility(i3);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new k(editText));
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2069d.setOnClickListener(onClickListener);
    }

    public final void setTag(int i3, Object obj) {
        this.f2069d.setTag(i3, obj);
    }

    public final void toggle() {
        this.f2069d.toggle();
    }
}
