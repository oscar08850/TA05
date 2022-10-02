import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el Radio: "));
		double area = Math.PI * Math.pow(radio, 2);
		JOptionPane.showMessageDialog(null, "El radio es: " + area);

	}

}
