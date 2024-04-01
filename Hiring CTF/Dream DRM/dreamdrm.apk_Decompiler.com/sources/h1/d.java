package h1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.ui.platform.e;
import androidx.emoji2.text.l;

public final class d extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f3362a;

    /* renamed from: b  reason: collision with root package name */
    public final e f3363b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        e eVar = new e(25);
        boolean z5 = false;
        this.f3362a = editText;
        this.f3363b = eVar;
        if (l.f1012j != null) {
            l a6 = l.a();
            if ((a6.b() == 1 ? true : z5) && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                a6.f1017e.I(editorInfo);
            }
        }
    }

    public final boolean deleteSurroundingText(int i3, int i6) {
        Editable editableText = this.f3362a.getEditableText();
        this.f3363b.getClass();
        return e.s(this, editableText, i3, i6, false) || super.deleteSurroundingText(i3, i6);
    }

    public final boolean deleteSurroundingTextInCodePoints(int i3, int i6) {
        Editable editableText = this.f3362a.getEditableText();
        this.f3363b.getClass();
        return e.s(this, editableText, i3, i6, true) || super.deleteSurroundingTextInCodePoints(i3, i6);
    }
}
