package v3;

import b1.v;
import c4.b;
import java.io.IOException;
import java.io.StringWriter;

public abstract class p {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            b bVar = new b(stringWriter);
            bVar.f1661h = true;
            v.V(this, bVar);
            return stringWriter.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }
}
