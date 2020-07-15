package IntSteamTest;

import java.util.stream.Stream;

public class BuilderStreamTest {
    public static void main(String[] args){
        Stream<String> stream1 = Stream.<String>builder().add("Ninggimi").add("Sibural").add("Jotgotton")
                .add("EMdeuiZin").add("Summoners war").build();
        stream1.forEach(System.out::println);
    }
}
