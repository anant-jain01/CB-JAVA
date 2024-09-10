package basics;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        System.out.println("number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0) System.out.println("even");
        else System.out.println("odd");
        sc.close();
    }
}
