package Problem;

import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        int pizzas=sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int puffs=sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int drinks=sc.nextInt();
        int nopizzas=pizzas*100;
        int nopuffs=puffs*20;
        int nodrinks=drinks*10;
        int total=nopizzas+nopuffs+nodrinks;
        System.out.println("Bill details:");
        System.out.println("No of pizzas:"+pizzas);
        System.out.println("No of pizzas:"+puffs);
        System.out.println("No of pizzas:"+drinks); 
        System.out.println("No of pizzas:"+total);
    }
    
}
