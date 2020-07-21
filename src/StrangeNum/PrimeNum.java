package StrangeNum;

public class PrimeNum {
    static boolean[] prime;
    static int length;

    public PrimeNum(int limit) {
        length = 0;
        prime = new boolean[++limit];
        prime[0] = prime[1] = true;

        for (int i = 2; i * i < limit; i++) {
            if (!prime[i]) {
                for (int j = i * i; j < limit; j += i)
                    prime[j] = true;
            }
        }
        for(boolean i: prime)
            if(!i) length++;
    }

    public static boolean isPrime(int index) {
        return !prime[index];
    }
}
