package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import k3.j;

public final class a extends j {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f2089d;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f2089d = chipTextInputComboView;
    }

    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f2089d;
        if (isEmpty) {
            chipTextInputComboView.f2069d.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a6 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f2069d;
        if (TextUtils.isEmpty(a6)) {
            a6 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a6);
    }
}
