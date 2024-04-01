package androidx.appcompat.widget;

import a1.b;
import a1.c;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import b1.v;
import b1.w;
import com.bumptech.glide.d;
import com.theori.dreamdrm.R;
import x0.e;
import x0.f;
import x0.h;
import x0.u;
import x0.u0;

public class z extends EditText implements u {

    /* renamed from: d  reason: collision with root package name */
    public final r f865d;

    /* renamed from: e  reason: collision with root package name */
    public final f1 f866e;

    /* renamed from: f  reason: collision with root package name */
    public final a0 f867f = new a0((TextView) this);

    /* renamed from: g  reason: collision with root package name */
    public final w f868g = new w();

    /* renamed from: h  reason: collision with root package name */
    public final a0 f869h;

    /* renamed from: i  reason: collision with root package name */
    public y f870i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        u3.a(context);
        t3.a(this, getContext());
        r rVar = new r(this);
        this.f865d = rVar;
        rVar.e(attributeSet, R.attr.editTextStyle);
        f1 f1Var = new f1(this);
        this.f866e = f1Var;
        f1Var.f(attributeSet, R.attr.editTextStyle);
        f1Var.b();
        a0 a0Var = new a0((EditText) this);
        this.f869h = a0Var;
        a0Var.t(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener p2 = a0Var.p(keyListener);
            if (p2 != keyListener) {
                super.setKeyListener(p2);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private y getSuperCaller() {
        if (this.f870i == null) {
            this.f870i = new y(this);
        }
        return this.f870i;
    }

    public final h a(h hVar) {
        return this.f868g.a(this, hVar);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f865d;
        if (rVar != null) {
            rVar.a();
        }
        f1 f1Var = this.f866e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof b1.u ? ((b1.u) customSelectionActionModeCallback).f1531a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f865d;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f865d;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f866e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f866e.e();
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f867f) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) a0Var.f504f;
        return textClassifier == null ? x0.a((TextView) a0Var.f503e) : textClassifier;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f6;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f866e.getClass();
        f1.h(this, onCreateInputConnection, editorInfo);
        d.r(this, editorInfo, onCreateInputConnection);
        if (!(onCreateInputConnection == null || Build.VERSION.SDK_INT > 30 || (f6 = u0.f(this)) == null)) {
            editorInfo.contentMimeTypes = f6;
            onCreateInputConnection = new c(onCreateInputConnection, new b(this));
        }
        return this.f869h.w(onCreateInputConnection, editorInfo);
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z5 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && u0.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z5 = k0.a(dragEvent, this, activity);
            }
        }
        if (z5) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public final boolean onTextContextMenuItem(int i3) {
        int i6 = Build.VERSION.SDK_INT;
        int i7 = 0;
        if (i6 < 31 && u0.f(this) != null && (i3 == 16908322 || i3 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                e dVar = i6 >= 31 ? new x0.d(primaryClip, 1) : new f(primaryClip, 1);
                if (i3 != 16908322) {
                    i7 = 1;
                }
                dVar.d(i7);
                u0.h(this, dVar.a());
            }
            i7 = 1;
        }
        if (i7 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i3);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f865d;
        if (rVar != null) {
            rVar.f();
        }
    }

    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        r rVar = this.f865d;
        if (rVar != null) {
            rVar.g(i3);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f866e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f866e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(v.U(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        ((androidx.compose.ui.platform.e) ((h1.b) this.f869h.f504f).f3358c).A(z5);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f869h.p(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f865d;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f865d;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f1 f1Var = this.f866e;
        f1Var.l(colorStateList);
        f1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f1 f1Var = this.f866e;
        f1Var.m(mode);
        f1Var.b();
    }

    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        f1 f1Var = this.f866e;
        if (f1Var != null) {
            f1Var.g(context, i3);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f867f) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a0Var.f504f = textClassifier;
        }
    }
}
