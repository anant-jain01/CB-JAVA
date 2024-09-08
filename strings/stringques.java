package strings;

public class stringques {
    /*Q1 REVERSE A STRING
     * Q2 CHECK IF STRING IS PLAINDROME
     * Q3 FIND MAX NUMBER OF ELEMENT IN A SORTED STRING
     * Q4 REVERSE WORDS OF A STRING
     */
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        //  String a="I am a nigga",b="";
        // //  for (int i = a.length()-1; i >=0; i--){
        // //      b+=a.charAt(i);        
        // //  }
        // //  System.out.print(a==b.intern());
        // String[] arr=a.split(" ");
        // for (int i = arr.length-1; i>=0; i--) {
        //     System.out.print(arr[i]+" ");
        // }
        String sortedString = "aaaaabbccddd";
        char maxElement = sortedString.charAt(sortedString.length()-1);
        int count = 0;
        for(int i = sortedString.length()-1; i >= 0; i--) {
            if(sortedString.charAt(i) == maxElement) count++;
            else break;
        }
        System.out.println(maxElement + " " + count);
        System.out.println();
    }
}