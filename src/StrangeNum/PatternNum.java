package StrangeNum;

import java.util.Arrays;

public class PatternNum {
    public static int[] total;
    public static boolean isPattern(int a, int b, int c){
        total = new int[]{a, b, c};
        int[] aPat = new int[4];
        int[] bPat = new int[4];
        int[] cPat = new int[4];

        bubbleSort(total);
        distribute(a, aPat);
        distribute(b, bPat);
        distribute(c, cPat);

        //arrTest(aPat);
        //arrTest(bPat);
        //arrTest(cPat);

        if(total[2] - total[1] == total[1] - total [0])
            return Arrays.equals(aPat, bPat) && Arrays.equals(aPat, cPat);
        else
            return false;
    }

    public static void distribute (int src, int[] tar) {
        int temp = src;
        if(src < 10000){
            tar[0] = temp/1000;
            temp -= tar[0]*1000;
            tar[1] = temp/100;
            temp -= tar[1]*100;
            tar[2] = temp/10;
            temp -= tar[2]*10;
            tar[3] = temp;
        }
        bubbleSort(tar);
    }

    public static void bubbleSort (int[] src){
        int temp=0;
        for(int i=0; i< src.length; i++){
            for(int j=1; j<src.length-i; j++){
                if(src[j-1]>src[j]){
                    temp=src[j];
                    src[j] = src[j-1];
                    src[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int a=1234; int b = 1423; int c =2314;

        System.out.println(isPattern(a, b, c));
    }

    public static void arrTest(int[] src){
        //System.out.println(src);
        for(int i : src)
            System.out.print(" "+i);
        System.out.println();
    }
}
