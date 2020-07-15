package LCD;
import java.util.Scanner;
public class EX1 {
    public static void main(String[] args) {
        int Limit=20;//Input Limit
        String[] hori={"02356789","2345689","2356890"};
        String[][] verti={{"045689","01234789"},{"0268","013456789"}};

        Scanner sc=new Scanner(System.in);
        int[] intArg=new int[Limit]; String[] strArg=new String[Limit];
        int argNum=-1, c,i,j,t,v;
        do{
            intArg[++argNum]=sc.nextInt();  //intArg[0].nextInt()
            strArg[argNum]=sc.next();  //strArg[0].next()
        }while( intArg[argNum]!=0 && strArg[argNum]!="0" ); //입력받음 ??

        for(int l=0;l<argNum;l++){ //입력한 줄 한줄씩
            for(t=0;t<3;t++){
                for(c=0;c<strArg[l].length();c++){
                    System.out.print(" "); //가로선 ~ c:한 숫자씩
                    for(i=0;i<intArg[l];i++)
                        System.out.print((hori[t].contains(strArg[l].charAt(c)+""))?"-":" ");
                    System.out.print("  ");
                }
                System.out.println();
                if(t<2) for(j=0;j<intArg[l];j++){ //세로선
                    for(c=0;c<strArg[l].length();c++){
                        for(v=0;v<2;v++){
                            System.out.print((verti[t][v].contains(strArg[l].charAt(c)+""))?"|":" ");
                            if(v==0) for(i=0;i<intArg[l];i++) System.out.print(" ");
                            else System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }System.out.println();
        }
    }
}
