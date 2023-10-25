import java.util.*;

class combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateCombination(1, n, k, subsets, new ArrayList());
        return subsets;
    }
    public static void generateCombination(int s, int n, int k, List<List<Integer>> subsets, List<Integer> list) {
        if(list.size() == k) {
            subsets.add(new ArrayList(list));
            return;
        }
        for(int i = s; i<=n; i++) {
            list.add(i);
            generateCombination(i+1, n, k, subsets, list);
            list.remove(list.size()-1);
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(combine(n, k));
    }
}