package androidx.appcompat.widget;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public final class r0 implements ListAdapter, SpinnerAdapter {

    /* renamed from: d  reason: collision with root package name */
    public final SpinnerAdapter f754d;

    /* renamed from: e  reason: collision with root package name */
    public final ListAdapter f755e;

    public r0(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        this.f754d = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f755e = (ListAdapter) spinnerAdapter;
        }
        if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
            p0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }
    }

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f755e;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f754d;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    public final View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f754d;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i3, view, viewGroup);
    }

    public final Object getItem(int i3) {
        SpinnerAdapter spinnerAdapter = this.f754d;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i3);
    }

    public final long getItemId(int i3) {
        SpinnerAdapter spinnerAdapter = this.f754d;
        if (spinnerAdapter == null) {
            return -1;
        }
        return spinnerAdapter.getItemId(i3);
    }

    public final int getItemViewType(int i3) {
        return 0;
    }

    public final View getView(int i3, View view, ViewGroup viewGroup) {
        return getDropDownView(i3, view, viewGroup);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f754d;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }

    public final boolean isEnabled(int i3) {
        ListAdapter listAdapter = this.f755e;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i3);
        }
        return true;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f754d;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f754d;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
