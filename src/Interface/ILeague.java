package Interface;
import Exception.TeamNotFoundException;
import Exception.PlayerNotFoundException;
import Models.Jugador;

import java.util.LinkedList;

public interface ILeague {
    LinkedList<Jugador> listaJugadoresPorNombreEquipo(String nombreEquipo) throws TeamNotFoundException;
    LinkedList<Jugador> listaJugadoresConMasGoles();
    void imprimirJugadoresPorNombreEquipoNombreJugador(LinkedList<Jugador> listaJugadores,String nombreEquipo,String nombreJugador) throws TeamNotFoundException, PlayerNotFoundException;
}
