package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

public final class e3 implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SearchView f561d;

    public e3(SearchView searchView) {
        this.f561d = searchView;
    }

    public final void onClick(View view) {
        SearchView searchView = this.f561d;
        ImageView imageView = searchView.w;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f462s;
        if (view == imageView) {
            searchView.y(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.O;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
            }
        } else if (view == searchView.f467y) {
            searchView.o();
        } else if (view == searchView.f466x) {
            searchView.s();
        } else if (view == searchView.f468z) {
            SearchableInfo searchableInfo = searchView.f458e0;
            if (searchableInfo != null) {
                try {
                    if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        Intent intent = new Intent(searchView.K);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                        searchView.getContext().startActivity(intent);
                    } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.m(searchView.L, searchableInfo));
                    }
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            }
        } else if (view == searchAutoComplete) {
            searchView.n();
        }
    }
}
