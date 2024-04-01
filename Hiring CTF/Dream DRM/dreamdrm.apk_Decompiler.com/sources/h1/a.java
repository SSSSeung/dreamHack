package h1;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.compose.ui.platform.e;
import androidx.emoji2.text.l;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import w4.p;

public final class a extends e {

    /* renamed from: o  reason: collision with root package name */
    public final EditText f3354o;

    /* renamed from: p  reason: collision with root package name */
    public final k f3355p;

    public a(EditText editText) {
        super(24);
        this.f3354o = editText;
        k kVar = new k(editText);
        this.f3355p = kVar;
        editText.addTextChangedListener(kVar);
        if (c.f3360b == null) {
            synchronized (c.f3359a) {
                if (c.f3360b == null) {
                    c.f3360b = new c();
                }
            }
        }
        editText.setEditableFactory(c.f3360b);
    }

    public final void A(boolean z5) {
        k kVar = this.f3355p;
        if (kVar.f3378g != z5) {
            if (kVar.f3377f != null) {
                l a6 = l.a();
                j jVar = kVar.f3377f;
                a6.getClass();
                p.f(jVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a6.f1013a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a6.f1014b.remove(jVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            kVar.f3378g = z5;
            if (z5) {
                k.a(kVar.f3375d, l.a().b());
            }
        }
    }

    public final KeyListener q(KeyListener keyListener) {
        if (keyListener instanceof g) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new g(keyListener);
    }

    public final InputConnection w(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof d ? inputConnection : new d(this.f3354o, inputConnection, editorInfo);
    }
}
