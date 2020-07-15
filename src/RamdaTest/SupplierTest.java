package RamdaTest;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args){
        Supplier<String> s =()-> "Return Value";
                String result1 = s.get();
                //System.out.println("s.get() value = "+result1);

        IntSupplier is =()-> 100;
        int result2 = is.getAsInt();
        System.out.println("result2 = "+result2);

    }
}
