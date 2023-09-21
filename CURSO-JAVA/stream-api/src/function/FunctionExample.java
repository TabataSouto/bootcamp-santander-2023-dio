package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // FORMA 1
        // usa function com expressão lambda para dobrar todos os números;
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // usa a function criada acima para dobrar os números
        // no Stream e armazenar em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                // // mapear passando por cada um dos valores
                .map(dobrar)
                .collect(Collectors.toList());

        // FORMA 2
        // List<Integer> numerosDobrados = numeros.stream()
        //         .map(
        //                 new Function<Integer, Integer>() {
        //                     @Override
        //                     public Integer apply(Integer n) {
        //                         return n * 2;
        //                     }
        //                 })
        //         .collect(Collectors.toList());

        // imprime a lista de números dobrado
        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
