package ejercicio18;

import Ejercicio17.Electrodomestico;


public class Ejecutable {


    public static void main(String[] args) {

        Serie listaSeries[] = new Serie[5];
        Videojuego listaVideoJuegos[] = new Videojuego[5];


        Serie serie1 = new Serie();
        Serie serie2 = new Serie("La casa de papel", "Alex");
        serie2.entregar();
        Serie serie3 = new Serie("Rick and morty", 5, "Ciencia ficción", "Justin");
        Serie serie4 = new Serie("sex education", 3, "comedia", "Laurie");
        Serie serie5 = new Serie("los simpson", 32, "comedia animada", "Matt G");
        serie5.entregar();

        Videojuego videoJuego1 = new Videojuego();
        Videojuego videoJuego2 = new Videojuego("Resident Evil", 5);
        videoJuego2.entregar();
        Videojuego videoJuego3 = new Videojuego("Super Mario", 8, "plataformas", "nintendo");
        Videojuego videoJuego4 = new Videojuego("Call of Dutty", 40, "Acción", "Avtivision");
        videoJuego4.entregar();
        Videojuego videoJuego5 = new Videojuego("GTAV", 22, "Acción", "RockstarGames");

        listaSeries[0] = serie1;
        listaSeries[1] = serie2;
        listaSeries[2] = serie3;
        listaSeries[3] = serie4;
        listaSeries[4] = serie5;
        listaVideoJuegos[0] = videoJuego1;
        listaVideoJuegos[1] = videoJuego2;
        listaVideoJuegos[2] = videoJuego3;
        listaVideoJuegos[3] = videoJuego4;
        listaVideoJuegos[4] = videoJuego5;

        Ejecutable eje = new Ejecutable();
        eje.operar(listaSeries, listaVideoJuegos);

    }
        public void operar (Serie [] listaSeries, Videojuego[] listaVideoJuegos) {
            int countSeriesEntrag = 0;
            int countVideoJuegEntreg = 0;

            Serie serieMaxTemp = null;
            Videojuego videoJuegoMaxHor = null;

            Integer maxTemp = 0; // mayor numer
            Integer maxVideo = 0;
            for (Serie s : listaSeries) {
                if (s.isEntregado()) {
                    countSeriesEntrag++;
                }
                if (s.getNumero_tempo() > maxTemp) {
                    maxTemp = s.getNumero_tempo();
                    serieMaxTemp = s;
                    //serieMaxTemp.equals(s);
                }
            }

            for (Videojuego v : listaVideoJuegos) {
                if (v.isEntregado()) {
                    countVideoJuegEntreg++;
                }
                if (v.getHoras_estimadas() > maxVideo) {
                    maxVideo = v.getHoras_estimadas();
                    videoJuegoMaxHor = v;
                    // videoJuegoMaxHor.equals(v);
                }
            }
            System.out.println("Series Entregadas: " + countSeriesEntrag);
            System.out.println("Video juegos entregadas: " + countVideoJuegEntreg);
            System.out.println("Serie mayor cantida de temporadas: \n" + serieMaxTemp.toString());
            System.out.println("Video juegos con mayor cantida de horas:  \n" + videoJuegoMaxHor.toString());

        }


    }



