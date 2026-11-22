package sortingalgorithms_activity;

public class SortingAlgorithms {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
 
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
        }
    }
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
        }
    
    
    public static void main(String[] args) {

    int[] originalArray = {45, 12, 78, 3, 29, 56, 8, 91, 17, 34};

    System.out.println("SORTING ALGORITHMS");
    System.out.println("------------------------------");

    System.out.print("Original Array: ");
    displayArray(originalArray);

    int[] bubbleArray = {45, 12, 78, 3, 29, 56, 8, 91, 17, 34};
    bubbleSort(bubbleArray);
    System.out.print("Bubble Sort: ");
    displayArray(bubbleArray);

    int[] selectionArray = {45, 12, 78, 3, 29, 56, 8, 91, 17, 34};
    selectionSort(selectionArray);
    System.out.print("Selection Sort: ");
    displayArray(selectionArray);

    int[] insertionArray = {45, 12, 78, 3, 29, 56, 8, 91, 17, 34};
    insertionSort(insertionArray);
    System.out.print("Insertion Sort: ");
    displayArray(insertionArray);
}
}

