package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.n0;
import com.bumptech.glide.h;
import e2.m;
import h2.v;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import r2.d;
import r2.f;
import y1.a;

public final class l implements e {

    /* renamed from: d  reason: collision with root package name */
    public final m f1771d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1772e;

    /* renamed from: f  reason: collision with root package name */
    public HttpURLConnection f1773f;

    /* renamed from: g  reason: collision with root package name */
    public InputStream f1774g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f1775h;

    static {
        new n0(11);
    }

    public l(m mVar, int i3) {
        this.f1771d = mVar;
        this.f1772e = i3;
    }

    public static int e(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e6) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e6);
            return -1;
        }
    }

    public final Class a() {
        return InputStream.class;
    }

    public final void b() {
        InputStream inputStream = this.f1774g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f1773f;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f1773f = null;
    }

    public final a c() {
        return a.f5801e;
    }

    public final void cancel() {
        this.f1775h = true;
    }

    public final void d(h hVar, d dVar) {
        StringBuilder sb;
        m mVar = this.f1771d;
        int i3 = f.f4927b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            dVar.l(f(mVar.d(), 0, (URL) null, mVar.f2522b.a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e6) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e6);
            }
            dVar.h(e6);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + f.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i3, URL url2, Map map) {
        InputStream inputStream;
        if (i3 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new v("In re-direct loop", -1, (IOException) null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z5 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int i6 = this.f1772e;
                httpURLConnection.setConnectTimeout(i6);
                httpURLConnection.setReadTimeout(i6);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f1773f = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f1774g = this.f1773f.getInputStream();
                    if (this.f1775h) {
                        return null;
                    }
                    int e6 = e(this.f1773f);
                    int i7 = e6 / 100;
                    if (i7 == 2) {
                        HttpURLConnection httpURLConnection2 = this.f1773f;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                inputStream = new d(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                inputStream = httpURLConnection2.getInputStream();
                            }
                            this.f1774g = inputStream;
                            return inputStream;
                        } catch (IOException e7) {
                            throw new v("Failed to obtain InputStream", e(httpURLConnection2), e7);
                        }
                    } else {
                        if (i7 == 3) {
                            z5 = true;
                        }
                        if (z5) {
                            String headerField = this.f1773f.getHeaderField("Location");
                            if (!TextUtils.isEmpty(headerField)) {
                                try {
                                    URL url3 = new URL(url, headerField);
                                    b();
                                    return f(url3, i3 + 1, url, map);
                                } catch (MalformedURLException e8) {
                                    throw new v("Bad redirect url: " + headerField, e6, e8);
                                }
                            } else {
                                throw new v("Received empty or null redirect url", e6, (IOException) null);
                            }
                        } else if (e6 == -1) {
                            throw new v("Http request failed", e6, (IOException) null);
                        } else {
                            try {
                                throw new v(this.f1773f.getResponseMessage(), e6, (IOException) null);
                            } catch (IOException e9) {
                                throw new v("Failed to get a response message", e6, e9);
                            }
                        }
                    }
                } catch (IOException e10) {
                    throw new v("Failed to connect or obtain data", e(this.f1773f), e10);
                }
            } catch (IOException e11) {
                throw new v("URL.openConnection threw", 0, e11);
            }
        } else {
            throw new v("Too many (> 5) redirects!", -1, (IOException) null);
        }
    }
}
