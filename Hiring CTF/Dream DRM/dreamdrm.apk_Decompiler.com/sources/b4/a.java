package b4;

import a2.m;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import v3.a0;
import v3.q;

public final class a extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final y3.a f1586b = new y3.a(3);

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f1587a = new SimpleDateFormat("MMM d, yyyy");

    public final Object b(c4.a aVar) {
        Date parse;
        if (aVar.Q() == 9) {
            aVar.M();
            return null;
        }
        String O = aVar.O();
        try {
            synchronized (this) {
                parse = this.f1587a.parse(O);
            }
            return new java.sql.Date(parse.getTime());
        } catch (ParseException e6) {
            StringBuilder k6 = m.k("Failed parsing '", O, "' as SQL Date; at path ");
            k6.append(aVar.C(true));
            throw new q(k6.toString(), e6);
        }
    }
}
