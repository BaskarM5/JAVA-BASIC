import java.util.Scanner;
class removevowel {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String og = sc.next();
    String ne = og.replaceAll("[aeiouAEIOU]", "");
    System.out.println(ne);
  }
}
