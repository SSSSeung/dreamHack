package v3;

import a2.m;
import androidx.fragment.app.q;
import c4.a;
import java.math.BigDecimal;

/* 'enum' modifier removed */
public final class x extends y {
    public x() {
        super("BIG_DECIMAL", 3);
    }

    public final Number a(a aVar) {
        String O = aVar.O();
        try {
            return new BigDecimal(O);
        } catch (NumberFormatException e6) {
            StringBuilder k6 = m.k("Cannot parse ", O, "; at path ");
            k6.append(aVar.C(true));
            throw new q(k6.toString(), e6);
        }
    }
}
