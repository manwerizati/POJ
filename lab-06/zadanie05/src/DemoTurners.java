public class DemoTurners {
    public static void main(String[] args) {
        Turner[] allTurners = {
                new Leaf(),
                new Page(),
                new Pancake(),
        };

        for (Turner currentTurner : allTurners) {
            currentTurner.turn();
        }
    }
}
