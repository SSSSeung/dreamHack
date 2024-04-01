package com.theori.dreamdrm;

import android.os.Bundle;
import androidx.activity.i;
import com.github.barteksc.pdfviewer.PDFView;
import e.l;
import e2.f;
import java.io.File;
import t2.d;
import v2.a;
import v2.b;
import v2.c;
import v2.e;

public final class PdfViewerActivity extends l {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_pdf_viewer);
        PDFView pDFView = (PDFView) findViewById(R.id.pdfView);
        File file = new File(getIntent().getStringExtra("pdfFilePath"));
        pDFView.getClass();
        d dVar = new d(pDFView, new f(8, file));
        pDFView.s();
        pDFView.setOnDrawListener((a) null);
        pDFView.setOnDrawAllListener((a) null);
        pDFView.setOnPageChangeListener((b) null);
        pDFView.setOnPageScrollListener((v2.d) null);
        pDFView.setOnRenderListener((e) null);
        pDFView.setOnTapListener((v2.f) null);
        pDFView.setOnPageErrorListener((c) null);
        t2.c cVar = pDFView.f1797j;
        cVar.f5194h = true;
        cVar.f5192f.setOnDoubleTapListener(cVar);
        pDFView.setDefaultPage(0);
        pDFView.setSwipeVertical(true);
        pDFView.H = false;
        pDFView.setScrollHandle((x2.a) null);
        pDFView.I = true;
        pDFView.setSpacing(0);
        pDFView.setInvalidPageColor(-1);
        pDFView.post(new i(9, dVar));
    }
}
