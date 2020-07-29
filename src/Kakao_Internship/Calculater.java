package Kakao_Internship;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Calculater {
    public static void main(String[] args){
        String exp = "100-200*300-500+20";
        char opr = '+';
        Calculater c = new Calculater();
        //c.solution(exp);
        System.out.println((int)opr);
    }
    public static long calculate(int mulL, int minL, int plsL, String exp){
        Map<String, Integer> oprL = new HashMap<>();
        Stack<String> opr = new Stack<>();
        Stack<Integer> num = new Stack<>();
        int exOprIndex=0;

        oprL.put("*", mulL);
        oprL.put("-", minL);
        oprL.put("+", plsL);

        for(int i = 0; i < exp.length();  i++){
            //System.out.println(exp.substring(i, i+1));
            if(exp.substring(i, i+1).equals("*") || exp.substring(i, i+1).equals("+")
            || exp.substring(i, i+1).equals("-")){
                num.push(Integer.parseInt(exp.substring(exOprIndex, i)));
                exOprIndex = i;
                if(oprL.get(opr.peek()) <= oprL.get(exp.substring(i, i+1)) || opr.empty())
                    opr.push(exp.substring(i, i+1));
                else{
                    String oprater = opr.pop();
                    int left, right;
                    left = num.pop();
                    right = num.pop();
                    if(oprater.equals("+"))
                        num.push(left+right);
                    else if (oprater.equals("*"))
                        num.push(left*right);
                    else
                        num.push(left-right);
                }
            }

        }

    }

    public long solution(String exp) {

        /*while (true){
            String result = expression.substring(expression.lastIndexOf("/")+1);
        }*/


        long answer = 0;
        return answer;
    }
}