package z4;

import b1.o;
import b1.v;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import s4.c;
import v4.a;
import v4.i;

public abstract class c0 implements Closeable {
    public final Charset b() {
        v vVar;
        b0 b0Var = (b0) this;
        String str = null;
        int i3 = b0Var.f5970d;
        Object obj = b0Var.f5973g;
        switch (i3) {
            case 0:
                vVar = (v) obj;
                break;
            default:
                String str2 = (String) obj;
                if (str2 != null) {
                    Pattern pattern = v.f6079c;
                    try {
                        vVar = o.t(str2);
                        break;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                vVar = null;
                break;
        }
        if (vVar != null) {
            Charset charset = a.f5409a;
            String[] strArr = vVar.f6082b;
            o.m(strArr, "<this>");
            s4.a R = v.R(new c(0, strArr.length - 1), 2);
            int i6 = R.f5073d;
            int i7 = R.f5074e;
            int i8 = R.f5075f;
            if (i8 < 0 ? i6 >= i7 : i6 <= i7) {
                while (true) {
                    if (i.T(strArr[i6], "charset")) {
                        str = strArr[i6 + 1];
                    } else if (i6 != i7) {
                        i6 += i8;
                    }
                }
            }
            if (str != null) {
                try {
                    charset = Charset.forName(str);
                } catch (IllegalArgumentException unused2) {
                }
            }
            if (charset != null) {
                return charset;
            }
        }
        return a.f5409a;
    }

    public final void close() {
        a5.c.b(e());
    }

    public abstract l5.i e();
}
