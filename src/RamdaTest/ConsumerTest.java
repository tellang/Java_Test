package RamdaTest;

import java.util.function.*;

public class ConsumerTest {
    public static void main(String[] args){
        Consumer<String> c = name->System.out.println(name+", This is c's bodypart");
        //c.accept("This is c's namepart");

        BiConsumer<String, Integer> b = (name, age)->
          System.out.println("Name: "+name+" Age: "+age);
        //b.accept("Ramda", 8);

        DoubleConsumer ic = num ->
            System.out.println(num*num*num*num);
        //ic.accept(1024);

        ObjIntConsumer<String> obj = (name, num)->
                System.out.println("name: "+name+" num: "+num);
        obj.accept("apple", 18);
    }
}
