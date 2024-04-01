package c;

import android.content.Intent;
import com.bumptech.glide.d;
import f4.c;
import g4.h;
import g4.i;
import g4.o;
import g4.q;
import java.util.ArrayList;
import java.util.Iterator;

public final class a extends d {
    public final Object y(Intent intent, int i3) {
        o oVar = o.f2907d;
        if (i3 != -1 || intent == null) {
            return oVar;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return oVar;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i6 = 0; i6 < length; i6++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i6] == 0));
        }
        ArrayList d02 = h.d0(stringArrayExtra);
        Iterator it = d02.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(i.W(d02), i.W(arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new c(it.next(), it2.next()));
        }
        return q.g0(arrayList2);
    }
}
