package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import c1.a;
import com.theori.dreamdrm.R;
import g.d;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import x0.d0;
import x0.u0;

public class SearchView extends g2 implements d {

    /* renamed from: j0  reason: collision with root package name */
    public static final m3 f453j0 = (Build.VERSION.SDK_INT < 29 ? new m3() : null);
    public final View A;
    public q3 B;
    public final Rect C;
    public final Rect D;
    public final int[] E;
    public final int[] F;
    public final ImageView G;
    public final Drawable H;
    public final int I;
    public final int J;
    public final Intent K;
    public final Intent L;
    public final CharSequence M;
    public View.OnFocusChangeListener N;
    public View.OnClickListener O;
    public boolean P;
    public boolean Q;
    public a R;
    public boolean S;
    public CharSequence T;
    public boolean U;
    public boolean V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f454a0;

    /* renamed from: b0  reason: collision with root package name */
    public CharSequence f455b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f456c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f457d0;

    /* renamed from: e0  reason: collision with root package name */
    public SearchableInfo f458e0;
    public Bundle f0;

    /* renamed from: g0  reason: collision with root package name */
    public final b3 f459g0;

    /* renamed from: h0  reason: collision with root package name */
    public final b3 f460h0;

    /* renamed from: i0  reason: collision with root package name */
    public final WeakHashMap f461i0;

    /* renamed from: s  reason: collision with root package name */
    public final SearchAutoComplete f462s;

    /* renamed from: t  reason: collision with root package name */
    public final View f463t;

    /* renamed from: u  reason: collision with root package name */
    public final View f464u;

    /* renamed from: v  reason: collision with root package name */
    public final View f465v;
    public final ImageView w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f466x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f467y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f468z;

    public static class SearchAutoComplete extends q {

        /* renamed from: h  reason: collision with root package name */
        public int f469h = getThreshold();

        /* renamed from: i  reason: collision with root package name */
        public SearchView f470i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f471j;

        /* renamed from: k  reason: collision with root package name */
        public final p3 f472k = new p3(this);

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i3 = configuration.screenWidthDp;
            int i6 = configuration.screenHeightDp;
            if (i3 >= 960 && i6 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i3 < 600) {
                return (i3 < 640 || i6 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                i3.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            m3 m3Var = SearchView.f453j0;
            m3Var.getClass();
            m3.n();
            Object obj = m3Var.f687c;
            if (((Method) obj) != null) {
                try {
                    ((Method) obj).invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public final boolean enoughToFilter() {
            return this.f469h <= 0 || super.enoughToFilter();
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f471j) {
                p3 p3Var = this.f472k;
                removeCallbacks(p3Var);
                post(p3Var);
            }
            return onCreateInputConnection;
        }

        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public final void onFocusChanged(boolean z5, int i3, Rect rect) {
            super.onFocusChanged(z5, i3, rect);
            SearchView searchView = this.f470i;
            searchView.y(searchView.Q);
            searchView.post(searchView.f459g0);
            if (searchView.f462s.hasFocus()) {
                searchView.n();
            }
        }

        public final boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
            if (i3 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f470i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i3, keyEvent);
        }

        public final void onWindowFocusChanged(boolean z5) {
            super.onWindowFocusChanged(z5);
            if (z5 && this.f470i.hasFocus() && getVisibility() == 0) {
                boolean z6 = true;
                this.f471j = true;
                Context context = getContext();
                m3 m3Var = SearchView.f453j0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z6 = false;
                }
                if (z6) {
                    a();
                }
            }
        }

        public final void performCompletion() {
        }

        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z5) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            p3 p3Var = this.f472k;
            if (!z5) {
                this.f471j = false;
                removeCallbacks(p3Var);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f471j = false;
                removeCallbacks(p3Var);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f471j = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f470i = searchView;
        }

        public void setThreshold(int i3) {
            super.setThreshold(i3);
            this.f469h = i3;
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f462s;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void c() {
        if (!this.f456c0) {
            this.f456c0 = true;
            SearchAutoComplete searchAutoComplete = this.f462s;
            int imeOptions = searchAutoComplete.getImeOptions();
            this.f457d0 = imeOptions;
            searchAutoComplete.setImeOptions(imeOptions | 33554432);
            searchAutoComplete.setText("");
            setIconified(false);
        }
    }

    public final void clearFocus() {
        this.V = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f462s;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.V = false;
    }

    public final void e() {
        SearchAutoComplete searchAutoComplete = this.f462s;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f455b0 = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f457d0);
        this.f456c0 = false;
    }

    public int getImeOptions() {
        return this.f462s.getImeOptions();
    }

    public int getInputType() {
        return this.f462s.getInputType();
    }

    public int getMaxWidth() {
        return this.W;
    }

    public CharSequence getQuery() {
        return this.f462s.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.T;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f458e0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.M : getContext().getText(this.f458e0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.J;
    }

    public int getSuggestionRowLayout() {
        return this.I;
    }

    public a getSuggestionsAdapter() {
        return this.R;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f455b0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f458e0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i3 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f462s;
        if (i3 >= 29) {
            i3.a(searchAutoComplete);
            return;
        }
        m3 m3Var = f453j0;
        m3Var.getClass();
        m3.n();
        Object obj = m3Var.f685a;
        if (((Method) obj) != null) {
            try {
                ((Method) obj).invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        m3Var.getClass();
        m3.n();
        Object obj2 = m3Var.f686b;
        if (((Method) obj2) != null) {
            try {
                ((Method) obj2).invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f462s;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.P) {
            clearFocus();
            y(true);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.f459g0);
        post(this.f460h0);
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        super.onLayout(z5, i3, i6, i7, i8);
        if (z5) {
            SearchAutoComplete searchAutoComplete = this.f462s;
            int[] iArr = this.E;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.F;
            getLocationInWindow(iArr2);
            int i9 = iArr[1] - iArr2[1];
            int i10 = iArr[0] - iArr2[0];
            Rect rect = this.C;
            rect.set(i10, i9, searchAutoComplete.getWidth() + i10, searchAutoComplete.getHeight() + i9);
            int i11 = rect.left;
            int i12 = rect.right;
            int i13 = i8 - i6;
            Rect rect2 = this.D;
            rect2.set(i11, 0, i12, i13);
            q3 q3Var = this.B;
            if (q3Var == null) {
                q3 q3Var2 = new q3(rect2, rect, searchAutoComplete);
                this.B = q3Var2;
                setTouchDelegate(q3Var2);
                return;
            }
            q3Var.f742b.set(rect2);
            Rect rect3 = q3Var.f744d;
            rect3.set(rect2);
            int i14 = -q3Var.f745e;
            rect3.inset(i14, i14);
            q3Var.f743c.set(rect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 <= 0) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.Q
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002a
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            int r0 = r3.W
            if (r0 <= 0) goto L_0x0037
            goto L_0x002e
        L_0x0020:
            int r4 = r3.W
            if (r4 <= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r4 = r3.getPreferredWidth()
            goto L_0x0037
        L_0x002a:
            int r0 = r3.W
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            goto L_0x0033
        L_0x002f:
            int r0 = r3.getPreferredWidth()
        L_0x0033:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0037:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            int r5 = r3.getPreferredHeight()
            goto L_0x0051
        L_0x0049:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0051:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o3 o3Var = (o3) parcelable;
        super.onRestoreInstanceState(o3Var.f2483d);
        y(o3Var.f718f);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        o3 o3Var = new o3(super.onSaveInstanceState());
        o3Var.f718f = this.Q;
        return o3Var;
    }

    public final void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        post(this.f459g0);
    }

    public final void p(int i3) {
        int i6;
        String h6;
        Cursor cursor = this.R.f1600f;
        if (cursor != null && cursor.moveToPosition(i3)) {
            Intent intent = null;
            try {
                int i7 = s3.A;
                String h7 = s3.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h7 == null) {
                    h7 = this.f458e0.getSuggestIntentAction();
                }
                if (h7 == null) {
                    h7 = "android.intent.action.SEARCH";
                }
                String h8 = s3.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h8 == null) {
                    h8 = this.f458e0.getSuggestIntentData();
                }
                if (!(h8 == null || (h6 = s3.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    h8 = h8 + "/" + Uri.encode(h6);
                }
                intent = l(h7, h8 == null ? null : Uri.parse(h8), s3.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), s3.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e6) {
                try {
                    i6 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i6 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i6 + " returned exception.", e6);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e7) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e7);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f462s;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q(int i3) {
        String c6;
        Editable text = this.f462s.getText();
        Cursor cursor = this.R.f1600f;
        if (cursor != null) {
            if (!cursor.moveToPosition(i3) || (c6 = this.R.c(cursor)) == null) {
                setQuery(text);
            } else {
                setQuery(c6);
            }
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final boolean requestFocus(int i3, Rect rect) {
        if (this.V || !isFocusable()) {
            return false;
        }
        if (this.Q) {
            return super.requestFocus(i3, rect);
        }
        boolean requestFocus = this.f462s.requestFocus(i3, rect);
        if (requestFocus) {
            y(false);
        }
        return requestFocus;
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.f462s;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f458e0 != null) {
                getContext().startActivity(l("android.intent.action.SEARCH", (Uri) null, (String) null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f0 = bundle;
    }

    public void setIconified(boolean z5) {
        if (z5) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.f462s;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.O;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z5) {
        if (this.P != z5) {
            this.P = z5;
            y(z5);
            v();
        }
    }

    public void setImeOptions(int i3) {
        this.f462s.setImeOptions(i3);
    }

    public void setInputType(int i3) {
        this.f462s.setInputType(i3);
    }

    public void setMaxWidth(int i3) {
        this.W = i3;
        requestLayout();
    }

    public void setOnCloseListener(j3 j3Var) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(k3 k3Var) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.O = onClickListener;
    }

    public void setOnSuggestionListener(l3 l3Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.T = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z5) {
        this.U = z5;
        a aVar = this.R;
        if (aVar instanceof s3) {
            ((s3) aVar).f777s = z5 ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (getContext().getPackageManager().resolveActivity(r3, 65536) != null) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.f458e0 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.f462s
            r1 = 1
            r2 = 65536(0x10000, float:9.18355E-41)
            r3 = 0
            if (r8 == 0) goto L_0x0068
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.f458e0
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.f458e0
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L_0x0034
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.f458e0
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L_0x0034
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L_0x0034:
            r0.setInputType(r8)
            c1.a r8 = r7.R
            if (r8 == 0) goto L_0x003e
            r8.b(r3)
        L_0x003e:
            android.app.SearchableInfo r8 = r7.f458e0
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L_0x0065
            androidx.appcompat.widget.s3 r8 = new androidx.appcompat.widget.s3
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.f458e0
            java.util.WeakHashMap r6 = r7.f461i0
            r8.<init>(r4, r7, r5, r6)
            r7.R = r8
            r0.setAdapter(r8)
            c1.a r8 = r7.R
            androidx.appcompat.widget.s3 r8 = (androidx.appcompat.widget.s3) r8
            boolean r4 = r7.U
            if (r4 == 0) goto L_0x0062
            r4 = 2
            goto L_0x0063
        L_0x0062:
            r4 = r1
        L_0x0063:
            r8.f777s = r4
        L_0x0065:
            r7.v()
        L_0x0068:
            android.app.SearchableInfo r8 = r7.f458e0
            if (r8 == 0) goto L_0x0098
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L_0x0098
            android.app.SearchableInfo r8 = r7.f458e0
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L_0x007d
            android.content.Intent r3 = r7.K
            goto L_0x0087
        L_0x007d:
            android.app.SearchableInfo r8 = r7.f458e0
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L_0x0087
            android.content.Intent r3 = r7.L
        L_0x0087:
            if (r3 == 0) goto L_0x0098
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            r7.f454a0 = r1
            if (r1 == 0) goto L_0x00a2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        L_0x00a2:
            boolean r8 = r7.Q
            r7.y(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z5) {
        this.S = z5;
        y(this.Q);
    }

    public void setSuggestionsAdapter(a aVar) {
        this.R = aVar;
        this.f462s.setAdapter(aVar);
    }

    public final void t() {
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(this.f462s.getText());
        int i3 = 0;
        if (!z6 && (!this.P || this.f456c0)) {
            z5 = false;
        }
        if (!z5) {
            i3 = 8;
        }
        ImageView imageView = this.f467y;
        imageView.setVisibility(i3);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z6 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void u() {
        int[] iArr = this.f462s.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f464u.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f465v.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z5 = this.P;
        SearchAutoComplete searchAutoComplete = this.f462s;
        if (z5 && (drawable = this.H) != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void w() {
        int i3 = 0;
        if (!((this.S || this.f454a0) && !this.Q) || !(this.f466x.getVisibility() == 0 || this.f468z.getVisibility() == 0)) {
            i3 = 8;
        }
        this.f465v.setVisibility(i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (r2.f454a0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.S
            if (r0 == 0) goto L_0x0021
            r1 = 0
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.f454a0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.Q
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.f454a0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.f466x
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.x(boolean):void");
    }

    public final void y(boolean z5) {
        this.Q = z5;
        int i3 = 0;
        int i6 = z5 ? 0 : 8;
        boolean z6 = !TextUtils.isEmpty(this.f462s.getText());
        this.w.setVisibility(i6);
        x(z6);
        this.f463t.setVisibility(z5 ? 8 : 0);
        ImageView imageView = this.G;
        imageView.setVisibility((imageView.getDrawable() == null || this.P) ? 8 : 0);
        t();
        boolean z7 = !z6;
        if (!this.f454a0 || this.Q || !z7) {
            i3 = 8;
        } else {
            this.f466x.setVisibility(8);
        }
        this.f468z.setVisibility(i3);
        w();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        Context context2 = context;
        this.C = new Rect();
        this.D = new Rect();
        this.E = new int[2];
        this.F = new int[2];
        this.f459g0 = new b3(this, 0);
        this.f460h0 = new b3(this, 1);
        this.f461i0 = new WeakHashMap();
        e3 e3Var = new e3(this);
        f3 f3Var = new f3(this);
        g3 g3Var = new g3(this);
        h3 h3Var = new h3(this, 0);
        i2 i2Var = new i2(1, this);
        a3 a3Var = new a3(this, 0);
        int[] iArr = d.a.f2133u;
        AttributeSet attributeSet2 = attributeSet;
        int i6 = i3;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i6, 0);
        m3 m3Var = new m3(context2, obtainStyledAttributes);
        u0.k(this, context, iArr, attributeSet2, obtainStyledAttributes, i6);
        LayoutInflater.from(context).inflate(m3Var.i(19, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f462s = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f463t = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f464u = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f465v = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.w = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f466x = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f467y = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f468z = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.G = imageView5;
        d0.q(findViewById, m3Var.e(20));
        d0.q(findViewById2, m3Var.e(25));
        imageView.setImageDrawable(m3Var.e(23));
        imageView2.setImageDrawable(m3Var.e(15));
        imageView3.setImageDrawable(m3Var.e(12));
        imageView4.setImageDrawable(m3Var.e(28));
        imageView5.setImageDrawable(m3Var.e(23));
        this.H = m3Var.e(22);
        f4.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.I = m3Var.i(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.J = m3Var.i(13, 0);
        imageView.setOnClickListener(e3Var);
        imageView3.setOnClickListener(e3Var);
        imageView2.setOnClickListener(e3Var);
        imageView4.setOnClickListener(e3Var);
        searchAutoComplete.setOnClickListener(e3Var);
        searchAutoComplete.addTextChangedListener(a3Var);
        searchAutoComplete.setOnEditorActionListener(g3Var);
        searchAutoComplete.setOnItemClickListener(h3Var);
        searchAutoComplete.setOnItemSelectedListener(i2Var);
        searchAutoComplete.setOnKeyListener(f3Var);
        searchAutoComplete.setOnFocusChangeListener(new c3(this));
        setIconifiedByDefault(m3Var.a(18, true));
        int d6 = m3Var.d(2, -1);
        if (d6 != -1) {
            setMaxWidth(d6);
        }
        this.M = m3Var.k(14);
        this.T = m3Var.k(21);
        int h6 = m3Var.h(6, -1);
        if (h6 != -1) {
            setImeOptions(h6);
        }
        int h7 = m3Var.h(5, -1);
        if (h7 != -1) {
            setInputType(h7);
        }
        setFocusable(m3Var.a(1, true));
        m3Var.o();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.K = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.L = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.A = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new d3(0, this));
        }
        y(this.P);
        v();
    }
}
