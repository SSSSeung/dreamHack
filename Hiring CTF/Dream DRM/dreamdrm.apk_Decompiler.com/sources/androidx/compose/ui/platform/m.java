package androidx.compose.ui.platform;

import androidx.lifecycle.l;

public abstract /* synthetic */ class m {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f908a;

    static {
        int[] iArr = new int[l.values().length];
        iArr[l.ON_CREATE.ordinal()] = 1;
        iArr[l.ON_START.ordinal()] = 2;
        iArr[l.ON_STOP.ordinal()] = 3;
        iArr[l.ON_DESTROY.ordinal()] = 4;
        iArr[l.ON_PAUSE.ordinal()] = 5;
        iArr[l.ON_RESUME.ordinal()] = 6;
        iArr[l.ON_ANY.ordinal()] = 7;
        f908a = iArr;
    }
}
