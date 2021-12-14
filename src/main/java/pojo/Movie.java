package pojo;

import lombok.Data;

@Data
public class Movie {
    private String movie_name;
    private String movie_author;
    private String movie_link;
    private String movie_introduction;
    private String movie_picture;

    public Movie(String movie_name, String movie_author, String movie_link, String movie_introduction, String movie_picture) {
        this.movie_name = movie_name;
        this.movie_author = movie_author;
        this.movie_link = movie_link;
        this.movie_introduction = movie_introduction;
        this.movie_picture = movie_picture;
    }
}
