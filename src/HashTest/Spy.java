package HashTest;

import java.util.*;
import java.util.stream.Collectors;

public class Spy {
    public int solution(String[][] clothes) { //"name", "kind"; -> key, value
        Map<String, Integer> clo = new HashMap<>();
        for (String[] parts : clothes) clo.put(parts[1], clo.getOrDefault(parts[1], 0)+1);
        


        printMap(clo);
        return 0;
    }
    public static void main(String[] args){
        Spy s = new Spy();
        String[][] clothes = new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}};
        s.solution(clothes);


    }
    public static void printMap(Map clo){
        clo.forEach((key, value) -> {
            System.out.print("key: "+ key);
            System.out.println(", Value: "+ value);
        });
    }
}
