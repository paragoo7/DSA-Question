import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class lcs {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) { set.add(n); }
        int count=0;
        for(int n:nums){
            if(!set.contains(n-1)){
                int i = 0;
                while(set.contains(n+i)){
                    i+=1;
                }
                count = Math.max(count, i);
            }
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
        System.out.println(longestConsecutive(arr));
    }
}