package Models;

import Exception.PlayerNotFoundException;
import Exception.TeamNotFoundException;
import Interface.ILeague;

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
    public LinkedList<Jugador> jugadoresPorNombreEquipo(String nombreEquipo) throws TeamNotFoundException {
        LinkedList<Jugador> jugadores = null;
        for (Equipo equipo : this.equipos) {
            if (equipo.getNombreEquipo().equals(nombreEquipo))
                jugadores = equipo.getJugadores();
        }

        if(jugadores == null)
            throw new TeamNotFoundException(nombreEquipo);
        return jugadores;
    }

    @Override
    public LinkedList<Jugador> jugadoresConMasGoles() {
        LinkedList<Jugador> jugadores = new LinkedList<>();
        int mayorNumeroGoles = 0;

        for (Equipo equipo : this.equipos) {
            for (Jugador jugador : equipo.getJugadores()) {
                if (jugador.getGoles() > mayorNumeroGoles) {
                    //Limpiamos la lista si encontramos uno número mayor al que teniamos guardado en nuestra variable
                    jugadores.clear();
                    jugadores.add(jugador);//Añadimos el nuevo jugador con mas goles
                    mayorNumeroGoles = jugador.getGoles();

                } else if (jugador.getGoles() == mayorNumeroGoles) {
                    jugadores.add(jugador);
                }

            }
        }
        return jugadores;
    }

    @Override
    public void printJugadoresPorNombreEquipo_NombreJugador(String nombreEquipo, String nombreJugador) throws TeamNotFoundException, PlayerNotFoundException {

        for (Equipo equipo : this.equipos) {
            if (equipo.getNombreEquipo().equals(nombreEquipo)) {
                for (Jugador jugador : equipo.getJugadores()) {
                    if (jugador.getNombre().equals(nombreJugador)) {
                        System.out.println(jugador);
                        return; //Salimos del metodo una vez encontrado el jugador
                    }
                }
                //Si no encontramos el jugador
                throw new PlayerNotFoundException(nombreJugador);
            }
        }
        //Si no encontramos el equipo
        throw new TeamNotFoundException(nombreEquipo);

    }
}
