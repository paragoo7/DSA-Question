import java.util.Scanner;

class containerwithmostwater {
    public static int maxArea(int[] height) {
        int left=0, right = height.length-1, max=0;
        while(left < right) {
            max = Math.max(max, (right-left)*Math.min(height[left], height[right]));
            if(height[left] < height[right]) {left++;}
            else { right--; }
        }
        return max;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxArea(arr));
    }
}