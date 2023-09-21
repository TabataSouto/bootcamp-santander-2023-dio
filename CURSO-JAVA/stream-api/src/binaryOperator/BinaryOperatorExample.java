package binaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // FORMA 1 COM BINARY E LAMBDA
        // Usa o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // Usa o BinaryOperator para somar todos os números do Stream
        int resultado = numeros.stream().reduce(0, somar);

        // FEITO APENAS COM BINARY
        // int resultado = numeros.stream().reduce(0, new BinaryOperator<Integer>() {
        //     @Override
        //     public Integer apply(Integer n1, Integer n2) {
        //         return n1 + n2;
        //     }
        // });

        // Imprime o resultado da soma
        System.out.println("S soma dos números é: " + resultado);
    }
}
