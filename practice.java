// // import java.util.Scanner;

// // public class practice {
// //  public static int binarsearch(int arr[] , int item){
// //          item = scanner.nextInt();

// //      int lo=0;
// //      int hi=arr.length;

// //      while (lo<=hi) {
// //             int mid = (lo+hi)/2;
// //             if(arr[mid]<item)
// //             {B
// //                 lo=mid+1;
// //             }else if(arr[mid]>item)
// //             {
// //                 hi=mid-1;
// //             }
// //             else{

// //                 return mid;
// //             }
// //         }

// //         return -1;
// //     }

// //     public static void main(String[] args) {

// //         int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
// //     }
// //     }

// // public class practice {

// //     public static int[] bubblesort(int[] arr) {
// //         for (int counter = 0; counter < arr.length - 1; counter++) {
// //             for (int j = 0; j < arr.length - 1 - counter; j++) {
// //                 if (arr[j] > arr[j + 1]) {
// //                     int temp = arr[j];
// //                     arr[j] = arr[j + 1];
// //                     arr[j + 1] = temp;
// //                 }
// //             }
// //         }
// //         return arr;
// //         }
// //         public static void main(String args[]) {
// //             int arr[] = { 56, 20,50,10,8,9,90,15 };
// //             int [] sortedarr = bubblesort(arr);
// //             for(int i:sortedarr){
// //             }
// //         }
// // }

// public class practice {
//     public static void main(String args[]) {
//         int arr[] = { 10, 14, 8, 6, 5, 3, 2, 1, 0, 10, 14, 7 };
//         bubblesort(arr);
//         display(arr);
//     }

//     public static void bubblesort(int arr[]) {
//         for (int counter = 0; counter < arr.length - 1; counter++) {
//             for (int j = 0; j < arr.length - 1 - counter; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void display(int arr[]) {
//         for (int i : arr) {
//             System.err.println(i);
//         }
//     }
// }

// 
import java.util.*;

public class practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] =sc.nextInt();
        }
        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" "); 
        }
        System.out.println("Enter the element you want to search : ");
        int key= sc.nextInt();
        for(int i=0;i<size;i++){

            if(arr[i]==key){
                System.out.println("element found at index : " + i);
            }
        }
    }

}