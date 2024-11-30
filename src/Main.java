import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc=new Scanner(System.in);

        Geometry line=new Geometry();
        System.out.println("Enter Dimensions for Line 1");
        double l1=line.LengthLine();
        System.out.println("Enter Dimensions for Line 2");
        double l2=line.LengthLine();
        System.out.println("Length of Line 1: "+l1 );
        System.out.println("Length of Line 2: "+l2 );

        line.Equality(l1,l2);
        line.Comparing(l1,l2);
        line.Compareto(l1,l2);

    }
}