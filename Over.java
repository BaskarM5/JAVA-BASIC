class Over {
public static void main(String[] args) {
System.out.println(Met(5));
System.out.println(Met("BAS"));
System.out.println(Met(50.5));
}
static int Met(int s) {
return s*s ;
}
static char Met(String l) {
return l.charAt(1);
}
static double Met(Double d) {
return d+d ;
}
}