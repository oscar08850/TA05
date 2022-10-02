import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número de ventas: ");
		int ventas = Integer.parseInt(scanner.nextLine());
		int factura = 0;
		
		while(ventas>0) {
			System.out.print("Precio del objeto: ");
			int total = Integer.parseInt(scanner.nextLine());
			factura = total + factura;
			ventas--;
		}
		
		System.out.println("Las ventas ascienden a: " + factura);
		
	}
}
