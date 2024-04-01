package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputLayout;

public final class a3 implements TextWatcher {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f506d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f507e;

    public /* synthetic */ a3(ViewGroup viewGroup, int i3) {
        this.f506d = i3;
        this.f507e = viewGroup;
    }

    public final void afterTextChanged(Editable editable) {
        switch (this.f506d) {
            case 0:
                return;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) this.f507e;
                textInputLayout.t(!textInputLayout.C0, false);
                if (textInputLayout.f2044n) {
                    textInputLayout.m(editable);
                }
                if (textInputLayout.f2060v) {
                    textInputLayout.u(editable);
                    return;
                }
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i3, int i6, int i7) {
    }

    public final void onTextChanged(CharSequence charSequence, int i3, int i6, int i7) {
        switch (this.f506d) {
            case 0:
                SearchView searchView = (SearchView) this.f507e;
                Editable text = searchView.f462s.getText();
                searchView.f455b0 = text;
                boolean z5 = !TextUtils.isEmpty(text);
                searchView.x(z5);
                boolean z6 = !z5;
                int i8 = 8;
                if (searchView.f454a0 && !searchView.Q && z6) {
                    searchView.f466x.setVisibility(8);
                    i8 = 0;
                }
                searchView.f468z.setVisibility(i8);
                searchView.t();
                searchView.w();
                charSequence.toString();
                searchView.getClass();
                return;
            default:
                return;
        }
    }
}
