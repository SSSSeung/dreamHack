package y3;

import a2.m;
import c4.a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import v3.a0;
import v3.q;
import x3.j;

public final class e extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5854b = new a(1);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5855a;

    public e() {
        ArrayList arrayList = new ArrayList();
        this.f5855a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (j.f5730a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    public final Object b(a aVar) {
        if (aVar.Q() == 9) {
            aVar.M();
            return null;
        }
        String O = aVar.O();
        synchronized (this.f5855a) {
            Iterator it = this.f5855a.iterator();
            while (it.hasNext()) {
                try {
                    Date parse = ((DateFormat) it.next()).parse(O);
                    return parse;
                } catch (ParseException unused) {
                }
            }
            try {
                return z3.a.b(O, new ParsePosition(0));
            } catch (ParseException e6) {
                StringBuilder k6 = m.k("Failed parsing '", O, "' as Date; at path ");
                k6.append(aVar.C(true));
                throw new q(k6.toString(), e6);
            }
        }
    }
}
