package y3;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

public final class t implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f5896a;

    public t(Class cls) {
        this.f5896a = cls;
    }

    public final Object run() {
        Field[] declaredFields = this.f5896a.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(fieldArr, true);
        return fieldArr;
    }
}
