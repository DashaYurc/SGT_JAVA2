package homeworks.lesson4;

public class StringToInteger {
    public static void main(String[] args) {

        String str1 = "56";
        System.out.println("Converted Integer: " + myAtoi(str1));

        String str2 = "-22";
        System.out.println("Converted Integer: " + myAtoi(str2));

        String str3 = "0";
        System.out.println("Converted Integer: " + myAtoi(str3));

        String str4 = "     86";
        System.out.println("Converted Integer: " + myAtoi(str4));

        String str5 = "";
        System.out.println("Converted Integer: " + myAtoi(str5));

        String str6 = "999999999999999";
        System.out.println("Converted Integer: " + myAtoi(str6));

        String str7 = "-99999999999999";
        System.out.println("Converted Integer: " + myAtoi(str7));

        String str8 = "5566abc";
        System.out.println("Converted Integer: " + myAtoi(str8));

        String str9 = "aagy998";
        System.out.println("Converted Integer: " + myAtoi(str9));

        String str10 = "76.54";
        System.out.println("Converted Integer: " + myAtoi(str10));

        String str11 = "+78";
        System.out.println("Converted Integer: " + myAtoi(str11));
    }

    public static int myAtoi(String s) {

        System.out.println("\nInput String: '" + s + "'" );

        if (s == null || s.length() == 0)
            return 0;

        long longResult = 0; // if result out of range

        s = s.trim();

        boolean neg = false;
        if (s.charAt(0) == '-') {
            neg = true;
            s = s.substring(1, s.length());
        } else if (s.charAt(0) == '+') {
            s = s.substring(1, s.length());
        }

        int i = 0;
        while (i < s.length()) { // calculate without sign
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                longResult = longResult * 10 + (c - '0');
            } else break; // break when not a digit
            i++;
        }
        longResult = neg ? longResult * (-1) : longResult; // adding sign


        if (longResult > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (longResult < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) longResult;
    }

}

