package ArrayTest;

public class ArrayTest1 {
    public static void main(String[] args){
        int age[];
        String[] name;

        age = new int[3];
        name = new String[3];

        for(int i = 0; i<age.length; i++)
            age[i] = i;

        for(int agedata:age)
            System.out.println(agedata);
    }
}
