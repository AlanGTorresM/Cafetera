package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int x;
        Cafetera cafetera= new Cafetera();
        System.out.println("Bienvenido a la cafeteria" +
                "\n Nuestro menu es Expreso, Americano y Capuchino");
        while(cafetera.condicional==true){
            System.out.println("si quieres un Expreso presina 1" +
                    "\nsi quieres un americano presiona 2" +
                    "\nsi quieres un capuchino presiona 3");
            x= entrada.nextByte();
            switch (x){
                case 1:
                    cafetera.Expreso();
                    break;
                case 2:
                    cafetera.Americano();
                    break;
                case 3:
                    cafetera.Capuchino();
                    break;
                default:
                    System.out.println("valor no valido");
            }

        }
    }
}