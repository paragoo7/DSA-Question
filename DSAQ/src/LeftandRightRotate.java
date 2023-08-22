// Java program for Left Rotation and Right
// Rotation of a String

class LeftandRightRotate
{


    static String leftrotate(String str, int d)
    {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }
    static String rightrotate(String str, int d)
    {
        return leftrotate(str, str.length() - d);
    }

    // Driver code
    public static void main(String args[])
    {
        String str1 = "FacePrep";
        System.out.println(leftrotate(str1, 3));

        String str2 = "FacePrep";
        System.out.println(rightrotate(str2, 5));
    }
}


