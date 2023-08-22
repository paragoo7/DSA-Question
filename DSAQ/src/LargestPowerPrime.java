import java.io.*;

class LargestPowerPrime
{
    static int Largestpower(int n, int p)
    {
        int ans = 0;

        while (n > 0) {
            n /= p;
            ans += n;
        }
        return ans;
    }

    public static void main (String[] args)
    {
        int n = 100;
        int p = 5;
        System.out.println(" The largest power of " + p + " that divides "
                + n + "! is " + Largestpower(n, p));


    }
}