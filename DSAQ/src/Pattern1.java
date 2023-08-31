public class Pattern1 {
    static void Pattern(String str ,int n ){
        n=str.length();
        for (int i=0;i<n;i++){
            int k = n-1-i;
            for (int j=0;j<n;j++){
                if (j==k || j==i){
                    System.out.print(str.charAt(j));
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        String str = "Hello";
        Pattern(str, str.length());

    }
}
