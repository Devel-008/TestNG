package io.pack;

import java.io.*;
public class FilterExample {
    public static void main(String[] args) throws IOException {
        File data = new File("/Users/ishasethia/Desktop/test.txt");
        FileOutputStream file = new FileOutputStream(data);
        FilterOutputStream filter = new FilterOutputStream(file);
        String s="Welcome to javaTpoint.";
        byte[] b =s.getBytes();
        filter.write(b);
        filter.flush();
        filter.close();
        file.close();
        System.out.println("Success...");
    }
}