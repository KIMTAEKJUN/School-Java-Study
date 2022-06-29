package movie;

public class Movie {
    String title;
    String director;

    static int cnt;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
        cnt++;
    }
}
