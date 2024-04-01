package v3;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;
import x3.k;

public final class t extends p {

    /* renamed from: d  reason: collision with root package name */
    public final Serializable f5405d;

    public t(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f5405d = bool;
    }

    public static boolean c(t tVar) {
        Serializable serializable = tVar.f5405d;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public final Number a() {
        Serializable serializable = this.f5405d;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new k((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String b() {
        Serializable serializable = this.f5405d;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return a().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        Serializable serializable = this.f5405d;
        Serializable serializable2 = tVar.f5405d;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (c(this) && c(tVar)) {
            return a().longValue() == tVar.a().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double doubleValue = a().doubleValue();
        double doubleValue2 = tVar.a().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long j6;
        Serializable serializable = this.f5405d;
        if (serializable == null) {
            return 31;
        }
        if (c(this)) {
            j6 = a().longValue();
        } else if (!(serializable instanceof Number)) {
            return serializable.hashCode();
        } else {
            j6 = Double.doubleToLongBits(a().doubleValue());
        }
        return (int) (j6 ^ (j6 >>> 32));
    }

    public t(Number number) {
        Objects.requireNonNull(number);
        this.f5405d = number;
    }

    public t(String str) {
        Objects.requireNonNull(str);
        this.f5405d = str;
    }
}
