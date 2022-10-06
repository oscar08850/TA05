import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		if (numero%2 == 0)
			System.out.println("El numero es par");
		else 
			System.out.println("El número no es par");
		
	}

}
