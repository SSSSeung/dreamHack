package e4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b1.o;
import com.theori.dreamdrm.R;
import p1.f1;

public final class e extends f1 {

    /* renamed from: u  reason: collision with root package name */
    public final TextView f2573u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f2574v;

    public e(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.tvFileName);
        o.l(findViewById, "itemView.findViewById(R.id.tvFileName)");
        this.f2573u = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.imageViewThumbnail);
        o.l(findViewById2, "itemView.findViewById(R.id.imageViewThumbnail)");
        this.f2574v = (ImageView) findViewById2;
    }
}
