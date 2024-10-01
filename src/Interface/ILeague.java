package Interface;

import Models.Jugador;

import java.util.LinkedList;

public interface ILeague {
    LinkedList<Jugador> listaJugadoresPorNombreEquipo(String nombre);
}
