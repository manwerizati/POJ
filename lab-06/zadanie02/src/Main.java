public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0);
        System.out.println("Obwód (promień 10): " + circle.getPerimeter());
        System.out.println("Pole (promień 10): " + circle.getArea());

        ResizableCircle resizableCircle = new ResizableCircle(100.0);
        System.out.println("Obwód (promień 100): " + resizableCircle.getPerimeter());
        System.out.println("Pole (promień 100): " + resizableCircle.getArea());

        resizableCircle.resize(50);
        System.out.println("Obwód (promień 50): " + resizableCircle.getPerimeter());
        System.out.println("Pole (promień 50): " + resizableCircle.getArea());
    }
}