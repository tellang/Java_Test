package LCD;

public class MakeNum {
    public static void main (String[] args){
        PrintBar.row(2);
        PrintBar.columnD(2);
        PrintBar.rowE(2);
        PrintBar.columnD(2);
        PrintBar.row(2);
    }
    public static void makeNum (int num, int scale){
        PrintBar pb = new PrintBar(scale);
        switch (num){
            case 0:{
                pb.row();
                pb.columnD();
                pb.rowE();
                pb.columnD();
                pb.row();
                break;
            }
        }
    }
}
