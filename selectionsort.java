public class selectionsort {
    public static void main(String args[]) {
        int arr[] = {6,0,3,5};
        selectionsort1(arr);
        display(arr);
    }

    public static void selectionsort1(int arr[]) {
        for (int counter = 0; counter < arr.length - 1; counter++) {
            int min = counter; // Set the current position as the minimum
            for (int j = counter + 1; j < arr.length; j++) { // Find the minimum element in the unsorted part
                if (arr[j] < arr[min]) {
                    min = j; // Update the index of the minimum element
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[min];
            arr[min] = arr[counter];
            arr[counter] = temp;
        }
    }

    public static void display(int arr[]) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
