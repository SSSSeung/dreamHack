package s3;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f4988a;

    public m(n nVar) {
        this.f4988a = nVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        n nVar = this.f4988a;
        if (nVar.f5008v != textInputLayout.getEditText()) {
            EditText editText = nVar.f5008v;
            l lVar = nVar.f5010y;
            if (editText != null) {
                editText.removeTextChangedListener(lVar);
                if (nVar.f5008v.getOnFocusChangeListener() == nVar.b().e()) {
                    nVar.f5008v.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            nVar.f5008v = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(lVar);
            }
            nVar.b().m(nVar.f5008v);
            nVar.j(nVar.b());
        }
    }
}
