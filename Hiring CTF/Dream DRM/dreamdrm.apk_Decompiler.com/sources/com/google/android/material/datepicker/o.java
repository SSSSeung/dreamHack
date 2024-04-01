package com.google.android.material.datepicker;

import a2.m;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class o<S> extends u {
    public int W;
    public c X;

    public final void r(Bundle bundle) {
        super.r(bundle);
        if (bundle == null) {
            bundle = this.f1259i;
        }
        this.W = bundle.getInt("THEME_RES_ID_KEY");
        m.n(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.X = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(i(), this.W));
        throw null;
    }

    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.W);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.X);
    }
}
