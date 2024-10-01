import Models.Equipo;
import Models.Jugador;
import Models.Liga;
import Exception.*;
import java.util.LinkedList;
/**
 * @author Piero Zavala
 * @version 0.2
 */
public class Main {

    public static void main(String[] args) {
        LinkedList<Liga> Ligas = crearLiga();
        String nombreEquipo= "Real Madrid";
        LinkedList<Jugador> jugadors;
        //Recorre la lista de liga
        try
        {
            for(Liga liga : Ligas)
            {
                //Metodo de liga que recorre la lista de equipos y crea una lista de jugadores por nombre de equipo.
                jugadors = liga.listaJugadoresPorNombreEquipo(nombreEquipo);

                System.out.println(nombreEquipo +" ["+jugadors+"]");
            }
        }catch (TeamNotFoundException ex) {
            System.out.println("No se encuentra el equipo "+ex.getTeamName());
        }


    }
    public static LinkedList<Liga> crearLiga(){
        LinkedList<Liga> ligas = new LinkedList<>();

        Liga l = new Liga("Liga BBVA","España");

        Equipo e1 = new Equipo("Barcelona",1800);
        Equipo e2 = new Equipo("Real Madrid",18001);

        Jugador j1E1 = new Jugador("Pepe","Loco",2,42);
        Jugador j2E1 = new Jugador("Leonel","Messi",20,45);
        Jugador j3E1 = new Jugador("Kilian","Mbape",18,30);

        Jugador j1E2 = new Jugador("Sonic","Erizo",4,20);
        Jugador j2E2 = new Jugador("Mario","Bros",10,23);
        Jugador j3E2 = new Jugador("Luigi","Bros",15,23);

        l.addEquipo(e1);
        l.addEquipo(e2);
        e1.addJugador(j1E1);
        e1.addJugador(j2E1);
        e1.addJugador(j3E1);

        e2.addJugador(j1E2);
        e2.addJugador(j2E2);
        e2.addJugador(j3E2);
        ligas.add(l);
        return ligas;
    }
}