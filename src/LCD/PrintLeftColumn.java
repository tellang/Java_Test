package LCD;

public class PrintLeftColumn extends PrintColumn{
    public PrintLeftColumn(int scale) {
        super(scale);
    }

    @Override
    public void print() {
        for(int i = 0; i<scale; i++){
            super.print();
            for(int j=0; j<scale+rowLength; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
