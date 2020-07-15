package LCD;

public class EmptyCoumn extends PrintColumn {
    public EmptyCoumn(int scale) {
        super(scale);
    }

    @Override
    public void print() {
        for(int i = 0; i<scale*2 + columnLenght*3; i++){
            System.out.println("E");
        }
    }
}
