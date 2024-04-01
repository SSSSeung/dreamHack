package a;

import android.os.Bundle;
import android.view.View;
import androidx.emoji2.text.j;
import b1.v;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e.n0;
import java.util.ArrayList;
import java.util.List;

public final class d implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f6f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f7g;

    public /* synthetic */ d(int i3, int i6, Object obj, Object obj2) {
        this.f4d = i6;
        this.f7g = obj;
        this.f6f = obj2;
        this.f5e = i3;
    }

    public final void run() {
        int i3 = this.f4d;
        int i6 = 0;
        Object obj = this.f7g;
        int i7 = this.f5e;
        Object obj2 = this.f6f;
        switch (i3) {
            case 0:
                ((e) obj).a(i7, (Bundle) obj2);
                return;
            case 1:
                v vVar = (v) ((n0) obj2).f2403e;
                if (vVar != null) {
                    vVar.H(i7);
                    return;
                }
                return;
            case 2:
                List list = (List) obj2;
                int size = list.size();
                if (i7 != 1) {
                    while (i6 < size) {
                        ((j) list.get(i6)).getClass();
                        i6++;
                    }
                    return;
                }
                while (i6 < size) {
                    ((j) list.get(i6)).a();
                    i6++;
                }
                return;
            default:
                ((BottomSheetBehavior) obj).G((View) obj2, i7, false);
                return;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(int i3, ArrayList arrayList) {
        this(arrayList, i3, (Throwable) null);
        this.f4d = 2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(androidx.emoji2.text.j r3, int r4) {
        /*
            r2 = this;
            r0 = 2
            r2.f4d = r0
            r0 = 1
            androidx.emoji2.text.j[] r0 = new androidx.emoji2.text.j[r0]
            if (r3 == 0) goto L_0x0014
            r1 = 0
            r0[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            return
        L_0x0014:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "initCallback cannot be null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d.<init>(androidx.emoji2.text.j, int):void");
    }

    public d(List list, int i3, Throwable th) {
        this.f4d = 2;
        if (list != null) {
            this.f6f = new ArrayList(list);
            this.f5e = i3;
            this.f7g = th;
            return;
        }
        throw new NullPointerException("initCallbacks cannot be null");
    }
}
