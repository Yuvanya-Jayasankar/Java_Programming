package first;
import java.util.*;
//DAY 4 ASSIGNMENT

interface Searchable {
    boolean searchByKeyword(String keyword);
}

abstract class MediaItem implements Searchable {
    protected String title;
    protected String releaseDate;
    protected double rating;

    public MediaItem(String title, String releaseDate, double rating) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getRating() {
        return rating;
    }
}

class Movie extends MediaItem {

    private String director;
    private List<String> cast;
    private int duration;

    public Movie(String title, String releaseDate, double rating,
                 String director, List<String> cast, int duration) {
        super(title, releaseDate, rating);
        this.director = director;
        this.cast = cast;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public boolean searchByKeyword(String keyword) {
        String key = keyword.toLowerCase();

        if (title.toLowerCase().contains(key)) return true;
        if (director.toLowerCase().contains(key)) return true;

        for (String member : cast) {
            if (member.toLowerCase().contains(key)) {
                return true;
            }
        }
        return false;
    }
}

public class AssignmentDay4 {

    public static void sortByAttribute(List<Movie> movieList, String attribute, String order) {

        Comparator<Movie> comparator = null;

        switch (attribute.toLowerCase()) {
            case "title":
                comparator = Comparator.comparing(m -> m.getTitle().toLowerCase());
                break;

            case "releasedate":
            case "release date":
                comparator = Comparator.comparing(m -> m.getReleaseDate().toLowerCase());
                break;

            case "director":
                comparator = Comparator.comparing(m -> m.getDirector().toLowerCase());
                break;

            case "duration":
                comparator = Comparator.comparingInt(Movie::getDuration);
                break;
        }

        if (comparator != null) {
            if (order.equalsIgnoreCase("desc")) {
                comparator = comparator.reversed();
            }
            Collections.sort(movieList, comparator);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Movie> movieList = new ArrayList<>();

        int numberOfMovies = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfMovies; i++) {

            String title = scanner.nextLine();
            String releaseDate = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            String director = scanner.nextLine();
            int duration = Integer.parseInt(scanner.nextLine());

            List<String> cast = new ArrayList<>(
                    Arrays.asList(scanner.nextLine().split(","))
            );

            movieList.add(new Movie(title, releaseDate, rating, director, cast, duration));
        }

        String sortAttribute = scanner.nextLine();
        String sortOrder = scanner.nextLine();
        String searchKeyword = scanner.nextLine();

         System.out.println("\nSorted movies by searchKeyword");
        for (Movie movie : movieList) {
            if (movie.searchByKeyword(searchKeyword)) {
                System.out.println(movie.getTitle()+ "\n");
            }
        }
         System.out.println("Sorted all movies");
        sortByAttribute(movieList, sortAttribute, sortOrder);

        for (Movie movie : movieList) {
            System.out.println(movie.getTitle());
        }

        scanner.close();
    }
}
