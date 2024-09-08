package recursion;
public class validparenthesis {
    public static void main(String[] args) {
        gp(3, "", 0, 0);
    }

    static void gp(int n, String ans, int l, int r) {  
        if (l == n && r == n) {
            System.out.println(ans);
            return;
        }
        if (l < n) {
            gp(n, ans + "{", l + 1, r); 
        }
        if (r < l) {
            gp(n, ans + "}", l, r + 1);
        }
    }
}
