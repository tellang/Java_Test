package ASCIIArt;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class PixelCounter {
    final static int MaxVal = 67;
    final static int pixelPerChar = 4;
    public static String filePath = "C:/Users/tellang/Desktop/temp.jpg";
    public static String outPath = "C:/Users/tellang/Desktop/result.txt";
    public static int getText(String tx){
        Canvas c = new Canvas(){
            public void paint(Graphics g){
                g.setColor(Color.BLACK);
                g.drawString(tx, 16, 16);
            }
        };
        BufferedImage newIm = new BufferedImage
                (32, 32, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics g = newIm.getGraphics();
        c.paint(g);

        int output = 0;
        for(int y=0; y<32; y++){
            for(int x=0; x<32; x++){
                if(newIm.getRGB(x, y) < 0)
                    output++;
            }
        }

        return output;
    }
    public static void stringGetter(){
        System.out.println("Start\n");
        String[] chars = new String[1024];

        for(int i = '가'; i<'힣'; i++){
            int dVal = getText(String.valueOf((char)i));
            chars[dVal] = String.valueOf((char)i);
        }
        for(int i = 32; i<'z' + 4; i++){
            int dVal = getText(String.valueOf((char)i+""+(char)i));
            chars[dVal] = String.valueOf((char)i+""+(char)i);
        }

        for(int i=0; i<=MaxVal; i++){
            String ch;
            if (chars[i] == null) {
                chars[i] = chars[i - 1];
            }
            ch = chars[i];
            System.out.print("\""+ch+"\",");
        }
    }
    final static String[] strings = {"  ","  ","..","..","``","``","--","--",
            ";;",";;",";;",";;","\"\"","\"\"","__","__","ii","ii",
            "rr","rr","jj","스","}}","수","vv","슈","xx","즈","yy",
            "주","zz","UU","uu","추","kk","mm","hh","HH","KK","ww",
            "qq","NN","99","DD","SS","힑","gg","힗","RR","힓","$$",
            "흏","힖","힅","흷","MM","BB","흺","휊","흂","퓶","풾",
            "@@","쀒","뽧","뾢","뾾","뽪"
    };
    public static String getString(double d){
        int dVal = (int)(MaxVal -(MaxVal/255.0)*d);
        return strings[dVal];
    }

    final static int size = pixelPerChar;

    public static void Image2IntStr(){
        BufferedImage im = null;
        try {
            //System.out.println(filePath);
            im = ImageIO.read(new File(filePath));
            //System.out.println(im);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        double[][] map = new double[(im != null ? im.getHeight() : 0) / size-1][(im != null ? im.getWidth() : 0) / size-1];
        for(int y=0;y<map.length; y+=1){
            for(int x=0; x<map[y].length; x+=1){
                int avr=0;
                for(int i = 0; i<size; i++) {
                    for(int j=0; j<size; j++){
                        Color c = new Color(im.getRGB(x*size+j, y*size+i));
                        map[y][x] += c.getRed()/3.0;
                        map[y][x] += c.getGreen()/3.0;
                        map[y][x] += c.getBlue()/3.0;
                        avr++;
                    }
                }
                map[y][x] /=avr;
            }
        }
        String[][] convert = new String[map.length][map[0].length];
        for(int i =0; i< convert.length; i++){
            for(int j=0; j<convert[i].length; j++){
                convert[i][j] = getString(map[i][j]);
            }
        }
        FileWriter fw = null;
        try {
            fw = new FileWriter(new File(outPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String[] chars: convert){
            for(String chr : chars){
                try {
                    fw.write(chr);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                fw.write("\r\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader bReader = null;
        try {
            String s;
            File file = new File(outPath);
            bReader = new BufferedReader(new FileReader(file));

            while((s = bReader.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bReader != null) bReader.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }


        /*try {
            String s;
            File file = new File(outPath);
            BufferedReader bReader = null;
        }*/


        /*while (true){
            try {
                if ((s = bReader != null ? bReader.readLine() : null) == null){
                    System.out.println(s);
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    if(bReader != null) bReader.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }

        }*/
    }
}

class main{
    public static void main(String[] args){
        PixelCounter.Image2IntStr();
    }
}