package com.theori.dreamdrm;

import b1.o;

public final class FileItem {
    public static final int $stable = 0;
    private final String bookname;
    private final int id;
    private final String thumbnail;

    public final String a() {
        return this.bookname;
    }

    public final int b() {
        return this.id;
    }

    public final String c() {
        return this.thumbnail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileItem)) {
            return false;
        }
        FileItem fileItem = (FileItem) obj;
        return this.id == fileItem.id && o.c(this.bookname, fileItem.bookname) && o.c(this.thumbnail, fileItem.thumbnail);
    }

    public final int hashCode() {
        int hashCode = this.bookname.hashCode();
        return this.thumbnail.hashCode() + ((hashCode + (Integer.hashCode(this.id) * 31)) * 31);
    }

    public final String toString() {
        return "FileItem(id=" + this.id + ", bookname=" + this.bookname + ", thumbnail=" + this.thumbnail + ')';
    }
}
