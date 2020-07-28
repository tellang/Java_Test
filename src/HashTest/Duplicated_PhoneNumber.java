package HashTest;

import java.util.*;

public class Duplicated_PhoneNumber {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0, j = 0; i < phone_book.length-1; i++) {
            j = i+1;
            while (phone_book[i].length() <= phone_book[j].length()){
                if(phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))) return false;
                else {
                    System.out.println(phone_book[i] + "vs" + phone_book[j].substring(0, phone_book[i].length()));
                    if (j < phone_book.length - 1)
                        j++;
                    else
                        break;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] temp = new String[]{"119", "97674223", "1195524421"};
        //Arrays.sort(temp);
       Duplicated_PhoneNumber d = new Duplicated_PhoneNumber();
       System.out.println(d.solution(temp));

    }
}
