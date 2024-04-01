package e3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.theori.dreamdrm.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p1.m0;

public final class a extends m0 {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f2558a;

    /* renamed from: b  reason: collision with root package name */
    public List f2559b = Collections.unmodifiableList(new ArrayList());

    public a() {
        Paint paint = new Paint();
        this.f2558a = paint;
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f6;
        float f7;
        float f8;
        Paint paint = this.f2558a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (d dVar : this.f2559b) {
            dVar.getClass();
            ThreadLocal threadLocal = q0.a.f4867a;
            float f9 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((((float) Color.alpha(-16776961)) * 0.0f) + (((float) Color.alpha(-65281)) * f9)), (int) ((((float) Color.red(-16776961)) * 0.0f) + (((float) Color.red(-65281)) * f9)), (int) ((((float) Color.green(-16776961)) * 0.0f) + (((float) Color.green(-65281)) * f9)), (int) ((((float) Color.blue(-16776961)) * 0.0f) + (((float) Color.blue(-65281)) * f9))));
            boolean B0 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).B0();
            float f10 = 0.0f;
            dVar.getClass();
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
            if (B0) {
                f6 = (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1890q.a();
                f8 = 0.0f;
                f7 = 0.0f;
                f10 = (float) carouselLayoutManager.f1890q.d();
            } else {
                f7 = (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1890q.c();
                f6 = 0.0f;
                f8 = (float) carouselLayoutManager.f1890q.b();
            }
            canvas.drawLine(f8, f10, f7, f6, paint);
        }
    }
}
