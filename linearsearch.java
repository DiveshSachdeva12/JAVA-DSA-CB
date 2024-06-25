import java.util.Scanner;

public class linearsearch {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in); 
        System.out.println("Enter your size : ");
        int n = scanner.nextInt();
        int arr[]={1,2,3,4,5};
        for(int i=0;i<=n;i++){
            System.out.println("Enter the value : " + i + " index ?");
            arr[i]= scanner.nextInt();
            
            
        }
        
        System.out.println("array elements are : ");
        for(int i =0;i<= n;i++){
            System.out.print((arr[i]) + " ");
        }
        int max = arr[0]
        for(int i=0; i < arr.length; i++){
            if (arr[i] < max) {
                max = arr[i];
                
                // System.out.println();
            }
        }
        System.out.println(("your greater element  among them is : ") + max);
    }
}
