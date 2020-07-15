package AlgoTest;

import java.util.stream.IntStream;

public class Foo {
    public static long foo(int max){
        return IntStream.rangeClosed(1, max).
                map(x->(int)(String.valueOf(x).chars().filter(ch->ch=='8').count())).sum();
    }
}
