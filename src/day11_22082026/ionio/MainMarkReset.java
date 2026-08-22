package day11_22082026.ionio;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
public class MainMarkReset {
	


	    public static void main(String[] args) throws Exception {
	        // Création d'un flux d'entrée avec des données simulées
	        byte[] data = "abcdef".getBytes();
	        InputStream is = new FileInputStream("C:\\Users\\Amine\\Desktop\\Lab_Jenkins\\zoo.txt");
            //Programmation
	        // Lecture du premier caractère : 'a'
	        System.out.print((char) is.read()); // affiche 'a'

	        
	        System.out.println(is.markSupported());
	        if (is.markSupported()) {
	            // Marque la position actuelle (après avoir lu 'a')
	            is.mark(4);
	            // Lit les caractères suivants : 'b', 'c'
	            System.out.print((char) is.read()); // affiche 'b'
	            System.out.print((char) is.read()); // affiche 'c'
	            // Reset : retour à la position marquée (après 'a')
	            is.reset();
	        }

	        // Lecture des caractères à partir de la position après 'a'
	        System.out.print((char) is.read()); // affiche 'b'
	        System.out.print((char) is.read()); // affiche 'c'
	        System.out.print((char) is.read()); // affiche 'd'

	        // Sortie finale : "abc bcd" ou "abcbcd" selon l'affichage
	        // Avec des sauts de ligne pour plus de clarté, on peut ajouter :
	        // System.out.println();
	    }
	}
