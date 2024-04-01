package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

public final class p3 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f719d;

    public p3(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f719d = searchAutoComplete;
    }

    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f719d;
        if (searchAutoComplete.f471j) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f471j = false;
        }
    }
}
