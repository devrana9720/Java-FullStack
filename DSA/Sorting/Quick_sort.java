public class Quick_sort {

    static int steps = 0;

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int j = low - 1;

        for (int k = low; k < high; k++) {
            if (arr[k] < pivot) {
                j++;

                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;

                steps++;
            }
        }

        int temp = arr[j + 1];
        arr[j + 1] = arr[high];
        arr[high] = temp;

        return j + 1;
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 4, 1, 3, 2};

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Total number of steps: " + steps);
    }
}