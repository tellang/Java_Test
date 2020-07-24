package HashTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static String solution(String[] participant, String[] completion) {
        List<String> loser = new ArrayList<>(Arrays.asList(participant));
        for(String fisisher: completion)
            loser.remove(fisisher);
        String answer = loser.get(0);
        return answer;
    }
    public static void main (String[] args){
        String[] participant = {"a", "b", "c", "c"};
        String[] completion = {"a", "b", "c"};
        System.out.println(solution(participant, completion));
    }
}
