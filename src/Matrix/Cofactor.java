package Matrix;

import static java.lang.Math.pow;

public class Cofactor {
    public static double cal(int i, int j, double[][] miner){
        return pow(-1, i+j)*Determinant.cal(miner);
    }
}
