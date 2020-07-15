package Matrix;

public class Determinant {
    public static double cal (double[][] miner){
        boolean Is2x2 = true;
        if(miner.length < 3){
            for(int i=0; i<miner.length; i++){
                if(miner[i].length > 2)
                    Is2x2 = false;
            }
        }
        else
            Is2x2 = false;

        if(Is2x2){
            return miner[0][0] * miner[1][1] - miner[0][1] * miner[1][0];
        }
        else
            return 0;
    }
}
