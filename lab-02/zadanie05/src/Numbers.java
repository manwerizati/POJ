public class Numbers {
    private int a;
    private int b;
    private int c;

    Numbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int Sum() {
        return a + b + c;
    }

    double Average() {
        return (a + b + c) / 3.0;
    }

    int min() {
        return Math.min(a, Math.min(b, c));
    }

    int max() {
        return Math.max(a, Math.max(b, c));
    }

    double geometric() {
        int x = a * b * c;
        return (Math.pow(x, 1.0/3.0));
    }
}
