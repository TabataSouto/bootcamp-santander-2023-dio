// for com array
// public class ExemploForArray {
//     public static void main(String[] args) {
// 		String [] alunos = {"TABATA", "MARCO", "JOÃO"};

// 		for (int x = 0; x < alunos.length; x++) {
// 			System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
// 		}
//     }
// }

// forEach
public class ExemploForArray {
    public static void main(String[] args) {
		String [] alunos = {"TABATA", "MARCO", "JOÃO"};

		for (String aluno : alunos) {
			System.out.println("Nome do aluno é: " + aluno);
		}
    }
}
