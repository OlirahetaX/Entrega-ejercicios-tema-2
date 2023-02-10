package entrega_ejercicios.tema.pkg2;

import java.util.Scanner;

public class Entrega_ejerciciosTema2 {

    public static void main(String[] args) {
        Scanner rm = new Scanner(System.in);
        System.out.print("Ingrese precio -> ");
        int precio = rm.nextInt();
        double newprecio = IVA(precio);
        System.out.println("Precio con el IVA: " + newprecio);
    }

    private static double IVA(int precio) {
        return precio * 1.16;
    }

}
