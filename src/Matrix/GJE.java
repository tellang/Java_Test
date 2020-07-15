package Matrix;

import LCD.PaddingBar;

public class GJE {
    /*public static double[][] cal (double[][] mtx){
        double[][] inMtx = new double[mtx.length][mtx.length];
        for(int i = 0; i <mtx.length; i++){
            for(int j = 0; j<mtx.length; j++){
                inMtx[i][j] = mtx[i][j]/mtx[i][i];
            }
            for(int j = 1; j<mtx.length ; j++){
                if(i+j < mtx.length-1){
                    
                }
            }
        }
        return mtx; //trash
    }

    public static double[][] cal (double[][] mtx, int nth){
        for (int i =0; i<mtx.length; i++){
            mtx[nth][i] =  mtx[nth][i]/mtx[nth][nth];
        }
        for (int i =0; i<mtx.length; i++){
            //cal(mtx, nth, i);
        }
        return mtx;//traxh
    }

    private static double[][] cal (double[][] src, int source, int tarCol, int tarRow){
        double[][] volSrc = new double[src.length][src[0].length];
        double vol = src[tarCol][tarRow];

        for(int i=0; i<src.length; i++){
            System.arraycopy(src[i], 0, volSrc[i], 0, src[0].length);
        }

        if(source!=tarCol){
            for(int i=0; i<src.length; i++){
                if(src[tarCol][tarRow]!=0){
                    volSrc[source][i] *= vol;
                    //src[tarCol][i] -= volSrc[source][i];
                }
                /*volSrc[source][i] *= src[tarCol][tarRow];
                //src[tarCol][i] -= volSrc[source][i];
                //System.out.println("src["+tarCol+"]["+i+"]: "+(int)src[tarCol][i]);
                //System.out.println("volSrc["+source+"]["+i+"]: "+(int)volSrc[source][i]);
                //System.out.println("src-volSrc: "+(int)(src[tarCol][i] - volSrc[source][i]));
                //System.out.println("src["+tarCol+"]["+i+"]: "+(int)src[tarCol][i]);
                //src[tarCol][i] -= vol;
                //System.out.println("src["+tarCol+"]["+i+"]: "+(int)src[tarCol][i]);
                //System.out.println("volSrc["+source+"]["+i+"]: "+(int)volSrc[source][i]);
            }
        }
        return src;
    }*/
    double[][] id, srcMtx, tarMtx ;

    public GJE (double[][] srcMtx){
        this.srcMtx = srcMtx;
        this.tarMtx = new double[srcMtx.length][srcMtx.length];
        for(int i=0; i<srcMtx.length; i++){
            System.arraycopy(srcMtx[i], 0, tarMtx[i], 0, srcMtx[0].length);
        }
        id = new double[srcMtx.length][srcMtx.length];
        for(int i=0; i< srcMtx.length; i++){
            for(int j=0; j< srcMtx.length; j++) {
                if (i == j)
                    id[i][j] = 1;
                else
                    id[i][j] = 0;
            }
        }
    } //make id mtx

    public void cal(){
        double[][] tarMtx = this.srcMtx;
        for(int i=0; i<tarMtx.length; i++){
            cal(i, id);
        }
    }
    public void cal(int nthRow, double[][] tarMtx){
        for(int i=0; i<tarMtx[nthRow].length; i++){
            tarMtx[nthRow][i] /= this.tarMtx[nthRow][nthRow];
            this.tarMtx[nthRow][i] /= this.tarMtx[nthRow][nthRow];
        }
        for(int k=0; k<tarMtx.length; k++){
            if(k!=nthRow){
                for(int j=0; j< tarMtx.length; j++){
                    //tarMtx[k][j]-=(this.tarMtx[k][nthRow]*tarMtx[nthRow][j]);
                    tarMtx[k][j]=(this.tarMtx[k][nthRow]);
                    this.tarMtx[k][j]-=(this.tarMtx[k][nthRow]*this.tarMtx[nthRow][j]);
                }
            }
        }

    }
    /*public void cal (double[] mtx, double val){
        for(int i = 0; i<mtx.length; i++){
            if(val !=0)
                mtx[i] *= val;
        }

    }
    public double cal (double mtx, double val){
        return mtx*val;
    }*/
    public static void main(String[] args){
        double[][] tp={{1, 2, 3}, {2, 5, 3}, {1, 0, 8}};
        for(double[] i: tp){
            for(double j: i){
                System.out.print(" "+(int)j);
            }
            System.out.println();
        }
        System.out.println();
        //tp=cal(tp, 0, 1, 0);

        GJE gje = new GJE(tp);
        gje.cal();
        for(double[] i: gje.srcMtx){
            for(double j: i){
                System.out.print(" "+j);
            }
            System.out.println();
        }
        System.out.println();
        for(double[] i: gje.tarMtx){
            for(double j: i){
                System.out.print(" "+j);
            }
            System.out.println();
        }
        System.out.println();
        for(double[] i: gje.id){
            for(double j: i){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
