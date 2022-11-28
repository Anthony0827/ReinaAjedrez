package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
    private Color color;
    private Posicion posicion;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        if (color == null) {
            throw new NullPointerException("ERROR: El color no puede ser nulo");
        }
    }

    public Posicion getPosicion() {
        return posicion;
    }

    private void setPosicion(Posicion posicion) {
        this.posicion = posicion;
        if (posicion == null) {
            throw new NullPointerException("ERROR: No es posible copiar una posición nula");
        }

    }

    public Reina() {
        this.color = Color.NEGRO;
        this.posicion = new Posicion(8, 'b');
    }

    public Reina(Color color) {
        setColor(color);

        if (color == Color.BLANCO) {
            posicion = new Posicion(1, 'd');
        } else if (color == Color.NEGRO) {
            posicion = new Posicion(8, 'b');
        }
    }

    public Reina(Color color, char columna) {
        setColor(color);

        if (color == Color.BLANCO) {
            posicion = new Posicion(1, columna);
        } else if (color == Color.NEGRO) {
            posicion = new Posicion(8, columna);
        }
    }

    public void mover(Direccion direccion, int pasos) throws IllegalArgumentException {

        if (direccion == null) {
            throw new NullPointerException("ERROR: La dirección no puede ser nula");
        } else if (pasos < 1 || pasos > 7) {
            throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7");
        }

        if (direccion.equals(Direccion.NORTE)) {
            try {
                setPosicion(new Posicion(posicion.getFila() + pasos, posicion.getColumna()));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("ERROR: Movimiento no válido (La reina se sale del tablero)");
            }
        } else if (direccion.equals(Direccion.SUR)) {
            try {
                setPosicion(new Posicion(posicion.getFila() - pasos, posicion.getColumna()));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("ERROR: Movimiento no válido (La reina se sale del tablero)");
            }
        } else if (direccion.equals(Direccion.ESTE)) {
            try {
                setPosicion(new Posicion(posicion.getFila(), (char)(posicion.getColumna() + pasos)));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("ERROR: Movimiento no válido (La reina se sale del tablero)");
            }

        } else if (direccion.equals(Direccion.OESTE)) {
            try {
                setPosicion(new Posicion(posicion.getFila(), (char)(posicion.getColumna() - pasos)));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("ERROR: Movimiento no válido (La reina se sale del tablero)");
            }
        } else if (direccion.equals(Direccion.NORESTE)) {
            try {
                setPosicion(new Posicion(posicion.getFila() + pasos, (char)(posicion.getColumna() + pasos)));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("ERROR: Movimiento no válido (La reina se sale del tablero)");
            }
        } else if (direccion.equals(Direccion.NOROESTE)) {
            try {
                setPosicion(new Posicion(posicion.getFila() + pasos, (char)(posicion.getColumna() - pasos)));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("ERROR: Movimiento no válido (La reina se sale del tablero)");
            }
        } else if (direccion.equals(Direccion.SURESTE)) {
            try {
                setPosicion(new Posicion(posicion.getFila() - pasos, (char)(posicion.getColumna() + pasos)));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("ERROR: Movimiento no válido (La reina se sale del tablero)");
            }
        } else if (direccion.equals(Direccion.SUROESTE)) {
            try {
                setPosicion(new Posicion(posicion.getFila() - pasos, (char)(posicion.getColumna() - pasos)));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("ERROR: Movimiento no válido (La reina se sale del tablero)");
            }
        }

    }

    @Override
    public String toString() {
        return "Reina [color= " + color + ", posicion= " + posicion + "columna= " + posicion.getColumna() + "]";
    }

}