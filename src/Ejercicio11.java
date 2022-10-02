import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un día de la semana: ");
		String dia = scanner.nextLine();
		dia = dia.toLowerCase();
		switch (dia) {
		case "lunes":
			System.out.println("Es laborable");
			break;
		case "martes":
			System.out.println("Es laborable");
			break;
		case "miercoles":
			System.out.println("Es laborable");
			break;
		case "jueves":
			System.out.println("Es laborable");
			break;
		case "viernes":
			System.out.println("Es laborable");
			break;
		case "sabado":
			System.out.println("Es festivo");
			break;
		case "domingo":
			System.out.println("Es festivo");
			break;

		default:
			break;
		}
	}
}
