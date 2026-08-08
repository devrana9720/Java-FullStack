
public class Bubble_sort {

    public static void bubbleSort(int arr[]){
        int n=arr.length;
        int steps=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    steps++;
                }
            }
        }
        System.out.println("Number of steps: " + steps);
    }
   public static void main(String[] args){
        int arr[]={5,7,4,1,3,2};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
   } 
}
