package i1;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public final class b extends InputStream implements DataInput {

    /* renamed from: h  reason: collision with root package name */
    public static final ByteOrder f3557h = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: i  reason: collision with root package name */
    public static final ByteOrder f3558i = ByteOrder.BIG_ENDIAN;

    /* renamed from: d  reason: collision with root package name */
    public final DataInputStream f3559d;

    /* renamed from: e  reason: collision with root package name */
    public ByteOrder f3560e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3561f;

    /* renamed from: g  reason: collision with root package name */
    public int f3562g;

    public b(InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f3560e = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f3559d = dataInputStream;
        int available = dataInputStream.available();
        this.f3561f = available;
        this.f3562g = 0;
        dataInputStream.mark(available);
        this.f3560e = byteOrder;
    }

    public final int available() {
        return this.f3559d.available();
    }

    public final void b(long j6) {
        int i3 = this.f3562g;
        if (((long) i3) > j6) {
            this.f3562g = 0;
            DataInputStream dataInputStream = this.f3559d;
            dataInputStream.reset();
            dataInputStream.mark(this.f3561f);
        } else {
            j6 -= (long) i3;
        }
        int i6 = (int) j6;
        if (skipBytes(i6) != i6) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public final int read() {
        this.f3562g++;
        return this.f3559d.read();
    }

    public final boolean readBoolean() {
        this.f3562g++;
        return this.f3559d.readBoolean();
    }

    public final byte readByte() {
        int i3 = this.f3562g + 1;
        this.f3562g = i3;
        if (i3 <= this.f3561f) {
            int read = this.f3559d.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final char readChar() {
        this.f3562g += 2;
        return this.f3559d.readChar();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr) {
        int length = this.f3562g + bArr.length;
        this.f3562g = length;
        if (length > this.f3561f) {
            throw new EOFException();
        } else if (this.f3559d.read(bArr, 0, bArr.length) != bArr.length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public final int readInt() {
        int i3 = this.f3562g + 4;
        this.f3562g = i3;
        if (i3 <= this.f3561f) {
            DataInputStream dataInputStream = this.f3559d;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f3560e;
                if (byteOrder == f3557h) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f3558i) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f3560e);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    public final long readLong() {
        int i3 = this.f3562g + 8;
        this.f3562g = i3;
        if (i3 <= this.f3561f) {
            DataInputStream dataInputStream = this.f3559d;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            int read5 = dataInputStream.read();
            int read6 = dataInputStream.read();
            int read7 = dataInputStream.read();
            int read8 = dataInputStream.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f3560e;
                if (byteOrder == f3557h) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i6 = read;
                if (byteOrder == f3558i) {
                    return (((long) i6) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f3560e);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final short readShort() {
        int i3 = this.f3562g + 2;
        this.f3562g = i3;
        if (i3 <= this.f3561f) {
            DataInputStream dataInputStream = this.f3559d;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f3560e;
                if (byteOrder == f3557h) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f3558i) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f3560e);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final String readUTF() {
        this.f3562g += 2;
        return this.f3559d.readUTF();
    }

    public final int readUnsignedByte() {
        this.f3562g++;
        return this.f3559d.readUnsignedByte();
    }

    public final int readUnsignedShort() {
        int i3 = this.f3562g + 2;
        this.f3562g = i3;
        if (i3 <= this.f3561f) {
            DataInputStream dataInputStream = this.f3559d;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f3560e;
                if (byteOrder == f3557h) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f3558i) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f3560e);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final int skipBytes(int i3) {
        int min = Math.min(i3, this.f3561f - this.f3562g);
        int i6 = 0;
        while (i6 < min) {
            i6 += this.f3559d.skipBytes(min - i6);
        }
        this.f3562g += i6;
        return i6;
    }

    public b(byte[] bArr) {
        this((InputStream) new ByteArrayInputStream(bArr));
    }

    public final int read(byte[] bArr, int i3, int i6) {
        int read = this.f3559d.read(bArr, i3, i6);
        this.f3562g += read;
        return read;
    }

    public final void readFully(byte[] bArr, int i3, int i6) {
        int i7 = this.f3562g + i6;
        this.f3562g = i7;
        if (i7 > this.f3561f) {
            throw new EOFException();
        } else if (this.f3559d.read(bArr, i3, i6) != i6) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }
}
