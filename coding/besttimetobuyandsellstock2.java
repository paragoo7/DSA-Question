import java.util.Scanner;

class besttimetobuyandsellstock2 {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit =0;
        for(int i=1; i<n; i++) {
            if(prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProfit(arr));
    }
}