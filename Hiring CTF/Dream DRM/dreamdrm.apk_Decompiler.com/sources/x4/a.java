package x4;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.l;
import w4.s0;

public final class a implements l {
    public int a() {
        return 1073741823;
    }

    public String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public s0 c(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(d.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
