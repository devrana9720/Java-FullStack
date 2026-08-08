package DSA.Searching;

public class Linear_search {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int tar=40;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                System.out.println("Element found at index: "+i);
                break;
            }
        }
}
}