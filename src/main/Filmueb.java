package main;

import insane.Actors;
import insane.Movie;
import insane.Serials;

public class Filmueb {
    public static void main(String[] args) {
//        //  Actors actors = new Actors("Piotr", "Adamczyk", "Poland");
//
//        String description = "Gwiezdne wojny, część IV: Nowa nadzieja – chronologicznie czwarty film z cyklu Gwiezdne wojny\n" +
//                " wyreżyserowany przez George’a Lucasa w 1977 roku pod tytułem „Gwiezdne wojny”, \n " +
//                "bez żadnych epizodów i podtytułów; opowiada o młodym Luke’u Skywalkerze,\n" +
//                " który – podobnie jak ojciec – chce zostać rycerzem Jedi.\n";
////        Movie movie = new Movie("Stars Wars", "George Lucas", 1979, "s-f", description, 7);
//
//        description = "House of Cards – amerykański serial z gatunku dramatu politycznego.\n" +
//                " Serial powstał na podstawie powieści Michaela Dobbsa i nawiązuje do miniserialu BBC\n" +
//                " Dom z kart z 1990. Autorem scenariusza jest Beau Willimon.";
////        Serials serials = new Serials("House of Card", 6, 73, " Kevin Spacey, Beau Willimon", "political fiction", description, 8);
//
//
//        // System.out.println(serials.toString());

        ConsoleDataReader consoleDataReader = new ConsoleDataReader();

        Actors actors = consoleDataReader.createActors();
        if (actors != null)
            printFilm(actors);

        Movie movie = consoleDataReader.createMovie();
        if (movie != null)
            printFilm(movie);

        Serials tvSerial = consoleDataReader.createTvSeries();
        if (tvSerial != null)
            printFilm(tvSerial);
    }

    private static void printFilm(Object o) {
        System.out.println(o.toString());
    }


}
