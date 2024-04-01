package p1;

import androidx.recyclerview.widget.RecyclerView;

public final class m extends s0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f4570a;

    public m(p pVar) {
        this.f4570a = pVar;
    }

    public final void b(RecyclerView recyclerView, int i3, int i6) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        p pVar = this.f4570a;
        int computeVerticalScrollRange = pVar.f4633s.computeVerticalScrollRange();
        int i7 = pVar.f4632r;
        int i8 = computeVerticalScrollRange - i7;
        int i9 = pVar.f4615a;
        pVar.f4634t = i8 > 0 && i7 >= i9;
        int computeHorizontalScrollRange = pVar.f4633s.computeHorizontalScrollRange();
        int i10 = pVar.f4631q;
        boolean z5 = computeHorizontalScrollRange - i10 > 0 && i10 >= i9;
        pVar.f4635u = z5;
        boolean z6 = pVar.f4634t;
        if (z6 || z5) {
            if (z6) {
                float f6 = (float) i7;
                pVar.f4626l = (int) ((((f6 / 2.0f) + ((float) computeVerticalScrollOffset)) * f6) / ((float) computeVerticalScrollRange));
                pVar.f4625k = Math.min(i7, (i7 * i7) / computeVerticalScrollRange);
            }
            if (pVar.f4635u) {
                float f7 = (float) computeHorizontalScrollOffset;
                float f8 = (float) i10;
                pVar.f4629o = (int) ((((f8 / 2.0f) + f7) * f8) / ((float) computeHorizontalScrollRange));
                pVar.f4628n = Math.min(i10, (i10 * i10) / computeHorizontalScrollRange);
            }
            int i11 = pVar.f4636v;
            if (i11 == 0 || i11 == 1) {
                pVar.f(1);
            }
        } else if (pVar.f4636v != 0) {
            pVar.f(0);
        }
    }
}
