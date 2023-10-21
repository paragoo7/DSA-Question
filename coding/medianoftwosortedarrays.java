import java.util.*;

class medianoftwosortedarrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> al = new ArrayList<>();
        for(int i=0; i<nums1.length; i++) {
            al.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++) {
            al.add(nums2[i]);
        }
        Integer[] r = new Integer[al.size()];
        r = al.toArray(r);
        Arrays.sort(r);
        double m=0;
        int n = r.length;
        if(r.length%2 == 0) {
            m = (r[(n/2-1)] + r[(n/2)])/2.0;
        }
        else{
            m = r[n/2];
        }
        return m;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr1 = new int[n];
        for(int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }
        int [] arr2 = new int[m];
        for(int i=0; i<m; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}