import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
		JOptionPane.showMessageDialog(null, "Bienvenido: " + nombre);
	}

}
