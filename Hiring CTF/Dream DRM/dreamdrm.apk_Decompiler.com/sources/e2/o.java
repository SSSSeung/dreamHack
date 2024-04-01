package e2;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final Map f2530b;

    /* renamed from: a  reason: collision with root package name */
    public final Map f2531a = f2530b;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = property.charAt(i3);
                if ((charAt <= 31 && charAt != 9) || charAt >= 127) {
                    charAt = '?';
                }
                sb.append(charAt);
            }
            property = sb.toString();
        }
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            hashMap.put("User-Agent", Collections.singletonList(new p(property)));
        }
        f2530b = Collections.unmodifiableMap(hashMap);
    }
}
