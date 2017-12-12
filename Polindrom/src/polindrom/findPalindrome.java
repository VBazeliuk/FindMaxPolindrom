package polindrom;

import java.util.List;
import java.util.TreeSet;

public final class findPalindrome {

//sort polindroms and add them to list
    private static TreeSet<ProcessingData> palindroms = new TreeSet<>();

//search polindroms multiply First and Second prime numbers
    private static void palindromeSearch(long primeNumbrFrst, long primeNumbrSecnd) {
        long result = primeNumbrFrst * primeNumbrSecnd;
        String strResult = String.valueOf(result);
//convert to string result numbers and find polindroms if reverse are equals 
        if (strResult.equals(new StringBuffer(strResult).reverse().toString())) {
            palindroms.add(new ProcessingData(result, primeNumbrFrst, primeNumbrSecnd));
        }
    }
//get Max palindrom from List

    public static ProcessingData MaxPalindrom(List<Long> primeFiveDigitNumbers) {
        for (int i = 0; i < primeFiveDigitNumbers.size(); i++) {
            for (Long number : primeFiveDigitNumbers) {
                long arg1 = primeFiveDigitNumbers.get(i);
                long arg2 = number;
                findPalindrome.palindromeSearch(arg1, arg2);
            }
        }
        return palindroms.last();
    }
}
