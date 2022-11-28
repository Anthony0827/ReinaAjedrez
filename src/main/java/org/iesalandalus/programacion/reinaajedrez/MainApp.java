package org.iesalandalus.programacion.reinaajedrez;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
public class MainApp {

    private static Reina Reina;

    private static void crearReinaDefecto() {

        Reina = new Reina();
        System.out.println("");
        System.out.println("Se ha creado una reina.");
        mostrarReina();
        System.out.println("");
    }

    private static void crearReinaColor() {

        Reina = new Reina(Consola.elegirOpcion());

    }

    private static void mover() {

        if (Reina == null) {
            throw new NullPointerException("ERROR: No existe reina para mover. Antes tienes que crear una reina");
        } else {
            Direccion direccion = null;
            int pasos = Consola.elegirPasos();
            Consola.mostrarMenuDirecciones();
            direccion = Consola.elegirDireccion();
            Reina.mover(direccion, pasos);
        }

    }

    private static void ejecutarOpcion(int eleccion) throws IllegalArgumentException {

        switch (eleccion) {
        case 1:
            crearReinaDefecto();
            break;

        case 2:
            crearReinaColor();
            break;

        case 3:
            mover();
            break;
        case 4:
            Consola.despedirse();
            break;
        }

    }

    private static void mostrarReina() {
        System.out.print(Reina.toString());
    }

    public static void main(String[] args) {
        int seleccion;
        boolean acabar = true;

        do {
            Consola.mostrarMenu();
            seleccion = Consola.elegirOpcionMenu();

            try {
                ejecutarOpcion(seleccion);
            } catch (IllegalArgumentException | NullPointerException e) {
                System.out.println(e.getMessage());
            }

            if (Reina != null) {
                try {
                    System.out.println("La posicion de la reina es:");
                    mostrarReina();
                   
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());

                }
            }

            if (seleccion == 4) {
                acabar = false;
            }
        } while (acabar == true);
    }

}