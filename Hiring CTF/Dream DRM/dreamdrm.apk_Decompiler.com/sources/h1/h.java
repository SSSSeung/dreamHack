package h1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.compose.ui.platform.e;

public final class h extends e {

    /* renamed from: o  reason: collision with root package name */
    public final TextView f3370o;

    /* renamed from: p  reason: collision with root package name */
    public final f f3371p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3372q = true;

    public h(TextView textView) {
        super(27);
        this.f3370o = textView;
        this.f3371p = new f(textView);
    }

    public final void A(boolean z5) {
        this.f3372q = z5;
        D();
        TextView textView = this.f3370o;
        textView.setFilters(p(textView.getFilters()));
    }

    public final void D() {
        TextView textView = this.f3370o;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f3372q) {
            if (!(transformationMethod instanceof l) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new l(transformationMethod);
            }
        } else if (transformationMethod instanceof l) {
            transformationMethod = ((l) transformationMethod).f3379a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        if (!this.f3372q) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i3 = 0; i3 < inputFilterArr.length; i3++) {
                InputFilter inputFilter = inputFilterArr[i3];
                if (inputFilter instanceof f) {
                    sparseArray.put(i3, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                if (sparseArray.indexOfKey(i7) < 0) {
                    inputFilterArr2[i6] = inputFilterArr[i7];
                    i6++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i8 = 0;
        while (true) {
            f fVar = this.f3371p;
            if (i8 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = fVar;
                return inputFilterArr3;
            } else if (inputFilterArr[i8] == fVar) {
                return inputFilterArr;
            } else {
                i8++;
            }
        }
    }

    public final void x(boolean z5) {
        if (z5) {
            D();
        }
    }
}
