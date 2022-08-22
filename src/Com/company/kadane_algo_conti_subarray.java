package Com.company;

public class kadane_algo_conti_subarray {
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){

        // Your code here
        long sum = 0;
        long fans = 0;
        for(int i=0; i<n; i++){
            sum = arr[i]+sum;
            if(sum <= 0 ){
                sum = 0;
            }
            else{
                if(fans<sum){
                    fans = sum;
                }
            }


        }
        return fans;
    }

    public static void main(String[] args) {
        kadane_algo_conti_subarray obj = new kadane_algo_conti_subarray();
        int arr[] = {1,2,1000,-2000,200};
        int n = 5;
        long s = obj.maxSubarraySum(arr,n);
        System.out.println(s);
    }
}

