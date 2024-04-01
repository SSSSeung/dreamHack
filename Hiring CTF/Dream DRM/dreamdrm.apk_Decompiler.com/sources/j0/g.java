package j0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final float f3703a = Float.NaN;

    /* renamed from: b  reason: collision with root package name */
    public final float f3704b = Float.NaN;

    /* renamed from: c  reason: collision with root package name */
    public final float f3705c = Float.NaN;

    /* renamed from: d  reason: collision with root package name */
    public final float f3706d = Float.NaN;

    /* renamed from: e  reason: collision with root package name */
    public final int f3707e = -1;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f3785i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3707e);
                this.f3707e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f3706d = obtainStyledAttributes.getDimension(index, this.f3706d);
            } else if (index == 2) {
                this.f3704b = obtainStyledAttributes.getDimension(index, this.f3704b);
            } else if (index == 3) {
                this.f3705c = obtainStyledAttributes.getDimension(index, this.f3705c);
            } else if (index == 4) {
                this.f3703a = obtainStyledAttributes.getDimension(index, this.f3703a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
