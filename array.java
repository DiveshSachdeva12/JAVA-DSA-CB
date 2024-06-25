import java.util.Scanner;

public class array {
    public static void main(String args[]){
        // int arr[]={1,2,3,4,5};
        // int n=5;
        // for(int i=0;i<n;i++){
        //     System.out.println((arr[i]) + " ");
        // }

        // for(int val : arr){
        //     System.out.println(val);
        // }

        Scanner scanner= new Scanner(System.in); 
        System.out.println("Enter your size : ");
        int n = scanner.nextInt();
        int arr[]={1,2,3,4,5};
        for(int i=0;i<=n;i++){
            System.out.println("Enter the value : " + i + " index ?");
            arr[i]= scanner.nextInt();
            
            
        }
        
        System.out.println("array elements are : ");
        // return arr;
        for(int i =0;i<= n;i++){
            System.out.print((arr[i]) + " ");
        }

    }
}
