public class prin {
    static final String RESET = "\u001B[0m";
    static final String AZUL = "\u001B[34m";
    static final String ROJO = "\u001B[31m";
    static final String VERDE = "\u001B[32m";
    public static void main(String[] args) {
        Peliculas iceRoad = new Peliculas();
        iceRoad.nombre = "Ice Road";
        iceRoad.director = "Jonathan Hensleigh";
        iceRoad.anio = 2021;
        iceRoad.genero= "Accion-Drama-Suspenso";
        iceRoad.calificacion = 3.6;
        iceRoad.personajesPrincipales = "Mike McCann, Tantoo, Gurty McCann";
        iceRoad.tiempo = "1h43m";
        mostrarPelicula(iceRoad);//Funcion para mostrar las instancias de la clase Peliculas

        Peliculas redNotice = new Peliculas();
        redNotice.nombre = "Red Notice";
        redNotice.director = "Rawson Marshall Thurber";
        redNotice.anio = 2021;
        redNotice.genero= "Suspenso, thriller de acción y comedia.";
        redNotice.calificacion = 4.0;
        redNotice.personajesPrincipales = "The Bishop, John Hartley, Nolan Booth, Inspector Urvashi Das";
        redNotice.tiempo = "1h55m";
        mostrarPelicula(redNotice);//Funcion para mostrar las instancias de la clase Peliculas

        Peliculas milagrosIns = new Peliculas();
        milagrosIns.nombre = "Milagros inesperados";
        milagrosIns.director = "Frank Darabont";
        milagrosIns.anio = 1999;
        milagrosIns.genero= "Drama - Fantasia - Misterio";
        milagrosIns.calificacion = 4.9;
        milagrosIns.personajesPrincipales = "John Coffey, Paul Edgecomb";
        milagrosIns.tiempo = "3h9m";
        mostrarPelicula(milagrosIns);//Funcion para mostrar las instancias de la clase Peliculas

        Peliculas noMiresArriba = new Peliculas();
        noMiresArriba.nombre = "No mires Arriba";
        noMiresArriba.director = "Adam McKay";
        noMiresArriba.anio = 2021;
        noMiresArriba.genero= "Catastrofe - Comedia Negra, Satira Politica";
        noMiresArriba.calificacion = 3.9;
        noMiresArriba.personajesPrincipales = "John Coffey, Paul Edgecomb";
        noMiresArriba.tiempo = "2h25m";
        mostrarPelicula(noMiresArriba);//Funcion para mostrar las instancias de la clase Peliculas

        Peliculas venom = new Peliculas();
        venom.nombre = "Venom";
        venom.director = "Ruben Fleischer";
        venom.anio = 2018;
        venom.genero= "Superhéroes, Comedia negra, Accion";
        venom.calificacion = 4.5;
        venom.personajesPrincipales = "Venom, Anne Weying";
        venom.tiempo = "1h52m";
        mostrarPelicula(venom);//Funcion para mostrar las instancias de la clase Peliculas

        Peliculas granMuralla = new Peliculas();
        granMuralla.nombre = "La Gran Muralla";
        granMuralla.director = "Zhang Yimou";
        granMuralla.anio = 2016;
        granMuralla.genero= "Accion, Aventura, Ficcion Historica";
        granMuralla.calificacion = 4.5;
        granMuralla.personajesPrincipales = "William Garin, Comandante Lin Mae, Ballard";
        granMuralla.tiempo = "1h43m";
        mostrarPelicula(granMuralla);//Funcion para mostrar las instancias de la clase Peliculas
    }

    public static void mostrarPelicula (Peliculas pelicula){
        System.out.println();
        System.out.println(ROJO + "--------------------------------------------------------------------------------------" + RESET);
        System.out.println(VERDE + "Nombre: " + RESET + AZUL + pelicula.nombre + RESET);
        System.out.println(VERDE + "Director: " + RESET + AZUL + pelicula.director + RESET);
        System.out.println(VERDE + "Anio: " + RESET + AZUL + pelicula.anio + RESET);
        System.out.println(VERDE + "Genero: " + RESET + AZUL + pelicula.genero + RESET);
        System.out.println(VERDE + "Tiempo de duración: " + RESET + AZUL + pelicula.tiempo + RESET);
        System.out.println(VERDE + "Personajes Principales: " + RESET + AZUL + pelicula.personajesPrincipales + RESET);
        System.out.println(VERDE + "Calificación 1-5: " + RESET + AZUL + pelicula.calificacion + RESET);
    }
}
