import java.io.*;
import java.util.*;

public class AutoMorphic {

    public static void main(String[] args) {

        Scanner z=new Scanner(System.in);
        int n,ans;
        n=z.nextInt();
        ans=n*n;    // double ans=Math.pow(n,2);
        
        if(ans%10==n)
            System.out.print("Automorphic Number");
        else
            System.out.print("Not an Automorphic Number");
        
    }
}
