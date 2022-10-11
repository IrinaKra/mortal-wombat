
package net.absoft.mortalwombat;


public class QuadraticEquation {

    public String x1 ="";
    public String x2 ="";
    public String solveEq(double a, double b, double c) {
        if(a == 0)
            throw new IllegalArgumentException();
        double d = b * b - (4 * a * c);
        if(d < 0) {
            return null;
        } else if(d == 0) {
            return Double.toString(b / 2 / a * (-1));

        } else {
            x1 = Double.toString(((-1) * b + Math.sqrt(d)) / (2 * a));
            x2 = Double.toString(((-1) * b - Math.sqrt(d)) / (2 * a));
            System.out.println(x1 + "    " + x2);
            return "";
        }
    }
}
