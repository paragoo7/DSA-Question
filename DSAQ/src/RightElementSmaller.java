public class RightElementSmaller {
    public static void main(String[] args) {
        int[] arr = {15,19,5,3,4,2};

        for (int i=0; i< arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                System.out.println(arr[i]+" ");
            }
        }
        System.out.println(arr[arr.length-1]);
    }

}
