import java.util.Scanner;

public class array {
    // public static void main(String args[]){
        // int arr[]={1,2,3,4,5};
        // int n=5;
        // for(int i=0;i<n;i++){
        //     System.out.println((arr[i]) + " ");
        // }

        // for(int val : arr){
        //     System.out.println(val);
        // }

//         Scanner scanner= new Scanner(System.in); 
//         System.out.println("Enter your size : ");
//         int n = scanner.nextInt();
//         int arr[]={1,2,3,4,5};
//         for(int i=0;i<=n;i++){
//             System.out.println("Enter the value : " + i + " index ?");
//             arr[i]= scanner.nextInt();
            
            
//         }
        
//         System.out.println("array elements are : ");
//         // return arr;
//         for(int i =0;i<= n;i++){
//             System.out.print((arr[i]) + " ");
//         }

//     }

// }



//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);
//         // int [] marks = new int[3];
//         int size = scanner.nextInt();
//         int marks[] = new int[size];
//         // marks[0]=90;
//         // marks[1]=95;
//         // marks[2]=97 ;
//         // System.out.println(marks[0] +"physics");
//         // System.out.println(marks[1]+"chemistry");
//         // System.out.println(marks[2]+"biology");

//         for(int i=0;i<size;i++){
//             System.out.println("enter size of array : ");
//             // System.err.println(marks[i]);
//         }
//         for(int i=0;i<size;i++){
//             System.out.println(marks[i]);
//         }
//     }
    
// }

// import java.util.Scanner;

public class arra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("enter the element you want to search : ");
        int key = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.print("found at index : " + i);

            }
        }
    }

}
}