package io.pack;
import java.io.*;
public class ByteArrayOutputStreamExample {
    public static void main(String[] args)throws Exception{
        FileOutputStream fout1=new FileOutputStream("/Users/ishasethia/Desktop/newstudent.txt");
        FileOutputStream fout2=new FileOutputStream("/Users/ishasethia/Desktop/file.txt");

        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fout1);
        bout.writeTo(fout2);

      //  bout.flush();
        bout.close();//has no effect
        System.out.println("Success...");
    }

}
