import java.util.*;
public class fibo {
    public static int fibo (int n){
        if (n==1) {
            return 0;
        }
        if (n==2) {
            return 1;
        }
        else{
            int a=0;
            int b=1;
            int c=0; 

        for(int i =0;i<=n-1;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println("the fibo at " + i  + " = " + c);
        }
        return c;
    }
}
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        System.out.print(fibo(n));
    }
}
