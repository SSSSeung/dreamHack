package androidx.activity;

import android.app.LocaleManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

public abstract /* synthetic */ class j {
    public static /* bridge */ /* synthetic */ LocaleManager b(Object obj) {
        return (LocaleManager) obj;
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo.Builder g() {
        return new AccessibilityNodeInfo.CollectionItemInfo.Builder();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback n(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher q(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void t() {
        /*
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo$Builder r0 = new android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.j.t():void");
    }
}
