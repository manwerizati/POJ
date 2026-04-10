class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(1, 2, 3);
        System.out.println(numbers.Sum());
        System.out.println(numbers.Average());
        System.out.println(numbers.min());
        System.out.println(numbers.max());
        System.out.println(numbers.geometric());
    }
}