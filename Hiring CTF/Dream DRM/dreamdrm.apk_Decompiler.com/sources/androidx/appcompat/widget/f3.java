package androidx.appcompat.widget;

import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

public final class f3 implements View.OnKeyListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SearchView f594d;

    public f3(SearchView searchView) {
        this.f594d = searchView;
    }

    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        SearchView searchView = this.f594d;
        if (searchView.f458e0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f462s;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if ((TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i3 != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.l("android.intent.action.SEARCH", (Uri) null, (String) null, searchAutoComplete.getText().toString()));
            return true;
        } else if (searchView.f458e0 == null || searchView.R == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        } else {
            if (i3 == 66 || i3 == 84 || i3 == 61) {
                searchView.p(searchAutoComplete.getListSelection());
            } else if (i3 == 21 || i3 == 22) {
                searchAutoComplete.setSelection(i3 == 21 ? 0 : searchAutoComplete.length());
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.a();
            } else if (i3 != 19) {
                return false;
            } else {
                searchAutoComplete.getListSelection();
                return false;
            }
            return true;
        }
    }
}
