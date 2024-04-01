package b4;

import java.sql.Timestamp;
import java.util.Date;
import v3.a0;
import y3.a;

public final class c extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f1590b = new a(5);

    /* renamed from: a  reason: collision with root package name */
    public final a0 f1591a;

    public c(a0 a0Var) {
        this.f1591a = a0Var;
    }

    public final Object b(c4.a aVar) {
        Date date = (Date) this.f1591a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }
}
