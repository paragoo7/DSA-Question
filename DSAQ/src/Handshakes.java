
import java.io.*;

class Handshakes {


    static int handshake(int n)
    {
        if (n == 0)
            return 0;
        else
            return n*(n-1)/2;
    }


    public static void main(String[] args)
    {
        int n = 9;
        System.out.print(handshake(n));
    }
}

