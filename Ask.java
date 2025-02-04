import java.util.Scanner;

public class Ask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Correction de la déclaration du Scanner
        System.out.print("Entrez votre nom : "); // Correction de l'affichage du message
        String nom = scanner.nextLine(); // Lecture de l'entrée utilisateur
        System.out.println("Bonjour, " + nom + " !"); // Correction de l'affichage du message de bienvenue
        scanner.close(); // Fermeture du scanner
    }
}
