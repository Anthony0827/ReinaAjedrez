package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

    private Consola() {

    }

    public static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Crear Reina por defecto");
        System.out.println("2. Crear Reina de un color");
        System.out.println("3. Mover");
        System.out.println("4. Salir");
    }

    public static int elegirOpcionMenu() {
        int eleccion;
        do {
            System.out.print("Elige una opción:");
            eleccion = Entrada.entero();
        } while (eleccion > 4 || eleccion < 1);
        return eleccion;

    }

    public static Color elegirOpcion() {
        int color = 0;
        Color colorElegido = null;
        do {
            System.out.println("");
            System.out.println("1. Negro");
            System.out.println("2. Blanco");
            System.out.print("Elige un color:");
            color = Entrada.entero();
        } while (color != 1 && color != 2);

        switch (color) {
        case 1: {
            colorElegido = Color.NEGRO;
            break;
        }
        case 2: {
            colorElegido = Color.BLANCO;
            break;
        }
        }
        return colorElegido;
    }

    public static void mostrarMenuDirecciones() {
        System.out.println("");
        System.out.println("Movimientos");
        System.out.println("1. Avanzar hacia la Norte");
        System.out.println("2. Avanzar hacia la Noreste");
        System.out.println("3. Avanzar hacia la Este");
        System.out.println("4. Avanzar hacia la Sureste");
        System.out.println("5. Avanzar hacia la Sur");
        System.out.println("6. Avanzar hacia la Suroeste");
        System.out.println("7. Avanzar hacia la Oeste");
        System.out.println("8. Avanzar hacia la Noroeste");

    }

    public static Direccion elegirDireccion() {
        int DireccionElegida = 0;
        Direccion direccion = null;

        do {
            System.out.print("Elige una Direccion:");
            DireccionElegida = Entrada.entero();
        } while (DireccionElegida < 1 || DireccionElegida > 8);

        switch (DireccionElegida) {
        case 1: {
            direccion = Direccion.NORTE;
            break;
        }
        case 2: {
            direccion = Direccion.NORESTE;
            break;
        }
        case 3: {
            direccion = Direccion.ESTE;
            break;
        }
        case 4: {
            direccion = Direccion.SURESTE;
            break;
        }
        case 5: {
            direccion = Direccion.SUR;
            break;
        }
        case 6: {
            direccion = Direccion.SUROESTE;
            break;
        }
        case 7: {
            direccion = Direccion.OESTE;
            break;
        }
        case 8: {
            direccion = Direccion.NOROESTE;
            break;
        }

        }
        return direccion;
    }
    public static int elegirPasos() {
        int pasos = 0;
        System.out.println("Selecciona los pasos del 1 al 7");
        do {
            System.out.print("Elige pasos:");
            pasos = Entrada.entero();
        } while (pasos < 1 || pasos > 7);
        return pasos;
    }

    public static void despedirse() {

        System.out.println("Bien jugado ¡hasta la proxima!");
    }

}