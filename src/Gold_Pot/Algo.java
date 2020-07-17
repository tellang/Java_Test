package Gold_Pot;

public class Algo {
    public Algo(int[] goldPot){
        this.goldPot = goldPot;
        this.A = new int[goldPot.length];
        this.B = new int[goldPot.length];
        this.turnStack = new int[goldPot.length];
    }
    int[] goldPot, A, B, turnStack;
    int stack = 0;
    //char turn = 'A';

    public void cal (int st, int fin){
        switch (fin - st){
            case 1:{

                if(goldPot[fin] > goldPot[st]){
                    turnStack[stack++] = goldPot[fin];
                    turnStack[stack++] = goldPot[st];
                }
                else{
                    turnStack[stack++] = goldPot[st];
                    turnStack[stack++] = goldPot[fin];
                }
            }
                break;
            case 2:{

            }
                break;
        }
    }

    public int retMax(int i, int j){
        if(i>j)
            return i;
        else
            return j;
    }


}
