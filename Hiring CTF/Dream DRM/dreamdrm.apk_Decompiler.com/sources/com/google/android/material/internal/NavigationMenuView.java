package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h.e0;
import h.o;

public class NavigationMenuView extends RecyclerView implements e0 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    public final void a(o oVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
