package q4;

import a5.c;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

public final class b extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4908a;

    public /* synthetic */ b(int i3) {
        this.f4908a = i3;
    }

    public final Object initialValue() {
        switch (this.f4908a) {
            case 0:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(c.f216e);
                return simpleDateFormat;
        }
    }
}
