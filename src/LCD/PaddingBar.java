package LCD;

public class PaddingBar {
    Bar bar;
    public PaddingBar(Bar bar){
        this.bar = bar;
        peddBar();
    }
    public void peddBar(){
        if(bar instanceof PrintRow){
            System.out.print(" ");
            bar.print();
            System.out.println(" ");
        }
        else if (bar instanceof PrintColumn){
            bar.print();
            //System.out.println();
        }
    }
}
