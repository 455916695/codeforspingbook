package com.ax.designMode.zhuangShiZhe;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 自己创建一个 LowerCaseInputStream 对象
 * 继承FilterInputStream
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {  //读取一个字节的
        int read = super.read();
        return read == -1 ? -1 : Character.toLowerCase((char) read);
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int read = super.read(b, offset, len);
        for (int i = offset; i < offset + len; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return read;
    }


}
