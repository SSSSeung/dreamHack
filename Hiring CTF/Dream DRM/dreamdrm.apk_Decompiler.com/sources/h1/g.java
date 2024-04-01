package h1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.platform.e;
import androidx.emoji2.text.l;
import androidx.emoji2.text.s;

public final class g implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f3368a;

    /* renamed from: b  reason: collision with root package name */
    public final e f3369b;

    public g(KeyListener keyListener) {
        e eVar = new e(26);
        this.f3368a = keyListener;
        this.f3369b = eVar;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i3) {
        this.f3368a.clearMetaKeyState(view, editable, i3);
    }

    public final int getInputType() {
        return this.f3368a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i3, KeyEvent keyEvent) {
        boolean z5;
        this.f3369b.getClass();
        Object obj = l.f1011i;
        if (i3 != 67 ? i3 != 112 ? false : s.a(editable, keyEvent, true) : s.a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z5 = true;
        } else {
            z5 = false;
        }
        return z5 || this.f3368a.onKeyDown(view, editable, i3, keyEvent);
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f3368a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i3, KeyEvent keyEvent) {
        return this.f3368a.onKeyUp(view, editable, i3, keyEvent);
    }
}
