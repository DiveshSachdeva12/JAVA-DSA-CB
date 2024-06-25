public class practise {
    public static int binarysearch(int arr[],int item){
        int lo=0;
        int hi=arr.length-1;
        while (lo<hi) {
            int mid=(lo+hi)/2;
            if (arr[mid]<item) {
                lo=mid+1;
            }
            else if(arr[mid]>item)
            {
                hi=mid-1;
                return mid;
            }
            return mid-1;
        }
    }
    }
    public static void main(String args[]){
        int arr[]={10,20,30,40,50,60,70,80};
 System.out.println(binarysearch(arr, 55));
    }
}
