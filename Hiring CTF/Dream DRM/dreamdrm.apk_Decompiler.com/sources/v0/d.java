package v0;

import android.graphics.Rect;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.DisplayCutout;
import android.view.View;
import java.util.List;

public abstract /* synthetic */ class d {
    public static /* synthetic */ PrecomputedText.Params.Builder c(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* synthetic */ DisplayCutout d(Rect rect, List list) {
        return new DisplayCutout(rect, list);
    }

    public static /* bridge */ /* synthetic */ View.OnUnhandledKeyEventListener f(Object obj) {
        return (View.OnUnhandledKeyEventListener) obj;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void l() {
        /*
            android.text.PrecomputedText$Params$Builder r0 = new android.text.PrecomputedText$Params$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.d.l():void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void x() {
        /*
            android.view.DisplayCutout r0 = new android.view.DisplayCutout
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.d.x():void");
    }
}
