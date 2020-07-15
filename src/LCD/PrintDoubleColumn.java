package LCD;

public class PrintDoubleColumn extends PrintColumn{
    public PrintDoubleColumn(int scale) {
        super(scale);
    }

    @Override
    public void print() {
        for(int i = 0; i<scale; i++){
            super.print();
            for(int j=0; j<scale; j++)
                System.out.print(" ");
            super.print();
            System.out.println();
        }
    }
}
