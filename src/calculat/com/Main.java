package calculat.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double a = scn.nextDouble();
        double b = scn.nextDouble();

        Calculation cal = new Calculation();
        System.out.println("adding" + cal.add(a,b));
        System.out.println("subtracting " +cal.sub(a,b));
        System.out.println("dividing" + cal.div(a,b));
        System.out.println("multiplying" + cal.multi(a,b));
        System.out.println("remainder" + cal.remain(a,b));
    }
}