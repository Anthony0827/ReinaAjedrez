package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Direccion {
    NORTE("Norte"), NORESTE("Noreste"), ESTE("Este"), SURESTE("Sureste"), SUR("Sur"), SUROESTE("Suroeste"), OESTE("Oeste"), NOROESTE("Noroeste");
    private String cadenaAmostrar;

    private Direccion(String cadenaAmostrar) {
        this.cadenaAmostrar = cadenaAmostrar;
    }
    @Override
    public String toString() {
        return cadenaAmostrar;
    }
}