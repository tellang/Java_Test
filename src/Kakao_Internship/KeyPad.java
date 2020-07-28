package Kakao_Internship;

import java.util.HashMap;
import java.util.Map;

public class KeyPad {
    public static void main(String[]args){
        Solution s = new Solution();
        String hand = "right";
        int[] num = {1, 3, 4, 5};
        System.out.println(s.solution(num, hand));
    }
}
class Solution {
    public String solution(int[] numbers, String hand){
        Map<String, Integer> finPos = new HashMap();
        String answer = "";
        finPos.put("R", 33);
        finPos.put("L", 13);
       for(int num: numbers){
           System.out.println("rPos: "+finPos.get("R")+" lPos: "+finPos.get("L"));
           switch (num%3){
               case 0:{
                   answer += "R";                   finPos.put("R", finPos.getOrDefault("R",calPos(num)));
               }break;
               case 1:{
                   answer += "L";
                   finPos.put("L", finPos.getOrDefault("L",calPos(num)));
               }break;
               default:{
                    if(disCal(finPos.get("R"), calPos(num)) > disCal(finPos.get("L"), calPos(num))){
                        answer += "L";
                        finPos.put("L", finPos.getOrDefault("L",calPos(num)));
                    }
                    else if(disCal(finPos.get("R"), calPos(num)) < disCal(finPos.get("L"), calPos(num))){
                        answer += "R";
                        finPos.put("R", finPos.getOrDefault("R",calPos(num)));
                    }
                    else {
                        if(hand == "left"){
                            answer += "L";
                            finPos.put("L", finPos.getOrDefault("L",calPos(num)));
                        }
                        else {
                            answer += "R";
                            finPos.put("R", finPos.getOrDefault("R",calPos(num)));
                        }
                    }
               }
           }
       }
        //System.out.println("rPos: "+finPos.get("R")+" lPos: "+finPos.get("L"));
        return answer;
    }

    public static int disCal(int posA, int posB){
        int Ay = posA/10;
        int Ax = posA - Ay*10;
        int By = posB/10;
        int Bx = posB - By*10;
        return (Ay-By)*(Ay-By) + (Ax-Bx)*(Ax-Bx);
    }

    public static int calPos(int num){
        if(num==0)
            return 33;
        else{
            return num%4+num/3*10;
        }
    }

}
