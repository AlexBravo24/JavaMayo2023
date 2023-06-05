package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrays5_JDMS {

    public static void main(String[] args) {
        List<Integer> tabla1 = new ArrayList<>();
        List<String> tabla2 = new ArrayList<>();
        Scanner valor = new Scanner(System.in);
        char seguir;

        do {
            System.out.println("Favor de ingresar nombre productos: ");
            tabla2.add(valor.nextLine());
            System.out.println("Favor de ingresar cantidad de productos: ");
            tabla1.add(valor.nextInt());
            // Need to consume newline left-over
            valor.nextLine();
            System.out.println("Seguira comprando N/S: ");
            seguir = valor.nextLine().charAt(0);
            System.out.println(" ");
        } while (seguir == 'S' || seguir == 's');

        for (int i = 0; i < tabla1.size(); i++) {
            System.out.println("Cantidad: " + tabla1.get(i) + " Producto: " + tabla2.get(i));
        }
    }

}