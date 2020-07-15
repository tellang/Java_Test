package LCD;

public class EmptyRow extends PrintRow {
    public EmptyRow(int scale) {
        super(scale);
    }

    @Override
    public void print() {
        for(int i = 0; i<scale; i++)
            System.out.print(" ");
    }
}
