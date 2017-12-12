package polindrom;

import java.util.ArrayList;
import java.util.Arrays;

public class ResultMaxPolindrom {

    public static void main(String[] args) {

        //final output result First, Second and Max palindrom 
        ProcessingData maxPalindrom = findPalindrome.MaxPalindrom(findPrimeNumbrs.PrimeNumbrs(99999));

        System.out.println("First  prime is = " + maxPalindrom.getPrimeNumbrFrst());
        System.out.println("Second prime is = " + maxPalindrom.getPrimeNumbrSecnd());
        System.out.println("First * Second = " + maxPalindrom.getPalindrom()+" - Max palindrom");
    }
}
