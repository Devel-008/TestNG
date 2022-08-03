package io.pack;
import java.io.*;
import java.util.*;
class Input2{
    public static void main(String[] args)throws IOException{
//creating the FileInputStream objects for all the files
        FileInputStream fin=new FileInputStream("/Users/ishasethia/Desktop/newstudent.txt");
        FileInputStream fin2=new FileInputStream("/Users/ishasethia/Desktop/test.txt");
        FileInputStream fin3=new FileInputStream("/Users/ishasethia/Desktop/file.txt");
        FileInputStream fin4=new FileInputStream("/Users/ishasethia/Desktop/newstd.json");
//creating Vector object to all the stream
        Vector<FileInputStream> v=new Vector<>();
        v.add(fin);
        v.add(fin2);
        v.add(fin3);
        v.add(fin4);
//creating enumeration object by calling the elements method
        Enumeration<FileInputStream> e=v.elements();
//passing the enumeration object in the constructor
        SequenceInputStream bin=new SequenceInputStream(e);
        int i;
        while((i=bin.read())!=-1){
            System.out.print((char)i);
        }
        bin.close();
        fin.close();
        fin2.close();
    }
}