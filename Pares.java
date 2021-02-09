import java.io.IOException;
import java.util.Scanner;

public class Pares {
	
    public static void main(String[] args) throws IOException {

        Scanner recebeNumero = new Scanner(System.in);

        int numero = recebeNumero.nextInt();

    	for (int i = 1 ; i <= numero ; i++) {
    		if (i % 2 == 0 ) System.out.println(i);
        }
        
        recebeNumero.close();

    }
	
}