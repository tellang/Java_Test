package LCD;

public class PrintRightColumn extends PrintColumn{
    public PrintRightColumn(int scale) {
        super(scale);
    }

    @Override
    public void print() {
        for(int i = 0; i<scale; i++){
            for(int j=0; j<scale+rowLength; j++)
                System.out.print(" ");
            super.print();
            System.out.println("");
        }
    }
}
