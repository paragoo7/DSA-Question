import java.util.Scanner;

class longestsubarray {
    public static int longestSubarray(int[] nums) {
        int max=0, count=0, len=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) count++;
            while(count > 1) {
                if(nums[len] == 0) --count;
                len++;
            }
            max = Math.max(max, i-len+1);
        }
        return max-1;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestSubarray(arr));
    }
}