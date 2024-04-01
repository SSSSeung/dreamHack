package d5;

import java.net.Proxy;

public abstract /* synthetic */ class k {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f2242a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        f2242a = iArr;
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        iArr[Proxy.Type.HTTP.ordinal()] = 2;
    }
}
