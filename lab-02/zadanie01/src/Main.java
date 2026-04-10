/* Zaimplementuj klasę Card reprezentującą pojedynczą kartę do gry z talii kart.
Klasa powinna przechowywać wartość i kolor: kier, karo, pik, trefl.
W zadaniu użyj typu wyliczeniowego.
Napisz program testujący, który stworzy trzy różne obiekty klasy Card.

Dominik Borzyszkowski, s35498
 */

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card("As", Suit.KIER);
        Card card2 = new Card("Król", Suit.KARO);
        Card card3 = new Card("Dama", Suit.PIK);

        System.out.println(card1.value + " " + card1.suit);
        System.out.println(card2.value + " " + card2.suit);
        System.out.println(card3.value + " " + card3.suit);
    }
}