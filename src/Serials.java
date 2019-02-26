public class Serials {
    private String title;
    private int numberOfSeasons;
    private int numberOfEpisodes;
    private String producer;
    private String type;
    private String descryption;
    private int rating;


    public Serials(String title, int numberOfSeasons, int numberOfEpisodes, String producer, String type, String descryption, int rating) {
        this.title = title;
        this.numberOfSeasons = numberOfSeasons;
        this.numberOfEpisodes = numberOfEpisodes;
        this.producer = producer;
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

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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
        return "Serial{" +
                "title='" + title + '\'' +
                ", numberOfSeasons='" + numberOfSeasons + '\'' +
                ", numberOfEpisodes='" + numberOfEpisodes + '\'' +
                ", producer='" + producer + '\'' +
                ", type='" + type + '\'' +
                ",\ndescryption='" + descryption + '\'' +
                ", rating=" + rating +
                '}';
    }
}
