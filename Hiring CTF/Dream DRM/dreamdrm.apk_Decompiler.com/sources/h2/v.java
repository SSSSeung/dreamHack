package h2;

import java.io.IOException;

public final class v extends IOException {
    public v(String str) {
        super(str);
    }

    public v(String str, int i3, IOException iOException) {
        super(str + ", status code: " + i3, iOException);
    }
}
