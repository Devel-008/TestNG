package io.pack;

import java.io.*;
public class BufferedOutputStreamExample{
    public static void main(String[] args)throws Exception{
        FileOutputStream fout=new FileOutputStream("/Users/ishasethia/Desktop/newstudent.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="welcome to javaTpoint.";
        byte[] b =s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}  