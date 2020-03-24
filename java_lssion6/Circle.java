package java_lssion6;

public class Circle {

        private double radius;
        private String color;

    public Circle() {
        radius = 1.0;
        color = "Duc Nhu";
    }

    public void Circle() {
        radius = 1.0;
        color = "red";
    }
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getSrea() {
        return radius * radius * Math.PI;
    }
}
