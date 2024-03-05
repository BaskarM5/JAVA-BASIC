import java.io.*;
import java.util.*;
class Prime 
{
  public static void main(String[] args){
    int check , n , i ;
    int flag = 0;
    Scanner sc = new Scanner(System.in);
    check = sc.nextInt();
    n = check/2 ;
    if(check == 0 || check == 1){
      flag = 1;
    }
    else { for(i=2;i<n;i++) {
      if(check%i==0) {
        flag = 1;
      }
    }
         }
    if(flag==1) {
      System.out.println("NOT A PRIME");
    }
    else {
      System.out.println("PRIME");
    }
  }
}
      
