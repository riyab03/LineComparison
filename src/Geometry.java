import java.lang.Math;
import java.util.*;
import java.util.Scanner;

public class Geometry {
    Scanner sc=new Scanner(System.in);
    int x1,y1,x2,y2;

    public double LengthLine(){
        System.out.println("Value of X1");
        x1=sc.nextInt();
        System.out.println("Value of X2");
        x2=sc.nextInt();
        System.out.println("Value of Y1");
        y1=sc.nextInt();
        System.out.println("Value of Y2");
        y2=sc.nextInt();
        double a=(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return Math.sqrt(a);
    }

    public void Equality(double l1,double l2){
        if(Objects.equals(l1,l2)==true) System.out.println("Checking Equality: Lines are Equal");
        else System.out.println("Checking Equality: Lines are Not Equal");
    }

    public void Comparing(double l1,double l2){
        if(Double.compare(l1,l2)==0) System.out.println("Comparing lines: Lines are Equal");
        else if(Double.compare(l1,l2)>0) System.out.println("Comparing Lines: Line 1 is greater");
        else  System.out.println("Comparing Lines: Line 2 is greater");
    }


}
