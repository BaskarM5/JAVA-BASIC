class Wlooping {
public static void main(String[] args) {
int i = 55 ;
while(true) {
System.out.println(i);
i++ ;
if (i==59)
{
break;
}
}
int r = 6;
do {
System.out.println(r);
r-- ;
}while (r>=3);
}
}