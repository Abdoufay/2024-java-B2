import java.util.Scanner; // Importation correcte de la classe Scanner

public class compteur { // Nom de classe en majuscule par convention
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Création d'un objet Scanner

        System.out.print("Veuillez entrer un nombre : ");
        int nombre = scanner.nextInt(); // Lecture de l'entrée utilisateur

        System.out.println("Le nombre est " + nombre + "."); // Correction de l'affichage

        // Vérifier si le nombre est pair ou impair
        if (nombre % 2 == 0) {
            System.out.println("Le nombre choisi est un nombre pair.");
        } else {
            System.out.println("Le nombre choisi est impair.");
        }

        
        scanner.close(); // Fermeture du Scanner pour éviter les fuites de ressources
    }
}
