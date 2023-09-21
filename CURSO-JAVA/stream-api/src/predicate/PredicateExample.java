package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "javascript", "phyton", "c#",
                "go", "ruby");

        // FEITO COM PREDICATE E LAMBDA
        // Cria um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usa o Stream para filtrar as palavras com mais de 5 caracteres e,
        // em seguida, imprimir cada palavra que passou no filtro;
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(p -> System.out.println(p));
        

        // FEITO APENAS COM PREDICATE
        palavras.stream()
                .filter(
                    new Predicate<String>() {
                        @Override
                        public boolean test(String p) {
                            return p.length() > 5;
                        }
                    }
                )
                .forEach(p -> System.out.println(p));
    }
}
