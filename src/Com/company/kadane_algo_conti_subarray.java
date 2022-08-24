package Com.company;

public class kadane_algo_conti_subarray {
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){

        // Your code here
        long result = arr[0];
        for(int i=1; i<n; i++){
            arr[i] = Math.max(arr[i-1]+arr[i],arr[i]);
            result = Math.max(result,arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        kadane_algo_conti_subarray obj = new kadane_algo_conti_subarray();
        int arr[] = {1,2,1000,-2000,200};
        int n = 5;
        long s = obj.maxSubarraySum(arr,n);
        System.out.println(s);
    }
}

