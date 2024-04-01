package j0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public final class p extends View {
    public p(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public final void draw(Canvas canvas) {
    }

    public final void onMeasure(int i3, int i6) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i3) {
        d dVar = (d) getLayoutParams();
        dVar.f3657a = i3;
        setLayoutParams(dVar);
    }

    public void setGuidelineEnd(int i3) {
        d dVar = (d) getLayoutParams();
        dVar.f3659b = i3;
        setLayoutParams(dVar);
    }

    public void setGuidelinePercent(float f6) {
        d dVar = (d) getLayoutParams();
        dVar.f3661c = f6;
        setLayoutParams(dVar);
    }

    public void setVisibility(int i3) {
    }
}
