import java.util.Scanner;
class Call {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter A Digit:"):
int n = sc.nextInt();
square(n);
cube(n);
}
static void square(int l) {
System.out.println("Square of " +l+ " is  " +l*l);
}
static void cube(int l) {
System.out.println("cube of " +l+ " is  " +l*l*l);
}
} 
