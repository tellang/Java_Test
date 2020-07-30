package Kakao_Internship;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static java.lang.StrictMath.abs;

public class Calculater {
    public static void main(String[] args){
        String exp = "10*100*10000000*100-1000";
        Calculater c = new Calculater();
        System.out.println("urTest: "+c.solution(exp));
        System.out.println(stack(1, 2, 3, exp));
    }
    public static long stack(int mulL, int plsL, int minL, String exp){
        Map<String, Integer> oprL = new HashMap<>();
        Stack<String> opr = new Stack<>();
        Stack<Long> num = new Stack<>();
        int exOprIndex=-1;

        oprL.put("*", mulL);
        oprL.put("-", minL);
        oprL.put("+", plsL);

        for(int i = 0; i < exp.length();  i++){
            if(exp.substring(i, i+1).equals("*") || exp.substring(i, i+1).equals("+")
            || exp.substring(i, i+1).equals("-")){
                num.push(Long.parseLong(exp.substring(exOprIndex+1, i)));
                if(opr.empty())
                    opr.push(exp.substring(i, i+1));
                else if(oprL.get(opr.peek()) < oprL.get(exp.substring(i, i+1)))
                    opr.push(exp.substring(i, i+1));
                else{
                    while (!opr.empty()){
                        if(oprL.get(opr.peek()) < oprL.get(exp.substring(i, i+1)))
                            break;
                        calculate(opr, num);
                    }
                    opr.push(exp.substring(i, i+1));
                }
                exOprIndex = i;
            }

        }
        num.push(Long.parseLong(exp.substring(exOprIndex+1)));

        while (!opr.empty()){
            calculate(opr, num);
        }
        return abs(num.pop());
    }

    public static void calculate(Stack<String> opr, Stack<Long> num){
        String oprater = opr.pop();
        long left, right;
        right = num.pop();
        left = num.pop();
        if(oprater.equals("+"))
            num.push(left+right);
        else if (oprater.equals("*"))
            num.push(left*right);
        else
            num.push(left-right);
    }

    public long solution(String exp) {
        long answer = 0;
        int[][] lot = new int[][]{
                {1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}
        };
        for(int[] lotate: lot){
            if(stack(lotate[0], lotate[1], lotate[2], exp) > answer)
                answer = stack(lotate[0], lotate[1], lotate[2], exp);
        }

        return answer;
    }
}