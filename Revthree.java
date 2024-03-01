import java.io.*;
import java.util.*;

public class Revthree {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a,r;
            a=z.nextInt();
        while(a!=0)
        {
            r=a%10;
            System.out.print(r);
            a=a/10;
        }
        
    }
}
