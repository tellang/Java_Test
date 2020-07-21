package Gold_Pot;

public class Algo {
    public Algo(int[] goldPot){
        this.goldPot = goldPot;
        this.A = new int[goldPot.length];
        this.B = new int[goldPot.length];
        this.indexStack = new int[goldPot.length];
    }
    int[] goldPot, A, B, indexStack;
    int stack = 0;
    //char turn = 'A';

    public void cal (int st, int fin){
        switch (fin - st){
            case 1:{
                stkMaxVIndex(st, fin);
            }
                break;
            case 2:{
                indexStack[stack++]=maxVIndex(st, fin);
                if(indexStack[stack]==st)
                    cal(++st, fin);
                else
                    cal(st, --fin);
            }
                break;
            case 3:{
                
            }
                break;
        }
    }

    public int maxVIndex(int i, int j){
        if(goldPot[i]>goldPot[j])
            return i;
        else
            return j;
    }

    public void stkMaxVIndex(int i, int j){
        if(goldPot[i]>goldPot[j]){
            indexStack[stack++] = i;
            indexStack[stack++] = j;
        }
        else{
            indexStack[stack++] = j;
            indexStack[stack++] = i;
        }
    }


}
