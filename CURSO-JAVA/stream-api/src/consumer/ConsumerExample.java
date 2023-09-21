package consumer;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // PRIMEIRA FORMA DE SE FAZER
        // Usa o Consumer com expressão lambda para imprimir números pares
        // similar a uma function que recebe um parametro em javascript
        Consumer<Integer> imprimirNumeros = numero -> {
            if (numero % 2 == 0)
                System.out.println(numero);
        };

        // Usa o Consumer para imprimir números pares no stream
        numeros.stream().forEach(imprimirNumeros);

        // SEGUNDA FORMA DE SE FAZER
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        });
    }
}
