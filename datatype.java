import java.util.*;;
public class datatype {
    

    public static void main(String args[]){

    // float a = 5.5f;
    // double b = 5.5;
    // int c = (int)a; 
    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);
    // Scanner scanner =  new Scanner(System.in);
    // System.out.println("Enter your name : ");
    // String name = scanner.nextLine();
    // System.out.println("Your name is : " + name);


    // char ch ='a';
    // ch=97;
    // System.out.println(ch);
    // ch=65;
    // System.out.println(ch);
    
    
    // example
    Scanner scanner =  new Scanner(System.in);
    char ch = scanner.next().charAt(0);
    
    if(ch>=65 && ch<=90){
    System.out.println(ch + " is a upper case in ascii " + " at index : "  );
    }
    else if (ch>=97 && ch<=122) {
        System.out.println( ch + " is a lower case in ascii ");
        
    }
}}


