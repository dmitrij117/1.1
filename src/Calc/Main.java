package Calc;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instanse.get();

        int a = calc.plus.apply(3, 2);
        int b = calc.minus.apply(1, 4);
        int d = calc.pow.apply(3);
        int c = calc.devide.apply(a, b);
        int f = calc.abc.apply(2);


        calc.println.accept(c);
    }
}
