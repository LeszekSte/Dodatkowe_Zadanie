public class Filmueb {
    public static void main(String[] args) {
        Actors actors = new Actors("Piotr", "Adamczyk", "Poland");

        String description = "Gwiezdne wojny, część IV: Nowa nadzieja – chronologicznie czwarty film z cyklu Gwiezdne wojny\n" +
                " wyreżyserowany przez George’a Lucasa w 1977 roku pod tytułem „Gwiezdne wojny”, \n " +
                "bez żadnych epizodów i podtytułów; opowiada o młodym Luke’u Skywalkerze,\n" +
                " który – podobnie jak ojciec – chce zostać rycerzem Jedi.\n";
        Movie movie = new Movie("Stars Wars", "George Lucas", 1979, "s-f", description, 7);

        description = "House of Cards – amerykański serial z gatunku dramatu politycznego.\n" +
                " Serial powstał na podstawie powieści Michaela Dobbsa i nawiązuje do miniserialu BBC\n" +
                " Dom z kart z 1990. Autorem scenariusza jest Beau Willimon.";
        Serials serials = new Serials("House of Card", 6, 73, " Kevin Spacey, Beau Willimon", "political fiction", description,8);

        System.out.println(actors.toString());
        System.out.println(movie.toString());
        System.out.println(serials.toString());


    }

}
