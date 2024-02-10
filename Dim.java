class Dim {
public static void main(String[] args) {
char[] let = {'s','t','r','i','n','g'};
String S = new String(let);
System.out.println(let);
System.out.println(S);
for (int i = 1;i<S.length();i+=2) {
System.out.println(S.charAt(i));
}
}
}