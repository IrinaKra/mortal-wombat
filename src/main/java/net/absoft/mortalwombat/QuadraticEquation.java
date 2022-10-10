package net.absoft.mortalwombat;


public class QuadraticEquation {
    public String solveEq(double a, double b, double c) {
        if(a == 0)
            throw new IllegalArgumentException();
        double D = b * b - (4 * a * c);
        if(D < 0) {
            return "no roots";
        } else if(D == 0) {
            return Double.toString(b / 2 / a * (-1));
        } else {
            double x1 = (((-1) * b + Math.sqrt(D)) / (2 * a));
            double x2 = (((-1) * b - Math.sqrt(D)) / (2 * a));
            return Double.toString(x1) + " " + Double.toString(x2);
        }
    }
}
