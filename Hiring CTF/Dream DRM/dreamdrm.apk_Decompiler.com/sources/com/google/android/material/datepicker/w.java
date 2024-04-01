package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f1983a = new AtomicReference();

    public static DateFormat a(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    public static Calendar b(Calendar calendar) {
        Calendar d6 = d(calendar);
        Calendar d7 = d((Calendar) null);
        d7.set(d6.get(1), d6.get(2), d6.get(5));
        return d7;
    }

    public static Calendar c() {
        v vVar = (v) f1983a.get();
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return instance;
    }

    public static Calendar d(Calendar calendar) {
        Calendar instance = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
