public class Music {
    private String title;
    private String duration;
    private String genre;
    private Date releaseDate;
    private Singer singer;

    public void setTitle(String title) {
        this.title = title;
    }

    public Music(String title, String duration, String genre, Date releaseDate, Singer singer) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.singer = singer;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Singer getSinger() {
        return singer;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", title, duration, genre, releaseDate, singer.getName());
    }
}
