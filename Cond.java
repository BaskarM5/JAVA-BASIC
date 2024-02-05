class Cond {
public static void main(String[] args) {
int s = 7;
boolean r = true;
System.out.println(r);
if (r) {
System.out.println("TRUE");
}

if (s<11) {
System.out.println("SMALL");
}


if (s==5) { 
System.out.println(s);
  }
else {
s +=1;
System.out.println(s);
}
// ternary operator
int e = (s>11)?11:88 ;
System.out.println(e);


}
}