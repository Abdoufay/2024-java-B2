
import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("quelle est votre age ") ;
        int age = scanner.nextInt() ;
        if (age >= 18) {
            System.out.print ("vous etes majeure") ;
        }

        else {
            System.out.print("vous ete mineure") ;
        }

        scanner.close();
       // System.out.println("votre age est : " + age +"ans");//
        
       


    }
    
}
