package ArrayTest;
import java.util.Scanner;

public class ArrayTest4 {
    public static void main(String[] argsa){
        String[] names = new String[]{"a", "b", "v"};

        Scanner sc = new Scanner(System.in);
        int index = -1;
        do {
            System.out.println("search name");
            System.out.println("Name: ");
            String name = sc.next();
            for(int i = 0; i < names.length; i++){
                if(name.equals(names[i]))
                    index = i;
            }
            if(index != -1){
                System.out.println(name+"'s index; "+index);
                break;
            }
            System.out.println("No index");
        }while (true);
    }
}
