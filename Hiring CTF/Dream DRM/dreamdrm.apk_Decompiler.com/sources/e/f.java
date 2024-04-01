package e;

import android.content.Context;
import android.widget.ArrayAdapter;

public final class f extends ArrayAdapter {
    public f(Context context, int i3) {
        super(context, i3, 16908308, (Object[]) null);
    }

    public final long getItemId(int i3) {
        return (long) i3;
    }

    public final boolean hasStableIds() {
        return true;
    }
}
