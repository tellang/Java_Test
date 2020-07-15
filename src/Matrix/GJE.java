package Matrix;

public class GJE {
    double[][] id, srcMtx, volMtx;

    public GJE (double[][] srcMtx){
        this.srcMtx = srcMtx;
        id = new double[srcMtx.length][srcMtx.length];
        for(int i=0; i< srcMtx.length; i++){
            for(int j=0; j< srcMtx.length; j++) {
                if (i == j)
                    id[i][j] = 1;
                else
                    id[i][j] = 0;
            }
        }
        this.volMtx = new double[srcMtx.length][srcMtx.length*2];
        for(int i=0; i< volMtx.length; i++) {
            for (int j = 0; j < volMtx[0].length; j++) {
                if (j>=srcMtx.length)
                    volMtx[i][j] = id[i][j-srcMtx.length];
                else
                    volMtx[i][j] = srcMtx[i][j];
            }
        }
    } //make id mtx

    public void cal(){
        double[][] tarMtx = this.srcMtx;
        for(int i=0; i<tarMtx.length; i++){
            cal(i);
        }
    }
    public void cal(int nthRow){
        for(int i=0; i<volMtx[0].length; i++){
            if(i!=nthRow)
                this.volMtx[nthRow][i] /= this.volMtx[nthRow][nthRow];
        }
        this.volMtx[nthRow][nthRow] = 1;
        for(int y=0; y<volMtx.length; y++){
            if(y!=nthRow){
                for(int x=0; x<volMtx[0].length; x++){
                    if(x!=nthRow)
                        volMtx[y][x] = (volMtx[y][x] - volMtx[y][nthRow]*volMtx[nthRow][x]);
                }
                volMtx[y][nthRow] = 0;
            }
        }

    }


    public static void main(String[] args){
        double[][] tp={{1, 2, 3}, {2, 5, 3}, {1, 0, 8}};

        GJE gje = new GJE(tp);
        gje.cal();

        for(int y =0; y < gje.volMtx.length; y++) {
            for (int x = gje.srcMtx.length; x < gje.volMtx[0].length; x++)
                System.out.print(" " + gje.volMtx[y][x]);
            System.out.println();
        }
    }
}
