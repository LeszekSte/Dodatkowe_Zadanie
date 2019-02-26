public class Movie {
    private String title;
    private String director;
    private int yearProduction;
    private String type;
    private String descryption;
    private int rating;

    public Movie(String title, String director, int yearProduction, String type, String descryption, int rating) {
        this.title = title;
        this.director = director;
        this.yearProduction = yearProduction;
        this.type = type;
        this.descryption = descryption;
        this.rating = rating;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescryption() {
        return descryption;
    }

    public void setDescryption(String descryption) {
        this.descryption = descryption;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearProduction=" + yearProduction +
                ", type='" + type + '\'' +
                ",\ndescryption='" + descryption + '\'' +
                ", rating=" + rating +
                '}';
    }
}
