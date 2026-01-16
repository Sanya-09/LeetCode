public class optimal_moveZeroEnd {
    public static void main(String[] args){
        int arr[] = {1,0,2,3,0,4,0,1};
        int n = arr.length;
        // optimal obj = new optimal();
        for(int i = 0; i<n-1 ; i++){
            for(int j = i+1 ; j < n ; j++){
            if(arr[i] == 0){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }}
}
        for(int nums : arr){
            System.out.print(nums+" ");
        }
    } 
}
