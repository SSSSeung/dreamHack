package g4;

import java.util.AbstractList;
import java.util.List;

public abstract class e extends AbstractList implements List {
    public abstract int a();

    public abstract Object b(int i3);

    public final /* bridge */ Object remove(int i3) {
        return b(i3);
    }

    public final /* bridge */ int size() {
        return a();
    }
}
