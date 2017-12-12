package polindrom;

import java.util.ArrayList;
import java.util.Arrays;

public class findPrimeNumbrs {

    static ArrayList<Long> PrimeNumbrs(int numbers) {

//I use Sieve of Eratosthenes
        ArrayList<Integer> primeNumbrsList = new ArrayList<>();

        Integer[] primes = new Integer[numbers];
//fill array value 1
        Arrays.fill(primes, 1);
//if value equal 1 then we add value i to list
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i] == 1) {
                primeNumbrsList.add(i);
            }
            for (int j = 2; i * j < primes.length; ++j) {
                primes[i * j] = 0;
            }
        }
//convert ArrayList<Integer> to ArrayList<Long> 
        ArrayList<Long> primeFiveDigitNumbers = new ArrayList<>();
        for (Integer integer : primeNumbrsList) {
            primeFiveDigitNumbers.add(integer.longValue());
        }
        return primeFiveDigitNumbers;
    }
}
