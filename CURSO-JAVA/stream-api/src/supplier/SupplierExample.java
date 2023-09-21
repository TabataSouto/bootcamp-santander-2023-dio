package supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        // Usa o Supplier com expressão lambda para fornecer uma saudação personalizada.
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // PRIMEIRA FORMA
        // Usa o Supplier para obter uma lista com 5 saudações
        // primeiro criamos/geramos a frase em saudacao 
        List<String> listaSaudacoes = Stream.generate(saudacao)
                // colocamos um limite de quantas vezes queremos gerar essa saudação
                .limit(5)
                // colocamos todas as saudacões geradas em um List
                // aqui pode ser apenas .toList();
                .collect(Collectors.toList());

        // SEGUNDA FORMA
        // List<String> listaSaudacoes = Stream.generate(
        //     new Supplier<String>() {
        //         @Override
        //         public String get() {
        //             return "Olá, seja bem-vindo(a)!"
        //         }
        //     };
        // )

        // Imprime as saudacões
        listaSaudacoes.forEach(s -> System.out.println(s));

        // com reference method
        // listaSaudacoes.forEach(System.out::printIn);
    }
}
