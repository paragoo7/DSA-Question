public class BaseToDecimal {

    static int value(char c){
        if (c>='0' && c<='9')
            return (int) c-'0';
        else
            return (int) c - 'A'+10;
    }

    static int toDecimal(String str , int base){
            int len= str.length();
            int power= 1;
            int num=0;
            int i;
            for (i=len-1;i>=0;i--){
                if (value(str.charAt(i))>=base){
                    System.out.println("Invalid Number");
                    return -1;
                }
                num+=value(str.charAt(i))*power;
                power=power*base;

            }
            return num;

    }

    public static void main(String[] args) {
        String str = "23GF";
        int base = 17;
        System.out.println(toDecimal(str,base));

    }
}
