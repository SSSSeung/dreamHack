package a2;

import androidx.appcompat.widget.j;
import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(new j((Object) this, 4, (Object) runnable), "glide-active-resources");
    }
}
