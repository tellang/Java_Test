package AlgoTest;

import java.util.Scanner;

public class ArrayFill {
    public static void main(String[] args){
        int x=0;
        int y=0;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        arraySpiral(x, y);
    }

    public static void arraySpiral(int x, int y){
        int[][] arr = new int[x][y];
        int xPos = -1;
        int yPos = 0;
        //boolean back = false;
        //boolean yBack = false;
        int back = -1;
        int xMag = 0;
        int yMag = 1;
        //int count =0;

        for(int i=0; i<x*y;){
            System.out.println("X Line");
            if(back==1){
                for(int xi = 0; xi < x - xMag; xi++, i++){
                    xPos--;
                    System.out.println("xPos: "+xPos+" yPos: "+yPos+" i: "+i);
                    arr[xPos][yPos] = i;
                    //System.out.println("xBack");
                }
            }
            else{
                for(int xi = 0; xi < x - xMag; xi++, i++){
                    xPos++;
                    System.out.println("xPos: "+xPos+" yPos: "+yPos+" i: "+i);
                    arr[xPos][yPos] = i;
                    //System.out.println("xWay");
                }
            }
            System.out.println("Y line");
            if(back==1){
                for(int yi = 0; yi < y - yMag; yi++, i++){
                    yPos--;
                    System.out.println("xPos: "+xPos+" yPos: "+yPos+" i: "+i);
                    arr[xPos][yPos] = i;
                    //System.out.println("yBack");
                }
            }
            else{
                for(int yi = 0; yi < y - yMag; yi++, i++){
                    yPos++;
                    System.out.println("xPos: "+xPos+" yPos: "+yPos+" i: "+i);
                    arr[xPos][yPos] = i;
                    //System.out.println("yWay");
                }
            }
            xMag++;
            yMag++;
            back*=(-1);
        }

        for(int k=0; k < x; k++) {
            for (int n = 0; n < y; n++)
                System.out.print(arr[n][k]+"  ");
            System.out.println();
        }
         /*for(int[] sample: arr){
            for(int temp: sample)
                if(count%x==0)
                    System.out.println(temp);
                else
                    //System.out.print("sdf");
                    System.out.print(temp);

                count++;
        }*/
    }
}
