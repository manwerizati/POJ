public class DemoTurners2 {
    public static void main(String[] args) {
        Turner[] allTurners = {
                new Leaf(),
                new Page(),
                new Pancake(),
                new Car(),
                new TV(),
        };

        for (Turner currentTurner : allTurners) {
            currentTurner.turn();
        }
    }
}
