import java.util.PriorityQueue;
import java.util.Scanner;

class kthlargestelement {
    public static int findKthLargest(int[] nums, int k) {
        // creating priority queue
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        // adding elements to priority queue
        for(int i =0; i<nums.length ;i++){ pq.add(nums[i]); }
        // removing the top k-1  largest elements
        for(int i=0;i<k-1;i++){ pq.remove(); }
        // returning the kth largest element
        return pq.peek();
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(findKthLargest(arr, k));
    }
}