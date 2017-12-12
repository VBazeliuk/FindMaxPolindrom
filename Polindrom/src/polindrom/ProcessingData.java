package polindrom;
import java.util.Objects;

public class ProcessingData implements Comparable<ProcessingData> {
    private long palindrom;
    private long primeNumbrFrst;
    private long primeNumbrSecnd;

    public long getPalindrom() {
        return palindrom;
    }

    public long getPrimeNumbrFrst() {
        return primeNumbrFrst;
    }

    public long getPrimeNumbrSecnd() {
        return primeNumbrSecnd;
    }
    public ProcessingData(final long palindrome, final long primeNumbrFrst, final long primeNumbrSecnd) {
        this.palindrom = palindrome;
        this.primeNumbrFrst = primeNumbrFrst;
        this.primeNumbrSecnd = primeNumbrSecnd;
    }
    @Override
    public int compareTo(ProcessingData calculateData) {
        if (this.palindrom > calculateData.getPalindrom()) {
            return 1;
        } else if (this.palindrom < calculateData.getPalindrom()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcessingData)) return false;
        ProcessingData calculateData = (ProcessingData) o;
        return getPalindrom() == calculateData.getPalindrom() &&
                getPrimeNumbrFrst() == calculateData.getPrimeNumbrFrst() &&
                getPrimeNumbrSecnd() == calculateData.getPrimeNumbrSecnd();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalindrom(), getPrimeNumbrFrst(), getPrimeNumbrSecnd());
    }
}