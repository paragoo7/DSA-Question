import java.io.*;
 class StringEquals {
    static void isBinaryStringEquals(String str1, String str2) {
        int str1Z = 0;
        int str1o = 0;
        int str2Z = 0;
        int str2o = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '1') {
                str1o++;
            } else if (str1.charAt(i) == '0') {
                str1Z++;
            }
            if (str2.charAt(i) == '1') {
                str2o++;
            } else if (str2.charAt(i) == '0') {
                str2Z++;
            }
        }
    }
 }


