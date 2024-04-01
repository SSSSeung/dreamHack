package v3;

import a2.m;
import androidx.fragment.app.q;
import c4.a;
import c4.c;

/* 'enum' modifier removed */
public final class w extends y {
    public w() {
        super("LONG_OR_DOUBLE", 2);
    }

    public final Number a(a aVar) {
        String O = aVar.O();
        try {
            return Long.valueOf(Long.parseLong(O));
        } catch (NumberFormatException unused) {
            Double valueOf = Double.valueOf(O);
            if ((!valueOf.isInfinite() && !valueOf.isNaN()) || aVar.f1641e) {
                return valueOf;
            }
            throw new c("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.C(true));
        } catch (NumberFormatException e6) {
            StringBuilder k6 = m.k("Cannot parse ", O, "; at path ");
            k6.append(aVar.C(true));
            throw new q(k6.toString(), e6);
        }
    }
}
