import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataStreamExample {
    public static void main(String[] args){
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("/Users/ishasethia/Desktop/newstudent.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            int i=fin.read();
            System.out.println((char)i);

        }catch(Exception e){System.out.println("error"+e);}
        try{

            int i;
            while((i=fin.read())!=-1){
                System.out.print((char)i);

            }
        }catch (Exception e){
            System.out.println("error"+e);
        }finally {
            try {
                fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}