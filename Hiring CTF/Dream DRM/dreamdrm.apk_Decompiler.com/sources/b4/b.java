package b4;

import a2.m;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import v3.a0;
import v3.q;
import y3.a;

public final class b extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f1588b = new a(4);

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f1589a = new SimpleDateFormat("hh:mm:ss a");

    public final Object b(c4.a aVar) {
        Time time;
        if (aVar.Q() == 9) {
            aVar.M();
            return null;
        }
        String O = aVar.O();
        try {
            synchronized (this) {
                time = new Time(this.f1589a.parse(O).getTime());
            }
            return time;
        } catch (ParseException e6) {
            StringBuilder k6 = m.k("Failed parsing '", O, "' as SQL Time; at path ");
            k6.append(aVar.C(true));
            throw new q(k6.toString(), e6);
        }
    }
}
