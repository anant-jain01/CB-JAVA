public class subsequence {
    public static void main(String[] args) {
        subs("car","");        
    }
    static void subs(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
    }
    subs(ques.substring(1),ans+ques.charAt(0));
    subs(ques.substring(1),ans);
}
}
