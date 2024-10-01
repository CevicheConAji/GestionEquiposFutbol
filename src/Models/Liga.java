package Models;

import java.util.LinkedList;

public class Liga {
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
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", equipos=" + equipos +
                '}';
    }
}
