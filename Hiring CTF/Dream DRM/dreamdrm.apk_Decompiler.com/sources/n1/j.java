package n1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f4253a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4254b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4255c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4256d;

    public j(int i3, int i6, long j6, long j7) {
        this.f4253a = i3;
        this.f4254b = i6;
        this.f4255c = j6;
        this.f4256d = j7;
    }

    public static j a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f4253a);
            dataOutputStream.writeInt(this.f4254b);
            dataOutputStream.writeLong(this.f4255c);
            dataOutputStream.writeLong(this.f4256d);
            dataOutputStream.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f4254b == jVar.f4254b && this.f4255c == jVar.f4255c && this.f4253a == jVar.f4253a && this.f4256d == jVar.f4256d;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f4254b), Long.valueOf(this.f4255c), Integer.valueOf(this.f4253a), Long.valueOf(this.f4256d)});
    }
}
