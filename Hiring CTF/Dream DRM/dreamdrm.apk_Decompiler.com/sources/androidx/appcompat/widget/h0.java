package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import r0.e;
import r0.f;

public class h0 {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f620c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f621a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f622b;

    public h0(ProgressBar progressBar) {
        this.f621a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i3) {
        ProgressBar progressBar = this.f621a;
        m3 m6 = m3.m(progressBar.getContext(), attributeSet, f620c, i3);
        Drawable f6 = m6.f(0);
        if (f6 != null) {
            if (f6 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) f6;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i6 = 0; i6 < numberOfFrames; i6++) {
                    Drawable b6 = b(animationDrawable.getFrame(i6), true);
                    b6.setLevel(10000);
                    animationDrawable2.addFrame(b6, animationDrawable.getDuration(i6));
                }
                animationDrawable2.setLevel(10000);
                f6 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(f6);
        }
        Drawable f7 = m6.f(1);
        if (f7 != null) {
            progressBar.setProgressDrawable(b(f7, false));
        }
        m6.o();
    }

    public final Drawable b(Drawable drawable, boolean z5) {
        if (drawable instanceof e) {
            ((f) ((e) drawable)).getClass();
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i3 = 0; i3 < numberOfLayers; i3++) {
                int id = layerDrawable.getId(i3);
                drawableArr[i3] = b(layerDrawable.getDrawable(i3), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i6 = 0; i6 < numberOfLayers; i6++) {
                layerDrawable2.setId(i6, layerDrawable.getId(i6));
                layerDrawable2.setLayerGravity(i6, layerDrawable.getLayerGravity(i6));
                layerDrawable2.setLayerWidth(i6, layerDrawable.getLayerWidth(i6));
                layerDrawable2.setLayerHeight(i6, layerDrawable.getLayerHeight(i6));
                layerDrawable2.setLayerInsetLeft(i6, layerDrawable.getLayerInsetLeft(i6));
                layerDrawable2.setLayerInsetRight(i6, layerDrawable.getLayerInsetRight(i6));
                layerDrawable2.setLayerInsetTop(i6, layerDrawable.getLayerInsetTop(i6));
                layerDrawable2.setLayerInsetBottom(i6, layerDrawable.getLayerInsetBottom(i6));
                layerDrawable2.setLayerInsetStart(i6, layerDrawable.getLayerInsetStart(i6));
                layerDrawable2.setLayerInsetEnd(i6, layerDrawable.getLayerInsetEnd(i6));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f622b == null) {
                this.f622b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z5 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
