package main;
import javax.swing.JOptionPane;

public class ConvertirMoneda {
	static boolean flag = true;
	static void convertir(double valor,String moneda) {
		
		try {
			double cantidadMoneda = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor a convertir: "));
			double resultado = cantidadMoneda / valor;
			
			resultado = (double) Math.round(resultado * 100d)/100;

			JOptionPane.showMessageDialog(null, "Tienes $" +resultado+" "+moneda+".");
			int respuesta = 0;
			respuesta = JOptionPane.showConfirmDialog(null, "Desea continuar convirtiendo monedas?");
			
			if(JOptionPane.OK_OPTION == respuesta) {
				JOptionPane.showMessageDialog(null, "Seleccionaste continuar convirtiendo.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Programa terminado");
				flag = false;
			}
		}catch(NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "Por favor ingrese un valor numerico VALIDO.");
			
		}
		
		
	}
}
