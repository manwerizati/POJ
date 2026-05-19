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
    }
}