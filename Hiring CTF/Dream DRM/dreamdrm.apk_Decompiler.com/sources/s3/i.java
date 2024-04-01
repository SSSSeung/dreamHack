package s3;

import android.view.MotionEvent;
import android.view.View;

public final /* synthetic */ class i implements View.OnTouchListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f4971d;

    public /* synthetic */ i(k kVar) {
        this.f4971d = kVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        k kVar = this.f4971d;
        kVar.getClass();
        if (motionEvent.getAction() == 1) {
            long currentTimeMillis = System.currentTimeMillis() - kVar.f4983o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                kVar.f4981m = false;
            }
            kVar.u();
            kVar.f4981m = true;
            kVar.f4983o = System.currentTimeMillis();
        }
        return false;
    }
}
