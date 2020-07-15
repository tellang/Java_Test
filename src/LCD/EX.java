package LCD;

public class EX {
    int bitmap[]={151290433,340862164,151294528,609076372,153387585},
            repeat[]={1,1,1,1,1}; //{1, size, 1, size, 1}
    String str[]={"   "," - ","  |","|  ","| |"}, space;

    public void show(int numbers[], int size){
        int i, line, r, rr, idx;
        for(line=4,repeat[1]=size,repeat[3]=size ; line>=0 ; line--){
            for(r=0;r<repeat[line];r++){
                for(i=0;i<numbers.length;i++){
                    idx = (int)(bitmap[line]/Math.pow(8, numbers[i])) &7;
                    for(space="",rr=0;rr<size;rr++) space+=str[idx].charAt(1);// size*'-'
                    System.out.print(" "+str[idx].charAt(0)+space+str[idx].charAt(2));
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int input[]={0,1,2,3,4,5,6,7,8,9},
                size=3;
        new EX().show(input,size);
    }
}
