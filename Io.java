import java.io.*;
import java.util.*;

public class Io {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        String name=z.next();
        int age=z.nextInt();
        float CGPA=z.nextFloat();
        float ans=(int)(CGPA*100);
        char grade=z.next().charAt(0);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.printf("CGPA: %.2f\n",ans/100);
        System.out.println("Grade: "+grade);
    }
}
