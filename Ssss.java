class Ssss {
public static void main(String[] args) {
int num = 95 ;
String S = "MYSELF" ;
switch(S) {
case "Myself":
System.out.println(S);
break;
case "MYSELF":
System.out.println("MATCH\t" + S);
break;
default:
System.out.println("DEFAULT");
}
if (num%2==0) {
System.out.println("EVEN");
}
else {
for (int i = 2;i<num;i++) {
if (num%i == 0) {
System.out.println("FInally\t" + i);
break;
}
}
}
}
} 