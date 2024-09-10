package basics;
import java.util.Scanner;
public class interests {
 public static void main(String[] args) {
    System.out.print("word:");
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    for(int i=0;i<(a.length()/2)-1;i++){
        if(a.charAt(i)!=a.charAt(a.length()-1-i))
        System.out.println("not a palindrome");
        break;
    }
    sc.close();
 }   
}
