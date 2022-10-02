import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		String contraseña = "a";
		String intentoContra = JOptionPane.showInputDialog("Introduce contraseña");
		int intento = 2;
		
		
		while(contraseña != intentoContra && intento > 0) {
			
			if (contraseña == intentoContra)
				JOptionPane.showMessageDialog(null, "Bienvenido: ");
			else {
				intentoContra = JOptionPane.showInputDialog("Contraseña incorrecta, vuelve a intentarlo: ");
				intento--;
			}
			System.out.println("El intento de contraseña es: " + intentoContra);
			System.out.println("La contraseña es: " + contraseña);

		}
		if (intentoContra == contraseña)
			JOptionPane.showMessageDialog(null, "Contraseña correcta!!!");

		else if (intento == 0) {
			JOptionPane.showMessageDialog(null, "Demasiados intentos");
		 
		}
		
	}
}
