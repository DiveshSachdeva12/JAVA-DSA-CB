public class bubblesort {
   
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
        public static void main(String args[]) {
            int arr[] = { 56, 75, 86, 98, 101, 156, 209 };
            System.out.println(bubblesort(arr));
        }
}
