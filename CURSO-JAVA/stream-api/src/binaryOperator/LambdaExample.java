package binaryOperator;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int resultado = numeros.stream()
            .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("S soma dos números é: " + resultado);
    }
}
