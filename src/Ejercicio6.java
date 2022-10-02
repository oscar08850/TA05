import java.util.Scanner;


public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		final double IVA = 0.21;
		
		
		System.out.print("Introduce el precio: ");
		double precioFinal = Double.parseDouble(scanner.nextLine());

		System.out.println("El precio final es: " + (precioFinal+(precioFinal*IVA)));
		
	}
}
