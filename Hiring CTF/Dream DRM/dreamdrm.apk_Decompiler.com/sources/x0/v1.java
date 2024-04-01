package x0;

import android.view.WindowInsets;

public abstract /* synthetic */ class v1 {
    public static /* synthetic */ WindowInsets.Builder b() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder c(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void g() {
        /*
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.v1.g():void");
    }
}
