import java.util.Scanner;
import java.util.Stack;

class polishnotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        String n = "+-/*";
        for(String a : tokens) {
            if(n.contains(a) && !s.isEmpty()) {
                int b = s.pop();
                int c = s.pop();
                int f = operation(b, c, a);
                s.push(f);
            }
            else {
                s.push(Integer.parseInt(a));
            }
        }
        return s.pop();
    }
    public static int operation(int b, int c, String a) {
        if(a.equals("+")) return c+b;
        else if(a.equals("-")) return c- b;
        else if(a.equals("/")) return c/b;
        return c*b;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(evalRPN(arr));
    }
}