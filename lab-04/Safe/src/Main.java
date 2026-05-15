public class Main {
    public static void main(String[] args) {
        Dog pies = new Dog();
        Safe sejf = new Safe(7777, pies);
        sejf.unlock(1234);

        Dog pies2 = new Dog();
        pies2.setLogger(new ConsoleLogger());
        Safe sejf2 = new Safe(7777, pies2);
        sejf2.unlock(1234);

        Dog pies3 = new Dog();
        pies3.setLogger(new FileLogger());
        Safe sejf3 = new Safe(7777, pies3);
        sejf3.unlock(7777);
        sejf3.unlock(1234);
    }
}