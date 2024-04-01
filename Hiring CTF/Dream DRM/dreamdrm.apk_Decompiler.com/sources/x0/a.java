package x0;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.theori.dreamdrm.R;
import e.n0;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import y0.h;
import y0.i;
import y0.j;
import y0.o;

public final class a extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final c f5535a;

    public a(c cVar) {
        this.f5535a = cVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5535a.a(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        n0 b6 = this.f5535a.b(view);
        if (b6 != null) {
            return (AccessibilityNodeProvider) b6.f2403e;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f5535a.c(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        o oVar = new o(accessibilityNodeInfo);
        WeakHashMap weakHashMap = u0.f5622a;
        Boolean bool = (Boolean) new z(R.id.tag_screen_reader_focusable, 0).b(view);
        boolean z5 = true;
        boolean z6 = bool != null && bool.booleanValue();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z6);
        } else {
            Bundle c6 = i.c(accessibilityNodeInfo);
            if (c6 != null) {
                c6.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z6 | (c6.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & true) ? 1 : 0);
            }
        }
        Boolean bool2 = (Boolean) new z(R.id.tag_accessibility_heading, 3).b(view);
        if (bool2 == null || !bool2.booleanValue()) {
            z5 = false;
        }
        if (i3 >= 28) {
            accessibilityNodeInfo.setHeading(z5);
        } else {
            Bundle c7 = i.c(accessibilityNodeInfo);
            if (c7 != null) {
                c7.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z5 ? 2 : 0) | (c7.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & -3));
            }
        }
        CharSequence d6 = u0.d(view);
        if (i3 >= 28) {
            accessibilityNodeInfo.setPaneTitle(d6);
        } else {
            i.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d6);
        }
        CharSequence charSequence = (CharSequence) new z(R.id.tag_state_description, 64, 30, 2).b(view);
        if (i3 >= 30) {
            j.c(accessibilityNodeInfo, charSequence);
        } else {
            i.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f5535a.d(view, oVar);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            oVar.b((h) list.get(i6));
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f5535a.e(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5535a.f(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i3, Bundle bundle) {
        return this.f5535a.g(view, i3, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i3) {
        this.f5535a.h(view, i3);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f5535a.i(view, accessibilityEvent);
    }
}
