package e4;

import java.nio.file.Path;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2569a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f2570b;

    public /* synthetic */ c(AtomicBoolean atomicBoolean, int i3) {
        this.f2569a = i3;
        this.f2570b = atomicBoolean;
    }

    public final void accept(Object obj) {
        int i3 = this.f2569a;
        AtomicBoolean atomicBoolean = this.f2570b;
        switch (i3) {
            case 0:
                if (((Path) obj).toString().toLowerCase(Locale.ROOT).contains("gdb")) {
                    atomicBoolean.set(true);
                    return;
                }
                return;
            default:
                if (((Path) obj).toString().contains("frida")) {
                    atomicBoolean.set(true);
                    return;
                }
                return;
        }
    }
}
