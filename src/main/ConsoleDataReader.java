package main;

import insane.Actors;
import insane.Movie;
import insane.Serials;

import java.util.Scanner;

public class ConsoleDataReader {
    Scanner sc = new Scanner(System.in);

    public Actors createActors() {
        System.out.println("Podaj imię Aktora");
        String firstName= sc.nextLine() ;
        System.out.println("Podaj imię Nazwisko");
        String lastName = sc.nextLine();
        System.out.println("Podaj kraj pochodzania");
        String countryOfOrigin = sc.nextLine();
        return new Actors(firstName,lastName,countryOfOrigin);
    }

    public Movie createMovie() {
        Movie movie = null;

        System.out.println("Podaj tytuł filmu");
        String title = sc.nextLine();
        System.out.println("Podaj imię i nazwisko reżysera");
        String director = sc.nextLine();
        System.out.println("Podaj rok procukcji");
        int yearProduction= sc.nextInt() ;
        sc.nextLine();
        System.out.println("Podaj kategorię filmu");
        String type = sc.nextLine();

        System.out.println("Podaj opis filmu");
        String descryption = sc.nextLine();
        System.out.println("Podaj rankin filmu");
        int rating= sc.nextInt();
        sc.nextLine();

        if (!(yearProduction<1888 || yearProduction>2020|| rating<0 || rating>10 ))
               return  new Movie(title,director,yearProduction,type,descryption,rating);

    return movie;
    }

    public Serials createTvSeries() {
        Serials serial = null;

        System.out.println("Podaj tytuł serialu");
        String title = sc.nextLine();
        System.out.println("Podaj ilosć sezonów min.1");
        int numberOfSeasons = sc.nextInt();
        System.out.println("Podaj ilość wszystkich odcinków min.2");
        int numberOfEpisodes = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj producenta serialu");
        String producer=sc.nextLine();
        System.out.println("Podaj kategorię serialu");
        String type=sc.nextLine();
        System.out.println("Podaj krótki opis serialu");
        String descryption= sc.nextLine();
        System.out.println("Podaj ranking w skali 0-10");
        int rating=sc.nextInt();
        sc.nextLine();

        if (!(numberOfSeasons<1|| numberOfEpisodes<=1 || rating<0 || rating>10 ))
            return  new Serials(title,numberOfSeasons,numberOfEpisodes,producer,type,descryption,rating);

        return serial;
    }

}
