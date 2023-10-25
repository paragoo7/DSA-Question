import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class subarraysumk {
    public static int subarraySum(int[] nums, int k) {
        int count=0, sum=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum - k)) { count+= map.get(sum-k); }
            map.put(sum, map.getOrDefault(sum,0) +1);
        }
        return count;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(subarraySum(arr, k));
    }
}