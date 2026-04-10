/* Zaimplementuj klasę MyDate, która przechowuje informację: month (typu int), day(typu int) i year (type int).
Klasa powinna zawierać konstruktor, który inicjalizuje zmienne, sprawdzając poprawność zakresów
(day 0-31, month 0-12, year 1990-2050). Zaimplementuj methody set i get dla wszystkich pól.
Dodaj metodę displayDate, która wyświetli pola z uwzględnieniem zer nieznaczących oddzielone
znakiem "/", np 21/03/2051. Przetestuj zaimplementowaną klasę.

Dominik Borzyszkowski, s35498
 */

class Main {
    public static void main(String[] args) {
        MyDate mydate = new MyDate(21,3,2051);
        mydate.displayDate();
        MyDate mydate1 = new MyDate(32,25,1800);
        mydate1.displayDate();
        MyDate mydate2 = new MyDate(11,9,1995);
        mydate2.displayDate();
    }
}