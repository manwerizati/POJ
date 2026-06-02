public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 10, 10, 0, 2, 3);

        System.out.println(rectangle);

        rectangle.moveUp();
        System.out.println(rectangle);

        rectangle.moveRight();
        System.out.println(rectangle);
    }
}