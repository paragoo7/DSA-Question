public class HourGlassSum {
static int rows=3;
static int coloumns = 3;

static int findMaxSum(int[][] mat){
    if (rows<3||coloumns<3){
        System.out.println("Not possible");
        System.exit(0);
    }

    int maxSum=Integer.MIN_VALUE;
    for (int i=0; i<rows-2;i++){
        for (int j=0; j<coloumns-2;j++){
            int sum= (mat[i][j] + mat[i][j + 1] +
                    mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                    (mat[i + 2][j] + mat[i + 2][j + 1] +
                            mat[i + 2][j + 2]);

            maxSum=Math.max(maxSum,sum);

        }
    }
    return maxSum;

}

    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},
                {5,6,7,8},
                {9,10,1,2},
                {3,4,5,6}};

        int res = findMaxSum(mat);
        System.out.println("Max sum of HourGlass is :"+ res);
    }

}

