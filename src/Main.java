public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1,1);
        int c = calculator.devide.apply(a, b); // 3 / 0 - делить на ноль запрещено

        int d = calculator.multiply.apply(3, 15);

        calculator.println.accept(c);
        calculator.println.accept(d);
    }
}
