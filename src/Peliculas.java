public class Peliculas {
    String nombre;
    String director;
    int anio;
    String genero;
    double calificacion;
    String personajesPrincipales;
    String tiempo;
    /*public Peliculas(){
        nombre = "Ice Road";
        director = "Jonathan Hensleigh";
        anio = 2021;
        genero = "Accion-Drama-Suspenso";
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
