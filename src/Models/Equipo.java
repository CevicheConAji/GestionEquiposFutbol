package Models;

import java.util.LinkedList;

public class Equipo {
    private String nombreEquipo;
    private int anyoFundacion;
    private LinkedList<Jugador> jugadores = new LinkedList<Jugador>();

    public Equipo(String nombreEquipo, int anyoFundacion) {
        this.nombreEquipo = nombreEquipo;
        this.anyoFundacion = anyoFundacion;
    }
    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
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
                " equipo='" + nombreEquipo + '\'' +
                ", anyoFundacion=" + anyoFundacion +
                ", jugadores=" + jugadores +
                '}';
    }
}
