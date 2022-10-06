import java.util.Scanner;

public class CalculadoraInversa { //Ejercicio 13

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dame el primer numero: ");
		int n1 = scanner.nextInt();
		System.out.print("Dame operador: '+' '-' '*' '/' '^' '%' ");
		String comando = scanner.next();
		System.out.print("Dame el segundo numero: ");
		int n2 = scanner.nextInt();
		
		System.out.print("el resultado es: ");
		switch (comando) {
		case "+":
			System.out.println("el resultado es: " + (n1 + n2));
			break;
		case "-":
			System.out.println("el resultado es: " + (n1 - n2));
			break;
		case "*":
			System.out.println("el resultado es: " + (n1 * n2));
			break;
		case "/":
			System.out.println("el resultado es: " + (n1 / n2));
			break;
		case "^":
			System.out.println("el resultado es: " + (Math.pow(n1, n2)));
			break;
		case "%":
			System.out.println("el resultado es: " + (n1 % n2));
			break;

		default:
			break;
		}

	}
}
