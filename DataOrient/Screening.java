import java.time.LocalDateTime;
import java.time.LocalTime;
public class Screening{
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Movie getMovie() {
        return this.movie;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

    public LocalDateTime getWhenScreened(){
        return this.whenScreened;
    }

    public void setWhenScreened(LocalDateTime whenScreened){
        this.whenScreened = whenScreened;
    }

    public int getSequence(){
        return this.sequence;
    }

    public void setSequence(int sequence){
        this.sequence = sequence;
    }
}