import java.time.Duration;
import java.util.Collections;
import java.util.List;


public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discontAmount;
    private double discountPercent;

    public MovieType getMovieType(){
        return movieType;
    }

    public void setMovieType(MovieType movieType){
        this.movieType = movieType;
    }


    public Money getFee(){
        return fee;
    }

    public void setMovieType(Money fee){
        this.fee = fee;
    }


    public List<DiscountCondition> getDiscountConditions(){
        return Collections.unmodifiableList(discountConditions);
    }

    public void setDiscountConditions(List<DiscountCondition> discountConditions){
        this.discountConditions = discountConditions;
    }

    public Money getDiscountAmount() {
        return discontAmount;
    }

    public void setDiscountAmount(Money discountAmount){
        this.discontAmount = discontAmount;
    }

    public double getDiscountPercent(){
        return this.discountPercent;
    }

    public void setDiscountPercent(double discountPercent){
        this.discountPercent = discountPercent;
    }
    
}