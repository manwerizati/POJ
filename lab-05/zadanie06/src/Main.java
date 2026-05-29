public class Main {
    public static void main(String[] args) {
        ChemicalElement[] elements = {
                new ChemicalElement("Hydrogen", "H", 1),
                new ChemicalElement("Oxygen", "O", 8),
                new ChemicalElement("Potassium", "K", 19),
                new ChemicalElement("Zinc", "Zn", 30),
                new ChemicalElement("Gallium", "Ga", 31)
        };

        for (ChemicalElement el : elements) {
            System.out.println("Pierwiastek: " + el.getName() + " (" + el.getSymbolicName() + ")");
            System.out.println("Liczba atomowa: " + el.getAtomicNumber());
            System.out.println("Metal alkaliczny? " + el.isAlkaliMetal());
            System.out.println("Metal przejściowy? " + el.isTransitionMetal());
            System.out.println("Zwykły metal? " + el.isMetal());
        }
    }
}