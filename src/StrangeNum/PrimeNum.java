package StrangeNum;

public class PrimeNum {
    static boolean[] prime;
    public PrimeNum(int limit){
        prime = new boolean[++limit];
        prime[0] = prime[1] = true;

        for(int i=2; i*i < limit; i++){
            if(!prime[i]){
                for(int j=i*i; j<limit; j+=i)
                    prime[j] = true;
            }
        }
    }
    public static boolean isPrime(int index){
        return !prime[index];
    }
}
