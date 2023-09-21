package supplier;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExample {
    public static void main(String[] args) {
        // Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // Usa o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(
                () -> "Olá, seja bem-vindo(a)!")
                .limit(2)
                .collect(Collectors.toList());

        // Imprime as saudacões
        listaSaudacoes.forEach(s -> System.out.println(s));
    }
}
