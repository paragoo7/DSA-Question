import java.util.Scanner;

class sortcolors {
    public static void sortColors(int[] nums) {
        int s=0, e=nums.length-1, mid=0;
        while(mid<= e) {
            int temp=0;
            if(nums[mid] == 0) { 
                temp=nums[s]; nums[s] = nums[mid]; nums[mid] = temp; s++; mid++; 
            }
            else if(nums[mid] == 1) { mid++; }
            else {
                temp=nums[mid]; nums[mid] = nums[e]; nums[e] = temp; e--;
            }
        }
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        sortColors(arr);
    }   
}