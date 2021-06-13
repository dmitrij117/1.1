package Calc;

import  java.util.function. * ;

public class Calculator {

    static Supplier<Calculator> instanse = Calculator::new;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multipli = ( x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abc = x -> x > 0 ? x : (x * -1);
    // Может произойти делении на 0,
    // вторая проблема это то что деление не всегда дает целочисленный результат (округляется)
    // для учебных целей при делении на 0 считать результат 0


    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
