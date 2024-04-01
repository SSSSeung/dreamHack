package com.theori.dreamdrm;

import b1.o;

public final class DecryptionItem {
    public static final int $stable = 0;
    private final String fileKey;
    private final boolean success;
    private final String token;

    public final String a() {
        return this.fileKey;
    }

    public final boolean b() {
        return this.success;
    }

    public final String c() {
        return this.token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecryptionItem)) {
            return false;
        }
        DecryptionItem decryptionItem = (DecryptionItem) obj;
        return this.success == decryptionItem.success && o.c(this.token, decryptionItem.token) && o.c(this.fileKey, decryptionItem.fileKey);
    }

    public final int hashCode() {
        boolean z5 = this.success;
        if (z5) {
            z5 = true;
        }
        int hashCode = this.token.hashCode();
        return this.fileKey.hashCode() + ((hashCode + ((z5 ? 1 : 0) * true)) * 31);
    }

    public final String toString() {
        return "DecryptionItem(success=" + this.success + ", token=" + this.token + ", fileKey=" + this.fileKey + ')';
    }
}
