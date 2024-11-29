import java.lang.Math;
import java.util.Scanner;

public class Geometry {
    Scanner sc=new Scanner(System.in);
    int x1,y1,x2,y2;


    public void LengthLine(){
        System.out.println("Value of X1");
        x1=sc.nextInt();
        System.out.println("Value of X2");
        x2=sc.nextInt();
        System.out.println("Value of Y1");
        y1=sc.nextInt();
        System.out.println("Value of Y2");
        y2=sc.nextInt();
        double a=(Math.pow((x2-x1),2)+Math.pow((y2-y2),2));
        System.out.println("Length of Line is " +Math.sqrt(a));
    }


}
