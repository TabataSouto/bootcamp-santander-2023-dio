package edu.tabata.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        String firstName = "Tabata";
        String lastName = "Souto";
        String fullName = fullName(firstName, lastName);

        System.out.println(fullName);
    }

    public static String fullName(String firstName, String lastName) {
        return "Resultado do método " + firstName.concat(" ").concat(lastName);
    }
}
