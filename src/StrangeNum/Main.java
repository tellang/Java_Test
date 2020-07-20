package StrangeNum;

public class Main {
    public static void main(String[] args){
        PrimeNum p = new PrimeNum(9999);
        for(int i = 1000; i<10000; i++){
            for(int j = 1000; j<10000; j++){
                for(int k = 1000; k<10000; k++){
                    if(PrimeNum.isPrime(i)&&PrimeNum.isPrime(j)&&PrimeNum.isPrime(k)
                    &&PatternNum.isPattern(i, j, k)
                            &&i!=j&&j!=k&&k!=i){
                        System.out.println(Integer.toString(PatternNum.total[0])+
                                Integer.toString(PatternNum.total[1])+
                                Integer.toString(PatternNum.total[2]));
                    }
                }
            }
        }
    }
}
