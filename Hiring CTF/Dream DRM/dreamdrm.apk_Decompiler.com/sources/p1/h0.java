package p1;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;

public final class h0 extends Observable {
    public final boolean a() {
        return !this.mObservers.isEmpty();
    }

    public final void b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((x0) this.mObservers.get(size)).f4713a;
            recyclerView.k((String) null);
            recyclerView.f1432h0.f4443f = true;
            recyclerView.W(true);
            if (!recyclerView.f1431h.g()) {
                recyclerView.requestLayout();
            }
        }
    }
}
