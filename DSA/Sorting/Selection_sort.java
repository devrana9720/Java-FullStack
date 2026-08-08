
public class Selection_sort {

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        int steps = 0;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
                steps++;
            }
        }
        System.out.println("Number of steps: " + steps);
    }
    public static void main(String[] args) {
        int arr[] = {5, 7, 4, 1, 3, 2};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
