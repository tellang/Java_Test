package LCD;

public class PrintColumn implements Bar{
    int scale;
    public PrintColumn(int scale) {
        this.scale =scale;
    }

    @Override
    public void print() {
        System.out.print("|");
    }
}
