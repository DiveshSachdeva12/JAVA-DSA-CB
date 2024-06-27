public class insertionsort {
    public static void main(String args[]){
        int arr[]={45,5,2,4,90,5};
        insertionsort(arr);
    }
    public static void  insertionsort(int arr[]) {
        for(int counter=0;counter<arr.length-1;counter++){
            int val= counter-1;
            int j= counter-1;
            while (j>=0 && arr[j]>val) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
    }
    public static void display(int arr[]){
        for(int i:arr){
            System.out.println(i);
        }
    }
}
