import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class diffoftwoarrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> listt = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        
        for(int i=0; i<nums1.length; i++) {
            s1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++) {
            s2.add(nums2[i]);
            if(s1.contains(nums2[i])) { 
                s1.remove(nums2[i]); 
            }
        }
        for(int i=0; i<nums1.length; i++) {
            if(s2.contains(nums1[i])) { 
                s2.remove(nums1[i]); 
            }
        }
        listt.add(new ArrayList<Integer>(s1));
        listt.add(new ArrayList<Integer>(s2));
        return listt;
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
        System.out.println(findDifference(arr1, arr2));
    }
}