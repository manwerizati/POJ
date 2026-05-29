public class Main {
    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];

        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i+ 1, i + 1);
        }

        for (int i = 0; i < points.length; i++) {
            System.out.println("Punkt: " + (i + 1) + ": " + points[i].toString());
        }

        System.out.println("Odległość między punktem 1 a punktem 10: " + points[0].distance(points[9]));

        MyCircle c1 = new MyCircle(0, 0, 5);
        MyCircle c2 = new MyCircle(3, 4, 10);

        System.out.println("Koło 1: " + c1);

        System.out.println("Pole c1: " + c1.getArea());
        System.out.println("Obwód c1: " + c1.getCircumference());

        System.out.println("Odległość między c1 a c2: " + c1.distance(c2));

        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println("Trójkąt 1: " + t1);
        System.out.println("Obwód t1: " + t1.getPerimeter());
        System.out.println("Typ t1: " + t1.getType());

        MyRectangle r1 = new MyRectangle(1, 4, 5, 1);
        System.out.println("Prostokąt 1: " + r1);
        System.out.println("Pole r1: " + r1.getArea());
        System.out.println("Obwód r1: " + r1.getPerimeter());

        MyPoint pTopLeft = new MyPoint(2, 6);
        MyPoint pBottomRight = new MyPoint(4, 2);
        MyRectangle r2 = new MyRectangle(pTopLeft, pBottomRight);
        System.out.println("Prostokąt 2: " + r2);
        System.out.println("Pole r2: " + r2.getArea());
        System.out.println("Obwód r2: " + r2.getPerimeter());
    }
}