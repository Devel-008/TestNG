package io.pack;

import java.io.*;
public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("/Users/ishasethia/Desktop/newstd.json");
        DataInputStream inst = new DataInputStream(input);
        int count = input.available();
        byte[] ary = new byte[count];
        inst.read(ary);
        for (byte bt : ary) {
            char k = (char) bt;
            System.out.print(k+"-");
        }
    }
}
