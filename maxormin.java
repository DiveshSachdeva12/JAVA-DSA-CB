public class maxormin {
    public static void main(String args[]){
        int arr[]={500,400,150,600};
        int min = arr[0];
        for(int i=0;i< arr.length;i++){
            if (arr[i] < min) {
                min =  arr[i];
            }
            
        }
        System.out.println(min);
    }
}
