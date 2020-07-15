package AlgoTest;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class FindSelfNumEx {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        IntStream.rangeClosed(1, 5000).forEach(x -> set.add(String.valueOf(x).chars().sum() + x));
        int sum = IntStream.rangeClosed(1,5000).filter(x -> !set.contains(x)).sum();
        System.out.println(sum);
    }
}
