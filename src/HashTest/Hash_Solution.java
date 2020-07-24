package HashTest;

import java.util.HashMap;
import java.util.Map;

public class Hash_Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> finisher = new HashMap<>();
        String answer = "";
        for (String s : participant) finisher.put(s, finisher.getOrDefault(s, 0)+1);
        for (String s : completion) finisher.put(s, finisher.get(s)-1);

        for(String key: finisher.keySet())
            if(!(finisher.get(key) == 0)) {
                answer = key;
            }
        return answer;
    }
}