package v3;

import a2.m;
import c4.a;
import c4.b;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import x3.l;
import x3.n;
import y.d;

public final class k extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5393a;

    public /* synthetic */ k(int i3) {
        this.f5393a = i3;
    }

    public static p e(a aVar, int i3) {
        if (i3 != 0) {
            int i6 = i3 - 1;
            if (i6 == 5) {
                return new t(aVar.O());
            }
            if (i6 == 6) {
                return new t((Number) new x3.k(aVar.O()));
            }
            if (i6 == 7) {
                return new t(Boolean.valueOf(aVar.G()));
            }
            if (i6 == 8) {
                aVar.M();
                return r.f5403d;
            }
            throw new IllegalStateException("Unexpected token: ".concat(m.w(i3)));
        }
        throw null;
    }

    public static p f(a aVar, int i3) {
        if (i3 != 0) {
            int i6 = i3 - 1;
            if (i6 == 0) {
                aVar.b();
                return new o();
            } else if (i6 != 2) {
                return null;
            } else {
                aVar.e();
                return new s();
            }
        } else {
            throw null;
        }
    }

    public static void j(p pVar, b bVar) {
        if (pVar == null || (pVar instanceof r)) {
            bVar.C();
            return;
        }
        boolean z5 = pVar instanceof t;
        if (!z5) {
            boolean z6 = pVar instanceof o;
            if (z6) {
                bVar.e();
                if (z6) {
                    Iterator it = ((o) pVar).iterator();
                    while (it.hasNext()) {
                        j((p) it.next(), bVar);
                    }
                    bVar.n();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + pVar);
            }
            boolean z7 = pVar instanceof s;
            if (z7) {
                bVar.i();
                if (z7) {
                    Iterator it2 = ((x3.m) ((s) pVar).f5404d.entrySet()).iterator();
                    while (((n) it2).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((l) it2).next();
                        bVar.q((String) entry.getKey());
                        j((p) entry.getValue(), bVar);
                    }
                    bVar.p();
                    return;
                }
                throw new IllegalStateException("Not a JSON Object: " + pVar);
            }
            throw new IllegalArgumentException("Couldn't write " + pVar.getClass());
        } else if (z5) {
            t tVar = (t) pVar;
            Serializable serializable = tVar.f5405d;
            if (serializable instanceof Number) {
                bVar.J(tVar.a());
            } else if (serializable instanceof Boolean) {
                bVar.L(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(tVar.b()));
            } else {
                bVar.K(tVar.b());
            }
        } else {
            throw new IllegalStateException("Not a JSON Primitive: " + pVar);
        }
    }

    public final Object b(a aVar) {
        Locale locale;
        boolean z5;
        String str = null;
        switch (this.f5393a) {
            case 0:
                return d(aVar);
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.D()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.I()));
                    } catch (NumberFormatException e6) {
                        throw new q((Exception) e6);
                    }
                }
                aVar.n();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i3 = 0; i3 < size; i3++) {
                    atomicIntegerArray.set(i3, ((Integer) arrayList.get(i3)).intValue());
                }
                return atomicIntegerArray;
            case 2:
                return d(aVar);
            case 3:
                return d(aVar);
            case 4:
                return d(aVar);
            case 5:
                if (aVar.Q() == 9) {
                    aVar.M();
                    return null;
                }
                String O = aVar.O();
                if (O.length() == 1) {
                    return Character.valueOf(O.charAt(0));
                }
                StringBuilder k6 = m.k("Expecting character, got: ", O, "; at ");
                k6.append(aVar.C(true));
                throw new q(k6.toString());
            case 6:
                int Q = aVar.Q();
                if (Q != 9) {
                    return Q == 8 ? Boolean.toString(aVar.G()) : aVar.O();
                }
                aVar.M();
                return null;
            case 7:
                if (aVar.Q() == 9) {
                    aVar.M();
                    return null;
                }
                String O2 = aVar.O();
                try {
                    return new BigDecimal(O2);
                } catch (NumberFormatException e7) {
                    StringBuilder k7 = m.k("Failed parsing '", O2, "' as BigDecimal; at path ");
                    k7.append(aVar.C(true));
                    throw new q(k7.toString(), e7);
                }
            case 8:
                if (aVar.Q() == 9) {
                    aVar.M();
                    return null;
                }
                String O3 = aVar.O();
                try {
                    return new BigInteger(O3);
                } catch (NumberFormatException e8) {
                    StringBuilder k8 = m.k("Failed parsing '", O3, "' as BigInteger; at path ");
                    k8.append(aVar.C(true));
                    throw new q(k8.toString(), e8);
                }
            case 9:
                if (aVar.Q() != 9) {
                    return new x3.k(aVar.O());
                }
                aVar.M();
                return null;
            case 10:
                if (aVar.Q() != 9) {
                    return new StringBuilder(aVar.O());
                }
                aVar.M();
                return null;
            case 11:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 12:
                if (aVar.Q() != 9) {
                    return new StringBuffer(aVar.O());
                }
                aVar.M();
                return null;
            case 13:
                if (aVar.Q() == 9) {
                    aVar.M();
                    return null;
                }
                String O4 = aVar.O();
                if ("null".equals(O4)) {
                    return null;
                }
                return new URL(O4);
            case 14:
                if (aVar.Q() == 9) {
                    aVar.M();
                    return null;
                }
                try {
                    String O5 = aVar.O();
                    if ("null".equals(O5)) {
                        return null;
                    }
                    return new URI(O5);
                } catch (URISyntaxException e9) {
                    throw new q((Exception) e9);
                }
            case 15:
                if (aVar.Q() != 9) {
                    return InetAddress.getByName(aVar.O());
                }
                aVar.M();
                return null;
            case 16:
                if (aVar.Q() == 9) {
                    aVar.M();
                    return null;
                }
                String O6 = aVar.O();
                try {
                    return UUID.fromString(O6);
                } catch (IllegalArgumentException e10) {
                    StringBuilder k9 = m.k("Failed parsing '", O6, "' as UUID; at path ");
                    k9.append(aVar.C(true));
                    throw new q(k9.toString(), e10);
                }
            case 17:
                String O7 = aVar.O();
                try {
                    return Currency.getInstance(O7);
                } catch (IllegalArgumentException e11) {
                    StringBuilder k10 = m.k("Failed parsing '", O7, "' as Currency; at path ");
                    k10.append(aVar.C(true));
                    throw new q(k10.toString(), e11);
                }
            case 18:
                if (aVar.Q() == 9) {
                    aVar.M();
                    return null;
                }
                aVar.e();
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (aVar.Q() != 4) {
                    String K = aVar.K();
                    int I = aVar.I();
                    if ("year".equals(K)) {
                        i6 = I;
                    } else if ("month".equals(K)) {
                        i7 = I;
                    } else if ("dayOfMonth".equals(K)) {
                        i8 = I;
                    } else if ("hourOfDay".equals(K)) {
                        i9 = I;
                    } else if ("minute".equals(K)) {
                        i10 = I;
                    } else if ("second".equals(K)) {
                        i11 = I;
                    }
                }
                aVar.p();
                return new GregorianCalendar(i6, i7, i8, i9, i10, i11);
            case 19:
                if (aVar.Q() == 9) {
                    aVar.M();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.O(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                }
                if (nextToken2 == null && str == null) {
                    return new Locale(nextToken);
                }
                if (str != null) {
                    locale = new Locale(nextToken, nextToken2, str);
                }
                return locale;
            case 20:
                int Q2 = aVar.Q();
                p f6 = f(aVar, Q2);
                if (f6 == null) {
                    return e(aVar, Q2);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.D()) {
                        String K2 = f6 instanceof s ? aVar.K() : null;
                        int Q3 = aVar.Q();
                        p f7 = f(aVar, Q3);
                        boolean z6 = f7 != null;
                        p e12 = f7 == null ? e(aVar, Q3) : f7;
                        if (f6 instanceof o) {
                            ((o) f6).f5402d.add(e12);
                        } else {
                            ((s) f6).f5404d.put(K2, e12);
                        }
                        if (z6) {
                            arrayDeque.addLast(f6);
                            f6 = e12;
                        }
                    } else {
                        if (f6 instanceof o) {
                            aVar.n();
                        } else {
                            aVar.p();
                        }
                        if (arrayDeque.isEmpty()) {
                            return f6;
                        }
                        f6 = (p) arrayDeque.removeLast();
                    }
                }
            case 21:
                BitSet bitSet = new BitSet();
                aVar.b();
                int Q4 = aVar.Q();
                int i12 = 0;
                while (Q4 != 2) {
                    int b6 = d.b(Q4);
                    if (b6 == 5 || b6 == 6) {
                        int I2 = aVar.I();
                        if (I2 == 0) {
                            z5 = false;
                        } else if (I2 == 1) {
                            z5 = true;
                        } else {
                            throw new q("Invalid bitset value " + I2 + ", expected 0 or 1; at path " + aVar.C(true));
                        }
                    } else if (b6 == 7) {
                        z5 = aVar.G();
                    } else {
                        throw new q("Invalid bitset value type: " + m.w(Q4) + "; at path " + aVar.C(false));
                    }
                    if (z5) {
                        bitSet.set(i12);
                    }
                    i12++;
                    Q4 = aVar.Q();
                }
                aVar.n();
                return bitSet;
            case 22:
                return c(aVar);
            case 23:
                return c(aVar);
            case 24:
                return d(aVar);
            case 25:
                return d(aVar);
            case 26:
                return d(aVar);
            case 27:
                try {
                    return new AtomicInteger(aVar.I());
                } catch (NumberFormatException e13) {
                    throw new q((Exception) e13);
                }
            default:
                return new AtomicBoolean(aVar.G());
        }
    }

    public final Boolean c(a aVar) {
        switch (this.f5393a) {
            case 22:
                int Q = aVar.Q();
                if (Q == 9) {
                    aVar.M();
                    return null;
                }
                return Boolean.valueOf(Q == 6 ? Boolean.parseBoolean(aVar.O()) : aVar.G());
            default:
                if (aVar.Q() != 9) {
                    return Boolean.valueOf(aVar.O());
                }
                aVar.M();
                return null;
        }
    }

    public final Number d(a aVar) {
        switch (this.f5393a) {
            case 0:
                if (aVar.Q() != 9) {
                    return Long.valueOf(aVar.J());
                }
                aVar.M();
                return null;
            case 2:
                if (aVar.Q() == 9) {
                    aVar.M();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.J());
                } catch (NumberFormatException e6) {
                    throw new q((Exception) e6);
                }
            case 3:
                if (aVar.Q() != 9) {
                    return Float.valueOf((float) aVar.H());
                }
                aVar.M();
                return null;
            case 4:
                if (aVar.Q() != 9) {
                    return Double.valueOf(aVar.H());
                }
                aVar.M();
                return null;
            case 24:
                if (aVar.Q() == 9) {
                    aVar.M();
                    return null;
                }
                try {
                    int I = aVar.I();
                    if (I <= 255 && I >= -128) {
                        return Byte.valueOf((byte) I);
                    }
                    throw new q("Lossy conversion from " + I + " to byte; at path " + aVar.C(true));
                } catch (NumberFormatException e7) {
                    throw new q((Exception) e7);
                }
            case 25:
                if (aVar.Q() == 9) {
                    aVar.M();
                    return null;
                }
                try {
                    int I2 = aVar.I();
                    if (I2 <= 65535 && I2 >= -32768) {
                        return Short.valueOf((short) I2);
                    }
                    throw new q("Lossy conversion from " + I2 + " to short; at path " + aVar.C(true));
                } catch (NumberFormatException e8) {
                    throw new q((Exception) e8);
                }
            default:
                if (aVar.Q() == 9) {
                    aVar.M();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.I());
                } catch (NumberFormatException e9) {
                    throw new q((Exception) e9);
                }
        }
    }

    public final void g(b bVar, Boolean bool) {
        switch (this.f5393a) {
            case 22:
                bVar.I(bool);
                return;
            default:
                bVar.K(bool == null ? "null" : bool.toString());
                return;
        }
    }

    public final void h(b bVar, Number number) {
        switch (this.f5393a) {
            case 0:
                if (number == null) {
                    bVar.C();
                    return;
                } else {
                    bVar.K(number.toString());
                    return;
                }
            case 2:
                if (number == null) {
                    bVar.C();
                    return;
                } else {
                    bVar.H(number.longValue());
                    return;
                }
            case 3:
                if (number == null) {
                    bVar.C();
                    return;
                }
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                bVar.J(number);
                return;
            case 4:
                if (number == null) {
                    bVar.C();
                    return;
                } else {
                    bVar.G(number.doubleValue());
                    return;
                }
            case 24:
                if (number == null) {
                    bVar.C();
                    return;
                } else {
                    bVar.H((long) number.byteValue());
                    return;
                }
            case 25:
                if (number == null) {
                    bVar.C();
                    return;
                } else {
                    bVar.H((long) number.shortValue());
                    return;
                }
            default:
                if (number == null) {
                    bVar.C();
                    return;
                } else {
                    bVar.H((long) number.intValue());
                    return;
                }
        }
    }

    public final void i(b bVar, Object obj) {
        int i3 = 0;
        String str = null;
        switch (this.f5393a) {
            case 0:
                h(bVar, (Number) obj);
                return;
            case 1:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                bVar.e();
                int length = atomicIntegerArray.length();
                while (i3 < length) {
                    bVar.H((long) atomicIntegerArray.get(i3));
                    i3++;
                }
                bVar.n();
                return;
            case 2:
                h(bVar, (Number) obj);
                return;
            case 3:
                h(bVar, (Number) obj);
                return;
            case 4:
                h(bVar, (Number) obj);
                return;
            case 5:
                Character ch = (Character) obj;
                if (ch != null) {
                    str = String.valueOf(ch);
                }
                bVar.K(str);
                return;
            case 6:
                bVar.K((String) obj);
                return;
            case 7:
                bVar.J((BigDecimal) obj);
                return;
            case 8:
                bVar.J((BigInteger) obj);
                return;
            case 9:
                bVar.J((x3.k) obj);
                return;
            case 10:
                StringBuilder sb = (StringBuilder) obj;
                if (sb != null) {
                    str = sb.toString();
                }
                bVar.K(str);
                return;
            case 11:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 12:
                StringBuffer stringBuffer = (StringBuffer) obj;
                if (stringBuffer != null) {
                    str = stringBuffer.toString();
                }
                bVar.K(str);
                return;
            case 13:
                URL url = (URL) obj;
                if (url != null) {
                    str = url.toExternalForm();
                }
                bVar.K(str);
                return;
            case 14:
                URI uri = (URI) obj;
                if (uri != null) {
                    str = uri.toASCIIString();
                }
                bVar.K(str);
                return;
            case 15:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress != null) {
                    str = inetAddress.getHostAddress();
                }
                bVar.K(str);
                return;
            case 16:
                UUID uuid = (UUID) obj;
                if (uuid != null) {
                    str = uuid.toString();
                }
                bVar.K(str);
                return;
            case 17:
                bVar.K(((Currency) obj).getCurrencyCode());
                return;
            case 18:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    bVar.C();
                    return;
                }
                bVar.i();
                bVar.q("year");
                bVar.H((long) calendar.get(1));
                bVar.q("month");
                bVar.H((long) calendar.get(2));
                bVar.q("dayOfMonth");
                bVar.H((long) calendar.get(5));
                bVar.q("hourOfDay");
                bVar.H((long) calendar.get(11));
                bVar.q("minute");
                bVar.H((long) calendar.get(12));
                bVar.q("second");
                bVar.H((long) calendar.get(13));
                bVar.p();
                return;
            case 19:
                Locale locale = (Locale) obj;
                if (locale != null) {
                    str = locale.toString();
                }
                bVar.K(str);
                return;
            case 20:
                j((p) obj, bVar);
                return;
            case 21:
                BitSet bitSet = (BitSet) obj;
                bVar.e();
                int length2 = bitSet.length();
                while (i3 < length2) {
                    bVar.H(bitSet.get(i3) ? 1 : 0);
                    i3++;
                }
                bVar.n();
                return;
            case 22:
                g(bVar, (Boolean) obj);
                return;
            case 23:
                g(bVar, (Boolean) obj);
                return;
            case 24:
                h(bVar, (Number) obj);
                return;
            case 25:
                h(bVar, (Number) obj);
                return;
            case 26:
                h(bVar, (Number) obj);
                return;
            case 27:
                bVar.H((long) ((AtomicInteger) obj).get());
                return;
            default:
                bVar.L(((AtomicBoolean) obj).get());
                return;
        }
    }
}
