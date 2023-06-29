package com;

import javax.swing.JOptionPane;

public class EjercicioCiclos5_JHC {

	public static void main(String[] args) {
		// 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
		//de un día desde las 00:00:00 horas hasta las 23:59:59 horas 
		
		int h=0;
		while(h<23){
		int m=0;
		while(m<59){
		int s=0;
		while(s<59){
		JOptionPane.showMessageDialog(null,"La hora es "+String.valueOf(h));
		JOptionPane.showMessageDialog(null,"Los minutos son "+String.valueOf(m));
		JOptionPane.showMessageDialog(null,"Los segundos son "+String.valueOf(s));
		s=s+1;
		}
		m=m+1;
		}
		h=h+1;
		}
	

	}

}
