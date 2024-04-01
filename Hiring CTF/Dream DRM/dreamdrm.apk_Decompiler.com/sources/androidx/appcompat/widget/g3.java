package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView;

public final class g3 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f610a;

    public g3(SearchView searchView) {
        this.f610a = searchView;
    }

    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        this.f610a.s();
        return true;
    }
}
