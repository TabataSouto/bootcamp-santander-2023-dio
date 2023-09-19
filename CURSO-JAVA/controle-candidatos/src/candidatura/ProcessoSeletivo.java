package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = { "TABATA", "MARCO", "CESTARI", "MONICA", "BYANCA" };

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if (continuaTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
        } while(continuaTentando && tentativasRealizadas < 3);
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "TABATA", "MARCO", "CESTARI", "MONICA", "BYANCA" };

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado é o(a): " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "TABATA", "MARCO", "CESTARI", "MONICA", "BYANCA", "CAMILA", "THAIS", "PAULO", "JOÃO",
                "SUELI", "DANIELA" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou esre valor de salário " + salarioPretendido);

            if (salarioBase > salarioPretendido) {
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    // gera um valor de salário aleatório entre 1800 e 2200
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
