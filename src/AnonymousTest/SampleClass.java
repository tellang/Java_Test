package AnonymousTest;

public class SampleClass {
    public static void main(String[] args){
        /*ATest aTest = new ATest() {
            @Override
            public void go() {
                System.out.println("This is Anonymous Class!");
            }
        };
        aTest.go();*/
        ATest aTest = () ->
                System.out.println("This is AnonymousClass" +
                        "Ramda version");
        aTest.go();
    }
}
