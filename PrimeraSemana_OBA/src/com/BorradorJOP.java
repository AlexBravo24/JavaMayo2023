package com;

import javax.swing.JOptionPane;

public class BorradorJOP {

	public static void main(String[] args) {
		// vamos a ver como funciona JopcionPane
		String cadena;
		int numero;
		double decimal;
		char letra;
		
		cadena = JOptionPane.showInputDialog("escriba una cadena: ");// tenemos que importarlo igual que Scanner
		numero = Integer.parseInt(JOptionPane.showInputDialog("digite un entero: ")); // se tubo que hacer la combersion a Integer.parseint
		letra = JOptionPane.showInputDialog("digitte una letra: ").charAt(0); //se le agrego charAt para que guarde un caracter
		decimal = Double.parseDouble(JOptionPane.showInputDialog("digitte un numero con decimal: "));// tambien combertimos porque solo admite cadenas
		
		JOptionPane.showMessageDialog(null, " la cadena escrita es: "+cadena);
		JOptionPane.showMessageDialog(null, "el numero es:"+numero);
		JOptionPane.showMessageDialog(null, "la letra es: "+letra);
		JOptionPane.showMessageDialog(null, "el decimal es:"+decimal);
		

	}

}
