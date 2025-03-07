package Problem;
import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of liters to fill the tank:");
        int liters=sc.nextInt();
        if(liters<0)
        {
            System.out.println(liters+"input is invalid");
            return;
        }
        System.out.print("Enter the distance covered:");
        int distance=sc.nextInt();
        if(distance<0)
        {
            System.out.println(distance+" distance is invalid");
            return;
        }
        float literscovered=(liters / (float) distance) * 100;
        float miles=distance*0.6214f;
        float gallons=liters*0.2642f;
        float milesPerGallon=miles/gallons;
        System.out.println("Liters/100KM");
        System.out.printf("%.2f%n", literscovered);

        System.out.println("Miles/gallons");
        System.out.printf("%.2f", milesPerGallon);


        
    }
}
