package a2;

import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.l0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.internal.l;
import x4.a;
import x4.b;

public abstract /* synthetic */ class m {
    public static final void a(int i3, View view) {
        int i6;
        if (i3 != 0) {
            int i7 = i3 - 1;
            if (i7 != 0) {
                if (i7 == 1) {
                    if (l0.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i6 = 0;
                } else if (i7 == 2) {
                    if (l0.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i6 = 8;
                } else if (i7 == 3) {
                    if (l0.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    i6 = 4;
                } else {
                    return;
                }
                view.setVisibility(i6);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (l0.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        throw null;
    }

    public static int b(int i3) {
        if (i3 == 0) {
            return 2;
        }
        if (i3 == 4) {
            return 4;
        }
        if (i3 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(g("Unknown visibility ", i3));
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static /* synthetic */ boolean d(int i3) {
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            return false;
        }
        if (i3 == 4 || i3 == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ long e(int i3) {
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 3) {
            return 2;
        }
        if (i3 == 4) {
            return 3;
        }
        if (i3 == 5) {
            return 4;
        }
        throw null;
    }

    public static String f(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.B());
        return sb.toString();
    }

    public static String g(String str, int i3) {
        return str + i3;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder k(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ Iterator l() {
        try {
            return Arrays.asList(new l[]{new a()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
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
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.m.m():void");
    }

    public static /* synthetic */ void n(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void o(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ Iterator p() {
        try {
            return Arrays.asList(new w4.m[]{new b()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void q() {
        /*
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = new android.view.accessibility.AccessibilityNodeInfo$RangeInfo
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.m.q():void");
    }

    public static /* synthetic */ void r(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ String s(int i3) {
        return i3 == 1 ? "INITIALIZE" : i3 == 2 ? "SWITCH_TO_SOURCE_SERVICE" : i3 == 3 ? "DECODE_DATA" : "null";
    }

    public static /* synthetic */ String t(int i3) {
        return i3 == 1 ? "INITIALIZE" : i3 == 2 ? "RESOURCE_CACHE" : i3 == 3 ? "DATA_CACHE" : i3 == 4 ? "SOURCE" : i3 == 5 ? "ENCODE" : i3 == 6 ? "FINISHED" : "null";
    }

    public static /* synthetic */ String u(int i3) {
        return i3 == 1 ? "NONE" : i3 == 2 ? "ADDING" : i3 == 3 ? "REMOVING" : "null";
    }

    public static /* synthetic */ String v(int i3) {
        return i3 == 1 ? "REMOVED" : i3 == 2 ? "VISIBLE" : i3 == 3 ? "GONE" : i3 == 4 ? "INVISIBLE" : "null";
    }

    public static /* synthetic */ String w(int i3) {
        return i3 == 1 ? "BEGIN_ARRAY" : i3 == 2 ? "END_ARRAY" : i3 == 3 ? "BEGIN_OBJECT" : i3 == 4 ? "END_OBJECT" : i3 == 5 ? "NAME" : i3 == 6 ? "STRING" : i3 == 7 ? "NUMBER" : i3 == 8 ? "BOOLEAN" : i3 == 9 ? "NULL" : i3 == 10 ? "END_DOCUMENT" : "null";
    }

    public static /* synthetic */ String x(int i3) {
        return i3 == 1 ? "UNKNOWN" : i3 == 2 ? "HORIZONTAL_DIMENSION" : i3 == 3 ? "VERTICAL_DIMENSION" : i3 == 4 ? "LEFT" : i3 == 5 ? "RIGHT" : i3 == 6 ? "TOP" : i3 == 7 ? "BOTTOM" : i3 == 8 ? "BASELINE" : "null";
    }

    public static /* synthetic */ String y(int i3) {
        return i3 == 1 ? "SOURCE" : i3 == 2 ? "TRANSFORMED" : i3 == 3 ? "NONE" : "null";
    }
}
