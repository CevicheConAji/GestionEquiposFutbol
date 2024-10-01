package Models;

import Interface.ILeague;
import Exception.*;
import java.util.LinkedList;

public class Liga implements ILeague {
    private String nombre;
    private String pais;
    private LinkedList<Equipo> equipos = new LinkedList<Equipo>();
    public Liga(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }
    public void addEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LinkedList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(LinkedList<Equipo> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                " nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", equipos=" + equipos +
                '}';
    }

    /**
     *
     * @param nombreEquipo
     * @return LinkedList de jugadores
     * @throws TeamNotFoundException
     */
    @Override
    public LinkedList<Jugador> listaJugadoresPorNombreEquipo(String nombreEquipo) throws TeamNotFoundException {
        LinkedList<Jugador> jugadores = null;
        for (Equipo equipo : this.equipos) {
            if(equipo.getEquipo().equals(nombre))
                jugadores = equipo.getJugadores();
        }

        if(jugadores == null)
            throw new TeamNotFoundException(nombre);
        return jugadores;
    }

    @Override
    public LinkedList<Jugador> listaJugadoresConMasGoles() {
        return null;
    }

    @Override
    public void imprimirJugadoresPorNombreEquipoNombreJugador(LinkedList<Jugador> listaJugadores, String nombreEquipo, String nombreJugador) throws TeamNotFoundException, PlayerNotFoundException {

    }
}
