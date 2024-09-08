package recursion;
public class lettersequence {
    public static void main(String[] args) {
        letter("abc","");
    }
    static void letter(String ques,String ans){
        if(ques.length()==0){
        System.out.println(ans);
        return;}
        for (int i = 0; i < ques.length(); i++) {
            String s1=ques.substring(0,i),
            s2=ques.substring(i+1);
            letter(s1+s2,ans+ques.charAt(i));
        }
    }
}
