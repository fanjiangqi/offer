package io;

import java.io.*;

/**
 * Created by fanji on 2017/3/1.
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in){
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    public static void main(String[] args) {
        try {
            int c;
            FileInputStream file = new FileInputStream("test.txt");
            BufferedInputStream buff = new BufferedInputStream(file);
            LowerCaseInputStream in = new LowerCaseInputStream(buff);
            while ((c = in.read()) > 0){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
