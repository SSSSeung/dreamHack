package y0;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final h f5783e = new h(16);

    /* renamed from: f  reason: collision with root package name */
    public static final h f5784f = new h(4096);

    /* renamed from: g  reason: collision with root package name */
    public static final h f5785g = new h(8192);

    /* renamed from: h  reason: collision with root package name */
    public static final h f5786h = new h(262144);

    /* renamed from: i  reason: collision with root package name */
    public static final h f5787i = new h(524288);

    /* renamed from: j  reason: collision with root package name */
    public static final h f5788j = new h(1048576);

    /* renamed from: k  reason: collision with root package name */
    public static final h f5789k = new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (String) null, (b0) null, (Class) null);

    /* renamed from: l  reason: collision with root package name */
    public static final h f5790l = new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (String) null, (b0) null, (Class) null);

    /* renamed from: a  reason: collision with root package name */
    public final Object f5791a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5792b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f5793c;

    /* renamed from: d  reason: collision with root package name */
    public final b0 f5794d;

    static {
        new h(1);
        new h(2);
        new h(4);
        new h(8);
        new h(32);
        new h(64);
        new h(128);
        Class<u> cls = u.class;
        new h(256, cls);
        new h(512, cls);
        Class<v> cls2 = v.class;
        new h(1024, cls2);
        new h(2048, cls2);
        new h(16384);
        new h(32768);
        new h(65536);
        new h(131072, z.class);
        new h(2097152, a0.class);
        int i3 = Build.VERSION.SDK_INT;
        new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (String) null, (b0) null, (Class) null);
        new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (String) null, (b0) null, x.class);
        new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (String) null, (b0) null, (Class) null);
        new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (String) null, (b0) null, (Class) null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        new h(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (String) null, (b0) null, (Class) null);
        new h(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (String) null, (b0) null, (Class) null);
        new h(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (String) null, (b0) null, (Class) null);
        new h(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (String) null, (b0) null, (Class) null);
        new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (String) null, (b0) null, (Class) null);
        new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (String) null, (b0) null, y.class);
        new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, (String) null, (b0) null, w.class);
        new h(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (String) null, (b0) null, (Class) null);
        new h(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (String) null, (b0) null, (Class) null);
        new h(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (String) null, (b0) null, (Class) null);
        new h(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (String) null, (b0) null, (Class) null);
        new h(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (String) null, (b0) null, (Class) null);
        new h(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (String) null, (b0) null, (Class) null);
        new h(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (String) null, (b0) null, (Class) null);
        new h(i3 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, (String) null, (b0) null, (Class) null);
        if (i3 >= 34) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }
        new h(accessibilityAction, 16908382, (String) null, (b0) null, (Class) null);
    }

    public h(int i3) {
        this((Object) null, i3, (String) null, (b0) null, (Class) null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f5791a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        Object obj2 = ((h) obj).f5791a;
        Object obj3 = this.f5791a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f5791a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d6 = o.d(this.f5792b);
        if (d6.equals("ACTION_UNKNOWN")) {
            Object obj = this.f5791a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d6 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d6);
        return sb.toString();
    }

    public h(int i3, Class cls) {
        this((Object) null, i3, (String) null, (b0) null, cls);
    }

    public h(Object obj, int i3, String str, b0 b0Var, Class cls) {
        this.f5792b = i3;
        this.f5794d = b0Var;
        this.f5791a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i3, str) : obj;
        this.f5793c = cls;
    }
}
