class BlockSwap
    {

        public static void leftRotate(int arr[], int d, int n)
        {
            leftRotateRec(arr, 0, d, n);
        }

        public static void leftRotateRec(int arr[], int i, int d, int n)
        {

            if(d == 0 || d == n)
                return;

            if(n - d == d){
                swap(arr, i, n - d +i, d);
                return;
            }

            if(d < n - d){
                swap(arr, i, n - d+i , d);
                leftRotateRec(arr, i, d, n - d);
            }
            else{
                swap(arr, i, d, n - d);
                leftRotateRec(arr, n - d +i, (2 * d) - n, d);
            }
        }

        public static void swap(int arr[], int B, int A, int d){
            int i, temp;

            for(i = 0; i < d; i++){
                temp = arr[A + i];
                arr[A + i] = arr[B + i];
                arr[B + i] = temp;
            }
        }

        public static void main (String[] args){
            int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
            leftRotate(arr, 5, 8);

            for( int i = 0; i < 8; i++)
                System.out.print(arr[i] + " ");
        }
    }