package java_lssion7;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(1,2,11,12);
        System.out.println(b1);
        b1.setX(3);
        b1.setY(4);
        b1.setxStep(13);
        b1.setyStep(14);
        System.out.println(b1);
        System.out.println("x is: " + b1.getXy()[0]);
        System.out.println("y is: " + b1.getXy()[1]);

        b1.setXY(5, 6);
        b1.setXYStep(15, 16);
        System.out.println(b1);
        System.out.println("x is: " + b1.getXy()[0]);
        System.out.println("y is: " + b1.getXy()[1]);
        System.out.println("xStep is: " + b1.getXYStep()[0]);
        System.out.println("xStep is: " + b1.getXYStep()[1]);

        System.out.println(b1.move());
        System.out.println(b1.move().move().move());
    }
}
