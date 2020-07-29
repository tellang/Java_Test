package Kakao_Internship;

import java.util.HashMap;
import java.util.Map;

public class KeyPad {
    public static void main(String[]args){
        Solution s = new Solution();
        String hand = "right";
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(s.solution(num, hand));

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
                       if(disCal(finPos.get("R"), calPos(num)) > disCal(finPos.get("L"), calPos(num))){
                           answer += "L";
                           finPos.put("L",calPos(num));
                       }
                       else if(disCal(finPos.get("R"), calPos(num)) < disCal(finPos.get("L"), calPos(num))){
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
                    if(disCal(finPos.get("R"), calPos(num)) > disCal(finPos.get("L"), calPos(num))){
                        answer += "L";
                        finPos.put("L",calPos(num));
                    }
                    else if(disCal(finPos.get("R"), calPos(num)) < disCal(finPos.get("L"), calPos(num))){
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

    public static int disCal(int posA, int posB){
        int Ay = posA/10;
        int Ax = posA - Ay*10;
        int By = posB/10;
        int Bx = posB - By*10;
        return (Ay-By)*(Ay-By) + (Ax-Bx)*(Ax-Bx); //yx
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
