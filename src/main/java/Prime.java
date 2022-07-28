import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value:=");
        int a=sc.nextInt();
        int c=0;
        for(int i=1;i<=9;i++)
        {
            if(a%i==0)
            {
                c++;
            }
        }
        if(c<=2)
        {
            if(a==1||a==0)
            {
                System.out.println("not prime nor prime");
            }
            else {
                System.out.println("prime");
            }
        }
        else{
            System.out.println("not a prime");
        }

    }
}
