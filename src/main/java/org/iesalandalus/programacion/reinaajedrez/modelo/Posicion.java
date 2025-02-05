package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {

    private int fila;
    private char columna;

    public Posicion(int fila, char columna) {
        setFila(fila);
        setColumna(columna);
    }

    public Posicion(Posicion posicion) {
        if (posicion == null) {
            throw new NullPointerException("ERROR: No es posible copiar una posición nula");
        } else {

            this.fila = posicion.fila;
            this.columna = posicion.columna;
        }
    }

    private void setFila(int fila) {

        if (fila >= 1 && fila <= 8) {
            this.fila = fila;
        } else {
            throw new IllegalArgumentException("ERROR: Fila no válida");

        }
    }
    public int getFila() {
        return fila;
    }

    private void setColumna(char columna) {
        if (columna == 'a' || columna == 'b' || columna == 'c' || columna == 'd' || columna == 'e' || columna == 'f' ||
            columna == 'g' || columna == 'h') {
            this.columna = columna;
        } else {
            throw new IllegalArgumentException("ERROR: Columna no válida");
        }
    }
    public char getColumna() {
        return columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Posicion other = (Posicion) obj;
        if (columna != other.columna)
            return false;
        if (fila != other.fila)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "fila=" + fila + ", columna=" + columna + "";
    }

}