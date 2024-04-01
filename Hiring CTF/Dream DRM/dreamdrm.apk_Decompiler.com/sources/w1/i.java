package w1;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f5465a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i3 = 0;
            while (i3 < length) {
                File file2 = listFiles[i3];
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (file2.delete()) {
                    i3++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
