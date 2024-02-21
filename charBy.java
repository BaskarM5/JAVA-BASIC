import java.util.Scanner;
class charBy {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String wor ;
wor = sc.nextLine();
for(int i=0; i<wor.length();i++){
System.out.println(wor.charAt(i));
}
}
}