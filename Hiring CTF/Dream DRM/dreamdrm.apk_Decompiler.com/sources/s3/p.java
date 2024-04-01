package s3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.i1;

public final class p extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5015a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f5016b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f5017c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextView f5018d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ r f5019e;

    public p(r rVar, int i3, TextView textView, int i6, TextView textView2) {
        this.f5019e = rVar;
        this.f5015a = i3;
        this.f5016b = textView;
        this.f5017c = i6;
        this.f5018d = textView2;
    }

    public final void onAnimationEnd(Animator animator) {
        i1 i1Var;
        int i3 = this.f5015a;
        r rVar = this.f5019e;
        rVar.f5034n = i3;
        rVar.f5032l = null;
        TextView textView = this.f5016b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f5017c == 1 && (i1Var = rVar.f5038r) != null) {
                i1Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f5018d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f5018d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
