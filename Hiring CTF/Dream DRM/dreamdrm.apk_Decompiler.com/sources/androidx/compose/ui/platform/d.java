package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ContentInfo;
import android.widget.EdgeEffect;

public abstract /* synthetic */ class d {
    public static /* synthetic */ ContentInfo.Builder g(ClipData clipData, int i3) {
        return new ContentInfo.Builder(clipData, i3);
    }

    public static /* bridge */ /* synthetic */ ContentInfo j(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ EdgeEffect l(Context context, AttributeSet attributeSet) {
        return new EdgeEffect(context, attributeSet);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void m() {
        /*
            android.view.ContentInfo$Builder r0 = new android.view.ContentInfo$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.d.m():void");
    }
}
