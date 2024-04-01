package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import s3.d;
import s3.k;
import s3.u;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1946d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1947e;

    public /* synthetic */ m(int i3, Object obj) {
        this.f1946d = i3;
        this.f1947e = obj;
    }

    public final void onClick(View view) {
        EditText editText;
        int i3 = this.f1946d;
        PasswordTransformationMethod passwordTransformationMethod = null;
        Object obj = this.f1947e;
        switch (i3) {
            case 0:
                int i6 = n.E0;
                ((n) obj).K();
                throw null;
            case 1:
                d dVar = (d) obj;
                EditText editText2 = dVar.f4964i;
                if (editText2 != null) {
                    Editable text = editText2.getText();
                    if (text != null) {
                        text.clear();
                    }
                    dVar.q();
                    return;
                }
                return;
            case 2:
                ((k) obj).u();
                return;
            default:
                u uVar = (u) obj;
                EditText editText3 = uVar.f5058f;
                if (editText3 != null) {
                    int selectionEnd = editText3.getSelectionEnd();
                    EditText editText4 = uVar.f5058f;
                    if (editText4 != null && (editText4.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        editText = uVar.f5058f;
                    } else {
                        editText = uVar.f5058f;
                        passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                    }
                    editText.setTransformationMethod(passwordTransformationMethod);
                    if (selectionEnd >= 0) {
                        uVar.f5058f.setSelection(selectionEnd);
                    }
                    uVar.q();
                    return;
                }
                return;
        }
    }
}
