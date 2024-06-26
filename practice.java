import java.util.Scanner;

public class practice {
 public static int binarsearch(int arr[] , int item){
     Scanner scanner  = new Scanner(System.in);
         item = scanner.nextInt();
     
     int lo=0;
     int hi=arr.length;
    
     while (lo<=hi) {
            int mid = (lo+hi)/2;
            if(arr[mid]<item)
            {B
                lo=mid+1;
            }else if(arr[mid]>item)
            {
                hi=mid-1;
            }
            else{
                
                return mid;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
         
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        System.out.println(binarsearch(arr, 50));
    }
    }
