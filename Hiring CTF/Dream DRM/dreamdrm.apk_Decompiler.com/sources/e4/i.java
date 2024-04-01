package e4;

import android.content.DialogInterface;
import b1.o;
import com.theori.dreamdrm.MainActivity;

public final /* synthetic */ class i implements DialogInterface.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MainActivity f2581d;

    public /* synthetic */ i(MainActivity mainActivity) {
        this.f2581d = mainActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i3) {
        int i6 = MainActivity.A;
        MainActivity mainActivity = this.f2581d;
        o.m(mainActivity, "this$0");
        mainActivity.finish();
    }
}
