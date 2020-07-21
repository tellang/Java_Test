package StrangeNum;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PrimeNum p = new PrimeNum(9999);
        int leftNum, middleNum, rightNum, index;
        leftNum = middleNum = rightNum = index = 0;
        ArrayList<Integer> primeIgnite = new ArrayList<>();

        int[] prime = new int[PrimeNum.length];
        for (int v = 1000; v < 10000; v++)
            if (PrimeNum.isPrime(v))
                prime[index++] = v;

        for (int value : prime) {
            for (int i : prime) {
                if (PatternNum.isPattern(value, i) && PrimeNum.isPrime(PatternNum.rightNum)
                        && value != i) {
                    if (primeIgnite.contains(PatternNum.leftNum))
                        continue;
                    primeIgnite.add(PatternNum.leftNum);
                    leftNum = PatternNum.leftNum;
                    middleNum = PatternNum.middleNum;
                    rightNum = PatternNum.rightNum;
                    System.out.println(Integer.toString(leftNum) + middleNum + rightNum);
                }

            }
        }
    }
}
