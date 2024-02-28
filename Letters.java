import java.io.*;
import java.util.*;

public class Letters {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        char a=z.next().charAt(0);
        
        if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
        {
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }
        else
            System.out.println("Not an alphabet");
        
    }
}
