package LCD;

public class PrintBar {
    int scale =1;
    public PrintBar(int scale){
        this.scale = scale;
    }

    public static void row(int scale){
        new PaddingBar(new PrintRow(scale));
    }
    public static void rowE(int scale){
        new PaddingBar(new EmptyRow(scale));
    }
    public static void columnL(int scale){
        new PaddingBar(new PrintLeftColumn(scale));
    }
    public static void columnR(int scale){
        new PaddingBar(new PrintRightColumn(scale));
    }
    public static void columnD(int scale){
        new PaddingBar(new PrintDoubleColumn(scale));
    }
    public void row(){
        new PaddingBar(new PrintRow(scale));
    }
    public void rowE(){
        new PaddingBar(new EmptyRow(scale));
    }
    public void columnL(){
        new PaddingBar(new PrintLeftColumn(scale));
    }
    public void columnR(){
        new PaddingBar(new PrintRightColumn(scale));
    }
    public void columnD(){
        new PaddingBar(new PrintDoubleColumn(scale));
    }
}
