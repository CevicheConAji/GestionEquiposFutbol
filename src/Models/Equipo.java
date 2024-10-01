package Models;

import java.util.LinkedList;

public class Equipo {
    private String equipo;
    private int anyoFundacion;
    private LinkedList<Jugador> jugadores = new LinkedList<Jugador>();
    public Equipo(String equipo, int anyoFundacion) {
        this.equipo = equipo;
        this.anyoFundacion = anyoFundacion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getAnyoFundacion() {
        return anyoFundacion;
    }

    public void setAnyoFundacion(int anyoFundacion) {
        this.anyoFundacion = anyoFundacion;
    }

    public LinkedList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(LinkedList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "equipo='" + equipo + '\'' +
                ", anyoFundacion=" + anyoFundacion +
                ", jugadores=" + jugadores +
                '}';
    }
}
