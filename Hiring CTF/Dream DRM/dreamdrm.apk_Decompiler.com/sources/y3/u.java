package y3;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import v3.a0;
import v3.k;
import v3.p;

public abstract class u {
    public static final r A;
    public static final a B = new a(2);

    /* renamed from: a  reason: collision with root package name */
    public static final r f5897a = a(Class.class, new k(11).a());

    /* renamed from: b  reason: collision with root package name */
    public static final r f5898b = a(BitSet.class, new k(21).a());

    /* renamed from: c  reason: collision with root package name */
    public static final k f5899c = new k(23);

    /* renamed from: d  reason: collision with root package name */
    public static final s f5900d;

    /* renamed from: e  reason: collision with root package name */
    public static final s f5901e = b(Byte.TYPE, Byte.class, new k(24));

    /* renamed from: f  reason: collision with root package name */
    public static final s f5902f = b(Short.TYPE, Short.class, new k(25));

    /* renamed from: g  reason: collision with root package name */
    public static final s f5903g = b(Integer.TYPE, Integer.class, new k(26));

    /* renamed from: h  reason: collision with root package name */
    public static final r f5904h = a(AtomicInteger.class, new k(27).a());

    /* renamed from: i  reason: collision with root package name */
    public static final r f5905i = a(AtomicBoolean.class, new k(28).a());

    /* renamed from: j  reason: collision with root package name */
    public static final r f5906j = a(AtomicIntegerArray.class, new k(1).a());

    /* renamed from: k  reason: collision with root package name */
    public static final k f5907k = new k(2);

    /* renamed from: l  reason: collision with root package name */
    public static final s f5908l = b(Character.TYPE, Character.class, new k(5));

    /* renamed from: m  reason: collision with root package name */
    public static final k f5909m = new k(7);

    /* renamed from: n  reason: collision with root package name */
    public static final k f5910n = new k(8);

    /* renamed from: o  reason: collision with root package name */
    public static final k f5911o = new k(9);

    /* renamed from: p  reason: collision with root package name */
    public static final r f5912p;

    /* renamed from: q  reason: collision with root package name */
    public static final r f5913q = a(StringBuilder.class, new k(10));

    /* renamed from: r  reason: collision with root package name */
    public static final r f5914r = a(StringBuffer.class, new k(12));

    /* renamed from: s  reason: collision with root package name */
    public static final r f5915s = a(URL.class, new k(13));

    /* renamed from: t  reason: collision with root package name */
    public static final r f5916t = a(URI.class, new k(14));

    /* renamed from: u  reason: collision with root package name */
    public static final r f5917u = new r(InetAddress.class, new k(15), 1);

    /* renamed from: v  reason: collision with root package name */
    public static final r f5918v = a(UUID.class, new k(16));
    public static final r w = a(Currency.class, new k(17).a());

    /* renamed from: x  reason: collision with root package name */
    public static final s f5919x = new s(Calendar.class, GregorianCalendar.class, new k(18), 1);

    /* renamed from: y  reason: collision with root package name */
    public static final r f5920y = a(Locale.class, new k(19));

    /* renamed from: z  reason: collision with root package name */
    public static final k f5921z;

    static {
        k kVar = new k(22);
        f5900d = b(Boolean.TYPE, Boolean.class, kVar);
        new k(3);
        new k(4);
        k kVar2 = new k(6);
        f5912p = a(String.class, kVar2);
        k kVar3 = new k(20);
        f5921z = kVar3;
        A = new r(p.class, kVar3, 1);
    }

    public static r a(Class cls, a0 a0Var) {
        return new r(cls, a0Var, 0);
    }

    public static s b(Class cls, Class cls2, a0 a0Var) {
        return new s(cls, cls2, a0Var, 0);
    }
}
