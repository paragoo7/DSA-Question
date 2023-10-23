import java.util.Scanner;

class slidingwindowmaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int [] left = new int[nums.length];
        int [] right = new int[nums.length];
        left[0] = nums[0];
        right[nums.length-1] = nums[nums.length-1];
        
        for(int i=1; i<nums.length; i++) {
            if(i % k == 0) {
                left[i] = nums[i];
            }
            else {
                left[i] = Math.max(left[i-1], nums[i]);
            }
            int j = nums.length - i - 1;
            if( j % k == 0) {
                right[j] = nums[j];
            }
            else {
                right[j] = Math.max(right[j+1], nums[j]);
            }
        }
        
        int [] ans = new int[nums.length - k + 1];
        for(int i=0, j=0; i + k <= nums.length; i++) {
            ans[j++] = Math.max(left[i+k-1], right[i]);
        }
        return ans;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maxSlidingWindow(arr, k));
    }
}