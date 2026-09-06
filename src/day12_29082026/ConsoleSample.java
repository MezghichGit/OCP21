package day12_29082026;

import java.io.Console;
import java.util.Arrays;

public class ConsoleSample {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console != null) {
            // 1. Lecture d'une chaîne simple
            String userInput = console.readLine("Entrez votre nom: ");
            console.writer().println("Bonjour " + userInput + "!");
            
            // 2. Lecture avec formatage
            String ageInput = console.readLine("Entrez votre âge (ou tapez 'exit' pour quitter): ");
        }
            /*
            if ("exit".equalsIgnoreCase(ageInput)) {
                console.writer().println("Au revoir!");
                return;
            }
            
            try {
                int age = Integer.parseInt(ageInput);
                console.writer().printf("Vous avez %d ans.%n", age);
            } catch (NumberFormatException e) {
                console.writer().println("Âge invalide!");
            }
            
            // 3. Lecture sécurisée d'un mot de passe (masqué)
            char[] password = console.readPassword("Entrez votre mot de passe: ");
            console.writer().println("Mot de passe saisi: " + new String(password).replaceAll(".", "*"));
            
            // 4. Lecture avec prompt et formatage
            String email = console.readLine("Entrez votre email (%d caractères max): ", 50);
            console.writer().println("Email enregistré: " + email);
            
            // 5. Formatage avancé
            console.writer().format("=== RÉCAPITULATIF ===%n");
            console.writer().format("Nom: %s%n", userInput);
            console.writer().format("Email: %s%n", email);
            console.writer().format("Mot de passe: %s%n", new String(password).replaceAll(".", "*"));
            
            // 6. Effacement sécurisé du mot de passe
            Arrays.fill(password, ' ');
            
            // 7. Lecture de plusieurs entrées
            console.writer().println("\nEntrez vos compétences (séparées par des virgules):");
            String skillsInput = console.readLine();
            String[] skills = skillsInput.split(",");
            
            console.writer().println("\n=== VOS COMPÉTENCES ===");
            for (int i = 0; i < skills.length; i++) {
                console.writer().printf("%d. %s%n", i + 1, skills[i].trim());
            }
            
            // 8. Boucle interactive
            console.writer().println("\n--- Mode interactif (tapez 'quit' pour arrêter) ---");
            String command;
            while (true) {
                command = console.readLine("> ");
                if ("quit".equalsIgnoreCase(command)) {
                    break;
                }
                console.writer().println("Vous avez tapé: " + command);
                console.writer().println("Tapez 'quit' pour sortir");
            }
            
            console.writer().println("\nProgramme terminé!");
            
        } else {
            System.err.println("Console non disponible. Exécutez ce programme depuis une console (pas depuis un IDE comme Eclipse ou IntelliJ).");
            System.err.println("Utilisez la ligne de commande : java ConsoleSample");
        }*/
    }
}