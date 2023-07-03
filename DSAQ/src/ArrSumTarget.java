class HelloWorld {
    public static void main(String[] args) {
        int arr[]= {1,2,4,2,1,3};
        int t=7;
        int sum=0;
        int n = arr.length-1;
        for(int i=0; i<arr.length/2; i++){

            sum= arr[n]+arr[i];
            if(sum==t){
                System.out.println(" Elements are :"+arr[i]+" "+ arr[n]);
                System.out.println(("Indices are: "+i+","+n));
                n--;}




        }

    }
}