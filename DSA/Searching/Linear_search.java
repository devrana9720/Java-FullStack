
public class Linear_search {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int tar=40;
        int steps=0;
        for(int i=0;i<arr.length;i++){
            steps++;
            if(arr[i]==tar){
                System.out.println("Element found at index: "+i);
                System.out.println("Number of steps: "+steps);
                break;
            }
        }
}
}