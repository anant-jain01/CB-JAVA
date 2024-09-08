package basics;
public class Day2 {
    public static void main(String[] args) {
/*int i=1;
do{
System.out.println(i);
i++;
}while(i<=10);*/
/*
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
while(a<=10){
    System.out.println(a);
    a++;
};
sc.close();
*//*
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
for(int j=1;j<=i;j++){
    System.out.print("* ");
};
sc.close();
*/
for(int i=6;i>0;i--){
    for(int j=1;j<i;j++){
        System.out.print("* ");
    };
    System.out.println(" ");
};
};
};