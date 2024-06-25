import java.util.*;
public class factorial {
    public static int fact(int n){
        int ans = 1;
        for(int no=2;no<=n;no++){
            ans = ans*no;
            System.out.println("factorial at " + no +  " = " +  ans);
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt(); 
        System.out.println(fact(n));
    }
}
