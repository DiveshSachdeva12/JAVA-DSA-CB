// public class addtwo {
//     public static void main(String args[]){
//         int a=10;
//         int b=20;
//         b=30;
//         String name="Divesh sachdeva";
//         int sum=a+b;
//         System.out.println(sum);
//         System.out.println(name);
//         float num=5;
//         System.out.println(name);
        
//     }
// }

public class bubblesort{
    public static void main(String args[]){
        int arr[]={56,75,86,98,101,156,209};
        System.out.println(bubblesort(arr));
    }
    public static int[] bubblesort(int[] arr) {
        for (int counter = 0; counter < arr.length - 1; counter++) {
            for (int j = 0; j < arr.length - 1 - counter; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
        }
