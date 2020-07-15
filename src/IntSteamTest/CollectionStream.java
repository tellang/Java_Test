package IntSteamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStream {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Sival", "Sillena", "Jotgottchi", "Hane", "MEC.ver");
        Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);
    }
}
