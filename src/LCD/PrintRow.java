package LCD;

public class PrintRow implements Bar{
    int scale;
    public PrintRow(int scale) {
        //super(scale);
        this.scale = scale;
    }

    @Override
    public void print() {
        for(int i = 0; i<scale; i++)
            System.out.print("-");
    }
}
