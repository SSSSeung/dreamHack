package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import d.a;

public class AlertController$RecycleListView extends ListView {

    /* renamed from: d  reason: collision with root package name */
    public final int f350d;

    /* renamed from: e  reason: collision with root package name */
    public final int f351e;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2132t);
        this.f351e = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f350d = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
