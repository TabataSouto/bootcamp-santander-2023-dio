package predicate;

import java.util.Arrays;
import java.util.List;

public class PredicateLambda {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "javascript", "phyton", "c#",
                "go", "ruby");

        palavras.stream()
            .filter(p -> p.length() > 5)
            .forEach(p -> System.out.println(p));
    }
}
