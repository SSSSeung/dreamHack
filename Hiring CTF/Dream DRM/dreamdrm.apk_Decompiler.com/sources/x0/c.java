package x0;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import e.n0;
import y0.o;

public class c {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f5548c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f5549a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5550b;

    public c() {
        this(f5548c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5549a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public n0 b(View view) {
        AccessibilityNodeProvider a6 = b.a(this.f5549a, view);
        if (a6 != null) {
            return new n0(15, (Object) a6);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f5549a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, o oVar) {
        this.f5549a.onInitializeAccessibilityNodeInfo(view, oVar.f5796a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f5549a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5549a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(android.view.View r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            r0 = 2131231125(0x7f080195, float:1.8078322E38)
            java.lang.Object r0 = r7.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x000f
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x000f:
            r1 = 0
            r2 = r1
        L_0x0011:
            int r3 = r0.size()
            r4 = 0
            if (r2 >= r3) goto L_0x0055
            java.lang.Object r3 = r0.get(r2)
            y0.h r3 = (y0.h) r3
            int r5 = r3.a()
            if (r5 != r8) goto L_0x0052
            y0.b0 r0 = r3.f5794d
            if (r0 == 0) goto L_0x0055
            java.lang.Class r2 = r3.f5793c
            if (r2 != 0) goto L_0x002d
            goto L_0x004d
        L_0x002d:
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x003d }
            java.lang.reflect.Constructor r3 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x003d }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x003d }
            java.lang.Object r3 = r3.newInstance(r5)     // Catch:{ Exception -> 0x003d }
            a2.m.o(r3)     // Catch:{ Exception -> 0x003d }
            throw r4     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            r3 = move-exception
            java.lang.String r2 = r2.getName()
            java.lang.String r5 = "Failed to execute command with argument class ViewCommandArgument: "
            java.lang.String r2 = r5.concat(r2)
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r2, r3)
        L_0x004d:
            boolean r0 = r0.b(r7)
            goto L_0x0056
        L_0x0052:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0055:
            r0 = r1
        L_0x0056:
            if (r0 != 0) goto L_0x005e
            android.view.View$AccessibilityDelegate r0 = r6.f5549a
            boolean r0 = x0.b.b(r0, r7, r8, r9)
        L_0x005e:
            if (r0 != 0) goto L_0x00c1
            r2 = 2131230735(0x7f08000f, float:1.8077531E38)
            if (r8 != r2) goto L_0x00c1
            if (r9 == 0) goto L_0x00c1
            java.lang.String r8 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r0 = -1
            int r8 = r9.getInt(r8, r0)
            r9 = 2131231126(0x7f080196, float:1.8078324E38)
            java.lang.Object r9 = r7.getTag(r9)
            android.util.SparseArray r9 = (android.util.SparseArray) r9
            if (r9 == 0) goto L_0x00c0
            java.lang.Object r8 = r9.get(r8)
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8
            if (r8 == 0) goto L_0x00c0
            java.lang.Object r8 = r8.get()
            android.text.style.ClickableSpan r8 = (android.text.style.ClickableSpan) r8
            r9 = 1
            if (r8 == 0) goto L_0x00b9
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.createAccessibilityNodeInfo()
            java.lang.CharSequence r0 = r0.getText()
            boolean r2 = r0 instanceof android.text.Spanned
            if (r2 == 0) goto L_0x00a6
            r2 = r0
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r0 = r0.length()
            java.lang.Class<android.text.style.ClickableSpan> r3 = android.text.style.ClickableSpan.class
            java.lang.Object[] r0 = r2.getSpans(r1, r0, r3)
            r4 = r0
            android.text.style.ClickableSpan[] r4 = (android.text.style.ClickableSpan[]) r4
        L_0x00a6:
            r0 = r1
        L_0x00a7:
            if (r4 == 0) goto L_0x00b9
            int r2 = r4.length
            if (r0 >= r2) goto L_0x00b9
            r2 = r4[r0]
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x00b6
            r0 = r9
            goto L_0x00ba
        L_0x00b6:
            int r0 = r0 + 1
            goto L_0x00a7
        L_0x00b9:
            r0 = r1
        L_0x00ba:
            if (r0 == 0) goto L_0x00c0
            r8.onClick(r7)
            r1 = r9
        L_0x00c0:
            r0 = r1
        L_0x00c1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.c.g(android.view.View, int, android.os.Bundle):boolean");
    }

    public void h(View view, int i3) {
        this.f5549a.sendAccessibilityEvent(view, i3);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f5549a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public c(View.AccessibilityDelegate accessibilityDelegate) {
        this.f5549a = accessibilityDelegate;
        this.f5550b = new a(this);
    }
}
