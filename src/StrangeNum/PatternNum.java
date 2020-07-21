package StrangeNum;

import java.util.Arrays;

public class PatternNum {
    public static int[] total;
    public static int rightNum, leftNum, middleNum;

    public static boolean isPattern(int firstNum, int secondNum) {
        int[] aPat = new int[4];
        int[] bPat = new int[4];
        int[] cPat = new int[4];
        int distance = 0;
        leftNum=0;
        middleNum=0;
        rightNum = 0;

        if(firstNum > secondNum){
            middleNum = firstNum;
            leftNum = secondNum;
        }
        else {
            middleNum = secondNum;
            leftNum = firstNum;
        }


        distribute(leftNum, aPat);
        distribute(middleNum, bPat);

        if (Arrays.equals(aPat, bPat)) {
            distance = middleNum - leftNum;
            rightNum = distance + middleNum;

            distribute(rightNum, cPat);

            if(Arrays.equals(aPat, cPat))
                return true;

            else
                return false;
        } else
            return false;
    }

    public static void distribute(int src, int[] tar) {
        int temp = src;
        if (src < 10000) {
            tar[0] = temp / 1000;
            temp -= tar[0] * 1000;
            tar[1] = temp / 100;
            temp -= tar[1] * 100;
            tar[2] = temp / 10;
            temp -= tar[2] * 10;
            tar[3] = temp;
        }
        bubbleSort(tar);
    }

    public static void bubbleSort(int[] src) {
        int temp = 0;
        for (int i = 0; i < src.length; i++) {
            for (int j = 1; j < src.length - i; j++) {
                if (src[j - 1] > src[j]) {
                    temp = src[j];
                    src[j] = src[j - 1];
                    src[j - 1] = temp;
                }
            }
        }
    }

    public static void arrTest(int[] src) {
        //System.out.println(src);
        for (int i : src)
            System.out.print(" " + i);
        System.out.println();
    }
}
