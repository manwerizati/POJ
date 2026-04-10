/* Zaimplementuj klasę Numbers. Dodaj konstruktor który przyjmuje trzy liczby typu integer.
Dodaj metody:
sum(), zwraca sumę liczb;
average(), zwraca średnią arytmetyczną liczb;
min(), zwraca najmniejszą z liczb;
max(), zwraca największą z liczb;
geometric(), zwraca średnią geometryczną liczb; Przetestuj zaimplementowany program.

Dominik Borzyszkowski, s35498
 */

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