import java.util.Scanner ;
class Arrinput {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter Length");
int len = s.nextInt();
int[] Arr = new int[len] ;
for(int i = 0;i<len;i++) {
System.out.println("Enter Elemenet" +i);
Arr [i] = s.nextInt();
}
for(int j = 0;j<len;j++)
{
System.out.println(Arr[j]);
}
}
}

