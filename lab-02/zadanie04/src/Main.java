class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(0, 0, 59);
        System.out.println(clock.toString());
        clock.tick();
        System.out.println(clock.toString());

        Clock clock2 = new Clock();
        System.out.println(clock2.toString());

        Clock clock3 = new Clock(3500);
        System.out.println(clock3.toString());

        Clock clock4 = new Clock(1, 0, 0);
        clock4.tickDown();
        System.out.println(clock4.toString());
    }
}