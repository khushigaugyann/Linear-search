public class linearsearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int target=3;
        for(int i=0;i<n;i++){
            if(arr[i]==target)
            System.out.println("Element found at position "+i);
        }
    }
    
}
