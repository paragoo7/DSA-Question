public class EquilibriumPoint {

    int equilibrium(int[] arr, int n){
        int i, j;
        int leftSum, rightSum;
        for (i=0; i<n; i++){
            leftSum=0;
            for (j=0; j<i; j++){
                leftSum+= arr[j];

                rightSum=0;
                for (j=i+1;j<n;j++){
                    rightSum+=arr[j];

                    if (rightSum==leftSum)
                        return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        EquilibriumPoint eq = new EquilibriumPoint();
        int[] arr = {10,2,8,5,-4,1};
        int size = arr.length;

        System.out.println(eq.equilibrium(arr,size ));

    }
}
