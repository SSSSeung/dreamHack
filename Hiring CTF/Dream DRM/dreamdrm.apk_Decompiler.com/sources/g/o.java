package g;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

public abstract class o {
    public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i3) {
        return callback.onWindowStartingActionMode(callback2, i3);
    }
}
