package i5;

import android.util.Log;
import b1.o;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import v4.i;

public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final d f3611a = new d();

    public final void close() {
    }

    public final void flush() {
    }

    public final void publish(LogRecord logRecord) {
        int min;
        o.m(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f3609a;
        String loggerName = logRecord.getLoggerName();
        o.l(loggerName, "record.loggerName");
        int i3 = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        o.l(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f3610b.get(loggerName);
        if (str == null) {
            int length = loggerName.length();
            if (23 <= length) {
                length = 23;
            }
            str = loggerName.substring(0, length);
            o.l(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (Log.isLoggable(str, i3)) {
            if (thrown != null) {
                message = message + "\n" + Log.getStackTraceString(thrown);
            }
            int length2 = message.length();
            int i6 = 0;
            while (i6 < length2) {
                int X = i.X(message, 10, i6, false, 4);
                if (X == -1) {
                    X = length2;
                }
                while (true) {
                    min = Math.min(X, i6 + 4000);
                    String substring = message.substring(i6, min);
                    o.l(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i3, str, substring);
                    if (min >= X) {
                        break;
                    }
                    i6 = min;
                }
                i6 = min + 1;
            }
        }
    }
}
