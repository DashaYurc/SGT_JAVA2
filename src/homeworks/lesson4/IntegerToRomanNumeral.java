package homeworks.lesson4;

import java.util.Scanner;
import java.util.TreeMap;

public class IntegerToRomanNumeral {
    private final static TreeMap<Integer, String> romanAndArabicNumbers = new TreeMap<Integer, String>();

    static {
        romanAndArabicNumbers.put(1000, "M");
        romanAndArabicNumbers.put(900, "CM");
        romanAndArabicNumbers.put(500, "D");
        romanAndArabicNumbers.put(400, "CD");
        romanAndArabicNumbers.put(100, "C");
        romanAndArabicNumbers.put(90, "XC");
        romanAndArabicNumbers.put(50, "L");
        romanAndArabicNumbers.put(40, "XL");
        romanAndArabicNumbers.put(10, "X");
        romanAndArabicNumbers.put(9, "IX");
        romanAndArabicNumbers.put(5, "V");
        romanAndArabicNumbers.put(4, "IV");
        romanAndArabicNumbers.put(1, "I");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number to convert to Roman Number: ");
        int userNumber = scan.nextInt();
        System.out.println(IntegerToRomanNumeral(userNumber));
        scan.close();
    }

    public final static String IntegerToRomanNumeral(int number) {
        int i = romanAndArabicNumbers.floorKey(number);
        if (number == i) {
            return romanAndArabicNumbers.get(number);
        }
        return romanAndArabicNumbers.get(i) + IntegerToRomanNumeral(number - i);
    }
}
