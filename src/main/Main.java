package main;

import javax.swing.JOptionPane;


public class Main extends ConvertirMoneda {
	public static void main(String[] args) {
		while (flag) {
			String option = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero. ",
					"Monedas", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { "De pesos a Dolar", "De pesos a Euros", "De pesos a Libras Esterlinas", "De pesos a Yen Japonés","De pesos a Won sul-coreano",
							"De Dolar a Pesos","De Euros a Pesos","De Won sul-coreano a Pesos","De Yen Japonés a Pesos","De Libras Esterlinas a Pesos" }, "Seleccion")
					.toString();
			switch (option) {
			case "De pesos a Dolar": {
				convertir(207.42, "Dolares");
				break;
			}
			case "De pesos a Euros": {
				convertir(224.39 , "Euros");
				break;
			}
			case "De pesos a Libras Esterlinas": {
				convertir(255.46, "Libras Esterlinas");
				break;
			}
			case "De pesos a Yen Japonés": {
				convertir(1.59, "Yen Japonés");
				break;
			}
			case "De pesos a Won sul-coreano": {
				convertir(0.16, "Won sul-coreano");
				break;
			}
			case "De Dolar a Pesos": {
				convertir(0.0048, "Pesos");
				break;
			}
			case "De Euros a Pesos": {
				convertir(0.0045, "Pesos");
				break;
			}
			case "De Libras Esterlinas a Pesos": {
				convertir(0.0039, "Pesos");
				break;
			}
			case "De Yen Japonés a Pesos": {
				convertir(0.63, "Pesos");
				break;
			}
			case "De Won sul-coreano a Pesos": {
				convertir(6.25, "Pesos");
				break;
			}
			default:{
				flag = false;
			}
			
			}
		}
	}
}
