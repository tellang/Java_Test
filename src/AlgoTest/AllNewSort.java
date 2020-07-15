package AlgoTest;

import java.util.ArrayList;

public class AllNewSort {
    public static void main(String[] args){
        int[] testArray = {1, 6, 5, -2, 0, 8, 9, -22, -13};
        ArrayList<Integer> testStack = new ArrayList<Integer>();

        for(int i: testArray){
            if(i<0)
                testStack.add(i);
        }
        for(int i: testArray){
            if(i>=0)
                testStack.add(i);
        }

        testStack.forEach(System.out::println);
    }
}
