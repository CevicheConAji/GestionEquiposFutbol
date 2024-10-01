package Interface;
import Exception.TeamNotFoundException;
import Exception.PlayerNotFoundException;
import Models.Jugador;

import java.util.LinkedList;

public interface ILeague {
    LinkedList<Jugador> jugadoresPorNombreEquipo(String nombreEquipo) throws TeamNotFoundException;
    LinkedList<Jugador> jugadoresConMasGoles();
    void printJugadoresPorNombreEquipo_NombreJugador(String nombreEquipo, String nombreJugador) throws TeamNotFoundException, PlayerNotFoundException;
}
