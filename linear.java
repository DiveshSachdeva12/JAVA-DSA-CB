import java.util.*;
public class linear {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=6;
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        boolean found= false;
        for(int i=0;i<n;i++){
            if(key ==arr[i]){
                System.out.println("key at index : " + i);
                found=true;
                break;
            }
           
            
        }
        if(!found)  {

            System.out.println("element is not found ");
        }      
    }
}
