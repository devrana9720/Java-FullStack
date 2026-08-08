public class Binary_search {
    public static void main(String[] args) {

        //Time Complexity: O(log n)
        //Space Complexity: O(1)

        int arr[]={10,20,30,40,50};
        int tar=40;
        int low=0;
        int hig=arr.length-1;
        int steps=0;
        while(low<=hig){
            int mid=(low+hig)/2;
            steps++;
            if(arr[mid]==tar){
                System.out.println("Element found at index: "+mid);
                System.out.println("Number of steps: "+steps);
                break;
            }
            else if(arr[mid]<tar){ 
                low=mid+1;
            }
            else{
                hig=mid-1;
            }
        }
    }
}