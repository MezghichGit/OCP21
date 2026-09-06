package day12_29082026;

import java.io.PrintWriter;
import java.util.Locale;

public class FormatExample {
    public static void main(String[] args) {
        // Création d'un PrintWriter
        try (PrintWriter writer = new PrintWriter(System.out)) {
            
            // Exemple 1: Formatage d'un nombre avec Locale US
            double prix = 1234.56;
            writer.format(Locale.US, "Prix (US): $%,.2f%n", prix);
            // Sortie: Prix (US): $1,234.56
            
            // Exemple 2: Formatage d'un nombre avec Locale FRANCE
            writer.format(Locale.FRANCE, "Prix (FR): %,.2f €%n", prix);
            // Sortie: Prix (FR): 1 234,56 €
            
            // Exemple 3: Formatage de date avec Locale
            java.util.Date date = new java.util.Date();
            writer.format(Locale.US, "Date (US): %tA, %te %tB %tY%n", date, date, date, date);
            // Sortie: Date (US): Tuesday, 19 October 2026
            
            writer.format(Locale.FRANCE, "Date (FR): %tA %td %tB %tY%n", date, date, date, date);
            // Sortie: Date (FR): mardi 19 octobre 2026
            
            // Exemple 4: Formatage avec plusieurs arguments
            String nom = "Jean";
            int age = 25;
            writer.format(Locale.US, "Nom: %s, Âge: %d ans%n", nom, age);
            // Sortie: Nom: Jean, Âge: 25 ans
        }
    }
}