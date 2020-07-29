package Kakao_Internship;

import java.util.HashMap;
import java.util.Map;
import static java.lang.StrictMath.abs;

public class KeyPad {
    public static void main(String[]args){
        Solution s = new Solution();
        String hand = "right";
        int[] num = {3, 4, 2, 0};
        System.out.println("test: "+s.solution(num, hand));
        //System.out.println("answer: "+s.solutionK(num, hand));
        Solution sol = new Solution();
        System.out.println("TestL: "+sol.calDis(11, 32));
        System.out.println("TestR: "+sol.calDis(2, 32)+"\n");
        /*for(int i: num)
            System.out.println(i+" - 0 dis: "+sol.calDis(sol.calPos(i), 32));*/

    }
}
class Solution {
    public String solution(int[] numbers, String hand){
        Map<String, Integer> finPos = new HashMap();
        String answer = "";
        finPos.put("R", 33);
        finPos.put("L", 31);
       for(int num: numbers){
           switch (num%3){
               case 0:{
                   if(num != 0) {
                       answer += "R";
                       finPos.put("R", calPos(num));
                   }
                   else{
                       if(calDis(finPos.get("R"), calPos(num)) > calDis(finPos.get("L"), calPos(num))){
                           answer += "L";
                           finPos.put("L",calPos(num));
                       }
                       else if(calDis(finPos.get("R"), calPos(num)) < calDis(finPos.get("L"), calPos(num))){
                           answer += "R";
                           finPos.put("R",calPos(num));
                       }
                       else {
                           if(hand.equals("left")){
                               answer += "L";
                               finPos.put("L",calPos(num));
                           }
                           else {
                               answer += "R";
                               finPos.put("R",calPos(num));
                           }
                       }
                   }

               }break;
               case 1:{
                   answer += "L";
                   finPos.put("L",calPos(num));
               }break;
               default:{
                    if(calDis(finPos.get("R"), calPos(num)) > calDis(finPos.get("L"), calPos(num))){
                        answer += "L";
                        finPos.put("L",calPos(num));
                    }
                    else if(calDis(finPos.get("R"), calPos(num)) < calDis(finPos.get("L"), calPos(num))){
                        answer += "R";
                        finPos.put("R",calPos(num));
                    }
                    else {
                        if(hand.equals("left")){
                            answer += "L";
                            finPos.put("L",calPos(num));
                        }
                        else {
                            answer += "R";
                            finPos.put("R",calPos(num));
                        }
                    }
               }
           }
       }
        return answer;
    }

    public static int calDis(int posA, int posB){
        int Ay = posA/10;
        int Ax = posA - Ay*10;
        int By = posB/10;
        int Bx = posB - By*10;
        //return (Ay-By)*(Ay-By) + (Ax-Bx)*(Ax-Bx); //yx
        return abs(Ay - By)+abs(Ax - Bx);
    }

    public static int calPos(int num){
        int buf=0;
        if(num%3==0)
            buf = 1;
        if(num==0)
            return 32;
        else{
            return (num-(num/3-buf)*3)%4+(num/3-buf)*10;
        }
    }
}
