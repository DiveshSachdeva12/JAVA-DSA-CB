import java.util.Scanner;
public class userinput{
    public static void main(String args[]){
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        int a = num1.nextInt();
        System.out.println("your first number is  : " + a);
        
        System.out.print("Enter a second number : ");
        Scanner num2 = new Scanner(System.in);
        int b = num2.nextInt();
        System.out.println("Your second number is : " + b);
        

        int sum = a+b;
        System.out.println("Your sum of a + b is  : " + sum);
    }
}