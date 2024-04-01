package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import k.j;
import s0.a;
import s0.b;

public class f0 extends d implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final a f3105d;

    public f0(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f3105d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(int i3) {
        return m(((o) this.f3105d).add(i3));
    }

    public final int addIntentOptions(int i3, int i6, int i7, ComponentName componentName, Intent[] intentArr, Intent intent, int i8, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = ((o) this.f3105d).addIntentOptions(i3, i6, i7, componentName, intentArr, intent, i8, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i9 = 0; i9 < length; i9++) {
                menuItemArr2[i9] = m(menuItemArr3[i9]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(int i3) {
        return ((o) this.f3105d).addSubMenu(i3);
    }

    public final void clear() {
        j jVar = (j) this.f3099b;
        if (jVar != null) {
            jVar.clear();
        }
        j jVar2 = (j) this.f3100c;
        if (jVar2 != null) {
            jVar2.clear();
        }
        ((o) this.f3105d).clear();
    }

    public final void close() {
        ((o) this.f3105d).c(true);
    }

    public final MenuItem findItem(int i3) {
        return m(((o) this.f3105d).findItem(i3));
    }

    public final MenuItem getItem(int i3) {
        return m(((o) this.f3105d).getItem(i3));
    }

    public final boolean hasVisibleItems() {
        return ((o) this.f3105d).hasVisibleItems();
    }

    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return ((o) this.f3105d).isShortcutKey(i3, keyEvent);
    }

    public final boolean performIdentifierAction(int i3, int i6) {
        return ((o) this.f3105d).performIdentifierAction(i3, i6);
    }

    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i6) {
        return ((o) this.f3105d).performShortcut(i3, keyEvent, i6);
    }

    public final void removeGroup(int i3) {
        if (((j) this.f3099b) != null) {
            int i6 = 0;
            while (true) {
                j jVar = (j) this.f3099b;
                if (i6 >= jVar.f3895f) {
                    break;
                }
                if (((b) jVar.h(i6)).getGroupId() == i3) {
                    ((j) this.f3099b).j(i6);
                    i6--;
                }
                i6++;
            }
        }
        ((o) this.f3105d).removeGroup(i3);
    }

    public final void removeItem(int i3) {
        if (((j) this.f3099b) != null) {
            int i6 = 0;
            while (true) {
                j jVar = (j) this.f3099b;
                if (i6 >= jVar.f3895f) {
                    break;
                } else if (((b) jVar.h(i6)).getItemId() == i3) {
                    ((j) this.f3099b).j(i6);
                    break;
                } else {
                    i6++;
                }
            }
        }
        ((o) this.f3105d).removeItem(i3);
    }

    public final void setGroupCheckable(int i3, boolean z5, boolean z6) {
        ((o) this.f3105d).setGroupCheckable(i3, z5, z6);
    }

    public final void setGroupEnabled(int i3, boolean z5) {
        ((o) this.f3105d).setGroupEnabled(i3, z5);
    }

    public final void setGroupVisible(int i3, boolean z5) {
        ((o) this.f3105d).setGroupVisible(i3, z5);
    }

    public final void setQwertyMode(boolean z5) {
        this.f3105d.setQwertyMode(z5);
    }

    public final int size() {
        return ((o) this.f3105d).size();
    }

    public final MenuItem add(int i3, int i6, int i7, int i8) {
        return m(((o) this.f3105d).add(i3, i6, i7, i8));
    }

    public final SubMenu addSubMenu(int i3, int i6, int i7, int i8) {
        return ((o) this.f3105d).addSubMenu(i3, i6, i7, i8);
    }

    public final MenuItem add(int i3, int i6, int i7, CharSequence charSequence) {
        return m(((o) this.f3105d).a(i3, i6, i7, charSequence));
    }

    public final SubMenu addSubMenu(int i3, int i6, int i7, CharSequence charSequence) {
        return ((o) this.f3105d).addSubMenu(i3, i6, i7, charSequence);
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((o) this.f3105d).addSubMenu(0, 0, 0, charSequence);
    }

    public final MenuItem add(CharSequence charSequence) {
        return m(((o) this.f3105d).a(0, 0, 0, charSequence));
    }
}
