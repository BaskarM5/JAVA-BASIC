import java.util.Scanner;
import java.time.*;
class leap {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Year thisyear = Year.now();

int year = sc.nextInt();
if(year%4==0) {
System.out.println("Leap Year");
}
else {
System.out.println("Not A Leap Year");
}
}
}