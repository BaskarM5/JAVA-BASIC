import java.io.*;
import java.util.*;

public class Electricity {

    public static void main(String[] args) {
        int n;
        Scanner z=new Scanner(System.in);
        n=z.nextInt();
        
        if(n<=200)
            System.out.print("Rs."+(int)(n*0.5));
        else if(n<=400)
            System.out.print("Rs."+(int)(n*.65+100));
        else if(n<=600)
            System.out.print("Rs."+(int)(n*.80+200));
        else
            System.out.print("Rs."+(int)(n*1.25+425));
        
    }
}
