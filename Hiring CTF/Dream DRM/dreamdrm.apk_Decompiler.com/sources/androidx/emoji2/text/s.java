package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import androidx.compose.ui.platform.e;
import g.h;
import g1.a;
import java.nio.ByteBuffer;
import q0.d;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final e f1038a;

    /* renamed from: b  reason: collision with root package name */
    public final h f1039b;

    /* renamed from: c  reason: collision with root package name */
    public final i f1040c;

    public s(h hVar, e eVar, e eVar2) {
        this.f1038a = eVar;
        this.f1039b = hVar;
        this.f1040c = eVar2;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z5) {
        z[] zVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (zVarArr = (z[]) editable.getSpans(selectionStart, selectionEnd, z.class)) != null && zVarArr.length > 0) {
            int length = zVarArr.length;
            int i3 = 0;
            while (i3 < length) {
                z zVar = zVarArr[i3];
                int spanStart = editable.getSpanStart(zVar);
                int spanEnd = editable.getSpanEnd(zVar);
                if ((!z5 || spanStart != selectionStart) && ((z5 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i3++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i3, int i6, q qVar) {
        if (qVar.f1031c == 0) {
            i iVar = this.f1040c;
            a c6 = qVar.c();
            int a6 = c6.a(8);
            if (a6 != 0) {
                ((ByteBuffer) c6.f2843d).getShort(a6 + c6.f2840a);
            }
            e eVar = (e) iVar;
            eVar.getClass();
            ThreadLocal threadLocal = e.f1003b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i3 < i6) {
                sb.append(charSequence.charAt(i3));
                i3++;
            }
            TextPaint textPaint = eVar.f1004a;
            String sb2 = sb.toString();
            int i7 = q0.e.f4873a;
            qVar.f1031c = d.a(textPaint, sb2) ? 2 : 1;
        }
        return qVar.f1031c == 2;
    }
}
